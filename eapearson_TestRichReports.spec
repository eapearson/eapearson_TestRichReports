/*
A KBase module: eapearson_TestRichReports
This sample module contains one small method - filter_contigs.
*/

module eapearson_TestRichReports {

    typedef structure {
        string shock_id;
        string index_name;
        string label;
        string description;
    } ListItem;

    typedef structure {
        string workspace;
        string direct_html;
        string message;
        int report_index;
        float html_window_height;
        float summary_window_height;
        list<ListItem> html_files;
        list<ListItem> files;
    } GenerateReportParams;

    typedef structure {
        string report_name;
        string report_ref;
    } GenerateReportResults;
	
    /*
        Filter contigs in a ContigSet by DNA length
    */
    funcdef generate_report(GenerateReportParams params) 
      returns (GenerateReportResults) authentication required;
};
