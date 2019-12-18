package com.yxx.j_annotation;

import org.springframework.stereotype.Repository;

@Repository
public class UserDAOImpl implements IUserDAO {

	@Override
	public void save(User user) {
		// TODO Auto-generated method stub
		System.out.println("UserDAOImpl.save()");
	}
	

}
