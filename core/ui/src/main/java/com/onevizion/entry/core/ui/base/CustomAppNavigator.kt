package com.onevizion.entry.core.ui.base


import androidx.fragment.app.FragmentActivity
import com.github.terrakok.cicerone.Command
import com.github.terrakok.cicerone.androidx.AppNavigator

abstract class CustomAppNavigator(
    activity: FragmentActivity,
    containerId: Int
) : AppNavigator(activity, containerId) {


    override fun applyCommand(command: Command) {
        super.applyCommand(command)
        activity.supportFragmentManager.executePendingTransactions()
    }
}