import java.io.IOException;
import java.io.InputStream;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.stream.IntStream;
import java.util.stream.Stream;

//2. Задан файл с текстом, найти и вывести в консоль все слова,
//   для которых последняя буква одного слова совпадает с первой буквой следующего слова
public class ExceptionIO2 {
    public static void main(String[] args) throws IOException {
        String filename = "src/text.txt";
        try(Stream<String> lines = Files.lines(Paths.get(filename))){
            lines.map(line -> line.split("\\s+"))
                    .flatMap(words -> {
                        if (words.length > 1) {
                            return IntStream.range(0, words.length - 1)
                                    .filter(i -> words[i].charAt(words[i].length() - 1) == words[i + 1].charAt(0))
                                    .mapToObj(i -> words[i] + " " + words[i + 1]);

                        } else {
                            return Stream.empty();
                        }
                    })
                    .forEach(System.out::println);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
