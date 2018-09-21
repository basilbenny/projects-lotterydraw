package com.softup.lotterydraw.controller;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
/**
 * @author BASIL
 * @version 0.1
 * @data 20-09-18
 * */

import com.softup.lotterydraw.dto.BaseDTO;
@RestController
@RequestMapping(value="/users")
public class UserController {

	public static final Logger LOGGER = LoggerFactory.getLogger(UserController.class);

	@GetMapping
	public BaseDTO getAllUsers() {
		LOGGER.info("User getAll controller called.......>");;
		BaseDTO baseDto = new BaseDTO();
		return baseDto;
	}
	
}
