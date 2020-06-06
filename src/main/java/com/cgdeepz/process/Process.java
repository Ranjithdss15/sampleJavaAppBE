package com.cgdeepz.process;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.TimeZone;

import org.codehaus.jettison.json.JSONException;
import org.codehaus.jettison.json.JSONObject;

public class Process {
	public static JSONObject processTimeStamp(JSONObject payload) throws JSONException {
		String timeAndDate = payload.getString("date");
		String timeZone = payload.getString("timeZone");

		SimpleDateFormat df = new SimpleDateFormat("dd-MM-yyyy HH:mm:ss");
		df.setTimeZone(TimeZone.getTimeZone(timeZone));
		Date date = new Date();
		try {
			date = df.parse(timeAndDate);
		} catch (ParseException e) {
			e.printStackTrace();
		}
		long unixTimeStamp = date.getTime() / 1000;
		JSONObject response = new JSONObject();
		response.put("unixTimeStamp", unixTimeStamp);
		return response;

	}
}
