
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
    "lang",
    "xmlns",
    "yahoo",
    "uri",
    "woeid",
    "placeTypeName",
    "name",
    "country",
    "admin1",
    "admin2",
    "admin3",
    "locality1",
    "locality2",
    "postal",
    "centroid",
    "boundingBox",
    "areaRank",
    "popRank",
    "timezone"
})
public class Place {

    @JsonProperty("lang")
    private String lang;
    @JsonProperty("xmlns")
    private String xmlns;
    @JsonProperty("yahoo")
    private String yahoo;
    @JsonProperty("uri")
    private String uri;
    @JsonProperty("woeid")
    private String woeid;
    @JsonProperty("placeTypeName")
    private PlaceTypeName placeTypeName;
    @JsonProperty("name")
    private String name;
    @JsonProperty("country")
    private Country country;
    @JsonProperty("admin1")
    private Admin1 admin1;
    @JsonProperty("admin2")
    private Admin2 admin2;
    @JsonProperty("admin3")
    private Object admin3;
    @JsonProperty("locality1")
    private Locality1 locality1;
    @JsonProperty("locality2")
    private Object locality2;
    @JsonProperty("postal")
    private Object postal;
    @JsonProperty("centroid")
    private Centroid centroid;
    @JsonProperty("boundingBox")
    private BoundingBox boundingBox;
    @JsonProperty("areaRank")
    private String areaRank;
    @JsonProperty("popRank")
    private String popRank;
    @JsonProperty("timezone")
    private Timezone timezone;
    @JsonIgnore
    private Map<String, Object> additionalProperties = new HashMap<String, Object>();

    @JsonProperty("lang")
    public String getLang() {
        return lang;
    }

    @JsonProperty("lang")
    public void setLang(String lang) {
        this.lang = lang;
    }

    @JsonProperty("xmlns")
    public String getXmlns() {
        return xmlns;
    }

    @JsonProperty("xmlns")
    public void setXmlns(String xmlns) {
        this.xmlns = xmlns;
    }

    @JsonProperty("yahoo")
    public String getYahoo() {
        return yahoo;
    }

    @JsonProperty("yahoo")
    public void setYahoo(String yahoo) {
        this.yahoo = yahoo;
    }

    @JsonProperty("uri")
    public String getUri() {
        return uri;
    }

    @JsonProperty("uri")
    public void setUri(String uri) {
        this.uri = uri;
    }

    @JsonProperty("woeid")
    public String getWoeid() {
        return woeid;
    }

    @JsonProperty("woeid")
    public void setWoeid(String woeid) {
        this.woeid = woeid;
    }

    @JsonProperty("placeTypeName")
    public PlaceTypeName getPlaceTypeName() {
        return placeTypeName;
    }

    @JsonProperty("placeTypeName")
    public void setPlaceTypeName(PlaceTypeName placeTypeName) {
        this.placeTypeName = placeTypeName;
    }

    @JsonProperty("name")
    public String getName() {
        return name;
    }

    @JsonProperty("name")
    public void setName(String name) {
        this.name = name;
    }

    @JsonProperty("country")
    public Country getCountry() {
        return country;
    }

    @JsonProperty("country")
    public void setCountry(Country country) {
        this.country = country;
    }

    @JsonProperty("admin1")
    public Admin1 getAdmin1() {
        return admin1;
    }

    @JsonProperty("admin1")
    public void setAdmin1(Admin1 admin1) {
        this.admin1 = admin1;
    }

    @JsonProperty("admin2")
    public Admin2 getAdmin2() {
        return admin2;
    }

    @JsonProperty("admin2")
    public void setAdmin2(Admin2 admin2) {
        this.admin2 = admin2;
    }

    @JsonProperty("admin3")
    public Object getAdmin3() {
        return admin3;
    }

    @JsonProperty("admin3")
    public void setAdmin3(Object admin3) {
        this.admin3 = admin3;
    }

    @JsonProperty("locality1")
    public Locality1 getLocality1() {
        return locality1;
    }

    @JsonProperty("locality1")
    public void setLocality1(Locality1 locality1) {
        this.locality1 = locality1;
    }

    @JsonProperty("locality2")
    public Object getLocality2() {
        return locality2;
    }

    @JsonProperty("locality2")
    public void setLocality2(Object locality2) {
        this.locality2 = locality2;
    }

    @JsonProperty("postal")
    public Object getPostal() {
        return postal;
    }

    @JsonProperty("postal")
    public void setPostal(Object postal) {
        this.postal = postal;
    }

    @JsonProperty("centroid")
    public Centroid getCentroid() {
        return centroid;
    }

    @JsonProperty("centroid")
    public void setCentroid(Centroid centroid) {
        this.centroid = centroid;
    }

    @JsonProperty("boundingBox")
    public BoundingBox getBoundingBox() {
        return boundingBox;
    }

    @JsonProperty("boundingBox")
    public void setBoundingBox(BoundingBox boundingBox) {
        this.boundingBox = boundingBox;
    }

    @JsonProperty("areaRank")
    public String getAreaRank() {
        return areaRank;
    }

    @JsonProperty("areaRank")
    public void setAreaRank(String areaRank) {
        this.areaRank = areaRank;
    }

    @JsonProperty("popRank")
    public String getPopRank() {
        return popRank;
    }

    @JsonProperty("popRank")
    public void setPopRank(String popRank) {
        this.popRank = popRank;
    }

    @JsonProperty("timezone")
    public Timezone getTimezone() {
        return timezone;
    }

    @JsonProperty("timezone")
    public void setTimezone(Timezone timezone) {
        this.timezone = timezone;
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
        return new ToStringBuilder(this).append("lang", lang).append("xmlns", xmlns).append("yahoo", yahoo).append("uri", uri).append("woeid", woeid).append("placeTypeName", placeTypeName).append("name", name).append("country", country).append("admin1", admin1).append("admin2", admin2).append("admin3", admin3).append("locality1", locality1).append("locality2", locality2).append("postal", postal).append("centroid", centroid).append("boundingBox", boundingBox).append("areaRank", areaRank).append("popRank", popRank).append("timezone", timezone).append("additionalProperties", additionalProperties).toString();
    }

    @Override
    public int hashCode() {
        return new HashCodeBuilder().append(country).append(boundingBox).append(timezone).append(woeid).append(popRank).append(uri).append(xmlns).append(yahoo).append(placeTypeName).append(centroid).append(areaRank).append(name).append(admin1).append(admin2).append(postal).append(additionalProperties).append(lang).append(locality2).append(locality1).append(admin3).toHashCode();
    }

    @Override
    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if ((other instanceof Place) == false) {
            return false;
        }
        Place rhs = ((Place) other);
        return new EqualsBuilder().append(country, rhs.country).append(boundingBox, rhs.boundingBox).append(timezone, rhs.timezone).append(woeid, rhs.woeid).append(popRank, rhs.popRank).append(uri, rhs.uri).append(xmlns, rhs.xmlns).append(yahoo, rhs.yahoo).append(placeTypeName, rhs.placeTypeName).append(centroid, rhs.centroid).append(areaRank, rhs.areaRank).append(name, rhs.name).append(admin1, rhs.admin1).append(admin2, rhs.admin2).append(postal, rhs.postal).append(additionalProperties, rhs.additionalProperties).append(lang, rhs.lang).append(locality2, rhs.locality2).append(locality1, rhs.locality1).append(admin3, rhs.admin3).isEquals();
    }

}
