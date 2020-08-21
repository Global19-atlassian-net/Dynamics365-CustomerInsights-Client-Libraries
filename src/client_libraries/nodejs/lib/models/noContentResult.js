/*
 * Code generated by Microsoft (R) AutoRest Code Generator.
 * Changes may cause incorrect behavior and will be lost if the code is
 * regenerated.
 */

'use strict';

/**
 * Class representing a NoContentResult.
 */
class NoContentResult {
  /**
   * Create a NoContentResult.
   * @property {number} [statusCode]
   */
  constructor() {
  }

  /**
   * Defines the metadata of NoContentResult
   *
   * @returns {object} metadata of NoContentResult
   *
   */
  mapper() {
    return {
      required: false,
      serializedName: 'NoContentResult',
      type: {
        name: 'Composite',
        className: 'NoContentResult',
        modelProperties: {
          statusCode: {
            required: false,
            serializedName: 'statusCode',
            type: {
              name: 'Number'
            }
          }
        }
      }
    };
  }
}

module.exports = NoContentResult;
