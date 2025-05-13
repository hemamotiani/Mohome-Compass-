package com.example.mohomecompass.ui.screen

import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.*
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import androidx.navigation.NavController
import com.example.mohomecompass.R
import androidx.compose.ui.text.style.LineHeightStyle
import androidx.compose.ui.text.TextStyle

@Composable
fun MainScreen(navController: NavController) {
    val mhcBlue = Color(0xFF87CEFA)
    val mhcPink = Color(0xFFFFB6C1)
    val backgroundColor = Color(0xFFF5F5F5)

    Box(
        modifier = Modifier
            .fillMaxSize()
            .background(backgroundColor)
    ) {
        Column(
            modifier = Modifier
                .fillMaxSize()
                .padding(24.dp),
            horizontalAlignment = Alignment.CenterHorizontally,
            verticalArrangement = Arrangement.spacedBy(32.dp)
        ) {
            Spacer(modifier = Modifier.height(48.dp))

            // Title Section
            Column(
                horizontalAlignment = Alignment.CenterHorizontally,
                verticalArrangement = Arrangement.spacedBy(16.dp)
            ) {
                Text(
                    text = "MoHome\nCompass",
                    style = TextStyle(
                        fontSize = 44.sp,
                        fontWeight = FontWeight.Bold,
                        color = Color(0xFF2C3E50),
                        textAlign = TextAlign.Center,
                        lineHeight = 48.sp,
                        letterSpacing = 1.sp
                    ),
                    modifier = Modifier.padding(horizontal = 16.dp)
                )

                Text(
                    text = stringResource(R.string.tagline),
                    fontSize = 20.sp,
                    color = Color(0xFF34495E),
                    textAlign = TextAlign.Center
                )
            }

            // Image
            Image(
                painter = painterResource(id = R.drawable.map),
                contentDescription = "MHC Campus",
                modifier = Modifier
                    .fillMaxWidth()
                    .height(250.dp)
                    .clip(RoundedCornerShape(16.dp)),
                contentScale = ContentScale.Crop
            )

            // Buttons Column
            Column(
                horizontalAlignment = Alignment.CenterHorizontally,
                verticalArrangement = Arrangement.spacedBy(16.dp),
                modifier = Modifier.padding(top = 16.dp)
            ) {
                // Resources Button
                Button(
                    onClick = { navController.navigate("resources") },
                    shape = RoundedCornerShape(28.dp),
                    modifier = Modifier
                        .width(280.dp)
                        .height(56.dp),
                    colors = ButtonDefaults.buttonColors(
                        containerColor = mhcBlue
                    ),
                    elevation = ButtonDefaults.buttonElevation(
                        defaultElevation = 6.dp,
                        pressedElevation = 8.dp
                    )
                ) {
                    Text(
                        text = stringResource(R.string.resources_button),
                        fontSize = 20.sp,
                        fontWeight = FontWeight.Bold
                    )
                }

                // Map Button
                Button(
                    onClick = { navController.navigate("map") },
                    shape = RoundedCornerShape(28.dp),
                    modifier = Modifier
                        .width(280.dp)
                        .height(56.dp),
                    colors = ButtonDefaults.buttonColors(
                        containerColor = mhcPink
                    ),
                    elevation = ButtonDefaults.buttonElevation(
                        defaultElevation = 6.dp,
                        pressedElevation = 8.dp
                    )
                ) {
                    Text(
                        text = stringResource(R.string.map_button),
                        fontSize = 20.sp,
                        fontWeight = FontWeight.Bold
                    )
                }
            }
        }
    }
}