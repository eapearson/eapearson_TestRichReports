# -*- coding: utf-8 -*-
#BEGIN_HEADER
# The header block is where all import statments should live
import os
import sys
import traceback
import uuid
from pprint import pprint, pformat
from biokbase.workspace.client import Workspace as workspaceService
from KBaseReport.KBaseReportClient import KBaseReport
#END_HEADER


class eapearson_TestRichReports:
    '''
    Module Name:
    eapearson_TestRichReports

    Module Description:
    A KBase module: eapearson_TestRichReports
This sample module contains one small method - filter_contigs.
    '''

    ######## WARNING FOR GEVENT USERS ####### noqa
    # Since asynchronous IO can lead to methods - even the same method -
    # interrupting each other, you must be *very* careful when using global
    # state. A method could easily clobber the state set by another while
    # the latter method is running.
    ######################################### noqa
    VERSION = "0.0.1"
    GIT_URL = "ssh://git@github.com/eapearson/eapearson_TestRichReports.git"
    GIT_COMMIT_HASH = "49010cb2630c14ca62c56694af857da4838155bf"

    #BEGIN_CLASS_HEADER
    # Class variables and functions can be defined in this block
    workspaceURL = None
    #END_CLASS_HEADER

    # config contains contents of config file in a hash or None if it couldn't
    # be found
    def __init__(self, config):
        #BEGIN_CONSTRUCTOR
        self.workspaceURL = config['workspace-url']
        self.scratch = os.path.abspath(config['scratch'])
        self.callback_url = os.environ['SDK_CALLBACK_URL']
        #END_CONSTRUCTOR
        pass


    def generate_report(self, ctx, params):
        """
        Filter contigs in a ContigSet by DNA length
        :param params: instance of type "GenerateReportParams" -> structure:
           parameter "workspace" of String, parameter "direct_html" of
           String, parameter "message" of String, parameter "report_index" of
           Long, parameter "html_window_height" of Double, parameter
           "summary_window_height" of Double, parameter "html_files" of list
           of type "ListItem" -> structure: parameter "shock_id" of String,
           parameter "index_name" of String, parameter "label" of String,
           parameter "description" of String, parameter "files" of list of
           type "ListItem" -> structure: parameter "shock_id" of String,
           parameter "index_name" of String, parameter "label" of String,
           parameter "description" of String
        :returns: instance of type "GenerateReportResults" -> structure:
           parameter "report_name" of String, parameter "report_ref" of String
        """
        # ctx is the context object
        # return variables are: returnVal
        #BEGIN generate_report

        file_links = []
        html_links = []

        html_files = params['html_files']
        files = params['files']
        for html_file in html_files:
            html_links.append({
                'shock_id': html_file['shock_id'],
                'description': html_file['description'],
                'name': html_file['index_name'],
                'label': html_file['label']
            })

        for item in files:
            file_links.append({
                'shock_id': item['file_shock_id'],
                'description': item['file_description'],
                'name': item['file_name'],
                'label': item['file_label']
            })

        reportParams = {
            'objects_created': [],
            'message': params['message'],
            'direct_html': params['direct_html'],
            'file_links': file_links,
            'html_links': html_links,
            'workspace_name': params['workspace'],
            'direct_html_link_index': params['report_index'],
            'html_window_height': params['html_window_height'],
            'summary_window_height': params['summary_window_height'],
            'report_object_name': 'test_rich_reports_report_' + str(uuid.uuid4())
        }
        # client = KBaseReport(self.callback_url, token=ctx['token'], service_ver='release')
        client = KBaseReport(self.callback_url, token=ctx['token'],  service_ver='dev')
        output = client.create_extended_report(reportParams)
        returnVal = {
            'report_name': output['name'],
            'report_ref': output['ref']
        }
        #END generate_report

        # At some point might do deeper type checking...
        if not isinstance(returnVal, dict):
            raise ValueError('Method generate_report return value ' +
                             'returnVal is not type dict as required.')
        # return the results
        return [returnVal]
    def status(self, ctx):
        #BEGIN_STATUS
        returnVal = {'state': "OK",
                     'message': "",
                     'version': self.VERSION,
                     'git_url': self.GIT_URL,
                     'git_commit_hash': self.GIT_COMMIT_HASH}
        #END_STATUS
        return [returnVal]
