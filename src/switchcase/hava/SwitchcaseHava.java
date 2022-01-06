/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package switchcase.hava;
import java.util.Scanner;

/**
 *
 * @author MONSTER
 */
public class SwitchcaseHava {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        int heat;
        Scanner input=new Scanner(System.in);
        System.out.print("Sıcaklık Giriniz: ");
        heat=input.nextInt();
        
        /* Sıcaklık 5'dan küçük ise "Kayak" yapmayı öner.
Sıcaklık 5 ve 15 arasında ise "Sinema" etkinliğini öner.
Sıcaklık 15 ve 25 arasında ise "Piknik" etkinliğini öner.
Sıcaklık 25'ten büyük ise "Yüzme" etkinliğini öner. */
        
        if (heat<5) {
            System.out.print("kayak yap");
        }
        else if (heat>=5 && heat<15) {
            System.out.print("Sinemaya git");
            
        }
        
        else if(heat>=15 && heat<25) {
            System.out.print("piknik yap");
           
        }
        else
                {
        System.out.print("yüzmeye git");
        
    }
        
        
    }
    
}
