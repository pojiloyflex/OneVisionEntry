package com.onevizion.entry.core.coroutines

import kotlinx.coroutines.*
import kotlin.coroutines.CoroutineContext

/**
 * Launches a coroutine on the provided [CoroutineScope] with error handling.
 */
fun CoroutineScope.safeLaunch(
    context: CoroutineContext = Dispatchers.Main,
    onError: (Throwable) -> Unit = {},
    block: suspend CoroutineScope.() -> Unit
): Job {
    return this.launch(context) {
        try {
            block()
        } catch (e: Throwable) {
            onError(e)
        }
    }
}

/**
 * Runs a suspending function on the IO dispatcher and returns the result.
 */
suspend fun <T> withIoContext(block: suspend () -> T): T =
    withContext(Dispatchers.IO) { block() }

/**
 * Runs a suspending function on the Default dispatcher and returns the result.
 */
suspend fun <T> withDefaultContext(block: suspend () -> T): T =
    withContext(Dispatchers.Default) { block() }

/**
 * Throttles the execution of a block of code. Useful for actions that should not be triggered repeatedly.
 */
fun (() -> Unit).throttle(waitTime: Long = 300L): () -> Unit {
    var lastTime = 0L
    return {
        val currentTime = System.currentTimeMillis()
        if (currentTime - lastTime > waitTime) {
            lastTime = currentTime
            this()
        }
    }
}

/**
 * Delays the execution of the provided block for the specified [delayMillis].
 */
fun CoroutineScope.launchDelayed(
    delayMillis: Long,
    context: CoroutineContext = Dispatchers.Main,
    block: suspend CoroutineScope.() -> Unit
): Job {
    return this.launch(context) {
        delay(delayMillis)
        block()
    }
}

/**
 * Executes a suspending function with a timeout.
 */
suspend fun <T> withTimeoutOrNullSafe(
    timeoutMillis: Long,
    block: suspend CoroutineScope.() -> T
): T? {
    return try {
        withTimeoutOrNull(timeoutMillis) { block() }
    } catch (e: TimeoutCancellationException) {
        null
    }
}
