package com.mvc.repo;

import org.springframework.data.repository.PagingAndSortingRepository;
import org.springframework.stereotype.Repository;

import com.mvc.entities.Singer;

@Repository
public interface SingerRepository extends PagingAndSortingRepository<Singer, Long> {

}
