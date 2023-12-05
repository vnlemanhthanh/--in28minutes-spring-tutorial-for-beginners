/*
 * Copyright (c) 2023. vnlemanhthanh.com
 */

package com.vnlemanhthanh.spring.basics.componentscan;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
//@Scope(ConfigurableBeanFactory.SCOPE_PROTOTYPE)
public class ComponentDAO {
    @Autowired
    ComponentJdbcConnection jdbcConnection;

    public ComponentJdbcConnection getComponentJdbcConnection() {
        //System.out.println(this + " getJdbcConnection()");
        return jdbcConnection;
    }

    public void setComponentJdbcConnection(ComponentJdbcConnection jdbcConnection) {
        this.jdbcConnection = jdbcConnection;
    }
}
