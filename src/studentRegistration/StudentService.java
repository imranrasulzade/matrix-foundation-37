package studentRegistration;

import java.util.Scanner;

/**
 * Menu capa verilir ve menunu daxil edirik
 * daxil etdiyimize uygun isleyir mes: 1 register secdimse
 * register:
 * birinci how many student?
 * daxil olunan reqemi arrayin uzunluguna vererek hemin olcude studentleri saxlamaq ucun array yaratmis olursuz.
 * hemin arrayin uzunlugu qeder dovr eletdirerek her defesinde yeni obyekt yaradib doldurub onu
 * arrayin muvafiq indexine set etmek lazimdir
 *
 */


public class StudentService {

    static Scanner sc = new Scanner(System.in);


    void register() {
        int len = Utility.requireNumber("How many students do you want to register?");
        Student[] tempArray = null;
        if (Data.students != null) {
            len = len + Data.students.length;
            tempArray = Data.students;
        }
        Data.students = new Student[len];
        if (tempArray != null) {
            for (int i = 0; i < tempArray.length; i++) {
                Data.students[i] = tempArray[i];
            }
        }
        int i = tempArray == null ? 0 : tempArray.length;

        for (; i < len; i++) {
            System.out.println(i + 1 + ". registration");
            Data.students[i] = fillAndGetStudent();
        }
    }


    void printAll() {
        int i = 1;
        for (Student st : Data.students) {
            if (st == null) continue;

            System.out.print(i + ". ");
            st.printData();
            i++;
        }
    }


    void search() {
        System.out.println("Enter search data: ");
        String text = sc.next();
        for (Student st : Data.students) {
            if (st == null) continue;

            String trimmedLower = text.trim().toLowerCase();

            if (st.name.toLowerCase().contains(trimmedLower)
                    || st.surname.toLowerCase().contains(trimmedLower)) {
                st.printData();
            }
        }
    }

    void delete() {
        StudentService service = new StudentService();
        service.printAll();
        int deleteIndex = Utility.requireNumber("Enter delete number");
        Data.students[deleteIndex - 1] = null;
    }

    void update() {
        printAll();
        int index = Utility.requireNumber("hansini update etmek isteyirsen?") - 1;
        System.out.println("Neleri? mes: name,surname,age,group");
        sc.next();
        String searchParamsText = sc.nextLine();
        System.out.println();

        String[] searchParams = searchParamsText.split(",");
        for (String param : searchParams) {
            if (param.trim().equalsIgnoreCase("name")) {
                System.out.println("Enter name");
                Data.students[index].name = sc.next();
            } else if (param.trim().equalsIgnoreCase("surname")) {
                System.out.println("Enter surname");
                Data.students[index].surname = sc.next();
            } else if (param.trim().equalsIgnoreCase("age")) {
                System.out.println("Enter age");
                Data.students[index].age = sc.nextInt();
            } else if (param.trim().equalsIgnoreCase("group")) {
                System.out.println("Enter group");
                Data.students[index].group = sc.nextInt();
            }
        }
    }


    Student fillAndGetStudent() {
        System.out.println("Enter name:");
        String name = sc.next();
        System.out.println("Enter surname:");
        String surname = sc.next();
        int age = Utility.requireNumber("Enter age:");
        int group = Utility.requireNumber("Enter group:");
        return new Student(name, surname, age, group);
    }
}
