fun main() {

    val ebola = Virus ("Ebola", 2013, 28640)
    ebola.printVirus()
    ebola.isVaccineFound()
    val covid19 = Virus ("Covid 2019", 2019, 1_003_159)
    covid19.printVirus()
    covid19.isVaccineFound()

}

  /* val ivan: Student = Student("Ivan", 80.5)
    println(ivan.name + "mark: " + ivan.mark)

    val petr: Student = Student("Petr", 80.3, "Petrov")
    println(petr.name + " " + petr.surname + " mark: " + petr.mark )
*/


/*fun printPrefix(vararg words: String, prefix: String){
    for (m in words)
        println(prefix + m)

}

fun main(args: Array<String>) {

    printPrefix("one", "two", "there", "four", "five", prefix = "number: ")




}*/ // задача 4
    /*println(isLetter('g'))
    println(isLetter('5'))
    println(checkNumber('5'))
}

fun isLetter (c: Char) = c in 'a'..'z' || c in 'A'..'Z'
fun checkNumber (c: Char) = c !in '0'..'9'*/ // задача 2

/*for (sum in 'a'..'f') {

    println(sum)

}*/// задача 1




/* \\infix
    println(1 sum 2)
    println(1.sum(2))

    println(1 big 3)
    println(3.big(2))

}

infix fun Int.big(value:Int): Boolean = this > value

infix fun Int.sum(i: Int) = this + i*/

   /* println("kotlin is a programing laguage".countSimbols())

  // имя класса: тип-получатель
  // значение: объект-получатель
}

fun String.countSimbols(): Int = length - replace("a" , "").length
*/


/*//it

    val student: (String) -> String = {
        val age = 20
        "Меня зовут $it, мне $age лет"

    }
    println(student("Иван"))*/


   /* val doubling: (Int) -> Int = {it * it} //{x -> x * x} - it вместо x -
    // можно использовать в качестве переменной если параметр всего 1 // в фигурных скобках тело лямбда выражения
    println(doubling(5))
*/

//}


   /*val exam = { println("Excellent!") } // лямбда
    exam()
    exam()

    val programming ={ println("Kotlin") }
    val description = programming()

   *//* val sum: (Int , Int) -> Int = {x , y -> x + y}
    // приведение к лямбда выражению от параметров x и y ->
    println(sum(5,10))
    println(sum(7,9))
*//*
}

fun some() : Unit { // тип юнит

}*/