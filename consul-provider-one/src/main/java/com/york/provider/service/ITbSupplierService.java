package com.york.provider.service;

import java.util.List;

import org.csrp.cloud.entity.TbSupplierBean;

public interface ITbSupplierService {

	public TbSupplierBean getById(String id);
	 
	 public List<TbSupplierBean> selectList();
}
