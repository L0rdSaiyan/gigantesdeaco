package dbztankz;
import robocode.*;
import java.awt.Color;

//Robô de tiro rápido = Daniel

public class Vegeta extends AdvancedRobot{

 public void acheiFacil(){
  System.out.println("⠄⠄⠄⠄⠄⠄⠄⠄⠄⠄⠄⠄⠄⠄⠄⠄⠄⠄⢀⡀⠄⠤⠄⠄⡀⠄⠄⠄⠜⣻⣿⣿ \n ⣀⣀⣀⣤⣤⡄⠄⠄⠄⢀⣴⣶⣶⣦⡀⠄⠄⠄⠄⠄⠒⠚⠉⠄⠐⠉⠄⠠⣾⣿⣿⣿ \n ⣿⣿⣿⣿⣿⠁⣰⠄⣴⡿⣿⠟⠿⣞⣿⡄⠄⠄⠄⠄⠄⠄⠄⣀⠠⠄⣠⣾⣿⣿⣿⣿ \n ⣿⡿⡿⢁⣀⣸⣿⣾⢫⠞⣁⣴⣶⣾⣿⠛⢀⣤⠄⣤⣴⠞⠋⠄⠠⠮⠭⣹⣿⣿⣿⣿ \n ⠉⡈⠉⠉⠈⢙⡻⠗⣡⠾⣙⣮⣿⣿⣿⣾⢫⣺⡇⠉⠄⠄⠄⢀⣤⣴⣿⣿⣿⣿⣿⣿ \n ⣤⣿⣿⣿⣿⡜⡁⣾⣿⢿⠿⣿⣿⣿⣿⣿⢹⡿⠃⠄⠄⠄⠈⡉⣁⣴⣿⣿⡿⣿⣛⣿ \n ⣽⣿⣿⣿⣿⣿⣿⣿⣾⢯⣺⣿⣿⣿⣿⢿⣷⠄⠄⢠⢤⣤⣵⣾⣟⣿⣿⡮⠞⠛⠁⠄\n ⣿⣿⣿⣿⣿⣿⣿⣽⡿⣿⣿⣿⣿⠿⣯⣿⣿⣿⡿⣿⣿⣿⣽⢗⡿⠛⠁⠄⠄⠄⠄⠄ \n ⣿⣿⣿⣿⣿⣿⣿⣿⣿⣾⣽⣭⣴⣿⠋⡿⠿⠝⣯⣾⠚⣩⠞⠉⠄⠄⠄⠄⠄⠄⠄⠄\n ⣿⣿⣿⣿⣿⣿⣿⣻⢟⠝⡃⣺⣵⠾⠛⣉⣤⠟⠘⢀⡾⠁⠄⠄⠄⠄⠄⠄⠄⠄⠄⠄\n ⣯⣿⣶⣻⡦⣤⠋⠒⣛⣫⣥⣴⢶⣟⣿⣯⣿⣶⡠⠋⠄⠄⠄⠄⠄⠄⠄⠄⠄⠄⢀⡴ \n ⡷⣟⣿⢫⡼⡿⢚⣿⣿⣽⣿⣻⣿⣿⣿⣿⣿⠋⠄⠄⠄⠄⠄⠄⠄⠄⠄⠄⣀⡴⣯⣿");
   StringBuilder frase = new StringBuilder("Eu sou calmo");
    System.out.println(frase);

//Delay aplicado ao código utilizando try catch e uma StringBuilder para simular uma animação de maquina de escrever.
     try{
       Thread.sleep(1000);
       }catch(InterruptedException talk){
        }
 
         frase.append(", e meu coração é puro.");
          System.out.println(frase);

           try{
            Thread.sleep(1000);
             }catch(InterruptedException talk2){
              }
               frase.append(" Meu coração é pura maldade!"); 
                System.out.println(frase);
                 }//Fim do bloco acheiFacil

                 //Bloco da classe NextWall para evitar que o robô fique preso em uma parede
                  public boolean nextWall() {
                   return (getX() < 50 || getX() > getBattleFieldWidth() - 50 ||
                    getY() < 50 || getY() > getBattleFieldHeight() - 50);
                     }
  
                     //Bloco que melhora a presição do tiro do robô
                      public void kamehameha(double Freeza) {
	                   double namek=getHeading()+Freeza-getGunHeading();
	                    if (!(namek > -180 && namek<= 180)) {
		                 while (namek <= -180) {
			              namek += 360;
                           }
       		                while (namek > 180) {
			                 namek -= 360;
		                      }
	                           }
                 	            turnGunRight(namek);
                                 }//Fim do bloco kamehameha
								 
                                  //Bloco do próprio Robocode para executar ações uma única vez, como mudar a cor do robô ou definiar a velocidade.  
                                  public void run() {
	                              setMaxVelocity(10); 
                                   setBodyColor(Color.red);
	                                setRadarColor(Color.white);
	                                 System.out.println("Oi! Eu sou o "+getName()); //O tank se aprensenta no battle log
                                      setAdjustGunForRobotTurn(true);
                                       setAdjustRadarForGunTurn(true);                         

                                       //Bloco do próprio Robocode que enquanto o robô estiver vivo, ele vai executar o que estiver dentro do bloco.
		                                 while(true) {
                                          //Movimentação
                                          ahead(180);
									       setTurnRadarRight(Double.POSITIVE_INFINITY);  //Por ser um loop infinito, coloquei ele para ser executado por segundo.
			                                turnGunRight(360); 
					                         turnRight(40);
			                                  back(80);
			                                   turnGunRight(360);
			                                    back(50);
			                                     turnLeft(30);
			                                      ahead(80);
            										  								
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
			
		*/	                                           //Não deixa o robô bater em uma parede.
                                                        if(nextWall()) {
	                                                     back(100);
                                                        } else {
	   // ahead();
}			
		}
	}                                                  //bloco do próprio Robocode para caso o robô identifique outro robô na arena.
                                                       public void onScannedRobot(ScannedRobotEvent scan) {
                                                      kamehameha(scan.getBearing()); 
                                                     fire(1);
                                                    turnRight(20);	
										           back(30);                               
                                                  System.out.println("MORRA!");	                                  
} 
                                                public void onBulletHit(BulletHitEvent m){
               								   turnRight(30);
								              back(40);                                
}
                                            public void onHitByBullet(HitByBulletEvent rj) {
	                                      setTurnRight(20);
		                                 back(60);
	                                    kamehameha(rj.getBearing());
                                       System.out.println("COMO OUSA BATER NA MINHA BULMA?!");	
}
	                                  public void onHitWall(HitWallEvent e) {
                                     turnLeft(30);
		                            ahead(60);
	}	
                                   public void onHitRobot(HitRobotEvent INI) {
	                              turnRight(INI.getBearing()); 
	                             fire(1);
	                            System.out.println("verme insolente não entre na frente");
}
                               public void onRobotDeath(RobotDeathEvent e) {  
                             String name = getName();
                            System.out.println("Você não passa de um pobre coitado, "+name);
}

                         public void onDeath(DeathEvent e) {
                        System.out.println("O PODER DE LUTA DELE É DE MAIS DE 8 MIL!");
}
                      public void onWin(WinEvent e) {
	                 acheiFacil();

}
} //FIM DO CÓDIGO

