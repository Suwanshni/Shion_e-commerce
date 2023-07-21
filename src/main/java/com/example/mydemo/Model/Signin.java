//POJO-> Plain Old Java Object
package com.example.mydemo.Model;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name = "SigninInfo")
public class Signin {
 
 public Signin(String signinemail, String signinpassword) {
  this.signinemail = signinemail;
  this.signinpassword = signinpassword;
 }

 @Id
 private String signinemail;

 public String getSigninemail() {
  return signinemail;
 }

 public String getPhonenum() {
  return phonenum;
 }

 public void setPhonenum(String phonenum) {
  this.phonenum = phonenum;
 }

 public void setSigninemail(String signinemail) {
  this.signinemail = signinemail;
 }

 private String phonenum;

 private String signinpassword;

 public String getSigninpassword() {
  return signinpassword;
 }

 public void setSigninpassword(String signinpassword) {
  this.signinpassword = signinpassword;
 }

 @Override
 public String toString() {
  return "User[email=" + signinemail + ",  password " + signinpassword + "]";
 }

}
