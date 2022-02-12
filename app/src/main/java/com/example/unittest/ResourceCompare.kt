package com.example.unittest

import android.content.Context

class ResourceCompare {

    fun stringMatch(
        context: Context,
        stringId: Int,
        inputString: String
    ): Boolean{
        return context.getString(stringId)==inputString
    }
}