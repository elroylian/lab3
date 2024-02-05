package com.example.labtestdemo

import android.util.MutableInt
import androidx.compose.runtime.Composable
import androidx.compose.runtime.MutableState
import androidx.navigation.NavHostController
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import edu.inf2007.eitest.Test

sealed class Screen(val route: String) {
    object StartScreen : Screen(route = "start_screen")
    object QuestionScreen : Screen(route = "question_screen")
    object EndScreen : Screen(route = "end_screen")
}

@Composable
fun NavGraph(
    navController: NavHostController,
    userInput: MutableState<String>,
    score: MutableState<Int>,
    questions: MutableList<Test>,
    count: MutableState<Int>,
    maxScore: MutableState<Int>
) {
    NavHost(
        navController = navController,
        startDestination = Screen.StartScreen.route //TODO: define the start screen
    ) {
        //TODO: add composable(route)
        composable(Screen.StartScreen.route) {
            StartScreen(navController = navController, userInput = userInput)
        }

        composable(Screen.QuestionScreen.route) {
            QuestionScreen(navController=navController, userInput = userInput, score = score, questions = questions, count = count, maxScore = maxScore)
        }

        composable(Screen.EndScreen.route) {
            EndScreen(navController=navController, score = score, userInput = userInput, questions = questions, count = count)
        }
    }
}

