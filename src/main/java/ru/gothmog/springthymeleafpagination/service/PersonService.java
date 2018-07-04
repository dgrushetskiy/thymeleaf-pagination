package ru.gothmog.springthymeleafpagination.service;

import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import ru.gothmog.springthymeleafpagination.domain.Person;

public interface PersonService {

    Page<Person> findAllPageable(Pageable pageable);
}
