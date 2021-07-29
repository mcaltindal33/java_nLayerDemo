package nLayerDemo;

import nLayerDemo.business.abstracts.ProductService;
import nLayerDemo.business.concretes.ProductManager;
import nLayerDemo.core.JLoggerAdapter;
import nLayerDemo.dataLayers.concretes.ProductDao;
import nLayerDemo.entities.concretes.Product;

public class Main {

	public static void main(String[] args) {
		ProductService manager = new ProductManager(new ProductDao(),new JLoggerAdapter());
		manager.add(new Product(1,1,"Deneme 1",5250,100));
	}

}