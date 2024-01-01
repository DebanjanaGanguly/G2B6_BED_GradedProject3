package com.gl.ticketTracker.entity;

import java.time.LocalDateTime;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Lob;
import javax.persistence.Table;

import org.hibernate.annotations.CreationTimestamp;
import org.hibernate.annotations.UpdateTimestamp;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Builder
@Entity
@Table(name = "tickets")
public class Ticket {

	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private Long id;
	
	@Column(nullable = false)
	private String title;
	
	@Column(nullable = false)
	private String url;
	
	@Lob
	@Column(nullable = false)
	private String content;
	
	private String shortDescription;
	
	@CreationTimestamp
	private LocalDateTime createdOn;
	
	@UpdateTimestamp
	private LocalDateTime updatedOn;

	public Object getId() {
		// TODO Auto-generated method stub
		return null;
	}

	public Object getTitle() {
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

	public static Object builder() {
		// TODO Auto-generated method stub
		return null;
	}
}
