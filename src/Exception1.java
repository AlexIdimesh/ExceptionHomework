//1. Объявите ссылочную переменную со значением null. Вызовите метод у этой переменной.
//   Отловить возникшее исключение c помощью блока try-catch.
public class Exception1 {
    private static final String exp = null;
    private final static String name = "Hello";
    public static void main(String[] args) {
        System.out.println("Привет");
        exceptionCatch(exp);
        System.out.println("Пока");

    }
    public static void exceptionCatch(String string) {
        try {
            System.out.println(string.equals(name));
        } catch (NullPointerException e) {
            System.out.println("Объект без значения");
        }

    }
}
