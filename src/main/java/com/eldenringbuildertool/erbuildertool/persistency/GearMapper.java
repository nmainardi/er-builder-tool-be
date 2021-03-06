package com.eldenringbuildertool.erbuildertool.persistency;

import java.nio.file.Paths;
import java.util.List;
import java.util.Map;

import com.eldenringbuildertool.erbuildertool.model.Gear;
import com.fasterxml.jackson.databind.ObjectMapper;

public class GearMapper {
	static public List<Gear> getGearFromJSON(String gearType){
		try {
		    // create object mapper instance
		    ObjectMapper mapper = new ObjectMapper();

		    // convert JSON file to map
		    List<Gear> list = mapper.readValue(Paths.get("assets/"+gearType+".json").toFile(), List.class);

		   System.out.println(list.get(0).getPhy());
		   return list;
		} catch (Exception ex) {
		    ex.printStackTrace();
		}
		return null;
	}
}
