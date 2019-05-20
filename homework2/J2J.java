package com.homework.JSONXML.homework2;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class J2J {
	private String name;
	private String surname;
	private List<String> phones = new ArrayList<String>();
	private List<String> sites = new ArrayList<String>();
	private Map<String,String> address = new HashMap<>();
	
	public J2J(String name, String surname, List<String> phones, List<String> sites, Map<String, String> address) {
		super();
		this.name = name;
		this.surname = surname;
		this.phones = phones;
		this.sites = sites;
		this.address = address;
	}
	public J2J() {
		super();
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getSurname() {
		return surname;
	}
	public void setSurename(String surename) {
		this.surname = surename;
	}
	public List<String> getPhones() {
		return phones;
	}
	public void setPhones(List<String> phones) {
		this.phones = phones;
	}
	public List<String> getSites() {
		return sites;
	}
	public void setSites(List<String> sites) {
		this.sites = sites;
	}
	public Map<String, String> getAdress() {
		return address;
	}
	public void setAdress(Map<String, String> address) {
		this.address = address;
	}

}
