/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package aracyonetimsistemi;

/**
 *
 * @author Ercan
 */
public class Ucak extends HavaTasit{
    public void setID(int deger)
    {
        this.setID("ucak"+String.valueOf(deger));
    }
    @Override
    public void hizlanma(int c)
    {
    this.setAracHiz(this.getAracHiz()+c); 
    }
    @Override
    public void yavasla(int c)
    {
        if (this.getAracHiz()<c)
        {System.out.println("Yavaşlatmak istediğiniz hız aracın hızından büyük");}
    else
        {
            this.setAracHiz(this.getAracHiz()-c);
        }
            
    }
    @Override
    public void durdur()
    {
     if(getAracHiz()!=0)  
     {
      System.out.println("Uçak durdurulamadı. Şuanda "+this.getAracHiz()+" hiz ile seyir halinde");
     }
     else 
     {
         System.out.println("Uçak durduruldu"); 
         
    }
    
    }
}
