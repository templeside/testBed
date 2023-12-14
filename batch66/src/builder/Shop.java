package builder;

public class Shop {
	public static void main(String[] args){
//		Phone phone = new Phone("android", "sdsd",6,5000);
		Phone2 phone1 = new PhoneBuilder().setOs("Android").setCamera(20).build();
		System.out.println(phone1);
		
		Phone2 phone2 = new PhoneBuilder().setOs("Android").setBattery(500).build();
		System.out.println(phone2);
		
		Phone2 phone3 = new PhoneBuilder().setOs("Android").setBattery(500).setCamera(20).build();
		System.out.println(phone3);
	}
}
