//Class de test pour la classe Fighter
import org.testng.annotations.Test;    //importation du FrameWork JUnnit
import static org.junit.jupiter.api.Assertions.assertEquals;

public class AreneTest {

    //Test de la methode fight
    @Test
    public void fight_Test(){
        Robot r1= new Robot("r1");
        Robot r2= new Robot("r2");
        //r1 attaque le premier donc forcement il est le gagnant
        if(Arene.fight(r1, r2) == r1){ System.out.println("\n Test de la methode fight(): Good");}
        else{ System.out.println("\nTest de la methode fight(): Bad");}
    }
}
