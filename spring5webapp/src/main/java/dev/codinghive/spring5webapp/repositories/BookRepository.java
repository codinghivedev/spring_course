package dev.codinghive.spring5webapp.repositories;

import dev.codinghive.spring5webapp.domain.Book;
import org.springframework.data.repository.CrudRepository;

public interface BookRepository extends CrudRepository<Book,Long> {
}
