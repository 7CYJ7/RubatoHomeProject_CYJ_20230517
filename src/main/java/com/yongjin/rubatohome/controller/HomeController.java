package com.yongjin.rubatohome.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class HomeController {
	
	@RequestMapping(value = "/index")  // <-- index 요청이 오면 index가 실행되라 라는 의미
	public String index() {
		return "index";
	}
	
	@RequestMapping(value = "/board_list")
	public String board_list() {
		return "board_list";
	}
	
	@RequestMapping(value = "board_write")
	public String board_write() {
		return "board_write";
	}
	
	@RequestMapping(value = "board_view")
	public String board_view() {
		return "board_view";
	}

}
