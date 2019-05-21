package com.homework.JSONXML.homework3;


import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;

@XmlRootElement(name="exchangerates")
public class XML {
	@XmlElement
	private Row[] row;

	public Row[] getRow() {
		return row;
	}
	
}
