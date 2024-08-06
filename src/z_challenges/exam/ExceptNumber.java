package z_challenges.exam;

// 저주의 숫자 3
public class ExceptNumber {

    public int solution(int n) {
        int num = 0;

        for (int i = 1; i <= n; i++) {

            while (true) {
                String str = String.valueOf(num+1);

                if (str.contains("3") || (num+1) % 3 == 0) {
                    num++;
                } else {
                    break;
                }
            }

            num++;
        }

        return num;
    }
}
