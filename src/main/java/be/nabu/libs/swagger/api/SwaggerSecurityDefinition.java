package be.nabu.libs.swagger.api;

import java.util.Map;

import be.nabu.libs.swagger.api.SwaggerParameter.ParameterLocation;

public interface SwaggerSecurityDefinition {
	
	// the name of the security definition
	public String getName();
	
	public SecurityType getType();
	public String getDescription();
	
	// the name of the field in the query or header that the apikey should be in
	public String getFieldName();
	// can only be query or header
	public ParameterLocation getLocation();
	
	public OAuth2Flow getFlow();
	// the authorization url that should be used for this flow
	public String getAuthorizationUrl();
	// the token url used for this flow
	public String getTokenUrl();
	// available security scopes for the oauth2 flow
	public Map<String, String> getScopes();
	
	public enum SecurityType {
		basic,
		apiKey,
		oauth2
	}
	
	public enum OAuth2Flow {
		implicit,
		password,
		application,
		accessCode
	}
}
