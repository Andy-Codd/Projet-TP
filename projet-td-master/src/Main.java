//Code Principal
import org.testng.annotations.Test;    //importation du FrameWork JUnnit
import static org.junit.jupiter.api.Assertions.assertEquals;

public class Main{

    public static void main(String[] args){
        System.out.println("---------------------------------------------\n");

        //Test du constructor
        Robot bob= new Robot("bob");
        bob.afficherRobot();

        //Test du combat de la methode fight

        //creation de robots
        Robot d2r2= new Robot("D2R2");
        Robot data= new Robot("Data");

        System.out.println("\nCombat entre le robot "+d2r2.nom+" et le Robot "+data.nom+" ....FIGHT !!\n");

        System.out.println("\n Le vainqueur du combat est "+Arene.fight(d2r2, data).nom);

        System.out.println("------------------------------------------------\n");

        //Debut de l'exercice 2
        //Combat entre Fighter et Fighter
        Fighter rio= new Fighter("Rio");//Contruction d'un objet Fighter
        rio.afficherFigther();//methode pour afficher un fighter
        Fighter kula= new Fighter("Kula");
        kula.afficherFigther();

        System.out.println("\nLe vainquer du combat est "+Arene.fight(rio, kula).nom);//Combat entre deux humains

        //-----------TEST FONCTIONNEL--------------
        //On verifie si on reponds aux besoins Fonctionnelles
        //On teste si le combat entre robots ou humains aboutis et il y'a justement un gagnant, juste en executant la class Main
        //Chaque fois qu'un combattant tire sur une cible et l'atteint, ses point de vie sont reduit de 2
        //Lorsqu'il rate, On a aucune reduction
        //Les combattant attaquent a tour de roles
        //Pour le combat de Robot C'est Toujours le premier Robot qui gagne
        //Pour le Combat Humain, le gagnat est aleatoire


    }
}