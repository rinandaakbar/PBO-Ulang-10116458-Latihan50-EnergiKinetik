/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pbo.ulang.pkg10116458.latihan50.energikinetik;

/**
 *
 * @author 
 * NAMA     : Rinanda Al Qorrie Akbar
 * NIM      : 10116458
 */
public class PBOUlang10116458Latihan50EnergiKinetik {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        BolaBaseball ball = new BolaBaseball();
        ball.setMassa(145);
        ball.setKecepatan(25);
        System.out.println("sebuah bola baseball dengan massa = " + ball.getMassa() + " g");
        System.out.println("baseball dilempar dengan kecepatan = " + ball.getKecepatan() + " m/s");
        
        double massa = ball.getMassa();
        double kecepatan = ball.getKecepatan();
        
        System.out.println("A. Energi Kinetik = " + ball.hitungEnergiKinetik1(massa, kecepatan));
        System.out.println("B. Usaha pada bola = " + ball.usaha());
        System.out.println("Catatan : Nilai usaha tetap, karena dimulai dari keadaan diam");
    }
    
}
