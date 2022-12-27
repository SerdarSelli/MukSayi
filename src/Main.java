import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int sayac=0;
        int n;
        System.out.println("bir sayı giriniz: ");
        n = scan.nextInt();

        for (int i =1;i<n;i++){
            if (n%i==0 ){
                sayac+=i;
                System.out.println("toplam= "+sayac);
            }
        }
        if (sayac==n){
            System.out.println(n+" mükemmel sayıdır");
        }else {
            System.out.println(n+" mükemmel sayı değildir");
        }
    }
}