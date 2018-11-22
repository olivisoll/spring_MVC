
package es.olitraining.weather.weather;

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
    "humidity",
    "pressure",
    "rising",
    "visibility"
})
public class Atmosphere {

    @JsonProperty("humidity")
    private String humidity;
    @JsonProperty("pressure")
    private String pressure;
    @JsonProperty("rising")
    private String rising;
    @JsonProperty("visibility")
    private String visibility;
    @JsonIgnore
    private Map<String, Object> additionalProperties = new HashMap<String, Object>();

    @JsonProperty("humidity")
    public String getHumidity() {
        return humidity;
    }

    @JsonProperty("humidity")
    public void setHumidity(String humidity) {
        this.humidity = humidity;
    }

    @JsonProperty("pressure")
    public String getPressure() {
        return pressure;
    }

    @JsonProperty("pressure")
    public void setPressure(String pressure) {
        this.pressure = pressure;
    }

    @JsonProperty("rising")
    public String getRising() {
        return rising;
    }

    @JsonProperty("rising")
    public void setRising(String rising) {
        this.rising = rising;
    }

    @JsonProperty("visibility")
    public String getVisibility() {
        return visibility;
    }

    @JsonProperty("visibility")
    public void setVisibility(String visibility) {
        this.visibility = visibility;
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
        return new ToStringBuilder(this).append("humidity", humidity).append("pressure", pressure).append("rising", rising).append("visibility", visibility).append("additionalProperties", additionalProperties).toString();
    }

    @Override
    public int hashCode() {
        return new HashCodeBuilder().append(humidity).append(pressure).append(rising).append(additionalProperties).append(visibility).toHashCode();
    }

    @Override
    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if ((other instanceof Atmosphere) == false) {
            return false;
        }
        Atmosphere rhs = ((Atmosphere) other);
        return new EqualsBuilder().append(humidity, rhs.humidity).append(pressure, rhs.pressure).append(rising, rhs.rising).append(additionalProperties, rhs.additionalProperties).append(visibility, rhs.visibility).isEquals();
    }

}
