//(c) A+ Computer Science
//www.apluscompsci.com

//Name - Andrew 
//Date - 2-1-2021
//Class - PreAP Cmp Sci I
//Lab  - Traffic Ticket

public class Ticket
{
   //Driver Information
   private String name, TDL, address, city, state, zip;

   //Violation Information
   private int postedSpeed, travelling, ticketAmount, day, month, year;
   private boolean schoolZone;

   public Ticket()
   {
      name = "";
      TDL = "";
      address = "";
      city = "";
      state = "";
      zip = "";
      postedSpeed = 0;
      travelling = 0;
      ticketAmount = 0;
      day = 0;
      month = 0;
      year = 0;
      schoolZone = false;
   }

   public Ticket(String nm, String tdl, String addr, String cty, String st, String zp, int pSpd, int travel, int d, int m, int yr, String school)
   {
      name=nm; TDL=tdl; address=addr; city=cty; state=st; zip = zp;
      postedSpeed = pSpd; travelling = travel; day = d; month = m; year = yr;
      if (school.equals("Y"))
      {
         schoolZone = true;
      }
      calcTicket();
      lastName();
   }
   
   public void calcTicket()
   {
      ticketAmount = 75;
      ticketAmount += (travelling - postedSpeed) * 6;
      if ((travelling - postedSpeed) > 30)
      {
         ticketAmount += 160;
      }
      if (schoolZone)
      {
         ticketAmount *= 2;
      }
   }
   
   public String lastName()
   {
      return (name.substring(name.indexOf(" ") + 1, name.length()));
   }
   
   public String toString()
   { 
      if (schoolZone) 
      {
         String s = month + "/" + day + "/" + year + "\n\n" + name + " (TDL: " + TDL + ")\n" + address + "\n" + city + ", " + state + " " + zip + "\n\nDear citizen " + lastName() + ",\n\nYou have received this citation for driving " + travelling + "mph in an area with a\nposted speed limit of " + postedSpeed + ".\n\nThis violation occurred in a school zone.\n\nYour fine is $" + ticketAmount + ".00 and can be paid at the address below.\n\nPlease remember to buckle up and drive safely.\n";
         return s; 
      }
      String s = month + "/" + day + "/" + year + "\n\n" + name + " (TDL: " + TDL + ")\n" + address + "\n" + city + ", " + state + " " + zip + "\n\nDear citizen " + lastName() + ",\n\nYou have received this citation for driving " + travelling + "mph in an area with a\nposted speed limit of " + postedSpeed + ".\n\nThis violation did not occur in a school zone.\n\nYour fine is $" + ticketAmount + ".00 and can be paid at the address below.\n\nPlease remember to buckle up and drive safely.\n";
      return  s;
   }
}

