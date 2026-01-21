package studentRegistration;

import java.util.Scanner;

public class Utility {

    static int requireNumber(String message) {
        System.out.println(message);
        Scanner scanner = new Scanner(System.in);
        return scanner.nextInt();
    }

}
