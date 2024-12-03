package com.programmers.standard.util;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import java.io.ByteArrayOutputStream;
import java.util.Scanner;

import static org.assertj.core.api.Assertions.assertThat;

public class TestUtilTest {
    @Test
    @DisplayName("TestUtil.getScanner()") //ByteArrayInputStream없이 Scanner 생성
    public void t1() {
        Scanner scanner = TestUtil.getScanner("""
                등록
                나의 죽음을 적들에게 알리지 말라!
                이순신
                """.stripIndent().trim()); //stripIndent()는 위의 세 줄의 앞의 공백 지우기
        String cmd = scanner.nextLine();
        String content = scanner.nextLine();
        String author = scanner.nextLine();

        assertThat(cmd).isEqualTo("등록");
        assertThat(content).isEqualTo("나의 죽음을 적들에게 알리지 말라!");
        assertThat(author).isEqualTo("이순신");
    }

    @Test
    @DisplayName("TestUtil.setOutToByteArray()")
    public void t2() {
        ByteArrayOutputStream byteArrayOutputStream = TestUtil.setOutToByteArray(); //모니터로 출력 안됨.

        System.out.println("2 / 이순신 / 나의 죽음을 적들에게 알리지 말라!");

        String out = byteArrayOutputStream.toString().trim();
        TestUtil.clearSetOutToByteArray(byteArrayOutputStream); //화면에 보이게끔 clear함.

        assertThat(out).isEqualTo("2 / 이순신 / 나의 죽음을 적들에게 알리지 말라!");
        System.out.println("이제는 화면에 출력됩니다.");
    }
}
