# coding=utf-8
# --------------------------------------------------------------------------
# Code generated by Microsoft (R) AutoRest Code Generator.
# Changes may cause incorrect behavior and will be lost if the code is
# regenerated.
# --------------------------------------------------------------------------

from msrest.serialization import Model


class SelectionReason(Model):
    """SelectionReason.

    :param code: Possible values include: 'unknown', 'requested', 'firstRun',
     'unsuccessful', 'lastRunSkipped', 'alreadyRunning', 'modifiedInputs',
     'upstreamRerunning', 'dependantSystemNode', 'dependsOnMerge'
    :type code: str or ~microsoft.dynamics.customerinsights.api.models.enum
    :param details:
    :type details: str
    """

    _attribute_map = {
        'code': {'key': 'code', 'type': 'str'},
        'details': {'key': 'details', 'type': 'str'},
    }

    def __init__(self, *, code=None, details: str=None, **kwargs) -> None:
        super(SelectionReason, self).__init__(**kwargs)
        self.code = code
        self.details = details
