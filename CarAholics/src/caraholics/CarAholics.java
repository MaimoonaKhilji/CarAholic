package caraholics;

import java.io.IOException;
import java.util.Scanner;
class CarAholics
{
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
