package com.homework.JSONXML.homework1;


import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;


@XmlRootElement(name="train")
public class Train {
	private String from;
	private String to;
	private String date;
	private String departure;

	public Train(String from, String to, String date, String departure) {
		super();
		this.from = from;
		this.to = to;
		this.date = date;
		this.departure = departure;
	}
	public Train() {
		super();
	}
	public String getFrom() {
		return from;
	}
	@XmlElement
	public void setFrom(String from) {
		this.from = from;
	}
	public String getTo() {
		return to;
	}
	@XmlElement
	public void setTo(String to) {
		this.to = to;
	}
	public String getDate() {
		return date;
	}
	@XmlElement
	public void setDate(String date) {
		this.date = date;
	}
	public String getDeparture() {
		return departure;
	}
	@XmlElement
	public void setDeparture(String departure) {
		this.departure = departure;
	}
	
}
