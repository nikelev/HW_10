public class Homework_10 {
    public static void main(String[] args) {
        figureTask1(6);
        System.out.println("===============================================");
        figureTask2(6);
        System.out.println("===============================================");
        figureTask3(6);

    }

    public static void figureTask1(int n) {
        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= n; j++) {
                if (i == 1 || i == n || i == j || j == 1 || j == n) {
                    System.out.print("*" + "\t");
                } else
                    System.out.print("\t");

            }
            System.out.println();
        }
    }

    public static void figureTask2(int n) {
        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= n; j++) {
                if (i == 1 || i == n || i == j || j == 1 || j == n|| j==n-i+1) {
                    System.out.print("*" + "\t");
                } else
                    System.out.print("\t");

            }
            System.out.println();
        }
    }

    public static void figureTask3(int n) {
        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= n; j++) {
                if (i == 1 || i == n || j == 1 || j == n|| j==n-i+1||j>=n/2 ) {
                    System.out.print("*" + "\t");
                } else
                    System.out.print("\t");

            }
            System.out.println();
        }
    }
}
