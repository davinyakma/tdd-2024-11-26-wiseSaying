package com.programmers.domain.wiseSaying.controller;

import com.programmers.AppTest;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import java.util.Arrays;

import static org.assertj.core.api.Assertions.assertThat;

public class WiseSayingControllerTest {
    @Test
    @DisplayName("== 명언 앱 ==")
    public void t1() {
        String output = AppTest.run("종료");

        assertThat(output)
                .contains("== 명언 앱 ==");
    }

    @Test
    @DisplayName("명령) ")
    public void t2() {
        String output = AppTest.run("""
                목록
                종료
                """);

        assertThat(output)
                .contains("명령) ");
    }

    @Test
    @DisplayName("명령을 2번 이상 입력할 수 있습니다.")
    public void t3() {
        String output = AppTest.run("""
                목록
                목록
                종료
                """);

        System.out.println(
                Arrays.toString(output.split("명령\\)"))
        );

        String[] split = output.split("명령\\)"); //'명령) '을 기준으로 split(나누면) 그룹이 4개가 생김.
        assertThat(split).hasSize(4);
    }
}
