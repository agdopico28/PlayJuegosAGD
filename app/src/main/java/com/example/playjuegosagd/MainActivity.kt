package com.example.playjuegosagd

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Surface
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import androidx.navigation.compose.rememberNavController
import com.example.playjuegosagd.ui.theme.Portada
import com.example.playjuegosagd.ui.theme.NewPlayer
import com.example.playjuegosagd.ui.theme.PlayJuegosAGDTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            PlayJuegosAGDTheme {
                // A surface container using the 'background' color from the theme
                 Surface(
                    modifier = Modifier.fillMaxSize(),
                     //verticalArrangement = Arrangement.Center,
                     //horizontalAlignment = Alignment.CenterHorizontally
                    color = MaterialTheme.colorScheme.background
                ) {
                     val navController  = rememberNavController()
                     NavHost(navController = navController, startDestination = "Portada"){
                         composable("NewPlayer") { NewPlayer(navController) }
                         composable("Portada") { Portada(navController = navController) }
                     }

                }
            }
        }
    }
}


@Preview(showBackground = true)
@Composable
fun GreetingPreview() {
    PlayJuegosAGDTheme {



    }
}