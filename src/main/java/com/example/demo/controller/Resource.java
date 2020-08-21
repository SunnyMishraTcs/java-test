package com.example.demo.controller;

import java.util.Optional;

import javax.validation.Valid;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class Resource {
	
	@RequestMapping(value="/hello",method =RequestMethod.GET,produces = {"application/json","application/xml"})
	public String hello() {
		return "<h3> Hello World</h3>";
	}
	
	
	
	
	@PostMapping(value="/person", params ="version-1" )
	public PersonV1 personV1(@RequestParam String s) {
		return new PersonV1("sunny");
	}
	
	@PostMapping(value="/person", params ="version-2" )
	public Bean_1 personV2(@RequestBody   Bean_1 bean1) {
		//return new PersonV2(new Name("sunny","Mishra"));
		return bean1;
	}
	
	@PostMapping(value="/person/header", headers = "api-version=1" )
	public Bean_1 person_V1(@Valid @RequestBody   Bean_1 bean1) throws Exception {
		//return new PersonV1("sunny");
		if(bean1.getAge().equals("18")) {
			throw new ValidationTest("jhfhjghj");
		}
 		
		
		/*
		 * Optional<Bean_1> opt=Optional.ofNullable(bean1);
		 * opt.flatMap(Bean_1::getName).
		 */
		return  bean1;
	}
	
	@GetMapping(value="/person/header", headers = {"api-version=1","X-v=2"} )
	public PersonV2 person_V2( ) {
		return new PersonV2(new Name("sunny","Mishra"));
	}
	
	@PostMapping(value="/person/produces", produces = "application/www.tcs.com-v1+json" )
	public PersonV1 produces_V1(@RequestBody   Bean_1 bean1) {
		return new PersonV1("sunny");
	}
	
	@GetMapping(value="/person/produces", produces = "application/tcs.com-v2+json" )
	public PersonV2 produces_V2( ) {
		return new PersonV2(new Name("sunny","Mishra"));
	}


}
