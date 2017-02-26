package com.cmd.db.repository;

import org.springframework.data.repository.CrudRepository;

import com.cmd.db.model.AgeRecord;

public interface AgeRepository extends CrudRepository<AgeRecord, String>{}