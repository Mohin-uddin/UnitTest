package com.example.unittest

import android.content.Context
import androidx.test.core.app.ApplicationProvider
import com.google.common.truth.Truth.assertThat
import org.junit.Before
import org.junit.Test

class ResourceCompareTest{

   private lateinit var resourceCompare : ResourceCompare

   @Before
   fun setUp(){
       resourceCompare = ResourceCompare()
   }

    @Test
    fun stringRecourseSameAsGivenString_returnTrue(){

        val context = ApplicationProvider.getApplicationContext<Context>()
        val result = resourceCompare.stringMatch(context,R.string.app_name,"UnitTest")
        assertThat(result).isTrue()
    }

    @Test
    fun stringRecourseDifferentAsGivenString_returnTrue(){

        val context = ApplicationProvider.getApplicationContext<Context>()
        val result = resourceCompare.stringMatch(context,R.string.app_name,"Mohi")
        assertThat(result).isFalse()
    }
}