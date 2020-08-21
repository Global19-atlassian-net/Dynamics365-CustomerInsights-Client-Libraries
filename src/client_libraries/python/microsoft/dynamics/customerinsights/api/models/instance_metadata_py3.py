# coding=utf-8
# --------------------------------------------------------------------------
# Code generated by Microsoft (R) AutoRest Code Generator.
# Changes may cause incorrect behavior and will be lost if the code is
# regenerated.
# --------------------------------------------------------------------------

from msrest.serialization import Model


class InstanceMetadata(Model):
    """The instance metadata.

    Variables are only populated by the server, and will be ignored when
    sending a request.

    :param name: Gets the user defined instance name.
    :type name: str
    :param provisioning_state: Possible values include: 'new', 'creating',
     'active', 'createFailed', 'updateFailed', 'deleting',
     'refreshCredentials', 'resetInstanceInProgress'
    :type provisioning_state: str or
     ~microsoft.dynamics.customerinsights.api.models.enum
    :param instance_type: Possible values include: 'trial', 'sandbox',
     'production'
    :type instance_type: str or
     ~microsoft.dynamics.customerinsights.api.models.enum
    :param refresh_schedule:
    :type refresh_schedule:
     ~microsoft.dynamics.customerinsights.api.models.DataRefreshSchedule
    :param expiry_time_utc: Gets the time the instance is set to expire.
    :type expiry_time_utc: datetime
    :param region: Gets the Azure region where the instance lives.
    :type region: str
    :param bap_environment_id: Gets the Id of the BAP Environment associated
     with the current instance.
    :type bap_environment_id: str
    :param ppdf_provision_state: Possible values include: 'notStarted',
     'creating', 'created', 'attaching', 'attached', 'installing', 'installed',
     'failed'
    :type ppdf_provision_state: str or
     ~microsoft.dynamics.customerinsights.api.models.enum
    :param pbi_provision_state: Possible values include: 'notStarted',
     'creating', 'created', 'failed'
    :type pbi_provision_state: str or
     ~microsoft.dynamics.customerinsights.api.models.enum
    :param cds_org_info:
    :type cds_org_info:
     ~microsoft.dynamics.customerinsights.api.models.CdsOrgInfo
    :param cds_mdl_info:
    :type cds_mdl_info:
     ~microsoft.dynamics.customerinsights.api.models.CdsMdlInfo
    :param max_trial_extensions_allowed: Gets the total number of extensions
     allowed if this is trial instance
    :type max_trial_extensions_allowed: int
    :param trial_extension_history: Stores the details of trial extensions
     done if this is a trial instance
    :type trial_extension_history: str
    :ivar version: Gets the version number of this object.
    :vartype version: long
    :ivar updated_by: Gets the UPN of the user who last updated this record.
    :vartype updated_by: str
    :ivar updated_utc: Gets the time the object was last updated.
    :vartype updated_utc: datetime
    :ivar created_by: Gets the email address of the user who created this
     record.
    :vartype created_by: str
    :ivar created_utc: Gets the time the object was initially created.
    :vartype created_utc: datetime
    :ivar instance_id: Gets the Customer Insights instance id associated with
     this object.
    :vartype instance_id: str
    """

    _validation = {
        'version': {'readonly': True},
        'updated_by': {'readonly': True},
        'updated_utc': {'readonly': True},
        'created_by': {'readonly': True},
        'created_utc': {'readonly': True},
        'instance_id': {'readonly': True},
    }

    _attribute_map = {
        'name': {'key': 'name', 'type': 'str'},
        'provisioning_state': {'key': 'provisioningState', 'type': 'str'},
        'instance_type': {'key': 'instanceType', 'type': 'str'},
        'refresh_schedule': {'key': 'refreshSchedule', 'type': 'DataRefreshSchedule'},
        'expiry_time_utc': {'key': 'expiryTimeUtc', 'type': 'iso-8601'},
        'region': {'key': 'region', 'type': 'str'},
        'bap_environment_id': {'key': 'bapEnvironmentId', 'type': 'str'},
        'ppdf_provision_state': {'key': 'ppdfProvisionState', 'type': 'str'},
        'pbi_provision_state': {'key': 'pbiProvisionState', 'type': 'str'},
        'cds_org_info': {'key': 'cdsOrgInfo', 'type': 'CdsOrgInfo'},
        'cds_mdl_info': {'key': 'cdsMdlInfo', 'type': 'CdsMdlInfo'},
        'max_trial_extensions_allowed': {'key': 'maxTrialExtensionsAllowed', 'type': 'int'},
        'trial_extension_history': {'key': 'trialExtensionHistory', 'type': 'str'},
        'version': {'key': 'version', 'type': 'long'},
        'updated_by': {'key': 'updatedBy', 'type': 'str'},
        'updated_utc': {'key': 'updatedUtc', 'type': 'iso-8601'},
        'created_by': {'key': 'createdBy', 'type': 'str'},
        'created_utc': {'key': 'createdUtc', 'type': 'iso-8601'},
        'instance_id': {'key': 'instanceId', 'type': 'str'},
    }

    def __init__(self, *, name: str=None, provisioning_state=None, instance_type=None, refresh_schedule=None, expiry_time_utc=None, region: str=None, bap_environment_id: str=None, ppdf_provision_state=None, pbi_provision_state=None, cds_org_info=None, cds_mdl_info=None, max_trial_extensions_allowed: int=None, trial_extension_history: str=None, **kwargs) -> None:
        super(InstanceMetadata, self).__init__(**kwargs)
        self.name = name
        self.provisioning_state = provisioning_state
        self.instance_type = instance_type
        self.refresh_schedule = refresh_schedule
        self.expiry_time_utc = expiry_time_utc
        self.region = region
        self.bap_environment_id = bap_environment_id
        self.ppdf_provision_state = ppdf_provision_state
        self.pbi_provision_state = pbi_provision_state
        self.cds_org_info = cds_org_info
        self.cds_mdl_info = cds_mdl_info
        self.max_trial_extensions_allowed = max_trial_extensions_allowed
        self.trial_extension_history = trial_extension_history
        self.version = None
        self.updated_by = None
        self.updated_utc = None
        self.created_by = None
        self.created_utc = None
        self.instance_id = None
