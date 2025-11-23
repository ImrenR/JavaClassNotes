package j30_Map.tasks;

import java.util.HashMap;
import java.util.Scanner;

public class Xd {

	public static void main(String[] args) {
		
		HashMap<String, String> hm = new HashMap<>();
		selectOption( hm);
	}
	public static void saveInfo(HashMap<String, String> hm) {
			Scanner scan = new Scanner(System.in);
			String id = "";
			do {
				System.out.println("Please enter you id\nPress 'Q' to quit");
				id = scan.next();
				
				//Kullanicidan kimlik numarasi al, tekrarliya izin verme
				if(id.equalsIgnoreCase("Q")) {
					break;
				}else {
					while(hm.containsKey(id)) {
						System.out.println(id + " kayitlarda var, lutfen gecerli bir id giriniz");
						id = scan.next();
					}
				}
				// next() den sonra nextLine() kullanirsaniz bu kodu araya yaziniz
				scan.nextLine();
				
				//Kullanicidan isim al
				System.out.println("Tam isminizi giriniz");
				String isim = scan.nextLine();
				
				//Kullanicidan adres aliniz
				System.out.println("Adresinizi giriniz");
				String adres = scan.nextLine();
				
				//Kullanicidan telefon numarasini aliniz
				System.out.println("Telefonunuzu giriniz");
				String tel = scan.nextLine();
				
				//Isim, adres ve tel bilgileri birlestirildi
				String ogrenci = "\nIsim: " + isim + "\nAdres: " + adres + "\nTelefon: " + tel;
				
				//HashMap'e key ve value'lari ekledik
				hm.put(id, ogrenci);
				
				System.out.println(hm);
			}while(true);
	}
	public static void getInfo(HashMap<String, String> hm) {
		
			Scanner scan = new Scanner(System.in);
			String id = "";
			
			do {
				System.out.println("Please enter id that you wanna get person info about");
				System.out.println("Press 'Q' to quit");
				id = scan.next();
				
				if(id.equalsIgnoreCase("Q")) {
					break;
				}else if(hm.isEmpty()){
					System.out.println("Herhangi bir data yok");
					break;
				}else if(!hm.containsKey(id)) {
					System.out.println(id + " no data with this id. Please enter a valid id");
				}
				else {
					String ogrenciInfo = hm.get(id);
					System.out.println(id + " contains these infos: \n" + ogrenciInfo);
				}
				
				
			}while(true);
	}
	
	public static void removeInfo(HashMap<String, String> hm) {
		
				Scanner scan = new Scanner(System.in);
				String id = "";
				
				do {
					System.out.println("Please enter an id to remove ");
					System.out.println("Press 'Q' to quit removing");
					id = scan.next();
					
					if(id.equalsIgnoreCase("Q")) {
						break;
					}else if(hm.isEmpty()){
						System.out.println("No available data");
					}else if(!hm.containsKey(id)) {
						System.out.println(id + " invalid id. Please enter a valid id");
					}else {
						String removedData = hm.remove(id);
						System.out.println("Removed student: \n" + removedData);
					}
				}while(true);
				
				System.out.println(hm);
	}
	public static void selectOption(HashMap<String, String> hm) {
			
			Scanner scan = new Scanner(System.in);
			String option = "";
			
			do{
				System.out.println("Kullanmak istediginiz method'u seciniz \n1: Add Student\n2:GetInfo\n3:Remove Info");
				System.out.println("Press 'Q' to quit");
				option = scan.next();
				if(option.equalsIgnoreCase("Q")) {
					break;
				}
				switch(option) {
				case "1":
					saveInfo(hm);
					break;
				case "2":
					getInfo(hm);
					break;
				case "3":
					removeInfo(hm);
					break;
				default:
					System.out.println("Yanlis method sectiniz tekrar deneyiniz");
					
				case "Q":
				break;
				}
			}while(true);
		
	}
	
}