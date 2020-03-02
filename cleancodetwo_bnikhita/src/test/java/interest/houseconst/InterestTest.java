package interest.houseconst;

import static org.junit.Assert.*;



import org.junit.Test;

import interest.houseconst.CI;
import interest.houseconst.SI;
import interest.houseconst.InterestTest;
import org.apache.logging.log4j.Logger;
public class InterestTest {

	@Test
	public void test() {
	final Logger logger=org.apache.logging.log4j.LogManager.getLogger(InterestTest.class);
	SI si=new SI();
	assertEquals(9000,si.calculation(1000,3,3),0);
	logger.info("Simple interest is calculated");
	logger.debug(si.calculation(1000,3,3));
	logger.warn("No warnings in Simple interest and calculated");
	logger.error("No errors in Simple interest and calculated");
	
	CI ci=new CI();
	assertEquals(1333.09,ci.calculation(1200,5.4,2),2);
	logger.info("Compound interest is calculated");
	logger.debug(ci.calculation(1200,5.4,2));
	logger.warn("No warnings in Compound interest and calculated");
	logger.error("No errors in Compound interest and calculated");

	}

}