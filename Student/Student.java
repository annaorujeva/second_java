package app;
/*Создайте пример наследования, реализуйте класс Student и класс Aspirant, аспирант отличается от студента наличием некой научной работы.
Класс Student содержит переменные: String firstName, lastName, group. А также double averageMark, содержащую среднюю оценку.
Создать переменную типа Student, которая ссылается на объект типа Aspirant.
Создать метод getScholarship() для класса Student, который возвращает сумму стипендии. Если средняя оценка студента равна 5, то сумма 100, иначе 80.
Переопределить этот метод в классе Aspirant. Если средняя оценка аспиранта равна 5, то сумма 200, иначе 180.
Создать массив типа Student, содержащий объекты класса Student и Aspirant. Вызвать метод getScholarship() для каждого элемента массива.*/

public class Student {
    public String firstName;
    public String lastName;
    public String group;
    public double averageMark;

    public Student(String aFirstName, String aLastName, String aGroup, double aAverageMark){
        firstName = aFirstName;
        lastName = aLastName;
        group = aGroup;
        averageMark = aAverageMark;
    }
    public double getMark(){
        return averageMark;
    }
    public double getScholarship(){
        int sum_step = 80;
        if (this.averageMark == 5){
            sum_step = 100;
        }
        return sum_step;
    }
}
