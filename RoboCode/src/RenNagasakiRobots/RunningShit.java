package RenNagasakiRobots;
import robocode.*;


public class RunningShit extends Robot {
	public String lastHit = "";
	public int heading;
	
	
	public void run() {
		turnGunRight(360);
		//back(100);
    }
  
    public void onScannedRobot(ScannedRobotEvent e) {
    	if (lastHit == e.getName() || lastHit == "") {
        	fire(1);
        	//turnGunRight(e.getHeading());
    	}
    }
    
    public void onHitRobot(HitRobotEvent e){
    	lastHit = e.getName();
    }
}
