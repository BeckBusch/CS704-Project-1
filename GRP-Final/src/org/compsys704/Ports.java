package org.compsys704;

public class Ports {
	public static final int PORT_LOADER_PLANT = 10001;
	public static final int PORT_LOADER_CONTROLLER = 10000;
	public static final int PORT_LOADER_VIZ = 20000;
	
	// Manual 
	public static final String SIGNAL_PUSHER_EXTEND   = "PlantECSCD.humd";
//	public static final String SIGNAL_VACOFF          = "ControllerCD.vacOffM";
	public static final String SIGNAL_VACON           = "PlantECSCD.occu";
	public static final String SIGNAL_ARM_SOURCE      = "PlantECSCD.smoke";
	public static final String SIGNAL_ARM_DEST        = "PlantECSCD.working";
	public static final String SIGNAL_Mode            = "PlantECSCD.temp";
}
