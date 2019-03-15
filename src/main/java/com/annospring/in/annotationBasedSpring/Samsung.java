package com.annospring.in.annotationBasedSpring;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

@Component
public class Samsung {
	
	private String modelName;
	@Autowired
	@Qualifier("mediatek")
	private MobileProcessor random;
	@Autowired
	private Mediatek mediatek;
	@Autowired
	private Snapdragon snapdragon;
	
	
	public Samsung(String modelName) {
		super();
		this.modelName = modelName;
	}
	public String getModelName() {
		return modelName;
	}
	public void setModelName(String modelName) {
		this.modelName = modelName;
	}
	public MobileProcessor getRandom() {
		return random;
	}
	public void setRandom(MobileProcessor random) {
		this.random = random;
	}
	public Mediatek getMediatek() {
		return mediatek;
	}
	public void setMediatek(Mediatek mediatek) {
		this.mediatek = mediatek;
	}
	public Snapdragon getSnapdragon() {
		return snapdragon;
	}
	public void setSnapdragon(Snapdragon snapdragon) {
		this.snapdragon = snapdragon;
	}
	@Override
	public String toString() {
		return "Samsung [modelName=" + modelName + ", random=" + random + ", mediatek=" + mediatek + ", snapdragon="
				+ snapdragon + ", getModelName()=" + getModelName() + ", getRandom()=" + getRandom()
				+ ", getMediatek()=" + getMediatek() + ", getSnapdragon()=" + getSnapdragon() + ", getClass()="
				+ getClass() + ", hashCode()=" + hashCode() + ", toString()=" + super.toString() + "]";
	}
	
	

	
	
	
	

}
