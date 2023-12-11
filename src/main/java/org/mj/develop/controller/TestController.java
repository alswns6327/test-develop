package org.mj.develop.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class TestController {

    @GetMapping("/test")
    public String test(){

        String a = """
                aads bb "cdsc"
                """;
        return a;
    }

    @GetMapping("/test2")
    public String test2(){

        String b = """
                %d
                  %d
                   %s
                    %c
                """.formatted(12, 30, "323", 'b');

        TestRecord testRecord = new TestRecord("mj", "mjmj");
        System.out.println("testRecord.name()");
        System.out.println(testRecord.name());
        System.out.println(testRecord.nickname());
        System.out.println(testRecord.name);
        System.out.println(testRecord.nickname);

        return b;
    }

    record TestRecord(String name, String nickname){

    }


}
