package com.mycompany.CollectionsTask.model;

public enum Manufacturer {
    SOUTHERN_BAKERY("southern bakery"), 
    NORTHERN_SWEET_SHOP("northern sweet-shop");
    
    private String manufacturerTitle;

   Manufacturer(String manufacturerTitle) {
       this.manufacturerTitle = manufacturerTitle;
   }
   
   public String getManufacturerTitle() {
       return manufacturerTitle;
   }
}
