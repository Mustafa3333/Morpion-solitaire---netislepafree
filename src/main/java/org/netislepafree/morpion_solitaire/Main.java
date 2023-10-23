package org.netislepafree.morpion_solitaire;

import javafx.application.Application;
import org.netislepafree.morpion_solitaire.grid.Grid;
import org.netislepafree.morpion_solitaire.grid.Mode;

public class Main {
    public static void main(String[] args) {
        Grid grid= new Grid(50,50, Mode._5T);
        grid.afficher();
        Application.launch(App.class,args);
    }
}

