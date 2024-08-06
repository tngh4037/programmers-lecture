package z_challenges.exam.handle;

import java.util.HashMap;
import java.util.Map;
import java.util.function.BiFunction;

public class MapHandle {

    // map.merge()
    public static void main(String[] args) {
        Map<String, Integer> map1 = new HashMap<>();
        map1.put("Apple", 1000);
        map1.put("Banana", 2000);
        map1.put("Orange", 3000);

        Map<String, Integer> map2 = new HashMap<>();
        map2.put("Apple", 4000);
        map2.put("Tomato", 5000);
        map2.put("WaterMelon", 6000);

        map2.forEach((key, value) -> map1.merge(key, value, (v1, v2) -> v2));
        // map2.forEach((key, value) -> map1.merge(key, value, new BiFunction<Integer, Integer, Integer>() {
        //     @Override
        //     public Integer apply(Integer v1, Integer v2) {
        //         return v2;
        //     }
        // }));

        System.out.println(map1);  // {Apple=4000, WaterMelon=6000, Tomato=5000, Orange=3000, Banana=2000}
        // map2.forEach((key, value) -> map1.merge(key, value, (v1, v2) -> v2));
        // HashMap.merge() 메소드를 사용하여 map1에 map2를 병합하였습니다.
        // 위 예제에서는, map1과 map2의 key가 같을 경우, map2의 값으로 덮어썼기 때문에,
        // "Apple"의 값은 map2의 값인 4000이 되었습니다.
        // 출처: https://hianna.tistory.com/580
    }
}
