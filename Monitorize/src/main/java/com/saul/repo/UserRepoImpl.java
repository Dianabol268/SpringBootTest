package com.saul.repo;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.Query;

import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;
import com.saul.model.User;


@Repository
@Transactional(readOnly = true)
public class UserRepoImpl implements UserRepoCustom{

	 @PersistenceContext
	    EntityManager entityManager;
	 
	@Override
	public List<User> containsString(String letra) {
		 Query query = entityManager.createNativeQuery("SELECT em.* FROM User as em " +
	                "WHERE em.nombre LIKE ?", User.class);
	        query.setParameter(1,"%" +  letra + "%");
	        return query.getResultList();
	}

}
