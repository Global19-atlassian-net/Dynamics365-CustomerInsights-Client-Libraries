/**
 * Code generated by Microsoft (R) AutoRest Code Generator.
 * Changes may cause incorrect behavior and will be lost if the code is
 * regenerated.
 */

package com.microsoft.dynamics.customerinsights.apiclient.models;

import java.util.List;
import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * The IRelationshipMetadata model.
 */
public class IRelationshipMetadata {
    /**
     * The name property.
     */
    @JsonProperty(value = "name", access = JsonProperty.Access.WRITE_ONLY)
    private String name;

    /**
     * The friendlyName property.
     */
    @JsonProperty(value = "friendlyName", access = JsonProperty.Access.WRITE_ONLY)
    private String friendlyName;

    /**
     * The fromAttribute property.
     */
    @JsonProperty(value = "fromAttribute")
    private IAttributeMetadata fromAttribute;

    /**
     * The toAttribute property.
     */
    @JsonProperty(value = "toAttribute")
    private IAttributeMetadata toAttribute;

    /**
     * Possible values include: 'singleKeyRelationshipOrigin',
     * 'singleKeyRelationshipDestination', 'dataSourceLineageOrigin',
     * 'dataSourceLineageDestination'.
     */
    @JsonProperty(value = "relationshipType")
    private String relationshipType;

    /**
     * The dataSourceEntity property.
     */
    @JsonProperty(value = "dataSourceEntity")
    private IEntityMetadata dataSourceEntity;

    /**
     * The dataSourceMappingAttributes property.
     */
    @JsonProperty(value = "dataSourceMappingAttributes", access = JsonProperty.Access.WRITE_ONLY)
    private List<IAttributeMetadata> dataSourceMappingAttributes;

    /**
     * Get the name value.
     *
     * @return the name value
     */
    public String name() {
        return this.name;
    }

    /**
     * Get the friendlyName value.
     *
     * @return the friendlyName value
     */
    public String friendlyName() {
        return this.friendlyName;
    }

    /**
     * Get the fromAttribute value.
     *
     * @return the fromAttribute value
     */
    public IAttributeMetadata fromAttribute() {
        return this.fromAttribute;
    }

    /**
     * Set the fromAttribute value.
     *
     * @param fromAttribute the fromAttribute value to set
     * @return the IRelationshipMetadata object itself.
     */
    public IRelationshipMetadata withFromAttribute(IAttributeMetadata fromAttribute) {
        this.fromAttribute = fromAttribute;
        return this;
    }

    /**
     * Get the toAttribute value.
     *
     * @return the toAttribute value
     */
    public IAttributeMetadata toAttribute() {
        return this.toAttribute;
    }

    /**
     * Set the toAttribute value.
     *
     * @param toAttribute the toAttribute value to set
     * @return the IRelationshipMetadata object itself.
     */
    public IRelationshipMetadata withToAttribute(IAttributeMetadata toAttribute) {
        this.toAttribute = toAttribute;
        return this;
    }

    /**
     * Get possible values include: 'singleKeyRelationshipOrigin', 'singleKeyRelationshipDestination', 'dataSourceLineageOrigin', 'dataSourceLineageDestination'.
     *
     * @return the relationshipType value
     */
    public String relationshipType() {
        return this.relationshipType;
    }

    /**
     * Set possible values include: 'singleKeyRelationshipOrigin', 'singleKeyRelationshipDestination', 'dataSourceLineageOrigin', 'dataSourceLineageDestination'.
     *
     * @param relationshipType the relationshipType value to set
     * @return the IRelationshipMetadata object itself.
     */
    public IRelationshipMetadata withRelationshipType(String relationshipType) {
        this.relationshipType = relationshipType;
        return this;
    }

    /**
     * Get the dataSourceEntity value.
     *
     * @return the dataSourceEntity value
     */
    public IEntityMetadata dataSourceEntity() {
        return this.dataSourceEntity;
    }

    /**
     * Set the dataSourceEntity value.
     *
     * @param dataSourceEntity the dataSourceEntity value to set
     * @return the IRelationshipMetadata object itself.
     */
    public IRelationshipMetadata withDataSourceEntity(IEntityMetadata dataSourceEntity) {
        this.dataSourceEntity = dataSourceEntity;
        return this;
    }

    /**
     * Get the dataSourceMappingAttributes value.
     *
     * @return the dataSourceMappingAttributes value
     */
    public List<IAttributeMetadata> dataSourceMappingAttributes() {
        return this.dataSourceMappingAttributes;
    }

}
