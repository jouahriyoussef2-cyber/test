import java.util.Scanner;
public class Main {
    public static void main(String[] args){
        exrcice3 ex3 = new exrcice3();
        float age;
        System.out.println("entrer votre age : ");
        Scanner scn = new Scanner(System.in);
        age = scn.nextFloat();
        if(age<18){
            System.out.println("votre age "+age+" donc vous etes mineur ");
        }else if(age<65){
            System.out.println("votre age "+age+" donc vous etes majeur");
        }else{
            System.out.println("votre age "+age+" donc vous etes sinour");
        }
        System.out.println("fin de programme ");

        ex3.compte();
        ex3.paireN();
        ex3.motpasse();
        ex3.dessin();
    }
}