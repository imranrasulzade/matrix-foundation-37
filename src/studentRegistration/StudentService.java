package studentRegistration;

import java.util.Scanner;

/**
 * Menu capa verilir ve menunu daxil edirik
 * daxil etdiyimize uygun isleyir mes: 1 register secdimse
 * register:
 *  birinci how many student?
 *  daxil olunan reqemi arrayin uzunluguna vererek hemin olcude studentleri saxlamaq ucun array yaratmis olursuz.
 *  hemin arrayin uzunlugu qeder dovr eletdirerek her defesinde yeni obyekt yaradib doldurub onu
 *  arrayin muvafiq indexine set etmek lazimdir
 *
 */


public class StudentService {

    static Scanner sc = new Scanner(System.in);



    void register() {
        int len = Utility.requireNumber("How many students do you want to register?");
        Data.students = new Student[len];

        for (int i = 0; i < len; i++) {
            System.out.println(i + 1 + ". registration");
            Data.students[i] = fillAndGetStudent();
        }
    }


    void printAll() {
        int i = 1;
        for (Student st : Data.students) {
            System.out.print(i + ". ");
            st.printData();
            i++;
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
