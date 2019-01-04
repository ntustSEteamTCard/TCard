package com.TCard.demo;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.http.MediaType;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;
import org.springframework.test.context.web.WebAppConfiguration;
import org.springframework.test.web.servlet.MockMvc;
import org.springframework.test.web.servlet.MvcResult;
import org.springframework.test.web.servlet.request.MockMvcRequestBuilders;
import org.springframework.test.web.servlet.setup.MockMvcBuilders;
import org.springframework.web.context.WebApplicationContext;

//import com.TCard.demo.Dao.MemberApiRepository;
//import com.TCard.demo.Model.MemberAccount;
import com.fasterxml.jackson.databind.ObjectMapper;





//@RunWith(SpringJUnit4ClassRunner.class)
//@SpringBootTest(classes = TCardDemoApplication.class)
//@WebAppConfiguration
public class TCardDemoApplicationTests {
//	@Autowired
//	private MemberApiRepository memberApiRepository; //加入MemberRepository
//	@Autowired
//    private WebApplicationContext webApplicationContext;
//	
//	@Autowired
//	ObjectMapper objectMapper;
//	MockMvc mvc; //創建MockMvc類的物件
//	
//	MemberAccount memberaccount ;
//	@Before
//	public void setup(){
//		memberaccount = new MemberAccount();
//		memberaccount.setCellphone("02135121");
//		memberaccount.setEmail("qewq@qwe.asd.s");
//		memberaccount.setPassword("qweqqq");
//		mvc = MockMvcBuilders.webAppContextSetup(webApplicationContext).build();
//		
//
//	}
////	1.要將物件轉成JSON可以@Autowired ObjectMapper ,利用ObjectMapper來做轉換
//
//	
//	
//	@Test
//	public void contextLoads() throws Exception {
//		String uri = "/memberApi/1";
//	
//		try{
////			2.MockMvcRequestBuilders.(get,post,put,delete)要記住我們的@RestController設定的Method只接受何種請求,不然你會一直失敗
//			MvcResult result = mvc.perform(MockMvcRequestBuilders.post(uri).content(objectMapper.writeValueAsString(memberaccount)).accept(MediaType.APPLICATION_JSON)).andReturn();
//			int status = result.getResponse().getStatus();
//			Assert.assertEquals("錯誤",200,status);
//		}
//		catch(Exception ex){
//			ex.printStackTrace();
//		}
//	}

}