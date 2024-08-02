package io;

import java.io.*;

// [다양한 타입의 데이터를 읽을 수 있는 DataInputStream]
//
// ByteIOExam2 에서 저장한 값을 읽어들여 화면에 출력하는 클래스를 만들어보자.
public class ByteIOExam3 {

    public static void main(String[] args) {
        try (
                DataInputStream in = new DataInputStream(new FileInputStream("data.txt")) // FileInputStream 을 이용해서 파일로 부터 데이터를 읽는다. 그런데 그렇게 읽어 들인 데이터를 다양한 데이터 타입으로 읽고싶다. ( DataInputStream )
        ) {
            int i = in.readInt();
            boolean b = in.readBoolean();
            double d = in.readDouble();

            System.out.println(i);
            System.out.println(b);
            System.out.println(d);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}

// 참고) 다양한 타입의 데이터를 읽어낼 수 있는 DataInputStream
// - readInt() -정수를 읽어들이는 메소드
// - readBoolean() - boolean 값을 읽어들이는 메소드
// - readDouble() - double 값을 읽어들이는 메소드
//
// 참고 - 주의) 파일에 저장된 순서대로 읽어 들여야 한다.
// - ByteIOExam2 에서 int, boolean, double 순서대로 저장하였기 때문에 읽어들일 때도 같은 순서로 읽어여야 한다.