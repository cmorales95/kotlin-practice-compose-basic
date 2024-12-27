package com.example.practicecomposebasic

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.practicecomposebasic.ui.theme.PracticeComposeBasicTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContent {
            PracticeComposeBasicTheme {
                PracticeCompose(
                    stringResource(R.string.title),
                    stringResource(R.string.first_text),
                    stringResource(R.string.second_text),
                    modifier = Modifier
                        .fillMaxSize()
                )
            }
        }
    }                                  
}

@Composable
fun PracticeCompose(title: String, firstText: String, secondText: String, modifier: Modifier = Modifier) {
    val image = painterResource(R.drawable.bg_compose_background)
    Box(modifier) {
        Image(
            painter = image,
            contentDescription = null,
        )
        ParagraphText(
            title = title,
            firstText = firstText,
            secondText = secondText,
        )
    }
}

@Composable
fun ParagraphText(title: String, firstText: String, secondText: String, modifier: Modifier = Modifier) {
    Column(
        modifier = modifier.
            padding(16.dp)
    ) {

        Text(
            text = title,
            fontSize = 24.sp,
        )
        Text(
            text = firstText,
            textAlign = TextAlign.Justify
        )
        Text(
            text = secondText,
            textAlign = TextAlign.Justify
        )
    }
}

@Preview(showBackground = true)
@Composable
fun PracticeComposePreview() {
    PracticeComposeBasicTheme {
        PracticeCompose(
            stringResource(R.string.title),
            stringResource(R.string.first_text),
            stringResource(R.string.second_text)
        )
    }
}