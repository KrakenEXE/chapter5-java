package projectThree;

public class input {
	//fields
		private int vehicleSpeed;
		private int hoursTraveled;
		private int milesTraveled;
		
		
		//constructors
		public input(int vehicleSpeed , int hoursTraveled)
		{
			this.vehicleSpeed = vehicleSpeed;
			this.hoursTraveled = hoursTraveled;
		}


		public int getVehicleSpeed() {
			return vehicleSpeed;
		}


		public void setVehicleSpeed(int vehicleSpeed) {
			this.vehicleSpeed = vehicleSpeed;
		}


		public int getHoursTraveled() {
			return hoursTraveled;
		}


		public void setHoursTraveled(int hoursTraveled) {
			this.hoursTraveled = hoursTraveled;
		}


		public int getMilesTraveled() {
			milesTraveled = vehicleSpeed * hoursTraveled;
			return milesTraveled;
		}


		public void setMilesTraveled(int milesTraveled) {
			this.milesTraveled = milesTraveled;
		}
	
}
