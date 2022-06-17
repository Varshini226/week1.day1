package week1.day1;

public class TwoWheeler {

	public int noOfWheel(){
		int noOfWheel=2;
		return noOfWheel;
	}
	public short noOfMirrors() {
		short noOfMirrors=2;
		return noOfMirrors;
	}
	public long chassisNumber() {
		long chassisNumber=723456789;
		return chassisNumber;
	}
	public boolean isPunctured() {
		boolean isPunctured=false;
				return isPunctured;
	}
	public String bikeName() {
		String bikeName="honda";
		return bikeName;
	}
	public double runningKm() {
		double runningKm=15867.89;
		return runningKm;
		
	}
	public static void main(String[] args) {
		TwoWheeler bike= new TwoWheeler();
		System.out.println(bike.noOfWheel());
		System.out.println(bike.noOfMirrors());
		System.out.println(bike.chassisNumber());
		System.out.println(bike.isPunctured());
		System.out.println(bike.bikeName());
		System.out.println(bike.runningKm());
		
	}
	
	
	
}
