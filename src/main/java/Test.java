import jdk.swing.interop.SwingInterOpUtils;

public class Test {
    public static void main(String[] args) {
        paintSquare(5);
        System.out.println();
        paintSquareWithDiagonal(5);
        System.out.println();
        paintTriangle(5);
        System.out.println();
        paintTwoSquares(5);
        System.out.println();
        twoSquaresTogether(6);
    }
    public static void paintSquare(int n) {
        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= n; j++) {
                if (j == 1 || j == n || i == 1 || i == n) {
                    System.out.print("* ");
                } else System.out.print("  ");
            }
            System.out.println();
        }
    }
    public static void paintSquareWithDiagonal(int n) {
        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= n; j++) {
                if (j == 1 || j == n || i == 1 || i == n || i == j) {
                    System.out.print("* ");
                } else System.out.print("  ");
            }
            System.out.println();
        }
    }
    public static void paintTriangle(int n) {
        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= n; j++) {
                if (i == 5 || j == 1 || i == j) {
                    System.out.print("* ");
                } else System.out.print("  ");
            }
            System.out.println();
        }
    }
    public static void paintTwoSquares(int n) {
        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= n; j++) {
                if (i == 1 || i == 5 || j == 1 || j == 5 || i == 2 || i == 4 || j == 2 || j == 4) {
                    System.out.print("* ");
                } else System.out.print("  ");
            }
            System.out.println();
        }
    }
    public static void twoSquaresTogether(int n) {
        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= n; j++) {
              if ((i <=3 && j<= 4) || i==3 || j==3 ){
                  System.out.print("* ");
              }else if ((j>=3 && i>=4) || i==4 || j==4){
                  System.out.print("* ");
              }else if (i==3 && j==3){
                  System.out.println("* ");
              }
              else System.out.print("  ");
            }
            System.out.println();
        }
    }
}