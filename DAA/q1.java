
 //liner search 

 
import java.util.Scanner;
public class q1 {
    public static void main(String arg[]){
        Scanner input =new Scanner(System.in);


       
        int arr[]=new int[5];

        for(int i=0;i<5;i++){
            System.out.println("Enter the element");
            arr[i]=input.nextInt();
            
        }
        //elements in array are.....
        for(int i=0;i<5;i++){
            System.out.println(arr[i]);
        }



        System.out.println("Enter the element to be searched");
        int key=input.nextInt();

        // Linear search
        boolean found = false;
        for(int i=0;i<5;i++){
            if(arr[i] == key){
                System.out.println("Element found at index: " + i);
                found = true;
                break;
            }
        }
        if(!found){
            System.out.println("Element not found");
        }
        input.close();

    }
    
}
