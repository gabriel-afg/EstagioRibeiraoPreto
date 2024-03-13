class Fibonacci {
    fun IsInFibonacci(number: Int): Boolean {

        if(number == 0 || number == 1){
            return true
        }

        var x = 0
        var y = 1
        while (y < number) {
            val aux = x  // Variavel auxiliar
            x = y
            y += aux
        }

        return number == y // Retornar True caso o ultimo elemento da soma for igual ao número no parâmetro
    }
}