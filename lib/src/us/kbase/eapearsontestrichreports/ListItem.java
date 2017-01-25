
package us.kbase.eapearsontestrichreports;

import java.util.HashMap;
import java.util.Map;
import javax.annotation.Generated;
import com.fasterxml.jackson.annotation.JsonAnyGetter;
import com.fasterxml.jackson.annotation.JsonAnySetter;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;


/**
 * <p>Original spec-file type: ListItem</p>
 * 
 * 
 */
@JsonInclude(JsonInclude.Include.NON_NULL)
@Generated("com.googlecode.jsonschema2pojo")
@JsonPropertyOrder({
    "shock_id",
    "index_name",
    "label",
    "description"
})
public class ListItem {

    @JsonProperty("shock_id")
    private String shockId;
    @JsonProperty("index_name")
    private String indexName;
    @JsonProperty("label")
    private String label;
    @JsonProperty("description")
    private String description;
    private Map<String, Object> additionalProperties = new HashMap<String, Object>();

    @JsonProperty("shock_id")
    public String getShockId() {
        return shockId;
    }

    @JsonProperty("shock_id")
    public void setShockId(String shockId) {
        this.shockId = shockId;
    }

    public ListItem withShockId(String shockId) {
        this.shockId = shockId;
        return this;
    }

    @JsonProperty("index_name")
    public String getIndexName() {
        return indexName;
    }

    @JsonProperty("index_name")
    public void setIndexName(String indexName) {
        this.indexName = indexName;
    }

    public ListItem withIndexName(String indexName) {
        this.indexName = indexName;
        return this;
    }

    @JsonProperty("label")
    public String getLabel() {
        return label;
    }

    @JsonProperty("label")
    public void setLabel(String label) {
        this.label = label;
    }

    public ListItem withLabel(String label) {
        this.label = label;
        return this;
    }

    @JsonProperty("description")
    public String getDescription() {
        return description;
    }

    @JsonProperty("description")
    public void setDescription(String description) {
        this.description = description;
    }

    public ListItem withDescription(String description) {
        this.description = description;
        return this;
    }

    @JsonAnyGetter
    public Map<String, Object> getAdditionalProperties() {
        return this.additionalProperties;
    }

    @JsonAnySetter
    public void setAdditionalProperties(String name, Object value) {
        this.additionalProperties.put(name, value);
    }

    @Override
    public String toString() {
        return ((((((((((("ListItem"+" [shockId=")+ shockId)+", indexName=")+ indexName)+", label=")+ label)+", description=")+ description)+", additionalProperties=")+ additionalProperties)+"]");
    }

}
