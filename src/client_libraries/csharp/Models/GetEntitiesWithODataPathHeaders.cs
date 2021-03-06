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
    /// Defines headers for Get-entities-with-OData-path operation.
    /// </summary>
    public partial class GetEntitiesWithODataPathHeaders
    {
        /// <summary>
        /// Initializes a new instance of the GetEntitiesWithODataPathHeaders
        /// class.
        /// </summary>
        public GetEntitiesWithODataPathHeaders()
        {
            CustomInit();
        }

        /// <summary>
        /// Initializes a new instance of the GetEntitiesWithODataPathHeaders
        /// class.
        /// </summary>
        /// <param name="wWWAuthenticate">Bearer</param>
        public GetEntitiesWithODataPathHeaders(string wWWAuthenticate = default(string))
        {
            WWWAuthenticate = wWWAuthenticate;
            CustomInit();
        }

        /// <summary>
        /// An initialization method that performs custom operations like setting defaults
        /// </summary>
        partial void CustomInit();

        /// <summary>
        /// Gets or sets bearer
        /// </summary>
        [JsonProperty(PropertyName = "WWW-Authenticate")]
        public string WWWAuthenticate { get; set; }

    }
}
