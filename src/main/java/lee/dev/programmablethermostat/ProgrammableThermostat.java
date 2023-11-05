/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Project/Maven2/JavaApp/src/main/java/${packagePath}/${mainClassName}.java to edit this template
 */

package lee.dev.programmablethermostat;

import java.util.Scanner;

/**
 *
 * @author KCHAR
 */
public class ProgrammableThermostat {

    public static void main(String[] args) {
        // ThermostatDriver driver = new ThermostatDriver("https://media.capella.edu/BBCourse_Production/IT4774/temperature.json");
        // driver.displayThermostat();

        // INIT THE USER SETTINGS HANDLER CLASS
        UserSettingsHandler settings = new UserSettingsHandler();

        // LOOP TO ALLOW THE USER TO MAKE MULTIPLE CHANGES - SPECIFIC TO THE NON-GUI APPROACH
        Scanner input = new Scanner(System.in);
        boolean isRunning = true;
        String answer = "";
        while (isRunning) {

            // FUNCTION TO ALLOW THE USER TO UPDATE A SETTINGS
            settings.promptUserForNewSettings();

            boolean validAnswer = false;
            while (!validAnswer){
                System.out.print("\nWould you like to edit another hour's settings (y/n)? ");
                answer = input.nextLine();

                if (answer.equalsIgnoreCase("n") || answer.equalsIgnoreCase("y")){
                    validAnswer = true;
                    isRunning = !answer.equalsIgnoreCase("n");
                } else {
                    System.out.println("Please enter either 'y' for yes or 'n' for no.");
                }
            }
        }
    }
}
