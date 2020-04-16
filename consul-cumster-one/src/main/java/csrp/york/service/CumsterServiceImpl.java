package csrp.york.service;

import java.util.List;

import javax.annotation.Resource;

import org.csrp.cloud.entity.OrderBean;
import org.csrp.cloud.entity.TbSupplierBean;
import org.springframework.stereotype.Service;

import com.york.provider.IProviderService;

@Service("cumsterService")
public class CumsterServiceImpl implements ICumsterService {

	@Resource
	private IProviderService iProviderService;

	@Override
	public List<TbSupplierBean> selectList() {
		return iProviderService.selectList();
	}

	@Override
	public OrderBean getOrderById(String id) {
		return iProviderService.getOrderById(id);
	}
	
}
