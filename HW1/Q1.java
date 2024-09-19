public class Q1 {
    public static void main(String[] args) {
        final int a = Integer.parseInt(args[0]);
        for(int i =0;i<a*a;i+=a){
            for(int j=a;j>0;j--){
                System.out.print((i+j)+" ");
            }
            System.out.println("");
        }
    }
}
