package com.mycompany.project1comp2;

import java.util.ArrayList;
import java.util.List;

public class Team {

    Team GS = new Team("GS", "Galatasaray");
    Team FB = new Team("FB", "Fenerbahçe");
    Team BJK = new Team("BJK", "Beşiktaş");
    Team TS = new Team("TS", "Trabzonspor");
    Team isik = new Team("ISK", "Işık  Uni");
    transferBoard c = new transferBoard();
    SimulateSystem a = new SimulateSystem();
    private String shortName;
    private String fullName;
    public int totalValue;
    private int size;
    private static int maxSize = 22;
    public static int counter = 0;

    Team(String shortName, String fullName) {
        this.shortName = shortName;
        this.fullName = fullName;
        counter++;
    }

    String getShortName() {
        return this.shortName;
    }

    String getFullName() {
        return this.fullName;
    }

    int getTotalValue() {
        return this.totalValue;
    }

    int getSize() {
        return this.size;
    }

    public String toString() {
        String totalValue = String.valueOf(this.totalValue);
        String size = String.valueOf(this.size);
        String allInfos2 = this.fullName + "\t" + this.shortName + "\t" + this.totalValue + "\n";
        return allInfos2;
    }

    public void totalValueCalculate() {
        int value = 0;
        for (int i = 0; i < c.gsPlayers.size(); i++) {
            value += (int) c.gsPlayers.get(i).getMarketValue();
            value = GS.totalValue;
        }

    }

}
