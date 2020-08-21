/*
 * Code generated by Microsoft (R) AutoRest Code Generator.
 * Changes may cause incorrect behavior and will be lost if the code is
 * regenerated.
 */

'use strict';

/**
 * Class representing a GraphJobInfo.
 */
class GraphJobInfo {
  /**
   * Create a GraphJobInfo.
   * @property {uuid} [jobId]
   * @property {string} [jobType] Possible values include: 'full',
   * 'incremental'
   * @property {string} [jobSubmissionKind] Possible values include:
   * 'onDemand', 'scheduled'
   * @property {string} [jobStatus] Possible values include: 'queued',
   * 'needsUpdate', 'running', 'failed', 'timedOut', 'aborted', 'deleted',
   * 'successful', 'skipped'
   * @property {string} [operationType] Possible values include: 'none',
   * 'ingestion', 'derivedEntity', 'dataPreparation', 'map', 'match', 'merge',
   * 'profileStore', 'search', 'activity', 'attributeMeasures',
   * 'entityMeasures', 'measures', 'segmentation', 'enrichment',
   * 'intelligence', 'aiBuilder', 'insights', 'export', 'modelManagement',
   * 'relationship', 'roleAssignment', 'analysis', 'all'
   * @property {string} [subType] Possible values include: 'templatedMeasures',
   * 'createAnalysisModel', 'linkAnalysisModel'
   * @property {date} [endTimestamp]
   * @property {boolean} [shouldForceRunRequestedNodes]
   * @property {array} [tasks]
   * @property {array} [idList]
   * @property {date} [submittedTimestamp]
   */
  constructor() {
  }

  /**
   * Defines the metadata of GraphJobInfo
   *
   * @returns {object} metadata of GraphJobInfo
   *
   */
  mapper() {
    return {
      required: false,
      serializedName: 'GraphJobInfo',
      type: {
        name: 'Composite',
        className: 'GraphJobInfo',
        modelProperties: {
          jobId: {
            required: false,
            serializedName: 'jobId',
            type: {
              name: 'String'
            }
          },
          jobType: {
            required: false,
            serializedName: 'jobType',
            type: {
              name: 'String'
            }
          },
          jobSubmissionKind: {
            required: false,
            serializedName: 'jobSubmissionKind',
            type: {
              name: 'String'
            }
          },
          jobStatus: {
            required: false,
            serializedName: 'jobStatus',
            type: {
              name: 'String'
            }
          },
          operationType: {
            required: false,
            serializedName: 'operationType',
            type: {
              name: 'String'
            }
          },
          subType: {
            required: false,
            serializedName: 'subType',
            type: {
              name: 'String'
            }
          },
          endTimestamp: {
            required: false,
            serializedName: 'endTimestamp',
            type: {
              name: 'DateTime'
            }
          },
          shouldForceRunRequestedNodes: {
            required: false,
            serializedName: 'shouldForceRunRequestedNodes',
            type: {
              name: 'Boolean'
            }
          },
          tasks: {
            required: false,
            serializedName: 'tasks',
            type: {
              name: 'Sequence',
              element: {
                  required: false,
                  serializedName: 'GraphTaskInfoElementType',
                  type: {
                    name: 'Composite',
                    className: 'GraphTaskInfo'
                  }
              }
            }
          },
          idList: {
            required: false,
            serializedName: 'idList',
            type: {
              name: 'Sequence',
              element: {
                  required: false,
                  serializedName: 'StringElementType',
                  type: {
                    name: 'String'
                  }
              }
            }
          },
          submittedTimestamp: {
            required: false,
            serializedName: 'submittedTimestamp',
            type: {
              name: 'DateTime'
            }
          }
        }
      }
    };
  }
}

module.exports = GraphJobInfo;