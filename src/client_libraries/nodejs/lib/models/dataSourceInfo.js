/*
 * Code generated by Microsoft (R) AutoRest Code Generator.
 * Changes may cause incorrect behavior and will be lost if the code is
 * regenerated.
 */

'use strict';

/**
 * Class representing a DataSourceInfo.
 */
class DataSourceInfo {
  /**
   * Create a DataSourceInfo.
   * @property {object} [dataSourceMetadata]
   * @property {string} [dataSourceMetadata.kind] Possible values include:
   * 'salesforce', 'dynamics365', 'powerQuery', 'attachCdm', 'attachCds',
   * 'powerPlatform', 'datahub'
   * @property {boolean} [dataSourceMetadata.isActive]
   * @property {array} [dataSourceMetadata.entityNames]
   * @property {uuid} [dataSourceMetadata.dataSourceId] Gets the unique
   * identity for this object.
   * @property {string} [dataSourceMetadata.name] Gets the unique name of the
   * dataSource.
   * @property {string} [dataSourceMetadata.friendlyName] Gets the friendlyName
   * of the dataSource.
   * @property {array} [dataSourceMetadata.entityInformation] Gets the entity
   * information, by entity name.
   * @property {string} [dataSourceMetadata.provisioningState] Possible values
   * include: 'new', 'creating', 'active', 'createFailed', 'updateFailed',
   * 'deleting', 'refreshCredentials', 'resetInstanceInProgress'
   * @property {date} [dataSourceMetadata.lastRefresh] Gets the time datasource
   * was last refreshed.
   * @property {string} [dataSourceMetadata.refreshState] Possible values
   * include: 'notUpdated', 'updated', 'updating', 'updateFailed',
   * 'updateCancelled'
   * @property {array} [dataSourceMetadata.incrementalRefreshProperties] Gets
   * the Incremental refresh properties for entities.
   * @property {string} [dataSourceMetadata.modelJsonPath] Gets the model path
   * for CDM data source.
   * @property {number} [dataSourceMetadata.version] Gets the version number of
   * this object.
   * @property {string} [dataSourceMetadata.updatedBy] Gets the UPN of the user
   * who last updated this record.
   * @property {date} [dataSourceMetadata.updatedUtc] Gets the time the object
   * was last updated.
   * @property {string} [dataSourceMetadata.createdBy] Gets the email address
   * of the user who created this record.
   * @property {date} [dataSourceMetadata.createdUtc] Gets the time the object
   * was initially created.
   * @property {uuid} [dataSourceMetadata.instanceId] Gets the Customer
   * Insights instance id associated with this object.
   * @property {object} [model]
   * @property {string} [model.name]
   * @property {string} [model.description]
   * @property {boolean} [model.isHidden]
   * @property {string} [model.version]
   * @property {string} [model.culture]
   * @property {string} [model.pbitimeZone]
   * @property {date} [model.modifiedTime]
   * @property {object} [model.pbimashup]
   * @property {boolean} [model.pbimashup.fastCombine]
   * @property {boolean} [model.pbimashup.allowNativeQueries]
   * @property {object} [model.pbimashup.queriesMetadata]
   * @property {string} [model.pbimashup.document]
   * @property {array} [model.annotations]
   * @property {array} [model.entities]
   * @property {array} [model.relationships]
   * @property {array} [model.referenceModels]
   */
  constructor() {
  }

  /**
   * Defines the metadata of DataSourceInfo
   *
   * @returns {object} metadata of DataSourceInfo
   *
   */
  mapper() {
    return {
      required: false,
      serializedName: 'DataSourceInfo',
      type: {
        name: 'Composite',
        className: 'DataSourceInfo',
        modelProperties: {
          dataSourceMetadata: {
            required: false,
            serializedName: 'dataSourceMetadata',
            type: {
              name: 'Composite',
              className: 'DataSourceMetadata'
            }
          },
          model: {
            required: false,
            serializedName: 'model',
            type: {
              name: 'Composite',
              className: 'Model'
            }
          }
        }
      }
    };
  }
}

module.exports = DataSourceInfo;
