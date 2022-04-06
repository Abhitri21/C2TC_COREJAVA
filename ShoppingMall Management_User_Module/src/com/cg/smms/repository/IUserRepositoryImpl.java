package com.cg.smms.repository;

import javax.persistence.EntityManager;

import com.cg.smms.entities.User;

public class IUserRepositoryImpl implements IUserRepository

{
	
    //Step 1: Start JPA LifeCycle
	private EntityManager entityManager;
	
    public IUserRepositoryImpl() 
     {
		entityManager=JPAUtil.getEntityManager();
	}
    
    //Create Operation- In Repository
	@Override
	public User addUser(User user)       
	{
	   entityManager.persist(user);
		return user;
	}

	@Override
	public User updateUser(User user) 
	{
		entityManager.merge(user);
		return user;
	}

	@Override
	public User deleteUser(int id) 
	{
		User user = entityManager.find(User.class,id);
		entityManager.remove(user);
		return null;
	}

	@Override
	public void beginTransaction() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void addNewUser(User user) {
		// TODO Auto-generated method stub
		
	}

}
