package com.talemining.taleminingapiproject.mandarin.repositories;

import com.talemining.taleminingapiproject.mandarin.entities.JundaEntity;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface JundaRepository extends CrudRepository<JundaEntity, Long> {
}
