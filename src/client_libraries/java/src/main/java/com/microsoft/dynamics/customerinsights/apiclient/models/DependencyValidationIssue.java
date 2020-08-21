/**
 * Code generated by Microsoft (R) AutoRest Code Generator.
 * Changes may cause incorrect behavior and will be lost if the code is
 * regenerated.
 */

package com.microsoft.dynamics.customerinsights.apiclient.models;

import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * The DependencyValidationIssue model.
 */
public class DependencyValidationIssue {
    /**
     * Possible values include: 'mapInvalid', 'matchRuleInvalid',
     * 'mergePolicyInvalid', 'relationshipInvalid', 'measureDefinitionInvalid',
     * 'segmentDefinitionInvalid', 'unifiedActivitiyMappingInvalid', 'generic'.
     */
    @JsonProperty(value = "type")
    private String type;

    /**
     * Possible values include: 'error', 'warning'.
     */
    @JsonProperty(value = "severity")
    private String severity;

    /**
     * The id property.
     */
    @JsonProperty(value = "id")
    private String id;

    /**
     * The description property.
     */
    @JsonProperty(value = "description")
    private String description;

    /**
     * Get possible values include: 'mapInvalid', 'matchRuleInvalid', 'mergePolicyInvalid', 'relationshipInvalid', 'measureDefinitionInvalid', 'segmentDefinitionInvalid', 'unifiedActivitiyMappingInvalid', 'generic'.
     *
     * @return the type value
     */
    public String type() {
        return this.type;
    }

    /**
     * Set possible values include: 'mapInvalid', 'matchRuleInvalid', 'mergePolicyInvalid', 'relationshipInvalid', 'measureDefinitionInvalid', 'segmentDefinitionInvalid', 'unifiedActivitiyMappingInvalid', 'generic'.
     *
     * @param type the type value to set
     * @return the DependencyValidationIssue object itself.
     */
    public DependencyValidationIssue withType(String type) {
        this.type = type;
        return this;
    }

    /**
     * Get possible values include: 'error', 'warning'.
     *
     * @return the severity value
     */
    public String severity() {
        return this.severity;
    }

    /**
     * Set possible values include: 'error', 'warning'.
     *
     * @param severity the severity value to set
     * @return the DependencyValidationIssue object itself.
     */
    public DependencyValidationIssue withSeverity(String severity) {
        this.severity = severity;
        return this;
    }

    /**
     * Get the id value.
     *
     * @return the id value
     */
    public String id() {
        return this.id;
    }

    /**
     * Set the id value.
     *
     * @param id the id value to set
     * @return the DependencyValidationIssue object itself.
     */
    public DependencyValidationIssue withId(String id) {
        this.id = id;
        return this;
    }

    /**
     * Get the description value.
     *
     * @return the description value
     */
    public String description() {
        return this.description;
    }

    /**
     * Set the description value.
     *
     * @param description the description value to set
     * @return the DependencyValidationIssue object itself.
     */
    public DependencyValidationIssue withDescription(String description) {
        this.description = description;
        return this;
    }

}
