package z_challenges.exam;

// 2차원으로 만들기
public class TwoDimensionArray {

    public int[][] solution(int[] num_list, int n) {
        int[][] answer = {};

        int length = num_list.length;

        answer = new int[length / n][n];

        for (int i = 0; i < length; i++) {
            answer[i / n][i % n] = num_list[i];
        }

        return answer;
    }
}
