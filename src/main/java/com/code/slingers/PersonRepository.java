package com.code.slingers;

import com.code.slingers.domain.Person;
import org.springframework.data.repository.PagingAndSortingRepository;


public interface PersonRepository extends PagingAndSortingRepository<Person, Long> {
}
