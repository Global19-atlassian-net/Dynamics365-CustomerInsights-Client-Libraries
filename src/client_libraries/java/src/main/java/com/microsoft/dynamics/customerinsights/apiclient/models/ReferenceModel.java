/**
 * Code generated by Microsoft (R) AutoRest Code Generator.
 * Changes may cause incorrect behavior and will be lost if the code is
 * regenerated.
 */

package com.microsoft.dynamics.customerinsights.apiclient.models;

import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * The ReferenceModel model.
 */
public class ReferenceModel {
    /**
     * The id property.
     */
    @JsonProperty(value = "id")
    private String id;

    /**
     * The location property.
     */
    @JsonProperty(value = "location")
    private String location;

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
     * @return the ReferenceModel object itself.
     */
    public ReferenceModel withId(String id) {
        this.id = id;
        return this;
    }

    /**
     * Get the location value.
     *
     * @return the location value
     */
    public String location() {
        return this.location;
    }

    /**
     * Set the location value.
     *
     * @param location the location value to set
     * @return the ReferenceModel object itself.
     */
    public ReferenceModel withLocation(String location) {
        this.location = location;
        return this;
    }

}
