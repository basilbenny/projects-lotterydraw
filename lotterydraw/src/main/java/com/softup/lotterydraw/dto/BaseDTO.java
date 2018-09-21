package com.softup.lotterydraw.dto;

import java.io.Serializable;

import com.softup.lotterydraw.enums.Status;

/**
 * @author BASIL
 * @version 0.1
 * @date 20-09-18
 * 
 * */
public class BaseDTO implements Serializable{

	/**
	 * 
	 */
	private static final long serialVersionUID = 2234662232546952029L;
	
	private Status status;
	private Integer errorCode = 0;
	private Object content;

	public Status getStatus() {
		return status;
	}
	public void setStatus(Status status) {
		this.status = status;
	}
	public Integer getErrorCode() {
		return errorCode;
	}
	public void setErrorCode(Integer errorCode) {
		this.errorCode = errorCode;
	}
	public Object getContent() {
		return content;
	}
	public void setContent(Object content) {
		this.content = content;
	}
	

}
