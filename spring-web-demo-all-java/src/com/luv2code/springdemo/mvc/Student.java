package com.luv2code.springdemo.mvc;

import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;

public class Student {
	private String firstName;
	private String lastName;
	private String country;
	private String favoriteLanguage;
	private List<String> operatingSystems;
	private Map<String, String> countryOptions;
	private Map<String, String> favoriteLanguageOptions;
	private Map<String, String> operatingSystemsOptions;

	public Student() {
		countryOptions = new LinkedHashMap<>();
		countryOptions.put("BR", "Brazil");
		countryOptions.put("FR", "France");
		countryOptions.put("DE", "Germany");
		countryOptions.put("IN", "India");
		countryOptions.put("US", "United states of Amarica");

		favoriteLanguageOptions = new LinkedHashMap<>();
		favoriteLanguageOptions.put("Java", "Java");
		favoriteLanguageOptions.put("PHP", "PHP");
		favoriteLanguageOptions.put("C#", "C#");
		favoriteLanguageOptions.put("Ruby", "Ruby");

		operatingSystemsOptions = new LinkedHashMap<>();
		operatingSystemsOptions.put("WIN", "Window");
		operatingSystemsOptions.put("LIN", "Linux");
		operatingSystemsOptions.put("MAC", "MACOS");
		operatingSystemsOptions.put("OTH", "Other");
	}

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

	public Map<String, String> getCountryOptions() {
		return countryOptions;
	}

	public String getFavoriteLanguage() {
		return favoriteLanguage;
	}

	public void setFavoriteLanguage(String favoriteLanguages) {
		this.favoriteLanguage = favoriteLanguages;
	}

	public Map<String, String> getFavoriteLanguageOptions() {
		return favoriteLanguageOptions;
	}

	public List<String> getOperatingSystems() {
		return operatingSystems;
	}

	public void setOperatingSystems(List<String> operatingSystems) {
		this.operatingSystems = operatingSystems;
	}

	public Map<String, String> getOperatingSystemsOptions() {
		return operatingSystemsOptions;
	}

}
