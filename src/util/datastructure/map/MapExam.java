package util.datastructure.map;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

public class MapExam {

    public static void main(String[] args) {
        // Key, Value가 모두 String 타입인 HashMap 인스턴스 생성
        Map<String, String> map = new HashMap<>();

        // key 와 value 값을 put 으로 저장.
        map.put("001", "kim");
        map.put("002", "lee");
        map.put("003", "choi");

        // key는 중복될 수 없다. ( 이때, 첫번째로 저장했던 (001, kim -> 001, kang) 으로 바뀐다. (덮어씌워짐 -> 같은 key로 값이 또 들어왔을 때 map은 기존 값을 새로 들어온 값으로 바꿈) )
        map.put("001", "kang");

        // map에 저장된 자료의 수를 출력 -> 3
        System.out.println(map.size());

        // key가 001, 002, 003인 값을 꺼내 출력
        System.out.println(map.get("001"));
        System.out.println(map.get("002"));
        System.out.println(map.get("003"));

        // map에 저장된 모든 key들을 Set 자료구조로 꺼낸다.
        Set<String> keys = map.keySet();
        // Set 자료구조에 있는 모든 key를 꺼내기 위하여 Iterator를 구합니다.
        Iterator<String> iter = keys.iterator();
        while (iter.hasNext()) {
            // key를 꺼낸다.
            String key = iter.next();
            // key에 해당하는 value를 꺼낸다.
            String value = map.get(key);
            // key와 value를 출력.
            System.out.println(key + " : " + value);
        }
    }
}

// Map은 key와 value를 쌍으로 해서 데이터를 저장하는 자료구조이다. ( 키는 중복될 수 없고, 값은 중복될 수 있다. -> 키(key)를 이용해서 값(value)을 찾을 수 있도록 설계됨 )
