package com.example.myapplication.ui.theme

import androidx.compose.foundation.isSystemInDarkTheme
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.darkColorScheme
import androidx.compose.material3.lightColorScheme
import androidx.compose.runtime.Composable

private val LightColorScheme = lightColorScheme(
    primary = ForestPrimary,
    onPrimary = ForestOnPrimary,
    primaryContainer = ForestPrimaryContainer,
    secondary = ForestSecondary,
    surface = ForestSurface,
    onSurfaceVariant = ForestOnSurfaceVariant
)

private val DarkColorScheme = darkColorScheme(
    primary = ForestDarkPrimary,
    onPrimary = ForestDarkOnPrimary,
    primaryContainer = ForestDarkPrimaryContainer,
    secondary = ForestDarkSecondary,
    surface = ForestDarkSurface,
    onSurfaceVariant = ForestDarkOnSurfaceVariant
)

// ============================================================================
// CUSTOM MATERIAL THEME COMPOSABLE
// ============================================================================
@Composable
fun ProfileTheme(
    darkTheme: Boolean = isSystemInDarkTheme(),
    content: @Composable () -> Unit
) {
    val colorScheme = if (darkTheme) DarkColorScheme else LightColorScheme
    MaterialTheme(
        colorScheme = colorScheme,
        content = content
    )
}
