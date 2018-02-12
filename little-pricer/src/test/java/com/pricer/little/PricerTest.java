/**
 * 
 */
package com.pricer.little;

import org.junit.Assert;
import org.junit.Test;

import com.pricer.audit.AuditException;
import com.pricer.product.ProductType;
import com.pricer.scheme.ProductNotSupportedException;

/**
 * @author fangbe
 *
 */
public class PricerTest {
	
	/**
	 * 
	 */
	@Test
	public void testGestPriceForBeanCan(){
		Pricer pricer = new SimplePricer();
		try {
			double price = pricer.getPrice(ProductType.BeansCan, 2);
			Assert.assertEquals(2 * 0.65, price, 0);
		} catch (ProductNotSupportedException | AuditException e) {
			Assert.fail(e.getMessage());
		}
	}
	
	/**
	 * 
	 */
	@Test
	public void testGestPriceForTreeInGross(){
		Pricer pricer = new SimplePricer();
		try {
			double price = pricer.getPrice(ProductType.TreeInGross, 4);
			Assert.assertEquals(4d / 3, price, 0);
		} catch (ProductNotSupportedException | AuditException e) {
			Assert.fail(e.getMessage());
		}
	}
	
	/**
	 * 
	 */
	@Test
	public void testGestPriceForPound(){
		Pricer pricer = new SimplePricer();
		try {
			double price = pricer.getPrice(ProductType.Pound, 0.25);
			Assert.assertEquals(1.99 * 0.25, price, 0);
		} catch (ProductNotSupportedException | AuditException e) {
			Assert.fail(e.getMessage());
		}
	}
	
	/**
	 * 
	 */
	@Test
	public void testGestPriceForTwoAndOneFree(){
		Pricer pricer = new SimplePricer();
		try {
			double price = pricer.getPrice(ProductType.TwoAndOneFree, 4);
			Assert.assertEquals(0.5 * 2 + 0.5, price, 0);
		} catch (ProductNotSupportedException | AuditException e) {
			Assert.fail(e.getMessage());
		}
	}

}
