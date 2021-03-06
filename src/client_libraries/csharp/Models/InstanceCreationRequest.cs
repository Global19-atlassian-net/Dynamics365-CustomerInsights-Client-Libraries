// <auto-generated>
// Code generated by Microsoft (R) AutoRest Code Generator.
// Changes may cause incorrect behavior and will be lost if the code is
// regenerated.
// </auto-generated>

namespace Microsoft.Dynamics.CustomerInsights.Api.Models
{
    using Newtonsoft.Json;
    using System.Linq;

    public partial class InstanceCreationRequest
    {
        /// <summary>
        /// Initializes a new instance of the InstanceCreationRequest class.
        /// </summary>
        public InstanceCreationRequest()
        {
            CustomInit();
        }

        /// <summary>
        /// Initializes a new instance of the InstanceCreationRequest class.
        /// </summary>
        /// <param name="bapProvisioningType">Possible values include: 'skip',
        /// 'create', 'attach'</param>
        public InstanceCreationRequest(InstanceMetadata instanceMetadata = default(InstanceMetadata), ResourceMetadata byosaResourceMetadata = default(ResourceMetadata), ResourceMetadata cdsResourceMetadata = default(ResourceMetadata), string bapProvisioningType = default(string))
        {
            InstanceMetadata = instanceMetadata;
            ByosaResourceMetadata = byosaResourceMetadata;
            CdsResourceMetadata = cdsResourceMetadata;
            BapProvisioningType = bapProvisioningType;
            CustomInit();
        }

        /// <summary>
        /// An initialization method that performs custom operations like setting defaults
        /// </summary>
        partial void CustomInit();

        /// <summary>
        /// </summary>
        [JsonProperty(PropertyName = "instanceMetadata")]
        public InstanceMetadata InstanceMetadata { get; set; }

        /// <summary>
        /// </summary>
        [JsonProperty(PropertyName = "byosaResourceMetadata")]
        public ResourceMetadata ByosaResourceMetadata { get; set; }

        /// <summary>
        /// </summary>
        [JsonProperty(PropertyName = "cdsResourceMetadata")]
        public ResourceMetadata CdsResourceMetadata { get; set; }

        /// <summary>
        /// Gets or sets possible values include: 'skip', 'create', 'attach'
        /// </summary>
        [JsonProperty(PropertyName = "bapProvisioningType")]
        public string BapProvisioningType { get; set; }

    }
}
