package com.york.provider.mapper;

import java.util.List;

import org.apache.ibatis.annotations.Mapper;
import org.csrp.cloud.entity.TbSupplierBean;
@Mapper
public interface TbSupplierDao {
 public TbSupplierBean getById(String id);
 
 public List<TbSupplierBean> selectList();
}
