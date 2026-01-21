package studentRegistration;

public class Student {
    String name;
    String surname;
    int age;
    int group;

    Student(String name, String surname, int age, int group) {
        this.name = name;
        this.surname = surname;
        this.age = age;
        this.group = group;
    }


    void printData() {
        System.out.println(this.name + " " + this.surname + " " + this.age + " " + this.group);
    }

}
