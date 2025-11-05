/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package tp2_convertisseurobjet_vincenttaveau;

/**
 *
 * @author jules
 */

    public class Convertisseur {
    
    private int nbConversions;

   
    public Convertisseur() {
        nbConversions = 0;
    }
   public double CelciusVersKelvin(double tempCelcius) {
        nbConversions++;
        return tempCelcius + 273.15;
    }   
    public double KelvinVersCelcius(double tempKelvin) {
        nbConversions++;
        return tempKelvin - 273.15;
    }   
    public double FahrenheitVersCelcius(double tempFahrenheit) {
        nbConversions++;
        return (tempFahrenheit - 32) * 5.0 / 9.0;
    }    
    public double CelciusVersFahrenheit(double tempCelcius) {
        nbConversions++;
        return tempCelcius * 9.0 / 5.0 + 32;
    }  
    public double KelvinVersFahrenheit(double tempKelvin) {
        nbConversions++;
        return (tempKelvin - 273.15) * 9.0 / 5.0 + 32;
    }
    public double FahrenheitVersKelvin(double tempFahrenheit) {
        nbConversions++;
        return (tempFahrenheit - 32) * 5.0 / 9.0 + 273.15;
    }

    
    @Override
    public String toString() {
        return "nb de conversions : " + nbConversions;
    }
}


