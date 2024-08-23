package com.mycompany.project1comp2;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class SimulateSystem { 
   
    transferBoard a = new transferBoard();
    //gs
    Player Sacha = new Player("Boey", 1, "Deffender", 35000.0);
    Player Ayhan = new Player("Ayhan", 2, "Deffender", 10.0);
    Player Muslera = new Player("Muslera", 3, "Goalkeeper", 10000.0);
    Player Lucas = new Player("Lucas", 4, "Goalkeeper", 10000.0);
    Player Icardi = new Player("Icardi", 5, "Goalkeeper", 10000.0);
    Player Akturkoglu = new Player("Kerem", 6, "Goalkeeper", 10000.0);
    Player Drogba = new Player("Drogba", 7, "Goalkeeper", 10000.0);
    Player Zaha = new Player("Zaha", 8, "Goalkeeper", 10000.0);
    Player Mertens = new Player("Mertens", 9, "Goalkeeper", 10000.0);
    Player Bakambu = new Player("Bakambu", 18, "Goalkeeper", 10000.0);
    Player Nelsson = new Player("Nelsson", 11, "Goalkeeper", 10000.0);
    //fb
    Player Volkan = new Player("Volkan", 12, "GoalKeeper", 35000.0);
    Player Gökhan = new Player("Gönül", 13, "Deffender", 10.0);
    Player Kjaer = new Player("Kjaer", 14, "Deffender", 10000.0);
    Player Ferdi = new Player("Ferdi", 15, "Deffender", 10000.0);
    Player Caner = new Player("Erkin", 16, "Midfielder", 10000.0);
    Player Emre = new Player("Emre", 17, "Midfielder", 10000.0);
    Player Alex = new Player("Alex", 10, "Midfielder", 10000.0);
    Player Baroni = new Player("Baroni", 19, "Midfielder", 10000.0);
    Player Sow = new Player("Sow", 20, "Forward", 10000.0);
    Player Kuyt = new Player("Kuyt", 21, "Forward", 10000.0);
    Player Persie = new Player("Persie", 22, "Forward", 10000.0);
    //ts
    Player Onur = new Player("Onur", 23, "GoalKeeper", 35000.0);
    Player Yumlu = new Player("Yumlu", 24, "Deffender", 10.0);
    Player Luiz = new Player("Luiz ", 25, "Deffender", 10000.0);
    Player Eren = new Player("Eren ", 26, "Deffender", 10000.0);
    Player Visca = new Player("Visca", 27, "Midfielder", 10000.0);
    Player Bakase = new Player("Bakase", 28, "Midfielder", 10000.0);
    Player Berat = new Player("Berat", 29, "Midfielder", 10000.0);
    Player Colman = new Player("Colman", 30, "Midfielder", 10000.0);
    Player Treze = new Player("Treze", 31, "Forward", 10000.0);
    Player Yattara = new Player("Yattara", 32, "Forward", 10000.0);
    Player Sörloth = new Player("Sörloth", 33, "Forward", 10000.0);
    //bjk
    Player Tolga = new Player("Tolga", 34, "GoalKeeper", 35000.0);
    Player Adriano = new Player("Adriano", 35, "Deffender", 10.0);
    Player Vida = new Player("Vida", 36, "Deffender", 10000.0);
    Player Necip = new Player("Necip", 37, "Deffender", 10000.0);
    Player Ernst = new Player("Ernst", 38, "Midfielder", 10000.0);
    Player Manuel = new Player("Manuel", 39, "Midfielder", 10000.0);
    Player Musrati = new Player("Musrati", 40, "Midfielder", 10000.0);
    Player Sergen = new Player("Sergen", 41, "Midfielder", 10000.0);
    Player Gomez = new Player("Gomez", 42, "Forward", 10000.0);
    Player Burak = new Player("Burak", 43, "Forward", 10000.0);
    Player Hugo = new Player("Hugo", 44, "Forward", 10000.0);

    //IşıkTeam
    Player Erdem = new Player("Erdem", 45, "GoalKeeper", 35000.0);
    Player Can = new Player("Can", 46, "Deffender", 10.0);
    Player Furkan = new Player("Furkan", 47, "Deffender", 10000.0);
    Player Tuna = new Player("Tuna", 48, "Deffender", 10000.0);
    Player Mert = new Player("Mert", 49, "Midfielder", 10000.0);
    Player Seyma = new Player("Seyma", 50, "Midfielder", 10000.0);
    Player Mina = new Player("Mina", 51, "Midfielder", 10000.0);
    Player Erren = new Player("Erren", 52, "Midfielder", 10000.0);
    Player Ege = new Player("Ege", 53, "Forward", 10000.0);
    Player Efe = new Player("Efe", 54, "Forward", 10000.0);
    Player Ali = new Player("Ali", 55, "Forward", 10000.0);



    public static void main(String[] args) {

        transferBoard a = new transferBoard();

        a.populatePlayers(a.gsPlayers);

        a.populatePlayers(a.fbPlayers);

        a.populatePlayers(a.tsPlayers);

        a.populatePlayers(a.bjkPlayers);

        a.populatePlayers(a.isikPlayers);

        Scanner sc = new Scanner(System.in);
        List<Integer> values = new ArrayList<>();
        for (int i = 0; i < values.size(); i++) {

        }
    }
}
