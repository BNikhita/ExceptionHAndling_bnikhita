package interest.houseconst;

public class MainHouse {
public double standardBase(String type,double sqrfootsize)
{
	HouseConstruction hc=new HouseConstruction();
	StandardBase sb=hc.type(type);
	double rate=sb.getRate();
	double bill=sqrfootsize*rate;
	return bill;
}
}