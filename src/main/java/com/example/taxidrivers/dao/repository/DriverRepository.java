package com.example.taxidrivers.dao.repository;

import com.example.taxidrivers.dao.entity.DriverEntity;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface DriverRepository extends CrudRepository<DriverEntity,Long> {
}
