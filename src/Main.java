import java.util.Scanner;


public class Main {


    public static void main(String[] args) {

        System.out.println("Hello");

        Scanner sc = new Scanner(System.in);
        boolean shert = true;
        while (shert) {
            System.out.println("""
                    1. topla
                    2. cix
                    3. vur
                    4. bol
                    5. exit
                    """);

            int menu = sc.nextInt();
            int a = sc.nextInt();
            int b = sc.nextInt();
            switch (menu) {
                case 1:
                    System.out.println(a + b);
                    break;
                case 2:
                    System.out.println(a - b);
                    break;
                case 3:
                    System.out.println(a * b);
                    break;
                case 4:
                    System.out.println((double) a / b);
                    break;
                case 5:
                    shert = false;
                    break;
            }
        }


    }

}