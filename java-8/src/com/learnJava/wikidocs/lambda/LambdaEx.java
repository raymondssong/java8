package com.learnJava.wikidocs.lambda;

/*
    함수적 인터페이스:
    하나의  추상메서드만 정의하는 인터페이스
    람다식이 추상메서드를 재정의 하는 개념
 */

public class LambdaEx {
    public static void main(String[] args) {
        LambdaInterface li = () -> {
            String str = "메서드 출력";
            System.out.println(str);
        };
        li.print();
    }
}


interface LambdaInterface {
    void print();
//     void print2(); // multiple non-overriding abstract methods
}