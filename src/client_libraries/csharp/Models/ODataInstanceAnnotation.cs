// <auto-generated>
// Code generated by Microsoft (R) AutoRest Code Generator.
// Changes may cause incorrect behavior and will be lost if the code is
// regenerated.
// </auto-generated>

namespace Microsoft.Dynamics.CustomerInsights.Api.Models
{
    using Newtonsoft.Json;
    using System.Linq;

    public partial class ODataInstanceAnnotation
    {
        /// <summary>
        /// Initializes a new instance of the ODataInstanceAnnotation class.
        /// </summary>
        public ODataInstanceAnnotation()
        {
            CustomInit();
        }

        /// <summary>
        /// Initializes a new instance of the ODataInstanceAnnotation class.
        /// </summary>
        public ODataInstanceAnnotation(string name = default(string), ODataValue value = default(ODataValue), ODataTypeAnnotation typeAnnotation = default(ODataTypeAnnotation))
        {
            Name = name;
            Value = value;
            TypeAnnotation = typeAnnotation;
            CustomInit();
        }

        /// <summary>
        /// An initialization method that performs custom operations like setting defaults
        /// </summary>
        partial void CustomInit();

        /// <summary>
        /// </summary>
        [JsonProperty(PropertyName = "name")]
        public string Name { get; set; }

        /// <summary>
        /// </summary>
        [JsonProperty(PropertyName = "value")]
        public ODataValue Value { get; set; }

        /// <summary>
        /// </summary>
        [JsonProperty(PropertyName = "typeAnnotation")]
        public ODataTypeAnnotation TypeAnnotation { get; set; }

    }
}
