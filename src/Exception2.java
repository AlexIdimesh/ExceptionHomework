
import java.util.Arrays;
//2. Написать код, который создаст, а затем отловит ArrayIndexOutOfBoundsException.
public class Exception2 {
    public static void main(String[] args) {
        int[] arr = new int[5];
        arr[1] = 5;
        try {
            arr[6] = 10;
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println(e.getMessage());
        }
        System.out.println("Все работает");
        System.out.println(Arrays.toString(arr));

    }
}
