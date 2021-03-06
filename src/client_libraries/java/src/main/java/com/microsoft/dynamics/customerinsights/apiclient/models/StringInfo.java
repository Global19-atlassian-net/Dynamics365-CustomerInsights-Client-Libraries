/**
 * Code generated by Microsoft (R) AutoRest Code Generator.
 * Changes may cause incorrect behavior and will be lost if the code is
 * regenerated.
 */

package com.microsoft.dynamics.customerinsights.apiclient.models;

import java.util.List;
import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * The StringInfo model.
 */
public class StringInfo {
    /**
     * The value property.
     */
    @JsonProperty(value = "value")
    private String value;

    /**
     * Possible values include: 'activityMappingDuplicateMappingOnEntity',
     * 'activityMappingEmptyInput', 'activityMappingInvalidKeyAttribute',
     * 'activityMappingInvalidRelationshipAttribute',
     * 'activityMappingInvalidStartEndTimeField',
     * 'activityMappingInvalidStartTimeFieldValue', 'apiInternalError',
     * 'apiVersionNotSupported', 'authEmptyAuthorizationCode',
     * 'authEmptyAuthorizationCodeError', 'authEmptyBearerToken',
     * 'authEmptyBearerTokenError', 'authEmptyRedirect',
     * 'authEmptyRedirectUrl', 'authEmptyRefreshToken', 'authEmptyState',
     * 'authInvalidApp', 'authInvalidAppType', 'authInvalidToken',
     * 'authUserHasC360LicenseError', 'configurationControllerMissingInput',
     * 'customer360ApiInvalidIdentity', 'customer360ApiInvalidTenantIdClaims',
     * 'customer360ApiInvalidUserIdClaims',
     * 'dataRefreshInvalidScheduleRequest',
     * 'dataSourceCreateAlreadyExistError', 'dataSourceModelAlreadyExistError',
     * 'dataSourceDataSourceCanNotDelete', 'dataSourceDataSourceDeleted',
     * 'dataSourceDataSourceNotFound', 'dataSourceDuplicateDataSourceName',
     * 'dataSourceEmptyDataSource', 'dataSourceEmptyDataSourceName',
     * 'dataSourceEmptyDataSourceNameError', 'dataSourceEmptyAttributeError',
     * 'dataLakeAccountInvalidError', 'dataLakeSecretInvalidError',
     * 'dataSourceModelNotFoundError', 'modelDataTypeError',
     * 'modelDataConvertError', 'resourceMetadataNotFoundError',
     * 'dataSourceInactiveInstance', 'dataSourceInstanceNotFound',
     * 'dataSourceCreationFailed', 'dataSourceInvalidDataSourceName',
     * 'dataSourceInvalidDataSourceNameCharacter',
     * 'dataSourceInvalidEntityNames', 'dataSourceMetadataExceedsLimit',
     * 'dataSourceNotFound', 'dataSourceNotProvisioned',
     * 'dataSourceRefreshTimeout', 'dataSourceUpdateAlreadyExistError',
     * 'dataSourceUpdateDependenciesError',
     * 'datasourceIngestionUnexpectedError', 'dynamics365EmptyHeader',
     * 'entityDataControllerContentType', 'entityMetadataCanNotMarkAttribute',
     * 'entityMetadataCanNotUpdateEntity',
     * 'entityMetadataCanNotUpdateEntityOfActivityType',
     * 'entityMetadataForAttributeNotFoundForEntity',
     * 'entityMetadataNotFoundForEntity', 'failedToSubmiProfileStoreJob',
     * 'gdprDeleteOldSnapshotsConfiguratonError',
     * 'gdprDeleteOldSnapshotsNonC360DataflowsError',
     * 'graphApiEmptySearchTerm', 'graphApiPrincipalIdMissingInRequest',
     * 'graphApiPrincipalIdsExceedslimit',
     * 'graphApiPrincipalIdsExceedslimitError', 'graphApiTopLimitError',
     * 'graphApiGroupDirectoryInfoFailed', 'graphApiUserDirectoryInfoFailed',
     * 'instanceNoAssignmentsInRequest', 'instanceUserSettingsMissing',
     * 'instancePreferredLanguageMissing',
     * 'instancePreferredRegionalFormatMissing', 'invalidDataSourceType',
     * 'invocationBadRequestInReadingHeaderInfo',
     * 'invocationFailedBindToMethod', 'invocationUnsupportedMediaType',
     * 'measuresProcessingOrchestrationSkipMeasuresAndNotify',
     * 'nullOrEmptyInstanceId', 'offlineGraphIngestionOrchestrationNotify',
     * 'segmentEvaluationOrchestrationNotify',
     * 'profileStoreIngestionFailedWithJobInfo',
     * 'profileStoreIngestionOrchestrationFailed',
     * 'profileStoreOrchestrationSuccessful',
     * 'publicMetadataControllerAnonymousType',
     * 'rbacAADDirectoryObjectNotFound',
     * 'rbacCanNotRevokePermissionFromInstance',
     * 'rbacDeletedRoleAssignmentsFromUser', 'rbacInvalidRole',
     * 'rbacRoleIsNotValid', 'rbacUnsupportedPrincipalType',
     * 'rbacUserNotFound', 'refreshBackgroundTaskRunningError',
     * 'refreshConflationCancelled', 'refreshConflationMetadataNotFound',
     * 'refreshConflationJobFailed', 'refreshEnrichmentMetadataNotFound',
     * 'refreshEnrichmentMisconfigured', 'refreshEnrichmentRequestExceeded',
     * 'refreshEnrichmentRequestThrottling', 'refreshExportCancelled',
     * 'refreshExportCompleted', 'refreshExportFailed',
     * 'refreshExportRequestThrottling', 'refreshExportSkipped',
     * 'refreshMatchRequestThrotling',
     * 'refreshMeasuresEvaluationRequestThrottling',
     * 'refreshMergeRequestThrotling', 'refreshPrerequisitesUnmetError',
     * 'refreshRunningOrchestrationNotFound', 'resourceBuilderFailure',
     * 'segmentAdvancedEditorNotEnabled', 'staleMatchMetadataError',
     * 'staleMatchRunError', 'testName',
     * 'measuresProcessingOrchestrationFailed',
     * 'measuresProcessingOrchestrationFailedV2',
     * 'offlineGraphIngestionOrchestrationFailed',
     * 'segmentEvaluationOrchestrationFailed', 'matchMergeOrchestrationFailed',
     * 'refreshMatchPairsEntityDoesNotExist',
     * 'invalidSegmentDefinitionErrorMessage', 'clauseForNextRefresh',
     * 'refreshIntelligenceCancelled', 'refreshIntelligenceCompleted',
     * 'refreshIntelligenceFailed', 'refreshIntelligenceSkipped',
     * 'refreshIntelligenceDisabled', 'refreshConflationConfigurationNotFound',
     * 'conflationPlanInvalid', 'conflationMetadataNotFoundForEntity',
     * 'conflationMetadataNotFoundForColumn', 'conflationConfigurationInvalid',
     * 'conflationUnexpectedError', 'matchPairsEntityDataMissing',
     * 'matchPairsEntityNotExist', 'conflationResolutionInvalid',
     * 'intelligenceUnsupportedDiscoverySource',
     * 'refreshDataPreparationCancelled',
     * 'refreshDataPreparationRequestThrottling',
     * 'refreshDataPreparationFailed', 'bapNotMapped',
     * 'bapCannotCreateEnvironment', 'bapInvalidEnvironmentDisplayNameLength',
     * 'bapInvalidEnvironmentDisplayName', 'bapInvalidEnvironmentLocation',
     * 'bapInvalidEnvironmentSku', 'bapInvalidEnvironment',
     * 'bapInvalidTenantEnvironmentLimit', 'bapInvalidUserEnvironmentLimit',
     * 'dataSourceIngestionCancelled', 'dataSourceIngestionSkippedNoEntities',
     * 'genericPredictionEntitiesNotAvailable',
     * 'genericPredictionEntityPartitionsNotAvailable',
     * 'genericPredictionEntityWithLabelAttributeNotAvailable',
     * 'genericPredictionAttributesNotAvailable',
     * 'invalidJarvisEntityCreationErrorMessage',
     * 'activityIngestionActivityIdNotFound',
     * 'activityIngestionActivityTimeNotFound',
     * 'activityIngestionIncorrectMinViewFields',
     * 'activityIngestionNoJarvisColumnMapping',
     * 'activityIngestionNoPrimaryKey', 'activityIngestionNoSourceStream',
     * 'activityIngestionNoSourceStreamWithCorrectActivityName',
     * 'activityIngestionNoStartOrEndTime',
     * 'activityIngestionRangeIndexNotFound',
     * 'activityIngestionUniqueSourceStream', 'entityNoPrimaryKey',
     * 'invalidSegmentAdvancedSegCreateInInvalidState', 'invalidSegmentFormat',
     * 'invalidSegmentNameExists', 'inavlidSegmentType',
     * 'inavlidSegmentValidationDisabled', 'invalidSegmentNameConflict',
     * 'invalidSegmentNoExistingSegWithName', 'invalidSegmentSegNotFound',
     * 'invalidSegmentValidationNotAllowedForState',
     * 'invalidSegmentValidationNotAllowedForType', 'segmentNotFound',
     * 'dataSourceEmptyResourceIdError', 'invalidOrganizationUrl',
     * 'enablingCdsEntitiesFailed',
     * 'dataSourceIngestionSkippedForMissingCdsModelJsonPath',
     * 'dataSourceIngestionSkippedForCdsModelIncomplete',
     * 'missingOrganizationUrl', 'searchStoreUnavailable',
     * 'profileStoreUnavailable', 'unsupportedInsightType',
     * 'invalidInsightInputGeneric', 'invalidMalformedInsightInputPayload',
     * 'invalidInsightInputMissingName'.
     */
    @JsonProperty(value = "key")
    private String key;

    /**
     * The args property.
     */
    @JsonProperty(value = "args")
    private List<String> args;

    /**
     * Get the value value.
     *
     * @return the value value
     */
    public String value() {
        return this.value;
    }

    /**
     * Set the value value.
     *
     * @param value the value value to set
     * @return the StringInfo object itself.
     */
    public StringInfo withValue(String value) {
        this.value = value;
        return this;
    }

    /**
     * Get possible values include: 'activityMappingDuplicateMappingOnEntity', 'activityMappingEmptyInput', 'activityMappingInvalidKeyAttribute', 'activityMappingInvalidRelationshipAttribute', 'activityMappingInvalidStartEndTimeField', 'activityMappingInvalidStartTimeFieldValue', 'apiInternalError', 'apiVersionNotSupported', 'authEmptyAuthorizationCode', 'authEmptyAuthorizationCodeError', 'authEmptyBearerToken', 'authEmptyBearerTokenError', 'authEmptyRedirect', 'authEmptyRedirectUrl', 'authEmptyRefreshToken', 'authEmptyState', 'authInvalidApp', 'authInvalidAppType', 'authInvalidToken', 'authUserHasC360LicenseError', 'configurationControllerMissingInput', 'customer360ApiInvalidIdentity', 'customer360ApiInvalidTenantIdClaims', 'customer360ApiInvalidUserIdClaims', 'dataRefreshInvalidScheduleRequest', 'dataSourceCreateAlreadyExistError', 'dataSourceModelAlreadyExistError', 'dataSourceDataSourceCanNotDelete', 'dataSourceDataSourceDeleted', 'dataSourceDataSourceNotFound', 'dataSourceDuplicateDataSourceName', 'dataSourceEmptyDataSource', 'dataSourceEmptyDataSourceName', 'dataSourceEmptyDataSourceNameError', 'dataSourceEmptyAttributeError', 'dataLakeAccountInvalidError', 'dataLakeSecretInvalidError', 'dataSourceModelNotFoundError', 'modelDataTypeError', 'modelDataConvertError', 'resourceMetadataNotFoundError', 'dataSourceInactiveInstance', 'dataSourceInstanceNotFound', 'dataSourceCreationFailed', 'dataSourceInvalidDataSourceName', 'dataSourceInvalidDataSourceNameCharacter', 'dataSourceInvalidEntityNames', 'dataSourceMetadataExceedsLimit', 'dataSourceNotFound', 'dataSourceNotProvisioned', 'dataSourceRefreshTimeout', 'dataSourceUpdateAlreadyExistError', 'dataSourceUpdateDependenciesError', 'datasourceIngestionUnexpectedError', 'dynamics365EmptyHeader', 'entityDataControllerContentType', 'entityMetadataCanNotMarkAttribute', 'entityMetadataCanNotUpdateEntity', 'entityMetadataCanNotUpdateEntityOfActivityType', 'entityMetadataForAttributeNotFoundForEntity', 'entityMetadataNotFoundForEntity', 'failedToSubmiProfileStoreJob', 'gdprDeleteOldSnapshotsConfiguratonError', 'gdprDeleteOldSnapshotsNonC360DataflowsError', 'graphApiEmptySearchTerm', 'graphApiPrincipalIdMissingInRequest', 'graphApiPrincipalIdsExceedslimit', 'graphApiPrincipalIdsExceedslimitError', 'graphApiTopLimitError', 'graphApiGroupDirectoryInfoFailed', 'graphApiUserDirectoryInfoFailed', 'instanceNoAssignmentsInRequest', 'instanceUserSettingsMissing', 'instancePreferredLanguageMissing', 'instancePreferredRegionalFormatMissing', 'invalidDataSourceType', 'invocationBadRequestInReadingHeaderInfo', 'invocationFailedBindToMethod', 'invocationUnsupportedMediaType', 'measuresProcessingOrchestrationSkipMeasuresAndNotify', 'nullOrEmptyInstanceId', 'offlineGraphIngestionOrchestrationNotify', 'segmentEvaluationOrchestrationNotify', 'profileStoreIngestionFailedWithJobInfo', 'profileStoreIngestionOrchestrationFailed', 'profileStoreOrchestrationSuccessful', 'publicMetadataControllerAnonymousType', 'rbacAADDirectoryObjectNotFound', 'rbacCanNotRevokePermissionFromInstance', 'rbacDeletedRoleAssignmentsFromUser', 'rbacInvalidRole', 'rbacRoleIsNotValid', 'rbacUnsupportedPrincipalType', 'rbacUserNotFound', 'refreshBackgroundTaskRunningError', 'refreshConflationCancelled', 'refreshConflationMetadataNotFound', 'refreshConflationJobFailed', 'refreshEnrichmentMetadataNotFound', 'refreshEnrichmentMisconfigured', 'refreshEnrichmentRequestExceeded', 'refreshEnrichmentRequestThrottling', 'refreshExportCancelled', 'refreshExportCompleted', 'refreshExportFailed', 'refreshExportRequestThrottling', 'refreshExportSkipped', 'refreshMatchRequestThrotling', 'refreshMeasuresEvaluationRequestThrottling', 'refreshMergeRequestThrotling', 'refreshPrerequisitesUnmetError', 'refreshRunningOrchestrationNotFound', 'resourceBuilderFailure', 'segmentAdvancedEditorNotEnabled', 'staleMatchMetadataError', 'staleMatchRunError', 'testName', 'measuresProcessingOrchestrationFailed', 'measuresProcessingOrchestrationFailedV2', 'offlineGraphIngestionOrchestrationFailed', 'segmentEvaluationOrchestrationFailed', 'matchMergeOrchestrationFailed', 'refreshMatchPairsEntityDoesNotExist', 'invalidSegmentDefinitionErrorMessage', 'clauseForNextRefresh', 'refreshIntelligenceCancelled', 'refreshIntelligenceCompleted', 'refreshIntelligenceFailed', 'refreshIntelligenceSkipped', 'refreshIntelligenceDisabled', 'refreshConflationConfigurationNotFound', 'conflationPlanInvalid', 'conflationMetadataNotFoundForEntity', 'conflationMetadataNotFoundForColumn', 'conflationConfigurationInvalid', 'conflationUnexpectedError', 'matchPairsEntityDataMissing', 'matchPairsEntityNotExist', 'conflationResolutionInvalid', 'intelligenceUnsupportedDiscoverySource', 'refreshDataPreparationCancelled', 'refreshDataPreparationRequestThrottling', 'refreshDataPreparationFailed', 'bapNotMapped', 'bapCannotCreateEnvironment', 'bapInvalidEnvironmentDisplayNameLength', 'bapInvalidEnvironmentDisplayName', 'bapInvalidEnvironmentLocation', 'bapInvalidEnvironmentSku', 'bapInvalidEnvironment', 'bapInvalidTenantEnvironmentLimit', 'bapInvalidUserEnvironmentLimit', 'dataSourceIngestionCancelled', 'dataSourceIngestionSkippedNoEntities', 'genericPredictionEntitiesNotAvailable', 'genericPredictionEntityPartitionsNotAvailable', 'genericPredictionEntityWithLabelAttributeNotAvailable', 'genericPredictionAttributesNotAvailable', 'invalidJarvisEntityCreationErrorMessage', 'activityIngestionActivityIdNotFound', 'activityIngestionActivityTimeNotFound', 'activityIngestionIncorrectMinViewFields', 'activityIngestionNoJarvisColumnMapping', 'activityIngestionNoPrimaryKey', 'activityIngestionNoSourceStream', 'activityIngestionNoSourceStreamWithCorrectActivityName', 'activityIngestionNoStartOrEndTime', 'activityIngestionRangeIndexNotFound', 'activityIngestionUniqueSourceStream', 'entityNoPrimaryKey', 'invalidSegmentAdvancedSegCreateInInvalidState', 'invalidSegmentFormat', 'invalidSegmentNameExists', 'inavlidSegmentType', 'inavlidSegmentValidationDisabled', 'invalidSegmentNameConflict', 'invalidSegmentNoExistingSegWithName', 'invalidSegmentSegNotFound', 'invalidSegmentValidationNotAllowedForState', 'invalidSegmentValidationNotAllowedForType', 'segmentNotFound', 'dataSourceEmptyResourceIdError', 'invalidOrganizationUrl', 'enablingCdsEntitiesFailed', 'dataSourceIngestionSkippedForMissingCdsModelJsonPath', 'dataSourceIngestionSkippedForCdsModelIncomplete', 'missingOrganizationUrl', 'searchStoreUnavailable', 'profileStoreUnavailable', 'unsupportedInsightType', 'invalidInsightInputGeneric', 'invalidMalformedInsightInputPayload', 'invalidInsightInputMissingName'.
     *
     * @return the key value
     */
    public String key() {
        return this.key;
    }

    /**
     * Set possible values include: 'activityMappingDuplicateMappingOnEntity', 'activityMappingEmptyInput', 'activityMappingInvalidKeyAttribute', 'activityMappingInvalidRelationshipAttribute', 'activityMappingInvalidStartEndTimeField', 'activityMappingInvalidStartTimeFieldValue', 'apiInternalError', 'apiVersionNotSupported', 'authEmptyAuthorizationCode', 'authEmptyAuthorizationCodeError', 'authEmptyBearerToken', 'authEmptyBearerTokenError', 'authEmptyRedirect', 'authEmptyRedirectUrl', 'authEmptyRefreshToken', 'authEmptyState', 'authInvalidApp', 'authInvalidAppType', 'authInvalidToken', 'authUserHasC360LicenseError', 'configurationControllerMissingInput', 'customer360ApiInvalidIdentity', 'customer360ApiInvalidTenantIdClaims', 'customer360ApiInvalidUserIdClaims', 'dataRefreshInvalidScheduleRequest', 'dataSourceCreateAlreadyExistError', 'dataSourceModelAlreadyExistError', 'dataSourceDataSourceCanNotDelete', 'dataSourceDataSourceDeleted', 'dataSourceDataSourceNotFound', 'dataSourceDuplicateDataSourceName', 'dataSourceEmptyDataSource', 'dataSourceEmptyDataSourceName', 'dataSourceEmptyDataSourceNameError', 'dataSourceEmptyAttributeError', 'dataLakeAccountInvalidError', 'dataLakeSecretInvalidError', 'dataSourceModelNotFoundError', 'modelDataTypeError', 'modelDataConvertError', 'resourceMetadataNotFoundError', 'dataSourceInactiveInstance', 'dataSourceInstanceNotFound', 'dataSourceCreationFailed', 'dataSourceInvalidDataSourceName', 'dataSourceInvalidDataSourceNameCharacter', 'dataSourceInvalidEntityNames', 'dataSourceMetadataExceedsLimit', 'dataSourceNotFound', 'dataSourceNotProvisioned', 'dataSourceRefreshTimeout', 'dataSourceUpdateAlreadyExistError', 'dataSourceUpdateDependenciesError', 'datasourceIngestionUnexpectedError', 'dynamics365EmptyHeader', 'entityDataControllerContentType', 'entityMetadataCanNotMarkAttribute', 'entityMetadataCanNotUpdateEntity', 'entityMetadataCanNotUpdateEntityOfActivityType', 'entityMetadataForAttributeNotFoundForEntity', 'entityMetadataNotFoundForEntity', 'failedToSubmiProfileStoreJob', 'gdprDeleteOldSnapshotsConfiguratonError', 'gdprDeleteOldSnapshotsNonC360DataflowsError', 'graphApiEmptySearchTerm', 'graphApiPrincipalIdMissingInRequest', 'graphApiPrincipalIdsExceedslimit', 'graphApiPrincipalIdsExceedslimitError', 'graphApiTopLimitError', 'graphApiGroupDirectoryInfoFailed', 'graphApiUserDirectoryInfoFailed', 'instanceNoAssignmentsInRequest', 'instanceUserSettingsMissing', 'instancePreferredLanguageMissing', 'instancePreferredRegionalFormatMissing', 'invalidDataSourceType', 'invocationBadRequestInReadingHeaderInfo', 'invocationFailedBindToMethod', 'invocationUnsupportedMediaType', 'measuresProcessingOrchestrationSkipMeasuresAndNotify', 'nullOrEmptyInstanceId', 'offlineGraphIngestionOrchestrationNotify', 'segmentEvaluationOrchestrationNotify', 'profileStoreIngestionFailedWithJobInfo', 'profileStoreIngestionOrchestrationFailed', 'profileStoreOrchestrationSuccessful', 'publicMetadataControllerAnonymousType', 'rbacAADDirectoryObjectNotFound', 'rbacCanNotRevokePermissionFromInstance', 'rbacDeletedRoleAssignmentsFromUser', 'rbacInvalidRole', 'rbacRoleIsNotValid', 'rbacUnsupportedPrincipalType', 'rbacUserNotFound', 'refreshBackgroundTaskRunningError', 'refreshConflationCancelled', 'refreshConflationMetadataNotFound', 'refreshConflationJobFailed', 'refreshEnrichmentMetadataNotFound', 'refreshEnrichmentMisconfigured', 'refreshEnrichmentRequestExceeded', 'refreshEnrichmentRequestThrottling', 'refreshExportCancelled', 'refreshExportCompleted', 'refreshExportFailed', 'refreshExportRequestThrottling', 'refreshExportSkipped', 'refreshMatchRequestThrotling', 'refreshMeasuresEvaluationRequestThrottling', 'refreshMergeRequestThrotling', 'refreshPrerequisitesUnmetError', 'refreshRunningOrchestrationNotFound', 'resourceBuilderFailure', 'segmentAdvancedEditorNotEnabled', 'staleMatchMetadataError', 'staleMatchRunError', 'testName', 'measuresProcessingOrchestrationFailed', 'measuresProcessingOrchestrationFailedV2', 'offlineGraphIngestionOrchestrationFailed', 'segmentEvaluationOrchestrationFailed', 'matchMergeOrchestrationFailed', 'refreshMatchPairsEntityDoesNotExist', 'invalidSegmentDefinitionErrorMessage', 'clauseForNextRefresh', 'refreshIntelligenceCancelled', 'refreshIntelligenceCompleted', 'refreshIntelligenceFailed', 'refreshIntelligenceSkipped', 'refreshIntelligenceDisabled', 'refreshConflationConfigurationNotFound', 'conflationPlanInvalid', 'conflationMetadataNotFoundForEntity', 'conflationMetadataNotFoundForColumn', 'conflationConfigurationInvalid', 'conflationUnexpectedError', 'matchPairsEntityDataMissing', 'matchPairsEntityNotExist', 'conflationResolutionInvalid', 'intelligenceUnsupportedDiscoverySource', 'refreshDataPreparationCancelled', 'refreshDataPreparationRequestThrottling', 'refreshDataPreparationFailed', 'bapNotMapped', 'bapCannotCreateEnvironment', 'bapInvalidEnvironmentDisplayNameLength', 'bapInvalidEnvironmentDisplayName', 'bapInvalidEnvironmentLocation', 'bapInvalidEnvironmentSku', 'bapInvalidEnvironment', 'bapInvalidTenantEnvironmentLimit', 'bapInvalidUserEnvironmentLimit', 'dataSourceIngestionCancelled', 'dataSourceIngestionSkippedNoEntities', 'genericPredictionEntitiesNotAvailable', 'genericPredictionEntityPartitionsNotAvailable', 'genericPredictionEntityWithLabelAttributeNotAvailable', 'genericPredictionAttributesNotAvailable', 'invalidJarvisEntityCreationErrorMessage', 'activityIngestionActivityIdNotFound', 'activityIngestionActivityTimeNotFound', 'activityIngestionIncorrectMinViewFields', 'activityIngestionNoJarvisColumnMapping', 'activityIngestionNoPrimaryKey', 'activityIngestionNoSourceStream', 'activityIngestionNoSourceStreamWithCorrectActivityName', 'activityIngestionNoStartOrEndTime', 'activityIngestionRangeIndexNotFound', 'activityIngestionUniqueSourceStream', 'entityNoPrimaryKey', 'invalidSegmentAdvancedSegCreateInInvalidState', 'invalidSegmentFormat', 'invalidSegmentNameExists', 'inavlidSegmentType', 'inavlidSegmentValidationDisabled', 'invalidSegmentNameConflict', 'invalidSegmentNoExistingSegWithName', 'invalidSegmentSegNotFound', 'invalidSegmentValidationNotAllowedForState', 'invalidSegmentValidationNotAllowedForType', 'segmentNotFound', 'dataSourceEmptyResourceIdError', 'invalidOrganizationUrl', 'enablingCdsEntitiesFailed', 'dataSourceIngestionSkippedForMissingCdsModelJsonPath', 'dataSourceIngestionSkippedForCdsModelIncomplete', 'missingOrganizationUrl', 'searchStoreUnavailable', 'profileStoreUnavailable', 'unsupportedInsightType', 'invalidInsightInputGeneric', 'invalidMalformedInsightInputPayload', 'invalidInsightInputMissingName'.
     *
     * @param key the key value to set
     * @return the StringInfo object itself.
     */
    public StringInfo withKey(String key) {
        this.key = key;
        return this;
    }

    /**
     * Get the args value.
     *
     * @return the args value
     */
    public List<String> args() {
        return this.args;
    }

    /**
     * Set the args value.
     *
     * @param args the args value to set
     * @return the StringInfo object itself.
     */
    public StringInfo withArgs(List<String> args) {
        this.args = args;
        return this;
    }

}
