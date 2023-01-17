fun main() {
    var lieblingsFilme: List<String> = listOf("Batman", "Frankenstein", "Jurassic Park", "Matrix", "Harry Potter")

    for(i in lieblingsFilme){
        if(i == "Matrix"){
            println("Der Film $i ist an ${lieblingsFilme.indexOf(i)}. Stelle")
        }
    }

    var c = 0
    do{
       if(lieblingsFilme[c] == "Matrix"){
           println("Der Film ${lieblingsFilme[c]} ist an $c. Stelle")
       }
        c++
    }while(c < lieblingsFilme.size)
}