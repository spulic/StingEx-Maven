package StringExamples.interfaces;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

/** 
 * Element annotated with NotNull claims <code>null</code> value is <em>forbidden</em>
 * for it to hold
 */

@Retention(RetentionPolicy.RUNTIME)
@Target({ElementType.METHOD, ElementType.FIELD, ElementType.PARAMETER, ElementType.LOCAL_VARIABLE, ElementType.CONSTRUCTOR})
public @interface NotNull {
	/**
	  * @return unknown
	  */
	String value() default "";
	
	/**
	 * @return the message if this field is null
	 */
	String message() default "must not be null";
}
