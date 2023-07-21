package com.example.mydemo.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.mydemo.Model.ProductDB;
import com.example.mydemo.Model.Signin;
import com.example.mydemo.Model.User;
import com.example.mydemo.Repository.demoRepo;
import com.example.mydemo.Repository.productRepo;
import com.example.mydemo.Repository.signRepo;

@Service
public class demoService {

 @Autowired // method injection
 demoRepo repo;

 @Autowired
 signRepo signinRepo;

 @Autowired
 productRepo prodbRepo;

 public void add(User use) {
  repo.save(use);
 }

 public List<User> getting() {
  return repo.findAll();
 }

 public void addSign(Signin sign) {
  signinRepo.save(sign);
 }

 public Optional<Signin> sendRow(String mail, String password){
  Optional<Signin> getUser = signinRepo.findById(mail);
  return getUser;
 }

 public boolean checkexistence(String mail) {
  Optional<Signin> existingUser = signinRepo.findById(mail);
  if(existingUser.isPresent()){
   return true;
  }else{
   return false;
  }
 }

 public boolean authenticateUser(String checkEmail, String checkPassword) {
  Optional<Signin> checkingUser = signinRepo.findById(checkPassword);
  if(checkingUser.equals(signinRepo.findById(checkEmail))){
   return true;
  }
  else{
   return false;
  }
 }

 public void addProduct(ProductDB pdb) {
  prodbRepo.save(pdb);
 }

 public List<ProductDB> getAllProducts(){
  return prodbRepo.findAll();
 }


}
