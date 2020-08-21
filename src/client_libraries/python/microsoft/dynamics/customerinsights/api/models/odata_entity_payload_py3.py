# coding=utf-8
# --------------------------------------------------------------------------
# Code generated by Microsoft (R) AutoRest Code Generator.
# Changes may cause incorrect behavior and will be lost if the code is
# regenerated.
# --------------------------------------------------------------------------

from msrest.serialization import Model


class ODataEntityPayload(Model):
    """ODataEntityPayload.

    :param odatacontext:
    :type odatacontext: str
    :param odatacount:
    :type odatacount: int
    :param value:
    :type value: list[object]
    """

    _attribute_map = {
        'odatacontext': {'key': '@odata\\.context', 'type': 'str'},
        'odatacount': {'key': '@odata\\.count', 'type': 'int'},
        'value': {'key': 'value', 'type': '[object]'},
    }

    def __init__(self, *, odatacontext: str=None, odatacount: int=None, value=None, **kwargs) -> None:
        super(ODataEntityPayload, self).__init__(**kwargs)
        self.odatacontext = odatacontext
        self.odatacount = odatacount
        self.value = value