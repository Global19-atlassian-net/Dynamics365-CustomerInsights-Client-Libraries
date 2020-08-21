// <auto-generated>
// Code generated by Microsoft (R) AutoRest Code Generator.
// Changes may cause incorrect behavior and will be lost if the code is
// regenerated.
// </auto-generated>

namespace Microsoft.Dynamics.CustomerInsights.Api.Models
{
    using Newtonsoft.Json;
    using System.Linq;

    public partial class ApiError
    {
        /// <summary>
        /// Initializes a new instance of the ApiError class.
        /// </summary>
        public ApiError()
        {
            CustomInit();
        }

        /// <summary>
        /// Initializes a new instance of the ApiError class.
        /// </summary>
        /// <param name="errorCode">Possible values include: 'notFound',
        /// 'ambiguousReference', 'malformedInput', 'serviceUnavailable',
        /// 'badRequest', 'notAllowed', 'conflict', 'locked',
        /// 'forbidden'</param>
        public ApiError(string errorCode = default(string), string message = default(string))
        {
            ErrorCode = errorCode;
            Message = message;
            CustomInit();
        }

        /// <summary>
        /// An initialization method that performs custom operations like setting defaults
        /// </summary>
        partial void CustomInit();

        /// <summary>
        /// Gets or sets possible values include: 'notFound',
        /// 'ambiguousReference', 'malformedInput', 'serviceUnavailable',
        /// 'badRequest', 'notAllowed', 'conflict', 'locked', 'forbidden'
        /// </summary>
        [JsonProperty(PropertyName = "errorCode")]
        public string ErrorCode { get; set; }

        /// <summary>
        /// </summary>
        [JsonProperty(PropertyName = "message")]
        public string Message { get; set; }

    }
}
