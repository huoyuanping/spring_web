package com.et.entity;

public class Good {
	private String id;//��Ʒid
	private String name;//��Ʒ����
	private String model;//��Ʒ����
	private String stock;//���ڵ�
	private double price;//����
	private String imagepath;//ͼƬ·��
	private String descp;//��Ʒ����
	
	public Good(){
		
	}
	public Good(String id, String name, String model, String stock, double price, String imagepath, String descp) {
		super();
		this.id = id;
		this.name = name;
		this.model = model;
		this.stock = stock;
		this.price = price;
		this.imagepath = imagepath;
		this.descp = descp;
	}
	public String getId() {
		return id;
	}
	public void setId(String id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getModel() {
		return model;
	}
	public void setModel(String model) {
		this.model = model;
	}
	public String getStock() {
		return stock;
	}
	public void setStock(String stock) {
		this.stock = stock;
	}
	public double getPrice() {
		return price;
	}
	public void setPrice(double price) {
		this.price = price;
	}
	public String getImagepath() {
		return imagepath;
	}
	public void setImagepath(String imagepath) {
		this.imagepath = imagepath;
	}
	public String getDescp() {
		return descp;
	}
	public void setDescp(String descp) {
		this.descp = descp;
	}

	
	
	
}
