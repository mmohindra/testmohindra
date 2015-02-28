package com.mukta;

import javax.xml.bind.annotation.XmlRootElement;



@XmlRootElement
//testing 2 git
public class ToDo {

	private String summary;
	private String description;
	public String getSummary() {
		return summary;
	}
	public void setSummary(String summary) {
		this.summary = summary;
	}
	public String getDescription() {
		return description;
	}
	public void setDescription(String description) {
		this.description = description;
	}
	
}
