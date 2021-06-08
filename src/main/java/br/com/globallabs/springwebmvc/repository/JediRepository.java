package br.com.globallabs.springwebmvc.repository;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Repository;

import br.com.globallabs.springwebmvc.model.Jedi;

@Repository
public class JediRepository {
  
  public List<Jedi> getAllJedi() {
    
    final List<Jedi> jedi = new ArrayList<>();
    jedi.add(new Jedi("Luke", "Skywlker"));

    return jedi;
  }
}
