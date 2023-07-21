package com.example.mydemo.Model;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name = "productInfo")
public class ProductDB {
  @Id
  @GeneratedValue(strategy = GenerationType.IDENTITY)
  private int productID;

  public int getProductID() {
    return productID;
  }

  public void setProductID(int productID) {
    this.productID = productID;
  }

  private String productName;

  public String getProductName() {
    return productName;
  }

  public void setProductName(String productName) {
    this.productName = productName;
  }

  private int productPrice;

  public int getProductPrice() {
    return productPrice;
  }

  public ProductDB(int productID, String productName, int productPrice, String productImg) {
    this.productID = productID;
    this.productName = productName;
    this.productPrice = productPrice;
    this.productImg = productImg;
  }

  public ProductDB() {
  }

  public void setProductPrice(int productPrice) {
    this.productPrice = productPrice;
  }

  private String productImg;

  public String getProductImg() {
    return productImg;
  }

  public void setProductImg(String productImg) {
    this.productImg = productImg;
  }

  @Override
  public String toString() {
    return "ProductDB [productID=" + productID + ", productName=" + productName + ", productPrice=" + productPrice
        + ", productImg=" + productImg + "]";
  }

}
