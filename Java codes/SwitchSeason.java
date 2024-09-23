import java.util.Scanner;
class SwitchSeason
{
 public static void main(String[] args)
  {
   boolean exit = true;
   Scanner sc= new Scanner(System.in);
   while (exit==true)
	{
    System.out.println("Enter month number");
    int month = sc.nextInt();
	 switch(month)
	  {
	    case 11:
	    case 12:
	    case 1:
	    case 2:
		System.out.println("Season is Winter");
		break;
	    case 3:
	    case 4:
	    case 5:
	    case 6: 
		System.out.println("Season is Summer");
		break;
	    case 7:
	    case 8:
	    case 9:
	    case 10: 
		System.out.println("Season is Rainy Season");
		break;
	    default: System.out.println("Enter valid month number");
		     exit =false;	
	  }   
        }
  sc.close();
  }
}