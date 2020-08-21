/**
 * Code generated by Microsoft (R) AutoRest Code Generator.
 * Changes may cause incorrect behavior and will be lost if the code is
 * regenerated.
 */

package com.microsoft.dynamics.customerinsights.apiclient.models;

import java.util.List;
import java.util.UUID;
import org.joda.time.DateTime;
import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * Represents metadata for a Customer Insights data source.
 */
public class DataSourceMetadata {
    /**
     * Possible values include: 'salesforce', 'dynamics365', 'powerQuery',
     * 'attachCdm', 'attachCds', 'powerPlatform', 'datahub'.
     */
    @JsonProperty(value = "kind")
    private String kind;

    /**
     * The isActive property.
     */
    @JsonProperty(value = "isActive", access = JsonProperty.Access.WRITE_ONLY)
    private Boolean isActive;

    /**
     * The entityNames property.
     */
    @JsonProperty(value = "entityNames", access = JsonProperty.Access.WRITE_ONLY)
    private List<String> entityNames;

    /**
     * Gets the unique identity for this object.
     */
    @JsonProperty(value = "dataSourceId", access = JsonProperty.Access.WRITE_ONLY)
    private UUID dataSourceId;

    /**
     * Gets the unique name of the dataSource.
     */
    @JsonProperty(value = "name", access = JsonProperty.Access.WRITE_ONLY)
    private String name;

    /**
     * Gets the friendlyName of the dataSource.
     */
    @JsonProperty(value = "friendlyName", access = JsonProperty.Access.WRITE_ONLY)
    private String friendlyName;

    /**
     * Gets the entity information, by entity name.
     */
    @JsonProperty(value = "entityInformation", access = JsonProperty.Access.WRITE_ONLY)
    private List<DatasourceEntityInformation> entityInformation;

    /**
     * Possible values include: 'new', 'creating', 'active', 'createFailed',
     * 'updateFailed', 'deleting', 'refreshCredentials',
     * 'resetInstanceInProgress'.
     */
    @JsonProperty(value = "provisioningState")
    private String provisioningState;

    /**
     * Gets the time datasource was last refreshed.
     */
    @JsonProperty(value = "lastRefresh", access = JsonProperty.Access.WRITE_ONLY)
    private DateTime lastRefresh;

    /**
     * Possible values include: 'notUpdated', 'updated', 'updating',
     * 'updateFailed', 'updateCancelled'.
     */
    @JsonProperty(value = "refreshState")
    private String refreshState;

    /**
     * Gets the Incremental refresh properties for entities.
     */
    @JsonProperty(value = "incrementalRefreshProperties", access = JsonProperty.Access.WRITE_ONLY)
    private List<IncrementalRefreshProperties> incrementalRefreshProperties;

    /**
     * Gets the model path for CDM data source.
     */
    @JsonProperty(value = "modelJsonPath", access = JsonProperty.Access.WRITE_ONLY)
    private String modelJsonPath;

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
     * Get possible values include: 'salesforce', 'dynamics365', 'powerQuery', 'attachCdm', 'attachCds', 'powerPlatform', 'datahub'.
     *
     * @return the kind value
     */
    public String kind() {
        return this.kind;
    }

    /**
     * Set possible values include: 'salesforce', 'dynamics365', 'powerQuery', 'attachCdm', 'attachCds', 'powerPlatform', 'datahub'.
     *
     * @param kind the kind value to set
     * @return the DataSourceMetadata object itself.
     */
    public DataSourceMetadata withKind(String kind) {
        this.kind = kind;
        return this;
    }

    /**
     * Get the isActive value.
     *
     * @return the isActive value
     */
    public Boolean isActive() {
        return this.isActive;
    }

    /**
     * Get the entityNames value.
     *
     * @return the entityNames value
     */
    public List<String> entityNames() {
        return this.entityNames;
    }

    /**
     * Get gets the unique identity for this object.
     *
     * @return the dataSourceId value
     */
    public UUID dataSourceId() {
        return this.dataSourceId;
    }

    /**
     * Get gets the unique name of the dataSource.
     *
     * @return the name value
     */
    public String name() {
        return this.name;
    }

    /**
     * Get gets the friendlyName of the dataSource.
     *
     * @return the friendlyName value
     */
    public String friendlyName() {
        return this.friendlyName;
    }

    /**
     * Get gets the entity information, by entity name.
     *
     * @return the entityInformation value
     */
    public List<DatasourceEntityInformation> entityInformation() {
        return this.entityInformation;
    }

    /**
     * Get possible values include: 'new', 'creating', 'active', 'createFailed', 'updateFailed', 'deleting', 'refreshCredentials', 'resetInstanceInProgress'.
     *
     * @return the provisioningState value
     */
    public String provisioningState() {
        return this.provisioningState;
    }

    /**
     * Set possible values include: 'new', 'creating', 'active', 'createFailed', 'updateFailed', 'deleting', 'refreshCredentials', 'resetInstanceInProgress'.
     *
     * @param provisioningState the provisioningState value to set
     * @return the DataSourceMetadata object itself.
     */
    public DataSourceMetadata withProvisioningState(String provisioningState) {
        this.provisioningState = provisioningState;
        return this;
    }

    /**
     * Get gets the time datasource was last refreshed.
     *
     * @return the lastRefresh value
     */
    public DateTime lastRefresh() {
        return this.lastRefresh;
    }

    /**
     * Get possible values include: 'notUpdated', 'updated', 'updating', 'updateFailed', 'updateCancelled'.
     *
     * @return the refreshState value
     */
    public String refreshState() {
        return this.refreshState;
    }

    /**
     * Set possible values include: 'notUpdated', 'updated', 'updating', 'updateFailed', 'updateCancelled'.
     *
     * @param refreshState the refreshState value to set
     * @return the DataSourceMetadata object itself.
     */
    public DataSourceMetadata withRefreshState(String refreshState) {
        this.refreshState = refreshState;
        return this;
    }

    /**
     * Get gets the Incremental refresh properties for entities.
     *
     * @return the incrementalRefreshProperties value
     */
    public List<IncrementalRefreshProperties> incrementalRefreshProperties() {
        return this.incrementalRefreshProperties;
    }

    /**
     * Get gets the model path for CDM data source.
     *
     * @return the modelJsonPath value
     */
    public String modelJsonPath() {
        return this.modelJsonPath;
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
