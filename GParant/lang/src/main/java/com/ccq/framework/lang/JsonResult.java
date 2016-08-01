/**
 *  @author xiaoliu
 */

package com.ccq.framework.lang;

import java.io.Serializable;

public class JsonResult implements Serializable{

	private static final long serialVersionUID = 8324599203636896151L;

	//״̬��־
	private boolean success;
	//��Ϣ
	private String message;
	//������
	private String code;
	//object
	private Object object;
	//������
	private String serviceCode;
	
	
	public JsonResult() {
		super();
		// TODO Auto-generated constructor stub
	}

	/**
	 *  ���죨���ر�־��������Ϣ��
	 * 
	 * @param success
	 * @param message
	 */
	public JsonResult(boolean success, String message) {
		super();
		this.success = success;
		this.message = message;
	}
	
	/**
	 * ���죨���ر�־����Ϣ�����룩
	 * 
	 * @param success
	 * @param message
	 * @param code
	 */
	public JsonResult(boolean success, String message, String code) {
		super();
		this.success = success;
		this.message = message;
		this.code = code;
	}

	/**
	 * ���죨���ر�־����Ϣ�������롢���󡢷����룩
	 *  
	 * @param success
	 * @param message
	 * @param code
	 * @param object
	 * @param serviceCode
	 */
	public JsonResult(boolean success, String message, String code, Object object, String serviceCode) {
		super();
		this.success = success;
		this.message = message;
		this.code = code;
		this.object = object;
		this.serviceCode = serviceCode;
	}
	
	/**
	 * ���óɹ�
	 * 
	 * @param message
	 */
	public void success(String message) {
		setSuccess(true);
		setMessage(message);
	}
	
	/**
	 * ���óɹ�
	 * 
	 * @param message
	 */
	public void success(String message,String code) {
		setSuccess(true);
		setMessage(message);
		setCode(code);
	}
	
	/**
	 * ���óɹ�
	 * 
	 * @param message
	 */
	public void success(String message,String code,Object obj) {
		setSuccess(true);
		setMessage(message);
		setCode(code);
		setObject(obj);
	}
	
	/**
	 * ���� 
	 * @param message
	 */
	public void error(String message) {
		setSuccess(false);
		setMessage(message);
	}
	
	public void error(String message,String code) {
		setSuccess(false);
		setMessage(message);
		setCode(code);
	}
	
	public void error(String message,String code,Object obj) {
		setSuccess(false);
		setCode(code);
		setObject(obj);
	}
	
	public boolean isSuccess() {
		return success;
	}
	public void setSuccess(boolean success) {
		this.success = success;
	}
	public String getMessage() {
		return message;
	}
	public void setMessage(String message) {
		this.message = message;
	}
	public String getCode() {
		return code;
	}
	public void setCode(String code) {
		this.code = code;
	}
	public Object getObject() {
		return object;
	}
	public void setObject(Object object) {
		this.object = object;
	}
	public String getServiceCode() {
		return serviceCode;
	}
	public void setServiceCode(String serviceCode) {
		this.serviceCode = serviceCode;
	}
}
