package com.york.provider;

import java.util.List;

import org.csrp.cloud.entity.OrderBean;
import org.csrp.cloud.entity.TbSupplierBean;
import org.springframework.cloud.netflix.feign.FeignClient;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@FeignClient("csrp-provider")
public interface IProviderService {
	 @RequestMapping(value="/order/selectList",method=RequestMethod.GET )
	 List<TbSupplierBean> selectList();
	 @RequestMapping(value="/order/getOrderById/{id}",method=RequestMethod.GET )
	 OrderBean getOrderById(@PathVariable("id") String id);
}
