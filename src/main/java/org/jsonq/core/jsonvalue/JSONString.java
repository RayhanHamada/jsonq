package org.jsonq.core.jsonvalue;

import java.util.Objects;

public class JSONString extends JSONValue {

    private String value;

    public JSONString(String value)
    {
        this.value = value;
    }

    public String getValue()
    {
        if (this.value == null) return null;
        return value;
    }

    public String getLiteralValue()
    {
        if (this.value == null) return null;
        return value.substring(1, value.length()-1);
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof JSONString)) return false;
        JSONString that = (JSONString) o;
        return Objects.equals(value, that.value);
    }

    @Override
    public int hashCode() {
        return Objects.hash(value);
    }
}
