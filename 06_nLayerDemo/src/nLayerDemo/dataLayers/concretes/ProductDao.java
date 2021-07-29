package nLayerDemo.dataLayers.concretes;

import java.util.List;

import nLayerDemo.dataLayers.abstracts.ProductRepostory;
import nLayerDemo.entities.concretes.Product;

public class ProductDao implements ProductRepostory {

	@Override
	public void add(Product product) {
		System.out.println("Ürün Eklendi : " + product.getName());
	}

	@Override
	public void edit(Product product) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void delete(Product product) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public Product get(int id) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<Product> get(String name) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<Product> get() {
		// TODO Auto-generated method stub
		return null;
	}

}
