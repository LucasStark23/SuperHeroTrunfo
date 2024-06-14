package br.com.unicuritiba.superherotrunfo

import android.os.Bundle
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity
import androidx.recyclerview.widget.GridLayoutManager
import androidx.recyclerview.widget.RecyclerView
import br.com.unicuritiba.superherotrunfo.model.Carta


class DueloActivity : AppCompatActivity() {

    private lateinit var cartas: List<Carta>

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_duelo)


        val deckSelecionado = intent.getStringExtra("deckSelecionado")
        cartas = DeckFactory.criarDeck(deckSelecionado ?: "")

        val recyclerView = findViewById<RecyclerView>(R.id.recycleviewCartas)
        recyclerView.layoutManager = GridLayoutManager(this,3)
        recyclerView.adapter = DeckAdapter(cartas){position ->
            comparaCartas(position,0
            )
        }

    }
    fun comparaCartas(cartaJogadorIndex: Int, cartaOponenteIndex: Int){

        val cartaJogador = cartas[cartaJogadorIndex]
        val cartaOponente = cartas[cartaOponenteIndex]

        var vitoriasJogador = 0
        var vitoriasOponente = 0

        if (cartaJogador.strength > cartaOponente.strength) {
            vitoriasJogador++
        } else if (cartaJogador.strength < cartaOponente.strength) {
            vitoriasOponente++
        }

        if (cartaJogador.speed > cartaOponente.speed) {
            vitoriasJogador++
        } else if (cartaJogador.speed < cartaOponente.speed) {
            vitoriasOponente++
        }

        if (cartaJogador.durability > cartaOponente.durability) {
            vitoriasJogador++
        } else if (cartaJogador.durability < cartaOponente.durability) {
            vitoriasOponente++
        }

        if (cartaJogador.power > cartaOponente.power) {
            vitoriasJogador++
        } else if (cartaJogador.power < cartaOponente.power) {
            vitoriasOponente++
        }

        if (cartaJogador.combat > cartaOponente.combat) {
            vitoriasJogador++
        } else if (cartaJogador.combat < cartaOponente.combat) {
            vitoriasOponente++
        }

        val resultado: String = if (vitoriasJogador > vitoriasOponente) {
            "Jogador venceu!"
        } else if (vitoriasJogador < vitoriasOponente) {
            "Oponente venceu!"
        } else {
            "Empate!"
        }


        Toast.makeText(this, resultado, Toast.LENGTH_SHORT).show()
    }
}
