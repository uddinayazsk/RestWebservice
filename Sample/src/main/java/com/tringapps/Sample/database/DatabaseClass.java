package com.tringapps.Sample.database;

import java.util.HashMap;
import java.util.Map;

import com.tringapps.Sample.model.MessagesModel;
import com.tringapps.Sample.model.Profile;

public class DatabaseClass {
	private static Map<Long,MessagesModel> messages=new HashMap<Long,MessagesModel>();
	private static Map<Long,Profile> profiiles=new HashMap<Long,Profile>();
	public static Map<Long, MessagesModel> getMessages() {
		return messages;
	}
	public static Map<Long, Profile> getProfiiles() {
		return profiiles;
	}
	

}
