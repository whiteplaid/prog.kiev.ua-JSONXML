package com.homework.JSONXML.homework1;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;


@XmlRootElement(name = "trains")
public class Trains {
	@XmlElement(name = "train")
	private List<Train> trains = new ArrayList<Train>();
	
	public void add (Train train) {
		trains.add(train);
	}
	public List<Train> getTrains () {
		return trains;
	}
}
