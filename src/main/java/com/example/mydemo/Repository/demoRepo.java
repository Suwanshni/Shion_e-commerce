package com.example.mydemo.Repository;

import org.springframework.data.jpa.repository.JpaRepository;
import com.example.mydemo.Model.User;

public interface demoRepo extends JpaRepository<User, String> {

}
