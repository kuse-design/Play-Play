import java.util.Arrays;
public class TaskOne{
public static void main(String...args){

int[]arrayofNumber ={2,3,5,3,8,7,-3};

    for(int count = 0; count < arrayofNumber.length; count++){

    if(arrayofNumber[count] % 2 == 0){
    arrayofNumber[count] *= arrayofNumber[count];

        }

    else if(arrayofNumber[count] % 2 != 0){
        arrayofNumber[count] += 1;
            }

        }
         System.out.print(Arrays.toString(arrayofNumber));

         
     }
}




