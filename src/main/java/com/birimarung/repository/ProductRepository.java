package com.birimarung.repository;

import com.birimarung.data.Product;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.Optional;

@Repository
public interface ProductRepository extends JpaRepository<Product, String> {
    Optional<Product> findProductByDrinkNameAndStoreId(String drinkName, int storeId);

    List<Product> findProductByDrinkNameContainingIgnoreCase(String drinkName);

}
