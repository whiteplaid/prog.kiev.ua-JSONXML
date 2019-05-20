package com.homework.JSONXML.homework3;


import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;

@XmlRootElement(name="exchangerates")
public class XML {
	@XmlElement
	public Row[] row;
}
