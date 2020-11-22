
import java.util.Scanner;


public class Main {
    public static void main(String[] args) {
        /*
        Switch-case yapısı
        burada else yapısının boşluğunu doldurmak için default kullanılmıştır
        if-else if-else yapısına benzer bir işlevi vardır switch-case yapısının
        bir durumdan sonra başka bir duruma girmek istemiyotsak break adlı bir yapı kullanıyoruz
        */
        
        Scanner scn = new Scanner(System.in);
        System.out.println("Bir adet rakam girişi yapınız ... = ");
        int s_rakam = scn.nextInt();
        switch(s_rakam){
            //s_rakam değerine göre işlemler gerçekleştirmek istediğimizi switch içine parametremizi göndererek söylemiş olduk
            case 1:
                System.out.println("1.işlem");
                break;//eğer 1 girildiyse çıktı verilir ve yapıdan çıkış gerçekleşir.
                //diğer case işlemlerine girilmemesi için break anahtar kelimesi kullanılır.
                //eğer break kullanmazsak koşul sağlansın yada sağlanmasın tüm caseler break ile karşılaşılana kadar çalıştırılır ve sonuçlar toplu verilir
                //diyelimki case 3'e kadar break kullanmadık  ve girdimiz 5 olsun çıktımız = 1.işlem\n2.işlem\n3.işlem\n5.işlem\n yapıdan çıkış  gerçekleştiğinde çalıştırılacak blog... (şeklinde olur)
                
            case 2:
                System.out.println("2.işlem");
                break;
            case 3:
                System.out.println("3.işlem");
                break;
            case 4:
                System.out.println("4.işlem");
                break;
            case 5:
                System.out.println("5.işlem");
                break;
            case 6:
                System.out.println("6.işlem");
                break;
            case 7:
                System.out.println("7.işlem");
                break;
            case 8:
                System.out.println("8.işlem");
                break;
            case 9:
                System.out.println("9.işlem");
                break;
            case 0:
                System.out.println("0.işlem");
                break;
            default:
                System.out.println("HATALI İŞLEM GERÇEKLEŞTİ");
                break;
                
            
        }
        System.out.println("yapıdan çıkış gerçekleştiğinde çalıştırılacak blog...");
    }
    
}
