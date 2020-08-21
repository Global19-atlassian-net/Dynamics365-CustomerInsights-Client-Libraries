# coding=utf-8
# --------------------------------------------------------------------------
# Code generated by Microsoft (R) AutoRest Code Generator.
# Changes may cause incorrect behavior and will be lost if the code is
# regenerated.
# --------------------------------------------------------------------------

from msrest.serialization import Model


class Entity(Model):
    """Entity.

    Variables are only populated by the server, and will be ignored when
    sending a request.

    :param name:
    :type name: str
    :param description:
    :type description: str
    :param is_hidden:
    :type is_hidden: bool
    :ivar annotations:
    :vartype annotations:
     list[~microsoft.dynamics.customerinsights.api.models.Annotation]
    """

    _validation = {
        'annotations': {'readonly': True},
    }

    _attribute_map = {
        'name': {'key': 'name', 'type': 'str'},
        'description': {'key': 'description', 'type': 'str'},
        'is_hidden': {'key': 'isHidden', 'type': 'bool'},
        'annotations': {'key': 'annotations', 'type': '[Annotation]'},
    }

    def __init__(self, **kwargs):
        super(Entity, self).__init__(**kwargs)
        self.name = kwargs.get('name', None)
        self.description = kwargs.get('description', None)
        self.is_hidden = kwargs.get('is_hidden', None)
        self.annotations = None
