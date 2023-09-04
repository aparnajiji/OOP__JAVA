import java.util.*;

class Multiplication extends Thread {
    public void run() {
        int n;
        Scanner sc = new Scanner(System.in);
        System.out.println("\n\nEnter no of rows  :");
        n = sc.nextInt();
        System.out.println("\n\n---------MULTIPLICATION TABLE OF 5----------\n");
        for (int i = 1; i <= n; i++) {
            System.out.println("5 * " + i + " = " + (5 * i));
        }
    }
}

class Prime extends Thread {
    public void run() {
        int count = 0, i = 1, j, n, no = 0;
        Scanner sc = new Scanner(System.in);
        System.out.println("\n\nEnter value for N :");
        n = sc.nextInt();
        System.out.println("The first "+n+" Prime Numbers are :");
        while (no != n) {
            count = 0;
            for (j = 2; j <= i / 2; j++) {
                if (i % j == 0) {
                    count++;
                    break;
                }
            }
            if (count == 0 && i != 1) {
                System.out.print(i + "   ");
                no++;
            }
            i++;
        }
    }
}

class mthread
 {
    public static void main(String args[]) {
        Multiplication m = new Multiplication();
        Prime p = new Prime();
        m.start();
        p.start();
    }
}