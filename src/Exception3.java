//3. Создать собственный класс-исключение - наследник класса Exception.
//   Создать метод, выбрасывающий это исключение.
//   Вызвать этот метод и отловить исключение. Вывести stack trace в консоль.
public class Exception3 extends Exception {
    public Exception3(String message) {
        super(message);
    }
    public static void myExceptionCatching() throws Exception3 {
        throw new Exception3("Сообщаю об ошибки");
    }

    public static void main(String[] args) {
        try {
            myExceptionCatching();
        } catch (Exception3 exception3){
            exception3.printStackTrace();
        }
    }
}
