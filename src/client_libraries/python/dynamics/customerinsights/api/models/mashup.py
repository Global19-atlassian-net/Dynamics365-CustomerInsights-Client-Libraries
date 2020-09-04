# coding=utf-8
# --------------------------------------------------------------------------
# Code generated by Microsoft (R) AutoRest Code Generator.
# Changes may cause incorrect behavior and will be lost if the code is
# regenerated.
# --------------------------------------------------------------------------

from msrest.serialization import Model


class Mashup(Model):
    """Mashup.

    :param fast_combine:
    :type fast_combine: bool
    :param allow_native_queries:
    :type allow_native_queries: bool
    :param queries_metadata:
    :type queries_metadata: dict[str,
     ~dynamics.customerinsights.api.models.QueryMetadata]
    :param document:
    :type document: str
    """

    _attribute_map = {
        'fast_combine': {'key': 'fastCombine', 'type': 'bool'},
        'allow_native_queries': {'key': 'allowNativeQueries', 'type': 'bool'},
        'queries_metadata': {'key': 'queriesMetadata', 'type': '{QueryMetadata}'},
        'document': {'key': 'document', 'type': 'str'},
    }

    def __init__(self, **kwargs):
        super(Mashup, self).__init__(**kwargs)
        self.fast_combine = kwargs.get('fast_combine', None)
        self.allow_native_queries = kwargs.get('allow_native_queries', None)
        self.queries_metadata = kwargs.get('queries_metadata', None)
        self.document = kwargs.get('document', None)