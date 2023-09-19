package com.example.playjuegosagd

import android.content.res.Configuration
import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.rememberScrollState
import androidx.compose.foundation.verticalScroll
import androidx.compose.material3.Button
import androidx.compose.material3.ButtonDefaults
import androidx.compose.material3.ExperimentalMaterial3Api
import androidx.compose.material3.Text
import androidx.compose.material3.TextField
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.platform.LocalConfiguration
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import androidx.navigation.NavHostController
import com.example.playjuegosagd.R
import com.example.playjuegosagd.ui.theme.Blue20

@OptIn(ExperimentalMaterial3Api::class)
@Composable
fun NewPlayer(navController: NavHostController) {
    var peso1 = 1f
    var peso2 = 2f
    val configuration = LocalConfiguration.current
    when (configuration.orientation) {
        Configuration.ORIENTATION_LANDSCAPE -> {

            Column(
                modifier = Modifier
                    .fillMaxSize()
                    .verticalScroll(rememberScrollState()),
                verticalArrangement = Arrangement.Top,
                horizontalAlignment = Alignment.Start
            ) {
                Spacer(modifier = Modifier.size(15.dp))
                Row(
                    Modifier
                        .height(60.dp)
                        .fillMaxSize()
                ) {
                    Image(
                        painter = painterResource(id = R.drawable.account),
                        contentDescription = "AccountImage",
                        Modifier
                            .weight(peso1)
                            .fillMaxSize()
                    )
                    TextField(
                        value = "Nombre",
                        onValueChange = {},
                        Modifier
                            .weight(peso2)
                            .padding(end = 10.dp),
                        label = { Text(text = "Nickname")}
                    )
                }
                Spacer(modifier = Modifier.size(15.dp))
                Row {
                    Spacer(modifier = Modifier.weight(peso1))
                    TextField(
                        value = "Apellidos",
                        onValueChange = {},
                        Modifier
                            .weight(peso2)
                            .padding(end = 10.dp),
                        label = { Text(text = "Nickname")}
                    )
                }
                Spacer(modifier = Modifier.size(15.dp))
                Row {
                    Spacer(modifier = Modifier.weight(peso1))
                    TextField(
                        value = "Nickname",
                        onValueChange = {},
                        Modifier
                            .weight(peso2)
                            .padding(end = 10.dp),
                        label = { Text(text = "Nickname")}
                    )
                }
                Spacer(modifier = Modifier.size(15.dp))
                Row(
                    Modifier
                        .height(60.dp)
                        .fillMaxWidth()
                ) {
                    Spacer(modifier = Modifier.weight(peso1))
                    Image(
                        painter = painterResource(id = R.drawable.android),
                        contentDescription = "Android Icon",
                        Modifier
                            .weight(peso1)
                            .fillMaxSize(),
                    )
                    Button(
                        onClick = { /*TODO*/ },
                        modifier = Modifier
                            .weight(peso1)
                            .padding(end = 35.dp)
                    ) {
                        Text(text = "Change")
                    }
                }
                Spacer(modifier = Modifier.size(15.dp))
                Row(
                    Modifier
                        .height(60.dp)
                        .fillMaxSize()
                ) {
                    Image(
                        painter = painterResource(id = R.drawable.camera),
                        contentDescription = "CameraImage",
                        Modifier
                            .weight(peso1)
                            .fillMaxSize()
                    )
                    TextField(
                        value = "Telefono",
                        onValueChange = {},

                        Modifier
                            .weight(peso2)
                            .padding(end = 10.dp)
                    )
                }
                Spacer(modifier = Modifier.size(15.dp))
                Row(
                    Modifier
                        .height(60.dp)
                        .fillMaxSize()
                ) {
                    Image(
                        painter = painterResource(id = R.drawable.email),
                        contentDescription = "EmailImage",
                        Modifier
                            .weight(peso1)
                            .fillMaxSize()
                    )
                    TextField(
                        value = "Email",
                        onValueChange = {},
                        Modifier
                            .weight(peso2)
                            .padding(end = 10.dp),
                        label = { Text(text = "Nickname")}
                    )
                }
                Spacer(modifier = Modifier.size(15.dp))
            }
        }


        else -> {

            Column(
                modifier = Modifier
                    .fillMaxSize()
                    .verticalScroll(rememberScrollState()),
                verticalArrangement = Arrangement.Top,
                horizontalAlignment = Alignment.Start
            ) {
                Spacer(modifier = Modifier.size(15.dp))
                Row(
                    Modifier
                        .height(60.dp)
                        .fillMaxSize()

                ) {
                    Image(
                        painter = painterResource(id = R.drawable.account),
                        contentDescription = "AccountImage",
                        Modifier
                            .weight(peso1)
                            .fillMaxSize()
                    )
                    TextField(
                        value = "Nombre",
                        onValueChange = {},
                        Modifier
                            .weight(peso2)
                            .padding(end = 10.dp),
                        label = { Text(text = "Nickname")},
                    )
                }
                Spacer(modifier = Modifier.size(15.dp))
                Row(
                    Modifier
                        .height(60.dp)
                        .fillMaxSize()

                ) {
                    Spacer(modifier = Modifier.weight(peso1))
                    TextField(
                        value = "Apellidos",
                        onValueChange = {},
                        Modifier
                            .weight(peso2)
                            .padding(end = 10.dp),
                        label = { Text(text = "Nickname")}
                    )
                }
                Spacer(modifier = Modifier.size(15.dp))
                Row(
                    Modifier
                        .height(60.dp)
                        .fillMaxSize()

                ) {
                    Spacer(modifier = Modifier.weight(peso1))
                    TextField(
                        value = "Nickname",
                        onValueChange = {},
                        Modifier
                            .weight(peso2)
                            .padding(end = 10.dp),
                        label = { Text(text = "Nickname")}
                    )
                }
                Spacer(modifier = Modifier.size(15.dp))
                Row(
                    Modifier
                        .height(60.dp)
                        .fillMaxWidth()
                ) {
                    Spacer(modifier = Modifier.weight(peso1))
                    Image(
                        painter = painterResource(id = R.drawable.android),
                        contentDescription = "Android Icon",
                        Modifier
                            .weight(peso1)
                            .fillMaxSize(),
                    )
                    Button(
                        onClick = { /*TODO*/ },
                        modifier = Modifier
                            .weight(peso1)
                            .padding(end = 35.dp),
                        colors = ButtonDefaults.buttonColors(containerColor = Blue20)
                    ) {
                        Text(text = "Change")
                    }
                }
                Spacer(modifier = Modifier.size(15.dp))
                Row(
                    Modifier
                        .height(60.dp)
                        .fillMaxSize()
                ) {
                    Image(
                        painter = painterResource(id = R.drawable.camera),
                        contentDescription = "CameraImage",
                        Modifier
                            .weight(peso1)
                            .fillMaxSize()
                    )
                    TextField(
                        value = "Telefono",
                        onValueChange = {},
                        Modifier
                            .weight(peso2)
                            .padding(end = 10.dp),
                        label = { Text(text = "Nickname")}
                    )
                }
                Spacer(modifier = Modifier.size(15.dp))
                Row(
                    Modifier
                        .height(60.dp)
                        .fillMaxSize()
                ) {
                    Image(
                        painter = painterResource(id = R.drawable.email),
                        contentDescription = "EmailImage",
                        Modifier
                            .weight(peso1)
                            .fillMaxSize()
                    )
                    TextField(
                        value = "Email",
                        onValueChange = {},
                        Modifier
                            .weight(peso2)
                            .padding(end = 10.dp),
                        label = { Text(text = "Nickname")}
                    )
                }
                Spacer(modifier = Modifier.size(15.dp))
            }
        }
    }
}


