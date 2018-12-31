package com.TCard.demo.Model;
//
//import org.springframework.stereotype.Component;
//
//@Component
//public class MemberAccount {
//  private int id;
//  private String email;
//  private String cellphone;
//  private String password;
//  private String address;
//  
//  public int getId() {
//	return id;
//  }
//  
//  public void setId(int id) {
//	this.id = id;
//  }
//  public String getEmail() {
//	return email;
//  }
//  
//  public void setEmail(String email) {
//	this.email = email;
//  }
//  
//  public String getCellphone() {
//	return cellphone;
//  }
//  
//  public void setCellphone(String cellphone) {
//	this.cellphone = cellphone;
//  }
//  
//  public String getPassword() {
//	return password;
//  }
//  
//  public void setPassword(String password) {
//	this.password = password;
//  }
//  
//  public String getAddress() {
//	return address;
//  }
//  
//  public void setAddress(String address) {
//	this.address = address;
//  }
//  
//  
//  
//}
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "memberaccountjpa")//在此改变要操作的表
public class MemberAccount{
  @Id
  @GeneratedValue(strategy = GenerationType.IDENTITY)
//  @GeneratedValue(strategy=GenerationType.AUTO)
  private long id;
  private String email;
  private String cellphone;
  private String password;
  private String address;
//  public MemberAccount() {
//  }

public long getId() {
	return id;
  }
  
  public void setId(long id) {
	this.id = id;
  }
  public String getEmail() {
	return email;
  }
  
  public void setEmail(String email) {
	this.email = email;
  }
  
  public String getCellphone() {
	return cellphone;
  }
  
  public void setCellphone(String cellphone) {
	this.cellphone = cellphone;
  }
  
  public String getPassword() {
	return password;
  }
  
  public void setPassword(String password) {
	this.password = password;
  }
  
  public String getAddress() {
	return address;
  }
  
  public void setAddress(String address) {
	this.address = address;
  }


}
