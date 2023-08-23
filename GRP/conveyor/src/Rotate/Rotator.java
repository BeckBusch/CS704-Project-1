package Rotate;

import java.util.*;

public class Rotator {
	private boolean[] slots = {false, false, false, false, false, false};
	
	public Rotator() {
		System.out.println("Created rotator.");
	}
	
	public void rotateRotate() {
		boolean t = slots[5];
		
		for (int i = 0; i < 5; i++) {
			slots[i + 1] = slots[i]; 
		}
		
		slots[0] = t;
	}
	
	public boolean get(int i) {
		return slots[i];
	}
	
	
	// doesnt return success. returns bottle to add state
	public boolean addBottle(boolean bottleToAdd) {
		if (bottleToAdd == false) {
			return false;
		}
		
		if (slots[0] == true) {
			return true;
		} else {
			slots[0] = true;
			return false;
		}
	}
	
	// return if there is a bottle removed or not
	public boolean removeBottle() {
		if (slots[4] == true) {
			slots[4] = false;
			return true;
		} else {
			return false;
		}
	}
}
