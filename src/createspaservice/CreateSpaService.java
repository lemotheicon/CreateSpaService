/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package createspaservice;
import java.util.Scanner;
/**
 *
 * @author Omolemo
 */
public class CreateSpaService {

    
    public static void main(String[] args) {
      String service;
      double price;
      SpaService firstService = new SpaService();
      SpaService secondService = new SpaService();
      Scanner keyboard = new Scanner(System.in);
        System.out.println("Enter service >> ");
        service = keyboard.nextLine();
        System.out.println("Enter price >> ");
        price = keyboard.nextDouble();
        firstService.setServiceDescription(service);
        firstService.setPrice(price);
        firstService = getData(firstService);
        secondService = getData(secondService);
        //keyboard.nextLine();
        //System.out.println("Enter service >> ");
        //service = keyboard.nextLine();
        //System.out.println("Enter price >> ");
        //price = keyboard.nextDouble();
        //secondService.setServiceDescription(service);
        //secondService.setPrice(price);
        System.out.println("First service details:");
        System.out.println(firstService.getServiceDescription() 
                + "$" + firstService.getPrice());
        System.out.println("Second service details:");
        System.out.println(secondService.getServiceDescription() 
                + "$" + secondService.getPrice());
      
      
      
      
    }
    public static SpaService getData(SpaService service)
            {
                String serviceDescription;
                double price;
                Scanner keyboard = new Scanner(System.in);
                System.out.println("Enter service >> ");
        serviceDescription = keyboard.nextLine();
        System.out.println("Enter price >> ");
        price = keyboard.nextDouble();
        keyboard.nextLine();
        service.setServiceDescription(serviceDescription);
        service.setPrice(price);
        return service;
            } 
}
