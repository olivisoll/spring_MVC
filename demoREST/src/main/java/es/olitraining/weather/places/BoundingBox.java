
package es.olitraining.weather.places;

import java.util.HashMap;
import java.util.Map;
import com.fasterxml.jackson.annotation.JsonAnyGetter;
import com.fasterxml.jackson.annotation.JsonAnySetter;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import org.apache.commons.lang.builder.EqualsBuilder;
import org.apache.commons.lang.builder.HashCodeBuilder;
import org.apache.commons.lang.builder.ToStringBuilder;

@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({
    "southWest",
    "northEast"
})
public class BoundingBox {

    @JsonProperty("southWest")
    private SouthWest southWest;
    @JsonProperty("northEast")
    private NorthEast northEast;
    @JsonIgnore
    private Map<String, Object> additionalProperties = new HashMap<String, Object>();

    @JsonProperty("southWest")
    public SouthWest getSouthWest() {
        return southWest;
    }

    @JsonProperty("southWest")
    public void setSouthWest(SouthWest southWest) {
        this.southWest = southWest;
    }

    @JsonProperty("northEast")
    public NorthEast getNorthEast() {
        return northEast;
    }

    @JsonProperty("northEast")
    public void setNorthEast(NorthEast northEast) {
        this.northEast = northEast;
    }

    @JsonAnyGetter
    public Map<String, Object> getAdditionalProperties() {
        return this.additionalProperties;
    }

    @JsonAnySetter
    public void setAdditionalProperty(String name, Object value) {
        this.additionalProperties.put(name, value);
    }

    @Override
    public String toString() {
        return new ToStringBuilder(this).append("southWest", southWest).append("northEast", northEast).append("additionalProperties", additionalProperties).toString();
    }

    @Override
    public int hashCode() {
        return new HashCodeBuilder().append(southWest).append(additionalProperties).append(northEast).toHashCode();
    }

    @Override
    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if ((other instanceof BoundingBox) == false) {
            return false;
        }
        BoundingBox rhs = ((BoundingBox) other);
        return new EqualsBuilder().append(southWest, rhs.southWest).append(additionalProperties, rhs.additionalProperties).append(northEast, rhs.northEast).isEquals();
    }

}
