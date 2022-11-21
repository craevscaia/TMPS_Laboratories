package AdapterDecoratorFacadeProxy.FacadeProxy;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class FacadeMain {
    private static int  choice;
    public static void main(String[] args)
    throws NumberFormatException, IOException {
        do {
            System.out.print("========= Types of cards============ \n");
            System.out.print("            1. Gold card.              \n");
            System.out.print("            2. Platinum card.              \n");

            BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
            choice = Integer.parseInt(br.readLine());
            CardGiverBranch cardGive = new CardGiverBranch();

            switch (choice) {
                case 1:
                {
                    cardGive.goldCardSpecialOffer();
                }
                break;
                case 2:
                {
                    cardGive.platinumCardSpecialOffer();
                }
                break;
                default:
                {
                    System.out.println("No card was chosen");
                }
                return;
            }

        }while(choice!=3);

    }
}
