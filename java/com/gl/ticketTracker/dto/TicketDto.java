package com.gl.ticketTracker.dto;

import java.time.LocalDateTime;

import javax.validation.constraints.NotEmpty;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class TicketDto {  //act as the model in spring MVC web application


	 private Long id;
	 
	 @NotEmpty
	 private String title;
	 private String url;
	 @NotEmpty	
	 private  String content;
	 @NotEmpty
	 private String shortDescription;
	 private LocalDateTime createdOn;
	 private LocalDateTime updatedOn;
	public String getTitle() {
		// TODO Auto-generated method stub
		return null;
	}
	public void setUrl(String url2) {
		// TODO Auto-generated method stub
		
	}
	public void setId(long ticketId) {
		// TODO Auto-generated method stub
		
	}
	public static Object builder() {
		// TODO Auto-generated method stub
		return null;
	}
	public Object getId() {
		// TODO Auto-generated method stub
		return null;
	}
	public Object getContent() {
		// TODO Auto-generated method stub
		return null;
	}
	public Object getShortDescription() {
		// TODO Auto-generated method stub
		return null;
	}
	public Object getCreatedOn() {
		// TODO Auto-generated method stub
		return null;
	}
	public Object getUpdatedOn() {
		// TODO Auto-generated method stub
		return null;
	}
	public void setId(Long id) {
		this.id = id;
	}

	 
	 
}
