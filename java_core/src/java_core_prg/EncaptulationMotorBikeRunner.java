package java_core_prg;

public class EncaptulationMotorBikeRunner {

	public static void main(String[] args) {
		
		EncaptulationMotorBike_Prog ducati= new EncaptulationMotorBike_Prog();
		
		EncaptulationMotorBike_Prog yahama= new EncaptulationMotorBike_Prog();
	
		ducati.setSpeed(-60);
		
		System.out.println(ducati.CurrentSpeed());
		
		yahama.setSpeed(40);
		
		System.out.println(yahama.CurrentSpeed());
		
		yahama.private1();
		
		

	}

}
