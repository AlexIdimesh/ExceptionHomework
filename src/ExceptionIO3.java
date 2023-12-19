import com.sun.tools.javac.Main;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.Optional;
import java.util.stream.Stream;

//3. Задан файл с текстом. В каждой строке найти и вывести наибольшее число цифр, идущих подряд.
public class ExceptionIO3 {
    public static void main(String[] args) {
        String fileName = "src/text.txt";
        try (Stream<String> lines = Files.lines(Paths.get(fileName))) {
            lines.mapToInt(ExceptionIO3::findMaxConsecutiveDigits)
                    .forEach(System.out::println);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
    private static int findMaxConsecutiveDigits(String line) {
        Optional<Integer> result = line.chars().mapToObj(Character::getNumericValue)
                .reduce((current,next) -> next == -1 ? current : current * 10 + next);
        return result.orElse(0);
    }
}
