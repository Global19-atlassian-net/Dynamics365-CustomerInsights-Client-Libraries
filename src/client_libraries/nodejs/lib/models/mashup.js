/*
 * Code generated by Microsoft (R) AutoRest Code Generator.
 * Changes may cause incorrect behavior and will be lost if the code is
 * regenerated.
 */

'use strict';

/**
 * Class representing a Mashup.
 */
class Mashup {
  /**
   * Create a Mashup.
   * @property {boolean} [fastCombine]
   * @property {boolean} [allowNativeQueries]
   * @property {object} [queriesMetadata]
   * @property {array} [queryGroups]
   * @property {string} [document]
   */
  constructor() {
  }

  /**
   * Defines the metadata of Mashup
   *
   * @returns {object} metadata of Mashup
   *
   */
  mapper() {
    return {
      required: false,
      serializedName: 'Mashup',
      type: {
        name: 'Composite',
        className: 'Mashup',
        modelProperties: {
          fastCombine: {
            required: false,
            serializedName: 'fastCombine',
            type: {
              name: 'Boolean'
            }
          },
          allowNativeQueries: {
            required: false,
            serializedName: 'allowNativeQueries',
            type: {
              name: 'Boolean'
            }
          },
          queriesMetadata: {
            required: false,
            serializedName: 'queriesMetadata',
            type: {
              name: 'Dictionary',
              value: {
                  required: false,
                  serializedName: 'QueryMetadataElementType',
                  type: {
                    name: 'Composite',
                    className: 'QueryMetadata'
                  }
              }
            }
          },
          queryGroups: {
            required: false,
            serializedName: 'queryGroups',
            type: {
              name: 'Sequence',
              element: {
                  required: false,
                  serializedName: 'QueryGroupEntityElementType',
                  type: {
                    name: 'Composite',
                    className: 'QueryGroupEntity'
                  }
              }
            }
          },
          document: {
            required: false,
            serializedName: 'document',
            type: {
              name: 'String'
            }
          }
        }
      }
    };
  }
}

module.exports = Mashup;
