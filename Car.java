package week1.day2;

public class Car {
	
		public boolean applyBreak() {
		return false;
		}
		public int applyGear() {
			int gear=2;
			return gear;
			}
		public boolean switchOnAc() {
			return true;
		}
		public String applyAccelerate() {
		String accelerate="speed";
		return accelerate;
		}
	
		public static void main(String[] args) {
			Car obj= new Car();
			
			System.out.println(obj.applyBreak());
			System.out.println(obj.applyGear());
			System.out.println(obj.switchOnAc());
			System.out.println(obj.applyAccelerate());
		}

}
