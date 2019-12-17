package com.saul.repo;
import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import com.saul.model.User;

public interface UserRepo extends JpaRepository<User, Integer>, UserRepoCustom{

	public List<User> findByNombre(String nombre);
}
