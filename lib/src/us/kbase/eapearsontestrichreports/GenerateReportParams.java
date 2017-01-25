
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
    "report_index",
    "html_window_height",
    "summary_window_height",
    "html_files",
    "files"
})
public class GenerateReportParams {

    @JsonProperty("workspace")
    private String workspace;
    @JsonProperty("direct_html")
    private String directHtml;
    @JsonProperty("message")
    private String message;
    @JsonProperty("report_index")
    private Long reportIndex;
    @JsonProperty("html_window_height")
    private Double htmlWindowHeight;
    @JsonProperty("summary_window_height")
    private Double summaryWindowHeight;
    @JsonProperty("html_files")
    private List<us.kbase.eapearsontestrichreports.ListItem> htmlFiles;
    @JsonProperty("files")
    private List<us.kbase.eapearsontestrichreports.ListItem> files;
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

    @JsonProperty("report_index")
    public Long getReportIndex() {
        return reportIndex;
    }

    @JsonProperty("report_index")
    public void setReportIndex(Long reportIndex) {
        this.reportIndex = reportIndex;
    }

    public GenerateReportParams withReportIndex(Long reportIndex) {
        this.reportIndex = reportIndex;
        return this;
    }

    @JsonProperty("html_window_height")
    public Double getHtmlWindowHeight() {
        return htmlWindowHeight;
    }

    @JsonProperty("html_window_height")
    public void setHtmlWindowHeight(Double htmlWindowHeight) {
        this.htmlWindowHeight = htmlWindowHeight;
    }

    public GenerateReportParams withHtmlWindowHeight(Double htmlWindowHeight) {
        this.htmlWindowHeight = htmlWindowHeight;
        return this;
    }

    @JsonProperty("summary_window_height")
    public Double getSummaryWindowHeight() {
        return summaryWindowHeight;
    }

    @JsonProperty("summary_window_height")
    public void setSummaryWindowHeight(Double summaryWindowHeight) {
        this.summaryWindowHeight = summaryWindowHeight;
    }

    public GenerateReportParams withSummaryWindowHeight(Double summaryWindowHeight) {
        this.summaryWindowHeight = summaryWindowHeight;
        return this;
    }

    @JsonProperty("html_files")
    public List<us.kbase.eapearsontestrichreports.ListItem> getHtmlFiles() {
        return htmlFiles;
    }

    @JsonProperty("html_files")
    public void setHtmlFiles(List<us.kbase.eapearsontestrichreports.ListItem> htmlFiles) {
        this.htmlFiles = htmlFiles;
    }

    public GenerateReportParams withHtmlFiles(List<us.kbase.eapearsontestrichreports.ListItem> htmlFiles) {
        this.htmlFiles = htmlFiles;
        return this;
    }

    @JsonProperty("files")
    public List<us.kbase.eapearsontestrichreports.ListItem> getFiles() {
        return files;
    }

    @JsonProperty("files")
    public void setFiles(List<us.kbase.eapearsontestrichreports.ListItem> files) {
        this.files = files;
    }

    public GenerateReportParams withFiles(List<us.kbase.eapearsontestrichreports.ListItem> files) {
        this.files = files;
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
        return ((((((((((((((((((("GenerateReportParams"+" [workspace=")+ workspace)+", directHtml=")+ directHtml)+", message=")+ message)+", reportIndex=")+ reportIndex)+", htmlWindowHeight=")+ htmlWindowHeight)+", summaryWindowHeight=")+ summaryWindowHeight)+", htmlFiles=")+ htmlFiles)+", files=")+ files)+", additionalProperties=")+ additionalProperties)+"]");
    }

}
