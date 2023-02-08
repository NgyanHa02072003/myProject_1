import java.util.Arrays;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        System.out.println("Hello world!");
    }
}

class bai2_1{
    public static void main(String[] args) {
        int[] i = new int[5];
        float[] f = new float[5];
        double[] b = new double[5];
        String[] s = new String[5];
        char[] c = new char[5];
        boolean[] bl = new boolean[5];
        System.out.println(i);
        System.out.println(f);
        System.out.println(b);
        System.out.println(s);
        System.out.println(c);
        System.out.println(bl);
    }
}
class Bai2_2 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String str = in.nextLine();
        String[] list = str.split(" +");
        int len = list.length;
        float array[] = new float[len];
        for (int i=0; i<len; i++) {
            array[i] = (Float.parseFloat(list[i]));
        }
        System.out.printf("\nBefore sort: %s ", Arrays.toString(array));

        Arrays.sort(array);

        System.out.printf("\nAfter sort: %s ", Arrays.toString(array));
        in.close();
    }
}

class Bai2_3{
    public static void print_mat(int[][] a, int m, int n){
        Scanner sc = new Scanner(System.in);
        for(int i = 0; i < m; i++){
            for(int j = 0; j < n; j++)
                a[i][j] = sc.nextInt();
        }
        for(int i = 0; i < m; i++){
            for(int j = 0; j < n; j++)
                System.out.print(a[i][j] + "\t");
            System.out.println();
        }
    }
    public static void main(String[] args) {
        int m_X,n_X,m_Y,n_Y;
        Scanner sc = new Scanner(System.in);
        do {
            System.out.print("Input shape of matrix X: ");
            m_X = sc.nextInt();
            n_X = sc.nextInt();
            System.out.print("Input shape of matrix Y: ");
            m_Y = sc.nextInt();
            n_Y = sc.nextInt();
        } while (m_X < 0 && n_X < 0);

        System.out.println("Input matrix X:");
        int matX[][] = new int[m_X][n_X];
        print_mat(matX, m_X, n_X);

        System.out.println("Input matrix Y:");
        int matY[][] = new int[m_Y][n_Y];
        print_mat(matY, m_Y, n_Y);

        if( (n_X != n_Y) & (m_X != m_Y)){
            System.out.println("Cannot calculate sum of X,Y:");
        }
        else if(m_Y != n_X){
            System.out.println("Cannot calculate sum of X,Y:");
        }
        else {
            int sum[][] = new int[m_Y][n_Y];
            System.out.println("X + Y =:" );
            for(int i = 0; i < m_Y; i++) {
                for (int j = 0; j < n_Y; j++)
                    sum[i][j] = matX[i][j] + matY[i][j];
            }
            for (int i = 0; i < m_Y; i++) {
                for (int j = 0; j < n_Y; j++)
                    System.out.print(sum[i][j] + "\t");
                System.out.println();
            }

            int dot[][] = new int[m_X][n_Y];
            System.out.println("X * Y =:" );
            for (int i = 0; i < m_X; i++) {
                for (int j = 0; j < n_Y; j++) {
                    dot[i][j] = 0;
                    for (int k = 0; k < n_Y; k++) {
                        dot[i][j] = dot[i][j] + matX[i][k] * matY[k][j];
                    }
                }
            }
            for (int i = 0; i < m_Y; i++) {
                for (int j = 0; j < n_Y; j++)
                    System.out.print(dot[i][j] + "\t");
                System.out.println();
            }

        }

    }
}