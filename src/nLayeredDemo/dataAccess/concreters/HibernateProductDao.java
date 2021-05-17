package nLayeredDemo.dataAccess.concreters;

import java.until.List;
import nLayeredDemo.dataAccess.abstracts.PorductDao;
import nLayeredDemo.entities.concretes.Product;

public class HibernateProductDao implements PorductDao{

	@Override
	public void add(Product product) {
		System.out.println("Hibernate ile eklendi."+ product.getName());
		
	}

	@Override
	public void update(Product product) {
		
		
	}

	@Override
	public void delete(Product product) {
		
		
	}

	@Override
	public Product get(int id) {
		
		return null;
	}

	@Override
	public List<Product> getAll() {
		
		return null;
	}
	

}
