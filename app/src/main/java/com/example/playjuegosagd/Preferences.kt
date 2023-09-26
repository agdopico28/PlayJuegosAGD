package com.example.playjuegosagd

import android.content.res.Configuration
import android.widget.RadioGroup
import android.widget.Toast
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
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.foundation.verticalScroll
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.Check
import androidx.compose.material3.Button
import androidx.compose.material3.ButtonDefaults
import androidx.compose.material3.ExperimentalMaterial3Api
import androidx.compose.material3.FloatingActionButton
import androidx.compose.material3.Icon
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.RadioButton
import androidx.compose.material3.RadioButtonColors
import androidx.compose.material3.RadioButtonDefaults
import androidx.compose.material3.Slider
import androidx.compose.material3.SliderColors
import androidx.compose.material3.SliderDefaults
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.material3.TextField
import androidx.compose.material3.TextFieldDefaults
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.saveable.rememberSaveable
import androidx.compose.runtime.setValue
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.platform.LocalConfiguration
import androidx.compose.ui.platform.LocalContext
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.playjuegosagd.ui.theme.Blue20
import com.example.playjuegosagd.ui.theme.PurpleGrey80
import com.example.playjuegosagd.ui.theme.TransPurple
import java.util.prefs.Preferences


@OptIn(ExperimentalMaterial3Api::class)
@Composable
fun Preferences() {
    //Slider
    val range = 0f..10f
    val steps = 9
    var selection by remember { mutableStateOf(5f) }
    var estadoRadio by rememberSaveable { mutableStateOf(" ") }
    var peso1 = 1f
    var peso2 = 2f
    var context = LocalContext.current
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
                        .height(20.dp)
                        .fillMaxSize(),
                    horizontalArrangement = Arrangement.Center

                ) {
                    Text(
                        text = "Elige una opción"
                    )
                }
                Surface(
                    modifier = Modifier.fillMaxSize()

                ) {

                    MyRadioButton(estadoRadio) { estadoRadio = it }
                }

                Row(Modifier.padding(20.dp)) {
                    Slider(
                        value = selection,
                        valueRange = range,
                        steps = steps,
                        onValueChange = { selection = it },
                        colors = SliderDefaults.colors(inactiveTrackColor = TransPurple )
                    )
                }
            }
            Box (Modifier.fillMaxSize(), contentAlignment = Alignment.BottomEnd){
                FloatingActionButton(
                    onClick = {
                        if (estadoRadio.contentEquals(" ")) {
                            Toast.makeText(
                                context,
                                "No has pulsado ninguna opcion",
                                Toast.LENGTH_LONG
                            ).show()
                        } else {
                            Toast.makeText(
                                context,
                                "Has seleccionado $estadoRadio con una puntuacion de $selection",
                                Toast.LENGTH_LONG
                            ).show()
                        }
                    },
                    shape = CircleShape,
                    containerColor = Blue20,
                    modifier = Modifier
                        .padding(horizontal = 10.dp, vertical = 10.dp)
                        .height(50.dp)
                        .width(50.dp))
                {

                    Icon(imageVector = Icons.Filled.Check, contentDescription = "check" )
                }

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
                        .height(20.dp)
                        .fillMaxSize(),
                    horizontalArrangement = Arrangement.Center

                ) {
                    Text(
                        text = "Elige una opción"
                    )
                }
                Surface(
                    modifier = Modifier.fillMaxSize()

                ) {

                    MyRadioButton(estadoRadio) { estadoRadio = it }
                }

                Row(Modifier.padding(20.dp)) {
                    Slider(
                        value = selection,
                        valueRange = range,
                        steps = steps,
                        onValueChange = { selection = it },
                        colors = SliderDefaults.colors(inactiveTrackColor = TransPurple )
                    )
                }



            }
            Box (Modifier.fillMaxSize(), contentAlignment = Alignment.BottomEnd){
                FloatingActionButton(
                    onClick = {
                        if (estadoRadio.contentEquals(" ")) {
                            Toast.makeText(
                                context,
                                "No has pulsado ninguna opcion",
                                Toast.LENGTH_LONG
                            ).show()
                        } else {
                            Toast.makeText(
                                context,
                                "Has seleccionado $estadoRadio con una puntuacion de $selection",
                                Toast.LENGTH_LONG
                            ).show()
                        }
                    },
                    shape = CircleShape,
                    containerColor = Blue20,
                    modifier = Modifier
                        .padding(horizontal = 10.dp, vertical = 10.dp)
                        .height(50.dp)
                        .width(50.dp))
                {

                    Icon(imageVector = Icons.Filled.Check, contentDescription = "check" )
                }

            }
        }

    }

}

@Composable
fun MyRadioButton(name: String, onItemSelected: (String) -> Unit) {
    Column(
        Modifier
            .fillMaxSize()
            .padding(20.dp),

        )
    {
        Row() {
            RadioButton(selected = name == "Angry Birds", onClick = {
                onItemSelected("Angry Birds")
            },colors = RadioButtonDefaults.colors(selectedColor = Blue20))
            Text(text = "Angry Birds", Modifier.padding(top = 12.dp))
        }
        Row() {
            RadioButton(selected = name == "Dragon Fly", onClick = {
                onItemSelected("Dragon Fly")
            },colors = RadioButtonDefaults.colors(selectedColor = Blue20))
            Text(text = "Dragon Fly", Modifier.padding(top = 12.dp))
        }
        Row() {
            RadioButton(selected = name == "Hill Climbing Racing", onClick = {
                onItemSelected("Hill Climbing Racing")
            },colors = RadioButtonDefaults.colors(selectedColor = Blue20))
            Text(text = "Hill Climbing Racing", Modifier.padding(top = 12.dp))
        }
        Row() {
            RadioButton(selected = name == "Pocket Soccer", onClick = {
                onItemSelected("Pocket Soccer")
            },colors = RadioButtonDefaults.colors(selectedColor = Blue20))
            Text(text = "Pocket Soccer", Modifier.padding(top = 12.dp))
        }
        Row() {
            RadioButton(selected = name == "Radiant Defense", onClick = {
                onItemSelected("Radiant Defense")
            },colors = RadioButtonDefaults.colors(selectedColor = Blue20))
            Text(text = "Radiant Defense", Modifier.padding(top = 12.dp))
        }
        Row() {
            RadioButton(selected = name == "Ninja Jump", onClick = {
                onItemSelected("Ninja Jump")
            },colors = RadioButtonDefaults.colors(selectedColor = Blue20))
            Text(text = "Ninja Jump", Modifier.padding(top = 12.dp))
        }
        Row() {
            RadioButton(selected = name == "Air Control", onClick = {
                onItemSelected("Air Control")
            },colors = RadioButtonDefaults.colors(selectedColor = Blue20))
            Text(text = "Air Control", Modifier.padding(top = 12.dp))
        }
        

    }
}

