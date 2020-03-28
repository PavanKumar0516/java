package com.servlets;

public class Service {
	ModelDAO dao=new ModelDAO();
public int addUser(User bean) {
		
		
		return dao.addUser(bean);
	}
}
