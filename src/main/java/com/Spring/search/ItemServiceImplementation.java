package com.Spring.search;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.jpa.domain.Specification;
import org.springframework.stereotype.Service;

import com.Spring.search.Filter.ItemByColor;

@Service
public class ItemServiceImplementation implements ItemService {

	@Autowired
	ItemRepository itemRepo;

	@Override
	public List<Item> returAllItems() {

		return itemRepo.findAll();
	}

	@Override
	public List<Item> findByColor(String color) {

		Specification<Item> spec = Specification.where(new ItemByColor(color));

		return itemRepo.findAll(spec);
	}

}
