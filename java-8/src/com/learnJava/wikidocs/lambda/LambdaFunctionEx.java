package com.learnJava.wikidocs.lambda;


/*
    자바 8부터 지원하는 함수 구현과 호출 만으로 프로그래밍 하는 함수형 프로그래밍 방식 지원
    이름이 없는 익명 함수
    함수적 인터페이스로 구현
    Kotlin, Scala 같은 언어도 객체지향 + 함수형 언어

    타입 생략 가능
    매개변수가 한개라면 괄호도 생략 가능
    매개변수가 없는 경우는 괄호 생략 불가
    실행문이 한개라면 중괄호도 생략 가능

    (타입 매개변수...) -> {
        실행문 ..
    }

    () -> {}
*/
public class LambdaFunctionEx {
    public static void main(String[] args) {
        InterfaceEx ie1 = Integer::sum;
        InterfaceEx ie2 = (int x, int y) -> x - y;
        InterfaceEx ie3 = (int x, int y) -> x * y;
        InterfaceEx ie4 = (int x, int y) -> x / y;
        System.out.println(ie1.calc(5,4));
        System.out.println(ie2.calc(5,4));
        System.out.println(ie3.calc(5,4));
        System.out.println(ie4.calc(5,4));
    }
}

interface InterfaceEx {
    public int calc(int x, int y);
}
