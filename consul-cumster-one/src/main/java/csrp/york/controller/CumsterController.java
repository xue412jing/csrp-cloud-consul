package csrp.york.controller;

import java.util.List;

import org.csrp.cloud.entity.OrderBean;
import org.csrp.cloud.entity.TbSupplierBean;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.york.provider.IProviderService;

import csrp.york.service.ICumsterService;

@RestController
@RequestMapping("cumster")
public class CumsterController {

//	@Autowired
//	private ICumsterService cumsterService;
	@Autowired
	private IProviderService iProviderService;
	@GetMapping("getOrderById/{id}")
	public OrderBean getOrderById(@PathVariable("id") String id){
		OrderBean bean = iProviderService.getOrderById(id);
		return bean;
	}
	@GetMapping("selectList")
	public List<TbSupplierBean> selectList(){
		List<TbSupplierBean>  list = iProviderService.selectList();
		return list;
	}
	
}
