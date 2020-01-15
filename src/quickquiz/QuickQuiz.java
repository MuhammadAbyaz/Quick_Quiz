
package quickquiz;

import java.util.Scanner;

public class QuickQuiz {

   
    public static void main(String[] args) {
        
        
      Scanner scan = new Scanner(System.in);
        System.out.println("Enter day number from 1-7");
      int days =scan.nextInt();
        
        switch(days){
            case 1:
                System.out.println("Today is Sunday");
                break;
        
        case 2:
                System.out.println("Today is Monday");
                break;
       
        case 3:
                System.out.println("Today is Tuesday");
                break;
    
        case 4:
                System.out.println("Today is Wednesday");
                break;

        case 5:
                System.out.println("Today is Thursday");
                break;    

        case 6:
                System.out.println("Today is Friday");
                break;    
        case 7 :
                System.out.println("Today is Sataurday");
                break;
        default :
                System.out.println("This number dosnot exist ");
        }
        
    }
    
    }
