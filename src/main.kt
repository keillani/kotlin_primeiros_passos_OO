//paradigma procedural

fun main() {
    println("Bem vindo ao ByteBank!")
    val contaAlex = Conta(titular = "Alex", numero = 1000) //podemos utilizar labels para deixar o cod idiomatico
//    contaAlex.titular = "Alex"
//    contaAlex.numero = 1000
    contaAlex.deposita(200.0)

    val contaFran = Conta(titular = "Fran", numero = 1001)
//    contaFran.titular = "Fran"
//    contaFran.numero = 1001
    contaFran.deposita(300.0)

    println(contaAlex.titular)
    println(contaAlex.numero)
    println(contaAlex.saldo)
    println()
    println(contaFran.titular)
    println(contaFran.numero)
    println(contaFran.saldo)
    println()
    println("Depositando na conta do Alex")
    contaAlex.deposita(valor = 50.0)
    println(contaAlex.saldo)

    println("Depositando na conta da Fran")
    contaFran.deposita(valor = 70.0)
    println(contaFran.saldo)

    println("Sacando na conta do Alex")
    contaAlex.saca(valor = 250.0)
    println(contaAlex.saldo)

    println("Sacando na conta da Fran")
    contaFran.saca(100.0)
    println(contaFran.saldo)

    println("Saque em excesso conta Alex")
    contaAlex.saca(100.0)
    println(contaAlex.saldo)

    println("Saque em excesso conta Fran")
    contaFran.saca(50.0)
    println(contaFran.saldo)

    println("Transferência da conta da Fran para conta do Alex")
//    if( contaFran.transfere(300.0, contaAlex)) {
    if (contaFran.transfere(destino = contaAlex, valor = 300.0)) {
        println("Transferência sucedida")
    } else {
        println("Falha na transferência")
    }
    println(contaAlex.saldo)
    println(contaFran.saldo)


//    testaCondicoesIfWhen(saldo)
//    testaFor()
//    testaWhile()
//    loopBreakContinue()

}

class Conta(
    var titular: String,
    val numero: Int
) { // contrutor primario
    //    var titular = ""
//    var numero = 0
    var saldo = 0.0
        private set //com properties apenas escrevemos o comportamento diferente quando for necessário
//    private var saldo = 0.0 //restringir e encapsular acesso de atributos com modificador de acesso private

    init {
        println("passando pelo contrutor init $titular")
    }

    //método deposita
    fun deposita(valor: Double) {
        if (valor > 0) {
            this.saldo += valor
        }
    }

    //método saca
    fun saca(valor: Double) {
        if (saldo >= valor) {
            saldo -= valor
        }
    }

    //método transfere
    fun transfere(valor: Double, destino: Conta): Boolean {
        if (saldo >= valor) {
            saldo -= valor
            destino.deposita(valor) //reutilizar código da propria classe
            return true
        }
        return false
    }

//    fun getSaldo() : Double{
//        return saldo
//    }
//
//    fun setSaldo(valor: Double){
//        if(valor > 0) {
//            saldo = valor
//        }
//    }
}


fun testaCopiaseReferencias() {
    //aqui o numeroX não é alterado por ser um primitivo
    val numeroX = 10
    var numeroY = numeroX
    numeroY++
    println(numeroX)
    println(numeroY)

    //aqui por se tratar de referências e apontar para mesma o que alterar em um altera no outro
    val contaJoao = Conta("João", 1002)
//    contaJoao.titular = "João"

    var contaMaria = Conta("Maria", 1003)
//    var contaMaria = contaJoao //correto: var contaMaria = Conta()
//    contaMaria.titular = "Maria"

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
