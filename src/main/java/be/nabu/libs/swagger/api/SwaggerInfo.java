package be.nabu.libs.swagger.api;

public interface SwaggerInfo {
	public String getTitle();
	public String getDescription();
	public String getTermsOfService();
	public SwaggerContact getContact();
	public SwaggerLicense getLicense();
	public String getVersion();
}
