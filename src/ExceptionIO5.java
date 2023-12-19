import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.List;
import java.util.stream.Collectors;

//5. Задан файл с java-кодом.
//   Прочитать текст программы из файла и записать в другой файл в обратном порядке символы каждой строки.
public class ExceptionIO5 {
    public static void main(String[] args) {
        String inputFileName = "src/text2.txt";
        String outputFileName = "src/text3.txt";
        try {
            List<String> lines = Files.lines(Paths.get(inputFileName))
                    .map(ExceptionIO5:: reverse)
                    .collect(Collectors.toList());

            Files.write(Paths.get(outputFileName), lines);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
    private static String reverse(String line) {
        return new StringBuilder(line).reverse().toString();
    }
}
