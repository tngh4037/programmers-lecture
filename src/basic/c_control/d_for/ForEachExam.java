package basic.c_control.d_for;

public class ForEachExam {

    public static void main(String[] args) {
        int[] iarr = {10, 20, 30, 40, 50};

        // for
        for (int i = 0; i < iarr.length; i++) {
            int value = iarr[i];
            System.out.println(value);
        }

        System.out.println("==========================");

        // for-each
        for (int value : iarr) {
            System.out.println(value);
        }
    }
}

// 참고) 자바 1.5 버전부터 추가된 foreach 구문