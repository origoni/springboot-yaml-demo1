package com.millky.demo.springboot.yaml;

import lombok.Data;

import java.time.ZonedDateTime;
import java.util.List;

@Data
public class TestData {

    String string;

    int anInt;

    List<String> strings;

    ZonedDateTime createAt;
}
