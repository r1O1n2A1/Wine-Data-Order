package fr.afcepf.atod.wine.data.order.test;

import org.apache.log4j.Logger;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import fr.afcepf.atod.wine.data.order.api.IDaoOrder;
import fr.afcepf.atod.wine.entity.Order;

/**
 * Test class for the database access of a {@link Order} 
 * @author ronan
 *
 */
@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(locations = "classpath*:/springDataTest.xml")
public class TestDaoOrder {
	private static Logger logger = Logger.getLogger(TestDaoOrder.class);
	@Autowired
	private IDaoOrder daoOrder;
	private Or
	
}
