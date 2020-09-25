/* Класс Phone.
Создайте класс Phone, который содержит переменные number, model и weight.
Создайте три экземпляра этого класса.
Выведите на консоль значения их переменных.
Добавить в класс Phone методы: receiveCall, имеет один параметр – имя звонящего. Выводит на консоль сообщение “Звонит {name}”. getNumber – возвращает номер телефона. Вызвать эти методы для каждого из объектов.
Добавить конструктор в класс Phone, который принимает на вход три параметра для инициализации переменных класса - number, model и weight.
Добавить конструктор, который принимает на вход два параметра для инициализации переменных класса - number, model.
Добавить конструктор без параметров.
Вызвать из конструктора с тремя параметрами конструктор с двумя.
Добавьте перегруженный метод receiveCall, который принимает два параметра - имя звонящего и номер телефона звонящего. Вызвать этот метод.
Создать метод sendMessage с аргументами переменной длины. Данный метод принимает на вход номера телефонов, которым будет отправлено сообщение. Метод выводит на консоль номера этих телефонов.
*/

package app;

public class Phone {
    private String number;
    private String model;
    private int weight;

    public Phone(String n, String m, int w) {
        this(n, m);
        //this.number = n;     предыдущий шаг выполнения
        //this.model = m;
        this.weight = w;
    }

    public Phone(String n, String m) {
        this.number = n;
        this.model = m;
    }

    public Phone() {
        this.number = null;
        this.model = null;
        this.weight = 0;
    }

    public static void receiveCall(String aName) {
        System.out.println("Звонит " + aName);
    }

    public static void receiveCall(String aName, String aNumber) {
        System.out.println("Имя звонящего: " + aName + "Номер звонящего: " + aNumber);
    }

    public String getNumber() {
        return this.number;
    }

    public static void sendMessange(String... numbers) {
        System.out.println("Номера телефонов: ");

        for(int i = 0; i < numbers.length; ++i) {
            System.out.println(numbers[i]);
        }

    }

    public static void main(String[] args) {
        Phone phone1 = new Phone("88005553535", "iphone 7", 150);
        phone1.getNumber();
        receiveCall("Anna");
        receiveCall("Anna ", "88006663636");
        Phone phone2 = new Phone("88005553536", "lg");
        System.out.println(phone2.getNumber());
        Phone phone3 = new Phone();
        System.out.println(phone3.getNumber());
        sendMessange("123456", "234561", "3456123");
    }
}
