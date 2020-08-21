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
    /// The information for a trial instance
    /// </summary>
    public partial class TrialInfo
    {
        /// <summary>
        /// Initializes a new instance of the TrialInfo class.
        /// </summary>
        public TrialInfo()
        {
            CustomInit();
        }

        /// <summary>
        /// Initializes a new instance of the TrialInfo class.
        /// </summary>
        /// <param name="helpSectionsVisited">Gets the list of section were
        /// helped is disabled</param>
        /// <param name="hasCompletedInitialIngestion">Gets a value indicating
        /// whether the initial ingestion has completed</param>
        /// <param name="trialActivated">Gets a value indicating whether the
        /// trial environment is activated or not</param>
        public TrialInfo(IList<string> helpSectionsVisited = default(IList<string>), bool? hasCompletedInitialIngestion = default(bool?), bool? trialActivated = default(bool?))
        {
            HelpSectionsVisited = helpSectionsVisited;
            HasCompletedInitialIngestion = hasCompletedInitialIngestion;
            TrialActivated = trialActivated;
            CustomInit();
        }

        /// <summary>
        /// An initialization method that performs custom operations like setting defaults
        /// </summary>
        partial void CustomInit();

        /// <summary>
        /// Gets the list of section were helped is disabled
        /// </summary>
        [JsonProperty(PropertyName = "helpSectionsVisited")]
        public IList<string> HelpSectionsVisited { get; set; }

        /// <summary>
        /// Gets a value indicating whether the initial ingestion has completed
        /// </summary>
        [JsonProperty(PropertyName = "hasCompletedInitialIngestion")]
        public bool? HasCompletedInitialIngestion { get; set; }

        /// <summary>
        /// Gets a value indicating whether the trial environment is activated
        /// or not
        /// </summary>
        [JsonProperty(PropertyName = "trialActivated")]
        public bool? TrialActivated { get; set; }

    }
}
