package edu.mce.sabariraj.mobileshop.services;

import edu.mce.sabariraj.mobileshop.models.Mobile;
import edu.mce.sabariraj.mobileshop.repositories.MobileRepository;

import java.util.List;
import java.util.Scanner;

public class MobileService {
    private MobileRepository repo;
    private Scanner scan;

    public MobileService() {
        repo = new MobileRepository();
        scan = new Scanner(System.in);
    }

    public void readMobiles() {
        List<Mobile> mobiles = repo.readMobiles();
        System.out.printf("%-10s%-15s%-25s%-10s%-15s%n", "id", "brand", "model", "year", "price");
        for (Mobile a : mobiles) {
            System.out.println(a);
        }
    }

    public void createMobile() {
        Mobile mobile = new Mobile();
        System.out.println("Enter Mobile Brand:");
        mobile.setBrand(scan.nextLine());
        System.out.println("Enter Mobile Model:");
        mobile.setModel(scan.nextLine());
        System.out.println("Enter Mobile Year Launched:");
        mobile.setYear_launched(scan.nextInt());
        scan.nextLine();
        System.out.println("Enter Mobile Price:");
        mobile.setPrice(scan.nextDouble());
        scan.nextLine();
        repo.createMobile(mobile);
        System.out.println("Mobile Created Successfully");
    }
    public void updateMobile() {
        Mobile mobile = new Mobile();
        System.out.println("Enter Mobile Id to Update:");
        mobile.setId(scan.nextLong());scan.nextLine();
        System.out.println("Enter updated Mobile Brand :");
        mobile.setBrand(scan.nextLine());
        System.out.println("Enter updated Mobile Model :");
        mobile.setModel(scan.nextLine());
        System.out.println("Enter updated Mobile Year Launched:");
        mobile.setYear_launched(scan.nextInt());
        scan.nextLine();
        System.out.println("Enter updated Mobile Price:");
        mobile.setPrice(scan.nextDouble());
        scan.nextLine();
        repo.updateMobile(mobile);
        System.out.println("Mobile updated Successfully");
    }
    public void deleteMobile(){
        Long id;
        System.out.println("Enter Mobile id to delete: ");
        id= scan.nextLong();scan.nextLine();
        repo.deleteMobile(id);
        System.out.println("mobile Deleted Successfully");
    }
    public void readMobile(){
        Long id;
        System.out.println("Emter Mobile id:");
        id= scan.nextLong();scan.nextLine();
        Mobile mobile =repo.readMobile(id);
        System.out.printf("%-10s%-15s%-25s%-10s%-15s%n", "id", "brand", "model", "year", "price");
        System.out.println(mobile);
    }

}