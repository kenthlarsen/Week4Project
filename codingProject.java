package week4Labs;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class codingProject {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//1 I have an array of ages, and since an array is zero based, i was able to subtract
//	the first age in the array from the last age.	
	//a.
		int result;
		int[] ages = {3,9,23,64,2,8,28,93};
		result = (ages[6+1]) - (ages[0]);
		
		System.out.println(result);
		System.out.println("--------------");
// Then I created a new array with more elements inside, and subtracted the first age from the last age again.
		
	//b.
		int result2;
		int[] ages2 = {3,9,23,64,2,8,28,93,44};
		result2 = (ages2[8]) - (ages2[0]);
		
		System.out.println(result2);
		System.out.println("--------------");
// Then I created a loop to step through the array and calculate the average age in the array of ages.
		
	//c.
		int i;
		int sum = 0;
		for ( i = 0; i <= ages2.length-1; i ++) {
			sum += ages2[i];	
		}		
		System.out.println(sum/ages2.length + " " + "is the average age.");
		System.out.println("--------------");
//2		
	//a.	
		 String[] names = new String[6];
         
         names[0] = "Sam";
         names[1] = "Tommy";
         names[2] = "Tim";
         names[3] = "Sally";
         names[4] = "Buck";
         names[5] = "Bob";
        
         String sum1 = ""; 
         
         for(int j = 0; j < names.length; j++) {
           sum1 += names[j];
         }
         	System.out.println(sum1.length() / names.length + " " + "is the average size of name.");
         	System.out.println("--------------");
         	
     //b. Step through the array and print out the names with a space between them.
         	
         for (int r = 0; r < names.length; r ++) {
        	System.out.print(names[r] + " ");
         }
            System.out.println("--------------");


//3. How do you access the last element of any array?
//   If my array is the array above:
//   	String[] names
        System.out.println(names[names.length - 1] + " " + "is the last element in the array.");
        System.out.println("--------------"); 
//4. How do you access the first element of any array?
//   If my array is the array above:
//   String[] names
        System.out.println(names[0] + " " + "is the first element in the array.");
        
//5. I created a new array of int called nameLengths. 
//   Then I wrote a loop to step through the previously created names array 
//   to add the length of each name to the nameLengths array.        
        int[] nameLengths = new int[names.length];   
        for(int k=0; k<names.length; k++) {
            nameLengths[k] = names[k].length(); 
               
         }
        System.out.println("--------------");
        
//6. I wrote a loop to calculate the total number of elements in the array.
        int total = 0;
        for (int sumName : nameLengths) {
        	total += sumName;
        }
        System.out.println(total);
        repeatWord("Hello",3);
        System.out.println("--------------");
     }  
	
//7. I created a method to print out a string of words a certain number of times.
//	 I struggled with this one!	
        static void repeatWord(String userWord, int n) {
        	n = 4;
        	userWord = "GoodBye";
    	    
    	    String repeatWord = "";
    	    for (int i = 0; i < n; i ++){
    	     repeatWord += userWord;  
    	    }
    	    System.out.println(repeatWord);
    	    System.out.println("--------------");
    	    
//8. I wrote a method to get a full names using a first and last name.
    	String firstName = "Jimmy";
    	String lastName = "Jackson";
    	String fullName = firstName + " " + lastName;
    	
    	System.out.println(fullName);
    	System.out.println("--------------");
    	
//9. I made an array that added up the values of the array  
//    and printed out "true" if the total was greater than 100.	
    	int sum4;
    	int num1 = 1;
    	int num2 = 2;
    	int num3 = 0;
    	int num4 = 50;
    	
    	int[] arrayInt = {num1, num2, num3, num4,};
       	  sum4 = num1+num2+num3+num4;
       	  if (sum4 > 100){
       		  System.out.println("true");
       		System.out.println("--------------");
       	  }else {
       		System.out.println("false");
       		System.out.println("--------------");
       	  }      	  
       	  
//10. I made an array of double and printed out the average.
       	double sum5 = 0;
       	double num11 = 1.11;
       	double num12 = 2.22;
       	double num13 = 3.33;
       	
       	double[] aveNum = {num11,num12,num13};
       	for (int i=0; i < aveNum.length; i++)
            sum5 = sum5 + aveNum[i];
       	double ave = sum5 / aveNum.length;
    	    System.out.println(ave);
    	    System.out.println("--------------");
          
//11. I made two arrays averaged each array. If the first array average was greater than
//    the second array, it printed true.	    
    	double sum6 = 0;
    	double sum7 = 0;
    	double [] twoArrays1 = {1.11,3.33,1.11};
    	double [] twoArrays2 = {1.11,4.44,4.44};
    	for (int i = 0; i < twoArrays1.length; i ++) 
    		sum6 = sum6 + twoArrays1[i];
    	double ave1 = sum6 / twoArrays1.length;
    	System.out.println("Average in the first array is"+" " + ave1);
    		
    	for (int i = 0; i < twoArrays2.length; i ++) 
    		sum7 = sum7 + twoArrays2[i];
    	double ave2 = sum7 / twoArrays2.length;
    	System.out.println("Average in the second array is"+" " + ave2); 
    	if (ave1 > ave2) {
    		System.out.println("true");
    	}else {
    		System.out.println("false");
    		
    	}
    	System.out.println("--------------");

//12. I made a method to see if I wanted a drink. if I had enough money and it was hot out side,
//    I will buy a drink.	
    	boolean isHotOutside = !true;
    	double moneyInPocket = 12.00;	
    
    	if (moneyInPocket > 10.50 && isHotOutside ) {
    		System.out.print("true Yes, I will buy a drink");
    		
    	}else {
    		System.out.print("false No, I will not buy a drink");
   	 	}
        
//13. My Job
    	
    	int roomTemp = 75;
    	int outsideAirTemp = 90;
    	int fanSpeed = 20;
    	boolean outsideAirDampner = true;
    	if  (roomTemp > 72 && outsideAirTemp < 80 && fanSpeed > 0 && outsideAirDampner) {
    		System.out.println("Free Cooling!");
    	}if (roomTemp > 72 && outsideAirTemp < 80 && fanSpeed > 0 && !outsideAirDampner){
    		System.out.println("Outside Air Dampner Alarm!");
    	}if (roomTemp > 72 && outsideAirTemp < 80 && fanSpeed == 0 && outsideAirDampner) {
    		System.out.println("Fan Speed Alarm!");
    	}if (outsideAirTemp > 80) {
    		System.out.println("It's too hot outside. Turn on the A/C!");
    	}if (roomTemp <= 72 ) 
    		System.out.println("No cooling required");
/* I created this method because it is a real life application of the knowledge that we are gaining!
 * This is a very simple control loop for using outside air verses A/C. This only shows what should 
 * happen when the inside room needs to be cooled.  
 * 
 */
        
            	
                
         
        }	
}
  



		
		
		

