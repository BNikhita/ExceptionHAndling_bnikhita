package interest.houseconst;
import static org.junit.Assert.assertEquals;

import org.junit.Test;

import interest.houseconst.MainHouse;
import org.apache.logging.log4j.LogManager;
import interest.houseconst.HouseTest;
public class HouseTest {

	@Test
	public void test() {
		final org.apache.logging.log4j.Logger logger=LogManager.getLogger(HouseTest.class);
		
		 
		MainHouse mh=new MainHouse();
		assertEquals(4800,mh.standardBase("Standard",4),0);
		logger.info("House construction with Standard material is calculated");
		logger.debug(mh.standardBase("Standard",4));
		logger.warn("No warnings in calculating the standard material house construction cost");
		logger.error("No errors in calculating the standard material house construction cost");

		assertEquals(3000,mh.standardBase("AboveStandard",2),0);
		logger.info("House construction with AboveStandard material is calculated");
		logger.debug(mh.standardBase("AboveStandard",2));
		logger.warn("No warnings in calculating the AboveStandard material house construction cost");
		logger.error("No errors in calculating the AboveStandard material house construction cost");

		assertEquals(5400,mh.standardBase("HighStandard",3),0);
		logger.info("House construction with HighStandard material is calculated");
		logger.debug(mh.standardBase("HighStandard",3));
		logger.warn("No warnings in calculating the HighStandard material house construction cost");
		logger.error("No errors in calculating the HighStandard material house construction cost");

		assertEquals(10000,mh.standardBase("FullyHighStandard",4),0);
		logger.info("House construction with FullyHighStandard material is calculated");
		logger.debug(mh.standardBase("FullyHighStandard",4));
		logger.warn("No warnings in calculating the FullyHighStandard material house construction cost");
		logger.error("No errors in calculating the FullyHighStandard material house construction cost");

	}

}
