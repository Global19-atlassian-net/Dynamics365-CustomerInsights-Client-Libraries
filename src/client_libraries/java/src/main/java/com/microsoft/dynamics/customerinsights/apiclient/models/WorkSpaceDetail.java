/**
 * Code generated by Microsoft (R) AutoRest Code Generator.
 * Changes may cause incorrect behavior and will be lost if the code is
 * regenerated.
 */

package com.microsoft.dynamics.customerinsights.apiclient.models;

import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * The information for workspace in CDS.
 */
public class WorkSpaceDetail {
    /**
     * Gets the Workspace Friendly Name.
     */
    @JsonProperty(value = "name")
    private String name;

    /**
     * Gets the Cds workspace unique Name.
     */
    @JsonProperty(value = "uniqueName")
    private String uniqueName;

    /**
     * Get gets the Workspace Friendly Name.
     *
     * @return the name value
     */
    public String name() {
        return this.name;
    }

    /**
     * Set gets the Workspace Friendly Name.
     *
     * @param name the name value to set
     * @return the WorkSpaceDetail object itself.
     */
    public WorkSpaceDetail withName(String name) {
        this.name = name;
        return this;
    }

    /**
     * Get gets the Cds workspace unique Name.
     *
     * @return the uniqueName value
     */
    public String uniqueName() {
        return this.uniqueName;
    }

    /**
     * Set gets the Cds workspace unique Name.
     *
     * @param uniqueName the uniqueName value to set
     * @return the WorkSpaceDetail object itself.
     */
    public WorkSpaceDetail withUniqueName(String uniqueName) {
        this.uniqueName = uniqueName;
        return this;
    }

}
