/**
 * Code generated by Microsoft (R) AutoRest Code Generator.
 * Changes may cause incorrect behavior and will be lost if the code is
 * regenerated.
 */

package com.microsoft.dynamics.customerinsights.apiclient.models;

import java.util.List;
import org.joda.time.DateTime;
import java.util.UUID;
import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * Represents search configuration of an instance.
 */
public class InstanceSearchConfiguration {
    /**
     * Gets search configurations for entities.
     */
    @JsonProperty(value = "entityConfig")
    private List<EntitySearchConfiguration> entityConfig;

    /**
     * Gets a value indicating whether the configuration was system generated.
     */
    @JsonProperty(value = "isSystemGenerated")
    private Boolean isSystemGenerated;

    /**
     * Gets the version number of this object.
     */
    @JsonProperty(value = "version", access = JsonProperty.Access.WRITE_ONLY)
    private Long version;

    /**
     * Gets the UPN of the user who last updated this record.
     */
    @JsonProperty(value = "updatedBy", access = JsonProperty.Access.WRITE_ONLY)
    private String updatedBy;

    /**
     * Gets the time the object was last updated.
     */
    @JsonProperty(value = "updatedUtc", access = JsonProperty.Access.WRITE_ONLY)
    private DateTime updatedUtc;

    /**
     * Gets the email address of the user who created this record.
     */
    @JsonProperty(value = "createdBy", access = JsonProperty.Access.WRITE_ONLY)
    private String createdBy;

    /**
     * Gets the time the object was initially created.
     */
    @JsonProperty(value = "createdUtc", access = JsonProperty.Access.WRITE_ONLY)
    private DateTime createdUtc;

    /**
     * Gets the Customer Insights instance id associated with this object.
     */
    @JsonProperty(value = "instanceId", access = JsonProperty.Access.WRITE_ONLY)
    private UUID instanceId;

    /**
     * Get gets search configurations for entities.
     *
     * @return the entityConfig value
     */
    public List<EntitySearchConfiguration> entityConfig() {
        return this.entityConfig;
    }

    /**
     * Set gets search configurations for entities.
     *
     * @param entityConfig the entityConfig value to set
     * @return the InstanceSearchConfiguration object itself.
     */
    public InstanceSearchConfiguration withEntityConfig(List<EntitySearchConfiguration> entityConfig) {
        this.entityConfig = entityConfig;
        return this;
    }

    /**
     * Get gets a value indicating whether the configuration was system generated.
     *
     * @return the isSystemGenerated value
     */
    public Boolean isSystemGenerated() {
        return this.isSystemGenerated;
    }

    /**
     * Set gets a value indicating whether the configuration was system generated.
     *
     * @param isSystemGenerated the isSystemGenerated value to set
     * @return the InstanceSearchConfiguration object itself.
     */
    public InstanceSearchConfiguration withIsSystemGenerated(Boolean isSystemGenerated) {
        this.isSystemGenerated = isSystemGenerated;
        return this;
    }

    /**
     * Get gets the version number of this object.
     *
     * @return the version value
     */
    public Long version() {
        return this.version;
    }

    /**
     * Get gets the UPN of the user who last updated this record.
     *
     * @return the updatedBy value
     */
    public String updatedBy() {
        return this.updatedBy;
    }

    /**
     * Get gets the time the object was last updated.
     *
     * @return the updatedUtc value
     */
    public DateTime updatedUtc() {
        return this.updatedUtc;
    }

    /**
     * Get gets the email address of the user who created this record.
     *
     * @return the createdBy value
     */
    public String createdBy() {
        return this.createdBy;
    }

    /**
     * Get gets the time the object was initially created.
     *
     * @return the createdUtc value
     */
    public DateTime createdUtc() {
        return this.createdUtc;
    }

    /**
     * Get gets the Customer Insights instance id associated with this object.
     *
     * @return the instanceId value
     */
    public UUID instanceId() {
        return this.instanceId;
    }

}