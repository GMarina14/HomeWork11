import java.time.LocalDate;
import java.util.Random;

public class Main {

  public static int getRandomNum(int range)
  {
      Random random = new Random();
      return random.nextInt(range);
  }
    public static boolean isLeapYear(int year)
    {
        if(year%100==0)
        {
            if(year%400==0)
            {
                return true;
            }
            else
            {
                return false;
            }
        }
        else if(year%4==0)
        {
            return true;
        }
        else
        {
            return false;
        }
    }

   public static void installApp(int clientOS, int year)
   {
       int currentYear = LocalDate.now().getYear();

       if(year==currentYear)
       {
           if(clientOS==0)
           {
               System.out.println("Install the IOS version of the app using this direct download link");
           }
           else
           {
               System.out.println("Install the Android version of the app using this direct download link");
           }
       }
       else
       {
           if(clientOS==0)
           {
               System.out.println("Install the light IOS version of the app using this direct download link");
           }
           else
           {
               System.out.println("Install the light Android version of the app using this direct download link");
           }
       }
   }

   public static int countDeliveryDays(int distance)
   {
       int daysOfDelivery=0;
       if(distance<=20)
       {
           daysOfDelivery++;
       }
       else if(distance<=60)
       {
           daysOfDelivery++;
       }
       else if(distance<=100)
       {
           daysOfDelivery+=2;
       }
       else
       {
           daysOfDelivery+=3;
       }
       return daysOfDelivery;

   }
    public static void main(String[] args)
    {
     task1();
     task2();
     task3();
    }
    public static void task1()
    {
        System.out.println("Task 1");
        int year =getRandomNum(2500);

        if(isLeapYear(year))
        {
            System.out.println(year + " is a leap year ");
        }
        else
        {
            System.out.println(year+" is not a leap year");
        }
        System.out.println();
    }
    public static void task2()
    {
        System.out.println("Task 2");
        int clientOS=getRandomNum(2);
        int yearOfDevice=getRandomNum(2024);
        installApp(clientOS, yearOfDevice);
        System.out.println();
    }
    public static void task3()
    {
        System.out.println("Task 3");
        int distance= getRandomNum(200);
        int daysOfDelivery=countDeliveryDays(distance);
        if (daysOfDelivery>3)
        {
            System.out.println("Delivery services can't be provided");
        }
        else
        {
            System.out.println("The delivery will take "+daysOfDelivery+ " days");
        }
    }
}
