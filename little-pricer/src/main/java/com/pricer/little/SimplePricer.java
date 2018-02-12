/**
 * 
 */
package com.pricer.little;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import com.pricer.audit.AuditException;
import com.pricer.audit.AuditHelper;
import com.pricer.product.ProductType;
import com.pricer.scheme.PricingScheme;
import com.pricer.scheme.PricingSchemeBuilder;
import com.pricer.scheme.ProductNotSupportedException;

/**
 * @author fangbe
 *
 */
public class SimplePricer implements Pricer {
	
	private static Logger logger = LoggerFactory.getLogger(SimplePricer.class);

	/* (non-Javadoc)
	 * @see com.pricer.little.Pricer#getPrice(com.pricer.product.ProductType, int)
	 */
	@Override
	public double getPrice(ProductType productType, double productCount) throws ProductNotSupportedException, AuditException {
		logger.debug("Start Pricing");
		PricingScheme pricingScheme = PricingSchemeBuilder.getPricingScheme(productType);
		double result = pricingScheme.priceFor(productCount);
		logger.debug("End Pricing");
		
		String message = buildAuditMessage(productType, productCount, result);
		AuditHelper.addToAuditTrail(message);
		
		return result;
	}
	
	/**
	 * 
	 * @param productType
	 * @param productCount
	 * @param result
	 * @return
	 */
	private static String buildAuditMessage(ProductType productType, double productCount, double result) {
		String message = "Build Pricing Scheme for product: " + productType 
				+ ", productCount: " + productCount + " result: " + result;
		return message;
	}

}
