/*
 * Code generated by Microsoft (R) AutoRest Code Generator.
 * Changes may cause incorrect behavior and will be lost if the code is
 * regenerated.
 */

'use strict';

/**
 * Class representing a ODataInstanceAnnotation.
 */
class ODataInstanceAnnotation {
  /**
   * Create a ODataInstanceAnnotation.
   * @property {string} [name]
   * @property {object} [value]
   * @property {object} [value.typeAnnotation]
   * @property {string} [value.typeAnnotation.typeName]
   * @property {object} [typeAnnotation]
   * @property {string} [typeAnnotation.typeName]
   */
  constructor() {
  }

  /**
   * Defines the metadata of ODataInstanceAnnotation
   *
   * @returns {object} metadata of ODataInstanceAnnotation
   *
   */
  mapper() {
    return {
      required: false,
      serializedName: 'ODataInstanceAnnotation',
      type: {
        name: 'Composite',
        className: 'ODataInstanceAnnotation',
        modelProperties: {
          name: {
            required: false,
            serializedName: 'name',
            type: {
              name: 'String'
            }
          },
          value: {
            required: false,
            serializedName: 'value',
            type: {
              name: 'Composite',
              className: 'ODataValue'
            }
          },
          typeAnnotation: {
            required: false,
            serializedName: 'typeAnnotation',
            type: {
              name: 'Composite',
              className: 'ODataTypeAnnotation'
            }
          }
        }
      }
    };
  }
}

module.exports = ODataInstanceAnnotation;
