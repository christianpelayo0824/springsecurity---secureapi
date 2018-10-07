package com.springsecurity.resources;

import java.util.Date;
import java.util.HashMap;
import java.util.Map;
import java.util.UUID;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(value = "/api/user")
public class UserApiRespurces {

	@GetMapping(value = "/resource")
	public Map<String, Object> getUserStatus() {
		Map<String, Object> map = new HashMap<>();
		map.put("id", UUID.randomUUID().toString());
		map.put("content", "Hello User");
		map.put("timestamp", new Date().getTime());
		return map;
	}
}
