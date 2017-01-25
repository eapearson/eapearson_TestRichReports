[![Build Status](https://travis-ci.org/eapearson/eapearson_TestRichReports.svg?branch=master)](https://travis-ci.org/eapearson/eapearson_TestRichReports)

# eapearson_TestRichReports
---

This module exists for testing "rich app reports", that is, reports created with KBaseReport.create_extended_report.

direct_html
: An html string which is stuffed into the html report area of the report widget. This should be an html snipped of under 16K bytes

summary
: Plain text which is displayed in a monospaced font. This is for expedience. It is preferrable to use either direct_html or an html link and index.

html_links
: Interestingly named, these are zip files which contain at least one html file and possibly associated assets, an index name (the name of the top level html file in the zip), and a description. The html is displayed via the html file sets service, and is displayed in two contexts in the widget. First, the set of all such links are displayed in a list, using the index name as the link label, and the description below. Secondly, if the direct_html_link_index property is supplied, the link is used to populate the report's html area.


file_links
: Links to arbitrary files in shock, downloaded through the data_import_export service

direct_html_link_index
: An integer index into the html_links list; it indicates the report content which should be displayed in the main report area.

