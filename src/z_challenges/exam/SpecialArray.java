package z_challenges.exam;

import java.util.Arrays;
import java.util.Comparator;

// [ 특이한 정렬 ] -> 주어진 n 기준 간격이 가까운 순출력, 간격이 같으면 값이 큰게 앞으로
//
// 정수 n을 기준으로 n과 가까운 수부터 정렬하려고 합니다.
// 이때 n으로부터의 거리가 같다면 더 큰 수를 앞에 오도록 배치합니다.
// 정수가 담긴 배열 numlist와 정수 n이 주어질 때 numlist의 원소를 n으로부터 가까운 순서대로 정렬한 배열을 return하도록 solution 함수를 완성해주세요.
//
// 제한사항
// : 1 ≤ n ≤ 10,000
// : 1 ≤ numlist의 원소 ≤ 10,000
// : 1 ≤ numlist의 길이 ≤ 100
// : numlist는 중복된 원소를 갖지 않습니다.
//
// ex1)
// numlist: [1, 2, 3, 4, 5, 6]
// n: 4
// result: [4, 5, 3, 6, 2, 1]
//
// ex2)
// numlist: [10000,20,36,47,40,6,10,7000]
// n:30
// result: [36, 40, 20, 47, 10, 6, 7000, 10000]
public class SpecialArray {

    public int[] solution(int[] numlist, int n) {
        Integer[] targets = new Integer[numlist.length];
        for (int i = 0; i < numlist.length; i++) {
            targets[i] = numlist[i];
        }

        Arrays.sort(targets, (a, b) -> {
            int a_num = Math.abs(a - n);
            int b_num = Math.abs(b - n);

            if (a_num == b_num) {
                return Integer.compare(b, a);
            } else {
                return Integer.compare(a_num, b_num);
            }
        });

        /*
        Arrays.sort(targets, new Comparator<Integer>(){

            @Override
            public int compare(Integer a, Integer b) { // 음수 또는 0이면 객체의 자리가 그대로 유지되며, 양수인 경우에는 두 객체의 자리가 변경된다.
                int a_num = Math.abs(a - n);
                int b_num = Math.abs(b - n);

                if (a_num == b_num) {
                    return Integer.compare(b, a);
                } else {
                    return Integer.compare(a_num, b_num);
                }
            }
        });
        */

        return Arrays.stream(targets).mapToInt(Integer::intValue).toArray();
    }
}
