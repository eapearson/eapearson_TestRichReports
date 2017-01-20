
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
 * <p>Original spec-file type: GenerateReportParams</p>
 * 
 * 
 */
@JsonInclude(JsonInclude.Include.NON_NULL)
@Generated("com.googlecode.jsonschema2pojo")
@JsonPropertyOrder({
    "direct_html",
    "summary_content"
})
public class GenerateReportParams {

    @JsonProperty("direct_html")
    private String directHtml;
    @JsonProperty("summary_content")
    private String summaryContent;
    private Map<String, Object> additionalProperties = new HashMap<String, Object>();

    @JsonProperty("direct_html")
    public String getDirectHtml() {
        return directHtml;
    }

    @JsonProperty("direct_html")
    public void setDirectHtml(String directHtml) {
        this.directHtml = directHtml;
    }

    public GenerateReportParams withDirectHtml(String directHtml) {
        this.directHtml = directHtml;
        return this;
    }

    @JsonProperty("summary_content")
    public String getSummaryContent() {
        return summaryContent;
    }

    @JsonProperty("summary_content")
    public void setSummaryContent(String summaryContent) {
        this.summaryContent = summaryContent;
    }

    public GenerateReportParams withSummaryContent(String summaryContent) {
        this.summaryContent = summaryContent;
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
        return ((((((("GenerateReportParams"+" [directHtml=")+ directHtml)+", summaryContent=")+ summaryContent)+", additionalProperties=")+ additionalProperties)+"]");
    }

}
