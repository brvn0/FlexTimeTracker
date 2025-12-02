package de.brunolama.flextimetracker

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
import de.brunolama.flextimetracker.ui.screens.MainScreen
import de.brunolama.flextimetracker.ui.theme.FlexTimeTrackerTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContent {
            FlexTimeTrackerTheme {
                MainScreen()
            }
        }
    }
}