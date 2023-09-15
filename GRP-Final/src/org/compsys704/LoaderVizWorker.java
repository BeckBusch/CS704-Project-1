package org.compsys704;

import java.util.Arrays;
import java.util.List;

public class LoaderVizWorker extends Worker{

	@Override
	public void setSignal(boolean status) {
		System.out.println(signame+"  "+status);
		switch(signame){
		case "lightHigh":
			if (status == true) {

				States.LIGHT = 2;
			}
			break;
		case "lightLow":
			if (status == true) {
				States.LIGHT = 1;
				
			}
			break;
		case "lightNone":
			if (status == true) {
				States.LIGHT = 0;
				
			}
			break;
		case "fire":
			States.FIRE = status;
			break;
		case "fan":
			States.FAN = status;
			break;
		case "ac":
			States.AC = status;
			break;
		case "heat":
			States.HEAT = status;
			break;
		default: 
			System.err.println("Wrong sig name : "+signame);
			System.exit(1);
		}
	}
	
	
	static final List<String> signames = Arrays.asList("lightHigh","lightLow","lightNone","fire","fan","ac", "heat" );
	
	@Override
	public boolean hasSignal(String sn) {
		return signames.contains(sn);
	}

}
