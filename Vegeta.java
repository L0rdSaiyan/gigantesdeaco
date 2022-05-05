package dbztankz;
import robocode.*;
import java.awt.Color;

public class Vegeta extends AdvancedRobot{

 public boolean nextWall() {
  return (getX() < 50 || getX() > getBattleFieldWidth() - 50 ||
   getY() < 50 || getY() > getBattleFieldHeight() - 50);
}
    public void fireup(double Range) {
	 if (Range > 200 || getEnergy() < 15) {
	  fire(1);
}      else if (Range > 50) {
		fire(2);
	}    else {
		  fire(3);
    }
}

           public void aim(double Cr6) {
	        double CR7=getHeading()+Cr6-getGunHeading();
	         if (!(CR7 > -180 && CR7<= 180)) {
		      while (CR7 <= -180) {
			   CR7 += 360;
}
       		    while (CR7 > 180) {
			     CR7 -= 360;
		}
	}
	              turnGunRight(CR7);
}
                   public void run() {
	  
                    setBodyColor(Color.red);
	                 setRadarColor(Color.white);
	                   System.out.println("Oi! Eu sou o "+getName()); //O tank do Daniel se aprensenta no battle log
	
		                while(true) {
 
                         setMaxVelocity(10);
                          setAhead(100);
			               setTurnRight(90);
			                setAhead(100);
			                 setTurnGunLeft(360);
			                   setTurnGunRight(360);
			                    execute();
//Testes de movimentação
		/*	ahead(100);
			turnGunRight(1000);
			back(40);
			turnGunRight(1000);
			setAhead(100);
			setTurnRight(90);
			setAhead(100);
			setTurnGunLeft(90);
			setTurnLeft(90);
			execute();
			
		*/	
                                         if(nextWall()) {
	                                      back(100);
                                           } else {
	   // ahead();
}			
		}
	}

                                            	public void onScannedRobot(ScannedRobotEvent scan) {

                                               if(getEnergy() <40){
                                              fire(1);
                                             }else{
                                            fire(2);
 }
                                          aim(scan.getBearing());
                                        fireup(scan.getDistance());
	                                   setTurnRight(20);
	                                  back(30);
	                                System.out.print("MORRA!");	
	}
	
                                 public void onBulletHit(BulletHitEvent m){
		
}
                               public void onHitByBullet(HitByBulletEvent rj) {
	                         setTurnRight(20);
		                    back(60);
	                      aim(rj.getBearing());
                         System.out.println("COMO OUSA BATER NA MINHA BULMA?!");	
}
	                   public void onHitWall(HitWallEvent e) {
             
                     turnLeft(30);
		            back(20);

	}	




} //FIM DO CÓDIGO

