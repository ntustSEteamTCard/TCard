package com.TCard.demo.Controller;

import org.springframework.messaging.handler.annotation.MessageMapping;
import org.springframework.messaging.handler.annotation.SendTo;
import org.springframework.stereotype.Controller;

import com.TCard.demo.Model.ChatClientModel;
import com.TCard.demo.Model.ServerResponseModel;



@Controller
public class CharRoomController {
	@MessageMapping("/messageControl")
	@SendTo("topic/getResponse")
		public ServerResponseModel said(ChatClientModel responseMessage) throws InterruptedException{
			Thread.sleep(3000);
			return new ServerResponseModel("歡迎來到," + responseMessage.getClientname());
	}
}