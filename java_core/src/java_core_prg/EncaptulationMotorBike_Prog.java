package java_core_prg;

public class EncaptulationMotorBike_Prog {


		
		
		private int speed;
		
		public void setSpeed(int speed)
		{
			if (speed>0)
			{
		
			this.speed= speed;
			}
	
		}
		
		protected void private1()
		{
			System.out.println("this is protected");
		}
		
		public int CurrentSpeed()
		{
			return speed;
		}


}
