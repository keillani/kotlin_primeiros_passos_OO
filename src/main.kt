//paradigma procedural

fun main() {
    println("Bem vindo ao ByteBank!")

    //var mutavel
    //val imutavel

        val titular = "Keillani"
        val numeroConta = 1000
        var saldo = 100.00
        saldo -= 1000.00

        println("titular $titular")
        println("numero conta $numeroConta")
        println("saldo $saldo")
        println()

//    testaCondicoesIfWhen(saldo)
//    testaFor()
//    testaWhile()
    loopBreakContinue()

}

fun loopBreakContinue(){
    loop@ for (i in 1..100){
        println("i $i")
        for (j in 1..100){
            println("j $j")
            if(j == 5) break@loop
        }
    }
}

fun testaWhile(){

    var i = 0
    while (i < 5) {
        val titular = "Keillani $i"
        val numeroConta = 1000 +i
        var saldo = 100 + i

        println("titular $titular")
        println("numero conta $numeroConta")
        println("saldo $saldo")
        println()
        i++
    }
}

fun testaFor(){
    for (i in 1..5) {
        val titular: String = "Keillani $i"
        val numeroConta: Int = 1000 +i
        var saldo = 100 + i

        println("titular $titular")
        println("numero conta $numeroConta")
        println("saldo $saldo")
        println()
    }

    for (i in 5 downTo 1) {

        val titular = "Keillani $i"
        val numeroConta = 1000 +i
        var saldo = 100 + i

        println("titular $titular")
        println("numero conta $numeroConta")
        println("saldo $saldo")
        println()
    }

    for (i in 1..5 step 2) {

        val titular = "Keillani $i"
        val numeroConta = 1000 +i
        var saldo = 100 + i

        println("titular $titular")
        println("numero conta $numeroConta")
        println("saldo $saldo")
        println()
    }

    for (i in 1 until 5) {

        val titular = "Keillani $i"
        val numeroConta = 1000 +i
        var saldo = 100 + i

        println("titular $titular")
        println("numero conta $numeroConta")
        println("saldo $saldo")
        println()
    }
}

fun testaCondicoesIfWhen(saldo: Double) {
    //forma com condicional if
    if (saldo > 0.0) {
        println("Conta é positiva")
    } else if (saldo == 0.0) {
        println("Conta é neutra")
    } else {
        println("Conta é negativa")
    }

    //forma com when
    when {
        saldo > 0.0 -> println("Conta é positiva")
        saldo == 0.0 -> println("Conta é neutra")
        else -> {
            println("Conta é negativa")
        }
    }
}
