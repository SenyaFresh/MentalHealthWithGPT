package ru.edu.hse.common_impl

import android.content.Context
import android.widget.Toast
import ru.edu.hse.common.Toaster

/**
 * Android implementation of [Toaster].
 */
class AndroidToaster(
    private val appContext: Context
) : Toaster {

    /**
     * Show short android toast using [appContext].
     */
    override fun showToast(message: String) {
        Toast.makeText(appContext, message, Toast.LENGTH_SHORT).show()
    }

}