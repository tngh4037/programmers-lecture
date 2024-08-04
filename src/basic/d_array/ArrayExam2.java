package basic.d_array;

// 2차원 배열
public class ArrayExam2 {

    public static void main(String[] args) {
        int[][] array4 = new int[3][4];
        // array4[0] = 10; // compile error // array4[0]은 int형 배열을 가리키는 참조 변수이다. 여기에 값을 담을 수 X
        array4[0][0] = 10; // array4[0] 이 가리키고 있는 1차원 배열의 0번째 인덱스에 10을 저장한다.
        array4[0][1] = 20; // array4[0] 이 가리키고 있는 1차원 배열의 1번째 인덱스에 10을 저장한다.


        // 2차원 배열을 생성할 떄는, 크기가 다른 배열을 생성할 수 있다.
        int[][] array5 = new int[3][];
        // array5[0][0] = 10; // runtime error // array5[0] 는 아직 가리키고 있는 배열이 없다.
        array5[0] = new int[1];
        array5[0][0] = 10;


        // 2차원 배열도 선언과 동시에 초기화할 수 있다.
        int[][] array6 = new int[][]{{1}, {1, 2}, {1, 2, 3}};
        System.out.println(array6[0][0]); // 1
        System.out.println(array6[2][2]); // 3
    }
}
