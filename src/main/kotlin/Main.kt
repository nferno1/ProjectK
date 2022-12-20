fun main(args: Array<String>) {
    println("kotlin is a programing laguage".countSimbols())

  // имя класса: тип-получатель
  // значение: объкт-получатель
}

fun String.countSimbols(): Int = length - replace("a" , "").length



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