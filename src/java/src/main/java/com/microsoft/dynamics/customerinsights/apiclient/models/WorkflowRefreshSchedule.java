/**
 * Code generated by Microsoft (R) AutoRest Code Generator.
 * Changes may cause incorrect behavior and will be lost if the code is
 * regenerated.
 */

package com.microsoft.dynamics.customerinsights.apiclient.models;

import java.util.List;
import java.util.UUID;
import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * Represents a DAG refresh schedule.
 */
public class WorkflowRefreshSchedule {
    /**
     * Possible values include: 'none', 'ingestion', 'derivedEntity',
     * 'dataPreparation', 'map', 'match', 'merge', 'profileStore', 'search',
     * 'activity', 'attributeMeasures', 'entityMeasures', 'measures',
     * 'segmentation', 'enrichment', 'intelligence', 'aiBuilder', 'insights',
     * 'export', 'modelManagement', 'relationship', 'roleAssignment',
     * 'analysis', 'all'.
     */
    @JsonProperty(value = "operationType")
    private String operationType;

    /**
     * Possible values include: 'templatedMeasures', 'createAnalysisModel',
     * 'linkAnalysisModel'.
     */
    @JsonProperty(value = "subType")
    private String subType;

    /**
     * Gets the identifiers of the schedule.
     */
    @JsonProperty(value = "identifiers")
    private List<String> identifiers;

    /**
     * Possible values include: 'full', 'incremental'.
     */
    @JsonProperty(value = "jobType")
    private String jobType;

    /**
     * Gets a value indicating whether the schedule is active.
     */
    @JsonProperty(value = "isActive", access = JsonProperty.Access.WRITE_ONLY)
    private Boolean isActive;

    /**
     * Gets the ID of the timezone.
     */
    @JsonProperty(value = "timezoneId", access = JsonProperty.Access.WRITE_ONLY)
    private String timezoneId;

    /**
     * Gets the schedule in CRON format.
     */
    @JsonProperty(value = "cronSchedules", access = JsonProperty.Access.WRITE_ONLY)
    private List<String> cronSchedules;

    /**
     * Gets the ID of the schedule.
     */
    @JsonProperty(value = "scheduleId", access = JsonProperty.Access.WRITE_ONLY)
    private UUID scheduleId;

    /**
     * Gets the Customer Insights instance id associated with this object.
     */
    @JsonProperty(value = "instanceId", access = JsonProperty.Access.WRITE_ONLY)
    private UUID instanceId;

    /**
     * Get possible values include: 'none', 'ingestion', 'derivedEntity', 'dataPreparation', 'map', 'match', 'merge', 'profileStore', 'search', 'activity', 'attributeMeasures', 'entityMeasures', 'measures', 'segmentation', 'enrichment', 'intelligence', 'aiBuilder', 'insights', 'export', 'modelManagement', 'relationship', 'roleAssignment', 'analysis', 'all'.
     *
     * @return the operationType value
     */
    public String operationType() {
        return this.operationType;
    }

    /**
     * Set possible values include: 'none', 'ingestion', 'derivedEntity', 'dataPreparation', 'map', 'match', 'merge', 'profileStore', 'search', 'activity', 'attributeMeasures', 'entityMeasures', 'measures', 'segmentation', 'enrichment', 'intelligence', 'aiBuilder', 'insights', 'export', 'modelManagement', 'relationship', 'roleAssignment', 'analysis', 'all'.
     *
     * @param operationType the operationType value to set
     * @return the WorkflowRefreshSchedule object itself.
     */
    public WorkflowRefreshSchedule withOperationType(String operationType) {
        this.operationType = operationType;
        return this;
    }

    /**
     * Get possible values include: 'templatedMeasures', 'createAnalysisModel', 'linkAnalysisModel'.
     *
     * @return the subType value
     */
    public String subType() {
        return this.subType;
    }

    /**
     * Set possible values include: 'templatedMeasures', 'createAnalysisModel', 'linkAnalysisModel'.
     *
     * @param subType the subType value to set
     * @return the WorkflowRefreshSchedule object itself.
     */
    public WorkflowRefreshSchedule withSubType(String subType) {
        this.subType = subType;
        return this;
    }

    /**
     * Get gets the identifiers of the schedule.
     *
     * @return the identifiers value
     */
    public List<String> identifiers() {
        return this.identifiers;
    }

    /**
     * Set gets the identifiers of the schedule.
     *
     * @param identifiers the identifiers value to set
     * @return the WorkflowRefreshSchedule object itself.
     */
    public WorkflowRefreshSchedule withIdentifiers(List<String> identifiers) {
        this.identifiers = identifiers;
        return this;
    }

    /**
     * Get possible values include: 'full', 'incremental'.
     *
     * @return the jobType value
     */
    public String jobType() {
        return this.jobType;
    }

    /**
     * Set possible values include: 'full', 'incremental'.
     *
     * @param jobType the jobType value to set
     * @return the WorkflowRefreshSchedule object itself.
     */
    public WorkflowRefreshSchedule withJobType(String jobType) {
        this.jobType = jobType;
        return this;
    }

    /**
     * Get gets a value indicating whether the schedule is active.
     *
     * @return the isActive value
     */
    public Boolean isActive() {
        return this.isActive;
    }

    /**
     * Get gets the ID of the timezone.
     *
     * @return the timezoneId value
     */
    public String timezoneId() {
        return this.timezoneId;
    }

    /**
     * Get gets the schedule in CRON format.
     *
     * @return the cronSchedules value
     */
    public List<String> cronSchedules() {
        return this.cronSchedules;
    }

    /**
     * Get gets the ID of the schedule.
     *
     * @return the scheduleId value
     */
    public UUID scheduleId() {
        return this.scheduleId;
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