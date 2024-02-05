package com.example.labtestdemo

import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxHeight
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.width
import androidx.compose.material3.Button
import androidx.compose.material3.Divider
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.RadioButton
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.material3.TextField
import androidx.compose.runtime.Composable
import androidx.compose.runtime.MutableState
import androidx.compose.runtime.mutableStateListOf
import androidx.compose.runtime.mutableStateOf
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.text.font.FontStyle
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.navigation.NavController
import androidx.navigation.compose.rememberNavController
import com.example.labtestdemo.ui.theme.LabTestDemoTheme
import edu.inf2007.eitest.Test

@Composable
fun EndScreen(
    modifier: Modifier = Modifier,
    navController: NavController = rememberNavController(),
    userInput: MutableState<String> = mutableStateOf(""),
    score: MutableState<Int> = mutableStateOf(0),
    questions: MutableList<Test> = mutableStateListOf(Test()),
    count: MutableState<Int> = mutableStateOf(0),
    maxScore: MutableState<Int> = mutableStateOf(0)
) {
    Surface(
        modifier = Modifier
            .fillMaxSize()
            .padding(60.dp),
        color = MaterialTheme.colorScheme.background
    ) {
        val qPadding = 20.dp
        Column(
            horizontalAlignment = Alignment.Start,
        ) {
            Text(
                "Completed!",
                style = MaterialTheme.typography.headlineMedium,
                modifier = Modifier.padding(top = qPadding).fillMaxWidth(1f),
                textAlign = TextAlign.Center

            )
            Divider(
                thickness = 3.dp
                )

            Column(
                modifier = Modifier
                    .padding(10.dp)
                    .weight(1f)
            ) {
                Column(
                    modifier = Modifier,
                    verticalArrangement = Arrangement.Center,
                ) {
                    Button(
                        onClick = {

                        },
                        modifier = Modifier
                    )
                    {
                        Text(text = "Cancel")
                    }
                    Spacer(modifier = Modifier.width(12.dp))
                    Button(
                        onClick = {
                            count.value = 0
                            score.value = 0
                            navController.navigate("question_screen")
                        },
                        modifier = Modifier
                    )
                    {
                        Text(text = "Next")
                    }
                }
            }

        }
    }
}

