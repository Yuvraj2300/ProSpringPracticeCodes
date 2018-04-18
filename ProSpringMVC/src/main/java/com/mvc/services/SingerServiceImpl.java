package com.mvc.services;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
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
	public ArrayList<Singer> findAll() {
		return Lists.newArrayList(singerRep.findAll());
	}

	@Override
	@Transactional(readOnly=true)
	public Singer findOneSinger(Long id) {
		// TODO Auto-generated method stub
		return singerRep.findById(id).get();
	}

	@Override
	public Singer save(Singer singer) {
		// TODO Auto-generated method stub
		return singerRep.save(singer);
	}

	@Override
	@Transactional(readOnly=true)
	public Page<Singer> findAllByPage(Pageable pageable) {
		// TODO Auto-generated method stub
		return singerRep.findAll(pageable);
	}

	public SingerRepository getSingerRep() {
		return singerRep;
	}

	@Autowired
	public void setSingerRep(SingerRepository singerRep) {
		this.singerRep = singerRep;
	}
	
	

}
