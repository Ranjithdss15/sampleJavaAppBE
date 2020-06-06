package com.cgdeepz.services;

import javax.ws.rs.POST;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

import org.codehaus.jettison.json.JSONObject;

import com.cgdeepz.process.Process;

@Path("/init")
@Produces(MediaType.APPLICATION_JSON)
public class InitService {
	@POST
	public JSONObject post(JSONObject payload) throws Exception {
		System.out.println("enteredddddddddd" + payload);
		return Process.processTimeStamp(payload);
	}
}
