//La class Arena
public class Arene{

    public static Robot fight(Robot robot1, Robot robot2){
        int rang=0; // compteur pour savoir quel des robot va attaquer
        do{
            if(rang%2 == 0 && !robot1.isDead()){ //le robot1 fire a toute les attaque de rang paire
                robot1.fire(robot2);
            }
            if(rang%2 == 1 && !robot2.isDead()){ //le robot2 fire a toute les attaque de rang impaire
                robot2.fire(robot1);
            }
            rang ++;
        }while(!robot1.isDead() && !robot2.isDead());

        if (robot1.isDead() && !robot2.isDead()){
            return robot2;
        }else{
            return robot1;
        }

    }
}
