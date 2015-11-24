import java.util.ArrayList;
import java.util.List;

public class CITest {
    public static void main(String[] args) {
        List<Integer> list = new ArrayList<>();
        list.add(13);
        list.add(-3);
        list.add(6);
        list.add(9);
        list.forEach(System.out::println);
    }
}
