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
