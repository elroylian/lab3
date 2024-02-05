package com.example.labtestdemo

import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxHeight
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
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
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateListOf
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.saveable.rememberSaveable
import androidx.compose.runtime.setValue
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.text.font.FontStyle
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.navigation.NavController
import androidx.navigation.compose.rememberNavController
import edu.inf2007.eitest.Test
import java.lang.Integer.sum

@Preview
@Composable
fun QuestionScreen(modifier: Modifier = Modifier,
                   navController: NavController = rememberNavController(),
                   userInput: MutableState<String> = mutableStateOf(""),
                   score: MutableState<Int> = mutableStateOf(0),
                   questions: MutableList<Test> = mutableStateListOf(Test()),
                   count: MutableState<Int> = mutableStateOf(0),
                   maxScore: MutableState<Int> = mutableStateOf(0)

)
{
    val threshold = 3
    val qPadding = 15.dp
    val optionList = questions[count.value].options
    val isSelected by rememberSaveable { mutableStateOf(false) }
    var selectedOption by remember { mutableStateOf(0) }
    var totalScore = questions[count.value].scores.sum()

    Surface(
        modifier = Modifier
            .fillMaxSize()
            .padding(10.dp),
        color = MaterialTheme.colorScheme.background
    ) {
        Column(
            horizontalAlignment = Alignment.Start,
        ) {
            Text(
                "Question ${count.value+1}:",
                style = MaterialTheme.typography.headlineMedium.copy(fontStyle = FontStyle.Italic),
                modifier = Modifier.padding(top = qPadding)
            )
            Text(
                text = questions[count.value].question,
                modifier = Modifier.padding(top = qPadding)
            )

            Divider(modifier = Modifier.padding(top = qPadding))

            Column{
                Column(
                    modifier = Modifier
                        .padding(10.dp)
                        .fillMaxHeight()
                        .weight(1f)
                ) {
                    Column(
                        modifier = Modifier
                            .fillMaxHeight(),
                        verticalArrangement = Arrangement.Center
                    ){
                        optionList.forEachIndexed{ index, option ->
                            Row(
                                verticalAlignment = Alignment.CenterVertically,
                                horizontalArrangement = Arrangement.Center,
                            ){
                                RadioButton(
                                    onClick = {selectedOption = index},
                                    selected = selectedOption == index
                                )
                                Text(
                                    text = option,
                                    style = MaterialTheme.typography.bodyLarge
                                )
                            }
                        }
                    }


                }
                Row(
                    modifier = Modifier.fillMaxWidth(),
                    horizontalArrangement = Arrangement.SpaceEvenly,
                    verticalAlignment = Alignment.Bottom
                ){
                    Button(
                        onClick = {

                        },
                        modifier = Modifier
                            .fillMaxWidth()
                            .weight(1f)
                    )
                    {
                        Text(text = "Cancel")
                    }
                    Spacer(modifier = Modifier.width(12.dp))
                    Button(
                        onClick = {
                            if(count.value+1 != threshold){
                                count.value++
                                score.value += totalScore
                                navController.navigate("question_screen")
                            }
                            else{
                                navController.navigate("end_screen")
                            }

                        },
                        modifier = Modifier
                            .fillMaxWidth()
                            .weight(1f))
                    {
                        Text(text = "Next")
                    }
                }
            }

        }
    }
}