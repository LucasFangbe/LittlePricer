/**
 * 
 */
package com.pricer.scheme;

import com.pricer.audit.AuditException;
import com.pricer.product.ProductType;

/**
 * @author fangbe
 *
 */
public class PricingSchemeBuilder {
	
	private static final double BEANSCAN_PRICE = 0.65;
	private static final double TREE_IN_GROSS_PRICE = 1d / 3;
	private static final double POUND_PRICE = 1.99;
	private static final double TWO_AND_ONE_FREE_PRICE = 0.5;

	/**
	 * 
	 * @param productType
	 * @return
	 * @throws ProductNotSupportedException 
	 */
	public static PricingScheme getPricingScheme(ProductType productType) throws ProductNotSupportedException {
		switch(productType) {
		case BeansCan:
			return (c) -> BEANSCAN_PRICE * c;
		case TreeInGross:
			return (c) -> TREE_IN_GROSS_PRICE * c;
		case Pound:
			return (c) -> POUND_PRICE * c;
		case TwoAndOneFree:
			return (c) -> getPriceForTwoAndOneFree(productType, c);
		default:
		}
		throw new ProductNotSupportedException("The product: " + productType + " is not supported by the pricer");
	}
	
	/**
	 * 
	 * @param productType
	 * @param productCount
	 * @return
	 * @throws AuditException 
	 */
	private static double getPriceForTwoAndOneFree(ProductType productType, double productCount) {
		int count = (int)productCount / 3;
		int remaining = (int)productCount % 3;
		double result = TWO_AND_ONE_FREE_PRICE * (2 * count +  remaining);
		return result;
	}


}
