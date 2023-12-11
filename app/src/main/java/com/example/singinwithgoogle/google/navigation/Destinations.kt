package com.example.singinwithgoogle.google.navigation

object Destinations{
    const   val Auth="Auth"
    const val Home = "home/{user}"
    const val VPlayer ="vPlayer"

}

sealed class ScreenList(val route: String) {
    object SplashScreen : ScreenList("SplashScreen")
    object LoginScreen : ScreenList("LoginScreen")
    object SubjectScreen : ScreenList("SubjectScreen")
    object VideoScreen : ScreenList("VideoScreen")
    object RegisterScreen : ScreenList("RegisterScreen")
    object ForgotScreen : ScreenList("ForgotScreen")
    object AuthScreen : ScreenList("AuthScreen")


}

