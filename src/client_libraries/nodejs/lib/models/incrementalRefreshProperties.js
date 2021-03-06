/*
 * Code generated by Microsoft (R) AutoRest Code Generator.
 * Changes may cause incorrect behavior and will be lost if the code is
 * regenerated.
 */

'use strict';

/**
 * Represents a Incremental Refresh Property.
 *
 */
class IncrementalRefreshProperties {
  /**
   * Create a IncrementalRefreshProperties.
   * @property {string} [entityName] Gets the name of the entity.
   * @property {string} [detectChangesAttributeName] Gets the column to detect
   * changes.
   * @property {string} [filterByAttributeName] Gets the column to get
   * incremental data.
   * @property {string} [incrementalGranularity] Gets the granularity of the
   * incremental refresh.
   * @property {number} [incrementalPeriods] Gets the incremental period.
   * @property {boolean} [refreshCompletePeriods] Gets a value indicating
   * whether to refresh completed periods or not.
   * @property {number} [incrementalPeriodsOffset] Gets the off set period.
   * @property {string} [primaryKeyAttributeName] Gets the primary key of the
   * entity.
   * @property {string} [rollingWindowGranularity] Gets the rolling window
   * granularity.
   * @property {number} [rollingWindowPeriods] Gets the Rolling window period.
   */
  constructor() {
  }

  /**
   * Defines the metadata of IncrementalRefreshProperties
   *
   * @returns {object} metadata of IncrementalRefreshProperties
   *
   */
  mapper() {
    return {
      required: false,
      serializedName: 'IncrementalRefreshProperties',
      type: {
        name: 'Composite',
        className: 'IncrementalRefreshProperties',
        modelProperties: {
          entityName: {
            required: false,
            serializedName: 'entityName',
            type: {
              name: 'String'
            }
          },
          detectChangesAttributeName: {
            required: false,
            serializedName: 'detectChangesAttributeName',
            type: {
              name: 'String'
            }
          },
          filterByAttributeName: {
            required: false,
            serializedName: 'filterByAttributeName',
            type: {
              name: 'String'
            }
          },
          incrementalGranularity: {
            required: false,
            serializedName: 'incrementalGranularity',
            type: {
              name: 'String'
            }
          },
          incrementalPeriods: {
            required: false,
            serializedName: 'incrementalPeriods',
            type: {
              name: 'Number'
            }
          },
          refreshCompletePeriods: {
            required: false,
            serializedName: 'refreshCompletePeriods',
            type: {
              name: 'Boolean'
            }
          },
          incrementalPeriodsOffset: {
            required: false,
            serializedName: 'incrementalPeriodsOffset',
            type: {
              name: 'Number'
            }
          },
          primaryKeyAttributeName: {
            required: false,
            serializedName: 'primaryKeyAttributeName',
            type: {
              name: 'String'
            }
          },
          rollingWindowGranularity: {
            required: false,
            serializedName: 'rollingWindowGranularity',
            type: {
              name: 'String'
            }
          },
          rollingWindowPeriods: {
            required: false,
            serializedName: 'rollingWindowPeriods',
            type: {
              name: 'Number'
            }
          }
        }
      }
    };
  }
}

module.exports = IncrementalRefreshProperties;
