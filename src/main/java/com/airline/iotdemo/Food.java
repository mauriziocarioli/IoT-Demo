package com.airline.iotdemo;

import org.kie.api.definition.type.Label;
import org.kie.api.definition.type.Description;

import java.io.Serializable;

/**
 * This class was automatically generated by the data modeler tool.
 */

@Label("FOODCONTAINER")
@Description("Food Container")
public class Food implements Serializable {

	static final long serialVersionUID = 1L;

	@Label("RFIDTYPE")
	@Description("Food type RFID.")
	private String type;

	@Description("Food RFID.")
	@Label("RFID")
	private String rfid;

	@Description(value = "Food name.")
	private java.lang.String name;

	@Label("STATUS")
	@Description("Food Status")
	private Integer status;


	public Food() {
	}

	public String getType() {
		return this.type;
	}

	public void setType(String type) {
		this.type = type;
	}

	public String getRfid() {
		return this.rfid;
	}

	public void setRfid(String rfid) {
		this.rfid = rfid;
	}

	public String getName() {
		return this.name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public Integer getStatus() {
		return this.status;
	}

	public void setStatus(Integer status) {
		this.status = status;
	}

	public Food(String type, String rfid, String name, String status) {
		this.type = type;
		this.rfid = rfid;
		this.name = name;
		this.status = status;
	}

}
