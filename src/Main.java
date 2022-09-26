import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        db datebase = new db();
        String name = datebase.name;
        String lastName = datebase.lastName;
        String iletisim = datebase.iletisim;
        System.out.println("İşlem Türü Seçiniz.\n" + "1.Müşteri Bilgileri\n"+
                "2.Bakiye sorma\n" + "3.Para Çekme\n" +"4.Para Yatırma\n" + "5.Çıkış");
        String giris = scanner.nextLine();

            if (giris.equals("1")) {
                System.out.println("İsim Soyisim: " + name + " " + lastName + "\n" + "Telefon: " + iletisim);
            } else if (giris.equals("2")) {
                System.out.println(datebase.bakiye);
            } else if (giris.equals("3")) {
                System.out.print("Çekilecek tutarı giriniz:");
                int cekme = scanner.nextInt();
                if(cekme > datebase.bakiye) {
                    System.out.println("Yetersiz bakiye.");
                }else{
                    int yeniBakiye = datebase.bakiye - cekme;
                    System.out.println("Çekme işlemi başarılı kalan bakiye:" + yeniBakiye);
                }
            } else if (giris.equals("4")){
                System.out.print("Yatıracağınız tutarı giriniz:");
                int yatirma = scanner.nextInt();
                int yeniBakiye = datebase.bakiye + yatirma;
                System.out.println("Para yatırma işlemi başarılı kalan bakiye:"+ yeniBakiye);
            } else if (giris.equals("5")){
                System.out.println("Hoşçakalın");
            } else {
                System.out.println("geçersiz işlem yaptınız.");

            }

    }
}