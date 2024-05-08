
package mengundi;

import java.util.Scanner;

public class Mengundi {

   
    public static void main(String[] args) {
         Scanner input = new Scanner(System.in);
        
        int tahun;
        boolean status;
        
          System.out.print("Nyatakan umur : ");
        tahun = input.nextInt(); 
        System.out.print("Anda berdaftar? (true/false) : ");
        status = input.nextBoolean();
        
      if (tahun >= 18 && status==true){
            System.out.println("Anda layak mengundi");
        } else if (status==false){
                System.out.println("Anda perlu mendaftar sebelum mengundi");
        } else {
            System.out.println("Anda terlalu muda dan tidak layak mengudi");
        }
        
       
          
    }
   }

