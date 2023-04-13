import java.util.Arrays;
import java.util.Scanner;

public class yakindeger {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        System.out.print("Girilen Sayıdeğerini yazınız : ");
        int sayi = input.nextInt();
        int yakinkucuk = 0;
        int yakinbuyuk = 0;
        int[] array = {20, 5, 40 , 300, 60};
        Arrays.sort(array);

        for (int l = 0;l< array.length; l++) {
            if (sayi<array[l]){
                yakinbuyuk = array[l];
                yakinkucuk = array[l-1];
                break;
            }
        }
        System.out.println("Girilen sayıdan küçük en yakın sayı : " + yakinkucuk);
        System.out.println("Girilen sayıdan büyük en yakın sayı : " + yakinbuyuk);
    }
}