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
        System.out.println(box[0] + ", " + box[1] + ", " + box[2]);
        System.out.println(box1[0] + ", " + box1[1] + ", " + box1[2]);
        System.out.println(Arrays.toString(box2));

// Задание 3
        System.out.println(box[2] + ", " + box[1] + ", " + box[0]);
        System.out.println(box1[2] + ", " + box1[1] + ", " + box1[0]);
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
                chet = box[i] + 1;
            } else {
                chet = box[i];
            }
            System.out.print(chet + " ");
        }
    }
}