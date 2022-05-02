public class PrimeNumber {
    private int findPrime(int num, int i){
        if(i==1){
            return 1;
        }else if(num%i==0){
            return 0;
        }else{
            return findPrime(num,i-1);
        }


    }

    public boolean isPrime(int num, int i){
        return findPrime(num, i) == 1;
    }
}
