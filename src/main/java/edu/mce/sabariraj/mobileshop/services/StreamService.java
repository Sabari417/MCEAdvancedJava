package edu.mce.sabariraj.mobileshop.services;

import edu.mce.sabariraj.mobileshop.models.Mobile;
import edu.mce.sabariraj.mobileshop.repositories.MobileRepository;

import java.util.List;
import java.util.Scanner;

public class StreamService {
    private MobileRepository repo;
    private Scanner scan;
    private List<Mobile> mobiles;

    public StreamService() {
        repo = new MobileRepository();
        scan = new Scanner(System.in);
        mobiles = repo.readMobiles();
    }

    public void ShowAllMobiles() {
        for (int index = 0; index < mobiles.size(); index++)
            System.out.println(mobiles.get(index));
    }

    public void fliterMobilesByBrand() {
        String brand;
        System.out.println("Enter Brand to Fliter");
        brand = scan.nextLine();
    }

}