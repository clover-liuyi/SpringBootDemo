package com.zving.controller;

import java.util.HashMap;
import java.util.Map;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class ApiController {

	@RequestMapping("/getInfo")
	public Map<String,String> getInfo(){
		Map<String,String> map=new HashMap<String, String>();
		map.put("name", "张三");
		map.put("sex", "男");
		map.put("age", "18");
		map.put("address", "北京市昌平区天通苑北");
		return map;
	}
}
