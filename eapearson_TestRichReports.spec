/*
A KBase module: eapearson_TestRichReports
This sample module contains one small method - filter_contigs.
*/

module eapearson_TestRichReports {
    typedef structure {
        string workspace;
        string direct_html;
        string message;
        list<string> html_files;
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
