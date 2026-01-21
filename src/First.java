public class First {

    /**
     * Çarpazdan aşağı 0, yuxarı 1 olsun (üst üçbucaq = 1, alt üçbucaq = 0) kvadrat olcusunde 2 olculu arrayde
     *
     */
    public static void main(String[] args) {

        int[][] matrix = new int[4][4];

        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[i].length; j++) {
                if (i <= j) {
                    matrix[i][j] = 1;
                } else {
                    matrix[i][j] = 0;
                }
            }
        }

        for (int i = 0; i < matrix.length; i++) { // sətirlər
            for (int j = 0; j < matrix[i].length; j++) { // sütunlar
                System.out.print(matrix[i][j] + " ");
            }
            System.out.println(); // her setirden sonra alt setire dusmek
        }




    }


}



