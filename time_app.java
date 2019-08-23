public class Time {

public static void main(String[] args) {

int hour = 1500;
int minute = 30;
int seconds = 30;
    
    //Display number of seconds since mindnight 
    System.out.print("There has been ");
    System.out.print((24 - hour) * 60 * 60);
    System.out.print(" seconds since midnight");
    System.out.println(".");
             
    //Display number of seconds remaining in the day
    System.out.print("There is ");
    System.out.print((24 - hour) * 60 * 60);
    System.out.print( " secondds left in the day");
    System.out.println(".");       
    
    //Calculate the percentage of time left in the day
    System.out.println(12.0/24.0);
    
    //Compute time elapsed since starting
    System.out.print("I have been working for ");
    System.out.print(hour - 1430);
    System.out.println(" minutes.")                   
  }
}