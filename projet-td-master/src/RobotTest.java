//Class de test pour la classe Robot
import org.testng.annotations.Test;    //importation du FrameWork JUnnit
import static org.junit.jupiter.api.Assertions.assertEquals;

public class RobotTest {

    //Test du Constructeur
    @Test //Indique a JUnit qu'il s'agit d'un test unitaire
    public void constructeur_Test(){
        Robot r1 = new Robot("r1");
        System.out.print("Test du Constructeur: ");
        if (r1.nom.equals("r1") && r1.pointDeVie == 10){
            System.out.println("Good");
        }else{
            System.out.println("Bad");
        }
    }

    //Test de la methode fire()
    @Test //Indique a Junit qu'il s'agit d'un test unitaire
    public void r1_Fire_r2_Test() {
        Robot r1 = new Robot("r1");
        Robot r2 = new Robot("r2");
        r1.fire(r2);
        System.out.print("\nTest de la methode fire(): ");
        if (r2.pointDeVie == 8 && r1.pointDeVie == 10) { System.out.println("Good");}
        else { System.out.println("Bad"); }
    }

    //Test de la methode isDead()
    @Test
    public void r1_isDead_Test(){
        System.out.print("Test de la methode isDead(): ");
        Robot r1 = new Robot("r1");
        r1.pointDeVie =0;
        if (r1.isDead()){ System.out.println("Good");}
        else{ System.out.println("Bad"); }
    }
}
