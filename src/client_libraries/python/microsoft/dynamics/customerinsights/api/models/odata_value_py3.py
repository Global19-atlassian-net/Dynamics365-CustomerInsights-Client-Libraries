# coding=utf-8
# --------------------------------------------------------------------------
# Code generated by Microsoft (R) AutoRest Code Generator.
# Changes may cause incorrect behavior and will be lost if the code is
# regenerated.
# --------------------------------------------------------------------------

from msrest.serialization import Model


class ODataValue(Model):
    """ODataValue.

    :param type_annotation:
    :type type_annotation:
     ~microsoft.dynamics.customerinsights.api.models.ODataTypeAnnotation
    """

    _attribute_map = {
        'type_annotation': {'key': 'typeAnnotation', 'type': 'ODataTypeAnnotation'},
    }

    def __init__(self, *, type_annotation=None, **kwargs) -> None:
        super(ODataValue, self).__init__(**kwargs)
        self.type_annotation = type_annotation
