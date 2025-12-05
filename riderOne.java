public class riderOne{

public static int riderWage(int delivery){

int basepay = 5000;
int amount;


if ( delivery < 50){
    amount = 160;
}

else if (delivery < 59){
    amount = 200;
}

else if (delivery < 69){
    amount = 250;
}
else {
    amount = 500;
    }

return (delivery * amount)+ basepay;


    
}
public static void main(String...args){
System.out.println(riderWage(80));
System.out.println(riderWage(25));
}



































//public class riderTwo{
//
//public static int riderWage(int delivery){
//
//int secondRider = 0;
//
//if(secondRider = (100 * 200)+5000 );
//    return secondRider;
//
//    }
//}
//
//public class riderThree{
//public static int riderWage(int delivery){
//
//int thirdRider = 0;
//
//if(thirdRider = (100 * 250)+5000 );
//    return thirdRider;
//
//
//public class riderFour{
//public static int riderWage(int delivery){
//
//int secondoRider = 0;
//
//if(firstRider = (50 * 160)+5000 )
//    return firstRider;
//
//
//
//

















        }
