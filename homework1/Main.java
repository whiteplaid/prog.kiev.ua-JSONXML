package com.homework.JSONXML.homework1;

import java.io.File;
import java.lang.reflect.Field;
import java.util.List;

import javax.xml.bind.JAXBContext;
import javax.xml.bind.JAXBException;
import javax.xml.bind.Unmarshaller;


public class Main {

	public static void main(String[] args) throws JAXBException, IllegalArgumentException, IllegalAccessException, NoSuchFieldException, SecurityException {
		JAXBContext jaxbContext = JAXBContext.newInstance(Trains.class);
		Unmarshaller u = jaxbContext.createUnmarshaller();
		Trains o = (Trains)  u.unmarshal(new File("c:\\Users\\white\\eclipse-workspace\\prog.kiev.ua\\src\\com\\homework\\JSONXML\\homework1\\trains.xml"));
		List<Train> trains = o.getTrains();
		trains.add(new Train("Kyiv","Lviv","02-09-2018","15:35"));
		for (Train train : trains) {
			String[] departure = train.getDeparture().split(":");
			int h = Integer.parseInt(departure[0]);
			int m = Integer.parseInt(departure[1]);
			
			if (h>14 && h<19) {
				if (m<=59) {
					Field[] fields = train.getClass().getDeclaredFields();
					for (Field field : fields) {
						if(!field.isAccessible()) field.setAccessible(true);
						System.out.println(field.getName() + " : " + field.get(train));
					}
					System.out.println("---------------------------------------");
				}
			}
			
		}
	}
}
