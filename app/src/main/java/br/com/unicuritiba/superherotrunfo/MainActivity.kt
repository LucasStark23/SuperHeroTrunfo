package br.com.unicuritiba.superherotrunfo

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import br.com.unicuritiba.superherotrunfo.model.TipoCarta


class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val buttonDcDeck: Button = findViewById(R.id.buttonDD)
        val buttonMarvelDeck: Button = findViewById(R.id.buttonMD)

        buttonDcDeck.setOnClickListener {
            val intent = Intent(this, DueloActivity::class.java)
            intent.putExtra("deckSelecionado", TipoCarta.DC.name)
            startActivity(intent)
        }

        buttonMarvelDeck.setOnClickListener {
            val intent = Intent(this, DueloActivity::class.java)
            intent.putExtra("deckSelecionado", TipoCarta.MARVEL.name)
            startActivity(intent)
        }
    }
}
