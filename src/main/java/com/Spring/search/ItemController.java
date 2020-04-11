package com.Spring.search;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import io.swagger.annotations.Api;

@Api
@RestController
public class ItemController {

	@Autowired
	ItemService serviceItem;

	
	@GetMapping(path = ("/api"))
	public List<Item> getAllItems() {

		return serviceItem.returAllItems();
	}
	
	@GetMapping(path = ("/api/color"))
	public List<Item> getAllItemsByColor(@RequestParam String color) {

		return serviceItem.findByColor(color);
	}
}
