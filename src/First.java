public class First {

    public static void main(String[] args) {

        int number = 758;
        int sum = 0;
        int multiply = 1;
        while (number > 0) {
            sum += number % 10;
            multiply *= number % 10;
            number /= 10;
        }
        System.out.println(sum);
        System.out.println(multiply);


    }


}



