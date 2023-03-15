import java.util.Scanner;
class Person {
    private String surname;
    private String name;
    private int age;
    public void setSurname(String surname) {
        this.surname = surname;
    };
    public void setName(String name) {
        this.name = name;
    };
    public void setAge(int age) {
        this.age = age;
    };
    public String getSurname() {
        return surname;
    };
    public String getName() {
        return name;
    };
    public int getAge() {
        return age;
    };
    public void printInfo() {
        System.out.println("Person " + getSurname() + " " + getName() + ", age: " + getAge());
    };
};
class Student extends Person {
    private int group;
    private int cardNumber;

    public void setGroup(int group) {
        this.group = group;
    };
    public void setCardNumber(int cardNumber) {
        this.cardNumber = cardNumber;
    };
    public int getGroup() {
        return group;
    };

    public int getCardNumber() {
        return cardNumber;
    };
    @Override
    public void printInfo() {
        System.out.println("Student of " + getGroup() + " group " + getSurname() + " " + getName() +
                ", age: " + getAge() + ". \nStudent's card number: " + getCardNumber());

    };
};
class Lecturer extends Person {
    private String chair;
    private int salary;
    public void setChair(String chair) {
        this.chair = chair;
    };
    public void setSalary(int salary) {
        this.salary = salary;
    };
    public float getSalary() {
        return salary;
    };
    public String getChair() {
        return chair;
    };
    @Override
    public void printInfo() {
        System.out.println("Lecturer of " + getChair() + " chair " + getSurname() + " " + getName() +
                ", age: " + getAge() + ". \nSalary: " + getSalary());
    };
};
public class Main {
    public static void main(String [] args) {
        System.out.println("Enter info about person:");
        Scanner in = new Scanner(System.in);
        Person[] people = new Person[9];
        System.out.println("Students:");
        for (int i = 0; i < 3; i++) {
            Person student = new Student();
            System.out.println("Enter surname: ");
            student.setSurname(in.next());
            System.out.println("Enter name: ");
            student.setName(in.next());
            System.out.println("Enter age: ");
            student.setAge(in.nextInt());
            System.out.println("Enter group: ");
            Student student1 = (Student) student;
            student1.setGroup(in.nextInt());
            System.out.println("Enter Student's card number: ");
            student1.setCardNumber(in.nextInt());
            people[i] = student;
        };
        System.out.println("Lecturers:");
        for (int i = 3; i < 6; i++) {
            Person lecturer = new Lecturer();
            System.out.println("Enter surname: ");
            lecturer.setSurname(in.next());
            System.out.println("Enter name: ");
            lecturer.setName(in.next());
            System.out.println("Enter age: ");
            lecturer.setAge(in.nextInt());
            System.out.println("Enter chair: ");
            Lecturer lecturer1 = (Lecturer) lecturer;
            lecturer1.setChair((in.next() + " " + in.next()));
            System.out.println("Enter salary: ");
            lecturer1.setSalary(in.nextInt());
            people[i] = lecturer;
        };
        System.out.println("Persons:");
        for (int i = 6; i < 9; i++) {
            Person person = new Person();
            System.out.println("Enter surname: ");
            person.setSurname(in.next());
            System.out.println("Enter name: ");
            person.setName(in.next());
            System.out.println("Enter age: ");
            person.setAge(in.nextInt());
            people[i] = person;
        };
        in.close();
        for (int i = 0; i < 9;i++) {
            people[i].printInfo();
        };
    };
}