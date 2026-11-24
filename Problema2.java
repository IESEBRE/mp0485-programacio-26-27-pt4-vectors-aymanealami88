import java.util.Scanner;

public class Problema2{
    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int nCasos;
        do {
            nCasos = sc.nextInt();
            if (nCasos > 0) break;
        } while (true);

        sc.nextLine();

        String[] paraules = new String[nCasos];
        int[] coincidencies = new int[nCasos];

        for (int i = 0; i < nCasos; i++) {
            do {
                paraules[i] = sc.nextLine();
            } while (paraules[i].isEmpty());
        }
        char lletraBuscada = sc.nextLine().charAt(0);

        for (int i = 0; i < nCasos; i++) {
            for (int j = 0; j < paraules[i].length(); j++) {
                if (paraules[i].charAt(j) == lletraBuscada) {
                    coincidencies[i]++;
                }
            }
        }

        IO.print("[");
        for (int i = 0; i < nCasos; i++) {
            IO.print(coincidencies[i]);
            if (i < nCasos - 1) {
                IO.print(", ");
            }
        }
        IO.print("]");
    }
}
