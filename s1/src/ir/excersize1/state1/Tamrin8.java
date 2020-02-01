package ir.excersize1.state1;

public class Tamrin8 {
    public static void main(String[] args) {
        int str[][]=new int[3][4];
        int i,j,k=1;
        for(i=0;i<3;i++)
        {
            for(j=0;j<4;j++)
            {
                str[i][j]=k*i*j;
                k++;
            }
        }
        for(i=0;i<3;i++){
            for(j=0;j<4;j++){
                System.out.println(str[i][j] +",");
            }
        }

    }
}
