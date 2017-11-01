package com.krish.springdemo;

import java.util.LinkedHashMap;
import java.util.Map;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component
public class Student {
	
	private String firstName;
	private String lastName;
	private String country;
	@Value("#{countryCodes}")
	private Map<String, String> countryOptions;
	//private LinkedHashMap<String, String> countryOptions;
	
	/*public Student() {
		super();
		// TODO Auto-generated constructor stub
		countryOptions = new LinkedHashMap<>();
		
		countryOptions.put("BRA", "Brazil");
		countryOptions.put("FR", "France");
		countryOptions.put("DE", "Germany");
		countryOptions.put("IND", "India");
		countryOptions.put("USA", "United States of America");
		
	}*/
	public String getFirstName() {
		return firstName;
	}
	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}
	public String getLastName() {
		return lastName;
	}
	public void setLastName(String lastName) {
		this.lastName = lastName;
	}
	public String getCountry() {
		return country;
	}
	public void setCountry(String country) {
		this.country = country;
	}
	/*public LinkedHashMap<String, String> getCountryOptions() {
		return countryOptions;
	}*/
	public Map<String, String> getCountryOptions() {
		return countryOptions;
	}
	
	
	
	

}
