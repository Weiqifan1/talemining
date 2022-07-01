package com.talemining.taleminingapiproject.mandarin.repositories;

import com.talemining.taleminingapiproject.mandarin.entities.CcedictEntity;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface CcedictRepository extends CrudRepository<CcedictEntity, Long> {
}
