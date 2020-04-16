package com.york.provider.controller;

import java.util.List;

import javax.annotation.Resource;

import org.csrp.cloud.entity.OrderBean;
import org.csrp.cloud.entity.TbSupplierBean;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.york.provider.service.ITbSupplierService;

@RestController
@RequestMapping("order")
public class OrderController {
	@Resource
	private ITbSupplierService tbSupplierService;
	@GetMapping("getOrderById/{id}")
	public OrderBean getOrderById(@PathVariable("id") String id){
		OrderBean bean = new OrderBean(id, "one_001", "生产者01产生");
		return bean;
	}
	@GetMapping("getById/{id}")
	public TbSupplierBean getById(@PathVariable("id") String id){
		TbSupplierBean bean = tbSupplierService.getById(id);
		return bean;
	}
	@GetMapping("selectList")
	public List<TbSupplierBean> selectList(){
		List<TbSupplierBean> bean = tbSupplierService.selectList();
		return bean;
	}
}
