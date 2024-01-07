/**
 * 
 */
package com.jk.bulk.config;

import javax.batch.api.chunk.ItemProcessor;

import com.jk.bulk.model.Product;

/**
 * @author Junaid Khan
 *
 */
public class CustomItemProcessor implements ItemProcessor<Product,Product> {

	@Override
	public Product processItem(Product item) throws Exception {
		// TODO Auto-generated method stub
		
		int discountPr = Integer.parseInt(item.getDiscount()));
		double originalPrice = Double.parseDouble(item.getPrice());
		double discount = (discountPr/100)*originalPrice;
		double finalPrice = originalPrice - discount;
		item.setDiscountedPrice(String.valueOf(finalPrice));
		return item;
	}

}
