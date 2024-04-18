package br.senai.sp.jandira.repository

import androidx.compose.runtime.Composable
import androidx.compose.ui.res.painterResource
import br.senai.sp.jandira.R
import br.senai.sp.jandira.model.Viagem
import java.time.LocalDate

class ViagemRepository {

    @Composable
    fun listarTodasAsViagens(): List<Viagem>{

        val londres = Viagem(
            1,
            destino = "Londres",
            descricao = "Londres, capital da Inglaterra e do Reino Unido, é uma cidade do século 21 com uma história que remonta à era romana.",
            dataChegada = LocalDate.of(2019, 2, 18),
            dataPartida = LocalDate.of(2019, 2, 21),
            imagem = painterResource(id = R.drawable.londres)
        )

        val paris = Viagem(
            2,
            destino = "Paris",
            descricao = "Paris, a capital da França, é uma importante cidade europeia e um centro mundial de arte, moda, gastronomia e cultura.",
            dataChegada = LocalDate.of(2022, 12, 23),
            dataPartida = LocalDate.of(2022, 1, 3),
            imagem = painterResource(id = R.drawable.paris)
            )

        val recife = Viagem(
            3,
            destino = "Recife",
            descricao = "Recife, a capital do estado de Pernambuco, no nordeste do Brasil, distingue-se pelos seus vários rios, pontes, ilhéus e penínsulas.",
            dataChegada = LocalDate.of(2024, 1, 9),
            dataPartida = LocalDate.of(2024, 1, 15),
            )

        val orlando = Viagem(
            4,
            destino = "Orlando",
            descricao = "Orlando, uma cidade no centro da Flórida, abriga mais de uma dezena de parques temáticos. O mais conhecido é o Walt Disney World.",
            dataChegada = LocalDate.of(2020, 4, 12),
            dataPartida = LocalDate.of(2020, 4, 30),
            imagem = painterResource(id = R.drawable.orlando)
            )

        val madri = Viagem(
            5,
            destino = "Madri",
            descricao = "Madri, a capital da Espanha, situada no centro do país, é uma cidade de avenidas elegantes e parques grandes e bem cuidados, como o Buen Retiro.",
            dataChegada = LocalDate.of(2021, 6, 4),
            dataPartida = LocalDate.of(2021, 6, 11),
            imagem = painterResource(id = R.drawable.madri)
            )

        return listOf(
            londres,
            paris,
            recife,
            orlando,
            madri
        )

    }

}