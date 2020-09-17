package com.anup.scalecars.repositories;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.anup.scalecars.model.Scalemaster;

@Repository
public interface ScalemasterRepository extends CrudRepository<Scalemaster, Long>{

}
