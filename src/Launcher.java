import java.util.*;
import java.util.stream.Stream;

public class Launcher {
    public static void main(String[] args) {
        System.out.println("Bienvenue !");
        Scanner sc_main = new Scanner(System.in);
        List<Command> list_command = new ArrayList<>();
        list_command.add(new Quit());
        list_command.add(new Fibo());
        list_command.add(new Freq());
        while (true) {
            int isCommand = 0;
            System.out.println("Entrer une commande : ");
            String user_in = sc_main.nextLine();
            for (Command command : list_command) {
                if (command.name().equals(user_in)) {
                    if (command.run(sc_main) == true) {
                        isCommand = 1;
                    } else {
                        isCommand = 2;
                    }
                }
            }
            if (isCommand == 1){
                break;
            } else if (isCommand == 2){
                continue;
            } else {
                System.out.println("Unknown command");
            }
            //if (quit_command.run(sc_main) == true) {
            //    break;
            //} else if (fibo_command.run(sc_main) == true) {
            //    continue;
            //} else if (freq_command.run(sc_main) == true) {
            //    continue;
            //}
        }
    }
}

