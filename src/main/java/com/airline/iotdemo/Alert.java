package com.airline.iotdemo;

import org.kie.api.definition.type.Label;
import org.kie.api.definition.type.Description;

import java.io.Serializable;

/**
 * This class was automatically generated by the data modeler tool.
 */

@Label("ALERT_DETAILS")
@Description("Alert Details")
public class Alert implements Serializable {

	static final long serialVersionUID = 1L;

	@Description(value = "Time of the alert.")
	@Label(value = "ALERT_TIME")
	private Long timestamp;
	@Description(value = "Type of the alert.")
	@Label(value = "ALERT_TYPE")
	private String type;
	@Description(value = "Severity of the alert.")
	@Label(value = "ALERT_SEVERITY")
	private String severity;
	@Description(value = "Source of the alert.")
	@Label(value = "ALERT_SOURCE")
	private String source;
	@Description(value = "Latitude of the geolocation of the alert.")
	@Label(value = "ALERT_LOCLATITUDE")
	private Double latitude;
	@Description(value = "Longitude of the geolocation of the alert.")
	@Label(value = "ALERT_LOCLONGITUDE")
	private Double longitude;
	@Description(value = "Status of the alert.")
	@Label(value = "ALERT_STATUS")
	private String status;
	@Description(value = "Text of the alert.")
	@Label(value = "ALERT_TEXT")
	private String text;

	public Alert() {
	}

	public Long getTimestamp() {
		return this.timestamp;
	}

	public void setTimestamp(Long timestamp) {
		this.timestamp = timestamp;
	}

	public String getType() {
		return this.type;
	}

	public void setType(String type) {
		this.type = type;
	}

	public String getSeverity() {
		return this.severity;
	}

	public void setSeverity(String severity) {
		this.severity = severity;
	}

	public String getSource() {
		return this.source;
	}

	public void setSource(String source) {
		this.source = source;
	}

	public Double getLatitude() {
		return this.latitude;
	}

	public void setLatitude(Double latitude) {
		this.latitude = latitude;
	}

	public Double getLongitude() {
		return this.longitude;
	}

	public void setLongitude(Double longitude) {
		this.longitude = longitude;
	}

	public String getStatus() {
		return this.status;
	}

	public void setStatus(String status) {
		this.status = status;
	}

	public String getText() {
		return this.text;
	}

	public void setText(String text) {
		this.text = text;
	}

	public Alert(Long timestamp, String type,
			String severity, String source,
			Double latitude, Double longitude,
			String status, String text) {
		this.timestamp = timestamp;
		this.type = type;
		this.severity = severity;
		this.source = source;
		this.latitude = latitude;
		this.longitude = longitude;
		this.status = status;
		this.text = text;
	}

}