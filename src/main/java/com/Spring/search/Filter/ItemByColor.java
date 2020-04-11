package com.Spring.search.Filter;

import javax.persistence.criteria.CriteriaBuilder;
import javax.persistence.criteria.CriteriaQuery;
import javax.persistence.criteria.Predicate;
import javax.persistence.criteria.Root;

import org.springframework.data.jpa.domain.Specification;

import com.Spring.search.Item;

public class ItemByColor implements Specification<Item> {

	private String color;

	public ItemByColor(String color) {
		this.color = color;
	}

	@Override
	public Predicate toPredicate(Root<Item> root, CriteriaQuery<?> query, CriteriaBuilder criteriaBuilder) {
		if (color == null) {
			return criteriaBuilder.isTrue(criteriaBuilder.literal(true));
		} else {

			return criteriaBuilder.equal(root.get("color"), this.color);

		}

	}

}
