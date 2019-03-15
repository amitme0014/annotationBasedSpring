/**
 * 
 */
package com.annospring.in.annotationBasedSpring;

import org.springframework.stereotype.Component;

/**
 * @author 212749463
 *
 */

@Component
public class Mediatek implements MobileProcessor {

	private int MediatekVesion;
	
	
	
	
	public Mediatek(int mediatekVesion) {
		super();
		this.MediatekVesion = mediatekVesion;
	}





	public int getMediatekVesion() {
		return MediatekVesion;
	}





	public void setMediatekVesion(int mediatekVesion) {
		MediatekVesion = mediatekVesion;
	}





	/* (non-Javadoc)
	 * @see com.annospring.in.annotationBasedSpring.MobileProcessor#configuration()
	 */
	@Override
	public void configuration() {
		// TODO Auto-generated method stub
		System.out.println("This is mediatek processor");

	}





	@Override
	public String toString() {
		return "Mediatek [MediatekVesion=" + MediatekVesion + ", getMediatekVesion()=" + getMediatekVesion()
				+ ", getClass()=" + getClass() + ", hashCode()=" + hashCode() + ", toString()=" + super.toString()
				+ "]";
	}
	
	

}
