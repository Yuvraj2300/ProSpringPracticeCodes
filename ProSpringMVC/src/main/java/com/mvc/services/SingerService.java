package com.mvc.services;

import java.util.ArrayList;
import java.util.List;

import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;

import com.mvc.entities.Singer;

public interface SingerService {
	ArrayList<Singer>	findAll();
	Singer	findOneSinger(Long	id);
	Singer	save(Singer	singer);
	Page<Singer> findAllByPage(Pageable pageable);

}
