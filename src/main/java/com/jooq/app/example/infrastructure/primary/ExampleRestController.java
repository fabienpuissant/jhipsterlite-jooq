package com.jooq.app.example.infrastructure.primary;

import com.jooq.app.example.application.ExampleApplicationService;
import com.jooq.app.example.domain.ExampleDto;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

//Do not include into Jhipster: personal playground
@RestController
@RequestMapping("/examples")
public class ExampleRestController {

  private final ExampleApplicationService examples;

  public ExampleRestController(ExampleApplicationService examples) {
    this.examples = examples;
  }

  @PostMapping
  public ExampleDto createExample() {
    return examples.create();
  }

}
