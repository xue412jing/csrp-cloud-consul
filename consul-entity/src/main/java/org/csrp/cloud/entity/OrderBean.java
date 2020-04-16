package org.csrp.cloud.entity;

public class OrderBean {
private String id;
private String orderNum;
private String orderName;
public String getId() {
	return id;
}
public void setId(String id) {
	this.id = id;
}
public String getOrderNum() {
	return orderNum;
}
public void setOrderNum(String orderNum) {
	this.orderNum = orderNum;
}
public String getOrderName() {
	return orderName;
}
public void setOrderName(String orderName) {
	this.orderName = orderName;
}
public OrderBean(String id, String orderNum, String orderName) {
	super();
	this.id = id;
	this.orderNum = orderNum;
	this.orderName = orderName;
}
public OrderBean() {
	super();
}


}
