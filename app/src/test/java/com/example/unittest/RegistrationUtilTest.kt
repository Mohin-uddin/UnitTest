package com.example.unittest

import com.google.common.truth.Truth.assertThat
import org.junit.Test


class RegistrationUtilTest{

    @Test
    fun `empty username return false`(){
        val result = RegistrationUtil.validationRegistrationInput(
            "",
            "123",
            "123"
        )

        assertThat(result).isFalse()
    }

    @Test
    fun `valid username and correctly repeated return true`(){
        val result = RegistrationUtil.validationRegistrationInput(
            "Amina",
            "abs12",
            "abs12"
        )

        assertThat(result).isTrue()
    }

    @Test
    fun `username is already exists return false`(){
        val result = RegistrationUtil.validationRegistrationInput(
            "mohin",
            "123",
            "123"
        )

        assertThat(result).isFalse()
    }

    @Test
    fun `empty password return false`(){
        val result = RegistrationUtil.validationRegistrationInput(
            "phillips",
            "",
            ""
        )

        assertThat(result).isFalse()
    }

    @Test
    fun `password was repeatedly incorrectly return false`(){
        val result = RegistrationUtil.validationRegistrationInput(
            "phillps",
            "1234",
            "123"
        )
        assertThat(result).isFalse()
    }

    @Test
    fun `password contain less then 2 digits return false`(){
        val result = RegistrationUtil.validationRegistrationInput(
            "phillps",
            "aasdad4",
            "aasdad4"
        )
        assertThat(result).isFalse()
    }

    @Test

    fun carlyBracketCheck(){
        val result = RegistrationUtil.checkCarlyBracket(
            "(mohin))"
        )
        assertThat(result).isFalse()
    }



}