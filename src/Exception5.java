import java.util.Random;

//5. Создать метод случайным образом выбрасывающий одно из 3-х видов исключений.
//   Вызвать этот метод в блоке try-catch, отлавливающим любое из 3-х.
public class Exception5 {
    public static void randomlyThrowException() throws Exception {
        Random random = new Random();
        int exceptionType = random.nextInt(2);
        if (exceptionType == 0) {
            throw new ArrayIndexOutOfBoundsException("Сгенерировано исключение: " +
                    " ArrayIndexOutOfBoundsException ");
        } else if (exceptionType == 1) {
            throw new NullPointerException("Сгенерировано исключение: " +
                    " NullPointerException");
        } else {
            throw new ArithmeticException("Сгенерировано исключение: " +
                    " ArithmeticException ");
        }
    }
    public static void main(String[] args) {
        try {
            randomlyThrowException();
        } catch (ArrayIndexOutOfBoundsException | NullPointerException | ArithmeticException e) {
            e.printStackTrace();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}


