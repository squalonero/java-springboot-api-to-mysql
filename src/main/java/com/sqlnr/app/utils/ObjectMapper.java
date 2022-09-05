package com.sqlnr.app.utils;

import java.lang.reflect.Field;
import java.lang.reflect.Method;
import java.util.Objects;

import org.apache.commons.beanutils.BeanUtils;
import org.springframework.util.StringUtils;

public class ObjectMapper {

    public static Object mapNonEmptyFieldsToEntity(Object dtoObject, Object entityObject) throws Exception {
        // iterate over the object and get the properties
        for (final Field field : entityObject.getClass().getDeclaredFields()) {
            // get each propeerty name
            final String fieldName = field.getName();

            if (fieldName.equals("id")) {
                continue; // skip id updates
            }
            // assemble the getter method name
            final Method getter = dtoObject.getClass().getDeclaredMethod("get" + StringUtils.capitalize(fieldName));
            final Object fieldValue = getter.invoke(dtoObject); // invoke the method for the given instance

            if (Objects.nonNull(fieldValue) && !fieldValue.equals("") && !fieldValue.equals(0)) {
                BeanUtils.setProperty(entityObject, fieldName, fieldValue);
            }
        }

        return entityObject;
    }
}
