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
    /// Represents the measure evaluation details for a particular measure. It
    /// includes various properties pertaining to an
    /// evaluation including the measure name, orchestrationId, start time,
    /// state, errors (if-any) etc. This latest evaluation
    /// is stored in the measure metadata, while historical copies are written
    /// to table storage.
    /// </summary>
    public partial class Evaluation
    {
        /// <summary>
        /// Initializes a new instance of the Evaluation class.
        /// </summary>
        public Evaluation()
        {
            CustomInit();
        }

        /// <summary>
        /// Initializes a new instance of the Evaluation class.
        /// </summary>
        /// <param name="state">Possible values include: 'none', 'running',
        /// 'failed', 'completed'</param>
        /// <param name="endTime">Gets or sets the evaluation completion
        /// time.</param>
        /// <param name="error">Gets or sets the error (if any) that occured
        /// during the measure evaluation.</param>
        public Evaluation(System.Guid? lastSuccessfulRunId = default(System.Guid?), string state = default(string), System.DateTime? endTime = default(System.DateTime?), string error = default(string))
        {
            LastSuccessfulRunId = lastSuccessfulRunId;
            State = state;
            EndTime = endTime;
            Error = error;
            CustomInit();
        }

        /// <summary>
        /// An initialization method that performs custom operations like setting defaults
        /// </summary>
        partial void CustomInit();

        /// <summary>
        /// </summary>
        [JsonProperty(PropertyName = "lastSuccessfulRunId")]
        public System.Guid? LastSuccessfulRunId { get; set; }

        /// <summary>
        /// Gets or sets possible values include: 'none', 'running', 'failed',
        /// 'completed'
        /// </summary>
        [JsonProperty(PropertyName = "state")]
        public string State { get; set; }

        /// <summary>
        /// Gets or sets the evaluation completion time.
        /// </summary>
        [JsonProperty(PropertyName = "endTime")]
        public System.DateTime? EndTime { get; set; }

        /// <summary>
        /// Gets or sets the error (if any) that occured during the measure
        /// evaluation.
        /// </summary>
        [JsonProperty(PropertyName = "error")]
        public string Error { get; set; }

    }
}