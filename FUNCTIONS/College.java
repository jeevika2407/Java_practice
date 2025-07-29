package FunctionPractice;

import java.util.*;

public class College {
    public static void placementDept(int cs, int ec, int me) {
        if (cs < 0 || ec < 0 || me < 0) {
            System.out.println("Input is Invalid");
            return;
        }

        int max = Math.max(cs, Math.max(ec, me));

        if (cs == max && ec == max && me == max) {
            System.out.println("None of the department has got the highest placement");
        } else {
            boolean firstFlag = true;
            if (cs == max) {
                if (firstFlag) {
                    System.out.print("Highest placement CS");
                    firstFlag = false;
                } else {
                    System.out.print(" CS");
                }
            }
            if (ec == max) {
                if (firstFlag) {
                    System.out.print("Highest placement EC");
                    firstFlag = false;
                } else {
                    System.out.print(" EC");
                }
            }
            if (me == max) {
                if (firstFlag) {
                    System.out.print("Highest placement ME");
                    firstFlag = false;
                } else {
                    System.out.print(" ME");
                }
            }
            System.out.println();
        }
    }

    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the no of students placed in CS: ");
        int cs = sc.nextInt();
        System.out.print("Enter the no of students placed in EC: ");
        int ec = sc.nextInt();
        System.out.print("Enter the no of students placed in ME: ");
        int me = sc.nextInt();
        
        placementDept(cs, ec, me);
        sc.close();
    }
}
