package caraholics;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.util.Scanner;
import java.io.FileWriter; 
class Data 
{
    Scanner input = new Scanner(System.in); 
    void whole( ){
        String line = "";  
        String splitBy = ",";  
        try   
        {  
            //parsing a CSV file into BufferedReader class constructor  
            BufferedReader br = new BufferedReader(new FileReader("cars_data.csv"));  
            while ((line = br.readLine()) != null)   //returns a Boolean value  
            {  
                String[] Data = line.split(splitBy);    // use comma as separator  
                String d = Data[0];
                if (d.contains("Name")) 
                {
                    System.out.println(String.format ("|          %-50s|  %-20s|    %-20s|    %-20s|    %-20s|    %-20s|    %-20s|", Data[0],Data[1],Data[2],Data[3],Data[4],Data[5],Data[6] ));
                } 
                System.out.println(String.format ("|         %-50s|  %-20s|    %-20s|    %-20s|    %-20s|    %-20s|    %-20s|", Data[0],Data[1],Data[2],Data[3],Data[4],Data[5],Data[6] ));
            }  
        }   
        catch (IOException e)   
        {  
            e.printStackTrace();  
        }  
    }
    public void search_name(String c)
    {
        String line = "";  
        String splitBy = ","; 
       
        try   
            
        {  
            //parsing a CSV file into BufferedReader class constructor  
            BufferedReader br = new BufferedReader(new FileReader("cars_data.csv"));  
            while ((line = br.readLine()) != null)   //returns a Boolean value  
            {  
                String[] Data = line.split(splitBy);    // use comma as separator 
                String d = Data[0];
                if (d.contains("Name")) 
                {
                    System.out.println(String.format ("|          %-50s|  %-20s|    %-20s|    %-20s|    %-20s|    %-20s|    %-20s|", Data[0],Data[1],Data[2],Data[3],Data[4],Data[5],Data[6] ));
                } 
                else if (d.contains(c)) 
                {
                    System.out.println(String.format ("|         %-50s|  %-20s|    %-20s|    %-20s|    %-20s|    %-20s|    %-20s|", Data[0],Data[1],Data[2],Data[3],Data[4],Data[5],Data[6] ));
                }  
            }
        }   
        catch (IOException e)   
        {  
            e.printStackTrace();  
        } 
    }   
    
    public static String removeSuffix(final String s, final String suffix)
	{
		if (s != null && suffix != null && s.endsWith(suffix)){
			return s.substring(0, s.length() - suffix.length());
		}
		return s;
	}
    
    public void search(String category)
    {
        String line = "";  
        String splitBy = ",";  
        try   
        {  
            //parsing a CSV file into BufferedReader class constructor  
            BufferedReader br = new BufferedReader(new FileReader("cars_data.csv"));  
            while ((line = br.readLine()) != null)   //returns a Boolean value  
            {  
                String[] Data = line.split(splitBy);    // use comma as separator  
                if (category.equalsIgnoreCase(Data[0]) || category.equalsIgnoreCase(Data[1]) || category.equalsIgnoreCase(Data[2]) || category.equalsIgnoreCase(Data[3]) || category.equalsIgnoreCase(Data[4]) || category.equalsIgnoreCase(Data[5]) || category.equalsIgnoreCase(Data[6]))
                {
                    System.out.println(String.format ("|         %-50s|  %-20s|    %-20s|    %-20s|    %-20s|    %-20s|    %-20s|", Data[0],Data[1],Data[2],Data[3],Data[4],Data[5],Data[6] ));
                }
                
            }  
        }   
        
        catch (IOException e)   
        {  
            e.printStackTrace();  
        }
    }
    void search_price(double s_price, double e_price)
    {
        String line = "";  
        String splitBy = ",";  
        try   
        {  
            //parsing a CSV file into BufferedReader class constructor  
            BufferedReader br = new BufferedReader(new FileReader("cars_data.csv"));  
            while ((line = br.readLine()) != null)   //returns a Boolean value  
            {  
                String[] Data = line.split(splitBy);    // use comma as separator  
                String d = Data[3];
                
                if (d.contains(" lacs"))
                {
                    String c = removeSuffix(d," lacs");
                    double p = Double.parseDouble(c);
                    double pp = p*100000;
                    if (pp>=s_price & pp<=e_price)
                    {
                        System.out.println(String.format ("|         %-50s|  %-20s|    %-20s|    %-20s|    %-20s|    %-20s|    %-20s|", Data[0],Data[1],Data[2],Data[3],Data[4],Data[5],Data[6] ));
                    }
                }
                else if (d.contains(" crore"))
                {
                    String c = removeSuffix(d," crore");
                    double p = Double.parseDouble(c);
                    double pp = p*10000000;
                    if (pp>=s_price & pp<=e_price)
                    {
                        System.out.println(String.format ("|         %-50s|  %-20s|    %-20s|    %-20s|    %-20s|    %-20s|    %-20s|", Data[0],Data[1],Data[2],Data[3],Data[4],Data[5],Data[6] ));

                    }

                }
                else if (Data[0].contains("Name")) 
                {
                    System.out.println(String.format ("|          %-50s|  %-20s|    %-20s|    %-20s|    %-20s|    %-20s|    %-20s|", Data[0],Data[1],Data[2],Data[3],Data[4],Data[5],Data[6] ));
                } 
            }
        }
        catch (IOException e)   
        {  
            e.printStackTrace();  
        }  
    }
    public void search_last()
    {
        String line = "";  
        String splitBy = ","; 
       String[] Data={};
        try   
            
        {  
            //parsing a CSV file into BufferedReader class constructor  
            BufferedReader br = new BufferedReader(new FileReader("cars_data.csv"));  
            while ((line = br.readLine()) != null)   //returns a Boolean value  
            {  
                Data = line.split(splitBy);    // use comma as separator   
            }
            System.out.println(String.format ("|         %-50s|  %-20s|    %-20s|    %-20s|    %-20s|    %-20s|    %-20s|", Data[0],Data[1],Data[2],Data[3],Data[4],Data[5],Data[6] ));
                 
        }   
        catch (IOException e)   
        {  
            e.printStackTrace();  
        } 
    }
    
    void menu1 ( )
    {
        System.out.println("Do u want to search by?"
                + "\n enter 1 for Name"
                + "\n enter 2 for model"
                + "\n enter 3 for color"
                + "\n enter 4 for price"
                + "\n enter 5 for engine capacity"
                + "\n enter 6 for body type"
                + "\n enter 7 for quit.");
        System.out.println("\n-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*\n");
        
        System.out.print(" Enter a respective number:    ");
        int a = input.nextInt();                            //Here we asked the user to enter the no. according to desired search
    
                       
        while ((a!=1) & (a!=2) & (a!=3) & (a!=4) & (a!=5) & (a!=6) & (a!=7))
        {
            System.out.print(" Please enter number as instructed: \n Enter a respective number:    ");
            a = input.nextInt();
        }
        
        if (a==1)
        {
            System.out.println("Available car names \n");
            String [ ] b={"Suzuki swift","Toyota corolla","Toyota fortuner","Toyota prado","Bmw","Mercedes","Honda city","Honda civic","Audi","Faw","Range Rover","Suzuki mehran"};
            for (int i=0;i<b.length;i++)
            {
                
                System.out.println(String.format("|         %-10s|       %-10s|",(i+1),b[i]));
            }
            System.out.println("\n-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*\n");
            System.out.print("Which car :  ");
             a = input.nextInt();
             System.out.print("\n");
             a = a-1;
            String c = b[a];
            search_name(c);
            System.out.print("Did you like any car?(y/n):  ");
            String e = new Scanner(System.in).nextLine();
            if (e.equalsIgnoreCase("y"))
            {
                System.out.print("\n\t\t\t\t If You want to buy a car then visit "
                        + "\n\t\t\t\t showroom for further details and agreement. \n\n\n\n ");
            }
        }
        
        else if (a==2)
        {
            System.out.println("Available car models \n");
            int [ ] b={2002, 2003, 2004, 2005, 2006, 2007, 2009, 2010, 2011, 2012, 2013, 2015, 2016, 2017, 2018, 2019};
            for (int i=0;i<b.length;i++)
            {
                
                System.out.println(String.format("|         %-10s|       %-10s|",(i+1),b[i]));
            }
            System.out.println("\n-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*\n");
            System.out.print("Which model:  ");
             a = input.nextInt();
             System.out.print("\n");
             a = a-1;
            int c = b[a];
            String d = ""+c+"";
            search(d);
            System.out.print("Did you like any car?(y/n):  ");
            String e = new Scanner(System.in).nextLine();
            if (e.equalsIgnoreCase("y"))
            {
                System.out.print("\n\t\t\t\t If You want to buy a car then visit "
                        + "\n\t\t\t\t showroom for further details and agreement. \n\n\n\n ");
            }
        }
        else if (a==3)
        {
            System.out.println("Colors of Available cars \n");
            String [ ] b={"White","Black","Red","Silver","Blue","Grey"};
            for (int i=0;i<b.length;i++)
            {
                
                System.out.println(String.format("|         %-10s|       %-10s|",(i+1),b[i]));
            }
            System.out.println("\n-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*\n");
            System.out.print("which Color:  ");
             a = input.nextInt();
             System.out.print("\n");
             a = a-1;
            String c = b[a];
            search(c);
            System.out.print("Did you like any car?(y/n):  ");
            String e = new Scanner(System.in).nextLine();
            if (e.equalsIgnoreCase("y"))
            {
                System.out.print("\n\t\t\t\t If You want to buy a car then visit "
                        + "\n\t\t\t\t showroom for further details and agreement. \n\n\n\n ");
            }
        }
        else if (a==4)
        {
            double e_price =0;
            double s_price =0;
            System.out.println("Please remember space is mandatory in price range "
                    + "\n Enter price in 'lacs' or 'crores' "
                    + "\n e.g (23)(space)(lacs) or (4.6)(space)(crore) \n");
            System.out.print("Starting: ");
            String s = new Scanner(System.in).nextLine();          
            if (s.contains(" lacs"))
            {
               String c = removeSuffix(s," lacs");
               double p = Double.parseDouble(c);
               s_price = p*100000;
                
            }
            else if (s.contains(" crore"))
            {
                String c = removeSuffix(s," crore");
                double p = Double.parseDouble(c);
                s_price = p*10000000;
                
            }
            System.out.print("Ending: ");
            String end = new Scanner(System.in).nextLine();
            if (end.contains(" lacs"))
            {
                String cc = removeSuffix(end," lacs");;
                double pp = Double.parseDouble(cc);
                e_price = pp*100000;
                
            }
            else if (s.contains(" crore"))
            {
                String cc = removeSuffix(end," crore");;
                double pp = Double.parseDouble(cc);
                e_price = pp*10000000;
                
            }
            
            search_price(s_price, e_price);
            System.out.print("Did you like any car?(y/n):  ");
            String e = new Scanner(System.in).nextLine();
            if (e.equalsIgnoreCase("y"))
            {
                System.out.print("\n\t\t\t\t If You want to buy a car then visit "
                        + "\n\t\t\t\t showroom for further details and agreement. \n\n\n\n ");
            }
            
        }
        
        else if (a==5)
        {
            System.out.println("Engine Capacity of  available cars\\n");
            String [ ] b={"1200","1300","1500","1600","1800","2000","2700","2800","3000","3500","4000","4400","5500","1998","1000","800","4500"};
            for (int i=0;i<b.length;i++)
            {
                
                System.out.println(String.format("|         %-10s|       %-10s|",(i+1),b[i]));
            }
            System.out.println("\n-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*\n");
            System.out.print("which Engine Capacity:  ");
             a = input.nextInt();
             a = a-1;
            String c = b[a];
            search(c);
            System.out.print("Did you like any car?(y/n):  ");
            String e = new Scanner(System.in).nextLine();
            if (e.equalsIgnoreCase("y"))
            {
                System.out.print("\n\t\t\t\t If You want to buy a car then visit "
                        + "\n\t\t\t\t showroom for further details and agreement. \n\n\n\n ");
            }
        }
        else if (a==6)
        {
            System.out.println("Body Types of  available cars \n");
            String [ ] b={"Sedan","Hatchback","SUV","Coupe","MPV","Crossover"};
            for (int i=0;i<b.length;i++)
            {
                
                System.out.println(String.format("|         %-10s|       %-10s|",(i+1),b[i]));
            }
            System.out.println("\n-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*\n");
            System.out.print("which Body Type:  ");
             a = input.nextInt();
             System.out.print("\n");
             a = a-1;
            String c = b[a];
            search(c);
            System.out.print("Did you like any car?(y/n):  ");
            String e = new Scanner(System.in).nextLine();
            if (e.equalsIgnoreCase("y"))
            {
                System.out.print("\n\t\t\t\t If You want to buy a car then visit "
                        + "\n\t\t\t\t showroom for further details and agreement. \n\n\n\n ");
            }
            
        }
        else if (a==7)
        {
            System.out.println("Thank You!");
        }
    
    
    }
    void menu_2() throws IOException 
    {
        Scanner input = new Scanner(System.in);
        System.out.println("Give us the details of a Car. \n");
        
        File file = new File("cars_data.csv");
        FileWriter fr = new FileWriter(file, true);
        
        System.out.print("Name of a car:    ");
        String a = new Scanner(System.in).nextLine();
        a = a.substring(0, 1).toUpperCase() + a.substring(1);
        fr.append(a);
        fr.append(',');
        System.out.print("Model of a car:    ");
        String b = new Scanner(System.in).nextLine();
        b = b.substring(0, 1).toUpperCase() + b.substring(1);
        fr.append(b);
        fr.append(',');
        System.out.print("Color of a car:    ");
        String c = new Scanner(System.in).nextLine();
        c = c.substring(0, 1).toUpperCase() + c.substring(1);
        fr.append(c);
        fr.append(',');
        System.out.print("Price of a car:    ");
        String d = new Scanner(System.in).nextLine();
        d = d.substring(0, 1).toUpperCase() + d.substring(1);
        fr.append(d);
        fr.append(',');
        System.out.print("Showroom:    ");
        String e = new Scanner(System.in).nextLine();
        e = e.substring(0, 1).toUpperCase() + e.substring(1);
        fr.append(e);
        fr.append(',');
        System.out.print("Engine capacity of a car (cc) : ");
        String f = new Scanner(System.in).nextLine();
        f = f.substring(0, 1).toUpperCase() + f.substring(1);
        fr.append(f);
        fr.append(',');
        System.out.print("Body type of a car : ");
        String g = new Scanner(System.in).nextLine();
        g = g.substring(0, 1).toUpperCase() + g.substring(1);
        fr.append(g);
        fr.append('\n');
        fr.close(); 
        
        System.out.println("\nYour car details are published."
                + "\n-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*\n"
                + "Please choose as sugggested.\nY for Yes\nN for No\n");
        System.out.print("\nWould You like to see ur car details? (y/n)");
        String h = input.next();
        if (h.equalsIgnoreCase("Y"))
        {
            search_last();
            System.out.println("\n\n\n\t\t\t We will inform You about ur Ad ."
                    + "\n\t\t\t  Thank You for selling ur car here! \n\n\n\n");
        }
        else if (h.equalsIgnoreCase("N"))
        {
            System.out.print("\n\t\t\t We will inform You about ur Ad ."
                    + "\n\t\t\t  Thank You for selling ur car here! \n\n\n\n");
        }
    }
    
   
    
    void Start() throws IOException
    {
        System.out.println("\t\t\t Type '1' : buy a car"
                + "\n\t\t\t Type '2' : sell a car"
                + "\n\t\t\t Type '3' : quit"
                + "\n-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*\n");
        System.out.print("What do You want to ?       ");
        int a = input.nextInt();
        if (a==1)
        {
            System.out.println("\n\t\t\tSo You want to buy a car.\n"
                    + "\nPlease choose as sugggested.\nY for Yes\nN for No\n");
            System.out.print("\n Would you like to search?(y/n):    ");
            String b = input.next();
            b=b.toUpperCase();
            if (b.equalsIgnoreCase("Y"))
            {
                menu1();
            }
            else if (b.equalsIgnoreCase("N"))
            {
                System.out.println("\nPlease choose as sugggested.\nY for Yes\nN for No\n");
                System.out.print("\n Do you want the whole list?(y/n):  ");
                String c = input.next();
                c=c.toUpperCase();
                if (c.equalsIgnoreCase("Y"))
                {
                    whole( );
                }
                else if (c.equalsIgnoreCase("N"))
                {
                    System.out.println("\nPlease choose as sugggested.\nY for Yes\nN for No\n");
                    System.out.print("\n Do  you want to search again? (y/n):   ");
                    String e = input.next();
                    e = e.toUpperCase();
                    if (e.equalsIgnoreCase("Y"))
                    {
                        menu1();
                    }
                }
            }
        }
        else if (a==2)
        {
            System.out.println("\n");
            menu_2();
            System.out.println("Please choose as sugggested.\nY for Yes\nN for No\n");
            System.out.print("\n Do  you want to sell another car? (y/n):   ");
            String e = input.next();
            e = e.toUpperCase();
            if (e.equalsIgnoreCase("Y"))
            {
                menu_2();
            }
        
        }
        else if (a==3)
        {
            System.out.println("\n\t\t\t Thank You!");  
            
        }
    }
    public static void main(String[] args) throws IOException 
    {
    
        System.out.println("\t\t\t\t Welcome to Car Aholics! \n");
        Data obj = new Data();
        while (true)
        {
            obj.Start();
            System.out.println("\n-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*\n"
                    + "Please choose as sugggested.\nY for Yes\nN for No\n");
            System.out.print("Do you want to exit? (y/n)    ");
            String a = new Scanner(System.in).next();
            if (a.equalsIgnoreCase("Y"))
            {
                System.out.println("\n\t\t\t\t Thank You for visiting Car Aholics\n");
                break;
            }
            else
            {
                obj.Start();
            }
        }
    
        
    }
   
}
