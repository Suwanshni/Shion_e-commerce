package com.example.mydemo.Repository;

import org.springframework.data.jpa.repository.JpaRepository;
import com.example.mydemo.Model.ProductDB;

public interface productRepo extends JpaRepository<ProductDB, Integer> {

}
