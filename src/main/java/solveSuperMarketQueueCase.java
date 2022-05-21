public class solveSuperMarketQueueCase {

    public static int solveSuperMarketQueue(int[] customers, int n) {
        int customerTime = 0;
        for(int i = 0; i < customers.length; i++) {
            customerTime = customers[i] + customerTime ;
            if (i == n){
                break;
            }
        }
        System.out.println(customerTime);
        return 0;
    }

    public static void main(String[] args) {
        System.out.println(solveSuperMarketQueue(new int[]{ 2, 2, 3, 3, 4, 4 }, 2));
    }
}

