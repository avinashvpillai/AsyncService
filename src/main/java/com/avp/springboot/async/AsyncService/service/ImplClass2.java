package com.avp.springboot.async.AsyncService.service;

import java.util.concurrent.CompletableFuture;

import org.springframework.scheduling.annotation.Async;
import org.springframework.stereotype.Service;

@Service
public class ImplClass2 {
	
	@Async
	public CompletableFuture<String> hello(String data) {
		System.out.println("hello  from ImplClass2 "+Thread.currentThread().getName());
		try {
			for(int i=20;i<30;i++) {
				System.out.println("from "+data+" -"+i);
			}
			Thread.sleep(5000);
			System.out.println("exiting thread "+Thread.currentThread().getName()+" from ImplClass2");
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return CompletableFuture.completedFuture(data);
	}

}
