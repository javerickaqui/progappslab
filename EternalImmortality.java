
import java.util.Scanner;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
/**
 *
 * @author Javerick Cynjynn Aqui
 */

public class EternalImmortality {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner kbd = new Scanner(System.in);
        double i;
        double divisorFact = 1;
        double dividendFact = 1;

        double divisor = kbd.nextInt();
        for (i = 1; i <= divisor; i++) {
            divisorFact = divisorFact * i;
        }

        double dividend = kbd.nextInt();
        for (i = 1; i <= dividend; i++) {
            dividendFact = dividendFact * i;
        }

        double x = dividendFact/divisorFact;
        double last = Math.abs(x%10);
        int a = (int) last;
        System.out.println(a);


    }

}
