package app;

public class main_student {
    public static  void main(String[] args){
        Student student1 = new Aspirant("Объект","типа Student","ссылается на Aspirant?",4);
        Student[] student = new Student[4];
        student[0] = new Student("Ivan", "Ivanov", "a111", 5); //отличник-студент, стипендия д.б. = 100
        student[1] = new Student("Petr", "Petrov", "b222", 4.2); //обычный студент, стипендия д.б. = 80
        student[2] = new Aspirant("Vlad", "Sokolov", "c333", 5); //отличник-аспирант, стипендия д.б. = 200
        student[3] = new Aspirant("Anton","Rut", "d444",4.05); //обычный аспирант, стипендия д.б. = 180
        System.out.println(student[0].getScholarship());
        System.out.println(student[1].getScholarship());
        System.out.println(student[2].getScholarship());
        System.out.println(student[3].getScholarship());
        System.out.println(student1.getScholarship()); //проверка ссылки
    }
}
