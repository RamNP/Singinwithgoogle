package com.example.singinwithgoogle.google.navigation

import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.navigation.NavHostController
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import androidx.navigation.compose.rememberNavController
import com.example.singinwithgoogle.google.AuthScreen
import com.example.singinwithgoogle.google.GoogleUserModel
import com.squareup.moshi.Moshi

@Composable
fun NavigationComponent() {
    val navController = rememberNavController()
    NavHost(navController = navController, startDestination = Destinations.Auth){
        composable(Destinations.Auth){ AuthScreen(navController)}
        composable(Destinations.VPlayer){}
        composable(Destinations.Home){
             Subject(navController)
//                backStackEntry ->
//            val userJson = backStackEntry.arguments?.getString("user")
//            val moshi = Moshi.Builder().build()
//            val jsonAdapter = moshi.adapter(GoogleUserModel::class.java)
//            val userObject = jsonAdapter.fromJson(userJson!!)

//            HomeView( navController ,userModel = userObject)

        }
        composable(ScreenList.SubjectScreen.route){
//            Subject()

        }

    }
}

//@Composable
//fun HomeView(navController: NavHostController, userModel: GoogleUserModel?) {
//    TODO("Not yet implemented")
//}


@Composable
fun Subject(navController: NavHostController) {

    Text(text = "hello")
    Text(text = "hello")
    Text(text = "hello")
    Text(text = "hello")
    Text(text = "hello")
    Text(text = "hello")
    Text(text = "hello")


}