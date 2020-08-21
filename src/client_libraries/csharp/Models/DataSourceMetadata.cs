// <auto-generated>
// Code generated by Microsoft (R) AutoRest Code Generator.
// Changes may cause incorrect behavior and will be lost if the code is
// regenerated.
// </auto-generated>

namespace Microsoft.Dynamics.CustomerInsights.Api.Models
{
    using Newtonsoft.Json;
    using System.Collections;
    using System.Collections.Generic;
    using System.Linq;

    /// <summary>
    /// Represents metadata for a Customer Insights data source.
    /// </summary>
    public partial class DataSourceMetadata
    {
        /// <summary>
        /// Initializes a new instance of the DataSourceMetadata class.
        /// </summary>
        public DataSourceMetadata()
        {
            CustomInit();
        }

        /// <summary>
        /// Initializes a new instance of the DataSourceMetadata class.
        /// </summary>
        /// <param name="kind">Possible values include: 'salesforce',
        /// 'dynamics365', 'powerQuery', 'attachCdm', 'attachCds',
        /// 'powerPlatform', 'datahub'</param>
        /// <param name="dataSourceId">Gets the unique identity for this
        /// object.</param>
        /// <param name="name">Gets the unique name of the dataSource.</param>
        /// <param name="friendlyName">Gets the friendlyName of the
        /// dataSource.</param>
        /// <param name="entityInformation">Gets the entity information, by
        /// entity name.</param>
        /// <param name="provisioningState">Possible values include: 'new',
        /// 'creating', 'active', 'createFailed', 'updateFailed', 'deleting',
        /// 'refreshCredentials', 'resetInstanceInProgress'</param>
        /// <param name="lastRefresh">Gets the time datasource was last
        /// refreshed.</param>
        /// <param name="refreshState">Possible values include: 'notUpdated',
        /// 'updated', 'updating', 'updateFailed', 'updateCancelled'</param>
        /// <param name="incrementalRefreshProperties">Gets the Incremental
        /// refresh properties for entities.</param>
        /// <param name="modelJsonPath">Gets the model path for CDM data
        /// source.</param>
        /// <param name="version">Gets the version number of this
        /// object.</param>
        /// <param name="updatedBy">Gets the UPN of the user who last updated
        /// this record.</param>
        /// <param name="updatedUtc">Gets the time the object was last
        /// updated.</param>
        /// <param name="createdBy">Gets the email address of the user who
        /// created this record.</param>
        /// <param name="createdUtc">Gets the time the object was initially
        /// created.</param>
        /// <param name="instanceId">Gets the Customer Insights instance id
        /// associated with this object.</param>
        public DataSourceMetadata(string kind = default(string), bool? isActive = default(bool?), IList<string> entityNames = default(IList<string>), System.Guid? dataSourceId = default(System.Guid?), string name = default(string), string friendlyName = default(string), IList<DatasourceEntityInformation> entityInformation = default(IList<DatasourceEntityInformation>), string provisioningState = default(string), System.DateTime? lastRefresh = default(System.DateTime?), string refreshState = default(string), IList<IncrementalRefreshProperties> incrementalRefreshProperties = default(IList<IncrementalRefreshProperties>), string modelJsonPath = default(string), long? version = default(long?), string updatedBy = default(string), System.DateTime? updatedUtc = default(System.DateTime?), string createdBy = default(string), System.DateTime? createdUtc = default(System.DateTime?), System.Guid? instanceId = default(System.Guid?))
        {
            Kind = kind;
            IsActive = isActive;
            EntityNames = entityNames;
            DataSourceId = dataSourceId;
            Name = name;
            FriendlyName = friendlyName;
            EntityInformation = entityInformation;
            ProvisioningState = provisioningState;
            LastRefresh = lastRefresh;
            RefreshState = refreshState;
            IncrementalRefreshProperties = incrementalRefreshProperties;
            ModelJsonPath = modelJsonPath;
            Version = version;
            UpdatedBy = updatedBy;
            UpdatedUtc = updatedUtc;
            CreatedBy = createdBy;
            CreatedUtc = createdUtc;
            InstanceId = instanceId;
            CustomInit();
        }

        /// <summary>
        /// An initialization method that performs custom operations like setting defaults
        /// </summary>
        partial void CustomInit();

        /// <summary>
        /// Gets or sets possible values include: 'salesforce', 'dynamics365',
        /// 'powerQuery', 'attachCdm', 'attachCds', 'powerPlatform', 'datahub'
        /// </summary>
        [JsonProperty(PropertyName = "kind")]
        public string Kind { get; set; }

        /// <summary>
        /// </summary>
        [JsonProperty(PropertyName = "isActive")]
        public bool? IsActive { get; private set; }

        /// <summary>
        /// </summary>
        [JsonProperty(PropertyName = "entityNames")]
        public IList<string> EntityNames { get; private set; }

        /// <summary>
        /// Gets the unique identity for this object.
        /// </summary>
        [JsonProperty(PropertyName = "dataSourceId")]
        public System.Guid? DataSourceId { get; private set; }

        /// <summary>
        /// Gets the unique name of the dataSource.
        /// </summary>
        [JsonProperty(PropertyName = "name")]
        public string Name { get; private set; }

        /// <summary>
        /// Gets the friendlyName of the dataSource.
        /// </summary>
        [JsonProperty(PropertyName = "friendlyName")]
        public string FriendlyName { get; private set; }

        /// <summary>
        /// Gets the entity information, by entity name.
        /// </summary>
        [JsonProperty(PropertyName = "entityInformation")]
        public IList<DatasourceEntityInformation> EntityInformation { get; private set; }

        /// <summary>
        /// Gets or sets possible values include: 'new', 'creating', 'active',
        /// 'createFailed', 'updateFailed', 'deleting', 'refreshCredentials',
        /// 'resetInstanceInProgress'
        /// </summary>
        [JsonProperty(PropertyName = "provisioningState")]
        public string ProvisioningState { get; set; }

        /// <summary>
        /// Gets the time datasource was last refreshed.
        /// </summary>
        [JsonProperty(PropertyName = "lastRefresh")]
        public System.DateTime? LastRefresh { get; private set; }

        /// <summary>
        /// Gets or sets possible values include: 'notUpdated', 'updated',
        /// 'updating', 'updateFailed', 'updateCancelled'
        /// </summary>
        [JsonProperty(PropertyName = "refreshState")]
        public string RefreshState { get; set; }

        /// <summary>
        /// Gets the Incremental refresh properties for entities.
        /// </summary>
        [JsonProperty(PropertyName = "incrementalRefreshProperties")]
        public IList<IncrementalRefreshProperties> IncrementalRefreshProperties { get; private set; }

        /// <summary>
        /// Gets the model path for CDM data source.
        /// </summary>
        [JsonProperty(PropertyName = "modelJsonPath")]
        public string ModelJsonPath { get; private set; }

        /// <summary>
        /// Gets the version number of this object.
        /// </summary>
        [JsonProperty(PropertyName = "version")]
        public long? Version { get; private set; }

        /// <summary>
        /// Gets the UPN of the user who last updated this record.
        /// </summary>
        [JsonProperty(PropertyName = "updatedBy")]
        public string UpdatedBy { get; private set; }

        /// <summary>
        /// Gets the time the object was last updated.
        /// </summary>
        [JsonProperty(PropertyName = "updatedUtc")]
        public System.DateTime? UpdatedUtc { get; private set; }

        /// <summary>
        /// Gets the email address of the user who created this record.
        /// </summary>
        [JsonProperty(PropertyName = "createdBy")]
        public string CreatedBy { get; private set; }

        /// <summary>
        /// Gets the time the object was initially created.
        /// </summary>
        [JsonProperty(PropertyName = "createdUtc")]
        public System.DateTime? CreatedUtc { get; private set; }

        /// <summary>
        /// Gets the Customer Insights instance id associated with this object.
        /// </summary>
        [JsonProperty(PropertyName = "instanceId")]
        public System.Guid? InstanceId { get; private set; }

    }
}
