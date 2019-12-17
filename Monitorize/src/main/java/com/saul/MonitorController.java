package com.saul;


import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.saul.model.User;
import com.saul.repo.*;


@RestController
public class MonitorController {


	@Autowired
	private UserRepo repoUsuarios;
	
	

	  @RequestMapping("/createUser")
	  @PostMapping
	  public void createUser(@RequestParam(value="name",required = false, defaultValue="saul") String name, @RequestParam(value="desc",required = false) String desc) {
	    User p = new User();
	    p.setNombre(name);
	    p.setDescripcion(desc);
	    repoUsuarios.save(p);
	  }
	  
	  @PostMapping("/createJsonUser")
	  public User createJsonUser(@RequestBody User usr) {
	   
	    repoUsuarios.save(usr);
	    
	    return usr;
	  }
	 

	  @GetMapping("/listaUsers")
	  public List<User> listaUsuarios() {
	    
	   return repoUsuarios.findAll();
	  }

	  @RequestMapping("/listaUserbyName")
	  @GetMapping
	  public List<User> listaUsuariosByName(@RequestParam(value="name",required = true) String nombre) {
		  
	   return repoUsuarios.containsString(nombre);
	  }
	 
}
