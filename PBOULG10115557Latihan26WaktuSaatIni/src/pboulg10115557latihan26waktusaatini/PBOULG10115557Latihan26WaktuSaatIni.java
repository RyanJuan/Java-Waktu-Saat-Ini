/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pboulg10115557latihan26waktusaatini;

import java.text.SimpleDateFormat;
import java.util.Calendar;

/**
 *
 * @author 10115557 / rayan / PBO Ulg / pertemuan 2 / latihan 26
 */
public class PBOULG10115557Latihan26WaktuSaatIni {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Calendar calendar = Calendar.getInstance();
        
        SimpleDateFormat tanggal = new SimpleDateFormat("EEEE, d MMMM yyyy, "
                + "HH:mm:ss");
               
        String kalender = tanggal.format(calendar.getTime());     
        System.out.println("Hari ini adalah hari : "+kalender);
    }   
}

