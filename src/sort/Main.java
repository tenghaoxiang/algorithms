package sort;

import java.util.Scanner;

public class Main {

    public static <T extends Comparable<? super T>> void main(String[] args) {

        Scanner input = new Scanner(System.in);
        int length = input.nextInt();
        T[] array = (T[])new Comparable[length];
        for (int i = 0; i < length; i++) {
            String s = input.next();
            try {
                array[i] = (T)Integer.valueOf(s);
            }catch (NumberFormatException e){
                try {
                    array[i] = (T) Double.valueOf(s);
                } catch (NumberFormatException e1) {
                    array[i] = (T) s;
                }
            }
        }
        input.close();
        MergeSortDownUp.mergeSortDownUp(array);
        for (T t : array) {
            System.out.print(t + " ");
        }

    }

}
