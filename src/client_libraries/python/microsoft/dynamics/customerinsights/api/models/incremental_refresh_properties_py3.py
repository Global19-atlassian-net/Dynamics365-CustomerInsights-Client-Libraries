# coding=utf-8
# --------------------------------------------------------------------------
# Code generated by Microsoft (R) AutoRest Code Generator.
# Changes may cause incorrect behavior and will be lost if the code is
# regenerated.
# --------------------------------------------------------------------------

from msrest.serialization import Model


class IncrementalRefreshProperties(Model):
    """Represents a Incremental Refresh Property.

    :param entity_name: Gets the name of the entity.
    :type entity_name: str
    :param detect_changes_attribute_name: Gets the column to detect changes.
    :type detect_changes_attribute_name: str
    :param filter_by_attribute_name: Gets the column to get incremental data.
    :type filter_by_attribute_name: str
    :param incremental_granularity: Gets the granularity of the incremental
     refresh.
    :type incremental_granularity: str
    :param incremental_periods: Gets the incremental period.
    :type incremental_periods: int
    :param refresh_complete_periods: Gets a value indicating whether to
     refresh completed periods or not.
    :type refresh_complete_periods: bool
    :param incremental_periods_offset: Gets the off set period.
    :type incremental_periods_offset: int
    :param primary_key_attribute_name: Gets the primary key of the entity.
    :type primary_key_attribute_name: str
    :param rolling_window_granularity: Gets the rolling window granularity.
    :type rolling_window_granularity: str
    :param rolling_window_periods: Gets the Rolling window period.
    :type rolling_window_periods: int
    """

    _attribute_map = {
        'entity_name': {'key': 'entityName', 'type': 'str'},
        'detect_changes_attribute_name': {'key': 'detectChangesAttributeName', 'type': 'str'},
        'filter_by_attribute_name': {'key': 'filterByAttributeName', 'type': 'str'},
        'incremental_granularity': {'key': 'incrementalGranularity', 'type': 'str'},
        'incremental_periods': {'key': 'incrementalPeriods', 'type': 'int'},
        'refresh_complete_periods': {'key': 'refreshCompletePeriods', 'type': 'bool'},
        'incremental_periods_offset': {'key': 'incrementalPeriodsOffset', 'type': 'int'},
        'primary_key_attribute_name': {'key': 'primaryKeyAttributeName', 'type': 'str'},
        'rolling_window_granularity': {'key': 'rollingWindowGranularity', 'type': 'str'},
        'rolling_window_periods': {'key': 'rollingWindowPeriods', 'type': 'int'},
    }

    def __init__(self, *, entity_name: str=None, detect_changes_attribute_name: str=None, filter_by_attribute_name: str=None, incremental_granularity: str=None, incremental_periods: int=None, refresh_complete_periods: bool=None, incremental_periods_offset: int=None, primary_key_attribute_name: str=None, rolling_window_granularity: str=None, rolling_window_periods: int=None, **kwargs) -> None:
        super(IncrementalRefreshProperties, self).__init__(**kwargs)
        self.entity_name = entity_name
        self.detect_changes_attribute_name = detect_changes_attribute_name
        self.filter_by_attribute_name = filter_by_attribute_name
        self.incremental_granularity = incremental_granularity
        self.incremental_periods = incremental_periods
        self.refresh_complete_periods = refresh_complete_periods
        self.incremental_periods_offset = incremental_periods_offset
        self.primary_key_attribute_name = primary_key_attribute_name
        self.rolling_window_granularity = rolling_window_granularity
        self.rolling_window_periods = rolling_window_periods
