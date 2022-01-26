fun main(args: Array<String>) {
    println("Hello World!")

    // Try adding program arguments via Run/Debug configuration.
    // Learn more about running applications: https://www.jetbrains.com/help/idea/running-applications.html.
    println("Program arguments: ${args.joinToString()}")
}
//1.- ¿Qué es un constructor y para qué lo usamos ?
// Un constructor es un elemento de una clase cuyo identificador coincide con el de dicha clase y
// se usa para obligar a controlar cómo lo inicializa al llamarlo.
//2.- ¿Cuantos tipos de constructores nos podemos encontrar en kotlin y diferencias?
// El principal y los secundarios, el principal obligas a una base de pasar los atributos que se atribuya,
// y los secundarios ofrecen formas alternativas de pasar distintos tipos de atributos o mayor cantidad,
// puede haber muchos secundarios pero solo un principal
//3.- ¿¡De qué manera afecta y como hay que usar los constructores en la herencia?
// El constructor de las clases heredadas deberá de tener sus propios atributos respecto a la clase padre,
// aunque puede acceder a los atributos manifestados al inicializar una clase padre y luego definirla en una hija,
// ya que siempre compartirán atributos