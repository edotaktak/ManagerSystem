package com.mycompany.project1comp2;

import java.util.ArrayList;
import java.util.List;
import java.util.Formatter;

public class transferBoard {

    List<Player> gsPlayers = new ArrayList<>();
    List<Player> fbPlayers = new ArrayList<>();
    List<Player> tsPlayers = new ArrayList<>();
    List<Player> bjkPlayers = new ArrayList<>();
    List<Player> isikPlayers = new ArrayList<>();

    void populatePlayers(List players) {
        System.out.println(" ");
        for (int i = 0; i < players.size(); i++) {
            System.out.println(players.get(i));
        }

    }

    void populateTeams(List teams) {
        System.out.println(" ");
        for (int i = 0; i < teams.size(); i++) {
            System.out.println(teams.get(i));
        }
    }

    String makeContract(Player playerName, String teamName, String contractType, double contractValue) {

        return teamName;
    }

    String terminateContract(Player playerName, String teamName) {
        return teamName;
    }

    public transferBoard() {
        SimulateSystem b = new SimulateSystem();
        
       /* gsPlayers.add(b.Muslera);
        gsPlayers.add(b.Ayhan);
        gsPlayers.add(b.Sacha);
        gsPlayers.add(b.Zaha);
        gsPlayers.add(b.Icardi);
        gsPlayers.add(b.Akturkoglu);
        gsPlayers.add(b.Drogba);
        gsPlayers.add(b.Zaha);
        gsPlayers.add(b.Mertens);
        gsPlayers.add(b.Bakambu);
        gsPlayers.add(b.Nelsson);

        //fb
        fbPlayers.add(b.Volkan);
        fbPlayers.add(b.Gökhan);
        fbPlayers.add(b.Kjaer);
        fbPlayers.add(b.Ferdi);
        fbPlayers.add(b.Caner);
        fbPlayers.add(b.Emre);
        fbPlayers.add(b.Alex);
        fbPlayers.add(b.Baroni);
        fbPlayers.add(b.Sow);
        fbPlayers.add(b.Kuyt);
        fbPlayers.add(b.Persie);
        //ts

        tsPlayers.add(b.Onur);
        tsPlayers.add(b.Yumlu);
        tsPlayers.add(b.Luiz);
        tsPlayers.add(b.Eren);
        tsPlayers.add(b.Visca);
        tsPlayers.add(b.Bakase);
        tsPlayers.add(b.Berat);
        tsPlayers.add(b.Colman);
        tsPlayers.add(b.Treze);
        tsPlayers.add(b.Yattara);
        tsPlayers.add(b.Sörloth);

        //BJK
        bjkPlayers.add(b.Tolga);
        bjkPlayers.add(b.Adriano);
        bjkPlayers.add(b.Vida);
        bjkPlayers.add(b.Necip);
        bjkPlayers.add(b.Ernst);
        bjkPlayers.add(b.Manuel);
        bjkPlayers.add(b.Musrati);
        bjkPlayers.add(b.Sergen);
        bjkPlayers.add(b.Gomez);
        bjkPlayers.add(b.Burak);
        bjkPlayers.add(b.Hugo);

        isikPlayers.add(b.Erdem);
        isikPlayers.add(b.Can);
        isikPlayers.add(b.Furkan);
        isikPlayers.add(b.Tuna);
        isikPlayers.add(b.Mert);
        isikPlayers.add(b.Seyma);
        isikPlayers.add(b.Mina);
        isikPlayers.add(b.Erren);
        isikPlayers.add(b.Ege);
        isikPlayers.add(b.Efe);
        isikPlayers.add(b.Ali);*/
    }
    public int totalGS(){
    int value=0;
    for(int i=0;i<gsPlayers.size();i++){
    value+=gsPlayers.get(i).getMarketValue();
    }
    return value;
    }

}
