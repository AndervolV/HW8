import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
// Задание 1
        int[] box = new int[3];
        box[0] = 1;
        box[1] = 2;
        box[2] = 3;

        double[] box1 = {1.57, 7.654, 9.986};

        char[] box2 = {'A', 'B', 'C', 'D', 'E', 'F'};

// Задание 2
        for (int i = 0; i < box.length; i++) {
            System.out.print(box[i]);
            if (i < box.length - 1)
                System.out.print(", ");
        }
        System.out.println();
        for (int i = 0; i < box1.length; i++) {
            System.out.print(box1[i]);
            if (i < box1.length - 1)
                System.out.print(", ");
        }
        System.out.println();

        System.out.println(Arrays.toString(box2));


// Задание 3
        for (int i = box.length-1; i >= 0; i--) {
            System.out.print(box[i]);
            if (i > 0) {
                System.out.print(", ");
            }
        }
        System.out.println();
        for (int i = box1.length-1; i >= 0; i--) {
            System.out.print(box1[i]);
            if (i > 0) {
                System.out.print(", ");
            }
        }
        System.out.println();

        for (int i = box2.length - 1; i >= 0; i--) {
            System.out.print(box2[i]);
            if (i > 0) {
                System.out.print(", ");
            }
        }
        System.out.println();
// Задание 4
        int chet;
        for (int i = 0; i < box.length; i++) {
            if (box[i] % 2 != 0) {
                box[i] = box[i] + 1;
                }
            System.out.print(box[i] + " ");
        }
    }
}