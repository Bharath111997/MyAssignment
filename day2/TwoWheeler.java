package week1.day2;

public class TwoWheeler {
	public void bikeInformation() {
        	 int noOfWheels=2;
        	 System.out.println("NO OF WHEELS = "  + noOfWheels);
        	 
        	 short noOfMirrors=2;
        	 System.out.println("NO OF MIRRORS = " + noOfMirrors);
        	 
        	 long chassisNumber=15982435256l;
        	 System.out.println("CHASSIS NUMBER = " + chassisNumber);
        	 
        	 boolean isPunctured=false;
        	 System.out.println("PUNCTURED = " + isPunctured);
        	 
        	 String bikeName="Splender";
        	 System.out.println("BIKE NAME = " + bikeName);
         
        	 double runningKM=8554.8;
        	 System.out.println("RUNNING K.M = " + runningKM);
         }
         public static void main(String[] args) {
			TwoWheeler object =new TwoWheeler();
			object.bikeInformation();
		}
 
}
