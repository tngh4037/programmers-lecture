package z_challenges.exam;

import java.util.Arrays;

// 최댓값 만들기 (2)
public class MakeMaxvalue {

    public int solution(int[] numbers) {
        int len = numbers.length;
        Arrays.sort(numbers);
        return Math.max(numbers[0] * numbers[1], numbers[len - 2] * numbers[len - 1]);
    }
}
