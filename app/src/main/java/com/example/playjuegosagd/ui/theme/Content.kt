package com.example.playjuegosagd.ui.theme

import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.layout.width
import androidx.compose.material3.Button
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.playjuegosagd.R


@Composable
fun Greeting(name: String, modifier: Modifier = Modifier) {
    Text(
        text = stringResource(id = R.string.playJuegos),
        fontSize = 40.sp,
        textAlign = TextAlign.Center,
        modifier =  modifier
    )

    Spacer(modifier = Modifier.size(50.dp))

    Button(onClick = { /*TODO*/ }, modifier = Modifier.width(200.dp)) {
        Text(text = "Play")
    }
    Button(onClick = { /*TODO*/ }, modifier = Modifier.width(200.dp)) {
        Text(text = "New Play")
    }
    Button(onClick = { /*TODO*/ }, modifier = Modifier.width(200.dp)) {
        Text(text = "Preferences")
    }
    Button(onClick = { /*TODO*/ }, modifier = Modifier.width(200.dp)) {
        Text(text = "About")
    }
}