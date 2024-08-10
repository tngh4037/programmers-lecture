package z_challenges.exam;

import java.util.Arrays;

// 구명보트
public class Lifeboat {

    public int solution(int[] people, int limit) {
        int answer = 0;

        Arrays.sort(people);

        int min = 0;

        for (int max = people.length - 1; min <= max; max--) {
            if (people[min] + people[max] <= limit) {
                min++;
            }

            answer++;
        }

        return answer;
    }

    public int solution2(int[] people, int limit) {
        int answer = 0;
        Arrays.sort(people);
        int index = 0;

        for (int i = people.length - 1; i >= index; i--) {
            if (people[i] + people[index] <= limit) {
                index++;
                answer++;
            }
            else {
                answer++;
            }
        }

        return answer;
    }

}

// https://school.programmers.co.kr/learn/courses/30/lessons/42885