package com.example.demo.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.example.demo.bean.Daily;
import com.example.demo.bean.Location;
import com.example.demo.util.ApiUtil;
import com.example.demo.util.JsonUtil;
import com.example.demo.util.ResultUtil;

@Controller
public class WeatherController {
	
	@GetMapping("/index")
	public String index() {
		return "index";
	}
	
	@GetMapping("/locations/{location}")
	public String getLocation(@PathVariable("location")String location,Model model) throws Exception {
		model.addAttribute("result", ResultUtil.success(JsonUtil.jsonToList(ApiUtil.getContent(ApiUtil.getLocationURL(location)), Location.class)));
		return "locationList";
	}
	
	@PostMapping("/locations")
	public String getLocations(@RequestParam(value="location",required=true,defaultValue="广州")String location,Model model) throws Exception {
		model.addAttribute("result", ResultUtil.success(JsonUtil.jsonToList(ApiUtil.getContent(ApiUtil.getLocationURL(location)), Location.class)));
		return "locationList";
	}
	
	@GetMapping("/daily/{location}")
	public String getDaily(@PathVariable("location")String location,Model model) throws Exception {
		model.addAttribute("result", ResultUtil.success(JsonUtil.jsonToList(ApiUtil.getContent(ApiUtil.getWeatherDailyURL(location)), Daily.class)));
		return "dailyList";
	}

}
