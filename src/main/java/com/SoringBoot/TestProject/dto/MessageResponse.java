package com.SoringBoot.TestProject.dto;

import lombok.Data;

@Data
public class MessageResponse {
	private String message;


//	constructor
	public MessageResponse(String message) {
	    this.message = message;
	  }
}
