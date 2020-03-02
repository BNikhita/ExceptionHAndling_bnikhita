package interest.houseconst;

public class SI extends InterestCalculation{
	
	public double calculation(double principal,double rate,double time)
	{
		double simpleInterest;
		simpleInterest=principal*rate*time;
		return simpleInterest;
	}
}