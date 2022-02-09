import java.util.Scanner;

public class Launcher {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Bienvenue !");
        System.out.println("Entrer une commande : ");
        while (true) {
            String str = new String(scan.next());
            if (str.equals("quit")) {
                break;
            } else if (str.equals("fibo")) {
                System.out.println("Entrer un nombre: ");
                System.out.println("Fibonacci result : " + fibo(scan.nextInt()));
            } else {
                System.out.println("Unknown command");
            }
            System.out.println("Entrer une commande : ");
        }
    }

    private static int fibo(int n) {
        if (n <= 1) return n;
        else return fibo(n-1) + fibo(n-2);
    }
}

