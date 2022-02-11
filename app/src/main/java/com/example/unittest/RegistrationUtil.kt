package com.example.unittest

object RegistrationUtil {
    private val existUsername= listOf("mohin","somo","umaiza")

    /**
     * the input is valid if...
     * ... the username/password is empty
     * ... the username is already taken
     * ... the confirmed password is not the same as the real password
     * ... the password contain less then 2 digits
     *
     */

    fun validationRegistrationInput(
        username: String,
        password: String,
        confirmPassword: String
    ): Boolean{
        if(username.isEmpty()||password.isEmpty()){
            return false
        }
        if (password!=confirmPassword){
            return false
        }
        if (username in existUsername){
            return false
        }
        if (password.count { it.isDigit() } < 2){
            return false
        }
        return true
    }

    fun checkCarlyBracket(
        str: String
    ): Boolean{

        if(str.count { it == '(' } != str.count { it == ')' }){
            return false
        }
        return true
    }
}