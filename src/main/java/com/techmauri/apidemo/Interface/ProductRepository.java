package com.techmauri.apidemo.Interface;

import com.techmauri.apidemo.Model.Product;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ProductRepository extends JpaRepository<Product, Integer> {

}
