package interest.houseconst;

public class CI extends InterestCalculation{
	public double calculation(double principal,double rate,double time){
		double compundInterest;
		compundInterest=principal *(Math.pow((1 + rate/ 100), time));
		return compundInterest;
	}
}
