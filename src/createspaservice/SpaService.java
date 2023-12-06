/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package createspaservice;

/**
 *
 * @author Omolemo
 */
  public class SpaService
{
      private String serviceDescription;
      private double price;

    public String getServiceDescription() {
        return serviceDescription;
    }

    public void setServiceDescription(String serviceDescription) {
        this.serviceDescription = serviceDescription;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }
    public SpaService()
            {
                serviceDescription = "XXX";
                price = 0;
            }
    
  }

