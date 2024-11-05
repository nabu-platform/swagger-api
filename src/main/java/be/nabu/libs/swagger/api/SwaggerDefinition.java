package be.nabu.libs.swagger.api;

import java.util.ArrayList;
import java.util.List;

import be.nabu.libs.artifacts.api.Artifact;
import be.nabu.libs.types.api.TypeRegistry;

// https://github.com/OAI/OpenAPI-Specification/blob/master/versions/2.0.md
// example: https://github.com/OAI/OpenAPI-Specification/blob/master/examples/v2.0/json/petstore.json
public interface SwaggerDefinition extends Artifact {
	// returns "swagger" or "openapi" or...
	public String getDefinitionType();
	// the version of swagger you are using
	public String getVersion();
	// metadata about the api
	public SwaggerInfo getInfo();
	// the host serving the api (no scheme or subpaths, can include port)
	public String getHost();
	// base path where the api is hosted on the server, must start with "/"
	public String getBasePath();
	// the schemes that are supported: http, https, ws, wss
	public List<String> getSchemes();
	// the mime types that are supported for consumption, see https://github.com/OAI/OpenAPI-Specification/blob/master/versions/2.0.md#mimeTypes for list
	public List<String> getConsumes();
	// the mime types supported for generation
	public List<String> getProduces();
	// the paths on the server
	public List<SwaggerPath> getPaths();
	// get the types
	public TypeRegistry getRegistry();
	// security definitions for this swagger file
	public List<SwaggerSecurityDefinition> getSecurityDefinitions();
	// get the global security definitions
	public List<SwaggerSecuritySetting> getGlobalSecurity();
	
	// a list of the global tag documentation
	public default List<SwaggerTag> getTags() {
		return new ArrayList<SwaggerTag>();
	}
}
