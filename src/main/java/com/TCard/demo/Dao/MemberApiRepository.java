package com.TCard.demo.Dao;

import org.springframework.data.jpa.repository.JpaRepository;

import com.TCard.demo.Model.MemberAccount;



public interface MemberApiRepository  extends JpaRepository<MemberAccount, Long>{


	//MemberAccount findByIdStartsWith(String id);
	

}