package edu.c305.mit.controller.vo;

public class ProductVO {
	// 제품이름
	// 제품가격
	private String name;
	private Integer price;
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public Integer getPrice() {
		return price;
	}
	public void setPrice(Integer price) {
		this.price = price;
	}
	@Override
	public String toString() {
		return "ProductVO [name=" + name + ", price=" + price + "]";
	}
	public ProductVO(String name, Integer price) {
		super();
		this.name = name;
		this.price = price;
	}

	

}
