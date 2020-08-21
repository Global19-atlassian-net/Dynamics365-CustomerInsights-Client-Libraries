# coding=utf-8
# --------------------------------------------------------------------------
# Code generated by Microsoft (R) AutoRest Code Generator.
# Changes may cause incorrect behavior and will be lost if the code is
# regenerated.
# --------------------------------------------------------------------------

from msrest.serialization import Model


class IAttributeMetadata(Model):
    """IAttributeMetadata.

    Variables are only populated by the server, and will be ignored when
    sending a request.

    :ivar name:
    :vartype name: str
    :ivar friendly_name:
    :vartype friendly_name: str
    :ivar base_name:
    :vartype base_name: str
    :param data_type:
    :type data_type:
     ~microsoft.dynamics.customerinsights.api.models.AttributeType
    :param semantic_type: Possible values include: 'CalendarDate',
     'CalendarDayOfMonth', 'CalendarDayOfWeek', 'CalendarDayOfYear',
     'CalendarHalfYear', 'CalendarMonthOfYear', 'CalendarMonth',
     'CalendarWeek', 'CalendarYear', 'CalendarFiscalDate',
     'CalendarFiscalDayOfMonth', 'CalendarFiscalDayOfWeek',
     'CalendarFiscalDayOfYear', 'CalendarFiscalHalfYear',
     'CalendarFiscalMonthOfYear', 'CalendarFiscalMonth',
     'CalendarFiscalQuarter', 'CalendarFiscalWeekOfMonth',
     'CalendarFiscalWeekOfYear', 'CalendarFiscalWeek', 'CalendarFiscalYear',
     'Account', 'Channel', 'Contact', 'Customer', 'Language', 'Organization',
     'OrganizationUnit', 'Person', 'Product', 'ProductGroup',
     'LocationAddress', 'LocationAddressStreet', 'LocationCity',
     'LocationContinent', 'LocationCountry', 'LocationCounty',
     'LocationLatitude', 'LocationLongitude', 'LocationPoint',
     'LocationPostalCode', 'LocationProvince', 'LocationRegion',
     'LocationState', 'LocationTimezone', 'MeasurementDateCreation',
     'MeasurementDateModify', 'MeasurementStatus', 'MeasurementVersion',
     'BarCode', 'Brand', 'IdentityGovernmentID', 'PersonFirstName',
     'PersonFullName', 'PersonLastName', 'PersonMiddleName',
     'IdentityServiceEmail', 'IdentityServiceFacebook', 'IdentityServicePhone',
     'IdentityServiceTwitter', 'Image', 'Place', 'ReferenceDescription',
     'ReferenceImageURL', 'ReferencePhonetic', 'ReferenceURL'
    :type semantic_type: str or
     ~microsoft.dynamics.customerinsights.api.models.enum
    :param search_properties:
    :type search_properties:
     ~microsoft.dynamics.customerinsights.api.models.IAttributeSearchProperties
    """

    _validation = {
        'name': {'readonly': True},
        'friendly_name': {'readonly': True},
        'base_name': {'readonly': True},
    }

    _attribute_map = {
        'name': {'key': 'name', 'type': 'str'},
        'friendly_name': {'key': 'friendlyName', 'type': 'str'},
        'base_name': {'key': 'baseName', 'type': 'str'},
        'data_type': {'key': 'dataType', 'type': 'AttributeType'},
        'semantic_type': {'key': 'semanticType', 'type': 'str'},
        'search_properties': {'key': 'searchProperties', 'type': 'IAttributeSearchProperties'},
    }

    def __init__(self, **kwargs):
        super(IAttributeMetadata, self).__init__(**kwargs)
        self.name = None
        self.friendly_name = None
        self.base_name = None
        self.data_type = kwargs.get('data_type', None)
        self.semantic_type = kwargs.get('semantic_type', None)
        self.search_properties = kwargs.get('search_properties', None)
