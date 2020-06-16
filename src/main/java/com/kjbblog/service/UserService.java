package com.kjbblog.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.kjbblog.dao.UserDAO;

@Service
public class UserService {
	@Autowired
	private UserDAO dao;
}
