package be.nabu.libs.swagger.api;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

@Retention(RetentionPolicy.RUNTIME)
@Target(ElementType.METHOD)
public @interface Version {
	// the major version it is active from
	public int major() default 2;
	// the minor version it is active from
	public int minor() default 0;
	// the patch version
	public int patch() default 0;
}
