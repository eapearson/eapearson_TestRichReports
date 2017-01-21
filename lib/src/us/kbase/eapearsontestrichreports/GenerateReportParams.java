
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
    private String workspace;
    @JsonProperty("direct_html")
    private String directHtml;
    @JsonProperty("message")
    private String message;
    @JsonProperty("html_files")
    private List<ReportZip> htmlFiles;
    private Map<String, Object> additionalProperties = new HashMap<String, Object>();

    @JsonProperty("workspace")
    public String getWorkspace() {
        return workspace;
    }

    @JsonProperty("workspace")
    public void setWorkspace(String workspace) {
        this.workspace = workspace;
    }

    public GenerateReportParams withWorkspace(String workspace) {
        this.workspace = workspace;
        return this;
    }

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

    @JsonProperty("message")
    public String getMessage() {
        return message;
    }

    @JsonProperty("message")
    public void setMessage(String message) {
        this.message = message;
    }

    public GenerateReportParams withMessage(String message) {
        this.message = message;
        return this;
    }

    @JsonProperty("html_files")
    public List<ReportZip> getHtmlFiles() {
        return htmlFiles;
    }

    @JsonProperty("html_files")
    public void setHtmlFiles(List<ReportZip> htmlFiles) {
        this.htmlFiles = htmlFiles;
    }

    public GenerateReportParams withHtmlFiles(List<ReportZip> htmlFiles) {
        this.htmlFiles = htmlFiles;
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
        return ((((((((((("GenerateReportParams"+" [workspace=")+ workspace)+", directHtml=")+ directHtml)+", message=")+ message)+", htmlFiles=")+ htmlFiles)+", additionalProperties=")+ additionalProperties)+"]");
    }

}
