import java.util.List;
//4. Бросить одно из существующих в JDK исключений,
//   отловить его и оберните его в свое кастомное исключение указав в качестве причины отловленное.
public class Exception4 extends Exception {
    public Exception4(String message) {
        super(message);
    }
    public static void myExceptionCatching(int value) throws Exception4 {
        if (value < 0)
            throw new Exception4("Значение должно быть больше или равно нулю");
    }
    public static void main(String[] args) {
        try {
            myExceptionCatching(-10);
        } catch (Exception4 exception4) {
            System.out.println("Ошибка: " + exception4.getMessage());
        }
    }
}
