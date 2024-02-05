package com.example.labtestdemo

import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.Button
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.material3.TextField
import androidx.compose.runtime.Composable
import androidx.compose.runtime.MutableState
import androidx.compose.runtime.mutableStateOf
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.navigation.NavController
import androidx.navigation.compose.rememberNavController
import com.example.labtestdemo.ui.theme.LabTestDemoTheme

@Composable
fun StartScreen(modifier: Modifier = Modifier,
                navController: NavController = rememberNavController(),
                userInput: MutableState<String> = mutableStateOf("")
){
    Surface(
        modifier = Modifier.fillMaxSize(),
        color = MaterialTheme.colorScheme.background
    ) {
        Column(
            verticalArrangement = Arrangement.Center,
            horizontalAlignment = Alignment.CenterHorizontally
        ) {
            Text(
                text = "Extrovert/Introvert Test",
                style = MaterialTheme.typography.headlineLarge,
                modifier = Modifier
                    .padding(bottom = 20.dp),

                )
            Text(
                text = "Enter your name to Start"
            )
            TextField(
                label = {Text(text="name")},
                value = userInput.value,
                onValueChange = {
                    userInput.value = it
                }
            )
            Button(
                enabled = userInput.value.isNotEmpty(),
                onClick = {
                    navController.navigate(Screen.QuestionScreen.route)
                },
                modifier = Modifier
                    .fillMaxWidth(1f)
            ) {
                Text(
                    text = "Start"
                )
            }
        }
    }
}

@Preview
@Composable
fun StartScreenPreview() {
    LabTestDemoTheme {
        // A surface container using the 'background' color from the theme
        Surface(
            modifier = Modifier.fillMaxSize(),
            color = MaterialTheme.colorScheme.background
        ) {
            StartScreen()
        }
    }
}