import java.util.Arrays;
import java.util.Scanner;

public class Third {

    /**
     * Natural ədədin onluq yazılışında rəqəmləri eyni olan və bu ədədin onluq
     * yazılışının mərkəzinə nəzərən simmetrik yerləşən cütlüklərin sayını həmin ədədin
     * simmetriya dərəcəsi adlandıracağıq. Əgər ədəddə hər hansı rəqəm onluq yazılışda ortada
     * yerləşirsə, onu da özü ilə bir cütlük kimi saymaq lazımdır. n ədədinin simmetriya dərəcəsini tapın.
     * input: 1235321
     * output: 4
     */

    static int getDigitCount(int number) {
        int numberLen = 0;
        while (number > 0) {
            numberLen++;
            number /= 10;
        }
        return numberLen;
    }

    static void fillArray(int orjNumber, int[] targetArray) {
        int i = 0;
        while (orjNumber > 0) {
            targetArray[i] = orjNumber % 10;
            orjNumber /= 10;
            i++;
        }
    }

    static void bonus() {
        Scanner scanner = new Scanner(System.in);
        int number = scanner.nextInt();
        int orjNumber = number;
        int numberLen = getDigitCount(number);


        int[] digits = new int[numberLen];

        fillArray(orjNumber, digits);

//        int left = 0;
//        int right = digits.length - 1;
//
        int symCount = 0;
//        while (left <= right) {
//            if (digits[left] == digits[right]) {
//                symCount++;
//            }
//            left++;
//            right--;
//        }
//
//        System.out.println(symCount);


        for (int y = 0; y < (digits.length + 1) / 2; y++) {
            if (digits[y] == digits[digits.length - 1 - y]) {
                symCount++;
            }
        }

        System.out.println(symCount);
    }

    public static void main(String[] args) {




    }
}
