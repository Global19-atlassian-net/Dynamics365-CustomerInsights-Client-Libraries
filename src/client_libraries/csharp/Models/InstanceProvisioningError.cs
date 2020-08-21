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
    /// Represents an instance provisioning error
    /// </summary>
    public partial class InstanceProvisioningError
    {
        /// <summary>
        /// Initializes a new instance of the InstanceProvisioningError class.
        /// </summary>
        public InstanceProvisioningError()
        {
            CustomInit();
        }

        /// <summary>
        /// Initializes a new instance of the InstanceProvisioningError class.
        /// </summary>
        /// <param name="errorCode">Possible values include:
        /// 'invalidDynamics365DataSourceCredentials',
        /// 'invalidSalesforceDataSourceCredentials', 'internalError',
        /// 'bapCannotCreateEnvironment'</param>
        /// <param name="errorArgs">Gets string formatting arguments for the
        /// provisioning error</param>
        public InstanceProvisioningError(string errorCode = default(string), IList<string> errorArgs = default(IList<string>))
        {
            ErrorCode = errorCode;
            ErrorArgs = errorArgs;
            CustomInit();
        }

        /// <summary>
        /// An initialization method that performs custom operations like setting defaults
        /// </summary>
        partial void CustomInit();

        /// <summary>
        /// Gets or sets possible values include:
        /// 'invalidDynamics365DataSourceCredentials',
        /// 'invalidSalesforceDataSourceCredentials', 'internalError',
        /// 'bapCannotCreateEnvironment'
        /// </summary>
        [JsonProperty(PropertyName = "errorCode")]
        public string ErrorCode { get; set; }

        /// <summary>
        /// Gets string formatting arguments for the provisioning error
        /// </summary>
        [JsonProperty(PropertyName = "errorArgs")]
        public IList<string> ErrorArgs { get; set; }

    }
}
