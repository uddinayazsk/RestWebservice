package com.tringapps.Sample.service;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import com.tringapps.Sample.Messages;
import com.tringapps.Sample.database.DatabaseClass;
import com.tringapps.Sample.model.MessagesModel;
public class MessageService {
	private Map<Long,MessagesModel> messages=DatabaseClass.getMessages();
	public MessageService(){
		messages.put(1L, new MessagesModel(1L,"Read","Study"));
		messages.put(2L, new MessagesModel(2L,"Understand","Contemplate"));

	}
	public List<MessagesModel> getAllMessages(){
		
		/*MessagesModel m1=new MessagesModel(1L,"Read","Study");
		MessagesModel m2=new MessagesModel(2L,"Understand","Contemplate");
		List<MessagesModel> list=new ArrayList<MessagesModel>();
		list.add(m1);
		list.add(m2);
		return list;*/
		return new ArrayList<MessagesModel>(messages.values());
		 
	}
	public MessagesModel getMessage(Long id){
		return messages.get(id);
	}
	public MessagesModel addMessage(MessagesModel message){
		message.setId(messages.size()+1);
		messages.put(message.getId(),message);
		
		return message;
		
	}
	public MessagesModel updateMessage(MessagesModel message){
		if(message.getId()==0){
			return null;
		}
		messages.put(message.getId(), message);
		return message;
	}
	public MessagesModel removeMessage(Long id){
		return messages.remove(id);
	}

}
