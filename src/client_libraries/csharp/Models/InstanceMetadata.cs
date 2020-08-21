// <auto-generated>
// Code generated by Microsoft (R) AutoRest Code Generator.
// Changes may cause incorrect behavior and will be lost if the code is
// regenerated.
// </auto-generated>

namespace Microsoft.Dynamics.CustomerInsights.Api.Models
{
    using Newtonsoft.Json;
    using System.Linq;

    /// <summary>
    /// The instance metadata.
    /// </summary>
    public partial class InstanceMetadata
    {
        /// <summary>
        /// Initializes a new instance of the InstanceMetadata class.
        /// </summary>
        public InstanceMetadata()
        {
            CustomInit();
        }

        /// <summary>
        /// Initializes a new instance of the InstanceMetadata class.
        /// </summary>
        /// <param name="name">Gets the user defined instance name.</param>
        /// <param name="provisioningState">Possible values include: 'new',
        /// 'creating', 'active', 'createFailed', 'updateFailed', 'deleting',
        /// 'refreshCredentials', 'resetInstanceInProgress'</param>
        /// <param name="instanceType">Possible values include: 'trial',
        /// 'sandbox', 'production'</param>
        /// <param name="expiryTimeUtc">Gets the time the instance is set to
        /// expire.</param>
        /// <param name="region">Gets the Azure region where the instance
        /// lives.</param>
        /// <param name="bapEnvironmentId">Gets the Id of the BAP Environment
        /// associated with the current instance.</param>
        /// <param name="ppdfProvisionState">Possible values include:
        /// 'notStarted', 'creating', 'created', 'attaching', 'attached',
        /// 'installing', 'installed', 'failed'</param>
        /// <param name="pbiProvisionState">Possible values include:
        /// 'notStarted', 'creating', 'created', 'failed'</param>
        /// <param name="maxTrialExtensionsAllowed">Gets the total number of
        /// extensions allowed if this is trial instance</param>
        /// <param name="trialExtensionHistory">Stores the details of trial
        /// extensions done if this is a trial instance</param>
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
        public InstanceMetadata(string name = default(string), string provisioningState = default(string), string instanceType = default(string), DataRefreshSchedule refreshSchedule = default(DataRefreshSchedule), System.DateTime? expiryTimeUtc = default(System.DateTime?), string region = default(string), string bapEnvironmentId = default(string), string ppdfProvisionState = default(string), string pbiProvisionState = default(string), CdsOrgInfo cdsOrgInfo = default(CdsOrgInfo), CdsMdlInfo cdsMdlInfo = default(CdsMdlInfo), int? maxTrialExtensionsAllowed = default(int?), string trialExtensionHistory = default(string), long? version = default(long?), string updatedBy = default(string), System.DateTime? updatedUtc = default(System.DateTime?), string createdBy = default(string), System.DateTime? createdUtc = default(System.DateTime?), System.Guid? instanceId = default(System.Guid?))
        {
            Name = name;
            ProvisioningState = provisioningState;
            InstanceType = instanceType;
            RefreshSchedule = refreshSchedule;
            ExpiryTimeUtc = expiryTimeUtc;
            Region = region;
            BapEnvironmentId = bapEnvironmentId;
            PpdfProvisionState = ppdfProvisionState;
            PbiProvisionState = pbiProvisionState;
            CdsOrgInfo = cdsOrgInfo;
            CdsMdlInfo = cdsMdlInfo;
            MaxTrialExtensionsAllowed = maxTrialExtensionsAllowed;
            TrialExtensionHistory = trialExtensionHistory;
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
        /// Gets the user defined instance name.
        /// </summary>
        [JsonProperty(PropertyName = "name")]
        public string Name { get; set; }

        /// <summary>
        /// Gets or sets possible values include: 'new', 'creating', 'active',
        /// 'createFailed', 'updateFailed', 'deleting', 'refreshCredentials',
        /// 'resetInstanceInProgress'
        /// </summary>
        [JsonProperty(PropertyName = "provisioningState")]
        public string ProvisioningState { get; set; }

        /// <summary>
        /// Gets or sets possible values include: 'trial', 'sandbox',
        /// 'production'
        /// </summary>
        [JsonProperty(PropertyName = "instanceType")]
        public string InstanceType { get; set; }

        /// <summary>
        /// </summary>
        [JsonProperty(PropertyName = "refreshSchedule")]
        public DataRefreshSchedule RefreshSchedule { get; set; }

        /// <summary>
        /// Gets the time the instance is set to expire.
        /// </summary>
        [JsonProperty(PropertyName = "expiryTimeUtc")]
        public System.DateTime? ExpiryTimeUtc { get; set; }

        /// <summary>
        /// Gets the Azure region where the instance lives.
        /// </summary>
        [JsonProperty(PropertyName = "region")]
        public string Region { get; set; }

        /// <summary>
        /// Gets the Id of the BAP Environment associated with the current
        /// instance.
        /// </summary>
        [JsonProperty(PropertyName = "bapEnvironmentId")]
        public string BapEnvironmentId { get; set; }

        /// <summary>
        /// Gets or sets possible values include: 'notStarted', 'creating',
        /// 'created', 'attaching', 'attached', 'installing', 'installed',
        /// 'failed'
        /// </summary>
        [JsonProperty(PropertyName = "ppdfProvisionState")]
        public string PpdfProvisionState { get; set; }

        /// <summary>
        /// Gets or sets possible values include: 'notStarted', 'creating',
        /// 'created', 'failed'
        /// </summary>
        [JsonProperty(PropertyName = "pbiProvisionState")]
        public string PbiProvisionState { get; set; }

        /// <summary>
        /// </summary>
        [JsonProperty(PropertyName = "cdsOrgInfo")]
        public CdsOrgInfo CdsOrgInfo { get; set; }

        /// <summary>
        /// </summary>
        [JsonProperty(PropertyName = "cdsMdlInfo")]
        public CdsMdlInfo CdsMdlInfo { get; set; }

        /// <summary>
        /// Gets the total number of extensions allowed if this is trial
        /// instance
        /// </summary>
        [JsonProperty(PropertyName = "maxTrialExtensionsAllowed")]
        public int? MaxTrialExtensionsAllowed { get; set; }

        /// <summary>
        /// Gets or sets stores the details of trial extensions done if this is
        /// a trial instance
        /// </summary>
        [JsonProperty(PropertyName = "trialExtensionHistory")]
        public string TrialExtensionHistory { get; set; }

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
