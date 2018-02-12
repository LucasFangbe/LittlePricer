/**
 * 
 */
package com.pricer.scheme;

/**
 * @author fangbe
 *
 */
@FunctionalInterface
public interface PricingScheme {

	/**
	 * 
	 * @param productCount
	 * @return
	 */
	double priceFor(double productCount);
}
