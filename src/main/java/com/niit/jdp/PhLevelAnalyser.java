package com.niit.jdp;

import java.util.Scanner;

public class PhLevelAnalyser {
    public static void main(String[] args) {
        String statusOfAquarium = "";
        Scanner Scanner = new Scanner(system.in);
        System.out.println("Enter phlevel :");
        int phLevel = scanner.nextInt();
        PhLevelAnalyser phLevelAnalyser = new PhLevelAnalyser();
        String data = phLevelAnalyser.getphValueOfWater(phLevel);
        System.out.println(data);
    }

    // A method which takes ana integer as input and returns a string.
    public String getphValueOfWater(int phLevel){

        String statusOfAquarium="";
            if (phlevel < 7) {
                statusOfAquarium = "pH value is low, partial water change is required";
            } else if (phLevel >= 7 && phLevel <= 8) {
                statusOfAquarium = "pH value is fine";
            } else if (phLevel > 8) {
                statusOfAquarium = "pH value is high, partial water change is required";
            }
            return statusOfAquarium;

            }
    }





    }
}
