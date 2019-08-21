package com.airline.iotdemo;

/**
 * This class was automatically generated by the data modeler tool.
 */

@org.kie.api.definition.type.Label("Cart")
@org.kie.api.definition.type.Description("A food cart")
public class Cart implements java.io.Serializable {

	static final long serialVersionUID = 1L;

	@org.kie.api.definition.type.Label("Trays")
	@org.kie.api.definition.type.Description("Collection of food trays in the food cart")
	private java.util.List<com.airline.iotdemo.Tray> trays;

	@org.kie.api.definition.type.Label("Type")
	@org.kie.api.definition.type.Description("Type of cart.")
	private java.lang.String type;

	@org.kie.api.definition.type.Label("Latitude")
	private java.lang.String latitude;

	@org.kie.api.definition.type.Label("Longitude")
	private java.lang.String longitude;

	@org.kie.api.definition.type.Label("Temperature")
	private java.lang.Double temperature;

	@org.kie.api.definition.type.Description(value = "Cart ID")
	@org.kie.api.definition.type.Label(value = "id")
	private java.lang.String id;

	public Cart() {
	}

	public java.util.List<com.airline.iotdemo.Tray> getTrays() {
		return this.trays;
	}

	public void setTrays(java.util.List<com.airline.iotdemo.Tray> trays) {
		this.trays = trays;
	}

	public java.lang.String getType() {
		return this.type;
	}

	public void setType(java.lang.String type) {
		this.type = type;
	}

	public java.lang.String getLatitude() {
		return this.latitude;
	}

	public void setLatitude(java.lang.String latitude) {
		this.latitude = latitude;
	}

	public java.lang.String getLongitude() {
		return this.longitude;
	}

	public void setLongitude(java.lang.String longitude) {
		this.longitude = longitude;
	}

	public java.lang.Double getTemperature() {
		return this.temperature;
	}

	public void setTemperature(java.lang.Double temperature) {
		this.temperature = temperature;
	}

	public java.lang.String getId() {
		return this.id;
	}

	public void setId(java.lang.String id) {
		this.id = id;
	}

	public Cart(java.util.List<com.airline.iotdemo.Tray> trays,
			java.lang.String type, java.lang.String latitude,
			java.lang.String longitude, java.lang.Double temperature,
			java.lang.String id) {
		this.trays = trays;
		this.type = type;
		this.latitude = latitude;
		this.longitude = longitude;
		this.temperature = temperature;
		this.id = id;
	}

}