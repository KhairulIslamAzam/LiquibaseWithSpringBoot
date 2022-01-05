package com.bs23.controller;

import com.bs23.entity.Person;
import com.bs23.service.PersonService;
import org.springframework.web.bind.annotation.*;
import java.util.List;

/**
 * @author Khairul Islam Azam
 * @since 1.0.0
 */

@RestController
@RequestMapping("/person")
public class PersonController {

    final PersonService personService;

    public PersonController(PersonService personService) {
        this.personService = personService;
    }

    @GetMapping("/")
    public List<Person> getAll(){
        return this.personService.getAll();
    }

    @GetMapping("/name")
    public Person getPerson(@RequestParam("name") String name){
        return this.personService.getPersonByName(name);
    }

    @PostMapping("/save")
    public Person save(@RequestBody Person person){
        return this.personService.save(person);
    }
}
