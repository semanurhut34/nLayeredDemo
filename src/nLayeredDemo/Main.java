package nLayeredDemo;

import nLayeredDemo.business.abstracts.ProductService;
import nLayeredDemo.business.concerts.ProductManager;
import nLayeredDemo.dataAccess.concreters.AbcProductDao;
import nLayeredDemo.dataAccess.concreters.HibernateProductDao;
import nLayeredDemo.entities.concretes.Product;

public class Main {

	public static void main(String[] args) {
		ProductService productService = new ProductManager(new AbcProductDao(), new JLoggerManagerAdapter());
		Product product = new Product(1,2,"Elma",12,50);           //kategori 2 olunca çalýþmadý ?
		productService.add(product);

	}

}
