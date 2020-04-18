import com.sun.xml.internal.ws.util.StringUtils;

import java.util.Scanner;

public class main {
    public static void main(String [] args){
        Logic a = new Logic();
        Scanner sc = new Scanner(System.in);
        String [] tomb = new String[3];
        System.out.println("müveleti jel, szam1, szam2");
        for(int i=0;i<tomb.length;i++){

            tomb[i] = sc.nextLine();
        }
        for(int i=0;i<tomb.length;i++){
            System.out.println("tomb"+i+" : " + tomb[i]);
        }
    double eredmeny=0;

        switch(tomb[0]){
            case "+":
                eredmeny = a.osszeadas(Double.parseDouble(tomb[1]),Double.parseDouble(tomb[2]));
                break;
            case "-":
                eredmeny = a.kivonas(Double.parseDouble(tomb[1]),Double.parseDouble(tomb[2]));
                break;
            case"*":
                eredmeny = a.szorzas(Double.parseDouble(tomb[1]),Double.parseDouble(tomb[2]));
                break;
            case"/":
                eredmeny = a.osztas(Double.parseDouble(tomb[1]),Double.parseDouble(tomb[2]));
                break;
           default:
                System.out.println("valamit elbasztál");
        }
        System.out.println("eredmeny: "+eredmeny);
    }//end main
}//end class
