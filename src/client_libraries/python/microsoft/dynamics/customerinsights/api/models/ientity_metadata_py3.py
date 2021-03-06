# coding=utf-8
# --------------------------------------------------------------------------
# Code generated by Microsoft (R) AutoRest Code Generator.
# Changes may cause incorrect behavior and will be lost if the code is
# regenerated.
# --------------------------------------------------------------------------

from msrest.serialization import Model


class IEntityMetadata(Model):
    """IEntityMetadata.

    Variables are only populated by the server, and will be ignored when
    sending a request.

    :ivar name: Gets the name of the entity. eg: Contact.
    :vartype name: str
    :ivar qualified_entity_name: Gets the unqiue logical name for the entity
     If entity is from a datasource, QualifiedEntityName =
     datasourceId_EntityName eg: d8d3b26a-a8ad-42f7-901e-f7f745003a84_Contact.
     If entity is generated by C360, QualifiedEntityName = EntityName eg:
     Contact.
    :vartype qualified_entity_name: str
    :ivar data_source_name: Gets the datasource name of this entity, if no
     data source, return null or emptyString
    :vartype data_source_name: str
    :param dataflow_type: Possible values include: 'dynamics365',
     'salesforce', 'conflationSortAndRefine', 'conflationDeduplication',
     'conflationMatchPairs', 'conflationResolveConflicts', 'enriched', 'kpi',
     'powerQuery', 'dataPreparation', 'intelligence', 'unifiedActivity',
     'segmentation', 'ingestion', 'attachCdm', 'genericPrediction',
     'attachCds', 'unknown', 'powerPlatform', 'datahub', 'insights',
     'derivedEntity'
    :type dataflow_type: str or
     ~microsoft.dynamics.customerinsights.api.models.enum
    :ivar datasource_id: Gets the original datasourceid of this entity, if no
     data source, return null or emptyString
    :vartype datasource_id: str
    :param entity_type: Possible values include: 'unspecified', 'profile',
     'conflationMap', 'activity', 'aggregateKpi', 'profileKpi',
     'unifiedActivity', 'segment', 'intelligence', 'genericPrediction',
     'enrichment', 'insights', 'derivedEntity', 'quarantine'
    :type entity_type: str or
     ~microsoft.dynamics.customerinsights.api.models.enum
    :ivar attributes: Gets entity attributes.
    :vartype attributes:
     list[~microsoft.dynamics.customerinsights.api.models.IAttributeMetadata]
    :ivar keys: Gets the keys of the entity.
    :vartype keys:
     list[list[~microsoft.dynamics.customerinsights.api.models.IAttributeMetadata]]
    :ivar relationships: Gets entity relationships.
    :vartype relationships:
     list[~microsoft.dynamics.customerinsights.api.models.IRelationshipMetadata]
    :param timestamp_attribute:
    :type timestamp_attribute:
     ~microsoft.dynamics.customerinsights.api.models.IAttributeMetadata
    :param semantic_type: Possible values include: 'Account', 'AccountLeads',
     'ActivityParty', 'ActivityPointer', 'Annotation', 'Appointment',
     'BusinessUnit', 'Campaign', 'CampaignActivity', 'CampaignItem',
     'CampaignResponse', 'Characteristic', 'Competitor', 'CompetitorAddress',
     'CompetitorProduct', 'Connection', 'ConnectionRole', 'Contact',
     'Contract', 'ContractDetail', 'Customer', 'CustomerAddress',
     'CustomerRelationship', 'Discount', 'DiscountType', 'Email',
     'Entitlement', 'Equipment', 'Fax', 'Feedback', 'Goal', 'Incident',
     'Invoice', 'InvoiceDetail', 'KbArticle', 'KnowledgeArticle', 'Lead',
     'LeadAddress', 'Letter', 'Metric', 'Opportunity', 'Organization', 'Owner',
     'PhoneCall', 'Position', 'PriceLevel', 'Product', 'Quote', 'RatingModel',
     'Resource', 'ResourceGroup', 'SalesLiterature', 'SalesOrder', 'Service',
     'ServiceAppointment', 'Site', 'SLA', 'SocialActivity', 'SocialProfile',
     'SystemUser', 'Task', 'Team', 'Territory', 'UoM'
    :type semantic_type: str or
     ~microsoft.dynamics.customerinsights.api.models.enum
    :ivar refresh_time: Gets last refresh time for entity.
    :vartype refresh_time: datetime
    :ivar partitions: Gets entity data partitions.
    :vartype partitions:
     list[~microsoft.dynamics.customerinsights.api.models.PartitionMetadata]
    :ivar incremental_upsert_partitions: Gets entity incremental upsert data
     partitions.
    :vartype incremental_upsert_partitions:
     list[~microsoft.dynamics.customerinsights.api.models.PartitionMetadata]
    :ivar incremental_delete_partitions: Gets entity incremental delete data
     partitions.
    :vartype incremental_delete_partitions:
     list[~microsoft.dynamics.customerinsights.api.models.PartitionMetadata]
    :ivar annotations: Gets base entity name
    :vartype annotations:
     list[~microsoft.dynamics.customerinsights.api.models.Annotation]
    """

    _validation = {
        'name': {'readonly': True},
        'qualified_entity_name': {'readonly': True},
        'data_source_name': {'readonly': True},
        'datasource_id': {'readonly': True},
        'attributes': {'readonly': True},
        'keys': {'readonly': True},
        'relationships': {'readonly': True},
        'refresh_time': {'readonly': True},
        'partitions': {'readonly': True},
        'incremental_upsert_partitions': {'readonly': True},
        'incremental_delete_partitions': {'readonly': True},
        'annotations': {'readonly': True},
    }

    _attribute_map = {
        'name': {'key': 'name', 'type': 'str'},
        'qualified_entity_name': {'key': 'qualifiedEntityName', 'type': 'str'},
        'data_source_name': {'key': 'dataSourceName', 'type': 'str'},
        'dataflow_type': {'key': 'dataflowType', 'type': 'str'},
        'datasource_id': {'key': 'datasourceId', 'type': 'str'},
        'entity_type': {'key': 'entityType', 'type': 'str'},
        'attributes': {'key': 'attributes', 'type': '[IAttributeMetadata]'},
        'keys': {'key': 'keys', 'type': '[[IAttributeMetadata]]'},
        'relationships': {'key': 'relationships', 'type': '[IRelationshipMetadata]'},
        'timestamp_attribute': {'key': 'timestampAttribute', 'type': 'IAttributeMetadata'},
        'semantic_type': {'key': 'semanticType', 'type': 'str'},
        'refresh_time': {'key': 'refreshTime', 'type': 'iso-8601'},
        'partitions': {'key': 'partitions', 'type': '[PartitionMetadata]'},
        'incremental_upsert_partitions': {'key': 'incrementalUpsertPartitions', 'type': '[PartitionMetadata]'},
        'incremental_delete_partitions': {'key': 'incrementalDeletePartitions', 'type': '[PartitionMetadata]'},
        'annotations': {'key': 'annotations', 'type': '[Annotation]'},
    }

    def __init__(self, *, dataflow_type=None, entity_type=None, timestamp_attribute=None, semantic_type=None, **kwargs) -> None:
        super(IEntityMetadata, self).__init__(**kwargs)
        self.name = None
        self.qualified_entity_name = None
        self.data_source_name = None
        self.dataflow_type = dataflow_type
        self.datasource_id = None
        self.entity_type = entity_type
        self.attributes = None
        self.keys = None
        self.relationships = None
        self.timestamp_attribute = timestamp_attribute
        self.semantic_type = semantic_type
        self.refresh_time = None
        self.partitions = None
        self.incremental_upsert_partitions = None
        self.incremental_delete_partitions = None
        self.annotations = None
