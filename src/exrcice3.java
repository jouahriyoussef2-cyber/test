import java.util.Scanner;

public class exrcice3 {
    public void compte() {
        for (int i = 0; i <= 10; i++) {
            System.out.print(i + ", ");
        }
        System.out.println(" ");
    }
    public void paireN(){
        for (int i = 0; i <= 20; i++) {
            if(i%2==0) {
                System.out.print(i + ", ");
            }
        }
    }
    public void motpasse(){
        String motpass="VILLA";
        int crt=0;
        Scanner scn = new Scanner(System.in);
        do{
            System.out.println("entrer mot passe : ");
            String mtp= scn.nextLine();
            if(mtp.equals(motpass)){
                crt=1;
            }
        }while (crt==0);
    }
    public void dessin(){
        for(int i=1;i <=5;i++){
            for (int j=1;j<=i;j++){
                System.out.print("*");
            }
            System.out.println("");
        }
    }


}