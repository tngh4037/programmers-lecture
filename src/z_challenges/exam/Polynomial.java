package z_challenges.exam;

// 다항식 더하기
public class Polynomial {

    public String solution(String polynomial) {
        String[] strArr = polynomial.split(" ");

        int x_count = 0;
        int num_sum = 0;
        for (String str: strArr) {
            if (str.equals("+")) {
                continue;
            }

            if (str.contains("x")) {
                if (str.length() > 1) {
                    x_count += Integer.parseInt(str.replace("x", ""));
                } else {
                    x_count++;
                }
            } else {
                num_sum += Integer.parseInt(str);
            }
        }

        if (x_count > 0 && num_sum > 0) {
            return (x_count > 1 ? x_count : "") + "x" + " + " + num_sum; // 참고) 1x 는 x 로 나와야 함
        }

        if (x_count > 0 && num_sum == 0) {
            return (x_count > 1 ? x_count : "") + "x";
        }

        if (x_count == 0 && num_sum > 0) {
            return "" + num_sum;
        }

        return null;
    }
}
