package com.example.spring.email.api.dto;
import lombok.Data;
import lombok.Getter;
import lombok.Setter;


@Data
@Getter
@Setter
public class MailRequest {
	private String name;
	private String to;
	private String from;
	private String subject;
	private String query;
	private String fname;
	private String lname;
	private String cmail;
	private String phone;
	private String Plantype;
	private String Price;
	private String amount;
	private String addons;
	private String down;
	private String cycle;
	private String nousers;
}
