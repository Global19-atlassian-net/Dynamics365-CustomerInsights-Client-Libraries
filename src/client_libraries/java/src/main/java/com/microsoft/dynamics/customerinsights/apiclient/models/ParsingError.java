/**
 * Code generated by Microsoft (R) AutoRest Code Generator.
 * Changes may cause incorrect behavior and will be lost if the code is
 * regenerated.
 */

package com.microsoft.dynamics.customerinsights.apiclient.models;

import java.util.List;
import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * The ParsingError model.
 */
public class ParsingError {
    /**
     * The messages property.
     */
    @JsonProperty(value = "messages")
    private List<LogMessage> messages;

    /**
     * Possible values include: 'unknown', 'parsingFailed', 'entityNotFound',
     * 'attributeNotFound', 'unsupportedSyntax', 'invalidOperation'.
     */
    @JsonProperty(value = "code")
    private String code;

    /**
     * Get the messages value.
     *
     * @return the messages value
     */
    public List<LogMessage> messages() {
        return this.messages;
    }

    /**
     * Set the messages value.
     *
     * @param messages the messages value to set
     * @return the ParsingError object itself.
     */
    public ParsingError withMessages(List<LogMessage> messages) {
        this.messages = messages;
        return this;
    }

    /**
     * Get possible values include: 'unknown', 'parsingFailed', 'entityNotFound', 'attributeNotFound', 'unsupportedSyntax', 'invalidOperation'.
     *
     * @return the code value
     */
    public String code() {
        return this.code;
    }

    /**
     * Set possible values include: 'unknown', 'parsingFailed', 'entityNotFound', 'attributeNotFound', 'unsupportedSyntax', 'invalidOperation'.
     *
     * @param code the code value to set
     * @return the ParsingError object itself.
     */
    public ParsingError withCode(String code) {
        this.code = code;
        return this;
    }

}
