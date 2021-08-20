package com.admin.goods.db;

public class GoodsDTO {
	private int num;
	private String category;
	private String name;
	private String content;
	private String size;
	private String color;
	private int amount;
	private int price;
	private String image;
	private int best;
	private String date;
	

	// set/get  - alt shift s + r

	public int getNum() {
		return num;
	}

	public void setNum(int num) {
		this.num = num;
	}

	public String getCategory() {
		return category;
	}

	public void setCategory(String category) {
		this.category = category;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getContent() {
		return content;
	}

	public void setContent(String content) {
		this.content = content;
	}

	public String getSize() {
		return size;
	}

	public void setSize(String size) {
		this.size = size;
	}

	public String getColor() {
		return color;
	}

	public void setColor(String color) {
		this.color = color;
	}

	public int getAmount() {
		return amount;
	}

	public void setAmount(int amount) {
		this.amount = amount;
	}

	public int getPrice() {
		return price;
	}

	public void setPrice(int price) {
		this.price = price;
	}

	public String getImage() {
		return image;
	}

	public void setImage(String image) {
		this.image = image;
	}

	public int getBest() {
		return best;
	}

	public void setBest(int best) {
		this.best = best;
	}

	public String getDate() {
		return date;
	}

	public void setDate(String date) {
		this.date = date;
	}

	
	// alt shift s + s
	@Override
	public String toString() {
		return "GoodsDTO [num=" + num + ", category=" + category + ", name=" + name + ", content=" + content + ", size="
				+ size + ", color=" + color + ", amount=" + amount + ", price=" + price + ", image=" + image + ", best="
				+ best + ", date=" + date + "]";
	}

}
