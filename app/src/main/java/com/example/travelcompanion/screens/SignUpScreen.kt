package com.example.travelcompanion.screens

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.Surface
import androidx.compose.runtime.Composable
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import androidx.compose.runtime.getValue
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.platform.LocalContext
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.navigation.NavController
import androidx.navigation.compose.rememberNavController
import com.example.travelcompanion.R
import com.example.travelcompanion.components.ButtonComponent
import com.example.travelcompanion.components.ClickableLoginTextComponent
import com.example.travelcompanion.components.DividerTextComponent
import com.example.travelcompanion.components.HeadingTextComponent
import com.example.travelcompanion.components.MyTextFieldComponent
import com.example.travelcompanion.components.NormalTextComponent
import com.example.travelcompanion.components.PasswordTextFieldComponent
import com.example.travelcompanion.database.User
import com.example.travelcompanion.navigation.Screen


@Composable
fun SignUpScreen(navController: NavController){
    val state = remember { mutableStateOf(User(0, "", "", "")) }
    val context = LocalContext.current

    Surface(
        modifier = Modifier
            .fillMaxSize()
            .background(Color.White)
            .padding(28.dp)
    ){
    Column(modifier = Modifier.fillMaxSize()){
        NormalTextComponent(value = stringResource(id = R.string.hello))
        HeadingTextComponent(value = stringResource(id = R.string.create_account))
        Spacer(modifier = Modifier.height(20.dp))
        MyTextFieldComponent(labelValue = stringResource(id = R.string.username), painterResource(id = R.drawable.profile))
        MyTextFieldComponent(labelValue = stringResource(id = R.string.email), painterResource(id = R.drawable.email))
        Spacer(modifier = Modifier.height(10.dp))
        PasswordTextFieldComponent(labelValue = stringResource(id = R.string.password), painterResource(id = R.drawable.lock))
        Spacer(modifier = Modifier.height(70.dp))
        ButtonComponent(value = stringResource(id = R.string.register)){
            navController.navigate(Screen.DashboardScreen.route)
        }


        Spacer(modifier = Modifier.height(40.dp))
        DividerTextComponent()
        ClickableLoginTextComponent(tryingToLogin = true) {
            // Navigate to the registration screen using the navController
            navController.navigate(Screen.DashboardScreen.route)
        }

    }


    }
}

@Preview
@Composable
fun DefaultPreviewOfSignUpScreen(){
    SignUpScreen(navController = rememberNavController())
}

