public class ExtraLongFactorials {

    // Complete the extraLongFactorials function below.
    static void extraLongFactorials(int n) {
        String result = "";
        long x = 1;
        BigInteger fact = new BigInteger("1");
        for(int i=2; i<=n; i++){
            fact = fact.multiply(BigInteger.valueOf(i));
        }
        System.out.println(fact.toString());
    }
}