import java.util.Scanner;
import  java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        int[] list = {56, 34, 1,8, 101, -2, -33};

        Arrays.sort(list);

        System.out.println(Arrays.toString(list));

        Scanner sc = new Scanner(System.in);
        System.out.print("Sayi giriniz: ");
        int number = sc.nextInt();

        int min = list[0];
        int max = list[0];

        for (int i : list) {
            if (i < min) {
                min = i;
            }
            if (i > max) {
                max = i;
            }
        }

        System.out.println("\nGirilen Sayi: " + number);
        if (number < min) {
            System.out.println("Girilen sayidan daha küçük bir sayi yok!");
            System.out.println("En yakın büyük sayi : " + min);
        }
        if (number > max) {
            System.out.println("En yakın küçük sayi : " + max);
            System.out.println("Girilen sayidan daha büyük bir sayi yok!");
        }
        if (number >= list[0]) {
            for (int i = 0; i < list.length; i++) {
                if (number == min) {
                    System.out.println("Girilen sayidan daha küçük bir sayi yok!");
                    System.out.println("En yakın büyük sayi : " + list[1]);
                    break;
                }
                if (number == max) {
                    System.out.println("En yakın küçük sayi :" + list[list.length - 2]);
                    System.out.println("Girilen sayidan daha büyük bir sayi yok!");
                    break;
                }
                if (number < list[i]) {
                    System.out.println("En yakın küçük sayi :" + list[i - 1]);
                    System.out.println("En yakın büyük sayi : " + list[i]);
                    break;
                }
            }
        }


    }
}
