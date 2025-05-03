package com.example.mohomecompass.ui.screen

import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.*
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import androidx.navigation.NavController
import com.example.mohomecompass.R

@Composable
fun MainScreen(navController: NavController) {
    Column(
        modifier = Modifier
            .fillMaxSize()
            .padding(16.dp),
        horizontalAlignment = Alignment.CenterHorizontally,
        verticalArrangement = Arrangement.Center
    ) {
        Text(
            text = stringResource(R.string.app_name),
            fontSize = 44.sp,
            fontWeight = FontWeight.Bold
        )

        Spacer(modifier = Modifier.height(48.dp))

        Text(
            text = stringResource(R.string.tagline),
            fontSize = 18.sp
        )

        Spacer(modifier = Modifier.height(48.dp))

        Image(
            painter = painterResource(id = R.drawable.mhc_image),
            contentDescription = "MHC Image",
            modifier = Modifier
                .height(200.dp)
                .fillMaxWidth()
        )

        Spacer(modifier = Modifier.height(48.dp))

        Button(
            onClick = { navController.navigate("resources") },
            shape = RoundedCornerShape(18.dp),
            modifier = Modifier.width(150.dp),
            colors = ButtonDefaults.buttonColors(
                containerColor = Color(0xFF87CEFA),
                contentColor = Color.White
            )
        ) {
            Text(
                text = stringResource(R.string.resources_button),
                fontSize = 18.sp,
                fontWeight = FontWeight.Bold)
        }

        Spacer(modifier = Modifier.height(16.dp))

        Button(
            onClick = { navController.navigate("map") },
            shape = RoundedCornerShape(18.dp),
            modifier = Modifier.width(150.dp),
            colors = ButtonDefaults.buttonColors(
                containerColor = Color(0xFFFFB6C1),
                contentColor = Color.White
            )
        ) {
            Text(
                text = stringResource(R.string.map_button),
                fontSize = 18.sp,
                fontWeight = FontWeight.Bold)
        }
    }
}