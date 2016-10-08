package be.nabu.libs.swagger.api;

import java.util.List;

public interface SwaggerSecuritySetting {
	public String getName();
	public List<String> getScopes();
}
