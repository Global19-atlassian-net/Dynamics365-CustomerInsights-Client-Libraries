# coding=utf-8
# --------------------------------------------------------------------------
# Code generated by Microsoft (R) AutoRest Code Generator.
# Changes may cause incorrect behavior and will be lost if the code is
# regenerated.
# --------------------------------------------------------------------------

from msrest.serialization import Model


class DependencyValidationIssue(Model):
    """DependencyValidationIssue.

    :param type: Possible values include: 'mapInvalid', 'matchRuleInvalid',
     'mergePolicyInvalid', 'relationshipInvalid', 'measureDefinitionInvalid',
     'segmentDefinitionInvalid', 'unifiedActivitiyMappingInvalid', 'generic'
    :type type: str or ~microsoft.dynamics.customerinsights.api.models.enum
    :param severity: Possible values include: 'error', 'warning'
    :type severity: str or
     ~microsoft.dynamics.customerinsights.api.models.enum
    :param id:
    :type id: str
    :param description:
    :type description: str
    """

    _attribute_map = {
        'type': {'key': 'type', 'type': 'str'},
        'severity': {'key': 'severity', 'type': 'str'},
        'id': {'key': 'id', 'type': 'str'},
        'description': {'key': 'description', 'type': 'str'},
    }

    def __init__(self, *, type=None, severity=None, id: str=None, description: str=None, **kwargs) -> None:
        super(DependencyValidationIssue, self).__init__(**kwargs)
        self.type = type
        self.severity = severity
        self.id = id
        self.description = description