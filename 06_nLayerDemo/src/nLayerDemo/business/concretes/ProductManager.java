package nLayerDemo.business.concretes;

import java.util.List;

import nLayerDemo.business.abstracts.ProductService;
import nLayerDemo.core.LoggerService;
import nLayerDemo.dataLayers.abstracts.ProductRepostory;
import nLayerDemo.entities.concretes.Product;

public class ProductManager implements ProductService {

	private ProductRepostory dao;
	private LoggerService logger;
	
	public ProductManager(ProductRepostory dao, LoggerService logger) {
		super();
		this.dao = dao;
		this.logger = logger;
	}

	@Override
	public void add(Product product) {
		dao.add(product);
		logger.log(product.getName()+ " Eklendi");
	}

	@Override
	public Product get(int id) {
		// TODO Auto-generated method stub
		return dao.get(id);
	}

	@Override
	public List<Product> get(String name) {
		// TODO Auto-generated method stub
		return dao.get(name);
	}

	@Override
	public List<Product> get() {
		// TODO Auto-generated method stub
		return dao.get();
	}

}
