package nLayerDemo.dataLayers.abstracts;

import java.util.*;

import nLayerDemo.entities.concretes.Product;

public interface ProductRepostory {
	void add(Product product);
	void edit(Product product);
	void delete(Product product);
	Product get(int id);
	List<Product> get(String name);
	List<Product> get();
}
