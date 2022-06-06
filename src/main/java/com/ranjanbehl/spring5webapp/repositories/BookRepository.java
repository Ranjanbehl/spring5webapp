package com.ranjanbehl.spring5webapp.repositories;

import com.ranjanbehl.spring5webapp.domain.Book;
import org.springframework.data.repository.CrudRepository;

public interface BookRepository extends CrudRepository<Book,Long> {
}
