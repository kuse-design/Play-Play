import java.util.Arrays;
public class TaskOne{
public static void main(String...args){

int [] arrayofNumber ={48,36,10,19,12,17};

int largest = 0;
int smallest = arrayofNumber[0];

for(int index = 0; index < arrayofNumber.length; index++){
    if(arrayofNumber[index] < smallest){
    smallest = arrayofNumber[index];
    }
    if(arrayofNumber[index] > largest){
    largest = arrayofNumber[index];
    }
    }
System.out.println("largest " + largest + " smallest " + smallest);

    }   
}
