package com.avp.springboot.async.AsyncService.controller;

import java.util.concurrent.CompletableFuture;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.avp.springboot.async.AsyncService.service.ImplClass1;
import com.avp.springboot.async.AsyncService.service.ImplClass2;
import com.avp.springboot.async.AsyncService.service.InputPojo;

@RestController
@RequestMapping("/thread")
public class ThreadInputController {
	
	@Autowired
	ImplClass1 implClass1;
	
	@Autowired
	ImplClass2 implClass2;
	
	@PostMapping(value = "/thread1")
	public void createThread1() {
		System.out.println("new requiest received to createThread1");
		InputPojo data = new InputPojo();
		data.setOperationName("test1");
		implClass1.hello(data.getOperationName());
		
	}
	
	@PostMapping(value = "/thread2")
	public void createThread2() {
		System.out.println("new requiest received to createThread2");
		InputPojo data = new InputPojo();
		data.setOperationName("test2");
		CompletableFuture<String> result =  implClass2.hello(data.getOperationName());
	}

}
