package auca.ac.rw.restfullApiAssignment.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import auca.ac.rw.restfullApiAssignment.modal.ecommerce.Product;
import java.util.List;




@Repository
public interface ProductRepository extends JpaRepository<Product, Long> {

    List<Product> findByCategory(String category);
    List<Product> findByBrand(String brand);
    List<Product> findByPriceAndBrand(Double price, String brand);
    List<Product> findByNameStartsWith(String name);
    List<Product> findByPriceGreaterThan(Double price);
    List<Product> findByPriceBetween(Double firstPrice, Double secondPrice);



    
}
