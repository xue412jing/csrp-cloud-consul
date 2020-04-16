package csrp.york.service;

import java.util.List;

import org.csrp.cloud.entity.OrderBean;
import org.csrp.cloud.entity.TbSupplierBean;

public interface ICumsterService {
	 OrderBean getOrderById(String id);
	 List<TbSupplierBean> selectList();
}
