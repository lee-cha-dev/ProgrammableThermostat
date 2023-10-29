/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Project/Maven2/JavaApp/src/main/java/${packagePath}/${mainClassName}.java to edit this template
 */

package lee.dev.programmablethermostat;

/**
 *
 * @author KCHAR
 */
public class ProgrammableThermostat {

    public static void main(String[] args) {
        ThermostatDriver driver = new ThermostatDriver("https://media.capella.edu/BBCourse_Production/IT4774/temperature.json");
        driver.displayThermostat();
    }
}
