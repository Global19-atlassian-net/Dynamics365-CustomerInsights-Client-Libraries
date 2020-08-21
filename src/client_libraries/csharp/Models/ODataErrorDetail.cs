// <auto-generated>
// Code generated by Microsoft (R) AutoRest Code Generator.
// Changes may cause incorrect behavior and will be lost if the code is
// regenerated.
// </auto-generated>

namespace Microsoft.Dynamics.CustomerInsights.Api.Models
{
    using Newtonsoft.Json;
    using System.Linq;

    public partial class ODataErrorDetail
    {
        /// <summary>
        /// Initializes a new instance of the ODataErrorDetail class.
        /// </summary>
        public ODataErrorDetail()
        {
            CustomInit();
        }

        /// <summary>
        /// Initializes a new instance of the ODataErrorDetail class.
        /// </summary>
        public ODataErrorDetail(string errorCode = default(string), string message = default(string), string target = default(string))
        {
            ErrorCode = errorCode;
            Message = message;
            Target = target;
            CustomInit();
        }

        /// <summary>
        /// An initialization method that performs custom operations like setting defaults
        /// </summary>
        partial void CustomInit();

        /// <summary>
        /// </summary>
        [JsonProperty(PropertyName = "errorCode")]
        public string ErrorCode { get; set; }

        /// <summary>
        /// </summary>
        [JsonProperty(PropertyName = "message")]
        public string Message { get; set; }

        /// <summary>
        /// </summary>
        [JsonProperty(PropertyName = "target")]
        public string Target { get; set; }

    }
}
