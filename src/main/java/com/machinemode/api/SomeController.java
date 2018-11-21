package com.machinemode.api;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;


@RestController
public class SomeController {

    @RequestMapping("/foo")
    public String foo() {
        return "foo";
    }

    @RequestMapping("/bar")
    public String bar() {
        return "bar";
    }
}
