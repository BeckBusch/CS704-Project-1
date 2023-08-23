package gui;

import java.util.Arrays;
import java.util.List;

public class LoaderVizWorker extends Worker{

	@Override
	public void setSignal(boolean status) {
//		System.out.println(signame+"  "+status);
		switch(signame){
		case "bottle1E":
			States.BOTTLE_1_EXIST = status;
			break;
		case "bottle2E":
			States.BOTTLE_2_EXIST = status;
			break;
		case "bottle3E":
			States.BOTTLE_3_EXIST = status;
			break;
		case "bottle4E":
			States.BOTTLE_4_EXIST = status;
			break;
		case "bottle5E":
			States.BOTTLE_5_EXIST = status;
			break;
		case "bottle6E":
			States.BOTTLE_6_EXIST = status;
			break;

		case "before1E":
			States.BOTTLE_ON_CON_1 = status;
			break;
		case "after5E":
			States.BOTTLE_ON_CON_5 = status;
			break;
		case "con1onE":
			States.CON_1_ON = status;
			break;
		case "con5onE":
			States.CON_5_ON = status;
			break;
			
		default: 
			System.err.println("Wrong sig name : "+signame);
			System.exit(1);
		}
	}
	
	
	static final List<String> signames = Arrays.asList("bottle1E","bottle2E","bottle3E","bottle4E","bottle5E","bottle6E", "before1E", "after5E", "con1onE", "con5onE");
	
	@Override
	public boolean hasSignal(String sn) {
		return signames.contains(sn);
	}

}
