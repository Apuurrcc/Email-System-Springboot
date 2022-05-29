package com.example.spring.email.api;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import java.sql.Date;
import java.util.HashMap;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.example.spring.email.api.dto.MailRequest;
import com.example.spring.email.api.dto.MailResponse;
import com.example.spring.email.api.service.EmailService;
@SpringBootApplication

@RestController
public class SpringBootEmailFreemarkerApplication {
	
	@Autowired
	private EmailService service;

	@PostMapping("/sendingEmail")
	public MailResponse sendEmail(@RequestBody MailRequest request) {
		Map<String, Object> model = new HashMap<>();
		model.put("Name", request.getName());
		model.put("location", "Bangalore,India");
		model.put("Subject","Your trial period expires soon");
		return service.sendEmail(request, model);

	}
	@PostMapping("/freetrialexp7")
	public MailResponse sentEmail(@RequestBody MailRequest request) {
		Map<String, Object> model = new HashMap<>();
		model.put("Name", request.getName());
		model.put("location", "Bangalore,India");
		model.put("Days", 7);
		model.put("Subject","Your trial period expires soon");
		return service.sentEmail(request,model);
	}
	@PostMapping("/freetrialexp3")
	public MailResponse senEmail(@RequestBody MailRequest request) {
		Map<String, Object> model = new HashMap<>();
		model.put("Name", request.getName());
		model.put("location", "Bangalore,India");
		model.put("Days", 3);
		model.put("Subject",request.getSubject());
		return service.sentEmail(request,model);
	}
	@PostMapping("/freetrialexp1")
	public MailResponse seEmail(@RequestBody MailRequest request) {
		Map<String, Object> model = new HashMap<>();
		model.put("Name", request.getName());
		model.put("location", "Bangalore,India");
		model.put("Days", 1);
		model.put("Subject",request.getSubject());
		model.put("Query", request.getQuery());
		return service.sentEmail(request,model);
	}
	@PostMapping("/subscription")
	public MailResponse Sendmail(@RequestBody MailRequest request) {
		Map<String, Object> model = new HashMap<>();
		model.put("Name", request.getName());
		model.put("plantype", request.getPlantype());
		model.put("startdate",java.time.LocalDate.now());
		model.put("enddate", "23-09-2022");
		model.put("cmail", request.getCmail());
		model.put("cancellationdate",java.time.LocalDate.now());
		return service.Sub(request, model);
	}
	@PostMapping("/contactSales")
	public MailResponse contact(@RequestBody MailRequest request) {
		Map<String, Object> model = new HashMap<>();
		model.put("Name", request.getName());
		model.put("fname", request.getFname());
		model.put("lname",request.getLname());
		model.put("cmail",request.getCmail());
		model.put("phone", request.getPhone());
		model.put("query", request.getQuery());
		return service.contact(request, model);
	}
	@PostMapping("/updatePlan")
	public MailResponse update(@RequestBody MailRequest request) {
		Map<String, Object> model = new HashMap<>();
		model.put("fname", request.getFname());
		model.put("lname",request.getLname());
		model.put("Plantype", request.getPlantype());
		model.put("nousers", request.getNousers());
		model.put("cycle", request.getCycle());
		model.put("addons", request.getAddons());
		model.put("amount", request.getAmount());
		model.put("down", request.getDown());
		return service.update(request, model);
	}
	@PostMapping("/paymentFail")
	public MailResponse paymentFail(@RequestBody MailRequest request) {
		Map<String, Object> model = new HashMap<>();
		model.put("Name", request.getName());
		return service.payment(request, model);
	}
	
	public static void main(String[] args) {
		SpringApplication.run(SpringBootEmailFreemarkerApplication.class, args);
	}
}
