/**
 * Code generated by Microsoft (R) AutoRest Code Generator.
 * Changes may cause incorrect behavior and will be lost if the code is
 * regenerated.
 */

package com.microsoft.dynamics.customerinsights.apiclient.models;

import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * The information on CDS MDL workspaces.
 */
public class CdsMdlInfo {
    /**
     * The privateWorkSpace property.
     */
    @JsonProperty(value = "privateWorkSpace")
    private WorkSpaceDetail privateWorkSpace;

    /**
     * The publicWorkSpace property.
     */
    @JsonProperty(value = "publicWorkSpace")
    private WorkSpaceDetail publicWorkSpace;

    /**
     * Get the privateWorkSpace value.
     *
     * @return the privateWorkSpace value
     */
    public WorkSpaceDetail privateWorkSpace() {
        return this.privateWorkSpace;
    }

    /**
     * Set the privateWorkSpace value.
     *
     * @param privateWorkSpace the privateWorkSpace value to set
     * @return the CdsMdlInfo object itself.
     */
    public CdsMdlInfo withPrivateWorkSpace(WorkSpaceDetail privateWorkSpace) {
        this.privateWorkSpace = privateWorkSpace;
        return this;
    }

    /**
     * Get the publicWorkSpace value.
     *
     * @return the publicWorkSpace value
     */
    public WorkSpaceDetail publicWorkSpace() {
        return this.publicWorkSpace;
    }

    /**
     * Set the publicWorkSpace value.
     *
     * @param publicWorkSpace the publicWorkSpace value to set
     * @return the CdsMdlInfo object itself.
     */
    public CdsMdlInfo withPublicWorkSpace(WorkSpaceDetail publicWorkSpace) {
        this.publicWorkSpace = publicWorkSpace;
        return this;
    }

}
