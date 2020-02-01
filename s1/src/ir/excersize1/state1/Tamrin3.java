package ir.excersize1.state1;

public class Tamrin3 {
    public static void main(String[] args) {
        for(int i=0;i<=100;i++){
            if(i%5==0 & i%2==0){
                System.out.println(i + "mazrab 10");
            }
             else if (i%2==0 &i%3==0){
                System.out.println( i +" mazrab 6");
            }
            else{
                System.out.println("not mazrab 6 & 10");
            }
        }
    }
}
