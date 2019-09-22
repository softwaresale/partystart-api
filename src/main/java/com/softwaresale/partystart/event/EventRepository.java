package com.softwaresale.partystart.event;

import java.util.List;

import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.query.Param;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

@RepositoryRestResource
public interface EventRepository extends CrudRepository<Event, Long> {
	List<Event> findByName(@Param("name") String name);
}
