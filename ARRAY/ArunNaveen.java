package ArrayPractice;
import java.util.*;

public class ArunNaveen {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int[] arunDice = new int[10];
        for (int i = 0; i < 10; i++) {
            arunDice[i] = sc.nextInt();
        }

        int[] naveenDice = new int[10];
        for (int i = 0; i < 10; i++) {
            naveenDice[i] = sc.nextInt();
        }

        int arunTotal = 0;
        int naveenTotal = 0;
        for (int i = 0; i < 10; i++) {
            arunTotal += arunDice[i];
            naveenTotal += naveenDice[i];
        }

        if (arunTotal > naveenTotal) {
            System.out.println("Arun Wins!!!");
        } else if (naveenTotal > arunTotal) {
            System.out.println("Naveen Wins!!!");
        } else {
            System.out.println("It's a Tie!!!");
        }

        sc.close();
    }
}
