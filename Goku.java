package dbztankz;
import robocode.*;
import java.awt.Color;

 public class Goku extends AdvancedRobot
{

//Tank de tiro Forte = João Victor

  public void mtfacil(){
  turnRight(36000);    
   System.out.println("⠄⠄⠄⠄⠄⠄⠄⠄⠄⠄⠄⡀⠄⠄⠄⠄⠄⠄⠄⠄⠉⠻⣿⣿⣿⣿⣿⣿⣿⣿⣿ \n ⠄⠄⠄⠄⠄⠄⠄⠄⠄⢀⠎⠄⠄⣀⡀⠄⠄⠄⠄⠄⠄⠄⠘⠋⠉⠉⠉⠉⠭⠿⣿ \n ⡀⠄⠄⠄⠄⠄⠄⠄⠄⡇⠄⣠⣾⣳⠁⠄⠄⢺⡆⠄⠄⠄⠄⠄⠄⠄⠄⠄⠄⠄⠄ \n ⣿⣷⡦⠄⠄⠄⠄⠄⢠⠃⢰⣿⣯⣿⡁⢔⡒⣶⣯⡄⢀⢄⡄⠄⠄⠄⠄⠄⣀⣤⣶ \n ⠓⠄⠄⠄⠄⠄⠸⠄⢀⣤⢘⣿⣿⣷⣷⣿⠛⣾⣿⣿⣆⠾⣷⠄⠄⠄⠄⢀⣀⣼⣿ \n ⠄⠄⠄⠄⠄⠄⠄⠑⢘⣿⢰⡟⣿⣿⣷⣫⣭⣿⣾⣿⣿⣴⠏⠄⠄⢀⣺⣿⣿⣿⣿ \n ⣿⣿⣿⣿⣷⠶⠄⠄⠄⠹⣮⣹⡘⠛⠿⣫⣾⣿⣿⣿⡇⠑⢤⣶⣿⣿⣿⣿⣿⣿⣿ \n ⣿⣿⣿⣯⣤⣤⣤⣤⣀⣀⡹⣿⣿⣷⣯⣽⣿⣿⡿⣋⣴⡀⠈⣿⣿⣿⣿⣿⣿⣿⣿ \n ⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣾⣝⡻⢿⣿⡿⠋⡒⣾⣿⣧⢰⢿⣿⣿⣿⣿⣿⣿⣿ \n ⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⡿⠃⣏⣟⣼⢋⡾⣿⣿⣿⣘⣔⠙⠿⠿⠿⣿⣿⣿ \n        Meu compromisso é sempre VENCER!");
     System.out.println(getName()+"WINS!");             
       

}

               public void kamehameha(double Kaioken) { 
	            double Masenko=getHeading()+Kaioken-getGunHeading();
	             if (!(Masenko > -180 && Masenko <= 180)) {
	              while (Masenko <= -180) {
			       Masenko += 360;
}
	        	    while (Masenko > 180) {
			         Masenko -= 360;
		}
	}
	                  turnGunRight(Masenko);
}

                    	public void run() {
                         setScanColor(Color.yellow);
                          setBulletColor(Color.red);
                           setBodyColor(Color.red);
                            setAdjustGunForRobotTurn(true);
                             setAdjustRadarForGunTurn(true);                         
                              System.out.println("Oi! Eu sou o "+getName()); //O tank se aprensenta no battle log
  
                        	 while(true){
    
                              setMaxVelocity(4);
                               ahead(100);
								setTurnRadarRight(Double.POSITIVE_INFINITY);  //Por ser um loop infinito, coloquei ele para ser executado por segundo.			                
                                 turnGunRight(360); 
					               turnRight(30);
			                        back(80);
			                         turnGunRight(360);
			                          back(50);
			                           turnLeft(30);
			                            ahead(80);  
			                             back(30);
			              
                                 

//Testes de movimentação q eu tava fazendo
/*    ahead(90);
    turnGunRight(360);
	turnGunLeft(360);
	back(40);
------------------   
turnGunRight(360);   
    ahead(100); 
    turnGunRight(360);   
    back(90);  
   */
  
}
	}
	                                           public void onScannedRobot(ScannedRobotEvent scan) {
    
                                                    kamehameha(scan.getBearing());
                                                     fire(3);
                                                      ahead(90);
													  turnLeft(30);
	                                                   back(80);
	                                                    System.out.println("KAMEHAMEHA!");

	}
                                                        	public void onHitByBullet(HitByBulletEvent rj) {
		                                             setTurnRight(20);
		                                           back(60);
                                                 System.out.println("MALDITO!!!!");
		                                       
	}
                                	public void onHitWall(HitWallEvent parede) {
                                 turnLeft(30);
		                     back(40);
	}	

  public void onRobotDeath(RobotDeathEvent e) {  
                             String name = getName();
                            System.out.println("Você não é tão forte assim, é um fracassado, "+name);	

	}

   public void onDeath(DeathEvent e) {
                        System.out.println("O PODER DE LUTA DELE É DE MAIS DE 8 MIL!");
}

                         public void onWin(WinEvent e) {
	                   mtfacil();

}
} //FIM DO CÓDIGO


