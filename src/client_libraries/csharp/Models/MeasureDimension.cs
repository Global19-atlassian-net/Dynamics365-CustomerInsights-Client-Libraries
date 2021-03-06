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
    /// Represents a dimension
    /// </summary>
    public partial class MeasureDimension
    {
        /// <summary>
        /// Initializes a new instance of the MeasureDimension class.
        /// </summary>
        public MeasureDimension()
        {
            CustomInit();
        }

        /// <summary>
        /// Initializes a new instance of the MeasureDimension class.
        /// </summary>
        /// <param name="field">Gets the field on which group by will be
        /// applied</param>
        /// <param name="alias">Gets the alias for the field</param>
        /// <param name="displayName">Gets the display name for the
        /// dimension</param>
        /// <param name="order">Gets the order for the dimension</param>
        /// <param name="bucket">Possible values include: 'none', 'day',
        /// 'month', 'year'</param>
        /// <param name="isReadOnly">Gets a value indicating whether the
        /// dimension is readonly or not</param>
        public MeasureDimension(string field = default(string), string alias = default(string), string displayName = default(string), int? order = default(int?), string bucket = default(string), bool? isReadOnly = default(bool?))
        {
            Field = field;
            Alias = alias;
            DisplayName = displayName;
            Order = order;
            Bucket = bucket;
            IsReadOnly = isReadOnly;
            CustomInit();
        }

        /// <summary>
        /// An initialization method that performs custom operations like setting defaults
        /// </summary>
        partial void CustomInit();

        /// <summary>
        /// Gets the field on which group by will be applied
        /// </summary>
        [JsonProperty(PropertyName = "field")]
        public string Field { get; set; }

        /// <summary>
        /// Gets the alias for the field
        /// </summary>
        [JsonProperty(PropertyName = "alias")]
        public string Alias { get; set; }

        /// <summary>
        /// Gets the display name for the dimension
        /// </summary>
        [JsonProperty(PropertyName = "displayName")]
        public string DisplayName { get; set; }

        /// <summary>
        /// Gets the order for the dimension
        /// </summary>
        [JsonProperty(PropertyName = "order")]
        public int? Order { get; set; }

        /// <summary>
        /// Gets or sets possible values include: 'none', 'day', 'month',
        /// 'year'
        /// </summary>
        [JsonProperty(PropertyName = "bucket")]
        public string Bucket { get; set; }

        /// <summary>
        /// Gets a value indicating whether the dimension is readonly or not
        /// </summary>
        [JsonProperty(PropertyName = "isReadOnly")]
        public bool? IsReadOnly { get; set; }

    }
}
