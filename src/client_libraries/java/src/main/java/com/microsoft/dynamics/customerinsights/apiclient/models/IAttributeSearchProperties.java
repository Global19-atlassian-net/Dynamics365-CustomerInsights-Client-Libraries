/**
 * Code generated by Microsoft (R) AutoRest Code Generator.
 * Changes may cause incorrect behavior and will be lost if the code is
 * regenerated.
 */

package com.microsoft.dynamics.customerinsights.apiclient.models;

import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * The IAttributeSearchProperties model.
 */
public class IAttributeSearchProperties {
    /**
     * Gets a value indicating whether the attribute supports full text search.
     */
    @JsonProperty(value = "isSearchable", access = JsonProperty.Access.WRITE_ONLY)
    private Boolean isSearchable;

    /**
     * Gets a value indicating whether the attribute supports filtering.
     */
    @JsonProperty(value = "isFilterable", access = JsonProperty.Access.WRITE_ONLY)
    private Boolean isFilterable;

    /**
     * Gets a value indicating whether the attribute can be included as facet
     * results.
     */
    @JsonProperty(value = "isFacetable", access = JsonProperty.Access.WRITE_ONLY)
    private Boolean isFacetable;

    /**
     * Gets a value indicating whether the attribute can be included in orderby
     * directives.
     */
    @JsonProperty(value = "isSortable", access = JsonProperty.Access.WRITE_ONLY)
    private Boolean isSortable;

    /**
     * Gets an optional specification for search faceting used at query time
     * (advanced).
     * this is the part behind the comma in the examples below.
     * bucket facet: "price,interval:10"
     * other type: "listPrice,values:10|25|100|500|1000|2500"
     * value facet: city,count:5.
     */
    @JsonProperty(value = "facetSpecification", access = JsonProperty.Access.WRITE_ONLY)
    private String facetSpecification;

    /**
     * Get gets a value indicating whether the attribute supports full text search.
     *
     * @return the isSearchable value
     */
    public Boolean isSearchable() {
        return this.isSearchable;
    }

    /**
     * Get gets a value indicating whether the attribute supports filtering.
     *
     * @return the isFilterable value
     */
    public Boolean isFilterable() {
        return this.isFilterable;
    }

    /**
     * Get gets a value indicating whether the attribute can be included as facet results.
     *
     * @return the isFacetable value
     */
    public Boolean isFacetable() {
        return this.isFacetable;
    }

    /**
     * Get gets a value indicating whether the attribute can be included in orderby directives.
     *
     * @return the isSortable value
     */
    public Boolean isSortable() {
        return this.isSortable;
    }

    /**
     * Get gets an optional specification for search faceting used at query time (advanced).
     this is the part behind the comma in the examples below.
     bucket facet: "price,interval:10"
     other type: "listPrice,values:10|25|100|500|1000|2500"
     value facet: city,count:5.
     *
     * @return the facetSpecification value
     */
    public String facetSpecification() {
        return this.facetSpecification;
    }

}
