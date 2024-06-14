package br.com.unicuritiba.superherotrunfo

import br.com.unicuritiba.superherotrunfo.model.Carta
import br.com.unicuritiba.superherotrunfo.model.TipoCarta

object DeckFactory {

    fun criarDeck(heros:String): List<Carta> {
        val cartas = mutableListOf<Carta>()

        if (heros == "MARVEL") {

            val cartaIronMan = Carta(
                nome = "Iron Man",
                intelligence = 100,
                strength = 85,
                speed = 58,
                durability = 85,
                power = 100,
                combat = 64,
                imagem = "https://cdn.jsdelivr.net/gh/akabab/superhero-api@0.3.0/api/images/lg/346-iron-man.jpg",
                tipo = arrayListOf(TipoCarta.MARVEL)
            )
            cartas.add(cartaIronMan)

            val cartaSpiderman = Carta(
                nome = "Spider-Man",
                intelligence = 90,
                strength = 55,
                speed = 67,
                durability = 75,
                power = 74,
                combat = 85,
                imagem = "https://cdn.jsdelivr.net/gh/akabab/superhero-api@0.3.0/api/images/lg/620-spider-man.jpg",
                tipo = arrayListOf(TipoCarta.MARVEL)
            )
            cartas.add(cartaSpiderman)

            val cartaHulk = Carta(
                nome = "Hulk",
                intelligence = 88,
                strength = 100,
                speed = 63,
                durability = 100,
                power = 98,
                combat = 85,
                imagem = "https://cdn.jsdelivr.net/gh/akabab/superhero-api@0.3.0/api/images/lg/332-hulk.jpg",
                tipo = arrayListOf(TipoCarta.MARVEL)
            )
            cartas.add(cartaHulk)

            val cartaCaptainAmerica = Carta(
                nome = "Captain America",
                intelligence = 69,
                strength = 19,
                speed = 38,
                durability = 55,
                power = 60,
                combat = 100,
                imagem = "https://cdn.jsdelivr.net/gh/akabab/superhero-api@0.3.0/api/images/lg/149-captain-america.jpg",
                tipo = arrayListOf(TipoCarta.MARVEL)
            )
            cartas.add(cartaCaptainAmerica)

            val cartaBlackWidow = Carta(
                nome = "Black Widow",
                intelligence = 75,
                strength = 13,
                speed = 33,
                durability = 30,
                power = 36,
                combat = 100,
                imagem = "https://cdn.jsdelivr.net/gh/akabab/superhero-api@0.3.0/api/images/lg/107-black-widow.jpg",
                tipo = arrayListOf(TipoCarta.MARVEL)
            )
            cartas.add(cartaBlackWidow)

            val cartaBlackPanther = Carta(
                nome = "Black Panther",
                intelligence = 88,
                strength = 16,
                speed = 30,
                durability = 60,
                power = 41,
                combat = 100,
                imagem = "https://cdn.jsdelivr.net/gh/akabab/superhero-api@0.3.0/api/images/lg/106-black-panther.jpg",
                tipo = arrayListOf(TipoCarta.MARVEL)
            )
            cartas.add(cartaBlackPanther)

            val cartaDaredevil = Carta(
                nome = "Daredevil",
                intelligence = 75,
                strength = 13,
                speed = 25,
                durability = 35,
                power = 61,
                combat = 100,
                imagem = "https://cdn.jsdelivr.net/gh/akabab/superhero-api@0.3.0/api/images/lg/201-daredevil.jpg",
                tipo = arrayListOf(TipoCarta.MARVEL)
            )
            cartas.add(cartaDaredevil)

            val cartaDeadpool = Carta(
                nome = "Deadpool",
                intelligence = 69,
                strength = 32,
                speed = 50,
                durability = 100,
                power = 100,
                combat = 100,
                imagem = "https://cdn.jsdelivr.net/gh/akabab/superhero-api@0.3.0/api/images/lg/213-deadpool.jpg",
                tipo = arrayListOf(TipoCarta.MARVEL)
            )
            cartas.add(cartaDeadpool)

            val cartaGhostRider = Carta(
                nome = "Ghost Rider",
                intelligence = 50,
                strength = 55,
                speed = 25,
                durability = 100,
                power = 100,
                combat = 60,
                imagem = "https://cdn.jsdelivr.net/gh/akabab/superhero-api@0.3.0/api/images/lg/280-ghost-rider.jpg",
                tipo = arrayListOf(TipoCarta.MARVEL)
            )
            cartas.add(cartaGhostRider)

            val cartaThor = Carta(
                nome = "Thor",
                intelligence = 69,
                strength = 100,
                speed = 83,
                durability = 100,
                power = 100,
                combat = 100,
                imagem = "https://cdn.jsdelivr.net/gh/akabab/superhero-api@0.3.0/api/images/lg/659-thor.jpg",
                tipo = arrayListOf(TipoCarta.MARVEL)
            )
            cartas.add(cartaThor)

        }

        else {

            val cartaBatman = Carta(
                nome = "Batman",
                intelligence = 100,
                strength = 26,
                speed = 27,
                durability = 50,
                power = 47,
                combat = 100,
                imagem = "https://cdn.jsdelivr.net/gh/akabab/superhero-api@0.3.0/api/images/lg/70-batman.jpg",
                tipo = arrayListOf(TipoCarta.DC)
            )
            cartas.add(cartaBatman)

            val cartaAquaman = Carta(
                nome = "Aquaman",
                intelligence = 81,
                strength = 85,
                speed = 79,
                durability = 80,
                power = 100,
                combat = 80,
                imagem = "https://cdn.jsdelivr.net/gh/akabab/superhero-api@0.3.0/api/images/lg/38-aquaman.jpg",
                tipo = arrayListOf(TipoCarta.DC)
            )
            cartas.add(cartaAquaman)

            val cartaSuperman = Carta(
                nome = "Superman",
                intelligence = 94,
                strength = 100,
                speed = 100,
                durability = 100,
                power = 100,
                combat = 85,
                imagem = "https://cdn.jsdelivr.net/gh/akabab/superhero-api@0.3.0/api/images/lg/644-superman.jpg",
                tipo = arrayListOf(TipoCarta.DC)
            )
            cartas.add(cartaSuperman)

            val cartaWonderWoman = Carta(
                nome = "Wonder Woman",
                intelligence = 88,
                strength = 100,
                speed = 79,
                durability = 100,
                power = 100,
                combat = 100,
                imagem = "https://cdn.jsdelivr.net/gh/akabab/superhero-api@0.3.0/api/images/lg/720-wonder-woman.jpg",
                tipo = arrayListOf(TipoCarta.DC)
            )
            cartas.add(cartaWonderWoman)

            val cartaCyborg = Carta(
                nome = "Cyborg",
                intelligence = 75,
                strength = 53,
                speed = 42,
                durability = 85,
                power = 71,
                combat = 64,
                imagem = "https://cdn.jsdelivr.net/gh/akabab/superhero-api@0.3.0/api/images/lg/194-cyborg.jpg",
                tipo = arrayListOf(TipoCarta.DC)
            )
            cartas.add(cartaCyborg)

            val cartaShazam = Carta(
                nome = "Shazam",
                intelligence = 88,
                strength = 100,
                speed = 88,
                durability = 95,
                power = 100,
                combat = 75,
                imagem = "https://cdn.jsdelivr.net/gh/akabab/superhero-api@0.3.0/api/images/lg/156-captain-marvel.jpg",
                tipo = arrayListOf(TipoCarta.DC)
            )
            cartas.add(cartaShazam)

            val cartaFlash = Carta(
                nome = "Flash",
                intelligence = 88,
                strength = 48,
                speed = 100,
                durability = 60,
                power = 100,
                combat = 60,
                imagem = "https://cdn.jsdelivr.net/gh/akabab/superhero-api@0.3.0/api/images/lg/265-flash-ii.jpg",
                tipo = arrayListOf(TipoCarta.DC)
            )
            cartas.add(cartaFlash)

            val cartaGreenArrow = Carta(
                nome = "Green Arrow",
                intelligence = 81,
                strength = 12,
                speed = 35,
                durability = 28,
                power = 39,
                combat = 90,
                imagem = "https://cdn.jsdelivr.net/gh/akabab/superhero-api@0.3.0/api/images/lg/298-green-arrow.jpg",
                tipo = arrayListOf(TipoCarta.DC)
            )
            cartas.add(cartaGreenArrow)

            val cartaGreenLantern = Carta(
                nome = "Green Lantern",
                intelligence = 69,
                strength = 90,
                speed = 75,
                durability = 80,
                power = 100,
                combat = 70,
                imagem = "https://cdn.jsdelivr.net/gh/akabab/superhero-api@0.3.0/api/images/lg/306-hal-jordan.jpg",
                tipo = arrayListOf(TipoCarta.DC)
            )
            cartas.add(cartaGreenLantern)

            val cartaConstantine = Carta(
                nome = "John Constantine",
                intelligence = 63,
                strength = 10,
                speed = 8,
                durability = 40,
                power = 54,
                combat = 65,
                imagem = "https://cdn.jsdelivr.net/gh/akabab/superhero-api@0.3.0/api/images/lg/367-john-constantine.jpg",
                tipo = arrayListOf(TipoCarta.DC)
            )
            cartas.add(cartaConstantine)
        }

        return cartas
    }
}
