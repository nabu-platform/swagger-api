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

import java.util.List;
import java.util.Map;

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
	public Map<String, Object> getExtensions();
}
