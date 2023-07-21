package com.example.mydemo.Controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import com.example.mydemo.Model.ProductDB;
import com.example.mydemo.Model.Signin;
import com.example.mydemo.Model.User;
import com.example.mydemo.service.demoService;

@Controller
public class demoController {

  @Autowired
  demoService service;

  @GetMapping("/") // API Name Default API
  public String welcomeString() {
    return "index";
  }

  @GetMapping("/signin")
  public String signiString() {
    return "signin";
  }

  @GetMapping("/forgot-password")
  public String forgotpasswordString() {
    return "forgot-password";
  }

  @GetMapping("/create-account")
  public String createaccountshowString() {
    return "create-account";
  }

  @PostMapping("/create-account-user")
  public String createaccountString(@ModelAttribute User use, Model model, Signin signin) {
    // String mail = signin.getSigninemail();
    // String phonenum = signin.getPhonenum();
    // if(!(service.checkexistence(mail) && service.checkexistence(phonenum))){

    // }
    model.addAttribute("email", use.getEmail());
    service.add(use);
    return "redirect:/";
  }

  @GetMapping("/men")
  public String mencategoryString() {
    return "men";
  }

  @PostMapping("/sign-in-user")
  public String signinString(@ModelAttribute Signin signin) {
    String mail = signin.getSigninemail();
    String password = signin.getSigninpassword();

    if (service.checkexistence(mail)) {
      if (service.authenticateUser(mail, password)) {
        return "redirect:/";
      }
      return "sign-in-user";
    } else {
      return "create-account";
    }
  }

  @GetMapping("/addProduct")
  public String addProducString(){
    return "addProduct";
  }

  @PostMapping("/addingProduct")
  public String addProductInfoString(@ModelAttribute ProductDB pdb, Model model){
    model.addAttribute("productName", pdb.getProductName());
    service.addProduct(pdb);
    return "redirect:/productList";
  }

  @GetMapping("/productList")
  public String productListString(@ModelAttribute ProductDB prodb, Model model){
    model.addAttribute("productName", prodb.getProductName());
    List<ProductDB> proList = service.getAllProducts();
    model.addAttribute("records", proList);
    return "productList";
  }

}
