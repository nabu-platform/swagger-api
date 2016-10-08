package be.nabu.libs.swagger.api;

import java.util.List;

public interface SwaggerPath {
	public String getPath();
	public List<SwaggerMethod> getMethods();
}
