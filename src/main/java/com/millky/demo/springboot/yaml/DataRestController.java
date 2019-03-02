package com.millky.demo.springboot.yaml;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

import java.time.ZonedDateTime;
import java.util.ArrayList;
import java.util.List;

@RestController
public class DataRestController {

    List<TestData> dataList = new ArrayList<>();

    //    curl -d '{"string":"yaml-demo","an_int":1,"strings":["demoA","demoB"]}' -H 'Content-Type: application/json' http://localhost:8080
    @PostMapping
    @ResponseStatus(value = HttpStatus.CREATED)
    public TestData create(@RequestBody TestData data) {
        data.setCreateAt(ZonedDateTime.now());
        dataList.add(data);
        return data;
    }

    //    curl http://localhost:8080
    //    curl -H "Accept: text/yaml" http://localhost:8080
    @GetMapping
    public List<TestData> list() {
        return dataList;
    }
}
