package br.com.globallabs.springwebmvc.model;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class Jedi {

  private String name;
  private String lastName;

  public Jedi() {}

  public Jedi(final String name, final String lastName) {
    this.name = name;
    this.lastName = lastName;
  }
}
