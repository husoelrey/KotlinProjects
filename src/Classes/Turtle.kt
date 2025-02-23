package Classes

class Turtle(var name: String = "Hero Turtle", var age: Int = 5) {

    var tailColor: String = "Brown"
    var shellColor: String = "Green"
    var footCount: Int = 4
    var gender: String = "Female"
    var isMarried: Boolean = false

    init {
        println("Primary constructor created!!!")
    }

    constructor(isMarried: Boolean = true, shellColor: String) : this() {
        println("secondary constructor created!!!")
    }

    fun makeSound(): String {
        return "WrOg WrOg WrOg WrOg"
    }

    fun walk() {
        tailColor = "Black"
        name = "Hero Turtle"

        isMarried = true
        gender = "Male"
    }

    fun canSwim(): Boolean {
        return false
    }
}

fun main() {
    val t1:Turtle = Turtle()
    val t2: Turtle = Turtle("Tosbik", 12)
    val t3: Turtle = Turtle("Tosbik")
    val t4: Turtle = Turtle(age = 12)

    val t5: Turtle = Turtle(true, "Blue")
    //created by secondary constructor
    t5.age=5 //age, primary constructorda val olsaydı buna elleyemezdik
}







