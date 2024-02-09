//La classes Robot

public class Robot{
    // Creation des attribute
    String nom;
    int pointDeVie;

    //Creation des methods
    //Constructor
    public Robot(String nom){
        this.nom = nom;
        this.pointDeVie = 10;
    }
    public void afficherRobot(){
        System.out.println("Robot "+this.nom);
    }

    //Methode Fire pour attaquer un robot cible

    public boolean fire(Robot cible){
        cible.pointDeVie -= 2;
        System.out.println("\n-> Robot/Fighter " + cible.nom + " a ete touche par le Robot/Fighter " + this.nom + " !");
        System.out.println("Point de vie: " + cible.nom + " = " + cible.pointDeVie + "; " + this.nom + " = " + this.pointDeVie + " ;");
    return true;
    }
    //Methode isdead pour verifier si le robot est mort
    public boolean isDead(){
        if (this.pointDeVie <= 0) return true;
        else return false;
    }

    public static void main(String[] args){}
}
