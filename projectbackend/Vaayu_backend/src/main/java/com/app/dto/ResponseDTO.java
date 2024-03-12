package com.app.dto;

public class ResponseDTO<T> {
private String status;
private T data;
private String jwt;
public ResponseDTO() {
	// TODO Auto-generated constructor stub
}
public ResponseDTO(String status, T data, String token) {
	super();
	this.status = status;
	this.data = data;
	this.jwt=token;
}
public ResponseDTO(String status, T data) {
	super();
	this.status = status;
	this.data = data;;
}
public String getStatus() {
	return status;
}
public void setStatus(String status) {
	this.status = status;
}
public T getData() {
	return data;
}
public void setData(T data) {
	this.data = data;
}
public String getJwt() {
	return jwt;
}
public void setJwt(String tocken) {
	this.jwt = tocken;
}

@Override
public String toString() {
	return "ResponseDTO [status=" + status + ", data=" + data + "]";
}

}
