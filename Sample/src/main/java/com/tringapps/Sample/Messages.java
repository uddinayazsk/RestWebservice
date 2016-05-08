package com.tringapps.Sample;
import java.util.List;

import javax.ws.rs.Consumes;
import javax.ws.rs.DELETE;
import javax.ws.rs.GET;
import javax.ws.rs.POST;
import javax.ws.rs.PUT;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

import com.tringapps.Sample.model.MessagesModel;
import com.tringapps.Sample.service.MessageService;

@Path("/messages")
public  class Messages {
	
	MessageService messageService= new MessageService();
	@GET
	/*@Produces(MediaType.APPLICATION_XML)*/
	@Produces(MediaType.APPLICATION_JSON)
	public List<MessagesModel> getmessage(){
		
		return messageService.getAllMessages();
	}
//	@POST
//	@Produces(MediaType.APPLICATION_JSON)
//	public String addMessages(){
//		return "post works";
//		
//	}
	
	@POST
	@Consumes(MediaType.APPLICATION_JSON)
	@Produces(MediaType.APPLICATION_JSON)
	public MessagesModel addMessages(MessagesModel message){
		return messageService.addMessage(message);	
	}
	
	
	/*@GET
	@Path("/test")
	@Produces(MediaType.TEXT_PLAIN)
	public String test(){
		return "test";
	}*/
	/*@GET
	@Path("/{id}")
	@Produces(MediaType.TEXT_PLAIN) 
	public String  test(@PathParam("id") String messageId){
		return "Got path param "+messageId;
	}//http://localhost:9999/Sample/webapi/messages/anything in POSTMAN as GET */
	/*@GET
	@Path("/{id}")
	@Produces(MediaType.APPLICATION_XML) 
	public MessagesModel  getMessage(@PathParam("id") long messageId){
		return messageService.getMessage(messageId);
	}//http://localhost:9999/Sample/webapi/messages/2 in POSTMAN as GET
*/
	@GET
	@Path("/{id}")
	@Produces(MediaType.APPLICATION_JSON) //follow for this: https://www.youtube.com/watch?v=5KLFUwcIKkw
	public MessagesModel  getMessage(@PathParam("id") long messageId){
		return messageService.getMessage(messageId);
	}//http://localhost:9999/Sample/webapi/messages/2 in POSTMAN as GET
	
	@PUT
	@Path("/{id}")
	@Consumes(MediaType.APPLICATION_JSON)
	@Produces(MediaType.APPLICATION_JSON)
	public MessagesModel updateMessage(@PathParam("id") long messageId,MessagesModel message){
		message.setId(messageId);
		return messageService.updateMessage(message);
	}
	@DELETE
	@Path("/{id}")
	@Produces(MediaType.APPLICATION_JSON)
	public void deleteMessage(@PathParam("id") long messageId){
		messageService.removeMessage(messageId);
		
	}
	
}
