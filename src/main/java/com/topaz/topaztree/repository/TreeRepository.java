package com.topaz.topaztree.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface TreeRepository extends CrudRepository<TreeEntity, Long> {
    List<TreeEntity> findById(long id);
}
