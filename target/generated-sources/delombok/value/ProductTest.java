package com.azhwani.value;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.JsonMappingException;
import com.fasterxml.jackson.databind.ObjectMapper;

public class ProductTest {

	public static void main(String[] args) throws JsonMappingException, JsonProcessingException {
		// TODO Auto-generated method stub
		
		// Builder Test
		Product prd01 = Product.builder()
				.idPoroduct(1)
				.name("Product 01")
				.price(1550)
				.build();
		
		System.out.println(prd01.getName());
		
		// Jackson Test
		
		ObjectMapper objectMapper = new ObjectMapper();
		String json = "{\"idPoroduct\" : 1, \"name\": \"Prod 01\", \"price\" : 100,\"description\": \"Prod desc\" }";
		Product prod = objectMapper.readValue(json, Product.class);
		
		System.out.println(prod.getName());

	}

}
