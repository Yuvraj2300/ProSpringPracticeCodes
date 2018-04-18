package com.mvc.repo;

import org.springframework.data.repository.PagingAndSortingRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface SingerRepository extends PagingAndSortingRepository<String, Long> {

}
