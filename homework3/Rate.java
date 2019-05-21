package com.homework.JSONXML.homework3;

import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlRootElement;

@XmlRootElement(name="exchangerate")
public class Rate {
    private String ccy;
    private String base_ccy ="UAH";
    private String buy;
    private String sale;
	public Rate(String ccy, String base_ccy, String buy, String sale) {
		super();
		this.ccy = ccy;
		this.base_ccy = base_ccy;
		this.buy = buy;
		this.sale = sale;
	}
	public Rate() {
		super();
	}
	@XmlAttribute
	public String getCcy() {
		return ccy;
	}
	public void setCcy(String ccy) {
		this.ccy = ccy;
	}
	@XmlAttribute
	public String getBase_ccy() {
		return base_ccy;
	}
	public void setBase_ccy(String base_ccy) {
		this.base_ccy = base_ccy;
	}
	@XmlAttribute
	public String getBuy() {
		return buy;
	}
	public void setBuy(String buy) {
		this.buy = buy;
	}
	@XmlAttribute
	public String getSale() {
		return sale;
	}
	public void setSale(String sale) {
		this.sale = sale;
	}
	
}
