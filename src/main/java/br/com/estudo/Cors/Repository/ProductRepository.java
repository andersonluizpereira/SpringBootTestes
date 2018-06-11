package br.com.estudo.Cors.Repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import br.com.estudo.Cors.Models.Product;

@Repository
public interface ProductRepository extends JpaRepository<Product, Long> {

	//Product findOne(Long id);

}
