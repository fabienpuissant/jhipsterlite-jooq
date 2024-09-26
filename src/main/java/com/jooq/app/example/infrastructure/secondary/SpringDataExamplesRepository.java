package com.jooq.app.example.infrastructure.secondary;

import com.jooq.app.example.domain.ExampleDto;
import com.jooq.app.example.domain.ExampleRepository;
import org.jooq.DSLContext;
import org.springframework.stereotype.Repository;

import static org.jooq.codegen.maven.example.tables.Example.EXAMPLE;

@Repository
public class SpringDataExamplesRepository implements ExampleRepository {

  private final DSLContext dsl;

  public SpringDataExamplesRepository(DSLContext  dsl) {
    this.dsl = dsl;
  }

  @Override
  public ExampleDto create(ExampleDto exampleDto) {
    return dsl.insertInto(EXAMPLE)
      .set(EXAMPLE.ID, exampleDto.id())
      .set(EXAMPLE.NAME, exampleDto.name())
      .returning()
      .fetchOne(record -> new ExampleDto(record.getId(), record.getName()));
  }
}
