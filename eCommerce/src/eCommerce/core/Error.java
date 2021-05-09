package eCommerce.core;

public class Error {
	private String errorMessage;
	private Boolean isError;
	
	public Error(Boolean isError, String errorMessage) {
		this.isError = isError;
		this.errorMessage = errorMessage;
	}
	
	public String getErrorMessage() {
		return errorMessage;
	}
	public Boolean getIsError() {
		return isError;
	}
	
	

}
