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
    /// Represents an instance
    /// </summary>
    public partial class InstanceInfo
    {
        /// <summary>
        /// Initializes a new instance of the InstanceInfo class.
        /// </summary>
        public InstanceInfo()
        {
            CustomInit();
        }

        /// <summary>
        /// Initializes a new instance of the InstanceInfo class.
        /// </summary>
        /// <param name="instanceId">Gets the unique ID for this
        /// instance.</param>
        /// <param name="name">Gets the instance name. (not persisted in
        /// store)</param>
        /// <param name="instanceType">Possible values include: 'trial',
        /// 'sandbox', 'production'</param>
        /// <param name="expiryTimeUtc">Gets the time the instance is set to
        /// expire. (not persisted in store)</param>
        public InstanceInfo(System.Guid? instanceId = default(System.Guid?), string name = default(string), string instanceType = default(string), System.DateTime? expiryTimeUtc = default(System.DateTime?))
        {
            InstanceId = instanceId;
            Name = name;
            InstanceType = instanceType;
            ExpiryTimeUtc = expiryTimeUtc;
            CustomInit();
        }

        /// <summary>
        /// An initialization method that performs custom operations like setting defaults
        /// </summary>
        partial void CustomInit();

        /// <summary>
        /// Gets the unique ID for this instance.
        /// </summary>
        [JsonProperty(PropertyName = "instanceId")]
        public System.Guid? InstanceId { get; set; }

        /// <summary>
        /// Gets the instance name. (not persisted in store)
        /// </summary>
        [JsonProperty(PropertyName = "name")]
        public string Name { get; set; }

        /// <summary>
        /// Gets or sets possible values include: 'trial', 'sandbox',
        /// 'production'
        /// </summary>
        [JsonProperty(PropertyName = "instanceType")]
        public string InstanceType { get; set; }

        /// <summary>
        /// Gets the time the instance is set to expire. (not persisted in
        /// store)
        /// </summary>
        [JsonProperty(PropertyName = "expiryTimeUtc")]
        public System.DateTime? ExpiryTimeUtc { get; set; }

    }
}
