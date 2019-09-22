package com.softwaresale.partystart.group;

import org.springframework.data.repository.CrudRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

@RepositoryRestResource(collectionResourceRel = "groups", itemResourceRel = "group", path = "/groups")
public interface EventGroupRepository extends CrudRepository<EventGroup, Long> {
}
