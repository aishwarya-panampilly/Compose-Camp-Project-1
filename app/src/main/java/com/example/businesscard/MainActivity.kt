package com.example.businesscard



import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.*
import androidx.compose.material.MaterialTheme
import androidx.compose.material.Surface
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.fontResource
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.businesscard.ui.theme.BusinessCardTheme


class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            BusinessCardTheme {
                // A surface container using the 'background' color from the theme
                Surface(
                    modifier = Modifier.fillMaxSize(),
                    color = MaterialTheme.colors.background
                ) {
                    BusinessCardText()
                }
            }
        }
    }
}

@Composable
fun BusinessCardText() {
        Column(
            modifier = Modifier
                .fillMaxHeight()
                .fillMaxWidth()
                .background(color = Color(0xff533e85)),
                    horizontalAlignment = Alignment.CenterHorizontally , verticalArrangement = Arrangement.Center

        ) {
            Column( horizontalAlignment = Alignment.CenterHorizontally , verticalArrangement = Arrangement.Center) {
                val image = painterResource(R.drawable.android_logo)
                Image(
                    painter = image,
                    contentDescription = null,
                    modifier = Modifier
                        .height(200.dp)
                        .width(200.dp),
                )
                Text(
                    text = stringResource(R.string.name_text),
                    fontSize = 36.sp,
                    color = Color.White
                )
                Text(text = stringResource(R.string.profession_text), color = Color.White, fontSize = 20.sp)
            }
            Column(modifier = Modifier.padding(top = 150.dp) , horizontalAlignment = Alignment.CenterHorizontally        )
            {
                Row(modifier = Modifier.padding(bottom = 16.dp)) {
                    Image(
                        painter = painterResource(R.drawable.white_phone),
                        contentDescription = null,
                        modifier = Modifier
                            .height(20.dp)
                            .width(20.dp)
                    )
                    Text(text = stringResource(R.string.mobile_text), color = Color.White, modifier = Modifier.padding(start = 200.dp))
                }
                Row(modifier = Modifier.padding(bottom = 16.dp)) {
                    Image(
                        painter = painterResource(R.drawable.white_mail), contentDescription = null,
                        modifier = Modifier
                            .height(20.dp)
                            .width(20.dp)
                    )
                    Text(text = stringResource(R.string.email_text), color = Color.White,modifier = Modifier.padding(start = 30.dp))
                }
                Row(modifier = Modifier.padding(bottom = 16.dp)) {

                    Image(
                        painter = painterResource(R.drawable.white_git), contentDescription = null,
                        modifier = Modifier
                            .height(20.dp)
                            .width(20.dp)
                    )
                    Text(text = stringResource(R.string.share_text), color = Color.White,modifier = Modifier.padding(start = 150.dp))
                }

                }
            }
        }

@Preview(showBackground = true)
@Composable
fun DefaultPreview() {
    BusinessCardTheme {
       BusinessCardText()
    }
}