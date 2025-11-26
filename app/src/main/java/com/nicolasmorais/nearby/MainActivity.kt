package com.nicolasmorais.nearby

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
import androidx.compose.runtime.Composable
import androidx.compose.ui.tooling.preview.Preview
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import androidx.navigation.compose.rememberNavController
import androidx.navigation.toRoute
import com.nicolasmorais.nearby.data.model.Market
import com.nicolasmorais.nearby.ui.components.screen.HomeScreen
import com.nicolasmorais.nearby.ui.components.screen.MarketDetailsScreen
import com.nicolasmorais.nearby.ui.components.screen.SplashScreen
import com.nicolasmorais.nearby.ui.components.screen.WelcomeScreen
import com.nicolasmorais.nearby.ui.components.screen.route.Home
import com.nicolasmorais.nearby.ui.components.screen.route.Splash
import com.nicolasmorais.nearby.ui.components.screen.route.Welcome
import com.nicolasmorais.nearby.ui.theme.NearbyTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
//        enableEdgeToEdge()
        setContent {
            NearbyTheme {
                val navController = rememberNavController()
                NavHost(
                    navController = navController,
                    startDestination = Splash,
                ) {
                    composable<Splash> {
                        SplashScreen(onNavigate = {
                            navController.navigate(Welcome)
                        })
                    }
                    composable<Welcome> {
                        WelcomeScreen(onNavigate = {
                            navController.navigate(Home)
                        })
                    }
                    composable<Home> {
                        HomeScreen(onNavigate = { selectedMarket ->
                            navController.navigate(selectedMarket)
                        })
                    }
                    composable<Market> {
                        val selectedMarket = it.toRoute<Market>()
                        MarketDetailsScreen(market = selectedMarket,
                            onNavigateBack = { navController.popBackStack() })
                    }

                }
            }
        }
    }
}


@Preview(showBackground = true)
@Composable
fun GreetingPreview() {
    NearbyTheme {

    }
}