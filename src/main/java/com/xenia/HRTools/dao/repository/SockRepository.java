package com.xenia.HRTools.dao.repository;

import com.xenia.HRTools.model.entity.SockEntity;
import org.springframework.data.jpa.repository.JpaRepository;

public interface SockRepository extends JpaRepository<SockEntity,Long> {
    public Integer countByColorAndCompoudAndSize(String color,Integer compound,Integer size);
    public Integer countByColorAndCompoudGreaterThanAndSize(String color,Integer compound,Integer size);
}
