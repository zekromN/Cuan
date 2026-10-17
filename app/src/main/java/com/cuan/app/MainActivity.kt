package com.cuan.app

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import com.cuan.app.ui.screens.SplashScreen
import com.cuan.app.ui.theme.CuanTheme


class MainActivity : ComponentActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        setContent {
            CuanTheme {
                SplashScreen()
            }
        }
    }
}