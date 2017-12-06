import java.util.*;
import java.io.*;

public class AlexAndTheBrokenContest {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String[] name = {"Danil", "Olya", "Slava", "Ann", "Nikita"};
        String s = in.next();
        int c = 0;
        for (int i = 0; i < 5; i++) {
            int v = -1;
            while ((v = s.indexOf(name[i], v+1))>=0) c++;
        }
        System.out.println(c == 1 ? "YES" : "NO");
    }
}