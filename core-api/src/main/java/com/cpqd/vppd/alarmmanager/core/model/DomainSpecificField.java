package com.cpqd.vppd.alarmmanager.core.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.dataformat.xml.annotation.JacksonXmlProperty;
import com.fasterxml.jackson.dataformat.xml.annotation.JacksonXmlText;

import javax.persistence.Transient;
import javax.validation.constraints.NotNull;

/**
 * Created by fabio on 15/12/14.
 */
public class DomainSpecificField {
    @JacksonXmlText
    private String name;

    @JacksonXmlProperty(isAttribute = true)
    private String type;

    public DomainSpecificField() {

    }

    public DomainSpecificField(String name, String type) {
        this.name = name;
        this.type = type;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        DomainSpecificField that = (DomainSpecificField) o;

        if (!name.equals(that.name)) return false;

        return true;
    }

    @Override
    public int hashCode() {
        return name.hashCode();
    }
}
