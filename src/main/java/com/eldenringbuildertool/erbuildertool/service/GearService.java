package com.eldenringbuildertool.erbuildertool.service;

import java.util.List;

import com.eldenringbuildertool.erbuildertool.model.Gear;
import com.eldenringbuildertool.erbuildertool.persistency.GearMapper;

public class GearService {
	
	static final String ELMI="elmi";
	static final String CORPETTI="corpetti";
	static final String GUANTI="guanti";
	static final String PANTALONI="pantaloni";
	
	static public List<Gear> getElmetti() {
		return GearMapper.getGearFromJSON(ELMI);
	}
	
	static public List<Gear> getCorpetti() {
		return GearMapper.getGearFromJSON(CORPETTI);
	}
	
	static public List<Gear> getGuanti() {
		return GearMapper.getGearFromJSON(GUANTI);
	}
	
	static public List<Gear> getPantaloni() {
		return GearMapper.getGearFromJSON(PANTALONI);
	}
}
