# coding=utf-8
# --------------------------------------------------------------------------
# Code generated by Microsoft (R) AutoRest Code Generator.
# Changes may cause incorrect behavior and will be lost if the code is
# regenerated.
# --------------------------------------------------------------------------

from msrest.serialization import Model


class OkResult(Model):
    """OkResult.

    :param status_code:
    :type status_code: int
    """

    _attribute_map = {
        'status_code': {'key': 'statusCode', 'type': 'int'},
    }

    def __init__(self, **kwargs):
        super(OkResult, self).__init__(**kwargs)
        self.status_code = kwargs.get('status_code', None)
