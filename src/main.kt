//paradigma procedural

fun main() {
    println("Bem vindo ao ByteBank!")
    val contaAlex = Conta()
    contaAlex.titular = "Alex"
    contaAlex.numero = 1000
    contaAlex.saldo = 200.0

    val contaFran = Conta()
    contaFran.titular = "Fran"
    contaFran.numero = 1001
    contaFran.saldo = 300.0

    println (contaAlex.titular)
    println (contaAlex.numero)
    println (contaAlex.saldo)
    println()
    println(contaFran.titular)
    println(contaFran.numero)
    println(contaFran.saldo)
    println()
    println("Depositando na conta do Alex")
    deposita(contaAlex,valor=50.0)
    println(contaAlex.saldo)

    println("Depositando na conta da Fran")
    deposita(contaFran,valor=70.0)
    println(contaFran.saldo)



//    testaCondicoesIfWhen(saldo)
//    testaFor()
//    testaWhile()
//    loopBreakContinue()

}

class Conta {
    var titular = ""
    var numero = 0
    var saldo = 0.0
}

fun deposita (conta: Conta, valor: Double){
    conta.saldo+= valor
}

fun testaCopiaseReferencias(){
    //aqui o numeroX não é alterado por ser um primitivo
    val numeroX =10
    var numeroY = numeroX
    numeroY++
    println(numeroX)
    println(numeroY)

    //aqui por se tratar de referências e apontar para mesma o que alterar em um altera no outro
    val contaJoao = Conta()
    contaJoao.titular= "João"

    var contaMaria = contaJoao //correto: var contaMaria = Conta()
    contaMaria.titular = "Maria"

    println("titular conta joao: ${contaJoao.titular}")
    println()
    println("titurla conta maria: ${contaMaria.titular}")
}

fun loopBreakContinue() {
    loop@ for (i in 1..100) {
        println("i $i")
        for (j in 1..100) {
            println("j $j")
            if (j == 5) break@loop
        }
    }
}

fun testaWhile() {

    var i = 0
    while (i < 5) {
        val titular = "Keillani $i"
        val numeroConta = 1000 + i
        var saldo = 100 + i

        println("titular $titular")
        println("numero conta $numeroConta")
        println("saldo $saldo")
        println()
        i++
    }
}

fun testaFor() {
    for (i in 1..5) {
        val titular: String = "Keillani $i"
        val numeroConta: Int = 1000 + i
        var saldo = 100 + i

        println("titular $titular")
        println("numero conta $numeroConta")
        println("saldo $saldo")
        println()
    }

    for (i in 5 downTo 1) {

        val titular = "Keillani $i"
        val numeroConta = 1000 + i
        var saldo = 100 + i

        println("titular $titular")
        println("numero conta $numeroConta")
        println("saldo $saldo")
        println()
    }

    for (i in 1..5 step 2) {

        val titular = "Keillani $i"
        val numeroConta = 1000 + i
        var saldo = 100 + i

        println("titular $titular")
        println("numero conta $numeroConta")
        println("saldo $saldo")
        println()
    }

    for (i in 1 until 5) {

        val titular = "Keillani $i"
        val numeroConta = 1000 + i
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
