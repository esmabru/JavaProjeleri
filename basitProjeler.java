//Girilen sayının tek mi çift mi olduğunu bulan program
import java.util.Scanner;//Scanner sınıfını dışarıdan çağırıp bu kodda kullanmak için import edilir  

public class merkez{
	
	public static void main(String[] args) {//Programın ana çalışma kodu
		int hak=3;
	
		Scanner girdi= new Scanner(System.in);//Bu kod, klavyeden (konsoldan) kullanıcı girişini okumak için Scanner sınıfından bir nesne oluşturur.
		while(hak>0){
		System.out.print("Bir sayı giriniz:");//Ekrana çıktı veriyor
		int sayi=girdi.nextInt();//Kullanıcıdan alınacak verinin tipini ve ismini belirtiyor
		if(sayi%2==0) {
			System.out.println("Girdiğiniz sayı çift sayıdır");
		}
		else {
		System.out.println("Girdiğiniz sayı tek sayıdır");
		}
		hak--;
		if (hak > 0) {
            System.out.println(hak + " hakkınız kaldı");
        } else {
            System.out.println("Hakkınız bitmiştir");
        }
	 }
		girdi.close();
   }
}

//Girilen 3 sayıdan en büyüğünü bulan program
import java.util.Scanner;

public class merkez {
	public static void main(String[] args) {
		Scanner girdi= new Scanner(System.in);
		
		System.out.print("İlk sayıyı giriniz:");
		int sayi1=girdi.nextInt();
		System.out.print("İkinci sayıyı giriniz:");
		int sayi2=girdi.nextInt();
		System.out.print("Üçüncü sayıyı giriniz:");
		int sayi3=girdi.nextInt();
		
		if(sayi1>sayi2 && sayi1>sayi3) {
		System.out.println("En büyük sayı "+sayi1);
	}
		else if(sayi2>sayi1 && sayi2>sayi3) {
			System.out.println("En büyük sayı "+sayi2);
		}
		else {
			System.out.println("En büyük sayı "+sayi3);
		}
   }
}
