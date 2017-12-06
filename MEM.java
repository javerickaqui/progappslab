import java.util.*;
public class MEM {
    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);
        int n = reader.nextInt();
        int x = reader.nextInt();
        int array[] = new int[n];
        for (int i = 0; i < n; i++){
            array[i] = reader.nextInt();
        }
        int count = 0;
        for (int i = 0 ; i < n; i++){
            if (array[i] < x) count++;
            if (array[i] == x) count--;
        }
        System.out.println(x - count);
    }

}