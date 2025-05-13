fun main() {
    // 0. Hola Mundo!
    println("Hola Mundo!")

    // 1. Variables
    // Variable Mutable (var)
    var user01 = "Juan"
    user01 = "Pedro"

    // Variable Inmutable (val)
    val anios = 30
    // anios = 31 > Error no se puede reasignar

    // 2. Tipos de Datos
    val user: String = "Elioshem"
    val age: Int = 32
    val height: Double = 1.75
    val student: Boolean = true

    // 3. Funciones
    fun greet(name: String): String {
        return "Hola, $name"
    }

    var greeting = greet("Elio")
    greeting = greet("Jeshua")

    println(greeting)

    // 4. Condicionales
    var ageUser01: Int = 21
    ageUser01 = 15

    if (ageUser01 >= 18) {
        println("El usuario es mayor de edad")
    } else if (ageUser01 >= 13 && ageUser01 < 18) {
        println("El usuario un adolescente")
    } else {
        println("El usuario No es mayor de edad")
    }

    // 5. When(switch)
    val day = 3
    val nameDay = when(day) {
        1 -> "Lunes"
        2 -> "Martes"
        3 -> "Miercoles"
        else -> "Desconocido"
    }

    println(nameDay)

    //6. Bucles
    // For
    for (i in 1..5) (
        println(i)
    )

    // While
    var j = 1
    while (j <= 5) {
        println(j)
        j++
    }

    //7. OOP
    // Clases y Objetos
    class Persona(val nombre: String, var edad: Int) {
        fun presentarse() {
            println("Soy $nombre y tengo $edad años")
        }
    }

    val persona01 = Persona("ElioDev", 25)
    persona01.presentarse()

    // 8. Data class
    data class Usuario(val id: Int, val nombre: String)

    val user1 = Usuario(1, "Carlos")
    println(user1)

    // 9. Null safety
    var userExample: String? = null

    // Usar safe call
    // Devuelve la longitud si es String y Null si no tiene nada
    println(userExample?.length)

    // Elvis operator
    // Sirve para dar valores por defecto (0) en caso devuelva Null
    val longitud = userExample?.length ?: 0
    println(longitud)

    // 10. Listas, Mapas y Sets
    val lista = listOf("a", "b", "c") // inmutable
    val listaMutable = mutableListOf("a", "b")
    listaMutable.add("c")

    val mapa = mapOf(1 to "Uno", 2 to "Dos") // inmutable
    val mapaMutable = mutableMapOf(1 to "Uno")
    mapaMutable[2] = "Dos"

    val conjunto = setOf("x", "y", "z") // inmutable
    val conjuntoMutable = mutableSetOf("x", "y")
    conjuntoMutable.add("z")

    // 11. Lambdas
    val suma = { a: Int, b: Int -> a + b }
    println(suma(2, 3))

    // 12. Coroutines
    /*

     import kotlinx.coroutines.*


    fun main() = runBlocking {
        launch {
            delay(1000L)
            println("Mundo")
        }
        println("Hola")
    }

     */


    // 14. Smart Casting
    fun longitud(obj: Any): Int {
        if (obj is String) {
            return obj.length // Kotlin lo castea automáticamente
        }
        return 0
    }

    // 15. Operators
    val a = 10
    val b = 5
    val suma = a + b
    val resta = a - b
    val mult = a * b
    val div = a / b
    val mod = a % b

    // 16. Ranges and Filters
    val numeros = (1..10).filter { it % 2 == 0 }
    println(numeros) // [2, 4, 6, 8, 10]

    // 17. Objetos Singleton
    object MiSingleton {
        val version = "1.0"
        fun saludar() = println("Hola desde singleton")
    }

    MiSingleton.saludar()

    // 18. Companion Objects
    class Util {
        companion object {
            fun sum(a: Int, b: Int) = a + b
        }
    }

    val resultado = Util.sum(3, 4)

}

