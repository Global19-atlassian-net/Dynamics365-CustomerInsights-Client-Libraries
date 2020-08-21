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
    /// Represents a set of variable conditions to apply to a MeasureVariable.
    /// </summary>
    public partial class MeasureVariableConditionGroup
    {
        /// <summary>
        /// Initializes a new instance of the MeasureVariableConditionGroup
        /// class.
        /// </summary>
        public MeasureVariableConditionGroup()
        {
            CustomInit();
        }

        /// <summary>
        /// Initializes a new instance of the MeasureVariableConditionGroup
        /// class.
        /// </summary>
        /// <param name="name">Attribute to use in condition.</param>
        /// <param name="conditions">Gets the
        /// MeasureVariableConditions.</param>
        public MeasureVariableConditionGroup(string name = default(string), IList<MeasureVariableCondition> conditions = default(IList<MeasureVariableCondition>))
        {
            Name = name;
            Conditions = conditions;
            CustomInit();
        }

        /// <summary>
        /// An initialization method that performs custom operations like setting defaults
        /// </summary>
        partial void CustomInit();

        /// <summary>
        /// Gets or sets attribute to use in condition.
        /// </summary>
        [JsonProperty(PropertyName = "name")]
        public string Name { get; set; }

        /// <summary>
        /// Gets the MeasureVariableConditions.
        /// </summary>
        [JsonProperty(PropertyName = "conditions")]
        public IList<MeasureVariableCondition> Conditions { get; set; }

    }
}
