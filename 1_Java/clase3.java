
// Creando Arrays
import java.util.Scanner;
//import java.util.Arrays;
public class clase3 {
    public static void main(String[] args) {
        int[] array = new int [5];
        //int[] array = {1,2,3,4};
        // array[0] = 5;
        // array[1] = 15;
        // array[2] = 25;
        // array[3] = 35;
        // array[4] = 45;

        // System.out.println(array[1]);
        // System.out.println(array[2]);
        // System.out.println(array.length);
        // System.out.println(Arrays.toString(array));
        Scanner input = new Scanner(System.in);

        for (int i = 0; i < array.length; i++) {
           //System.out.println(array[i]);
           int valor = input.nextInt();
           array[i] = valor;
        }
        int e = 0;
        while (e<array.length){
            System.out.println(array[e]);
            e++;
        }

        input.close();


    }
}
