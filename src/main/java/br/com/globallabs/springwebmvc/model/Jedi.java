package br.com.globallabs.springwebmvc.model;

import javax.validation.constraints.NotBlank;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class Jedi {

  @NotBlank
  private String name;
  
  @NotBlank
  private String lastName;

  public Jedi() {}

  public Jedi(final String name, final String lastName) {
    this.name = name;
    this.lastName = lastName;
  }
}
