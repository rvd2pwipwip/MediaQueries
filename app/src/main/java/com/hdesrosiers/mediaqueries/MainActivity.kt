package com.hdesrosiers.mediaqueries

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.*
import androidx.compose.material.MaterialTheme
import androidx.compose.material.Surface
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.hdesrosiers.mediaqueries.ui.theme.MediaQueriesTheme

// https://www.youtube.com/watch?v=iUIXsHiuRfY&list=PLQkwcJG4YTCSpJ2NLhDTHhi6XBNfk9WiC&index=18

class MainActivity : ComponentActivity() {
  override fun onCreate(savedInstanceState: Bundle?) {
    super.onCreate(savedInstanceState)
    setContent {
      Column(
        horizontalAlignment = Alignment.CenterHorizontally,
        verticalArrangement = Arrangement.Center,
        modifier = Modifier.fillMaxSize()
      ) {
        MediaQuery(comparator = Dimensions.Width lessThan 400.dp) {
          Text(text = "I'm only shown below a width of 400dp")
        }
        Spacer(modifier = Modifier.height(30.dp))
        Text(
          text = "I have a 300dp size below a width of 400dp",
          modifier = Modifier
            .background(Color.Green)
            .mediaQuery(
              comparator = Dimensions.Width lessThan 400.dp,
              modifier = Modifier.size(300.dp)
            )
        )
      }
    }
  }
}