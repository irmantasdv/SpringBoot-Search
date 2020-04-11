package com.Spring.search;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

@Entity
public class Item {

	@Id
	@GeneratedValue
	private Long id;
	private String name;
	private String color;
	private int qty;
	private Long eanCode;

	public Item(String name, String color, int qty, Long eanCode) {
		super();
		this.name = name;
		this.color = color;
		this.qty = qty;
		this.eanCode = eanCode;
	}

	public Item() {

	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getColor() {
		return color;
	}

	public void setColor(String color) {
		this.color = color;
	}

	public Long getEanCode() {
		return eanCode;
	}

	public void setEanCode(Long eanCode) {
		this.eanCode = eanCode;
	}

	public int getQty() {
		return qty;
	}

	@Override
	public String toString() {
		return "Item [id=" + id + ", name=" + name + ", color=" + color + ", qty=" + qty + ", eanCode=" + eanCode + "]";
	}

}
