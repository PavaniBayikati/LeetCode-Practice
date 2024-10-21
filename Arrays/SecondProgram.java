import java.util.*;

public class SecondProgram {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the size of the array:-");

        int size = sc.nextInt();// array

        int[] array1 = new int[size];
        for (int i = 0; i < size; i++) {
            array1[i] = sc.nextInt();
        }
        int[] array2 = new int[size];
        for (int i = 0; i < size; i++) {
            array2[i] = array1[i];
        }
        System.out.print("The first array elements are:-");
        for (int i = 0; i < size; i++) {
            System.out.println(array1[i]);
        }
        System.out.print("The second array elements are:-");
        for (int i = 0; i < size; i++) {
            System.out.println(array2[i]);
        }
        System.out.println("The reversed second array is:-");
        int[] reversedarray = new int[size];
        for (int i = 0; i < size; i++) {
            reversedarray[i] = array2[size - 1 - i];
            System.out.println(reversedarray[i]);
        }

    }
}