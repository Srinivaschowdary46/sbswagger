package com.srinu.sbswagger.resources;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import io.swagger.annotations.ApiOperation;
import io.swagger.annotations.ApiResponses;
import io.swagger.annotations.ApiResponse;

@RestController

@RequestMapping("/rest/hello")

public class HelloResource {
	

	    @ApiOperation(value = "Returns Hello World")
	    @ApiResponses(
	            value = {
	                    @ApiResponse(code = 100, message = "100 is the message"),
	                    @ApiResponse(code = 200, message = "Successful Hello World")
	            }
	    )
	    @GetMapping
	    public String hello() {
	        return "Hello World";
	    }

	    @ApiOperation(value = "Returns Hello World")
	    @PostMapping("/post")
	    public String helloPost(@RequestBody final String hello) {
	        return hello;
	    }

	    @ApiOperation(value = "Returns Hello World")
	    @PutMapping("/put")
	    public String helloPut(@RequestBody final String hello) {
	        return hello;
	    }

}
