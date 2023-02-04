import java.util.Scanner;

public class DrawingBook {

    static int pageCount(int n, int p) {

        int totalFromFront = n / 2;
        int targetFromFront = p / 2;
        int targetFromBack = totalFromFront - targetFromFront;

        return Math.min(targetFromFront, targetFromBack);

    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int p = in.nextInt();
        System.out.println(pageCount(n, p));
        in.close();
    }
}