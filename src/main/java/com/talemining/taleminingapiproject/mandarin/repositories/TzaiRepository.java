package com.talemining.taleminingapiproject.mandarin.repositories;

import com.talemining.taleminingapiproject.mandarin.entities.TzaiEntity;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface TzaiRepository extends CrudRepository<TzaiEntity, Long> {//extends CrudRepository<CharacterEntity, Integer> {
}
