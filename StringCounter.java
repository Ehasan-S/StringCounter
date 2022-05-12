package com.company;

import javax.swing.JOptionPane; //importing library for dialogue box

public class StringCounter

{
    public static void main(String[] args) {
        while(true){ //infinite loop for continuing program
            JOptionPane.showMessageDialog(null,"This program counts the number of given string in a text.\n Enter \"stop\"  to terminate the program");
            String inputChar = JOptionPane.showInputDialog("Enter your string");
            String inputText = JOptionPane.showInputDialog("Enter your text"); //user input
            int charNumber = 0;
            String stop = "stop";
            if(stop.equalsIgnoreCase(inputText)){ // checking if the input is "stop" with all upper/lower case possibilities
                JOptionPane.showMessageDialog(null,"Shutdown");
                System.exit(0);;
            }
            else{
                for(int i=0; i<inputText.length(); i++){ // starting a loop
                    if(inputText.charAt(i) == inputChar.charAt(0)){ //looking for input character
                        charNumber++;//adding number of character e to the initial value
                    }
                }
                JOptionPane.showMessageDialog(null, "Number of input character " + inputChar + ": " + charNumber );
                //showing the number input character
            }
        }
    }
}
