package br.com.unicuritiba.superherotrunfo

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import br.com.unicuritiba.superherotrunfo.model.Carta
import com.squareup.picasso.Picasso

class DeckAdapter(val cartas:List<Carta>,val listener: OnDeckListener):RecyclerView.Adapter<DeckAdapter.DeckItemViewHolder>() {

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): DeckItemViewHolder {
        val view = LayoutInflater.from(parent.context).inflate(R.layout.item_carta,parent,false)
        return DeckItemViewHolder(view)
    }

    override fun onBindViewHolder(holder: DeckItemViewHolder, position: Int) {
        val view = holder.itemView

        val carta = cartas[position]

        view.apply {
            findViewById<TextView>(R.id.textViewName).text = carta.nome
            findViewById<TextView>(R.id.textViewIntelligence).text = "Intelligence: ${carta.intelligence}"
            findViewById<TextView>(R.id.textViewStrength).text = "Strength: ${carta.strength}"
            findViewById<TextView>(R.id.textViewSpeed).text = "Speed: ${carta.speed}"
            findViewById<TextView>(R.id.textViewDurability).text = "Durability: ${carta.durability}"
            findViewById<TextView>(R.id.textViewPower).text = "Power: ${carta.power}"
            findViewById<TextView>(R.id.textViewCombat).text = "Combat: ${carta.combat}"
            val imageView = findViewById<ImageView>(R.id.imageViewCartas)
            Picasso.get().load(carta.imagem).into(imageView)

        }
    }

    override fun getItemCount(): Int {
        return cartas.size
    }

    inner class DeckItemViewHolder(view:View):RecyclerView.ViewHolder(view){

        init {
            view.setOnClickListener{
                if (absoluteAdapterPosition != RecyclerView.NO_POSITION
                ){
                    listener.onCardClick(absoluteAdapterPosition)
                }
            }
        }
    }

    fun interface OnDeckListener{
        fun onCardClick(position: Int)
    }
}