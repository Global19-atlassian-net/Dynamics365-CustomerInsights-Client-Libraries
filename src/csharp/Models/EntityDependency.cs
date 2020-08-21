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
    /// Represents a reference to an entity
    /// </summary>
    public partial class EntityDependency
    {
        /// <summary>
        /// Initializes a new instance of the EntityDependency class.
        /// </summary>
        public EntityDependency()
        {
            CustomInit();
        }

        /// <summary>
        /// Initializes a new instance of the EntityDependency class.
        /// </summary>
        /// <param name="qualifiedEntityName">Gets the qualified entity
        /// name.</param>
        /// <param name="type">Possible values include: 'unspecified',
        /// 'profile', 'conflationMap', 'activity', 'aggregateKpi',
        /// 'profileKpi', 'unifiedActivity', 'segment', 'intelligence',
        /// 'genericPrediction', 'enrichment', 'insights', 'derivedEntity',
        /// 'quarantine'</param>
        /// <param name="attributeNames">Gets the list of attributes included
        /// in the dependency.</param>
        /// <param name="relationshipNames">Gets the list of relationships
        /// included in the dependency</param>
        public EntityDependency(string qualifiedEntityName = default(string), string type = default(string), IList<string> attributeNames = default(IList<string>), IList<string> relationshipNames = default(IList<string>))
        {
            QualifiedEntityName = qualifiedEntityName;
            Type = type;
            AttributeNames = attributeNames;
            RelationshipNames = relationshipNames;
            CustomInit();
        }

        /// <summary>
        /// An initialization method that performs custom operations like setting defaults
        /// </summary>
        partial void CustomInit();

        /// <summary>
        /// Gets the qualified entity name.
        /// </summary>
        [JsonProperty(PropertyName = "qualifiedEntityName")]
        public string QualifiedEntityName { get; set; }

        /// <summary>
        /// Gets or sets possible values include: 'unspecified', 'profile',
        /// 'conflationMap', 'activity', 'aggregateKpi', 'profileKpi',
        /// 'unifiedActivity', 'segment', 'intelligence', 'genericPrediction',
        /// 'enrichment', 'insights', 'derivedEntity', 'quarantine'
        /// </summary>
        [JsonProperty(PropertyName = "type")]
        public string Type { get; set; }

        /// <summary>
        /// Gets the list of attributes included in the dependency.
        /// </summary>
        [JsonProperty(PropertyName = "attributeNames")]
        public IList<string> AttributeNames { get; set; }

        /// <summary>
        /// Gets the list of relationships included in the dependency
        /// </summary>
        [JsonProperty(PropertyName = "relationshipNames")]
        public IList<string> RelationshipNames { get; set; }

    }
}