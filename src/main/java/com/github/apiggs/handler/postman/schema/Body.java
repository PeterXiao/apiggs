package com.github.apiggs.handler.postman.schema;

import lombok.Getter;
import lombok.Setter;

import java.util.ArrayList;
import java.util.List;

@Getter
@Setter
public class Body{

    BodyMode mode;
    String raw;
    List<Parameter> urlencoded = new ArrayList<>();
    List<Parameter> formdata = new ArrayList<>();

}
