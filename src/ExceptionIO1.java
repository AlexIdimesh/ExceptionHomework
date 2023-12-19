import java.io.*;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.regex.Pattern;
import java.util.stream.Stream;

//1. Задан файл с текстом, найти и вывести в консоль все слова, начинающиеся с гласной буквы.
public class ExceptionIO1 {
    public static void main(String[] args) {
        String fileName = "src/text.txt";
        try (Stream<String> lines = Files.lines(Paths.get(fileName))) {
            Pattern pattern = Pattern.compile("\\b[aeiouAEIOU]\\w+");
            lines.flatMap(line -> pattern.matcher(line).results().map(matchResult -> matchResult.group()))
                    .forEach(System.out::println);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
