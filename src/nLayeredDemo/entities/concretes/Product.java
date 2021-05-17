package nLayeredDemo.entities.concretes;

import nLayeredDemo.entities.abstracts.Entity;

public class Product implements Entity{
	private int id;
	private int categoryId;
	private String name;
	private double unityPrice;
	private int unitsInStock;
	
	
	public Product() {}


	public Product(int id, int categoryId, String name, double unityPrice, int unitsInStock) {
		super();
		this.id = id;
		this.categoryId = categoryId;
		this.name = name;
		this.unityPrice = unityPrice;
		this.unitsInStock = unitsInStock;
	}


	public int getId() {
		return id;
	}


	public void setId(int id) {
		this.id = id;
	}


	public int getCategoryId() {
		return categoryId;
	}


	public void setCategoryId(int categoryId) {
		this.categoryId = categoryId;
	}


	public String getName() {
		return name;
	}


	public void setName(String name) {
		this.name = name;
	}


	public double getUnityPrice() {
		return unityPrice;
	}


	public void setUnityPrice(double unityPrice) {
		this.unityPrice = unityPrice;
	}


	public int getUnitsInStock() {
		return unitsInStock;
	}


	public void setUnitsInStock(int unitsInStock) {
		this.unitsInStock = unitsInStock;
	}
}
