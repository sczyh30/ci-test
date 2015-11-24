import java.util.ArrayList;
import java.util.List;

import redis.clients.jedis.Jedis;

public class CITest {

    Jedis jedis = new Jedis("localhost");

    public static void testRedis() {
        System.out.println(jedis.ping());
    }

    public static Optional<String> getStringData(String s) {
        return Optional.ofNullable(jedis.get(s));
    }

    public static void main(String[] args) {
        List<Integer> list = new ArrayList<>();
        list.add(13);
        list.add(-3);
        list.add(6);
        list.add(9);
        list.forEach(System.out::println);

        testRedis();
    }
}
