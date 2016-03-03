package projectSix;

public class OrganismStore {

	private int _startingNumber;
	private double _dailyPopulationIncrease;
	private int _numberOfDaysToMultiply;
	public int dailyPopulation;
	public OrganismStore(int startingSize, double dailyIncrease, int daysToMultiply){
		_startingNumber = startingSize;
		_dailyPopulationIncrease = dailyIncrease / 100;
		_numberOfDaysToMultiply = daysToMultiply;
	}
	
	/*public double get_startingNumber() {
		return _startingNumber;
	}
	public void set_startingNumber(double _startingNumber) {
		this._startingNumber = _startingNumber;
	}
	public double get_dailyPopulationIncrease() {
		return _dailyPopulationIncrease;
	}
	public void set_dailyPopulationIncrease(double _dailyPopulationIncrease) {
		this._dailyPopulationIncrease = _dailyPopulationIncrease;
	}
	public int get_numberOfDaysToMultiply() {
		return _numberOfDaysToMultiply;
	}
	public void set_numberOfDaysToMultiply(int _numberOfDaysToMultiply) {
		this._numberOfDaysToMultiply = _numberOfDaysToMultiply;
	}*/

	public void getDailyPopulation() {
		for(int i = 1; i<=_numberOfDaysToMultiply; ++i){
			System.out.println("Day: "+(i)+" Population: "+_startingNumber);
			_startingNumber += (_dailyPopulationIncrease * _startingNumber);
			
		}
	}

	public void setDailyPopulation(int dailyPopulation) {
		this.dailyPopulation = dailyPopulation;
	}
	
}
