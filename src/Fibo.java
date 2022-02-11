import java.util.Scanner;

public class Fibo implements Command {
    @Override
    public String name() {
        return "fibo";
    }

    @Override
    public boolean run(Scanner scan) {
        Scanner fibo_scan = new Scanner(System.in);
        System.out.println("Entrer un nombre: ");
        System.out.println("Fibonacci result : " + fibo(fibo_scan.nextInt()));
        return false;
    }

    private static int fibo(int n) {
        if (n <= 1) return n;
        else return fibo(n-1) + fibo(n-2);
    }
}