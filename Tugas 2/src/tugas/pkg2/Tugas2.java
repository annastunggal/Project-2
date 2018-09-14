/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tugas.pkg2;

/**
 *
 * @author ANNAS
 */
public class Tugas2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int nilaiAndroid = 85 ;
String Wajah = "cantik";
String asal  = "malang";
 System.out.println("Apakah mau menikah ?");

char nilaihuruf;
 if(  nilaiAndroid >= 85 ){
  nilaihuruf = 'A';   
 }
 else if (nilaiAndroid >= 75){
  nilaihuruf = 'B'; 
 }
 else if (nilaiAndroid >= 65){
  nilaihuruf = 'C';
 }
 else if (nilaiAndroid >= 55){
  nilaihuruf = 'D';
 }
 else{
  nilaihuruf = 'E';
 }
if( nilaihuruf == 'A' && Wajah == "cantik" && asal == "malang"){
 System.out.println("Mau Bangetlah");
}
else if ((nilaihuruf == 'A' || nilaihuruf == 'C') && Wajah == "cantik" && asal == "malang"){
 System.out.println("Bolehlah");  
}
else {
if( asal == "malang"){
 System.out.println("Saya pikir dulu");
}
else {
System.out.println("Absolutely No");
}
    }
    
    }}
