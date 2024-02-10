package ru.edu.hse.mylibrary

import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.text.font.FontStyle
import androidx.compose.ui.text.font.FontWeight

@Composable
fun DefaultText(
    text: String,
    color: Color = Color.Black,
    fontWeight: FontWeight = FontWeight.Normal,
    fontStyle: FontStyle = FontStyle.Normal
) = Text(text, color = color, fontFamily = Nunito, fontWeight = fontWeight, fontStyle = fontStyle)
