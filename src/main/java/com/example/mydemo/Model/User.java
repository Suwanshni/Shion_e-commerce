//POJO-> Plain Old Java Object
package com.example.mydemo.Model;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name = "UserDetails")
public class User {
 @Id
 private String email;

 public String getEmail() {
  return email;
 }

 public void setEmail(String email) {
  this.email = email;
 }

 @Column(nullable = false, unique = true)
 private String contactnum;

 public String getPassword() {
  return password;
 }

 public void setPassword(String password) {
  this.password = password;
 }

 public User() {

 }

 private String password;

 public String getContactnum() {
  return contactnum;
 }

 public void setContactnum(String contactnum) {
  this.contactnum = contactnum;
 }

 private String username;

 @Override
 public String toString() {
  return "User [email=" + email + ", contactnum=" + contactnum + ", password=" + password + ", username=" + username
    + "]";
 }

 public static User findByEmail(String signinemail) {
  return null;
 }

 public User(String email, String contactnum, String password, String username) {
  this.email = email;
  this.contactnum = contactnum;
  this.password = password;
  this.username = username;
 }

 public String getUsername() {
  return username;
 }

 public void setUsername(String username) {
  this.username = username;
 }

}
