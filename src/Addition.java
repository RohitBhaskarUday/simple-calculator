public class Addition {

    // function for addition.
    public static long getAddition(int ...var){
        long sum=0;
        for(int i: var){
            sum=sum+i;
        }

        return sum;
    }

}
