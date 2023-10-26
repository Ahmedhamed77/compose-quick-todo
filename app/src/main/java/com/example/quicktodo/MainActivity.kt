package com.example.quicktodo

import android.os.Bundle
import android.util.Log
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.Button
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.example.quicktodo.ui.theme.QuickTodoTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            QuickTodoTheme {
                // A surface container using the 'background' color from the theme
                Surface(
                    color = MaterialTheme.colorScheme.background
                ) {
                    HomeScreen()
                }
            }
        }
    }
}

@Composable
fun Greeting(name: String, modifier: Modifier = Modifier) {
    Text(
        text = "Hello $name!",
        modifier = modifier
    )
}


@Composable
fun HomeScreen() {
    fun onPressToCreateTodo() {
        // Your function logic here
        Log.d("Button", "Button clicked in HomeScreen!")
    }

    CreateNewTodoButton(onClick = { onPressToCreateTodo() })
}

@Composable
fun CreateNewTodoButton(onClick:() -> Unit ) {
    Box(modifier = Modifier.fillMaxSize()){
        Button(onClick = { onClick() }, shape = RoundedCornerShape(50),
            modifier = Modifier.align(
            Alignment.BottomEnd)
                .padding(16.dp) ) {
            Text("+")
        }
    }

}



@Preview(showBackground = true)
@Composable
fun GreetingPreview() {
    QuickTodoTheme {
        Greeting("Android")
    }
}