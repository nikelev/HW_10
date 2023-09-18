public class ForLoop {
    public static void main(String[] args) {
        gagarin();

        System.out.println("---------------------------");
        double res=pow(2,3);
        System.out.println("Pow="+ res);

        double res1=pow(5,0);
        System.out.println("Pow="+ res1);

        System.out.println("_____________________________");

    }

    public static void gagarin() {
        for (int counter = 10; counter > 0; counter--) {
            System.out.println(counter);
        }
        System.out.println("GO!");
    }

    public static double pow(double a, int n){
        double res=1;
        for (int i=1; i<=n;i++){
            res *=a;
        }
        return res;
    }

    public static int sumDigits(int num){
        int res;
        for ( res=0; num!=0;num/=10){
            int digit=num%10;
            res +=digit;
        }
        return  res;
    }
}
