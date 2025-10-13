package com.nicolasmorais.nearby.data.model.mocks

import com.nicolasmorais.nearby.data.model.Rule

val mockRules = listOf(
    Rule(
        id = "1",
        description = "Promoção exclusiva para compras acima de R$100,00",
        marketId = "1234"
    ),
    Rule(
        id = "2",
        description = "Promoção exclusiva para compras acima de R$500,00",
        marketId = "5678"
    )
)