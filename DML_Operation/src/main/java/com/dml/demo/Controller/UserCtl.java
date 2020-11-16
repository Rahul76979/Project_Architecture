package com.dml.demo.Controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.dml.demo.DTO.UserDTO;
import com.dml.demo.Service.UserService;

@RestController
@RequestMapping(value = "/User")
public class UserCtl 
{
	@Autowired
	UserService service;
	
	@PostMapping(value = "/save")
	public UserDTO save(@RequestBody UserDTO dto)
	{
		System.out.println("inside save ......");
		return service.save(dto);
	}
	
	@PostMapping(value = "/update")
	public UserDTO update(@RequestBody UserDTO dto)
	{
		UserDTO update = service.update(dto);
		return update;
	}
	
	@PostMapping(value = "/delete/{id}")
	public String delete(@PathVariable int id)
	{
		service.delete(id);
		return "Data Deleted Successfully";
	}
}
