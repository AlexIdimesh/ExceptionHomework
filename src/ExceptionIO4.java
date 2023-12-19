import javax.sound.midi.Patch;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.Arrays;
import java.util.stream.Collectors;
import java.util.stream.Stream;

//Задан файл с java-кодом.
//Прочитать текст программы из файла и все слова public
//в объявлении атрибутов и методов класса заменить на слово private.
public class ExceptionIO4 {
    public static void main(String[] args) {
        try {
            String fileName = "src/text2.txt";
            String replacedCode = Files.lines(Paths.get(fileName))
                    .map(line -> line.replaceAll("\\bpublic\\b", "private"))
                    .collect(Collectors.joining("\n"));
            System.out.println(replacedCode);
        } catch (IOException e) {
            e.printStackTrace();
        }

    }
}
