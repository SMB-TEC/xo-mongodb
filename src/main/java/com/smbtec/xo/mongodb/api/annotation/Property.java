package com.smbtec.xo.mongodb.api.annotation;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

/**
 * Defines a primitive property of a node.
 * <p>
 * Must be used on get methods of primitives and enumerations and allows
 * overriding the name of the node property.
 * </p>
 *
 * @author Lars Martin - lars.martin@smb-tec.com
 *
 */
@Retention(RetentionPolicy.RUNTIME)
@Target(ElementType.METHOD)
public @interface Property {

	/**
	 * @return The name of the node property.
	 */
	String value();
}
