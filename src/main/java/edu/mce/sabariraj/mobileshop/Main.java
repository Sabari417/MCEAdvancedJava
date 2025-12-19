package edu.mce.sabariraj.mobileshop;

import edu.mce.sabariraj.mobileshop.models.Mobile;
import edu.mce.sabariraj.mobileshop.services.MobileService;
import edu.mce.sabariraj.mobileshop.services.StreamService;

import java.util.List;
import java.util.ArrayList;
import java.util.Scanner;


public class Main {
    static void main() {
      /*  MobileService service=new MobileService();
        Scanner scan =new Scanner(System.in);
        int choice=0;
        while (choice!=6){
            System.out.println("1.create,2.read all,3.update,4.delete,5.read one. /nEnter your choice");
            choice= scan.nextInt();scan.nextLine();
            switch(choice){
                case 1:service.createMobile();break;
                case 2:service.readMobiles();break;
                case 3:service.updateMobile();break;
                case 4:service.deleteMobile();break;
                case 5:service.readMobile();break;
                default:
                    choice=6;
            }
        }
        System.out.println("EXIT");*/
        StreamService ss= new StreamService();
        ss.fliterMobilesByBrand();
        ss.ShowAllMobiles();
    }
}
