package com.revature.tests.controllers;

import static org.hamcrest.CoreMatchers.equalTo;

import org.junit.Test;

import io.restassured.RestAssured;

/**
 * 
 * @author Joshua Stark (1802-Matt)
 * @author John Brand (1802-Matt)
 * 
 * Tests for:
 *  GET( /batches/{batchId} ) 
 *  GET( /batches/none )
 *
 */

public class UsersByBatchTests {

	/**
	 * RESTAssured test to get all users to a batch
	 * 
	 * @author Joshua Stark (1802-Matt)
	 */
	@Test
	public void testGetUsersInBatch() {

		RestAssured.given().pathParam("batchId", 1234)
			.get("http://localhost:9001/api/v2/users/batches/{batchId}")
			.then()
			.body("[0].firstName", equalTo("Jason"));
	}
	
	/**
	 * RESTAssured test to get all users to a batch
	 * 
	 * @author Joshua Stark (1802-Matt)
	 */
	@Test
	public void testGetUsersNotInBatch() {

		RestAssured.get("http://localhost:9001/api/v2/users/batches/none")
			.then()
			.body("[0].firstName", equalTo("Hurri"));
	}
	
}
