/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package car.sales;

/**
 *
 * @author hp
 */
public class User {
    private final String ManufacturerU;
    private final int YearU;
    private final String ModelU;
    private final int PriceU;
    private final int KmU;
    private final String InfoU;
   
    
    public User(String ManufacturerU,int YearU,String ModelU,int PriceU,int KmU,String InfoU)
    {
        this.ManufacturerU= ManufacturerU;
        this.YearU= YearU;
        this.ModelU= ModelU;
        this.PriceU= PriceU;
        this.KmU= KmU;
        this.InfoU= InfoU;
        
        
    }
    public String getManufacturerU()
    {
        return ManufacturerU;
    }
    public int getYearU()
    {
        return YearU;
    }
    public String getModelU()
    {
        return ModelU;
    }
    public int getPriceU()
    {
        return PriceU;
    }
    public int getKmU()
    {
        return KmU;
    }
    public String getInfoU()
    {
        return InfoU;
    }
    
    
}
