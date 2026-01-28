package studentRegistration;

import java.util.Scanner;

public class Main {
    static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {
        boolean running = true;
        while (running) {


            int menu = Utility.requireNumber("""
                1. Register
                2. Show all
                3. Search
                4. Delete
                5. Partial Update
                6. Exit
                """);

            StudentService service = new StudentService();
            switch (menu) {
                case 1: {
                    service.register();
                    break;
                }
                case 2: {
                    service.printAll();
                    break;
                }
                case 3: {
                    service.search();
                    break;
                }
                case 4: {
                    service.delete();
                    break;
                }
                case 5: {
                    service.update();
                    break;
                }
                case 6: {
                    running = false;
                    break;
                }
            }
        }
    }



}
