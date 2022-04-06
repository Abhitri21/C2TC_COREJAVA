package com.cg.smms.service;


import com.cg.smms.entities.OrderDetails;

public interface IOrderDetailsService {
	OrderDetails addOrder(OrderDetails order);

	OrderDetails updateOrder(OrderDetails order);

	OrderDetails searchOrder(int id);

	Boolean cancelMall(int id);



}