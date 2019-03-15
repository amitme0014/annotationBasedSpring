package com.annospring.in.annotationBasedSpring;

import org.springframework.stereotype.Component;

@Component
public class Snapdragon implements MobileProcessor {
	
	private int snapdragonVersion;
	

	public Snapdragon(int snapdragonVersion) {
		super();
		this.snapdragonVersion = snapdragonVersion;
	}



	public int getSnapdragonVersion() {
		return snapdragonVersion;
	}



	public void setSnapdragonVersion(int snapdragonVersion) {
		this.snapdragonVersion = snapdragonVersion;
	}



	public void configuration() {
		// TODO Auto-generated method stub
		System.out.println("Its a snapdragon processor");
		

	}



	@Override
	public String toString() {
		return "Snapdragon [snapdragonVersion=" + snapdragonVersion + ", getSnapdragonVersion()="
				+ getSnapdragonVersion() + ", getClass()=" + getClass() + ", hashCode()=" + hashCode() + ", toString()="
				+ super.toString() + "]";
	}
	
	

}
