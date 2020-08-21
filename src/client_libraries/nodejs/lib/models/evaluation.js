/*
 * Code generated by Microsoft (R) AutoRest Code Generator.
 * Changes may cause incorrect behavior and will be lost if the code is
 * regenerated.
 */

'use strict';

/**
 * Represents the measure evaluation details for a particular measure. It
 * includes various properties pertaining to an
 * evaluation including the measure name, orchestrationId, start time, state,
 * errors (if-any) etc. This latest evaluation
 * is stored in the measure metadata, while historical copies are written to
 * table storage.
 *
 */
class Evaluation {
  /**
   * Create a Evaluation.
   * @property {uuid} [lastSuccessfulRunId]
   * @property {string} [state] Possible values include: 'none', 'running',
   * 'failed', 'completed'
   * @property {date} [endTime] Gets or sets the evaluation completion time.
   * @property {string} [error] Gets or sets the error (if any) that occured
   * during the measure evaluation.
   */
  constructor() {
  }

  /**
   * Defines the metadata of Evaluation
   *
   * @returns {object} metadata of Evaluation
   *
   */
  mapper() {
    return {
      required: false,
      serializedName: 'Evaluation',
      type: {
        name: 'Composite',
        className: 'Evaluation',
        modelProperties: {
          lastSuccessfulRunId: {
            required: false,
            serializedName: 'lastSuccessfulRunId',
            type: {
              name: 'String'
            }
          },
          state: {
            required: false,
            serializedName: 'state',
            type: {
              name: 'String'
            }
          },
          endTime: {
            required: false,
            serializedName: 'endTime',
            type: {
              name: 'DateTime'
            }
          },
          error: {
            required: false,
            serializedName: 'error',
            type: {
              name: 'String'
            }
          }
        }
      }
    };
  }
}

module.exports = Evaluation;
