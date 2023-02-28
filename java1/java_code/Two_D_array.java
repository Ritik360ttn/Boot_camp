public class Two_D_array {


    public static void row_sum(int a[][]) {

        int sum = 0;

        for (int i = 0; i < a.length; i++) {
            for (int j = 0; j < a[0].length; j++) {

                sum += a[i][j];
            }
            System.out.println("sum of row " + (i + 1) + " is: " + sum);
            sum = 0;
        }

    }

    public static void col_sum(int a[][]) {

        int sum = 0;
        System.out.println();
        for (int i = 0; i < a[0].length; i++) {
            for (int j = 0; j < a.length; j++) {

                sum += a[j][i];
            }
            System.out.println("sum of col " + (i + 1) + " is: " + sum);
            sum = 0;
        }

    }

    public static void main(String[] args) {

        int arr1[][] = {{1, 2, 3, 10}, {4, 5, 6, 11}, {7, 8, 9, 12},};

        row_sum(arr1);
        col_sum(arr1);


    }
}

