package run;

import java.io.IOException;

public class GUI implements java.lang.Runnable {
	public void run() {
		//org.compsys704.CapLoader.main(null);
		try {
			org.compsys704.ACS_GUI.main(null);
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
}
