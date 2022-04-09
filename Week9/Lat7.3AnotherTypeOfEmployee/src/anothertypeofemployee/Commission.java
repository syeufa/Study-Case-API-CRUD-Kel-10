/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package anothertypeofemployee;

/**
 *
 * @author mferd
 */

//********************************************************
//  Commission.java       Author: Mochamad Ferdy Fauzan
//
//  Represents an hourly employee but also earns a 
//  commission on sales.
//********************************************************

public class Commission extends Hourly
{
    private double totalSales;
    private double commissionRate;
    
    //----------------------------------------------------------------
    //  Sets up this hourly employee but also earns a commission on 
    //  sales using the specified information.
    //----------------------------------------------------------------
    public Commission (String eName, String eAddress, String ePhone,
                 String socSecNumber, double rate, double commissionRate)
    {
        super(eName, eAddress, ePhone, socSecNumber, rate);
        
        this.commissionRate = commissionRate;
    }
    
    //----------------------------------------------------------------
    //  Adds the specified number of sales to this employee's
    //  accumulated sales.
    //----------------------------------------------------------------
    public void addSales (double totalSales)
    {
        this.totalSales += totalSales;
    }
    
    //----------------------------------------------------------------
    //  Computes and returns the pay for this hourly employee but also 
    //  earns a commission on sales.
    //----------------------------------------------------------------
    @Override
    public double pay()
    {
        double payment = super.pay() + totalSales *(1.0 + commissionRate);
        
        totalSales = 0;
        
        return payment;
    }
    
    //----------------------------------------------------------------
    //  Retuns information about this hourly employee with 
    //  total sales as a string.
    //----------------------------------------------------------------
    @Override
    public String toString()
    {
        String result = super.toString();
        
        result += "\nTotal Sales: " + totalSales;
        
        return result;
    }
}
