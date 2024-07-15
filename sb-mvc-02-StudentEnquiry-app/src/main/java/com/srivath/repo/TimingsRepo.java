package com.srivath.repo;

import org.springframework.data.jpa.repository.JpaRepository;

import com.srivath.entity.TimingsEntity;

public interface TimingsRepo extends JpaRepository<TimingsEntity, Integer>{

}
