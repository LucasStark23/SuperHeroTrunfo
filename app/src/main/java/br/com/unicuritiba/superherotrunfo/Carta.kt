package br.com.unicuritiba.superherotrunfo.model

data class Carta(
    val nome: String,
    val intelligence: Int,
    val strength: Int,
    val speed: Int,
    val durability: Int,
    val power: Int,
    val combat: Int,
    val imagem: String,
    val tipo: List<TipoCarta>
)
