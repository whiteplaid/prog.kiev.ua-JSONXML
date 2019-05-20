package com.homework.JSONXML.homework3;

import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlRootElement;

@XmlRootElement(name="exchangerate")
public class Rate {
	@XmlAttribute
    public String ccy;
	@XmlAttribute
    public String base_ccy ="UAH";
	@XmlAttribute
    public String buy;
	@XmlAttribute
    public String sale;
	
}
