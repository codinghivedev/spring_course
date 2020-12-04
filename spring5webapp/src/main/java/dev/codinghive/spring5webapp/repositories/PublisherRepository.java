package dev.codinghive.spring5webapp.repositories;

import dev.codinghive.spring5webapp.domain.Publisher;
import org.springframework.data.repository.CrudRepository;

public interface PublisherRepository extends CrudRepository<Publisher,Long> {
}
