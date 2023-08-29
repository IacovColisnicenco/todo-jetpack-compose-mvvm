/*
 * Copyright 2019 The Android Open Source Project
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *     https://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */

package com.example.android.architecture.blueprints.todoapp

import android.app.Application
import dagger.hilt.android.HiltAndroidApp
import timber.log.Timber
import timber.log.Timber.DebugTree

/**
 * Application that sets up Timber in the DEBUG BuildConfig.
 * Read Timber's documentation for production setups.
 */
@HiltAndroidApp
class TodoApplication : Application() {

    override fun onCreate() {
        super.onCreate()
        /*
        *
        * if (BuildConfig.DEBUG) Timber.plant(DebugTree()): Checks if the app is in debug mode using the BuildConfig.DEBUG flag. If it is, it sets up Timber logging with the DebugTree() implementation, which logs debug messages to the console.
This configuration is particularly useful during development as it allows you to use Timber for logging, making it easier to track and debug issues. Keep in mind that using Timber's DebugTree() for logging is recommended in debug builds, but in production, you might want to configure a different logging strategy.
        *
        * */
        if (BuildConfig.DEBUG) Timber.plant(DebugTree())
    }
}