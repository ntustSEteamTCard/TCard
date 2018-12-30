package com.TCard.demo.Dao;

import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Component;

import com.TCard.demo.Model.MemberAccount;

@Component
@Qualifier("MemberApiRepository")
public interface MemberApiRepository  extends JpaRepository<MemberAccount, Long>{


	//MemberAccount findByIdStartsWith(String id);
	

}