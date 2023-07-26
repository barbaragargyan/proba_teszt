import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        System.out.println("Második feladat megoldása:");
        for (int i = 1; i < 20; i++) {
            if (i % 2 == 0 && i % 3 == 0) {
                System.out.print(i + ",");
            }
        }
        System.out.println();
        System.out.println();
        System.out.println("Harmadik feladat megoldása:");
        int[] array = {15, 20, 58, 13, 98, -18};

        System.out.println("A tömb tartalmaz negatív elemet? " + containsNegative(array));
        System.out.println();
        System.out.println("4. feladat megoldása");
        System.out.println("A tömb legnagyobb eleme: " + maxnumber(array));

        System.out.println();
        System.out.println("Az ötödik feladat megoldása:");
        int number = 2;
        int number2 = 2;
        System.out.println(number + " + " + number2 + " = " + Calculator.osszeAdas(number, number2));

        System.out.println();
        System.out.println("A hatodik feladat megoldása:");
        Scanner scanner = new Scanner(System.in);
        System.out.print("Add meg az sorok számot: ");
        int row = scanner.nextInt();
        System.out.print("Add meg a oszlopok számot: ");
        int column = scanner.nextInt();


        int[][] arr = new int[row][column];

        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[i].length; j++) {
                int kitevo = (i * column) + j;
                System.out.print((arr[i][j] = (int) Math.pow(3, kitevo)) + ", ");
                //System.out.print(kitevo + ". hatványa: " + (array[i][j] = (int) Math.pow(3, kitevo)) + ", ");
            }
            System.out.println();
        }
    }

    public static boolean containsNegative(int[] array) {
        for (int i = 0; i < array.length; i++) {
            if (array[i] < 0) {
                return true;
            }
        }
        return false;
    }

    public static int maxnumber(int[] cica) {
        int seged = cica[1];
        for (int i = 0; i < cica.length; i++) {
            if (cica[i] > seged) {
                seged = cica[i];
            }
        }
        return seged;

    }


}
