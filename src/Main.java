public class Main {
    public static void main(String[] args) {

        // task 1 - 2

        System.out.println("Задача 1 - 2");
        int [] simply = new int [3];
        simply[0] = 1;
        int q = simply[0];
        simply[1] = 2;
        int w = simply[1];
        simply[2] = 3;
        int e = simply[2];

        System.out.println("массив 1 = " + q + ", массив 2 = " + w + " массив 3 = " + e);

        double [] simply2 = { 1.57, 7.654, 9.986};

        System.out.print(simply2 [0]);
        System.out.print(", ");
        System.out.print(simply2 [1]);
        System.out.print(", ");
        System.out.print(simply2 [2]);

        // task 3

        System.out.println(" ");
        System.out.println("Задача 3");
        int [] simply4 = new int [3];
        simply4[0] = 1;
        int a = simply4[0];
        simply4[1] = 2;
        int s = simply4[1];
        simply4[2] = 3;
        int d = simply4[2];

        System.out.println("массив 3 = " + d + ", массив 2 = " + s + " массив 1 = " + a);

        double [] simply5 = { 1.57, 7.654, 9.986};

        System.out.print(simply2 [2]);
        System.out.print(", ");
        System.out.print(simply2 [1]);
        System.out.print(", ");
        System.out.print(simply2 [0]);

        // task 4

        System.out.println("Задача 4");
        int[] simply6 = {1, 2, 3};
        for (int i = 1; i <= simply6.length; i = i + 1) {
            if (i <= simply6.length + 1) {
                System.out.println(simply6[i]);
                break;

            }


        }
    }
}
