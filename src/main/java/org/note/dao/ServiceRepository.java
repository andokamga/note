package org.note.dao;

import org.note.entity.Eservice;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

@RepositoryRestResource
public interface ServiceRepository extends JpaRepository<Eservice, Long> {

}
