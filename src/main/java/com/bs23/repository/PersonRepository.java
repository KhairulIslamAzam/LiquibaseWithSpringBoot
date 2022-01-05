package com.bs23.repository;

import com.bs23.entity.Person;
import org.springframework.data.jpa.repository.JpaRepository;
import java.util.Optional;

/**
 * @author Khairul Islam Azam
 * @since 1.0.0
 */

public interface PersonRepository extends JpaRepository<Person, Long> {
    Optional<Person> findByName(String name);
}
