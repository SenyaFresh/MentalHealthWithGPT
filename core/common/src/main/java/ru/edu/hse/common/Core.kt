package ru.edu.hse.common

import kotlinx.coroutines.CoroutineScope

/**
 * Common singleton variables.
 * Call [Core.init] before using any variable.
 */
object Core {

    private lateinit var coreProvider: CoreProvider

    val errorHandler: ErrorHandler get() = coreProvider.errorHandler

    /**
     * Global coroutine scope that ignores results and errors.
     */
    val globalScope: CoroutineScope get() = coreProvider.globalScope

    val logger: Logger get() = coreProvider.logger

    val resources: Resources get() = coreProvider.resources

    val toaster: Toaster get() = coreProvider.toaster

    val remoteTimeoutMillis: Long get() = coreProvider.remoteTimeoutMillis

    val debounceTimeoutMillis: Long get() = coreProvider.debounceTimeoutMillis

    fun init(coreProvider: CoreProvider) {
        this.coreProvider = coreProvider
    }
}