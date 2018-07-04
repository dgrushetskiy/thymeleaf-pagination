package ru.gothmog.springthymeleafpagination.repository;

import org.springframework.data.repository.PagingAndSortingRepository;
import ru.gothmog.springthymeleafpagination.domain.Person;

public interface PersonRepository extends PagingAndSortingRepository<Person, Long> {
}
