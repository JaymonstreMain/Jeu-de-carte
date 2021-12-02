package Paquet;

import Paquet.Carte;

import java.util.ArrayList;

public class Main21 {
    private ArrayList<Carte> mainDe21;              //List de cartes
    Paquet paquet;

    private int nbCarte;

    public int getNbCarte(){
        return nbCarte;
    }
    public void setNbCarte(){
        this.nbCarte = nbCarte;
    }

    public Main21(Paquet paquet, int nbCarte){

    }
    public void pigerAu21(){

        int indice;
        Carte carte = null;

        if (nbCarte == 0)
            return null;

        else
            indice = 0;

        carte = paquet.get(indice);

        paquet.remove(indice);

        nbCarte = nbCarte + 1;

        return carte;
    }

}


}
