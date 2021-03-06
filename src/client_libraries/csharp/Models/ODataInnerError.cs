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

    public partial class ODataInnerError
    {
        /// <summary>
        /// Initializes a new instance of the ODataInnerError class.
        /// </summary>
        public ODataInnerError()
        {
            CustomInit();
        }

        /// <summary>
        /// Initializes a new instance of the ODataInnerError class.
        /// </summary>
        public ODataInnerError(IDictionary<string, ODataValue> properties = default(IDictionary<string, ODataValue>), string message = default(string), string typeName = default(string), string stackTrace = default(string), ODataInnerError innerError = default(ODataInnerError))
        {
            Properties = properties;
            Message = message;
            TypeName = typeName;
            StackTrace = stackTrace;
            InnerError = innerError;
            CustomInit();
        }

        /// <summary>
        /// An initialization method that performs custom operations like setting defaults
        /// </summary>
        partial void CustomInit();

        /// <summary>
        /// </summary>
        [JsonProperty(PropertyName = "properties")]
        public IDictionary<string, ODataValue> Properties { get; set; }

        /// <summary>
        /// </summary>
        [JsonProperty(PropertyName = "message")]
        public string Message { get; set; }

        /// <summary>
        /// </summary>
        [JsonProperty(PropertyName = "typeName")]
        public string TypeName { get; set; }

        /// <summary>
        /// </summary>
        [JsonProperty(PropertyName = "stackTrace")]
        public string StackTrace { get; set; }

        /// <summary>
        /// </summary>
        [JsonProperty(PropertyName = "innerError")]
        public ODataInnerError InnerError { get; set; }

    }
}
