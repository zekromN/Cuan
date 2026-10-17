
package com.cuan.app.ui.theme

import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.lightColorScheme
import androidx.compose.material3.darkColorScheme
import androidx.compose.runtime.Composable
import androidx.compose.ui.graphics.Color

private val CuanLightColors = lightColorScheme(
    primary = Color(0xFF00A878),
    background = Color(0xFFF5F7F6),
    surface = Color(0xFFFFFFFF)
)

private val CuanDarkColors = darkColorScheme(
    primary = Color(0xFF00A878),
    background = Color(0xFF102A24),
    surface = Color(0xFF19382F)
)

@Composable
fun CuanTheme(
    darkTheme: Boolean = false,
    content: @Composable () -> Unit
) {
    val colors = if (darkTheme) {
        CuanDarkColors
    } else {
        CuanLightColors
    }

    MaterialTheme(
        colorScheme = colors,
        content = content
    )
}
