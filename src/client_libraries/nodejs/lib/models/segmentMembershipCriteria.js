/*
 * Code generated by Microsoft (R) AutoRest Code Generator.
 * Changes may cause incorrect behavior and will be lost if the code is
 * regenerated.
 */

'use strict';

/**
 * Represent a Segment Query.
 *
 */
class SegmentMembershipCriteria {
  /**
   * Create a SegmentMembershipCriteria.
   * @property {string} [logicalOperator] Possible values include: 'and', 'or'
   * @property {string} [attribute] Gets the Attribute of the entity used in
   * segment criteria.
   * @property {string} [comparisonOperator] Possible values include: 'equals',
   * 'notEquals', 'greaterThan', 'greaterThanOrEqualTo', 'lessThan',
   * 'lessThanOrEqualTo', 'any', 'contains', 'startsWith', 'endsWith',
   * 'isNull', 'isNotNull', 'all', 'isIn', 'isWithinLast', 'isBetween',
   * 'isNotBetween', 'yearToDate'
   * @property {array} [childCriterias] Gets the list of Child criteria of
   * segment.
   * @property {string} [value] Gets the Value in criteria.
   * @property {boolean} [ignoreCase] Gets a value indicating whether case is
   * ignored for this criteria.
   * @property {array} [listOfValues] Gets the list of values in criteria.
   */
  constructor() {
  }

  /**
   * Defines the metadata of SegmentMembershipCriteria
   *
   * @returns {object} metadata of SegmentMembershipCriteria
   *
   */
  mapper() {
    return {
      required: false,
      serializedName: 'SegmentMembershipCriteria',
      type: {
        name: 'Composite',
        className: 'SegmentMembershipCriteria',
        modelProperties: {
          logicalOperator: {
            required: false,
            serializedName: 'logicalOperator',
            type: {
              name: 'String'
            }
          },
          attribute: {
            required: false,
            serializedName: 'attribute',
            type: {
              name: 'String'
            }
          },
          comparisonOperator: {
            required: false,
            serializedName: 'comparisonOperator',
            type: {
              name: 'String'
            }
          },
          childCriterias: {
            required: false,
            serializedName: 'childCriterias',
            type: {
              name: 'Sequence',
              element: {
                  required: false,
                  serializedName: 'SegmentMembershipCriteriaElementType',
                  type: {
                    name: 'Composite',
                    className: 'SegmentMembershipCriteria'
                  }
              }
            }
          },
          value: {
            required: false,
            serializedName: 'value',
            type: {
              name: 'String'
            }
          },
          ignoreCase: {
            required: false,
            nullable: true,
            serializedName: 'ignoreCase',
            type: {
              name: 'Boolean'
            }
          },
          listOfValues: {
            required: false,
            serializedName: 'listOfValues',
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
          }
        }
      }
    };
  }
}

module.exports = SegmentMembershipCriteria;