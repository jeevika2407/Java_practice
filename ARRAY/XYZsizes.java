package ArrayPractice;
import java.util.*;
public class XYZsizes {
  public static void main(String args[]) {
	  Scanner sc=new Scanner(System.in);

      int M = sc.nextInt();
      int[] X = new int[M];
      for (int i = 0; i < M; i++) {
          X[i] = sc.nextInt();
      }

      int N = sc.nextInt();
      int[] Y = new int[N];
      for (int i = 0; i < N; i++) {
          Y[i] = sc.nextInt();
      }

      int O = sc.nextInt();
      int[] Z = new int[O];
      for (int i = 0; i < O; i++) {
          Z[i] = sc.nextInt();
      }

      int[] mergedArray = new int[M + N + O];
      int index = 0;
      for (int i = 0; i < M; i++) {
          mergedArray[index++] = X[i];
      }
      for (int i = 0; i < N; i++) {
          mergedArray[index++] = Y[i];
      }
      for (int i = 0; i < O; i++) {
          mergedArray[index++] = Z[i];
      }

      Arrays.sort(mergedArray);

      for (int num : mergedArray) {
          System.out.print(num + " ");
      }
          sc.close();
  }
}
