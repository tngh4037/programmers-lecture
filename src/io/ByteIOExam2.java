package io;

import java.io.DataOutputStream;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

// [다양한 데이터 타입을 저장할 수 있는 DataOutputStream]
//
// - 이번에는 다양한 데이터 타입을 받아서 파일에 저장하도록 구현해보자.
public class ByteIOExam2 {

    public static void main(String[] args) {
        try (
                DataOutputStream out = new DataOutputStream(new FileOutputStream("data.txt")) // 참고) 아무런 경로를 주지 않으면, 프로젝트 바로 밑에 저장된다.
        ) {
            out.writeInt(1000); // 다양한 타입을 쓸수있다. (ex. 정수값으로 저장) - 4바이트로 저장
            out.writeBoolean(true); // 다양한 타입을 쓸수있다. (ex. boolean 타입으로 저장) - 1바이트로 저장
            out.writeDouble(50.5); // 다양한 타입을 쓸수있다. (ex. double 타입으로 저장) - 8바이트로 저장

            // file size: 13byte
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}

// 참고) 다양한 데이터 타입을 저장할 수 있는 DataOutputStream
// - writeInt() - 정수값으로 저장
// - writeBoolean() - boolean 값으로 저장
// - writeDouble() - double 값으로 저장
//
// 참고) try ~ with ~ resources (사용한 자원을 자동으로 종료 시켜주는 기능)
// 자바 IO 객체는, 인스턴스를 만들도 모두 사용하면 close() 메서드를 호출해야 한다.
// close 메서드를 사용자가 호출하지 않더라도, 예외가 발생하지 않았다면, 자동으로 close()가 되도록 할 수 있는 방법이 있다.
// ex) try ( // io 객체 선언 ) { // io 객체 사용 } catch (Exception ex) { ex.printStackTrace(); }
//
// 참고) 결과로 만들어진 파일을 보면, 깨져서 나올것이다.
// - 데이타 타입 자체로 저장해 두었기 때문에, 이 부분을 읽어낼 때 에도 DataInputStream 을 이용해서 해당 데이터 타입으로 읽어내야 한다. -> ByteIOExam3 참고