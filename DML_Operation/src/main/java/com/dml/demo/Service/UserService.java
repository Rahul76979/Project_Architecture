package com.dml.demo.Service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.PostMapping;

import com.dml.demo.DTO.UserDTO;
import com.dml.demo.Dao.UserRepo;

@Service
public class UserService 
{
	@Autowired
	UserRepo repo;
	
	public UserDTO save(UserDTO dto) 
	{
		UserDTO result = repo.save(dto);
		return result;
	}

	public UserDTO update(UserDTO dto) 
	{
		UserDTO update = repo.save(dto);
		return update;
	}

	public void delete(int id) 
	{
		 repo.deleteById(id);
	}
	
}
