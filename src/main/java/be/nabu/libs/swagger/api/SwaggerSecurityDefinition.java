/*
* Copyright (C) 2016 Alexander Verbruggen
*
* This program is free software: you can redistribute it and/or modify
* it under the terms of the GNU Lesser General Public License as published by
* the Free Software Foundation, either version 3 of the License, or
* (at your option) any later version.
*
* This program is distributed in the hope that it will be useful,
* but WITHOUT ANY WARRANTY; without even the implied warranty of
* MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE. See the
* GNU Lesser General Public License for more details.
*
* You should have received a copy of the GNU Lesser General Public License
* along with this program. If not, see <https://www.gnu.org/licenses/>.
*/

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
		oauth2,
		bearer
	}
	
	public enum OAuth2Flow {
		implicit,
		password,
		application,
		accessCode
	}
}
