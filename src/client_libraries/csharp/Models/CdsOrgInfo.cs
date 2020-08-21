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
    /// The information for CDS Organization in BAP
    /// </summary>
    public partial class CdsOrgInfo
    {
        /// <summary>
        /// Initializes a new instance of the CdsOrgInfo class.
        /// </summary>
        public CdsOrgInfo()
        {
            CustomInit();
        }

        /// <summary>
        /// Initializes a new instance of the CdsOrgInfo class.
        /// </summary>
        /// <param name="friendlyName">Gets the Cds Organization Friendly
        /// Name</param>
        /// <param name="url">Gets the Cds Organization Url</param>
        /// <param name="state">Gets the Cds Organization State</param>
        public CdsOrgInfo(string friendlyName = default(string), string url = default(string), string state = default(string))
        {
            FriendlyName = friendlyName;
            Url = url;
            State = state;
            CustomInit();
        }

        /// <summary>
        /// An initialization method that performs custom operations like setting defaults
        /// </summary>
        partial void CustomInit();

        /// <summary>
        /// Gets the Cds Organization Friendly Name
        /// </summary>
        [JsonProperty(PropertyName = "friendlyName")]
        public string FriendlyName { get; set; }

        /// <summary>
        /// Gets the Cds Organization Url
        /// </summary>
        [JsonProperty(PropertyName = "url")]
        public string Url { get; set; }

        /// <summary>
        /// Gets the Cds Organization State
        /// </summary>
        [JsonProperty(PropertyName = "state")]
        public string State { get; set; }

    }
}
