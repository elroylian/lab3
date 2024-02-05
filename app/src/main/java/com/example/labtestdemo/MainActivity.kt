package com.example.labtestdemo

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.background
import androidx.compose.material3.Surface
import androidx.compose.runtime.Composable
import androidx.compose.runtime.mutableIntStateOf
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.tooling.preview.Preview
import androidx.navigation.compose.rememberNavController
import com.example.labtestdemo.ui.theme.LabTestDemoTheme
import edu.inf2007.eitest.testData

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            MainApp()
        }
    }
}

@Preview(showBackground = true)
@Composable
fun MainApp() {
    LabTestDemoTheme {
        Surface(modifier = Modifier
            .background(Color.Green)
        ){
            val navController = rememberNavController()
            val userInput = remember { mutableStateOf("") }
            val score = remember { mutableIntStateOf(0) }
            val maxScore = remember { mutableIntStateOf(0) }
            val questions = remember {
                testData.questionsBank.toMutableList()
            }
            val count = remember { mutableIntStateOf(0) }

            NavGraph(navController = navController, userInput = userInput, score = score, questions = questions, count = count, maxScore = maxScore)
        }

    }
}