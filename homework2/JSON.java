package com.homework.JSONXML.homework2;

import java.io.File;
import java.io.FileReader;
import java.io.IOException;

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;

public class JSON {
	public static J2J importJSON (String path, Class<?> o) {
		try(FileReader fr = new FileReader(new File(path))) {
			Gson gson = new GsonBuilder().create();
			return (J2J) (gson.fromJson(fr, o));
		} catch (IOException e) {
			e.printStackTrace();
		}
		return null;
	}
}
