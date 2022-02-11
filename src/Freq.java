import java.util.Scanner;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.nio.file.Files;
import java.io.IOException;
import java.util.Arrays;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.function.Function;
import java.util.stream.Collectors;
import java.util.stream.Stream;
import java.util.Collections;

public class Freq implements Command {
    @Override
    public String name() {
        return "freq";
    }

    @Override
    public boolean run(Scanner scan) {
        Scanner path_scan = new Scanner(System.in);
        System.out.println("Entrer le chemin du ficher : ");
        Path filePath = Paths.get(path_scan.nextLine());
        try {
            String content = Files.readString(filePath);
            findWords(content);
        } catch (IOException e) {
            System.out.println("Unreadable file: class Launcher; " + e);
        }
        return false;
    }

    private static void findWords(String str) {
        //if (str.isBlank()) return "Fichier vide";
        str.replaceAll("[:;,.!?\\-]", " ").toLowerCase();
        String[] words = str.split(" ");
        Stream<String> stream = Arrays.stream(words);
        Map<String, Long> wordsMap = stream.collect(Collectors.groupingBy(Function.identity(), Collectors.counting()));
        List wordsList = new ArrayList<>(wordsMap.keySet());
        Collections.reverse(wordsList);
        //List<String> res = wordsList.stream().limit(3).collect(Collectors.toList());
        System.out.println(wordsList);
    }
}