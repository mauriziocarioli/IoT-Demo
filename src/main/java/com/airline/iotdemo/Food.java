package com.airline.iotdemo;

/**
 * This class was automatically generated by the data modeler tool.
 */

public class Food implements java.io.Serializable {

	static final long serialVersionUID = 1L;

	@org.kie.api.definition.type.Description(value = "Type of food.")
	@org.kie.api.definition.type.Label(value = "Type")
	private java.lang.String type;

	public Food() {
	}

	public java.lang.String getType() {
		return this.type;
	}

	public void setType(java.lang.String type) {
		this.type = type;
	}

	public Food(java.lang.String type) {
		this.type = type;
	}

}