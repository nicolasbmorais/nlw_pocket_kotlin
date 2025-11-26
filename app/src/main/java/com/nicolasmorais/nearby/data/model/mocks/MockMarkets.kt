package com.nicolasmorais.nearby.data.model.mocks

import com.nicolasmorais.nearby.data.model.Market
import com.nicolasmorais.nearby.data.model.Rule

val mockMarkets = listOf(

    Market(
        id = "1",
        categoryId = "supermarket",
        name = "Supermercado Central",
        description = "O melhor supermercado do bairro com ofertas exclusivas.",
        coupons = 5,
//        rules = listOf(
//            Rule(
//                id = "r1",
//                description = "Cupom válido apenas para compras acima de R$ 50,00.",
//                marketId = "1"
//            ), Rule(
//                id = "r2",
//                description = "Limite de 1 cupom por CPF a cada 24 horas.",
//                marketId = "1"
//            )
//        ),
        latitude = -23.563210,
        longitude = -46.654321,
        address = "Av. Paulista, 1000 - São Paulo, SP",
        phone = "(11) 3333-4444",
        cover = "https://example.com/images/markets/supermercado_central.jpg"
    ),

    Market(
        id = "2",
        categoryId = "restaurant",
        name = "Restaurante Sabor & Arte",
        description = "Comida brasileira feita com ingredientes frescos e tempero caseiro.",
        coupons = 2,
//        rules = listOf(
//            Rule(
//                id = "r3",
//                description = "Válido apenas para consumo no salão. Não aplica em delivery.",
//                marketId = "2"
//            ), Rule(
//                id = "r4",
//                description = "Não cumulativo com promoções de pratos executivos.",
//                marketId = "2"
//            )
//        ),
        latitude = -23.550520,
        longitude = -46.633308,
        address = "Rua Augusta, 250 - São Paulo, SP",
        phone = "(11) 9999-8888",
        cover = "https://example.com/images/markets/restaurante_sabor_arte.jpg"
    ),

    Market(
        id = "3",
        categoryId = "pharmacy",
        name = "Farmácia Popular",
        description = "Medicamentos e perfumaria com descontos especiais.",
        coupons = 3,
//        rules = listOf(
//            Rule(
//                id = "r5",
//                description = "Desconto não válido para medicamentos controlados (tarja preta).",
//                marketId = "3"
//            )
//        ),
        latitude = -23.557890,
        longitude = -46.662120,
        address = "Rua da Consolação, 800 - São Paulo, SP",
        phone = "(11) 4444-5555",
        cover = "https://example.com/images/markets/farmacia_popular.jpg"
    ),

    Market(
        id = "4",
        categoryId = "bakery",
        name = "Padaria do Sol",
        description = "Pães fresquinhos e café da manhã completo.",
        coupons = 1,
//        rules = listOf(
//            Rule(
//                id = "r6",
//                description = "Cupom válido somente para combos de café da manhã.",
//                marketId = "4"
//            )
//        ),
        latitude = -23.561234,
        longitude = -46.645678,
        address = "Rua Haddock Lobo, 45 - São Paulo, SP",
        phone = "(11) 2222-3333",
        cover = "https://example.com/images/markets/padaria_do_sol.jpg"
    ),

    Market(
        id = "5",
        categoryId = "petshop",
        name = "Pet Feliz",
        description = "Tudo para o seu pet: rações, brinquedos e serviços de banho e tosa.",
        coupons = 4,
//        rules = listOf(
//            Rule(
//                id = "r7",
//                description = "Desconto válido apenas para banho e tosa de cães de pequeno e médio porte.",
//                marketId = "5"
//            ), Rule(
//                id = "r8",
//                description = "Não aplicável a rações premium e medicamentos veterinários.",
//                marketId = "5"
//            )
//        ),
        latitude = -23.564001,
        longitude = -46.651234,
        address = "Av. Brigadeiro Luís Antônio, 1200 - São Paulo, SP",
        phone = "(11) 7777-6666",
        cover = "https://example.com/images/markets/pet_feliz.jpg"
    )
)
