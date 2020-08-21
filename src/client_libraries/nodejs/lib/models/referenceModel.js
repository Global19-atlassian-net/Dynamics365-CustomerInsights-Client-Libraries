/*
 * Code generated by Microsoft (R) AutoRest Code Generator.
 * Changes may cause incorrect behavior and will be lost if the code is
 * regenerated.
 */

'use strict';

/**
 * Class representing a ReferenceModel.
 */
class ReferenceModel {
  /**
   * Create a ReferenceModel.
   * @property {string} [id]
   * @property {string} [location]
   */
  constructor() {
  }

  /**
   * Defines the metadata of ReferenceModel
   *
   * @returns {object} metadata of ReferenceModel
   *
   */
  mapper() {
    return {
      required: false,
      serializedName: 'ReferenceModel',
      type: {
        name: 'Composite',
        className: 'ReferenceModel',
        modelProperties: {
          id: {
            required: false,
            serializedName: 'id',
            type: {
              name: 'String'
            }
          },
          location: {
            required: false,
            serializedName: 'location',
            type: {
              name: 'String'
            }
          }
        }
      }
    };
  }
}

module.exports = ReferenceModel;
