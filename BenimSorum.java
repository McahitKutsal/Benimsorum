/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package BenimSorum;
interface bilgiler{
    public void bilgileri_goster();
}
abstract class ates{
    public abstract void ates_et();   
}
class asker extends ates implements bilgiler{

    public asker(String ad_soyad, int sicil_no) {
        this.ad_soyad = ad_soyad;
        this.sicil_no = sicil_no;
    }
    
    private static String kamuflaj = "Haki";
    private String ad_soyad;
    private int sicil_no;
    private static String silah = "Normal silah";

    public static String getSilah() {
        return silah;
    }


    public String getAd_soyad() {
        return ad_soyad;
    }

    public int getSicil_no() {
        return sicil_no;
    }


    public void setAd_soyad(String ad_soyad) {
        this.ad_soyad = ad_soyad;
    }

    public void setSicil_no(int sicil_no) {
        this.sicil_no = sicil_no;
    }
    

    @Override
    public void ates_et() {
        System.out.println(this.silah+" ile ates ediliyor");
    }

    @Override
    public void bilgileri_goster() {
        System.out.println("Kamuflaj "+this.kamuflaj+"\nSicil no: "+this.sicil_no+"\n"+"Ad Soyad: "+this.ad_soyad);
    }   
}
class roketli_asker extends asker{
    private static final String silah = "Roket";

    public roketli_asker(String ad_soyad, int sicil_no) {
        super(ad_soyad, sicil_no);
    }
    @Override
    public void ates_et(){
        System.out.println(this.silah+" ile ates ediliyor");
    }
}

public class BenimSorum {

    
    public static void main(String[] args) {
        asker a = new asker("Ali veli",195541014);
        a.ates_et();;
        a.bilgileri_goster();
        a.getSicil_no();
        
        roketli_asker r = new roketli_asker("MÃ¼cahit Kutsal", 195741234);
        r.ates_et();
        r.setAd_soyad("Mehmet Kutsal");
        r.bilgileri_goster();
        System.out.println(asker.getSilah());
        
    } 
}
