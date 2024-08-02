package io;

import java.io.*;

// Char 단위 입출력 클래스 ( char 단위 입출력 클래스는 클래스 이름이 Reader나 Writer로 끝난다. )
//
// char 단위 입출력 클래스를 이용해서 파일에서 한 줄씩 입력 받아서 파일에 출력해보자.
public class CharIOExam2 {

    public static void main(String[] args) {
        BufferedReader br = null;
        PrintWriter pw = null;

        try {
            br = new BufferedReader(new FileReader("src/io/CharIOExam2.java")); // FileReader : 파일에서 입력받을 수 있는 클래스 ( FileReader 는 파일이 없을 경우에 FileNotFoundException 예외를 발생시킨다. ( FileNotFoundException 이외에도 다른 코드 등에서 갖가지 예외가 발생할 수 있어서, Exception 을 캐치로 잡아주자. )
            pw = new PrintWriter(new FileWriter("test.txt")); // 참고) new PrintWriter("test.txt"); 만으로도 가능

            String line = null;
            while ((line = br.readLine()) != null) { // 참고) 파일의 끝이 되면 null 리턴
                pw.println(line);
            }
        } catch (Exception e) {
            e.printStackTrace();
        } finally { // 항상 IO는, 열어줬으면, 닫아줘야 한다.
            pw.close();
            try {
                br.close();
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
    }
}

// 참고) 파일에서 한 줄씩 입력 받아서, 다시 파일에 출력
// - 파일에서 읽기 위해서 FileReader 클래스 이용
// - 한 줄 읽어 들이기 위해서 BufferedReader 클래스 이용
//   ㄴ BufferedReader 클래스가 가지고 있는 readLine() 메소드가 한줄씩 읽게 해준다.
//   ㄴ readLine()메소드는 읽어낼 때 더 이상 읽어 들일 내용이 없을 때 null을 리턴한다.
// - 파일에 쓰게하기 위해서 FileWriter 클래스 이용
// - 편리하게 출력하기 위해서 PrintWriter 클래스 이용
//
//
// 참고)
// - FileWriter: 파일에 쓸 수 있는 객체 ( 굉장히 단순하게 구현되어있다. )  | ( 파일에 쓰기 위해 FileWriter 클래스를 이용합니다. )
// - PrintWriter: 다양한 방법으로 출력하는 메서드들을 가지고 있다.  |  ( 편리하게 출력하기 위해 PrintWriter 클래스를 이용합니다. )
