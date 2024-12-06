package com.programmers;

import com.programmers.domain.system.controller.SystemController.SystemController;
import com.programmers.domain.wiseSaying.controller.WiseSayingController;

import java.util.Scanner;

public class App {
    private final Scanner scanner;
    private final SystemController systemController;
    private final WiseSayingController wiseSayingController;

    public App(Scanner scanner){
        this.scanner = scanner;
        this.systemController = new SystemController();
        this.wiseSayingController = new WiseSayingController(scanner);
    }
    public void run() {
        System.out.println("== 명언 앱 ==");

        while ( true ) {
            System.out.print("명령) ");
            String cmd = scanner.nextLine();

            // 삭제?id=3&name=홍길동&age=20 처럼 ?를 기준으로 왼쪽이 명령 오른쪽이 옵션임.
            String[] cmdBits = cmd.split("\\?");
            String actionName = cmdBits[0];

            if("종료".equals(actionName)) {
                systemController.actionExit();
                break;
            } else if ("등록".equals(actionName)) {
                wiseSayingController.actionAdd();
            } else if ("목록".equals(actionName)) {
                wiseSayingController.actionList();
            } else if ("삭제".equals(actionName)) {
                wiseSayingController.actionDelete(cmd);
            }
        }
    }
}
