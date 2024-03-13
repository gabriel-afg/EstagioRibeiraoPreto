package Components

class StringInverter {
    fun invertString(original: String): String {
        var invertida = ""
        for (i in original.length - 1 downTo 0) { // Criei um intervalo que vai do índice do último caractere (original.length - 1) até o índice do primeiro caractere (0)
            invertida += original[i]
        }
        return invertida
    }
}