package com.devsuperior.myfirsproject.repository;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Repository;

import com.devsuperior.myfirsproject.entities.Product;

@Repository
public interface ProductRepository extends JpaRepository<Product, Long>{

}
