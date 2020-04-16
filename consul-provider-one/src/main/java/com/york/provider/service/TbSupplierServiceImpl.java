package com.york.provider.service;

import java.util.List;

import javax.annotation.Resource;

import org.csrp.cloud.entity.TbSupplierBean;
import org.springframework.stereotype.Service;

import com.york.provider.mapper.TbSupplierDao;
@Service("tbSupplierService")
public class TbSupplierServiceImpl implements ITbSupplierService {
	@Resource
	private TbSupplierDao tbSupplierDao;
	@Override
	public TbSupplierBean getById(String id) {
		TbSupplierBean bean = tbSupplierDao.getById(id);
		if(bean == null){
			throw new RuntimeException("没有查询到数据！1111111111111111");
		}
		bean.setSource("one");
		return bean;
	}

	@Override
	public List<TbSupplierBean> selectList() {
		return tbSupplierDao.selectList();
	}

	
}
