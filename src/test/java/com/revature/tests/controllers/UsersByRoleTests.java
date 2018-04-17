package com.revature.tests.controllers;

import static org.hamcrest.CoreMatchers.equalTo;

import org.junit.Test;

import com.revature.beans.BamUser;

import antlr.collections.List;
import io.restassured.RestAssured;

/**
 * 
 * @author Joshua Stark (1802-Matt)
 * @author John Brand (1802-Matt)
 * 
 * Tests for:
 *  GET( /trainers ) 
 *  GET( /associates )
 *
 */
public class UsersByRoleTests {

	/**
	 * RESTAssured test to get all trainers
	 * 
	 * @author Joshua Stark (1802-Matt)
	 */
	@Test
	public void testGetAllTrainers() {

		RestAssured.get("http://localhost:9001/api/v2/users/trainers")
			.then()
			.body("[0].firstName", equalTo("Ryan"));
	}
	
	/**
	 * RESTAssured test to get all associates
	 * 
	 * @author Joshua Stark (1802-Matt)
	 */
	@Test
	public void testGetAllAssociates() {

		RestAssured.get("http://localhost:9001/api/v2/users/associates")
			.then()
			.body("[0].firstName", equalTo("Hurri"));
	}
	
}
