/**
 * 
 */
package com.jk.bulk.config;

import org.springframework.batch.item.ItemProcessor;

import com.jk.bulk.model.Product;

/**
 * @author Junaid Khan
 *
 */
public class CustomItemProcessor implements ItemProcessor<Product,Product> {


	@Override
	public Product process(Product item) throws Exception {
		
//		int discountPr = Integer.parseInt(item.getDiscount().trim());
//		double originalPrice = Double.parseDouble(item.getPrice().trim());
//		double discount = (discountPr/100)*originalPrice;
//		double finalPrice = originalPrice - discount;
//		item.setDiscountedPrice(String.valueOf(finalPrice));
//		return item;
		return null;
	}

}
