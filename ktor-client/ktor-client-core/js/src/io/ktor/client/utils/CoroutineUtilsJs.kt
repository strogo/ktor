/*
 * Copyright 2014-2019 JetBrains s.r.o and contributors. Use of this source code is governed by the Apache 2.0 license.
 */

package io.ktor.client.utils

import io.ktor.util.*
import kotlinx.coroutines.*

/**
 * Creates [CoroutineDispatcher] for client with fixed [threadCount] and specified [dispatcherName].
 */
@InternalAPI
actual fun Dispatchers.clientDispatcher(
    threadCount: Int,
    dispatcherName: String
): CoroutineDispatcher = Unconfined
