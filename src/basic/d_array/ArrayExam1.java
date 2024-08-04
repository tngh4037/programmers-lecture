package basic.d_array;

// 1차원 배열
public class ArrayExam1 {

    public static void main(String[] args) {
        // 배열 생성
        int[] array1 = new int[4];
        array1[0] = 1;
        array1[1] = 2;
        array1[2] = 3;
        array1[3] = 4;

        // 배열 생성 - 선언과 동시에 초기화
        int[] array2 = new int[]{1, 2, 3, 4};
        int[] array3 = {1, 2, 3, 4};

        // 배열에 저장된 값을 꺼내서 사용하는 방법 (배열에 접근할때에는 인덱스를 통해서 접근한다.)
        int num1 = array3[0];
        int num2 = array3[1];
        int num3 = array3[2];
        int num4 = array3[3];
        System.out.println(num1);
        System.out.println(num2);
        System.out.println(num3);
        System.out.println(num4);

        // ===========================================================

        // [ for 반복문을 이용해서 배열 사용하기 ]
        // 1) 배열에 1부터 100까지 값넣기
        int[] arrays = new int[100];
        for (int i = 0; i < arrays.length; i++) {
            arrays[i] = i + 1;
        }

        // 2) 배열에 저장된 값을 모두 더해주기
        int sum = 0;
        for (int i = 0; i < arrays.length; i++) {
            sum += arrays[i];
        }
        System.out.println(sum);
    }
}

// 참고) 배열은 기본 데이터 타입이 아닌, 참조형 타입이다.