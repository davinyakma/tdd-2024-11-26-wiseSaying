package com.programmers;

import java.io.ByteArrayInputStream;
import java.io.InputStream;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        //lab1();
        lab2();
    }

    private static void lab1() {
        Scanner scanner = new Scanner(System.in);

        System.out.print("명령) ");
        String cmd = scanner.nextLine().trim(); //공백 제거

        System.out.println("입력한 명령: " + cmd);
    }

    private static void lab2() {
        InputStream in = new ByteArrayInputStream("안녕\n잘가".getBytes()); //줄바꿈 때문에 '안녕''잘가'로 두 줄 선 입력
        Scanner scanner = new Scanner(in);

        System.out.println("명령) ");
        String cmd = scanner.nextLine().trim(); //선 입력한 문자열을 스캐너가 받아온다. 새로운 명령을 기다리지 않음.

        System.out.println("입력한 명령: " + cmd);
        
        System.out.println("명령) ");
        cmd = scanner.nextLine().trim(); 

        System.out.println("입력한 명령: " + cmd);
    }
}