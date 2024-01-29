package com.example.calculatorcomposelayout

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.sp
import com.example.calculatorcomposelayout.ui.theme.CalculatorComposeLayoutTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            CalculatorComposeLayoutTheme {
                // A surface container using the 'background' color from the theme
                Surface(
                    modifier = Modifier.fillMaxSize(), color = MaterialTheme.colorScheme.background
                ) {
                    CalculatorLayout()
                }
            }
        }
    }
}

@Composable
fun CalculatorLayout() {
    Column(
        modifier = Modifier
            .fillMaxSize()
            .background(Color.Gray),
        verticalArrangement = Arrangement.SpaceAround

    ) {
        Column(
            verticalArrangement = Arrangement.SpaceBetween,
            modifier=Modifier.weight(6f)
        )
        {
            Text(
                text = "CalculatorLayout",
                textAlign = TextAlign.Center,
                modifier = Modifier
                    .fillMaxWidth()
                    .weight(3f)
                    .background(Color.Yellow),
                fontSize = 36.sp
            )
            Text(
                text = "Last Answer 3",
                textAlign = TextAlign.End,
                modifier = Modifier
                    .background(Color.White)
                    .fillMaxWidth()
                    .weight(1f),
                fontSize = 20.sp
            )
            Text(
                text = "Last Answer 2",
                textAlign = TextAlign.End,
                modifier = Modifier
                    .background(Color.White)
                    .fillMaxWidth()
                    .weight(1f),
                fontSize = 20.sp
            )
            Text(
                text = "Last Answer 1",
                textAlign = TextAlign.End,
                fontSize = 20.sp,
                modifier = Modifier
                    .background(Color.White)
                    .fillMaxWidth()
                    .weight(1f)
            )
            Text(
                text = "Answer",
                textAlign = TextAlign.End,
                modifier = Modifier
                    .fillMaxWidth()
                    .weight(2f),
                fontSize = 28.sp
            )
            Text(
                text = "",
                textAlign = TextAlign.End,
                modifier = Modifier
                    .fillMaxWidth()
                    .weight(1f)
                    .background(Color.White),
                fontSize = 28.sp
            )
        }

        Column( verticalArrangement = Arrangement.Center,
            horizontalAlignment = Alignment.CenterHorizontally,
            modifier = Modifier.weight(4f)) {
            Row(modifier = Modifier.weight(1f)) {
                Text(
                    text = "+",
                    textAlign = TextAlign.Center,
                    fontSize = 48.sp,
                    modifier = Modifier
                        .fillMaxWidth()
                        .weight(1f)
                        .background(Color.Red)
                )
                Text(
                    text = "-",
                    textAlign = TextAlign.Center,
                    fontSize = 48.sp,
                    modifier = Modifier
                        .fillMaxWidth()
                        .weight(1f)
                        .background(Color.Red)
                )
                Text(
                    text = "*",
                    textAlign = TextAlign.Center,
                    fontSize = 48.sp,
                    modifier = Modifier
                        .background(Color.Red)
                        .fillMaxWidth()
                        .weight(1f)
                )
                Text(
                    text = "/",
                    textAlign = TextAlign.Center,
                    fontSize = 48.sp,
                    modifier = Modifier
                        .background(Color.Red)
                        .fillMaxWidth()
                        .weight(1f)
                )
            }
            Row(modifier = Modifier.weight(1f)) {
                Text(
                    text = "7",
                    textAlign = TextAlign.Center,
                    fontSize = 48.sp,
                    modifier = Modifier
                        .background(Color.Blue)
                        .fillMaxWidth()
                        .weight(1f)
                )
                Text(
                    text = "8",
                    textAlign = TextAlign.Center,
                    fontSize = 48.sp,
                    modifier = Modifier
                        .background(Color.Blue)
                        .fillMaxWidth()
                        .weight(1f)
                )
                Text(
                    text = "9",
                    textAlign = TextAlign.Center,
                    fontSize = 48.sp,
                    modifier = Modifier
                        .background(Color.Blue)
                        .fillMaxWidth()
                        .weight(1f)
                )
                Text(
                    text = "AC",
                    textAlign = TextAlign.Center,
                    fontSize = 48.sp,
                    modifier = Modifier
                        .background(Color.Blue)
                        .fillMaxWidth()
                        .weight(1f)
                )
            }
            Row(modifier = Modifier.weight(1f)) {
                Text(
                    text = "4",
                    textAlign = TextAlign.Center,
                    fontSize = 48.sp,
                    modifier = Modifier
                        .background(Color.Blue)
                        .fillMaxWidth()
                        .weight(1f)
                )
                Text(
                    text = "5",
                    textAlign = TextAlign.Center,
                    fontSize = 48.sp,
                    modifier = Modifier
                        .background(Color.Blue)
                        .fillMaxWidth()
                        .weight(1f)
                )
                Text(
                    text = "6",
                    textAlign = TextAlign.Center,
                    fontSize = 48.sp,
                    modifier = Modifier
                        .background(Color.Blue)
                        .fillMaxWidth()
                        .weight(1f)
                )
                Text(
                    text = "%",
                    textAlign = TextAlign.Center,
                    fontSize = 48.sp,
                    modifier = Modifier
                        .background(Color.Blue)
                        .fillMaxWidth()
                        .weight(1f)
                )
            }
            Row(modifier = Modifier.weight(1f)) {
                Text(
                    text = "1",
                    textAlign = TextAlign.Center,
                    fontSize = 48.sp,
                    modifier = Modifier
                        .background(Color.Blue)
                        .fillMaxWidth()
                        .weight(1f)
                )
                Text(
                    text = "2",
                    textAlign = TextAlign.Center,
                    fontSize = 48.sp,
                    modifier = Modifier
                        .fillMaxWidth()
                        .weight(1f)
                        .background(Color.Blue)
                )
                Text(
                    text = "3",
                    textAlign = TextAlign.Center,
                    fontSize = 48.sp,
                    modifier = Modifier
                        .background(Color.Blue)
                        .fillMaxWidth()
                        .weight(1f)
                )
                Text(
                    text = "=",
                    textAlign = TextAlign.Center,
                    fontSize = 48.sp,
                    modifier = Modifier
                        .background(Color.Yellow)
                        .fillMaxWidth()
                        .weight(1f)
                )

            }
        }
        Text(
            text = "ADS", textAlign = TextAlign.Center,
            modifier = Modifier
                .fillMaxWidth()
                .weight(1f)
                .background(Color.White),
            fontSize = 28.sp
        )
    }
}


@Preview(showBackground = true)
@Composable
fun GreetingPreview() {
    CalculatorComposeLayoutTheme {
        CalculatorLayout()
    }
}