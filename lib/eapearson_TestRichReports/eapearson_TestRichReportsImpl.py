# -*- coding: utf-8 -*-
#BEGIN_HEADER
# The header block is where all import statments should live
import sys
import traceback
import uuid
from pprint import pprint, pformat
from biokbase.workspace.client import Workspace as workspaceService
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
    GIT_COMMIT_HASH = "61bc58db5f2f44ecbb4a0e37b19a86d1ebab2f2b"

    #BEGIN_CLASS_HEADER
    # Class variables and functions can be defined in this block
    workspaceURL = None
    #END_CLASS_HEADER

    # config contains contents of config file in a hash or None if it couldn't
    # be found
    def __init__(self, config):
        #BEGIN_CONSTRUCTOR
        self.workspaceURL = config['workspace-url']
        #END_CONSTRUCTOR
        pass


    def generate_report(self, ctx, params):
        """
        Filter contigs in a ContigSet by DNA length
        :param params: instance of type "GenerateReportParams" -> structure:
           parameter "direct_html" of String, parameter "summary_content" of
           String
        :returns: instance of type "GenerateReportResults" -> structure:
           parameter "report_name" of String, parameter "report_ref" of String
        """
        # ctx is the context object
        # return variables are: returnVal
        #BEGIN generate_report
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
