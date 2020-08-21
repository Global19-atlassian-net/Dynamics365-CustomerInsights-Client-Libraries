/**
 * Code generated by Microsoft (R) AutoRest Code Generator.
 * Changes may cause incorrect behavior and will be lost if the code is
 * regenerated.
 */

package com.microsoft.dynamics.customerinsights.apiclient.models;

import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * Defines headers for Get-instance-metadata operation.
 */
public class GetInstanceMetadataHeaders {
    /**
     * Bearer.
     */
    @JsonProperty(value = "WWW-Authenticate")
    private String wWWAuthenticate;

    /**
     * Get bearer.
     *
     * @return the wWWAuthenticate value
     */
    public String wWWAuthenticate() {
        return this.wWWAuthenticate;
    }

    /**
     * Set bearer.
     *
     * @param wWWAuthenticate the wWWAuthenticate value to set
     * @return the GetInstanceMetadataHeaders object itself.
     */
    public GetInstanceMetadataHeaders withWWWAuthenticate(String wWWAuthenticate) {
        this.wWWAuthenticate = wWWAuthenticate;
        return this;
    }

}
