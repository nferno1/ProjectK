class Student (_name: String, _mark: Double) { // первичный конструктор // любой класс котлин имеет конструктор
// для инициализации своих объектов // конструктор доступен для вызова под именем класса

    val name: String
    val mark: Double
    var surname: String? = null
    init { // блок инициализации
        name = _name
        mark = _mark

    }

    constructor(_name: String, _mark: Double, _surname: String): this (_name, _mark) { // вторичный конструктор,
        // конструктор объявляется ключевым словом constructor

        surname = _surname
    }

}