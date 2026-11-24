import java.util.Scanner;

public class Problema1{
    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int nCasos;
        do {
            nCasos = sc.nextInt();
            if (nCasos > 0) break;
        } while (true);

        sc.nextLine();

        String[] paraules = new String[nCasos];
        int[] longitud = new int[nCasos];

        for (int i = 0; i < nCasos; i++) {
            paraules[i] = sc.nextLine();
            longitud[i] = paraules[i].length();
        }

        IO.print("[");
        for (int i = 0; i < nCasos; i++) {
            IO.print(paraules[i]);
            if (i < nCasos - 1) {
                IO.print(", ");
            }
        }
        IO.print("] -> [");
        for (int i = 0; i < nCasos; i++) {
            IO.print(longitud[i]);
            if (i < nCasos - 1) {
                IO.print(", ");
            }
        }
        IO.println("]");
    }
}
