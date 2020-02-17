package construction.week4_c;
import java.util .*;

//House construction


public class App 
{
    public static void main( String[] args )
    {
    	Scanner sc=new Scanner (System. in);
    	double required_Amount = 0;
    	System.out.format("%s","Enter the required material standards (normal/above/high):");
        String material_Standards=sc.nextLine();
        System.out.format("%s","Enter the total area:");
        double total_Area=sc.nextDouble();
        boolean automatedhome = false;
        if(material_Standards.equals("normal"))
        {
        	required_Amount=total_Area*1200;
        }
        else if(material_Standards.equals("above"))
        {
        	required_Amount=total_Area*1500;
        }
        else if(material_Standards.equals("high"))
        {
        	System.out.format("%s","Enter True if you want fully automated home:");
	        automatedhome=sc.nextBoolean();
        	if(automatedhome)
        	{
        		required_Amount=total_Area*2500;
        	}
        	else {
        	required_Amount=total_Area*1800;
        	}
        }
        System.out.format("%.2f",required_Amount);
    }
}
