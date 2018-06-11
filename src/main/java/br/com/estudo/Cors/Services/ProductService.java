package br.com.estudo.Cors.Services;

import java.util.List;
import java.util.Optional;

import br.com.estudo.Cors.Models.Product;

public interface ProductService {
	public List<Product> findAll();
	public Product find(Long id);
	public Product create(Product product);
	public Product update(Long id, Product product);
	public void delete(Long id);
}
