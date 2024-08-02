package io;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

// Char 단위 입출력 클래스 ( char 단위 입출력 클래스는 클래스 이름이 Reader나 Writer로 끝난다. )
//
// char 단위 입출력 클래스를 이용해서 키보드로 부터 한줄 입력 받아서 (콘솔)에 출력해보자.
public class CharIOExam1 { // Char 단위 입출력 (콘솔)

    public static void main(String[] args) {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in)); // 키보드로 부터 한줄씩 입력받는다.

        String line = null;
        try {
            line = br.readLine(); // 키보드로 부터 입력받은 값을 읽어와서 line에 넣어준다.
        } catch (IOException e) {
            e.printStackTrace();
        }
        System.out.println(line);
    }
}

// 참고) BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
// System.in - 키보드를 의미 ( System.in 타입: InputStream )
// BufferedReader - 한줄씩 입력 받기 위한 클래스
// => 즉, 한줄을 입력 받으려면 BufferedReader 라는 클래스를 사용해야 하고, 키보드로 부터 입력을 받기 위해서는 System.in 을 사용해야 한다.
//
// 그런데 BufferedReader 클래스의 생성자는, (System.in 의 타입인) InputStream 을 입력받는 생성자가 없다. BufferedReader 는 생성자로 Reader 객체만 받아들일 수 있다.
// 따라서, System.in 은 InputStream 타입이므로, BufferedReader 의 생성자에 바로 들어갈 수 없으므로, InputStreamReader 클래스를 이용해야 한다. ( System.in 을 Reader 의 형태로 바꿔주어야 한다. 이 역할을 하는 클래스: InputStreamReader )
//
// InputStreamReader 는 Reader 를 상속받고 있다. 그리고 생성자로 InputStream 을 받는다.
