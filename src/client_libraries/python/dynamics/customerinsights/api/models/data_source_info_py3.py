# coding=utf-8
# --------------------------------------------------------------------------
# Code generated by Microsoft (R) AutoRest Code Generator.
# Changes may cause incorrect behavior and will be lost if the code is
# regenerated.
# --------------------------------------------------------------------------

from msrest.serialization import Model


class DataSourceInfo(Model):
    """DataSourceInfo.

    :param data_source_metadata:
    :type data_source_metadata:
     ~dynamics.customerinsights.api.models.DataSourceMetadata
    :param model:
    :type model: ~dynamics.customerinsights.api.models.Model
    """

    _attribute_map = {
        'data_source_metadata': {'key': 'dataSourceMetadata', 'type': 'DataSourceMetadata'},
        'model': {'key': 'model', 'type': 'Model'},
    }

    def __init__(self, *, data_source_metadata=None, model=None, **kwargs) -> None:
        super(DataSourceInfo, self).__init__(**kwargs)
        self.data_source_metadata = data_source_metadata
        self.model = model