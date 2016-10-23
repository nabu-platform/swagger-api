package be.nabu.libs.swagger.api;

import be.nabu.libs.types.api.Element;

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
	
	public enum CollectionFormat {
		CSV(','),
		SSV(' '),
		TSV('\t'),
		PIPES('|'),
		MULTI('&')
		;
		private char character;

		private CollectionFormat(char character) {
			this.character = character;
		}
		public char getCharacter() {
			return character;
		}
		@Override
		public String toString() {
			return super.toString().toLowerCase();
		}
	}
	
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
