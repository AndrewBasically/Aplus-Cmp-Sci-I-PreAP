// The Speeding Ticket Program

//Name - Andrew 
//Date - 2-1-2021
//Class - PreAP Cmp Sci I
//Lab  - Traffic Ticket

import java.util.Scanner;
import java.lang.System.*;
import javax.swing.JOptionPane;

public class TicketRunner
{
   public static void main(String args[])
   {
      Scanner keyboard = new Scanner(System.in);
      
      System.out.println("The Speeding Ticket Program");
      System.out.println("\nBy: Andrew ");  // Substitute your own name here.
      System.out.println("\n==============================\n");
      
      // add code for input here
      String nm, tdl, addr, cty, st, zp, school = "";
      int pSpd, travel, d, m, yr = 0;
      
      nm = JOptionPane.showInputDialog("Name of Driver?");
      System.out.println("Name of Driver? --> " + nm + "\n");
      
      tdl = JOptionPane.showInputDialog("Driver’s License Number?");
      System.out.println("Driver's License Number? --> " + tdl + "\n");
      
      addr = JOptionPane.showInputDialog("Address?");
      System.out.println("Address? --> " + addr + "\n");
      
      cty = JOptionPane.showInputDialog("City?");
      System.out.println("City? --> " + cty + "\n");
      
      st = JOptionPane.showInputDialog("State?");
      System.out.println("State? --> " + st + "\n");
      
      zp = JOptionPane.showInputDialog("Zip?");
      System.out.println("Zip? --> " + zp + "\n");
      
      school = JOptionPane.showInputDialog("Did the violation occur in a school zone? {Y/N}");
      System.out.println("Did the violation occur in a school zone? {Y/N} --> " + school + "\n");
      
      m = Integer.parseInt(JOptionPane.showInputDialog   ("Month (number)?"));
      System.out.println("Date of Violation:\nMonth (number)? --> " + m + "\n");
      
      d = Integer.parseInt(JOptionPane.showInputDialog("Day?"));
      System.out.println("Day? --> " + d + "\n");
      
      yr = Integer.parseInt(JOptionPane.showInputDialog("Year?"));
      System.out.println("Year? --> " + yr + "\n");
      
      pSpd = Integer.parseInt(JOptionPane.showInputDialog("What is the posted speed limit?"));
      System.out.println("What is the posted speed limit? --> " + pSpd + "\n");
      
      travel = Integer.parseInt(JOptionPane.showInputDialog("How fast was the car travelling in mph?"));
      System.out.println("How fast was the car travelling in mph? --> " + travel + "\n");
      
      // Instantiate and print  
      Ticket test = new Ticket(nm, tdl, addr, cty, st, zp, pSpd, travel, d, m, yr, school);
      System.out.println(test);
   }
}
