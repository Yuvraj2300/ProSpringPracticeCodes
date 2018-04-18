package com.mvc.services;

import java.util.ArrayList;
import java.util.List;


import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.google.common.collect.Lists;
import com.mvc.entities.Singer;
import com.mvc.repo.SingerRepository;

@Transactional
@Service("singerService")
public class SingerServiceImpl implements	SingerService{

	private	SingerRepository	singerRep;
	
	@Override
	@Transactional(readOnly=true)
	public ArrayList<String> findAll() {
		return Lists.newArrayList(singerRep.findAll());
	}

	@Override
	public Singer findOneSinger(Long id) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Singer save(String singer) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Page<Singer> findAllByPage(Pageable pageable) {
		// TODO Auto-generated method stub
		return null;
	}

}
