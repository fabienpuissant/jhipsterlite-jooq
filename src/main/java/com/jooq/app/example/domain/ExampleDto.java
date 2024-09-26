package com.jooq.app.example.domain;

import java.util.UUID;

public record ExampleDto(UUID id, String name) {
  public ExampleDto(String name) {
    this(UUID.randomUUID(), name);
  }
}
