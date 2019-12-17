package com.saul.repo;

import java.util.List;

import com.saul.model.User;

public interface UserRepoCustom {
	List<User> containsString(String letra);
}
