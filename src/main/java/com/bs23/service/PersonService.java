package com.bs23.service;

import com.bs23.entity.Person;
import com.bs23.repository.PersonRepository;
import org.springframework.stereotype.Service;
import java.util.List;

/**
 * @author Khairul Islam Azam
 * @since 1.0.0
 */
@Service
public class PersonService {
    final PersonRepository personRepository;

    public PersonService(PersonRepository personRepository) {
        this.personRepository = personRepository;
    }

    public List<Person> getAll(){
        return this.personRepository.findAll();
    }

    public Person save(Person person){
        return this.personRepository.save(person);
    }

    public Person getPersonByName(String name){
        return this.personRepository.findByName(name).get();
    }
}
