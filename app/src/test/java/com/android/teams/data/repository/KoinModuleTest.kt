package com.android.teams.data.repository

import com.android.teams.di.module.NetworkModule
import org.junit.Test
import org.koin.core.logger.Level
import org.koin.dsl.koinApplication
import org.koin.test.AutoCloseKoinTest
import org.koin.test.check.checkModules

class KoinModuleTest : AutoCloseKoinTest() {

    @Test
    fun testCoreModule() {
        koinApplication {
            printLogger(Level.DEBUG)
            modules(listOf(NetworkModule))
        }.checkModules()
    }

}