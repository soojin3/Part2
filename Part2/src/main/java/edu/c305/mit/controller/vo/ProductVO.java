package edu.c305.mit.controller.vo;

public class ProductVO {
	// 제품이름
	// 제품가격
	private String name;
	private int price;

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getPrice() {
		return price;
	}

	public void setPrice(int price) {
		this.price = price;
	}

	public ProductVO(String name, int price) {
		super();
		this.name = name;
		this.price = price;
	}

}
