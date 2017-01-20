
package us.kbase.eapearsontestrichreports;

import java.util.HashMap;
import java.util.List;
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
    "workspace",
    "direct_html",
    "message",
    "html_files"
})
public class GenerateReportParams {

    @JsonProperty("workspace")
    private java.lang.String workspace;
    @JsonProperty("direct_html")
    private java.lang.String directHtml;
    @JsonProperty("message")
    private java.lang.String message;
    @JsonProperty("html_files")
    private List<String> htmlFiles;
    private Map<java.lang.String, Object> additionalProperties = new HashMap<java.lang.String, Object>();

    @JsonProperty("workspace")
    public java.lang.String getWorkspace() {
        return workspace;
    }

    @JsonProperty("workspace")
    public void setWorkspace(java.lang.String workspace) {
        this.workspace = workspace;
    }

    public GenerateReportParams withWorkspace(java.lang.String workspace) {
        this.workspace = workspace;
        return this;
    }

    @JsonProperty("direct_html")
    public java.lang.String getDirectHtml() {
        return directHtml;
    }

    @JsonProperty("direct_html")
    public void setDirectHtml(java.lang.String directHtml) {
        this.directHtml = directHtml;
    }

    public GenerateReportParams withDirectHtml(java.lang.String directHtml) {
        this.directHtml = directHtml;
        return this;
    }

    @JsonProperty("message")
    public java.lang.String getMessage() {
        return message;
    }

    @JsonProperty("message")
    public void setMessage(java.lang.String message) {
        this.message = message;
    }

    public GenerateReportParams withMessage(java.lang.String message) {
        this.message = message;
        return this;
    }

    @JsonProperty("html_files")
    public List<String> getHtmlFiles() {
        return htmlFiles;
    }

    @JsonProperty("html_files")
    public void setHtmlFiles(List<String> htmlFiles) {
        this.htmlFiles = htmlFiles;
    }

    public GenerateReportParams withHtmlFiles(List<String> htmlFiles) {
        this.htmlFiles = htmlFiles;
        return this;
    }

    @JsonAnyGetter
    public Map<java.lang.String, Object> getAdditionalProperties() {
        return this.additionalProperties;
    }

    @JsonAnySetter
    public void setAdditionalProperties(java.lang.String name, Object value) {
        this.additionalProperties.put(name, value);
    }

    @Override
    public java.lang.String toString() {
        return ((((((((((("GenerateReportParams"+" [workspace=")+ workspace)+", directHtml=")+ directHtml)+", message=")+ message)+", htmlFiles=")+ htmlFiles)+", additionalProperties=")+ additionalProperties)+"]");
    }

}
