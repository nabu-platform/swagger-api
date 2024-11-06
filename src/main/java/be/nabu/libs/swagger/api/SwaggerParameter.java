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

import be.nabu.libs.types.api.Element;
import be.nabu.libs.types.base.CollectionFormat;

public interface SwaggerParameter {
	
	// the original name of the parameter
	public String getName();
	public Boolean getAllowEmptyValue();
	public Number getMultipleOf();
	public Boolean getUnique();
	public Object getDefaultValue();
	public ParameterLocation getLocation();
	public CollectionFormat getCollectionFormat();
	
	public Element<?> getElement();
	
	@Version(major = 3)
	public boolean isExplode();
	
	@Version(major = 3)
	public boolean isAllowReserved();
	
	@Version(major = 3)
	public String getDescription();
	
	public enum ParameterLocation {
		BODY,
		QUERY,
		PATH,
		HEADER,
		FORMDATA
		;
		@Override
		public String toString() {
			return super.toString().toLowerCase();
		}
	}
	
	public enum ParameterType {
		STRING(ParameterSubType.STRING, ParameterSubType.BYTE, ParameterSubType.BINARY, ParameterSubType.DATE, ParameterSubType.DATE_TIME, ParameterSubType.PASSWORD),
		NUMBER(ParameterSubType.FLOAT, ParameterSubType.DOUBLE),
		INTEGER(ParameterSubType.INT32, ParameterSubType.INT64),
		BOOLEAN,
		ARRAY,
		OBJECT
		;
		private ParameterSubType[] subtypes;
		private ParameterType(ParameterSubType...subtypes) {
			this.subtypes = subtypes;
		}
		@Override
		public String toString() {
			return super.toString().toLowerCase().replace('_', '-');
		}
		public ParameterSubType[] getSubtypes() {
			return subtypes;
		}
	}
	
	public enum ParameterSubType {
		INT32,
		INT64,
		FLOAT,
		DOUBLE,
		STRING,
		// base64 encoded characters
		BYTE,
		// actual binary
		BINARY,
		DATE,
		DATE_TIME,
		PASSWORD,
		BOOLEAN,
		
		// UNOFFICIAL
		// added for digipolis
		URI
		;
		@Override
		public String toString() {
			return super.toString().toLowerCase().replace('_', '-');
		}
	}
}
