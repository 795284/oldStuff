
/**
 * Write a description of class Numbers here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class Numbers
{
    // instance variables - replace the example below with your own
    public static void main(String[] args){
        int []numbers;
        numbers=new int[5];
        numbers [0] = 1;
        numbers [1] = 2;
        numbers [2] = 3;
        numbers [3] = 4;
        numbers [4] = 5;
        numbers [5] = 6;
        for(int i=0;i<5;i=i++){
            
            System.out.println("Test");
            int[]numberscopy;
            numberscopy=new int [5];
            for(int j=0;j<numberscopy.length;j++)
                numberscopy [i]=numbers[i];
            int sum =0;
            for(int counter=0;counter<numbers.length;counter++){
                sum=sum+numbers[counter];

            }

      
        
        }
    }
}
