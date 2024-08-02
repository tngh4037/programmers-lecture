package io;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

// Byte 단위 입출력 클래스 ( Byte 단위 입출력 클래스는 클래스의 이름이 InputStream이나 OutputStream으로 끝난다. )
public class ByteIOExam1 {

    public static void main(String[] args) {
        long startMs = System.currentTimeMillis();

        FileInputStream fis = null; // 파일로 부터 읽어오기 위한 객체 (읽어들이기 위한 객체 from file)
        FileOutputStream fos = null; // 파일에 쓸수 있게 해주는 객체 (쓰기 위한 객체 to file)

        try {
            fis = new FileInputStream("src/io/ByteIOExam1.java"); // FileInputStream는 파일이 없을 경우에 FileNotFoundException 예외를 발생시킨다. ( FileNotFoundException 이외에도 예외가 발생할 수 있어서, Exception 을 캐치로 잡아주자. )  |  참고) 기본 경로는 프로젝트 위치이다.
            fos = new FileOutputStream("byte.txt"); // 참고) 기본 경로는 프로젝트 위치이다.

            int readCount = -1;
            while ((readCount = fis.read()) != -1) { // 아래 참고
                fos.write(readCount);
            }
        } catch (Exception e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        } finally { // IO의 모든 객체들은 인스턴스화 하고 나면 반드시 닫아주어야 한다.
            try {
                fos.close();
            } catch (IOException e) {
                // TODO Auto-generated catch block
                e.printStackTrace();
            }

            try {
                fis.close();
            } catch (IOException e) {
                // TODO Auto-generated catch block
                e.printStackTrace();
            }
        }

        long endMs = System.currentTimeMillis();
        System.out.println((endMs - startMs) + "ms");
    }
}

// 파일로 부터 1byte씩 읽어들여 파일에 1byte씩 저장하는 프로그램을 작성 ( FileInputStream / FileOutputStream )
// - 파일로 부터 읽어오기 위한 객체 - FileInputStream
// - 파일에 쓸수 있게 해주는 객체 - FileOutputStream
//
// 참고) FileInputStream - read() 메서드
// - FileInputStream 의 read() 메서드는 한 바이트씩 읽는다.
// - read() 메소드가 리턴하는 타입은 정수이다. ( 정수의 4바이트 중에서 마지막 바이트에다가, 읽어들인 1바이트를 저장한다.) ( byte를 리턴한다면, 끝을 나타내는 값을 표현할 수가 없기 때문에, byte가 아닌 int를 리턴한다. )
// - read() 메소드는 더이상 읽어들일 것이 없을때 -1을 리턴한다. ( 음수의 경우 맨 좌측 비트가 1이 된다. 읽어들일 것이 있다면 항상 양수를 리턴한다고 볼 수 있다. )
