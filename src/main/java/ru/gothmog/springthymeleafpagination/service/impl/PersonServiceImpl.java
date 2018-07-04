package ru.gothmog.springthymeleafpagination.service.impl;

import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;
import ru.gothmog.springthymeleafpagination.domain.Person;
import ru.gothmog.springthymeleafpagination.repository.PersonRepository;
import ru.gothmog.springthymeleafpagination.service.PersonService;

@Service
public class PersonServiceImpl implements PersonService {

    private final PersonRepository personRepository;

    public PersonServiceImpl(PersonRepository personRepository) {
        this.personRepository = personRepository;
    }

    @Override
    public Page<Person> findAllPageable(Pageable pageable) {
        return personRepository.findAll(pageable);
    }
}
