
package com.cg.smms.service;


import com.cg.smms.entities.OrderDetails;

import com.cg.smms.repository.IOrderDetailsRepository;

import com.cg.smms.repository.IOrderDetailsRepositoryImpl;

public class IOrderDetailsServiceImpl implements IOrderDetailsService {
	private IOrderDetailsRepository OrderDAO;
	

//	Constructor
	public IOrderDetailsServiceImpl() {
		// TODO Auto-generated constructor stub
		OrderDAO = new IOrderDetailsRepositoryImpl();
		
	}

//	addOrder
	@Override
	public OrderDetails addOrder(OrderDetails order) {
		// TODO Auto-generated method stub
		OrderDAO.beginTransaction();
		OrderDAO.addOrder(order);
		OrderDAO.commitTransaction();
		return order;
	}

//	updateOrder
	@Override
	public OrderDetails updateOrder(OrderDetails order) {
		// TODO Auto-generated method stub
		OrderDAO.beginTransaction();
		OrderDAO.updateOrder(order);
		OrderDAO.commitTransaction();
		return order;
	}

//	OrderDetails
	@Override
	public OrderDetails searchOrder(int id) {
		// TODO Auto-generated method stub
		OrderDetails order = searchOrder(id);
		return order;
	}

@Override
public Boolean cancelMall(int id) {
	// TODO Auto-generated method stub
	return null;
}

//	cancelMall
	//@Override
	//public Boolean cancelMall(int id) {
		// TODO Auto-generated method stub
//		Work pending:
		//MallDAO.beginTransaction();
//		MallDAO.cancelMall(id);
		//MallDAO.commitTransaction();
	//	return true;
	//}

//	addItem
	//@Override
	//public Item addItem(Item item) {
		// TODO Auto-generated method stub
		//ItemDAO.beginTransaction();
		//ItemDAO.addItem(item);
		//ItemDAO.commitTransaction();
	//	return item;
	//}

}