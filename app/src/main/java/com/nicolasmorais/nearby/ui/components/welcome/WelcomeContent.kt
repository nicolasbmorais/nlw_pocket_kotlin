package com.nicolasmorais.nearby.ui.components.welcome

import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.unit.dp
import com.nicolasmorais.nearby.R
import com.nicolasmorais.nearby.ui.theme.Typography


@Composable
fun WelcomeContent(modifier: Modifier = Modifier) {
    Column(modifier = modifier, verticalArrangement = Arrangement.spacedBy(24.dp)) {
        Text(text = "Veja com funciona:", style = Typography.bodyLarge)
        WelcomeHowItWorksTip(
            modifier = Modifier.fillMaxWidth(),
            title = "Encontre estabelecimentos",
            subTitle = "Veja locais perto de você que são parceiros Nearby",
            iconRes = R.drawable.ic_map_pin
        )
        WelcomeHowItWorksTip(
            modifier = Modifier.fillMaxWidth(),
            title = "Ative cupom com QR Code",
            subTitle = "Escaneie o código no estabelecimento para usar o benefício",
            iconRes = R.drawable.ic_qrcode
        )
        WelcomeHowItWorksTip(
            modifier = Modifier.fillMaxWidth(),
            title = "Garanta vantagens perto de você",
            subTitle = "Ative cupons onde estiver, em diferentes tipos de estabelecimentos",
            iconRes = R.drawable.ic_ticket
        )

    }
}