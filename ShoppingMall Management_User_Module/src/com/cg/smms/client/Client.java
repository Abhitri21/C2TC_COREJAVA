package com.cg.smms.client;

import com.cg.smms.entities.User;
import com.cg.smms.service.IUserService;
import com.cg.smms.service.IUserServiceImpl;

public class Client {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//		UserRepositoryImpl uri = new UserRepositoryImpl();
		IUserService service = new IUserServiceImpl();

		User u = new User();
		u.setId(1);
		u.setName("Prathamesh");
		u.setPassword("1234");
		u.setType("prime");

		service.addNewUser(u);
		
//		uri.beginTransaction();
//		User r = uri.searchUser(u);
//		System.out.println(r.getName());
//		uri.commitTransaction();
		
		
//		User CRUD operation done
		

		
		
	}

}
