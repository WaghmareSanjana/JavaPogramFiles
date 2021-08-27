//Write a program to calculate the sum of first 10 natural number


class B2 {
    public static void main(String args[]) {

        int i,sum=0;

        for(i = 1;i < 11; i++){
            sum+=i;
        }

        System.out.println("Sum of first 10 natural numbers:"+sum);

    }
}