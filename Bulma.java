package dbztankz;
import robocode.*;
import java.awt.Color;

 public class Bulma extends AdvancedRobot
{

//Tank de tiro rápido = Maria Eduarda

  public void mtfacil(){
  turnRight(36000);    

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
                               System.out.println("Oi! Eu sou a "+getName()); //O tank se aprensenta no battle log
  
                        	 while(true){
    
                              setMaxVelocity(4);
                                ahead(100);
								setTurnRadarRight(Double.POSITIVE_INFINITY);  //Por ser um loop infinito, coloquei ele para ser executado por segundo.			                
			                     
turnGunRight(360);
			                      back(100);
			                       turnGunRight(360);
                                    if(getEnergy()<15){	 //Estrutura condicional para caso o tank estiver com menos de 15 de energia, ele diminuir a potência de dispartos e assim evitar de ficar desabilitado.
                                     setFire(1);

								 }

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
	                                                   back(80);
	                                                    System.out.println("Vou Chamar o VEGETA!");

	}
                                                        	public void onHitByBullet(HitByBulletEvent rj) {
		                                             
                                            System.out.println("Seu folgado!");
		                                back(60);	
	}
                                	public void onHitWall(HitWallEvent parede) {
                                 turnLeft(30);
		                     back(20);
	}	
	
                         public void onWin(WinEvent e) {
	                   mtfacil();

}
} //FIM DO CÓDIGO


