package com.springboot.demo.moduleone.repo;


import java.util.List;

import javax.transaction.Transactional;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.springboot.demo.moduleone.entity.MotorBike;


@Repository
@Transactional
public class MotorBikeRepo {

	@Autowired
	private SessionFactory sessionFactory;

	private Session getSession() {
		Session session = sessionFactory.getCurrentSession();
		if (session == null) {
			session = sessionFactory.openSession();
		}
		return session;
	}

	public void saveMotorBike(MotorBike p) {
		getSession().save(p);
	}

	@SuppressWarnings("deprecation")
	public List<MotorBike> getMotorBikes() {
		return getSession().createCriteria(MotorBike.class).list();
	}
}
