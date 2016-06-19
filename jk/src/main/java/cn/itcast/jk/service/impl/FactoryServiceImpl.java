package cn.itcast.jk.service.impl;

import java.io.Serializable;
import java.util.List;
import java.util.Map;
import java.util.UUID;

import javax.annotation.Resource;

import org.springframework.stereotype.Service;

import cn.itcast.jk.dao.FactoryDao;
import cn.itcast.jk.pagination.Page;
import cn.itcast.jk.service.FactoryService;

@Service
public class FactoryServiceImpl implements FactoryService {
	@Resource
	FactoryDao factoryDao;

	@Override
	public List<cn.itcast.jk.domain.Factory> findPage(Page page) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<cn.itcast.jk.domain.Factory> find(Map paraMap) {
		return factoryDao.find(paraMap);
	}

	@Override
	public cn.itcast.jk.domain.Factory get(Serializable id) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void insert(cn.itcast.jk.domain.Factory entity) {
		entity.setId(UUID.randomUUID().toString());
		factoryDao.insert(entity);
	}

	@Override
	public void update(cn.itcast.jk.domain.Factory entity) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void deleteById(Serializable id) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void delete(Serializable[] ids) {
		// TODO Auto-generated method stub
		
	}

}
