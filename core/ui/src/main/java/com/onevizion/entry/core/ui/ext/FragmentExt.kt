package com.onevizion.entry.core.ui.ext

import androidx.fragment.app.Fragment

fun Fragment.lazyLongArgument(propertyName: String) = lazyUnsynchronized {
    requireArguments().getLong(propertyName)
}


fun <T> lazyUnsynchronized(initializer: () -> T): Lazy<T> =
    lazy(LazyThreadSafetyMode.NONE, initializer)
