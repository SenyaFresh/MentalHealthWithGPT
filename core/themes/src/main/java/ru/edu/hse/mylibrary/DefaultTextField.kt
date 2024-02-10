package ru.edu.hse.mylibrary

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.offset
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.text.KeyboardOptions
import androidx.compose.material3.ExperimentalMaterial3Api
import androidx.compose.material3.HorizontalDivider
import androidx.compose.material3.OutlinedTextField
import androidx.compose.material3.TextFieldDefaults
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.unit.dp

@OptIn(ExperimentalMaterial3Api::class)
@Composable
fun DefaultTextField(
    value: String,
    onValueChange: (String) -> Unit,
    icon : @Composable () -> Unit,
    label : String,
    hint: String,
    modifier: Modifier = Modifier,
    keyboardOptions: KeyboardOptions = KeyboardOptions.Default
)

{
    DefaultCard(
        modifier = modifier
    ) {
        Column {
            Row(
                modifier = Modifier
                    .height(35.dp)
                    .fillMaxWidth()
                    .background(Color(0xFFF1F1F1))
                    .padding(start = 14.dp),
                verticalAlignment = Alignment.CenterVertically
            ) {
                icon()
                DefaultText(
                    label,
                    modifier = Modifier.padding(start = 8.dp),
                    fontWeight = FontWeight.Light
                )
            }
            HorizontalDivider(thickness = 1.dp, color = Color.Black)
            OutlinedTextField(
                modifier = Modifier.height(50.dp).padding(start = 3.dp).offset(y = (-3).dp),
                value = value,
                onValueChange = onValueChange,
                singleLine = true,
                colors = TextFieldDefaults.colors(
                    focusedTextColor = Color.Black,
                    unfocusedTextColor = Color.Black,
                    focusedIndicatorColor = Color.Transparent,
                    unfocusedIndicatorColor = Color.Transparent,
                    focusedContainerColor = Color.Transparent,
                    unfocusedContainerColor = Color.Transparent,
                ),
                label = { DefaultText(hint)},
                keyboardOptions = keyboardOptions
            )
        }
    }
}