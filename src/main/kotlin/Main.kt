import Components.Fibonacci
import Components.StringInverter

fun main() {

    val fibonacci = Fibonacci()
    val stringInverter = StringInverter()

    // Fibonacci
    val numbers = arrayOf(1, 5, 9, 13, 25, 34) // Numeros de testes

    for (number in numbers) {
        if(fibonacci.IsInFibonacci(number)){
            println("O número $number pertence a sequência de Components.Fibonacci")
        }
        else {
            println("O número $number não pertence a sequência de Components.Fibonacci")
        }
    }

    //

    println("---------------")

    // Inverter caracteres String

    val original = "Hello world"
    println("String original: $original")
    println("String invertida: ${stringInverter.invertString(original)}")

    //

}