class Student (_name: String, _mark: Double) { // ��������� ����������� // ����� ����� ������ ����� �����������
// ��� ������������� ����� �������� // ����������� �������� ��� ������ ��� ������ ������

    val name: String
    val mark: Double
    var surname: String? = null
    init { // ���� �������������
        name = _name
        mark = _mark

    }

    constructor(_name: String, _mark: Double, _surname: String): this (_name, _mark) { // ��������� �����������,
        // ����������� ����������� �������� ������ constructor

        surname = _surname
    }

}