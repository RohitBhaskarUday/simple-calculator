public class Multiplication {


    public static long getMultiplication(int ...var){
        long mul=1;

        for(int i: var){
            mul=mul*i;
        }

        return mul;
    }
}
