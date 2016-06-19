package cn.itcast.jk.dao.impl;

import org.springframework.stereotype.Repository;

import cn.itcast.jk.dao.FactoryDao;
import cn.itcast.jk.domain.Factory;

@Repository
public class FactoryDaoImpl extends BaseDaoImpl<Factory> implements FactoryDao {
	//利用默认构造方法初始化命名空间
	public FactoryDaoImpl() {
		super.setNs("cn.itcast.jk.mapper.FactoryMapper");
	}
}
