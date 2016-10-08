package be.nabu.libs.swagger.api;

import java.util.List;

import be.nabu.libs.types.api.Element;

public interface SwaggerResponse {
	public Integer getCode();
	public String getDescription();
	public Element<?> getElement();
	public List<SwaggerParameter> getHeaders();
}
