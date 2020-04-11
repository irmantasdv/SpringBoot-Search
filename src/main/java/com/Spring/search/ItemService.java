package com.Spring.search;

import java.util.List;

public interface ItemService {
	
	List<Item> returAllItems();
	
	List<Item> findByColor(String color);

}
