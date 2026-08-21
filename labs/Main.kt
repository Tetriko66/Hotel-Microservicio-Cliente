fun main() {
    val dispositivo: String = "Galaxy A55"
    var bateria: Int = 18
    var modoahorroenergia: Boolean = false
    val cargando = true

    println("Nombre del propietario")
    val nombrePropietarioInput =readLine()
    var nombrePropietario: String? = if (nombrePropietarioInput.isNullOrBlank()) null else nombrePropietarioInput

    println("=== TELÉFONO ===")
    println("Modelo: $dispositivo")
    println("Bateria: $bateria")
    println("Estado Bateria: ${obtenerEstadoBateria(bateria)}")
    println("Ahorro Energia: $modoahorroenergia")
    println("Modelo: ${nombrePropietario ?: "Sin Propietario"}")

    if(cargando){
        println("El teléfono está conectado al cargador")
    }
}

fun obtenerEstadoBateria(porcentaje :Int):String {
    return if (porcentaje >= 80) {
        "Bateria Alta"
    } else if (porcentaje in 20..79) {
        "Bateria suficiente"
    } else if (porcentaje <= 20){
        "Bateria baja"
    }else {
        "Sin bateria"
        }
}
