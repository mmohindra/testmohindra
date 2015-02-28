package com.mukta;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.MediaType;

@Path("todo")
//test url is  http://localhost:8089/restservice/rest/todo
public class ToDoResource {
	@GET
	@Path("/json")
	@Produces(MediaType.APPLICATION_JSON)
	public ToDo getToDoJSON(){
		ToDo x= new ToDo();
		x.setSummary("summary test 1");
		x.setDescription("description test 1");
		return x;
	}
	
	@GET
	//url is http://localhost:8089/restservice/rest/todo/xml
	@Path("/xml")
	@Produces(MediaType.TEXT_XML)
	public ToDo getToDoXML(){
	ToDo x = new ToDo();
	x.setSummary("testing xml");
	x.setDescription("test xml");
	return x;
		//return "<User>" + "<Age>" + 5 + "</Age>" + "</User>";
	}
	
	@GET
	@Path("/html")
	@Produces(MediaType.TEXT_HTML)
	public String getTodohtml(){
		return "<HTML><title></title><body><b>Hello test todo</b></body> </HTML>";
	}
}
