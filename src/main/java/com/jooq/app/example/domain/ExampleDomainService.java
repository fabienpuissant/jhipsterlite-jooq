package com.jooq.app.example.domain;

import org.springframework.stereotype.Service;

@Service
public class ExampleDomainService {

  private final ExampleRepository examples;


  public ExampleDomainService(ExampleRepository examples) {
    this.examples = examples;
  }

  public ExampleDto create() {
    ExampleDto exampleDto = new ExampleDto("name");
    return examples.create(exampleDto);
  }
}
