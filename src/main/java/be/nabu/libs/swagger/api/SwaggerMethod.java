package be.nabu.libs.swagger.api;

import java.util.List;

public interface SwaggerMethod {
	public String getMethod();
	public List<String> getTags();
	public String getSummary();
	public String getDescription();
	public SwaggerDocumentation getDocumentation();
	public String getOperationId();
	public List<String> getConsumes();
	public List<String> getProduces();
	public List<String> getSchemes();
	public List<SwaggerParameter> getParameters();
	public Boolean getDeprecated();
	public List<SwaggerResponse> getResponses();
	public List<SwaggerSecuritySetting> getSecurity();
}
