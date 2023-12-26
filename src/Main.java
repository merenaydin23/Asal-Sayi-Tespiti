import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        System.out.println("Asallık durumu incelenecek sayıyı girin");
        Scanner klavye = new Scanner(System.in);
        int sayi = klavye.nextInt();
        if (Asalmi(sayi, 2)==true) {
            System.out.println(sayi + " asal bir sayıdır.");
        } else {
            System.out.println(sayi + " asal bir sayı değildir.");
        }
    }
    public static boolean Asalmi(int sayi,int i){
        if (sayi<2){
            return false;
        }
        else if (sayi==2) {
            return true;
        }
        else if (sayi%i==0){
            return false;
        }
        /*Bir sayı asal değise karekökünden küçük değerlerden 1 tam sayıya kesinlikle bölünmelidir*/
        else if (i*i>sayi){
            return true;
        }
        else {
            return Asalmi(sayi,i+1);
        }
       }
}