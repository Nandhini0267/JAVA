public class Fibbonacci{
    public static void main(String[]args){
        int n1=0;
        int n2=1;
        for(int i=0;i<=5;i++){
            int num=n1+n2;
            System.out.println("Fibbonaci serirs:"+num);
            n1=n2;
            n2=num;
        }
    }
}