import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.ArrayList;


/*
В убывающем порядке
*/

public class descending {
    public static void main(String[] args) throws Exception {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        
        int dim = 20;
        int[] array = new int[dim];
        
        for (int i = 0; i < dim; i++) {
            array[i] = Integer.parseInt(reader.readLine());
        }
        
        //Методом инвертирования массива
        
        for (int i = 0; i < array.length; i++){
            array[i] *= -1;
        }
        
        sort(array);

        for (int x : array) {
            System.out.println(x);
        }
    }

    public static void sort(int[] array) {
        //напишите тут ваш код
        Arrays.sort(array);
        for (int i = 0; i < array.length; i++){
            array[i] *= -1;
        }
    }
}