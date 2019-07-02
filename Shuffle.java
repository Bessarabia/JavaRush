import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.ArrayList;


/*
В убывающем порядке
*/

public class Shuffle{
	public static void main(String[] args) throws Exception {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        int dim = 20;
        int[] array = new int[dim];
        for (int i = 0; i < dim; i++) {
            array[i] = Integer.parseInt(reader.readLine());
        }

        Arrays.sort(array);

        sort(array);

        for (int x : array) {
            System.out.println(x);
        }
    }

    public static void sort(int[] array) {
        //напишите тут ваш код
        for(int i = 0; i < array.length/2; i++){
            int buf = array[array.length-i-1];
            array[array.length-i-1] = array[i];
            array[i] = buf;
        }

    }
}