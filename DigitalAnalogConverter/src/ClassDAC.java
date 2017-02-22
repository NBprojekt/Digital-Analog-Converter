/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author rainbowdash
 */
public class ClassDAC {
        // Variablen 
    public double Uges;     // Eingangsstrom
    public double R;        // Wiederstand
    
    private int S0;         // Schalter 0
    private int S1;         // Schalter 1
    private double UA;      // Ausgangsstrom
    private double Iges;    // Gesamtpannung
    private double Rges;    // Gesamtwiedestand
    
        // Konstruktoren
    public ClassDAC() {
        
    }
    public ClassDAC(double Eingangsstrom, double Wiederstand) {
        // Auslesen der Werte
        Uges    = Eingangsstrom;
        R       = Wiederstand;
    }
    public ClassDAC(int Eingangsstrom, int Wiederstand) {
        // Auslesen und umwandeln der Werte
        Uges    = (double)Eingangsstrom;
        R       = (double)Wiederstand;
    }
    public ClassDAC(String Eingangsstrom, String Wiederstand) {
        // Auslesen und umwandeln der Werte
        Uges    = Double.parseDouble(Eingangsstrom);
        R       = Double.parseDouble(Wiederstand);
    }
    
        // Set-Methoden für die Schalter 0 und 1
    public boolean setS0(int tmp){
            // S0 muss 1 oder 0 sein
        if(tmp !=0 && tmp != 1) return false;
            // sonnst S0 setzen und true zurückgeben
        else{
            S0 = tmp;
            return true;
        }
    }
    public boolean setS1(int tmp){
            // S0 muss 1 oder 0 sein
        if(tmp !=0 && tmp != 1) return false;
            // sonnst S1 setzen und true zurückgeben
        else{
            S1 = tmp;
            return true;
        }
    }
        // Get-Methode für UA, Iges, Rges
    public double getUA(){
        return UA;
    }
    public double getIges(){
        return Iges;
    }
    public double getRges(){
        return Rges;
    }
    
        /* Berechnen 
         * Greift auf die unten aufgeführeten Mthoden zu 
         * um mit den beigefügten Schalter werten die Lösung zu bestimmen
         */
    public double LosRechneJetzt(){
        // [s0 = 0, s1 = 0]
        if ( S1 == 0 && S0 == 0){
            // Rechnung 0 ausführen
            Rechnung0();
        }
        // [s0 = 1, s1 = 0]
        else if ( S1 == 0 && S0 == 1){
            // Rechnung 1 ausführen
            Rechnung1();
        }
        // [s0 = 0, s1 = 1]
        else if ( S1 == 1 && S0 == 0){
            // Rechnung 2 ausführen
            Rechnung2();
        }
        // [s0 = 1, s1 = 1]
        else if ( S1 == 1 && S0 == 1){
            // Rechnung 3 ausführen
            Rechnung3();
        }
        // Ruckgabe des Ausgangsstrom
        return UA;
    }
    
        /*          Rechnungen
         *  ( mögliche Wahrheitstabelle )
         * 
         *      S1 | S0 | UA
         *     ______________
         *       0 |  0 |  0
         *       0 |  1 |  3
         *       1 |  0 |  6
         *       1 |  1 |  9
         */
    // Wenn beide Schalter auf Masse geschaltet sind   [s0 = 0, s1 = 0]
    private void Rechnung0(){
        // Hier gibt es nichts zu rechnen denn beide Schalter sind 
        // auf Masse geschaltet und es kann kein Strom fließen
        UA = 0;
    }
    // Wenn Schalter0 geschaltet ist und Schalter1 aus Masse [s0 = 1, s1 = 0]
    private void Rechnung1(){
        // Gesammt Wiederstand ausrechnen
        Rges = ((3*R) * (2*R)) / ((3*R) + (2*R));
        Rges += (2*R);
        // Gesammt Spannung ausrechnen
        Iges = Uges / Rges;
        // Zwischenvariablen für den abfallenden Strom
        double U1, U2, Ű;
        // Zwischenvariablen für den abfallenden Spannung
        double I1,I2;
        
        // Berechnen von U1 und U2
        U1 = (2*R) * Iges;
        U2 = (((3*R) * (2*R)) / ((3*R) + (2*R))) * Iges;
        
        // Berechnen von I1 un I2
        I1 = U1 / (2 * R);
        I2 = U2 / R;
        
        // Berechnen von Ű
        Ű = (2*R) * I2;
        
        // Berechnen vom Ausgangsstrom
        UA = Uges - Ű;
    }
    // Wenn Schalter0 auf Masse ist und Schalter1 geschaltet [s0 = 0, s1 = 1]
    private void Rechnung2(){
        // Gesammt Wiederstand ausrechnen
        Rges = ((2*R) * (2*R)) / ((2*R) + (2*R));
        Rges += (2*R) + R;
        // Gesammt Spannung ausrechnen
        Iges = Uges / Rges;
        // Zwischenvariable für den abfallenden Strom
        double Ű;
        Ű = (2 * R) * Iges;
        
        // Berechnen vom Ausgangsstrom
        UA = Uges - Ű;
    }
    // Wenn beide Schalter auf geschaltet sind [s0 = 1, s1 = 1]
    private void Rechnung3(){
        // Gesammt Wiederstand ausrechnen
        Rges = ( ((3*R) * (2*R)) / ((3*R) + (2*R)) );
        Rges += (2*R);
        // Gesammt Spannung ausrechnen
        Iges = Uges / Rges;
        // Zwischenvariablen für den abfallenden Strom
        double U1, U2, Ű;
        // Zwischenvariablen für den abfallenden Spannung
        double I1,I2, I3;
        
        // Berechnen von U1 und U2
        U1 = (((3*R) * (2*R)) / ((3*R) + (2*R))) * Iges;
        U2 = (2*R) * Iges;
        
        // Berechnen von I1, I2 und I3
        I1 = U1 / (2*R);
        I3 = U2 / (2*R);
        I2 = I3 - I1;
        
        // Berechnen von Ű
        Ű = (2*R) * I2;
        
        // Berechnen vom Ausgangsstrom
        UA = Uges - Ű;
    }
}

