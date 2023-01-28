package week1.day2;

public class Mobile {
	public void iPhone() {
		String mobileBrandName="Apple iphone 14 Pro Max";
		System.out.println("Name Of The Mobile :"+mobileBrandName);
		
		char mobileLogo='i';
		System.out.println("MOBILE LOGO        :"+mobileLogo);
		
		short noOfMobilePiece=2;
		System.out.println("NO OF MOBILE PIECE :"+noOfMobilePiece);
		
		int modelNumber=14;
		System.out.println("MODEL NUMBER       :"+modelNumber);
		
		long mobileImeiNumber=273654189027615283l;
		System.out.println("MOBILE IMEI NUMBER :"+mobileImeiNumber);
		
		float mobilePrice=189900f;
		System.out.println("MOBILE PRICE       :"+mobilePrice);
		
		boolean isDamaged=false;
		System.out.println("MOBILE IS DAMAGED  :"+isDamaged);
		
	}
	public static void main(String[] args) {
		Mobile iPhone =new Mobile ();
		iPhone.iPhone();
		
	}

}
