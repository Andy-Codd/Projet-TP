//La Nouvelle classe Fighter
import  java.util.Random;

public class Fighter extends Robot{
    Random seed= new Random();

    public Fighter(String nom) {
        super(nom);
        //System.out.println("La chance de reussir est "+chanceDeToucher);
    }
    public void afficherFigther(){
        System.out.println("Fighter "+this.nom);
    }

    @Override
    public boolean fire(Robot cible) {
        boolean chanceDeToucher = seed.nextBoolean();
        if (!chanceDeToucher){
            System.out.println("\n-> "+this.nom+" a attaquer "+cible.nom+" mais a ratter ca cible");
        }else{
            super.fire(cible);
        }
        return chanceDeToucher;
    }
}
