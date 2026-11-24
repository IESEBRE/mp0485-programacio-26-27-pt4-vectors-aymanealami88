import java.util.Scanner;
import java.util.Arrays;

public class Problema3{
    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int nCasos;
        do {
            nCasos = sc.nextInt();
            if (nCasos > 0) break;
        } while (true);

        sc.nextLine();

        String[] paraules = new String[nCasos];
        boolean[] iniciFinal = new boolean[nCasos];

        for (int i = 0; i < nCasos; i++) {
            paraules[i] = sc.nextLine();
            if(!paraules[i].isEmpty() && paraules[i].charAt(0) == paraules[i].charAt(paraules[i].length() - 1)) iniciFinal[i] = true;
            else iniciFinal[i] = false;
        }

        IO.print(Arrays.toString(iniciFinal));
    }
}
