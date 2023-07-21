package com.example.mydemo.Repository;

import org.springframework.data.jpa.repository.JpaRepository;
import com.example.mydemo.Model.Signin;


public interface signRepo extends JpaRepository<Signin, String> {

}
