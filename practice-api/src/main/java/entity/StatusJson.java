package entity;

import java.io.Serializable;

public class StatusJson implements Serializable{

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	public String status;
	public String value;
	public String getStatus() {
		return status;
	}
	public void setStatus(String status) {
		this.status = status;
	}
	public String getValue() {
		return value;
	}
	public void setValue(String value) {
		this.value = value;
	}
	
}
