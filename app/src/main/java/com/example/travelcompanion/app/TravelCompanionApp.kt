package com.example.travelcompanion.app

import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.material3.Surface
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.stringResource
import com.example.travelcompanion.R
import com.example.travelcompanion.components.NormalTextComponent

@Composable
fun TravelCompanionApp(){
    Surface(
        modifier = Modifier.fillMaxSize(),
        color = Color.White
    ) {
        NormalTextComponent(value = stringResource(id = R.string.hello))

    }
}