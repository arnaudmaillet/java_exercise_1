import java.util.Scanner;

public class Launcher {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Bienvenue !");
        System.out.println("Entrer une commande : ");
        while (!new String(scan.nextLine()).equals("quit")) {
            System.out.println("Unknown command");
            System.out.println("Entrer une commande : ");
        }
    }
}

