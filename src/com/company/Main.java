package com.company;

public class Main {

    public static void main(String[] args) {
	// write your code here
    Pracownik p = new Pracownik("arek",new Adres("proszowka",92) );
    }
}
class Pracownik{
    String imie;
    Adres adres;

    public Pracownik(String imie, Adres adres) {
        this.imie = imie;
        this.adres = adres;
    }


}
