package be.nabu.libs.swagger.api;

import java.util.List;

import be.nabu.libs.types.api.Element;

public interface SwaggerRequest {
	public List<String> getConsumes();
	public Element<?> getElement();
	public String getDescription();
	public boolean isRequired();
}
