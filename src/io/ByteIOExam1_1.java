package io;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

// ByteIOExam1 에서는 1바이트씩 읽어서, 1바이트씩 써보았다. 이번에는 1바이트씩 읽어들이는 것을 512바이트씩 읽어들일 수 있도록 개선해보자.
//
// Byte 단위 입출력 심화: 파일로 부터 512byte씩 읽어들여 파일에 512byte씩 저장하는 프로그램을 작성
// - byte[] buffer = new byte[512];
// - 512byte만큼 읽어 들이기 위해 byte배열을 사용
public class ByteIOExam1_1 {

    public static void main(String[] args) {
        long startMs = System.currentTimeMillis();

        FileInputStream fis = null;
        FileOutputStream fos = null;

        try {
            fis = new FileInputStream("src/io/ByteIOExam1.java");
            fos = new FileOutputStream("byte.txt");

            int readCount = -1;
            byte[] buffer = new byte[512];
            while ((readCount = fis.read(buffer)) != -1) { // read(buffer) : 최대 buffer 만큼 읽어들인다.
                fos.write(buffer, 0, readCount); // buffer에 0번째부터 시작해서 readCount만큼 가져와서 쓴다.
            }
        } catch (Exception e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        } finally {
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

// 참고) Byte단위 입출력 클래스는 클래스의 이름이 InputStream이나 OutputStream으로 끝난다.
