package com.jooq.app.example.application;

import com.jooq.app.example.domain.ExampleDomainService;
import com.jooq.app.example.domain.ExampleDto;
import org.springframework.stereotype.Service;

@Service
public class ExampleApplicationService {

  private final ExampleDomainService examples;

  public ExampleApplicationService(ExampleDomainService examples) {
    this.examples = examples;
  }

  public ExampleDto create() {
    return examples.create();
  }
}
