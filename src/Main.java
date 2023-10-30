import java.util.Scanner;

public class Main {
    /*
    Proje Konusu
    #Java ile kullanıcıdan doğum ayı ve gün değerlerini alıp Burcunu hesaplayan program yazınız.

    Koç Burcu : 21 Mart - 20 Nisan
    Boğa Burcu : 21 Nisan - 21 Mayıs
    İkizler Burcu : 22 Mayıs - 22 Haziran
    Yengeç Burcu : 23 Haziran - 22 Temmuz
    Aslan Burcu : 23 Temmuz - 22 Ağustos
    Başak Burcu : 23 Ağustos - 22 Eylül
    Terazi Burcu : 23 Eylül - 22 Ekim
    Akrep Burcu : 23 Ekim - 21 Kasım
    Yay Burcu : 22 Kasım - 21 Aralık
    Oğlak Burcu : 22 Aralık - 21 Ocak
    Kova Burcu : 22 Ocak - 19 Şubat
    Balık Burcu : 20 Şubat - 20 Mart
     */
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int day;
        int month;

        System.out.println("Ocak:1, Şubat:2, Mart:3, Nisan:4, Mayıs:5, Haziran:6, Temmuz:7, Ağustos:8, Eylül:9, Ekim:10, Kasım:11, Aralık:12");
        System.out.print("Doğduğunuz ayı giriniz: ");
        month = input.nextInt();
        System.out.print("Doğduğunuz günü giriniz: ");
        day = input.nextInt();

        if (month == 3 && day >= 21 || month == 4 && day <= 20){
            System.out.println("Koç Burcu");
        } else if (month == 4 && day >= 21 || month == 5 && day <= 21) {
            System.out.println("Boğa Burcu");
        } else if (month == 5 && day >= 22 || month == 6 && day <= 22) {
            System.out.println("İkizler Burcu");
        } else if (month == 6 && day >= 23 || month == 7 && day <= 22) {
            System.out.println("Yengeç Burcu");
        } else if (month == 7 && day >= 23 || month == 8 && day <= 22) {
            System.out.println("Aslan Burcu");
        } else if (month == 8 && day >= 23 || month == 9 && day <= 22) {
            System.out.println("Başak Burcu");
        } else if (month == 9 && day >= 22 || month == 10 && day <= 22) {
            System.out.println("Terazi Burcu");
        } else if (month == 10 && day >= 23 || month == 11 && day <= 21) {
            System.out.println("Akrep Burcu");
        } else if (month == 11 && day >= 22 || month == 12 && day <= 21) {
            System.out.println("Yay Burcu");
        } else if (month == 12 && day >= 22 || month == 1 && day <= 21) {
            System.out.println("Oğlak Burcu");
        } else if (month == 1 && day >= 22 || month == 2 && day <= 19) {
            System.out.println("Kova Burcu");
        } else if (month == 2 && day >= 20 || month == 3 && day <= 20) {
            System.out.println("Balık Burcu");
        }
    }
}