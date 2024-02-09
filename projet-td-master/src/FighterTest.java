//CLasse de Test pour la classe Fighter

import org.testng.annotations.Test;

public class FighterTest {
    //Test du constructeur d'un Fighter
    @Test
    public void fighter_Test_Constructeur(){
        Fighter jetli= new Fighter("jetli");
        System.out.print("Test du Constructeur: ");
        if (jetli.nom.equals("jetli") && jetli.pointDeVie == 10){
            System.out.println("Good");
        }else{
            System.out.println("Bad");
        }
    }
    //Test de la methode fight() figther/humains
    @Test
    public void fight_Test_Fire() {
        //On teste juste le cas ou il ratte (le random retourne false) car le cas contraire est déja teste
        Fighter f1 = new Fighter("f1");
        Fighter f2 = new Fighter("f2");

        boolean chanceDeToucher= f1.fire(f2);// On recupere la "chance de toucher" de l'attaquant pour voir si il a toucher ou pas
        if((chanceDeToucher && f2.pointDeVie < 10) || (!chanceDeToucher && f2.pointDeVie==10)){
            System.out.println("Test de la methode fire(): Good");
        }else{
            System.out.println("Test de la methode fire(): Bad");
        }

    }
}
