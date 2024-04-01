package com.dao;

import java.util.List;

import javax.transaction.Transactional;
import org.springframework.orm.hibernate5.HibernateTemplate;
import org.springframework.stereotype.Component;

import com.model.User;

@Component
public class UserDao {
	private HibernateTemplate hibernateTemplate;

	public HibernateTemplate getHibernateTemplate() {
		return hibernateTemplate;
	}

	public void setHibernateTemplate(HibernateTemplate hibernateTemplate) {
		this.hibernateTemplate = hibernateTemplate;
	}
	
	@Transactional
	public void inserOrUpdatetUser(User u) {
		this.hibernateTemplate.saveOrUpdate(u);
	}
	@Transactional
	public void deleteUser(User m) {
		this.hibernateTemplate.delete(m);
	}
	public User getUserById(int id) {
		return this.hibernateTemplate.get(User.class, id);
	}
	
	public List<User> getAllUsers(){
		return this.hibernateTemplate.loadAll(User.class);
	}
	
}
