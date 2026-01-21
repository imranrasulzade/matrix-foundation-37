public class Second {

    static void printPerson(Person p) {
        System.out.println(p.name);
        System.out.println(p.surname);
        System.out.println(p.age);
        System.out.println(p.gender ? "Qadin" : "Kishi");
    }

    public static void main(String[] args) {

        Person p1 = new Person();
        p1.name = "Maryam";
        p1.surname = "Mammadova";
        p1.age = 24;
        p1.gender = true;

        p1.run();

        printPerson(p1);




    }
}
