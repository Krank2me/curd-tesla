package com.tesla.crud.person;

import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class PersonService {

  /*public List<String> getNamesV1() {
    return List.of(
        "Frank",
        "Leydi",
        "Liz",
        "Melissa",
        "Diego",
        "Carlos"
    );
  }*/

  public List<Person> getNames() {
    return List.of(
        new Person(
            123L,
            "Frank",
            "Betancur",
            38,
            101010,
            "Masculino",
            "panda@emial.com"

        ),
        new Person(
            1234L,
            "Panda",
            "Betancur",
            38,
            202020,
            "Masculino",
            "panda@email.com"
        )
    );
  }

  public List<String> getPets() {
    return List.of(
        "Cat",
        "Dog",
        "Fish",
        "Bird"
    );
  }
}
