//package com.TCard.demo.Dao;
//
//import java.util.List;
//import org.springframework.data.jpa.repository.JpaRepository;
//import org.springframework.data.jpa.repository.Query;
//import com.TCard.demo.Model.MemberAccount;
//
//
////@Component
////@Qualifier("MemberApiRepository")
//public interface MemberApiRepository  extends JpaRepository<MemberAccount, Long>{
//	List<MemberAccount> findAll();
//	List<MemberAccount> findByEmail(String email);
//	@Query(value="select * from member.memberaccountjpa where EMAIL = ?1 and PASSWORD = ?2 " ,nativeQuery = true)
//	List<MemberAccount> findCheckMemberAccount(String email,String password);
//
//	//MemberAccount findByIdStartsWith(String id);
//	
//
//}