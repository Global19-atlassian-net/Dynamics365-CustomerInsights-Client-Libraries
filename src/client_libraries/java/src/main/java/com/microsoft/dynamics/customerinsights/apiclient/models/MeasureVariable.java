/**
 * Code generated by Microsoft (R) AutoRest Code Generator.
 * Changes may cause incorrect behavior and will be lost if the code is
 * regenerated.
 */

package com.microsoft.dynamics.customerinsights.apiclient.models;

import java.util.List;
import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * Represents a variable (computed column) in a measure.
 */
public class MeasureVariable {
    /**
     * Possible values include: 'arithmetic', 'date'.
     */
    @JsonProperty(value = "kind")
    private String kind;

    /**
     * Gets the name of the variable.
     */
    @JsonProperty(value = "name", access = JsonProperty.Access.WRITE_ONLY)
    private String name;

    /**
     * Gets the data type of the variable.
     */
    @JsonProperty(value = "dataType", access = JsonProperty.Access.WRITE_ONLY)
    private String dataType;

    /**
     * Gets the expression text for computing the variable.
     */
    @JsonProperty(value = "expressionText", access = JsonProperty.Access.WRITE_ONLY)
    private String expressionText;

    /**
     * Gets the variable conditions.
     */
    @JsonProperty(value = "variableConditionGroups", access = JsonProperty.Access.WRITE_ONLY)
    private List<MeasureVariableConditionGroup> variableConditionGroups;

    /**
     * Get possible values include: 'arithmetic', 'date'.
     *
     * @return the kind value
     */
    public String kind() {
        return this.kind;
    }

    /**
     * Set possible values include: 'arithmetic', 'date'.
     *
     * @param kind the kind value to set
     * @return the MeasureVariable object itself.
     */
    public MeasureVariable withKind(String kind) {
        this.kind = kind;
        return this;
    }

    /**
     * Get gets the name of the variable.
     *
     * @return the name value
     */
    public String name() {
        return this.name;
    }

    /**
     * Get gets the data type of the variable.
     *
     * @return the dataType value
     */
    public String dataType() {
        return this.dataType;
    }

    /**
     * Get gets the expression text for computing the variable.
     *
     * @return the expressionText value
     */
    public String expressionText() {
        return this.expressionText;
    }

    /**
     * Get gets the variable conditions.
     *
     * @return the variableConditionGroups value
     */
    public List<MeasureVariableConditionGroup> variableConditionGroups() {
        return this.variableConditionGroups;
    }

}
