package com.example.playjuegosagd.ui.theme

import androidx.compose.foundation.Image
import androidx.compose.foundation.gestures.scrollable
import androidx.compose.foundation.horizontalScroll
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.layout.width
import androidx.compose.material3.Button
import androidx.compose.material3.ExperimentalMaterial3Api
import androidx.compose.material3.Text
import androidx.compose.material3.TextField
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.scale
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import androidx.navigation.NavHostController
import com.example.playjuegosagd.R

@OptIn(ExperimentalMaterial3Api::class)
@Composable
fun NewPlayer(navController:NavHostController){
    Column (modifier = Modifier
        .fillMaxSize(),  horizontalAlignment = Alignment.CenterHorizontally){

        Spacer(modifier = Modifier.size(10.dp))
        Row(modifier = Modifier.padding(10.dp)){
            Image(painter = painterResource(id = R.drawable.account), contentDescription = "Algo" , Modifier.weight(1f).scale(4f))
            TextField(value = "Nombre", onValueChange = {}, Modifier.weight(2f))
        }
        Row(modifier = Modifier.padding(10.dp)){
            Spacer(modifier = Modifier
                .size(10.dp)
                .weight(1f))
            TextField(value = "Apellidos", onValueChange = {}, Modifier.weight(2f))
        }
        Row(modifier = Modifier.padding(10.dp)){
            Spacer(modifier = Modifier
                .size(10.dp)
                .weight(1f))
            TextField(value = "Nickname", onValueChange = {}, Modifier.weight(2f))
        }
        Row(modifier = Modifier.padding(10.dp)){
            Spacer(modifier = Modifier
                .size(10.dp)
                .weight(1f))
            Image(painter = painterResource(id = R.drawable.email), contentDescription = "Algo" , Modifier.weight(1f))
            Button(onClick = { /*TODO*/ }, Modifier.weight(2f)) {
                Text(text = "Change")
            }//Modifier.weight(2f)

        }
        Row(modifier = Modifier.padding(10.dp)){
            Image(painter = painterResource(id = R.drawable.camera), contentDescription = "Algo" , Modifier.weight(1f))
            TextField(value = "Teléfono", onValueChange = {}, Modifier.weight(2f))
        }
        Row(modifier = Modifier.padding(10.dp)){
            Image(painter = painterResource(id = R.drawable.email), contentDescription = "Algo" , Modifier.weight(1f))
            TextField(value = "Email", onValueChange = {}, Modifier.weight(2f))
        }

    }

}
