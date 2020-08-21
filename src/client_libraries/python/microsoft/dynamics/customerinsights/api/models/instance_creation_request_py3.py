# coding=utf-8
# --------------------------------------------------------------------------
# Code generated by Microsoft (R) AutoRest Code Generator.
# Changes may cause incorrect behavior and will be lost if the code is
# regenerated.
# --------------------------------------------------------------------------

from msrest.serialization import Model


class InstanceCreationRequest(Model):
    """InstanceCreationRequest.

    :param instance_metadata:
    :type instance_metadata:
     ~microsoft.dynamics.customerinsights.api.models.InstanceMetadata
    :param byosa_resource_metadata:
    :type byosa_resource_metadata:
     ~microsoft.dynamics.customerinsights.api.models.ResourceMetadata
    :param cds_resource_metadata:
    :type cds_resource_metadata:
     ~microsoft.dynamics.customerinsights.api.models.ResourceMetadata
    :param bap_provisioning_type: Possible values include: 'skip', 'create',
     'attach'
    :type bap_provisioning_type: str or
     ~microsoft.dynamics.customerinsights.api.models.enum
    """

    _attribute_map = {
        'instance_metadata': {'key': 'instanceMetadata', 'type': 'InstanceMetadata'},
        'byosa_resource_metadata': {'key': 'byosaResourceMetadata', 'type': 'ResourceMetadata'},
        'cds_resource_metadata': {'key': 'cdsResourceMetadata', 'type': 'ResourceMetadata'},
        'bap_provisioning_type': {'key': 'bapProvisioningType', 'type': 'str'},
    }

    def __init__(self, *, instance_metadata=None, byosa_resource_metadata=None, cds_resource_metadata=None, bap_provisioning_type=None, **kwargs) -> None:
        super(InstanceCreationRequest, self).__init__(**kwargs)
        self.instance_metadata = instance_metadata
        self.byosa_resource_metadata = byosa_resource_metadata
        self.cds_resource_metadata = cds_resource_metadata
        self.bap_provisioning_type = bap_provisioning_type
