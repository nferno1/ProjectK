import java.time.Year

class Virus (val name: String, val year: Int, val sick: Long = 0L) {

    fun printVirus (){
        println("Virus: $name, year: $year, sick people: $sick")// методы в классе
    }

    fun isVaccineFound() = println((year > 1918) and (year < 2016))


}