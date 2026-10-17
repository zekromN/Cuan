package com.cuan.app.ui.screens

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.unit.dp
import androidx.compose.foundation.Image
import androidx.compose.foundation.border
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.size
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.graphics.Color
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.foundation.layout.offset
import androidx.compose.foundation.layout.width
import androidx.compose.ui.draw.clip
import androidx.compose.ui.draw.scale
import androidx.compose.ui.graphics.Brush
import androidx.compose.ui.text.font.FontFamily
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.unit.sp
import com.cuan.app.ui.screens.PlusJakartaSans
import com.cuan.app.R

@Composable
fun SplashScreen() {
    Box(
        modifier = Modifier
            .fillMaxSize()
            .background(MaterialTheme.colorScheme.background)
    ) {
        // HIJAU
        Box(
            modifier = Modifier
                .size(450.dp)
                .align(Alignment.TopCenter)
                .offset(y = (-100).dp)
                .background(
                    brush = Brush.radialGradient(
                        colors = listOf(
                            Color(0x3900A878), // Tengah: hijau transparan
                            Color(0x2000A878), // Tengah luar: lebih redup
                            Color.Transparent  // Pinggir: hilang halus
                        )
                    ),
                    shape = CircleShape
                )
        )
        // ISI SPLASH
        Column(
            modifier = Modifier
                .fillMaxSize()
                .padding(24.dp)
                .padding(top = 120.dp),
            verticalArrangement = Arrangement.Top,
            horizontalAlignment = Alignment.CenterHorizontally
        ) {
            Image(
                painter = painterResource(id = R.drawable.logocuan),
                modifier = Modifier.size(128.dp),
                contentDescription = "Logo Cuan"
            )
            Box(
                modifier = Modifier.fillMaxWidth(),
                contentAlignment = Alignment.Center
            ) {
                Row(
                    verticalAlignment = Alignment.CenterVertically,
                    horizontalArrangement = Arrangement.spacedBy(1.dp),
                    modifier = Modifier
                        .scale(1.5f)
                        .padding(top = 20.dp)
                ) {
                    Text(
                        text = "Cuan",
                        fontWeight = FontWeight.SemiBold,
                        fontSize = 35.sp
                    )

                    Box(
                        modifier = Modifier
                            .size(8.dp)
                            .offset(y = 10.dp)
                            .background(
                                color = Color(0xFF00A878),
                                shape = CircleShape
                            )
                    )
                }
            }
            Box(
                modifier = Modifier.padding(top = 20.dp)
            ) {
                Text(
                    text = "Catat Usaha, Tahu CUAN-nya.",
                    fontWeight = FontWeight.W500
                )
            }
        }
    }
}
