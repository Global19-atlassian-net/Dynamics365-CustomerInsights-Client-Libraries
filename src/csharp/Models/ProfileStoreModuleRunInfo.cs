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

    public partial class ProfileStoreModuleRunInfo
    {
        /// <summary>
        /// Initializes a new instance of the ProfileStoreModuleRunInfo class.
        /// </summary>
        public ProfileStoreModuleRunInfo()
        {
            CustomInit();
        }

        /// <summary>
        /// Initializes a new instance of the ProfileStoreModuleRunInfo class.
        /// </summary>
        /// <param name="runInfo">Gets the LastSuccessfulRunId for every
        /// fullyQualifiedEntity.</param>
        public ProfileStoreModuleRunInfo(IDictionary<string, string> runInfo = default(IDictionary<string, string>))
        {
            RunInfo = runInfo;
            CustomInit();
        }

        /// <summary>
        /// An initialization method that performs custom operations like setting defaults
        /// </summary>
        partial void CustomInit();

        /// <summary>
        /// Gets the LastSuccessfulRunId for every fullyQualifiedEntity.
        /// </summary>
        [JsonProperty(PropertyName = "runInfo")]
        public IDictionary<string, string> RunInfo { get; set; }

    }
}