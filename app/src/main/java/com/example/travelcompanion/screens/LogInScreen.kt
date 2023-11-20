package com.example.travelcompanion.screens

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.Surface
import androidx.compose.runtime.Composable
import androidx.navigation.NavController
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.navigation.compose.rememberNavController
import com.example.travelcompanion.R
import com.example.travelcompanion.components.ButtonComponent
import com.example.travelcompanion.components.ClickableLoginTextComponent
import com.example.travelcompanion.components.DividerTextComponent
import com.example.travelcompanion.components.HeadingTextComponent
import com.example.travelcompanion.components.MyTextFieldComponent
import com.example.travelcompanion.components.NormalTextComponent
import com.example.travelcompanion.components.PasswordTextFieldComponent
import com.example.travelcompanion.navigation.Screen

@Composable
fun LoginScreen(navController: NavController){

    Surface(
        modifier = Modifier
            .fillMaxSize()
            .background(Color.White)
            .padding(28.dp)

    ){
        Column(Modifier
            .fillMaxSize()){

            NormalTextComponent(value = stringResource(id = R.string.login))
            HeadingTextComponent(value = stringResource(id = R.string.welcome))
            Spacer(modifier = Modifier.height(60.dp))
            MyTextFieldComponent(
                labelValue = stringResource(id = R.string.username),
                painterResource(R.drawable.profile)
            )
            Spacer(modifier = Modifier.height(5.dp))
            PasswordTextFieldComponent(
                labelValue = stringResource(id = R.string.password),
                painterResource = painterResource(id = R.drawable.lock)
            )
            Spacer(modifier = Modifier.height(40.dp))

            ButtonComponent(value = stringResource(id = R.string.login)){
                navController.navigate(Screen.DashboardScreen.route)
            }
            DividerTextComponent()

            ClickableLoginTextComponent(tryingToLogin = false) {

                navController.navigate(Screen.DashboardScreen.route)
            }
            }
        }



    }



@Preview
@Composable
fun LoginScreenPreview(){
    LoginScreen(navController = rememberNavController())
}