package com.tesla.crud.person;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping(path = "api/v1/person")
public class PersonController {

  private final PersonService personService;

  @Autowired
  public PersonController(PersonService personService) {
    this.personService = personService;
  }

  /*@GetMapping(path = "/getNames")
  public List<Person> getNamesV1() {
    return personService.getNamesV1();
  }
	*/

  @GetMapping(path = "/getNames")
  public List<Person> getNames() {
    return personService.getNames();
  }


  @GetMapping(path = "/getPets")
  public List<String> getPets() {
    return personService.getPets();
  }

}
