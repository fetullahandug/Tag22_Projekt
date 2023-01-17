fun main() {
    var numbers: MutableList<Int> = mutableListOf(3, 6, 4, 7, 42, 1, 26)

    for(i in 0..numbers.size-1){
        numbers[i] += 5
    }

    for(i in numbers){
        println(i)
    }
}

// Frage: Ist es üblich, dass bei einer for(i in numbers), das i eine Konstante ist und nicht veränderbar ist ?