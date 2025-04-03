import java.util.Scanner;

public class SinemaKayitSistemi {
    static final int MAX_FILMS = 10;
    static final int MAX_CUSTOMERS = 20;

    static String[] filmAdlari = new String[MAX_FILMS];
    static String[] filmTurleri = new String[MAX_FILMS];
    static int[] filmSureleri = new int[MAX_FILMS];
    static int filmSayisi = 0;

    static String[] musteriAdlari = new String[MAX_CUSTOMERS];
    static String[] musteriEmailleri = new String[MAX_CUSTOMERS];
    static int musteriSayisi = 0;

    static String[][] biletler = new String[MAX_CUSTOMERS][MAX_FILMS];

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int secim;

        do {
            System.out.println("\nSinema Sistemi");
            System.out.println("1. Film Ekle");
            System.out.println("2. Müşteri Ekle");
            System.out.println("3. Bilet Sat");
            System.out.println("4. Biletleri Listele");
            System.out.println("5. Çıkış");
            System.out.print("Seçiminizi yapın: ");
            secim = scanner.nextInt();
            scanner.nextLine();

            switch (secim) {
                case 1 -> filmEkle(scanner);
                case 2 -> musteriEkle(scanner);
                case 3 -> biletSat(scanner);
                case 4 -> biletleriListele();
                case 5 -> System.out.println("Çıkış yapılıyor...");
                default -> System.out.println("Geçersiz seçim!");
            }
        } while (secim != 5);
        scanner.close();
    }

    static void filmEkle(Scanner scanner) {
        if (filmSayisi < MAX_FILMS) {
            System.out.print("Film Adı: ");
            filmAdlari[filmSayisi] = scanner.nextLine();
            System.out.print("Film Süresi (dk): ");
            filmSureleri[filmSayisi] = scanner.nextInt();
            scanner.nextLine();
            System.out.print("Film Türü: ");
            filmTurleri[filmSayisi] = scanner.nextLine();
            filmSayisi++;
            System.out.println("Film başarıyla eklendi!");
        } else {
            System.out.println("Film kapasitesi doldu!");
        }
    }

    static void musteriEkle(Scanner scanner) {
        if (musteriSayisi < MAX_CUSTOMERS) {
            System.out.print("Müşteri Adı: ");
            musteriAdlari[musteriSayisi] = scanner.nextLine();
            System.out.print("Müşteri Email: ");
            musteriEmailleri[musteriSayisi] = scanner.nextLine();
            musteriSayisi++;
            System.out.println("Müşteri başarıyla eklendi!");
        } else {
            System.out.println("Müşteri kapasitesi doldu!");
        }
    }

    static void biletSat(Scanner scanner) {
        if (musteriSayisi == 0 || filmSayisi == 0) {
            System.out.println("Önce müşteri ve film eklemelisiniz!");
            return;
        }

        System.out.println("Mevcut Müşteriler:");
        for (int i = 0; i < musteriSayisi; i++) {
            System.out.println((i + 1) + ". " + musteriAdlari[i]);
        }
        System.out.print("Müşteri seçin: ");
        int musteriSecim = scanner.nextInt() - 1;
        scanner.nextLine();

        if (musteriSecim < 0 || musteriSecim >= musteriSayisi) {
            System.out.println("Geçersiz müşteri!");
            return;
        }

        System.out.println("Mevcut Filmler:");
        for (int i = 0; i < filmSayisi; i++) {
            System.out.println((i + 1) + ". " + filmAdlari[i]);
        }
        System.out.print("Film seçin: ");
        int filmSecim = scanner.nextInt() - 1;
        scanner.nextLine();

        if (filmSecim < 0 || filmSecim >= filmSayisi) {
            System.out.println("Geçersiz film!");
            return;
        }

        biletler[musteriSecim][filmSecim] = filmAdlari[filmSecim];
        System.out.println("Bilet başarıyla oluşturuldu!");
    }

    static void biletleriListele() {
        for (int i = 0; i < musteriSayisi; i++) {
            System.out.println("Müşteri: " + musteriAdlari[i]);
            System.out.println("Email: " + musteriEmailleri[i]);
            System.out.println("İzlediği Filmler:");
            boolean filmVar = false;
            for (int j = 0; j < filmSayisi; j++) {
                if (biletler[i][j] != null) {
                    System.out.println("- " + biletler[i][j]);
                    filmVar = true;
                }
            }
            if (!filmVar) {
                System.out.println("Film kaydı yok.");
            }
        }
    }
}
