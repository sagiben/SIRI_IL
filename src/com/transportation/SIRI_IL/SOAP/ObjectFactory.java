
package com.transportation.SIRI_IL.SOAP;

import java.math.BigInteger;
import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlElementDecl;
import javax.xml.bind.annotation.XmlRegistry;
import javax.xml.bind.annotation.adapters.CollapsedStringAdapter;
import javax.xml.bind.annotation.adapters.XmlJavaTypeAdapter;
import javax.xml.datatype.Duration;
import javax.xml.datatype.XMLGregorianCalendar;
import javax.xml.namespace.QName;


/**
 * This object contains factory methods for each 
 * Java content interface and Java element interface 
 * generated in the com.transportation.SIRI_IL.SOAP package. 
 * <p>An ObjectFactory allows you to programatically 
 * construct new instances of the Java representation 
 * for XML content. The Java representation of XML 
 * content can consist of schema derived interfaces 
 * and classes representing the binding of schema 
 * type definitions, element declarations and model 
 * groups.  Factory methods for each of these are 
 * provided in this class.
 * 
 */
@XmlRegistry
public class ObjectFactory {

    private final static QName _StopPointsRequest_QNAME = new QName("http://www.siri.org.uk/siri", "StopPointsRequest");
    private final static QName _AbstractDiscoveryDelivery_QNAME = new QName("http://www.siri.org.uk/siri", "AbstractDiscoveryDelivery");
    private final static QName _AbstractResponse_QNAME = new QName("http://www.siri.org.uk/siri", "AbstractResponse");
    private final static QName _RequestorRef_QNAME = new QName("http://www.siri.org.uk/siri", "RequestorRef");
    private final static QName _ActualDepartureTime_QNAME = new QName("http://www.siri.org.uk/siri", "ActualDepartureTime");
    private final static QName _BusSubmode_QNAME = new QName("http://www.siri.org.uk/siri", "BusSubmode");
    private final static QName _OriginRef_QNAME = new QName("http://www.siri.org.uk/siri", "OriginRef");
    private final static QName _Condition_QNAME = new QName("http://www.siri.org.uk/siri", "Condition");
    private final static QName _StepFreeAccess_QNAME = new QName("http://www.ifopt.org.uk/acsb", "StepFreeAccess");
    private final static QName _PublishToMobileAction_QNAME = new QName("http://www.siri.org.uk/siri", "PublishToMobileAction");
    private final static QName _TimetabledFeederArrivalCancellation_QNAME = new QName("http://www.siri.org.uk/siri", "TimetabledFeederArrivalCancellation");
    private final static QName _VehicleMonitoringServiceCapabilities_QNAME = new QName("http://www.siri.org.uk/siri", "VehicleMonitoringServiceCapabilities");
    private final static QName _FilterByOperatorRef_QNAME = new QName("http://www.siri.org.uk/siri", "FilterByOperatorRef");
    private final static QName _ServiceFeaturesDelivery_QNAME = new QName("http://www.siri.org.uk/siri", "ServiceFeaturesDelivery");
    private final static QName _UndefinedReason_QNAME = new QName("http://www.siri.org.uk/siri", "UndefinedReason");
    private final static QName _CheckOperatorRef_QNAME = new QName("http://www.siri.org.uk/siri", "CheckOperatorRef");
    private final static QName _ProductionTimetableServiceCapabilities_QNAME = new QName("http://www.siri.org.uk/siri", "ProductionTimetableServiceCapabilities");
    private final static QName _ZoneProjection_QNAME = new QName("http://www.ifopt.org.uk/ifopt", "ZoneProjection");
    private final static QName _SituationExchangeSubscriptionRequest_QNAME = new QName("http://www.siri.org.uk/siri", "SituationExchangeSubscriptionRequest");
    private final static QName _LinesRequest_QNAME = new QName("http://www.siri.org.uk/siri", "LinesRequest");
    private final static QName _FacilityDelivery_QNAME = new QName("http://www.siri.org.uk/siri", "FacilityDelivery");
    private final static QName _JourneyNote_QNAME = new QName("http://www.siri.org.uk/siri", "JourneyNote");
    private final static QName _ErrorCode_QNAME = new QName("http://www.siri.org.uk/siri", "ErrorCode");
    private final static QName _EstimatedTimetableDelivery_QNAME = new QName("http://www.siri.org.uk/siri", "EstimatedTimetableDelivery");
    private final static QName _SituationNumber_QNAME = new QName("http://www.siri.org.uk/siri", "SituationNumber");
    private final static QName _AbstractTrackedRequest_QNAME = new QName("http://www.siri.org.uk/siri", "AbstractTrackedRequest");
    private final static QName _FilterByFacilityRef_QNAME = new QName("http://www.siri.org.uk/siri", "FilterByFacilityRef");
    private final static QName _PublishToDisplayAction_QNAME = new QName("http://www.siri.org.uk/siri", "PublishToDisplayAction");
    private final static QName _EscalatorFreeAccess_QNAME = new QName("http://www.ifopt.org.uk/acsb", "EscalatorFreeAccess");
    private final static QName _ConnectionTimetableServiceCapabilities_QNAME = new QName("http://www.siri.org.uk/siri", "ConnectionTimetableServiceCapabilities");
    private final static QName _FacilityRef_QNAME = new QName("http://www.siri.org.uk/siri", "FacilityRef");
    private final static QName _UnknownSubscriptionError_QNAME = new QName("http://www.siri.org.uk/siri", "UnknownSubscriptionError");
    private final static QName _ConnectionMonitoringCapabilitiesRequest_QNAME = new QName("http://www.siri.org.uk/siri", "ConnectionMonitoringCapabilitiesRequest");
    private final static QName _DatedVehicleJourney_QNAME = new QName("http://www.siri.org.uk/siri", "DatedVehicleJourney");
    private final static QName _FilterByMonitoringRef_QNAME = new QName("http://www.siri.org.uk/siri", "FilterByMonitoringRef");
    private final static QName _ReportType_QNAME = new QName("http://www.siri.org.uk/siri", "ReportType");
    private final static QName _CheckStatusRequest_QNAME = new QName("http://www.siri.org.uk/siri", "CheckStatusRequest");
    private final static QName _InterchangeRef_QNAME = new QName("http://www.siri.org.uk/siri", "InterchangeRef");
    private final static QName _RoutePointType_QNAME = new QName("http://www.siri.org.uk/siri", "RoutePointType");
    private final static QName _PublishToWebAction_QNAME = new QName("http://www.siri.org.uk/siri", "PublishToWebAction");
    private final static QName _ServiceFeature_QNAME = new QName("http://www.siri.org.uk/siri", "ServiceFeature");
    private final static QName _DepartureBoardingActivity_QNAME = new QName("http://www.siri.org.uk/siri", "DepartureBoardingActivity");
    private final static QName _TimetabledFeederArrival_QNAME = new QName("http://www.siri.org.uk/siri", "TimetabledFeederArrival");
    private final static QName _AbstractFunctionalServiceDelivery_QNAME = new QName("http://www.siri.org.uk/siri", "AbstractFunctionalServiceDelivery");
    private final static QName _StopPointRef_QNAME = new QName("http://www.siri.org.uk/siri", "StopPointRef");
    private final static QName _VehicleMonitoringDelivery_QNAME = new QName("http://www.siri.org.uk/siri", "VehicleMonitoringDelivery");
    private final static QName _CheckConnectionLinkRef_QNAME = new QName("http://www.siri.org.uk/siri", "CheckConnectionLinkRef");
    private final static QName _Direction_QNAME = new QName("http://www.siri.org.uk/siri", "Direction");
    private final static QName _GuideDogAccess_QNAME = new QName("http://www.ifopt.org.uk/acsb", "GuideDogAccess");
    private final static QName _GeneralMessageCapabilitiesResponse_QNAME = new QName("http://www.siri.org.uk/siri", "GeneralMessageCapabilitiesResponse");
    private final static QName _StopPointName_QNAME = new QName("http://www.siri.org.uk/siri", "StopPointName");
    private final static QName _TicketRestrictionType_QNAME = new QName("http://www.siri.org.uk/siri", "TicketRestrictionType");
    private final static QName _VisitNumber_QNAME = new QName("http://www.siri.org.uk/siri", "VisitNumber");
    private final static QName _ConnectionTimetableCapabilitiesRequest_QNAME = new QName("http://www.siri.org.uk/siri", "ConnectionTimetableCapabilitiesRequest");
    private final static QName _ActualArrivalTime_QNAME = new QName("http://www.siri.org.uk/siri", "ActualArrivalTime");
    private final static QName _VehicleFeaturesDelivery_QNAME = new QName("http://www.siri.org.uk/siri", "VehicleFeaturesDelivery");
    private final static QName _AbstractFunctionalServiceSubscriptionRequest_QNAME = new QName("http://www.siri.org.uk/siri", "AbstractFunctionalServiceSubscriptionRequest");
    private final static QName _WheelchairAccess_QNAME = new QName("http://www.ifopt.org.uk/acsb", "WheelchairAccess");
    private final static QName _UnknownSubscriberError_QNAME = new QName("http://www.siri.org.uk/siri", "UnknownSubscriberError");
    private final static QName _StopMonitoringMultipleRequest_QNAME = new QName("http://www.siri.org.uk/siri", "StopMonitoringMultipleRequest");
    private final static QName _AbstractServiceRequest_QNAME = new QName("http://www.siri.org.uk/siri", "AbstractServiceRequest");
    private final static QName _StopPointsDelivery_QNAME = new QName("http://www.siri.org.uk/siri", "StopPointsDelivery");
    private final static QName _FacilityMonitoringSubscriptionRequest_QNAME = new QName("http://www.siri.org.uk/siri", "FacilityMonitoringSubscriptionRequest");
    private final static QName _VehicleMonitoringSubscriptionRequest_QNAME = new QName("http://www.siri.org.uk/siri", "VehicleMonitoringSubscriptionRequest");
    private final static QName _EquipmentSubReason_QNAME = new QName("http://www.siri.org.uk/siri", "EquipmentSubReason");
    private final static QName _BeyondDataHorizon_QNAME = new QName("http://www.siri.org.uk/siri", "BeyondDataHorizon");
    private final static QName _CoachSubmode_QNAME = new QName("http://www.siri.org.uk/siri", "CoachSubmode");
    private final static QName _Severity_QNAME = new QName("http://www.siri.org.uk/siri", "Severity");
    private final static QName _FunicularSubmode_QNAME = new QName("http://www.siri.org.uk/siri", "FunicularSubmode");
    private final static QName _ConnectionTimetableCapabilitiesResponse_QNAME = new QName("http://www.siri.org.uk/siri", "ConnectionTimetableCapabilitiesResponse");
    private final static QName _TimingPoint_QNAME = new QName("http://www.siri.org.uk/siri", "TimingPoint");
    private final static QName _ProductionTimetableRequest_QNAME = new QName("http://www.siri.org.uk/siri", "ProductionTimetableRequest");
    private final static QName _JourneyPatternRef_QNAME = new QName("http://www.siri.org.uk/siri", "JourneyPatternRef");
    private final static QName _FacilityMonitoringServiceCapabilities_QNAME = new QName("http://www.siri.org.uk/siri", "FacilityMonitoringServiceCapabilities");
    private final static QName _FacilityChangeElement_QNAME = new QName("http://www.siri.org.uk/siri", "FacilityChangeElement");
    private final static QName _SituationExchangeRequest_QNAME = new QName("http://www.siri.org.uk/siri", "SituationExchangeRequest");
    private final static QName _SituationExchangeCapabilitiesRequest_QNAME = new QName("http://www.siri.org.uk/siri", "SituationExchangeCapabilitiesRequest");
    private final static QName _SelfDriveSubmode_QNAME = new QName("http://www.siri.org.uk/siri", "SelfDriveSubmode");
    private final static QName _CheckLineRef_QNAME = new QName("http://www.siri.org.uk/siri", "CheckLineRef");
    private final static QName _FacilityMonitoringCapabilitiesRequest_QNAME = new QName("http://www.siri.org.uk/siri", "FacilityMonitoringCapabilitiesRequest");
    private final static QName _EstimatedTimetableCapabilitiesRequest_QNAME = new QName("http://www.siri.org.uk/siri", "EstimatedTimetableCapabilitiesRequest");
    private final static QName _ExpectedDepartureTime_QNAME = new QName("http://www.siri.org.uk/siri", "ExpectedDepartureTime");
    private final static QName _AimedDepartureTime_QNAME = new QName("http://www.siri.org.uk/siri", "AimedDepartureTime");
    private final static QName _ProductionTimetableSubscriptionRequest_QNAME = new QName("http://www.siri.org.uk/siri", "ProductionTimetableSubscriptionRequest");
    private final static QName _ProductCategoriesDelivery_QNAME = new QName("http://www.siri.org.uk/siri", "ProductCategoriesDelivery");
    private final static QName _FilterByValidityPeriod_QNAME = new QName("http://www.siri.org.uk/siri", "FilterByValidityPeriod");
    private final static QName _EquipmentReason_QNAME = new QName("http://www.siri.org.uk/siri", "EquipmentReason");
    private final static QName _EstimatedTimetableCapabilitiesResponse_QNAME = new QName("http://www.siri.org.uk/siri", "EstimatedTimetableCapabilitiesResponse");
    private final static QName _AimedHeadwayInterval_QNAME = new QName("http://www.siri.org.uk/siri", "AimedHeadwayInterval");
    private final static QName _TaxiSubmode_QNAME = new QName("http://www.siri.org.uk/siri", "TaxiSubmode");
    private final static QName _FacilityMonitoringDelivery_QNAME = new QName("http://www.siri.org.uk/siri", "FacilityMonitoringDelivery");
    private final static QName _MobilityFacility_QNAME = new QName("http://www.siri.org.uk/siri", "MobilityFacility");
    private final static QName _ProductionTimetableDelivery_QNAME = new QName("http://www.siri.org.uk/siri", "ProductionTimetableDelivery");
    private final static QName _ConnectionLinkRef_QNAME = new QName("http://www.siri.org.uk/siri", "ConnectionLinkRef");
    private final static QName _DayType_QNAME = new QName("http://www.siri.org.uk/siri", "DayType");
    private final static QName _PersonnelReason_QNAME = new QName("http://www.siri.org.uk/siri", "PersonnelReason");
    private final static QName _Extensions_QNAME = new QName("http://www.siri.org.uk/siri", "Extensions");
    private final static QName _ConnectionMonitoringSubscriptionRequest_QNAME = new QName("http://www.siri.org.uk/siri", "ConnectionMonitoringSubscriptionRequest");
    private final static QName _DataSupplyRequest_QNAME = new QName("http://www.siri.org.uk/siri", "DataSupplyRequest");
    private final static QName _SrsName_QNAME = new QName("http://www.siri.org.uk/siri", "SrsName");
    private final static QName _TargetedCall_QNAME = new QName("http://www.siri.org.uk/siri", "TargetedCall");
    private final static QName _ArrivalStatus_QNAME = new QName("http://www.siri.org.uk/siri", "ArrivalStatus");
    private final static QName _VersionRef_QNAME = new QName("http://www.siri.org.uk/siri", "VersionRef");
    private final static QName _MiscellaneousReason_QNAME = new QName("http://www.siri.org.uk/siri", "MiscellaneousReason");
    private final static QName _CheckMonitoringRef_QNAME = new QName("http://www.siri.org.uk/siri", "CheckMonitoringRef");
    private final static QName _SituationExchangeDelivery_QNAME = new QName("http://www.siri.org.uk/siri", "SituationExchangeDelivery");
    private final static QName _PassengerInformationFacility_QNAME = new QName("http://www.siri.org.uk/siri", "PassengerInformationFacility");
    private final static QName _FacilityRequest_QNAME = new QName("http://www.siri.org.uk/siri", "FacilityRequest");
    private final static QName _ProductionTimetableCapabilitiesRequest_QNAME = new QName("http://www.siri.org.uk/siri", "ProductionTimetableCapabilitiesRequest");
    private final static QName _VehicleJourneyRef_QNAME = new QName("http://www.siri.org.uk/siri", "VehicleJourneyRef");
    private final static QName _FacilityConditionElement_QNAME = new QName("http://www.siri.org.uk/siri", "FacilityConditionElement");
    private final static QName _ConnectionMonitoringCapabilitiesResponse_QNAME = new QName("http://www.siri.org.uk/siri", "ConnectionMonitoringCapabilitiesResponse");
    private final static QName _StopPlaceRef_QNAME = new QName("http://www.ifopt.org.uk/ifopt", "StopPlaceRef");
    private final static QName _VehicleMonitoringCapabilitiesResponse_QNAME = new QName("http://www.siri.org.uk/siri", "VehicleMonitoringCapabilitiesResponse");
    private final static QName _TimetableType_QNAME = new QName("http://www.siri.org.uk/siri", "TimetableType");
    private final static QName _ProductCategoriesRequest_QNAME = new QName("http://www.siri.org.uk/siri", "ProductCategoriesRequest");
    private final static QName _PublishedLineName_QNAME = new QName("http://www.siri.org.uk/siri", "PublishedLineName");
    private final static QName _AllowAll_QNAME = new QName("http://www.siri.org.uk/siri", "AllowAll");
    private final static QName _InfoChannelRequest_QNAME = new QName("http://www.siri.org.uk/siri", "InfoChannelRequest");
    private final static QName _StopTimetableCapabilitiesResponse_QNAME = new QName("http://www.siri.org.uk/siri", "StopTimetableCapabilitiesResponse");
    private final static QName _ProducerRequest_QNAME = new QName("http://www.siri.org.uk/siri", "ProducerRequest");
    private final static QName _AccommodationFacility_QNAME = new QName("http://www.siri.org.uk/siri", "AccommodationFacility");
    private final static QName _FilterByVehicleJourneyRef_QNAME = new QName("http://www.siri.org.uk/siri", "FilterByVehicleJourneyRef");
    private final static QName _Status_QNAME = new QName("http://www.siri.org.uk/siri", "Status");
    private final static QName _GeneralMessageServiceCapabilities_QNAME = new QName("http://www.siri.org.uk/siri", "GeneralMessageServiceCapabilities");
    private final static QName _EstimatedCall_QNAME = new QName("http://www.siri.org.uk/siri", "EstimatedCall");
    private final static QName _FareClassFacility_QNAME = new QName("http://www.siri.org.uk/siri", "FareClassFacility");
    private final static QName _ArrivalBoardingActivity_QNAME = new QName("http://www.siri.org.uk/siri", "ArrivalBoardingActivity");
    private final static QName _StopTimetableDelivery_QNAME = new QName("http://www.siri.org.uk/siri", "StopTimetableDelivery");
    private final static QName _FacilityMonitoringCapabilitiesResponse_QNAME = new QName("http://www.siri.org.uk/siri", "FacilityMonitoringCapabilitiesResponse");
    private final static QName _LinkProjection_QNAME = new QName("http://www.ifopt.org.uk/ifopt", "LinkProjection");
    private final static QName _StopMonitoringSubscriptionRequest_QNAME = new QName("http://www.siri.org.uk/siri", "StopMonitoringSubscriptionRequest");
    private final static QName _WaterSubmode_QNAME = new QName("http://www.siri.org.uk/siri", "WaterSubmode");
    private final static QName _EstimatedVehicleJourney_QNAME = new QName("http://www.siri.org.uk/siri", "EstimatedVehicleJourney");
    private final static QName _SituationFullRef_QNAME = new QName("http://www.siri.org.uk/siri", "SituationFullRef");
    private final static QName _AccessFacility_QNAME = new QName("http://www.siri.org.uk/siri", "AccessFacility");
    private final static QName _FacilityMonitoringRequest_QNAME = new QName("http://www.siri.org.uk/siri", "FacilityMonitoringRequest");
    private final static QName _StopTimetableServiceCapabilities_QNAME = new QName("http://www.siri.org.uk/siri", "StopTimetableServiceCapabilities");
    private final static QName _RefreshmentFacility_QNAME = new QName("http://www.siri.org.uk/siri", "RefreshmentFacility");
    private final static QName _InfoChannelDelivery_QNAME = new QName("http://www.siri.org.uk/siri", "InfoChannelDelivery");
    private final static QName _RouteName_QNAME = new QName("http://www.siri.org.uk/siri", "RouteName");
    private final static QName _NotifyByPagerAction_QNAME = new QName("http://www.siri.org.uk/siri", "NotifyByPagerAction");
    private final static QName _ConnectionTimetableDelivery_QNAME = new QName("http://www.siri.org.uk/siri", "ConnectionTimetableDelivery");
    private final static QName _EstimatedTimetableSubscriptionRequest_QNAME = new QName("http://www.siri.org.uk/siri", "EstimatedTimetableSubscriptionRequest");
    private final static QName _HireFacility_QNAME = new QName("http://www.siri.org.uk/siri", "HireFacility");
    private final static QName _GeneralMessageRequest_QNAME = new QName("http://www.siri.org.uk/siri", "GeneralMessageRequest");
    private final static QName _AirSubmode_QNAME = new QName("http://www.siri.org.uk/siri", "AirSubmode");
    private final static QName _MiscellaneousSubReason_QNAME = new QName("http://www.siri.org.uk/siri", "MiscellaneousSubReason");
    private final static QName _RailSubmode_QNAME = new QName("http://www.siri.org.uk/siri", "RailSubmode");
    private final static QName _ProductionTimetableCapabilitiesResponse_QNAME = new QName("http://www.siri.org.uk/siri", "ProductionTimetableCapabilitiesResponse");
    private final static QName _LuggageFacility_QNAME = new QName("http://www.siri.org.uk/siri", "LuggageFacility");
    private final static QName _PersonnelSubReason_QNAME = new QName("http://www.siri.org.uk/siri", "PersonnelSubReason");
    private final static QName _GeneralMessageSubscriptionRequest_QNAME = new QName("http://www.siri.org.uk/siri", "GeneralMessageSubscriptionRequest");
    private final static QName _EnvironmentSubReason_QNAME = new QName("http://www.siri.org.uk/siri", "EnvironmentSubReason");
    private final static QName _TramSubmode_QNAME = new QName("http://www.siri.org.uk/siri", "TramSubmode");
    private final static QName _SituationExchangeServiceCapabilities_QNAME = new QName("http://www.siri.org.uk/siri", "SituationExchangeServiceCapabilities");
    private final static QName _FilterByStopPointRef_QNAME = new QName("http://www.siri.org.uk/siri", "FilterByStopPointRef");
    private final static QName _GeneralMessageCancellation_QNAME = new QName("http://www.siri.org.uk/siri", "GeneralMessageCancellation");
    private final static QName _NotifyBySmsAction_QNAME = new QName("http://www.siri.org.uk/siri", "NotifyBySmsAction");
    private final static QName _CapabilitiesRequest_QNAME = new QName("http://www.siri.org.uk/siri", "CapabilitiesRequest");
    private final static QName _DeparturePlatformName_QNAME = new QName("http://www.siri.org.uk/siri", "DeparturePlatformName");
    private final static QName _ServiceDeliveryErrorCondition_QNAME = new QName("http://www.siri.org.uk/siri", "ServiceDeliveryErrorCondition");
    private final static QName _StopTimetableSubscriptionRequest_QNAME = new QName("http://www.siri.org.uk/siri", "StopTimetableSubscriptionRequest");
    private final static QName _ConnectionMonitoringRequest_QNAME = new QName("http://www.siri.org.uk/siri", "ConnectionMonitoringRequest");
    private final static QName _DataReceivedAcknowledgement_QNAME = new QName("http://www.siri.org.uk/siri", "DataReceivedAcknowledgement");
    private final static QName _StopMonitoringRequest_QNAME = new QName("http://www.siri.org.uk/siri", "StopMonitoringRequest");
    private final static QName _ConnectionMonitoringServiceCapabilities_QNAME = new QName("http://www.siri.org.uk/siri", "ConnectionMonitoringServiceCapabilities");
    private final static QName _ConnectionMonitoringDistributorDelivery_QNAME = new QName("http://www.siri.org.uk/siri", "ConnectionMonitoringDistributorDelivery");
    private final static QName _PtSituationElement_QNAME = new QName("http://www.siri.org.uk/siri", "PtSituationElement");
    private final static QName _GeneralMessageCapabilitiesRequest_QNAME = new QName("http://www.siri.org.uk/siri", "GeneralMessageCapabilitiesRequest");
    private final static QName _FilterByConnectionLinkRef_QNAME = new QName("http://www.siri.org.uk/siri", "FilterByConnectionLinkRef");
    private final static QName _AbstractFunctionalServiceCapabilitiesRequest_QNAME = new QName("http://www.siri.org.uk/siri", "AbstractFunctionalServiceCapabilitiesRequest");
    private final static QName _ServiceFeaturesRequest_QNAME = new QName("http://www.siri.org.uk/siri", "ServiceFeaturesRequest");
    private final static QName _DataReadyAcknowledgement_QNAME = new QName("http://www.siri.org.uk/siri", "DataReadyAcknowledgement");
    private final static QName _ConnectionTimetableSubscriptionRequest_QNAME = new QName("http://www.siri.org.uk/siri", "ConnectionTimetableSubscriptionRequest");
    private final static QName _InterchangeStatusType_QNAME = new QName("http://www.siri.org.uk/siri", "InterchangeStatusType");
    private final static QName _ExpectedArrivalTime_QNAME = new QName("http://www.siri.org.uk/siri", "ExpectedArrivalTime");
    private final static QName _InfoChannel_QNAME = new QName("http://www.siri.org.uk/siri", "InfoChannel");
    private final static QName _ConnectionMonitoringFeederDelivery_QNAME = new QName("http://www.siri.org.uk/siri", "ConnectionMonitoringFeederDelivery");
    private final static QName _PublishToAlertsAction_QNAME = new QName("http://www.siri.org.uk/siri", "PublishToAlertsAction");
    private final static QName _FilterByDestination_QNAME = new QName("http://www.siri.org.uk/siri", "FilterByDestination");
    private final static QName _NavigationPathRef_QNAME = new QName("http://www.ifopt.org.uk/ifopt", "NavigationPathRef");
    private final static QName _RetailFacility_QNAME = new QName("http://www.siri.org.uk/siri", "RetailFacility");
    private final static QName _PathJunctionRef_QNAME = new QName("http://www.ifopt.org.uk/ifopt", "PathJunctionRef");
    private final static QName _LocalService_QNAME = new QName("http://www.ifopt.org.uk/ifopt", "LocalService");
    private final static QName _LiftFreeAccess_QNAME = new QName("http://www.ifopt.org.uk/acsb", "LiftFreeAccess");
    private final static QName _FilterByLineRef_QNAME = new QName("http://www.siri.org.uk/siri", "FilterByLineRef");
    private final static QName _FeatureRef_QNAME = new QName("http://www.siri.org.uk/siri", "FeatureRef");
    private final static QName _LinesDelivery_QNAME = new QName("http://www.siri.org.uk/siri", "LinesDelivery");
    private final static QName _OtherError_QNAME = new QName("http://www.siri.org.uk/siri", "OtherError");
    private final static QName _StopMonitoringDelivery_QNAME = new QName("http://www.siri.org.uk/siri", "StopMonitoringDelivery");
    private final static QName _EstimatedTimetableRequest_QNAME = new QName("http://www.siri.org.uk/siri", "EstimatedTimetableRequest");
    private final static QName _GeneralMessage_QNAME = new QName("http://www.siri.org.uk/siri", "GeneralMessage");
    private final static QName _OriginName_QNAME = new QName("http://www.siri.org.uk/siri", "OriginName");
    private final static QName _TelecabinSubmode_QNAME = new QName("http://www.siri.org.uk/siri", "TelecabinSubmode");
    private final static QName _VerificationStatus_QNAME = new QName("http://www.siri.org.uk/siri", "VerificationStatus");
    private final static QName _VehicleMonitoringCapabilitiesRequest_QNAME = new QName("http://www.siri.org.uk/siri", "VehicleMonitoringCapabilitiesRequest");
    private final static QName _ServiceNotAvailableError_QNAME = new QName("http://www.siri.org.uk/siri", "ServiceNotAvailableError");
    private final static QName _D2LogicalModel_QNAME = new QName("http://datex2.eu/schema/1_0/1_0", "d2LogicalModel");
    private final static QName _NotifyByEmailAction_QNAME = new QName("http://www.siri.org.uk/siri", "NotifyByEmailAction");
    private final static QName _AbstractFunctionalServiceCapabilitiesResponse_QNAME = new QName("http://www.siri.org.uk/siri", "AbstractFunctionalServiceCapabilitiesResponse");
    private final static QName _LineRef_QNAME = new QName("http://www.siri.org.uk/siri", "LineRef");
    private final static QName _AllowedResourceUsageExceededError_QNAME = new QName("http://www.siri.org.uk/siri", "AllowedResourceUsageExceededError");
    private final static QName _PointProjection_QNAME = new QName("http://www.ifopt.org.uk/ifopt", "PointProjection");
    private final static QName _Destination_QNAME = new QName("http://www.siri.org.uk/siri", "Destination");
    private final static QName _StopMonitoringServiceCapabilities_QNAME = new QName("http://www.siri.org.uk/siri", "StopMonitoringServiceCapabilities");
    private final static QName _DestinationRef_QNAME = new QName("http://www.siri.org.uk/siri", "DestinationRef");
    private final static QName _MetroSubmode_QNAME = new QName("http://www.siri.org.uk/siri", "MetroSubmode");
    private final static QName _FilterByInterchangeRef_QNAME = new QName("http://www.siri.org.uk/siri", "FilterByInterchangeRef");
    private final static QName _BookingStatusType_QNAME = new QName("http://www.siri.org.uk/siri", "BookingStatusType");
    private final static QName _VehicleRef_QNAME = new QName("http://www.siri.org.uk/siri", "VehicleRef");
    private final static QName _DatedCall_QNAME = new QName("http://www.siri.org.uk/siri", "DatedCall");
    private final static QName _CapabilitiesResponse_QNAME = new QName("http://www.siri.org.uk/siri", "CapabilitiesResponse");
    private final static QName _PublishToTvAction_QNAME = new QName("http://www.siri.org.uk/siri", "PublishToTvAction");
    private final static QName _ViaName_QNAME = new QName("http://www.siri.org.uk/siri", "ViaName");
    private final static QName _VehicleFeaturesRequest_QNAME = new QName("http://www.siri.org.uk/siri", "VehicleFeaturesRequest");
    private final static QName _AimedArrivalTime_QNAME = new QName("http://www.siri.org.uk/siri", "AimedArrivalTime");
    private final static QName _Predictability_QNAME = new QName("http://www.siri.org.uk/siri", "Predictability");
    private final static QName _AbstractRequest_QNAME = new QName("http://www.siri.org.uk/siri", "AbstractRequest");
    private final static QName _ErrorConditionElement_QNAME = new QName("http://www.siri.org.uk/siri", "ErrorConditionElement");
    private final static QName _SituationExchangeCapabilitiesResponse_QNAME = new QName("http://www.siri.org.uk/siri", "SituationExchangeCapabilitiesResponse");
    private final static QName _OtherPlaceEquipment_QNAME = new QName("http://www.ifopt.org.uk/ifopt", "OtherPlaceEquipment");
    private final static QName _RoadSituationElement_QNAME = new QName("http://www.siri.org.uk/siri", "RoadSituationElement");
    private final static QName _SubscriptionResponse_QNAME = new QName("http://www.siri.org.uk/siri", "SubscriptionResponse");
    private final static QName _VehicleMode_QNAME = new QName("http://www.siri.org.uk/siri", "VehicleMode");
    private final static QName _VehicleFeature_QNAME = new QName("http://www.siri.org.uk/siri", "VehicleFeature");
    private final static QName _EnvironmentReason_QNAME = new QName("http://www.siri.org.uk/siri", "EnvironmentReason");
    private final static QName _StopMonitoringCapabilitiesResponse_QNAME = new QName("http://www.siri.org.uk/siri", "StopMonitoringCapabilitiesResponse");
    private final static QName _StopPointType_QNAME = new QName("http://www.siri.org.uk/siri", "StopPointType");
    private final static QName _NuisanceFacility_QNAME = new QName("http://www.siri.org.uk/siri", "NuisanceFacility");
    private final static QName _StopMonitoringCapabilitiesRequest_QNAME = new QName("http://www.siri.org.uk/siri", "StopMonitoringCapabilitiesRequest");
    private final static QName _DatedVehicleJourneyRef_QNAME = new QName("http://www.siri.org.uk/siri", "DatedVehicleJourneyRef");
    private final static QName _PassengerCommsFacility_QNAME = new QName("http://www.siri.org.uk/siri", "PassengerCommsFacility");
    private final static QName _FilterByVehicleRef_QNAME = new QName("http://www.siri.org.uk/siri", "FilterByVehicleRef");
    private final static QName _AssistanceFacility_QNAME = new QName("http://www.siri.org.uk/siri", "AssistanceFacility");
    private final static QName _ConnectionTimetableRequest_QNAME = new QName("http://www.siri.org.uk/siri", "ConnectionTimetableRequest");
    private final static QName _ParkingFacility_QNAME = new QName("http://www.siri.org.uk/siri", "ParkingFacility");
    private final static QName _DepartureStatus_QNAME = new QName("http://www.siri.org.uk/siri", "DepartureStatus");
    private final static QName _InfoLink_QNAME = new QName("http://www.ifopt.org.uk/ifopt", "InfoLink");
    private final static QName _EstimatedTimetableServiceCapabilities_QNAME = new QName("http://www.siri.org.uk/siri", "EstimatedTimetableServiceCapabilities");
    private final static QName _ViaRef_QNAME = new QName("http://www.siri.org.uk/siri", "ViaRef");
    private final static QName _AudibleSignalsAvailable_QNAME = new QName("http://www.ifopt.org.uk/acsb", "AudibleSignalsAvailable");
    private final static QName _AbstractDiscoveryRequest_QNAME = new QName("http://www.siri.org.uk/siri", "AbstractDiscoveryRequest");
    private final static QName _ArrivalPlatformName_QNAME = new QName("http://www.siri.org.uk/siri", "ArrivalPlatformName");
    private final static QName _RequestTimestamp_QNAME = new QName("http://www.siri.org.uk/siri", "RequestTimestamp");
    private final static QName _HeartbeatNotification_QNAME = new QName("http://www.siri.org.uk/siri", "HeartbeatNotification");
    private final static QName _CapabilityNotSupportedError_QNAME = new QName("http://www.siri.org.uk/siri", "CapabilityNotSupportedError");
    private final static QName _CheckStatusResponse_QNAME = new QName("http://www.siri.org.uk/siri", "CheckStatusResponse");
    private final static QName _AccessNotAllowedError_QNAME = new QName("http://www.siri.org.uk/siri", "AccessNotAllowedError");
    private final static QName _TerminateSubscriptionRequest_QNAME = new QName("http://www.siri.org.uk/siri", "TerminateSubscriptionRequest");
    private final static QName _ResponseStatus_QNAME = new QName("http://www.siri.org.uk/siri", "ResponseStatus");
    private final static QName _VehicleMonitoringRequest_QNAME = new QName("http://www.siri.org.uk/siri", "VehicleMonitoringRequest");
    private final static QName _NoInfoForTopicError_QNAME = new QName("http://www.siri.org.uk/siri", "NoInfoForTopicError");
    private final static QName _VehicleAtStop_QNAME = new QName("http://www.siri.org.uk/siri", "VehicleAtStop");
    private final static QName _ServiceFeatureRef_QNAME = new QName("http://www.siri.org.uk/siri", "ServiceFeatureRef");
    private final static QName _GeneralMessageDelivery_QNAME = new QName("http://www.siri.org.uk/siri", "GeneralMessageDelivery");
    private final static QName _SanitaryFacility_QNAME = new QName("http://www.siri.org.uk/siri", "SanitaryFacility");
    private final static QName _Order_QNAME = new QName("http://www.siri.org.uk/siri", "Order");
    private final static QName _NotifyUserAction_QNAME = new QName("http://www.siri.org.uk/siri", "NotifyUserAction");
    private final static QName _DestinationName_QNAME = new QName("http://www.siri.org.uk/siri", "DestinationName");
    private final static QName _StopTimetableRequest_QNAME = new QName("http://www.siri.org.uk/siri", "StopTimetableRequest");
    private final static QName _AccessLinkRef_QNAME = new QName("http://www.ifopt.org.uk/ifopt", "AccessLinkRef");
    private final static QName _ReservedSpaceFacility_QNAME = new QName("http://www.siri.org.uk/siri", "ReservedSpaceFacility");
    private final static QName _AbstractFunctionalServiceRequest_QNAME = new QName("http://www.siri.org.uk/siri", "AbstractFunctionalServiceRequest");
    private final static QName _ResponseTimestamp_QNAME = new QName("http://www.siri.org.uk/siri", "ResponseTimestamp");
    private final static QName _TicketingFacility_QNAME = new QName("http://www.siri.org.uk/siri", "TicketingFacility");
    private final static QName _DataReadyNotification_QNAME = new QName("http://www.siri.org.uk/siri", "DataReadyNotification");
    private final static QName _StopTimetableCapabilitiesRequest_QNAME = new QName("http://www.siri.org.uk/siri", "StopTimetableCapabilitiesRequest");
    private final static QName _UnknownReason_QNAME = new QName("http://www.siri.org.uk/siri", "UnknownReason");
    private final static QName _ExpectedHeadwayInterval_QNAME = new QName("http://www.siri.org.uk/siri", "ExpectedHeadwayInterval");
    private final static QName _TerminateSubscriptionResponse_QNAME = new QName("http://www.siri.org.uk/siri", "TerminateSubscriptionResponse");
    private final static QName _FilterByDirectionRef_QNAME = new QName("http://www.siri.org.uk/siri", "FilterByDirectionRef");
    private final static QName _VisualSignsAvailable_QNAME = new QName("http://www.ifopt.org.uk/acsb", "VisualSignsAvailable");
    private final static QName _DatedTimetableVersionFrame_QNAME = new QName("http://www.siri.org.uk/siri", "DatedTimetableVersionFrame");
    private final static QName _SituationRef_QNAME = new QName("http://www.siri.org.uk/siri", "SituationRef");
    private final static QName _SituationSimpleRef_QNAME = new QName("http://www.siri.org.uk/siri", "SituationSimpleRef");

    /**
     * Create a new ObjectFactory that can be used to create new instances of schema derived classes for package: com.transportation.SIRI_IL.SOAP
     * 
     */
    public ObjectFactory() {
    }

    /**
     * Create an instance of {@link ServiceDeliveryStructure }
     * 
     */
    public ServiceDeliveryStructure createServiceDeliveryStructure() {
        return new ServiceDeliveryStructure();
    }

    /**
     * Create an instance of {@link AccessibilityAssessmentStructure }
     * 
     */
    public AccessibilityAssessmentStructure createAccessibilityAssessmentStructure() {
        return new AccessibilityAssessmentStructure();
    }

    /**
     * Create an instance of {@link com.transportation.SIRI_IL.SOAP.BasicDataValue.FaultReason }
     * 
     */
    public com.transportation.SIRI_IL.SOAP.BasicDataValue.FaultReason createBasicDataValueFaultReason() {
        return new com.transportation.SIRI_IL.SOAP.BasicDataValue.FaultReason();
    }

    /**
     * Create an instance of {@link com.transportation.SIRI_IL.SOAP.SignSetting.SetBy }
     * 
     */
    public com.transportation.SIRI_IL.SOAP.SignSetting.SetBy createSignSettingSetBy() {
        return new com.transportation.SIRI_IL.SOAP.SignSetting.SetBy();
    }

    /**
     * Create an instance of {@link com.transportation.SIRI_IL.SOAP.SignSetting.ReasonForSetting }
     * 
     */
    public com.transportation.SIRI_IL.SOAP.SignSetting.ReasonForSetting createSignSettingReasonForSetting() {
        return new com.transportation.SIRI_IL.SOAP.SignSetting.ReasonForSetting();
    }

    /**
     * Create an instance of {@link com.transportation.SIRI_IL.SOAP.TPEGDescriptor.Descriptor }
     * 
     */
    public com.transportation.SIRI_IL.SOAP.TPEGDescriptor.Descriptor createTPEGDescriptorDescriptor() {
        return new com.transportation.SIRI_IL.SOAP.TPEGDescriptor.Descriptor();
    }

    /**
     * Create an instance of {@link SourceInformation }
     * 
     */
    public SourceInformation createSourceInformation() {
        return new SourceInformation();
    }

    /**
     * Create an instance of {@link SourceInformation.SourceName }
     * 
     */
    public SourceInformation.SourceName createSourceInformationSourceName() {
        return new SourceInformation.SourceName();
    }

    /**
     * Create an instance of {@link TransitInformation }
     * 
     */
    public TransitInformation createTransitInformation() {
        return new TransitInformation();
    }

    /**
     * Create an instance of {@link TransitInformation.JourneyOrigin }
     * 
     */
    public TransitInformation.JourneyOrigin createTransitInformationJourneyOrigin() {
        return new TransitInformation.JourneyOrigin();
    }

    /**
     * Create an instance of {@link TransitInformation.JourneyDestination }
     * 
     */
    public TransitInformation.JourneyDestination createTransitInformationJourneyDestination() {
        return new TransitInformation.JourneyDestination();
    }

    /**
     * Create an instance of {@link MeasurementSiteRecord }
     * 
     */
    public MeasurementSiteRecord createMeasurementSiteRecord() {
        return new MeasurementSiteRecord();
    }

    /**
     * Create an instance of {@link MeasurementSiteRecord.MeasurementSiteName }
     * 
     */
    public MeasurementSiteRecord.MeasurementSiteName createMeasurementSiteRecordMeasurementSiteName() {
        return new MeasurementSiteRecord.MeasurementSiteName();
    }

    /**
     * Create an instance of {@link MeasurementSiteRecord.MeasurementEquipmentTypeUsed }
     * 
     */
    public MeasurementSiteRecord.MeasurementEquipmentTypeUsed createMeasurementSiteRecordMeasurementEquipmentTypeUsed() {
        return new MeasurementSiteRecord.MeasurementEquipmentTypeUsed();
    }

    /**
     * Create an instance of {@link AlertCLocation }
     * 
     */
    public AlertCLocation createAlertCLocation() {
        return new AlertCLocation();
    }

    /**
     * Create an instance of {@link AlertCLocation.AlertCLocationName }
     * 
     */
    public AlertCLocation.AlertCLocationName createAlertCLocationAlertCLocationName() {
        return new AlertCLocation.AlertCLocationName();
    }

    /**
     * Create an instance of {@link PredefinedLocation }
     * 
     */
    public PredefinedLocation createPredefinedLocation() {
        return new PredefinedLocation();
    }

    /**
     * Create an instance of {@link PredefinedLocation.PredefinedLocationName }
     * 
     */
    public PredefinedLocation.PredefinedLocationName createPredefinedLocationPredefinedLocationName() {
        return new PredefinedLocation.PredefinedLocationName();
    }

    /**
     * Create an instance of {@link com.transportation.SIRI_IL.SOAP.MeasuredValue }
     * 
     */
    public com.transportation.SIRI_IL.SOAP.MeasuredValue createMeasuredValue() {
        return new com.transportation.SIRI_IL.SOAP.MeasuredValue();
    }

    /**
     * Create an instance of {@link com.transportation.SIRI_IL.SOAP.MeasuredValue.MeasurementEquipmentTypeUsed }
     * 
     */
    public com.transportation.SIRI_IL.SOAP.MeasuredValue.MeasurementEquipmentTypeUsed createMeasuredValueMeasurementEquipmentTypeUsed() {
        return new com.transportation.SIRI_IL.SOAP.MeasuredValue.MeasurementEquipmentTypeUsed();
    }

    /**
     * Create an instance of {@link Vehicle }
     * 
     */
    public Vehicle createVehicle() {
        return new Vehicle();
    }

    /**
     * Create an instance of {@link Vehicle.VehicleCountryOfOrigin }
     * 
     */
    public Vehicle.VehicleCountryOfOrigin createVehicleVehicleCountryOfOrigin() {
        return new Vehicle.VehicleCountryOfOrigin();
    }

    /**
     * Create an instance of {@link Vehicle.VehicleColour }
     * 
     */
    public Vehicle.VehicleColour createVehicleVehicleColour() {
        return new Vehicle.VehicleColour();
    }

    /**
     * Create an instance of {@link SiteMeasurements }
     * 
     */
    public SiteMeasurements createSiteMeasurements() {
        return new SiteMeasurements();
    }

    /**
     * Create an instance of {@link AlertCDirection }
     * 
     */
    public AlertCDirection createAlertCDirection() {
        return new AlertCDirection();
    }

    /**
     * Create an instance of {@link AlertCDirection.AlertCDirectionNamed }
     * 
     */
    public AlertCDirection.AlertCDirectionNamed createAlertCDirectionAlertCDirectionNamed() {
        return new AlertCDirection.AlertCDirectionNamed();
    }

    /**
     * Create an instance of {@link HazardousMaterials }
     * 
     */
    public HazardousMaterials createHazardousMaterials() {
        return new HazardousMaterials();
    }

    /**
     * Create an instance of {@link HazardousMaterials.ChemicalName }
     * 
     */
    public HazardousMaterials.ChemicalName createHazardousMaterialsChemicalName() {
        return new HazardousMaterials.ChemicalName();
    }

    /**
     * Create an instance of {@link Period }
     * 
     */
    public Period createPeriod() {
        return new Period();
    }

    /**
     * Create an instance of {@link Period.PeriodName }
     * 
     */
    public Period.PeriodName createPeriodPeriodName() {
        return new Period.PeriodName();
    }

    /**
     * Create an instance of {@link Rerouting }
     * 
     */
    public Rerouting createRerouting() {
        return new Rerouting();
    }

    /**
     * Create an instance of {@link Rerouting.ReroutingItineraryDescription }
     * 
     */
    public Rerouting.ReroutingItineraryDescription createReroutingReroutingItineraryDescription() {
        return new Rerouting.ReroutingItineraryDescription();
    }

    /**
     * Create an instance of {@link ReferencePoint }
     * 
     */
    public ReferencePoint createReferencePoint() {
        return new ReferencePoint();
    }

    /**
     * Create an instance of {@link ReferencePoint.ReferencePointDescription }
     * 
     */
    public ReferencePoint.ReferencePointDescription createReferencePointReferencePointDescription() {
        return new ReferencePoint.ReferencePointDescription();
    }

    /**
     * Create an instance of {@link ReferencePoint.RoadName }
     * 
     */
    public ReferencePoint.RoadName createReferencePointRoadName() {
        return new ReferencePoint.RoadName();
    }

    /**
     * Create an instance of {@link ReferencePoint.AdministrativeArea }
     * 
     */
    public ReferencePoint.AdministrativeArea createReferencePointAdministrativeArea() {
        return new ReferencePoint.AdministrativeArea();
    }

    /**
     * Create an instance of {@link PredefinedLocationSet }
     * 
     */
    public PredefinedLocationSet createPredefinedLocationSet() {
        return new PredefinedLocationSet();
    }

    /**
     * Create an instance of {@link PredefinedLocationSet.PredefinedLocationSetName }
     * 
     */
    public PredefinedLocationSet.PredefinedLocationSetName createPredefinedLocationSetPredefinedLocationSetName() {
        return new PredefinedLocationSet.PredefinedLocationSetName();
    }

    /**
     * Create an instance of {@link NonManagedCause }
     * 
     */
    public NonManagedCause createNonManagedCause() {
        return new NonManagedCause();
    }

    /**
     * Create an instance of {@link NonManagedCause.CauseDescription }
     * 
     */
    public NonManagedCause.CauseDescription createNonManagedCauseCauseDescription() {
        return new NonManagedCause.CauseDescription();
    }

    /**
     * Create an instance of {@link AbstractProjection }
     * 
     */
    public AbstractProjection createAbstractProjection() {
        return new AbstractProjection();
    }

    /**
     * Create an instance of {@link ValidityConditionStructure }
     * 
     */
    public ValidityConditionStructure createValidityConditionStructure() {
        return new ValidityConditionStructure();
    }

    /**
     * Create an instance of {@link LinkProjectionStructure }
     * 
     */
    public LinkProjectionStructure createLinkProjectionStructure() {
        return new LinkProjectionStructure();
    }

    /**
     * Create an instance of {@link ZoneProjectionStructure }
     * 
     */
    public ZoneProjectionStructure createZoneProjectionStructure() {
        return new ZoneProjectionStructure();
    }

    /**
     * Create an instance of {@link LocalServiceStructure }
     * 
     */
    public LocalServiceStructure createLocalServiceStructure() {
        return new LocalServiceStructure();
    }

    /**
     * Create an instance of {@link PtConsequenceStructure }
     * 
     */
    public PtConsequenceStructure createPtConsequenceStructure() {
        return new PtConsequenceStructure();
    }

    /**
     * Create an instance of {@link StopMonitoringFilterStructure }
     * 
     */
    public StopMonitoringFilterStructure createStopMonitoringFilterStructure() {
        return new StopMonitoringFilterStructure();
    }

    /**
     * Create an instance of {@link FacilityStructure }
     * 
     */
    public FacilityStructure createFacilityStructure() {
        return new FacilityStructure();
    }

    /**
     * Create an instance of {@link EquipmentAvailabilityStructure }
     * 
     */
    public EquipmentAvailabilityStructure createEquipmentAvailabilityStructure() {
        return new EquipmentAvailabilityStructure();
    }

    /**
     * Create an instance of {@link AnnotatedLineStructure }
     * 
     */
    public AnnotatedLineStructure createAnnotatedLineStructure() {
        return new AnnotatedLineStructure();
    }

    /**
     * Create an instance of {@link CapabilityGeneralInteractionStructure }
     * 
     */
    public CapabilityGeneralInteractionStructure createCapabilityGeneralInteractionStructure() {
        return new CapabilityGeneralInteractionStructure();
    }

    /**
     * Create an instance of {@link AffectedRouteStructure }
     * 
     */
    public AffectedRouteStructure createAffectedRouteStructure() {
        return new AffectedRouteStructure();
    }

    /**
     * Create an instance of {@link AbstractPermissionStructure }
     * 
     */
    public AbstractPermissionStructure createAbstractPermissionStructure() {
        return new AbstractPermissionStructure();
    }

    /**
     * Create an instance of {@link AffectedVehicleJourneyStructure }
     * 
     */
    public AffectedVehicleJourneyStructure createAffectedVehicleJourneyStructure() {
        return new AffectedVehicleJourneyStructure();
    }

    /**
     * Create an instance of {@link AffectsScopeStructure }
     * 
     */
    public AffectsScopeStructure createAffectsScopeStructure() {
        return new AffectsScopeStructure();
    }

    /**
     * Create an instance of {@link AffectsScopeStructure.Networks }
     * 
     */
    public AffectsScopeStructure.Networks createAffectsScopeStructureNetworks() {
        return new AffectsScopeStructure.Networks();
    }

    /**
     * Create an instance of {@link AnnotatedStopPointStructure }
     * 
     */
    public AnnotatedStopPointStructure createAnnotatedStopPointStructure() {
        return new AnnotatedStopPointStructure();
    }

    /**
     * Create an instance of {@link CheckStatusResponseBodyStructure }
     * 
     */
    public CheckStatusResponseBodyStructure createCheckStatusResponseBodyStructure() {
        return new CheckStatusResponseBodyStructure();
    }

    /**
     * Create an instance of {@link ConnectionMonitoringServiceCapabilitiesStructure }
     * 
     */
    public ConnectionMonitoringServiceCapabilitiesStructure createConnectionMonitoringServiceCapabilitiesStructure() {
        return new ConnectionMonitoringServiceCapabilitiesStructure();
    }

    /**
     * Create an instance of {@link AffectedLineStructure }
     * 
     */
    public AffectedLineStructure createAffectedLineStructure() {
        return new AffectedLineStructure();
    }

    /**
     * Create an instance of {@link AffectedModesStructure }
     * 
     */
    public AffectedModesStructure createAffectedModesStructure() {
        return new AffectedModesStructure();
    }

    /**
     * Create an instance of {@link VehicleActivityStructure }
     * 
     */
    public VehicleActivityStructure createVehicleActivityStructure() {
        return new VehicleActivityStructure();
    }

    /**
     * Create an instance of {@link AffectedStopPointStructure }
     * 
     */
    public AffectedStopPointStructure createAffectedStopPointStructure() {
        return new AffectedStopPointStructure();
    }

    /**
     * Create an instance of {@link AffectedStopPlaceStructure }
     * 
     */
    public AffectedStopPlaceStructure createAffectedStopPlaceStructure() {
        return new AffectedStopPlaceStructure();
    }

    /**
     * Create an instance of {@link PushedActionStructure }
     * 
     */
    public PushedActionStructure createPushedActionStructure() {
        return new PushedActionStructure();
    }

    /**
     * Create an instance of {@link GeneralMessageServicePermissionStructure }
     * 
     */
    public GeneralMessageServicePermissionStructure createGeneralMessageServicePermissionStructure() {
        return new GeneralMessageServicePermissionStructure();
    }

    /**
     * Create an instance of {@link EstimatedTimetableServiceCapabilitiesStructure }
     * 
     */
    public EstimatedTimetableServiceCapabilitiesStructure createEstimatedTimetableServiceCapabilitiesStructure() {
        return new EstimatedTimetableServiceCapabilitiesStructure();
    }

    /**
     * Create an instance of {@link RoadSituationElementStructure }
     * 
     */
    public RoadSituationElementStructure createRoadSituationElementStructure() {
        return new RoadSituationElementStructure();
    }

    /**
     * Create an instance of {@link RoadSituationElementStructure.Images }
     * 
     */
    public RoadSituationElementStructure.Images createRoadSituationElementStructureImages() {
        return new RoadSituationElementStructure.Images();
    }

    /**
     * Create an instance of {@link RoadSituationElementStructure.SecondaryReasons }
     * 
     */
    public RoadSituationElementStructure.SecondaryReasons createRoadSituationElementStructureSecondaryReasons() {
        return new RoadSituationElementStructure.SecondaryReasons();
    }

    /**
     * Create an instance of {@link StopMonitoringServiceCapabilitiesStructure }
     * 
     */
    public StopMonitoringServiceCapabilitiesStructure createStopMonitoringServiceCapabilitiesStructure() {
        return new StopMonitoringServiceCapabilitiesStructure();
    }

    /**
     * Create an instance of {@link SituationExchangeServiceCapabilitiesStructure }
     * 
     */
    public SituationExchangeServiceCapabilitiesStructure createSituationExchangeServiceCapabilitiesStructure() {
        return new SituationExchangeServiceCapabilitiesStructure();
    }

    /**
     * Create an instance of {@link EstimatedVehicleJourneyStructure }
     * 
     */
    public EstimatedVehicleJourneyStructure createEstimatedVehicleJourneyStructure() {
        return new EstimatedVehicleJourneyStructure();
    }

    /**
     * Create an instance of {@link GeneralMessageServiceCapabilitiesStructure }
     * 
     */
    public GeneralMessageServiceCapabilitiesStructure createGeneralMessageServiceCapabilitiesStructure() {
        return new GeneralMessageServiceCapabilitiesStructure();
    }

    /**
     * Create an instance of {@link DataReceivedResponseStructure }
     * 
     */
    public DataReceivedResponseStructure createDataReceivedResponseStructure() {
        return new DataReceivedResponseStructure();
    }

    /**
     * Create an instance of {@link DataReadyResponseStructure }
     * 
     */
    public DataReadyResponseStructure createDataReadyResponseStructure() {
        return new DataReadyResponseStructure();
    }

    /**
     * Create an instance of {@link TerminateSubscriptionResponseStructure }
     * 
     */
    public TerminateSubscriptionResponseStructure createTerminateSubscriptionResponseStructure() {
        return new TerminateSubscriptionResponseStructure();
    }

    /**
     * Create an instance of {@link TerminateSubscriptionResponseStructure.TerminationResponseStatus }
     * 
     */
    public TerminateSubscriptionResponseStructure.TerminationResponseStatus createTerminateSubscriptionResponseStructureTerminationResponseStatus() {
        return new TerminateSubscriptionResponseStructure.TerminationResponseStatus();
    }

    /**
     * Create an instance of {@link EstimatedTimetableRequestStructure }
     * 
     */
    public EstimatedTimetableRequestStructure createEstimatedTimetableRequestStructure() {
        return new EstimatedTimetableRequestStructure();
    }

    /**
     * Create an instance of {@link StopTimetableServiceCapabilitiesStructure }
     * 
     */
    public StopTimetableServiceCapabilitiesStructure createStopTimetableServiceCapabilitiesStructure() {
        return new StopTimetableServiceCapabilitiesStructure();
    }

    /**
     * Create an instance of {@link SituationExchangeDeliveryStructure }
     * 
     */
    public SituationExchangeDeliveryStructure createSituationExchangeDeliveryStructure() {
        return new SituationExchangeDeliveryStructure();
    }

    /**
     * Create an instance of {@link FacilityMonitoringServiceCapabilitiesStructure }
     * 
     */
    public FacilityMonitoringServiceCapabilitiesStructure createFacilityMonitoringServiceCapabilitiesStructure() {
        return new FacilityMonitoringServiceCapabilitiesStructure();
    }

    /**
     * Create an instance of {@link SituationExchangeRequestStructure }
     * 
     */
    public SituationExchangeRequestStructure createSituationExchangeRequestStructure() {
        return new SituationExchangeRequestStructure();
    }

    /**
     * Create an instance of {@link ConnectionTimetableCapabilitiesResponseStructure }
     * 
     */
    public ConnectionTimetableCapabilitiesResponseStructure createConnectionTimetableCapabilitiesResponseStructure() {
        return new ConnectionTimetableCapabilitiesResponseStructure();
    }

    /**
     * Create an instance of {@link ProductionTimetableRequestStructure }
     * 
     */
    public ProductionTimetableRequestStructure createProductionTimetableRequestStructure() {
        return new ProductionTimetableRequestStructure();
    }

    /**
     * Create an instance of {@link StopMonitoringServicePermissionStructure }
     * 
     */
    public StopMonitoringServicePermissionStructure createStopMonitoringServicePermissionStructure() {
        return new StopMonitoringServicePermissionStructure();
    }

    /**
     * Create an instance of {@link VehicleMonitoringServicePermissionStructure }
     * 
     */
    public VehicleMonitoringServicePermissionStructure createVehicleMonitoringServicePermissionStructure() {
        return new VehicleMonitoringServicePermissionStructure();
    }

    /**
     * Create an instance of {@link ProductionTimetableServiceCapabilitiesStructure }
     * 
     */
    public ProductionTimetableServiceCapabilitiesStructure createProductionTimetableServiceCapabilitiesStructure() {
        return new ProductionTimetableServiceCapabilitiesStructure();
    }

    /**
     * Create an instance of {@link DatedVehicleJourneyStructure }
     * 
     */
    public DatedVehicleJourneyStructure createDatedVehicleJourneyStructure() {
        return new DatedVehicleJourneyStructure();
    }

    /**
     * Create an instance of {@link ConnectionTimetableServiceCapabilitiesStructure }
     * 
     */
    public ConnectionTimetableServiceCapabilitiesStructure createConnectionTimetableServiceCapabilitiesStructure() {
        return new ConnectionTimetableServiceCapabilitiesStructure();
    }

    /**
     * Create an instance of {@link VehicleMonitoringServiceCapabilitiesStructure }
     * 
     */
    public VehicleMonitoringServiceCapabilitiesStructure createVehicleMonitoringServiceCapabilitiesStructure() {
        return new VehicleMonitoringServiceCapabilitiesStructure();
    }

    /**
     * Create an instance of {@link JourneyPlaceRefStructure }
     * 
     */
    public JourneyPlaceRefStructure createJourneyPlaceRefStructure() {
        return new JourneyPlaceRefStructure();
    }

    /**
     * Create an instance of {@link PublishToMobileActionStructure }
     * 
     */
    public PublishToMobileActionStructure createPublishToMobileActionStructure() {
        return new PublishToMobileActionStructure();
    }

    /**
     * Create an instance of {@link TimetabledFeederArrivalCancellationStructure }
     * 
     */
    public TimetabledFeederArrivalCancellationStructure createTimetabledFeederArrivalCancellationStructure() {
        return new TimetabledFeederArrivalCancellationStructure();
    }

    /**
     * Create an instance of {@link ServiceFeaturesDeliveryStructure }
     * 
     */
    public ServiceFeaturesDeliveryStructure createServiceFeaturesDeliveryStructure() {
        return new ServiceFeaturesDeliveryStructure();
    }

    /**
     * Create an instance of {@link AbstractDiscoveryDeliveryStructure }
     * 
     */
    public AbstractDiscoveryDeliveryStructure createAbstractDiscoveryDeliveryStructure() {
        return new AbstractDiscoveryDeliveryStructure();
    }

    /**
     * Create an instance of {@link StopPointsRequest }
     * 
     */
    public StopPointsRequest createStopPointsRequest() {
        return new StopPointsRequest();
    }

    /**
     * Create an instance of {@link RequestStructure }
     * 
     */
    public RequestStructure createRequestStructure() {
        return new RequestStructure();
    }

    /**
     * Create an instance of {@link ParticipantRefStructure }
     * 
     */
    public ParticipantRefStructure createParticipantRefStructure() {
        return new ParticipantRefStructure();
    }

    /**
     * Create an instance of {@link EntryQualifierStructure }
     * 
     */
    public EntryQualifierStructure createEntryQualifierStructure() {
        return new EntryQualifierStructure();
    }

    /**
     * Create an instance of {@link EstimatedTimetableDeliveryStructure }
     * 
     */
    public EstimatedTimetableDeliveryStructure createEstimatedTimetableDeliveryStructure() {
        return new EstimatedTimetableDeliveryStructure();
    }

    /**
     * Create an instance of {@link AbstractServiceDeliveryStructure }
     * 
     */
    public AbstractServiceDeliveryStructure createAbstractServiceDeliveryStructure() {
        return new AbstractServiceDeliveryStructure();
    }

    /**
     * Create an instance of {@link PublishToDisplayActionStructure }
     * 
     */
    public PublishToDisplayActionStructure createPublishToDisplayActionStructure() {
        return new PublishToDisplayActionStructure();
    }

    /**
     * Create an instance of {@link FacilityRefStructure }
     * 
     */
    public FacilityRefStructure createFacilityRefStructure() {
        return new FacilityRefStructure();
    }

    /**
     * Create an instance of {@link ServiceCapabilitiesRequestStructure }
     * 
     */
    public ServiceCapabilitiesRequestStructure createServiceCapabilitiesRequestStructure() {
        return new ServiceCapabilitiesRequestStructure();
    }

    /**
     * Create an instance of {@link UnknownSubscriptionErrorStructure }
     * 
     */
    public UnknownSubscriptionErrorStructure createUnknownSubscriptionErrorStructure() {
        return new UnknownSubscriptionErrorStructure();
    }

    /**
     * Create an instance of {@link ErrorCodeStructure }
     * 
     */
    public ErrorCodeStructure createErrorCodeStructure() {
        return new ErrorCodeStructure();
    }

    /**
     * Create an instance of {@link LinesDiscoveryRequestStructure }
     * 
     */
    public LinesDiscoveryRequestStructure createLinesDiscoveryRequestStructure() {
        return new LinesDiscoveryRequestStructure();
    }

    /**
     * Create an instance of {@link SituationExchangeSubscriptionStructure }
     * 
     */
    public SituationExchangeSubscriptionStructure createSituationExchangeSubscriptionStructure() {
        return new SituationExchangeSubscriptionStructure();
    }

    /**
     * Create an instance of {@link ConnectionLinkPermissions }
     * 
     */
    public ConnectionLinkPermissions createConnectionLinkPermissions() {
        return new ConnectionLinkPermissions();
    }

    /**
     * Create an instance of {@link ConnectionLinkPermissionStructure }
     * 
     */
    public ConnectionLinkPermissionStructure createConnectionLinkPermissionStructure() {
        return new ConnectionLinkPermissionStructure();
    }

    /**
     * Create an instance of {@link NaturalLanguageStringStructure }
     * 
     */
    public NaturalLanguageStringStructure createNaturalLanguageStringStructure() {
        return new NaturalLanguageStringStructure();
    }

    /**
     * Create an instance of {@link FacilityDeliveryStructure }
     * 
     */
    public FacilityDeliveryStructure createFacilityDeliveryStructure() {
        return new FacilityDeliveryStructure();
    }

    /**
     * Create an instance of {@link SubscriptionRequest }
     * 
     */
    public SubscriptionRequest createSubscriptionRequest() {
        return new SubscriptionRequest();
    }

    /**
     * Create an instance of {@link SubscriptionRequestStructure }
     * 
     */
    public SubscriptionRequestStructure createSubscriptionRequestStructure() {
        return new SubscriptionRequestStructure();
    }

    /**
     * Create an instance of {@link MessageQualifierStructure }
     * 
     */
    public MessageQualifierStructure createMessageQualifierStructure() {
        return new MessageQualifierStructure();
    }

    /**
     * Create an instance of {@link SubscriptionContextStructure }
     * 
     */
    public SubscriptionContextStructure createSubscriptionContextStructure() {
        return new SubscriptionContextStructure();
    }

    /**
     * Create an instance of {@link ProductionTimetableSubscriptionRequest }
     * 
     */
    public ProductionTimetableSubscriptionRequest createProductionTimetableSubscriptionRequest() {
        return new ProductionTimetableSubscriptionRequest();
    }

    /**
     * Create an instance of {@link EstimatedTimetableSubscriptionStructure }
     * 
     */
    public EstimatedTimetableSubscriptionStructure createEstimatedTimetableSubscriptionStructure() {
        return new EstimatedTimetableSubscriptionStructure();
    }

    /**
     * Create an instance of {@link StopTimetableSubscriptionStructure }
     * 
     */
    public StopTimetableSubscriptionStructure createStopTimetableSubscriptionStructure() {
        return new StopTimetableSubscriptionStructure();
    }

    /**
     * Create an instance of {@link StopMonitoringSubscriptionStructure }
     * 
     */
    public StopMonitoringSubscriptionStructure createStopMonitoringSubscriptionStructure() {
        return new StopMonitoringSubscriptionStructure();
    }

    /**
     * Create an instance of {@link VehicleMonitoringSubscriptionStructure }
     * 
     */
    public VehicleMonitoringSubscriptionStructure createVehicleMonitoringSubscriptionStructure() {
        return new VehicleMonitoringSubscriptionStructure();
    }

    /**
     * Create an instance of {@link ConnectionTimetableSubscriptionStructure }
     * 
     */
    public ConnectionTimetableSubscriptionStructure createConnectionTimetableSubscriptionStructure() {
        return new ConnectionTimetableSubscriptionStructure();
    }

    /**
     * Create an instance of {@link ConnectionMonitoringSubscriptionRequestStructure }
     * 
     */
    public ConnectionMonitoringSubscriptionRequestStructure createConnectionMonitoringSubscriptionRequestStructure() {
        return new ConnectionMonitoringSubscriptionRequestStructure();
    }

    /**
     * Create an instance of {@link GeneralMessageSubscriptionStructure }
     * 
     */
    public GeneralMessageSubscriptionStructure createGeneralMessageSubscriptionStructure() {
        return new GeneralMessageSubscriptionStructure();
    }

    /**
     * Create an instance of {@link FacilityMonitoringSubscriptionStructure }
     * 
     */
    public FacilityMonitoringSubscriptionStructure createFacilityMonitoringSubscriptionStructure() {
        return new FacilityMonitoringSubscriptionStructure();
    }

    /**
     * Create an instance of {@link TimetabledFeederArrivalStructure }
     * 
     */
    public TimetabledFeederArrivalStructure createTimetabledFeederArrivalStructure() {
        return new TimetabledFeederArrivalStructure();
    }

    /**
     * Create an instance of {@link VehicleMonitoringDeliveryStructure }
     * 
     */
    public VehicleMonitoringDeliveryStructure createVehicleMonitoringDeliveryStructure() {
        return new VehicleMonitoringDeliveryStructure();
    }

    /**
     * Create an instance of {@link StopPointRefStructure }
     * 
     */
    public StopPointRefStructure createStopPointRefStructure() {
        return new StopPointRefStructure();
    }

    /**
     * Create an instance of {@link com.transportation.SIRI_IL.SOAP.VehicleMonitoringPermissions }
     * 
     */
    public com.transportation.SIRI_IL.SOAP.VehicleMonitoringPermissions createVehicleMonitoringPermissions() {
        return new com.transportation.SIRI_IL.SOAP.VehicleMonitoringPermissions();
    }

    /**
     * Create an instance of {@link PermissionsStructure }
     * 
     */
    public PermissionsStructure createPermissionsStructure() {
        return new PermissionsStructure();
    }

    /**
     * Create an instance of {@link VersionRefStructure }
     * 
     */
    public VersionRefStructure createVersionRefStructure() {
        return new VersionRefStructure();
    }

    /**
     * Create an instance of {@link DirectionStructure }
     * 
     */
    public DirectionStructure createDirectionStructure() {
        return new DirectionStructure();
    }

    /**
     * Create an instance of {@link InterchangeRefStructure }
     * 
     */
    public InterchangeRefStructure createInterchangeRefStructure() {
        return new InterchangeRefStructure();
    }

    /**
     * Create an instance of {@link CheckStatusRequestStructure }
     * 
     */
    public CheckStatusRequestStructure createCheckStatusRequestStructure() {
        return new CheckStatusRequestStructure();
    }

    /**
     * Create an instance of {@link ConnectionMonitoringPermissions }
     * 
     */
    public ConnectionMonitoringPermissions createConnectionMonitoringPermissions() {
        return new ConnectionMonitoringPermissions();
    }

    /**
     * Create an instance of {@link ConnectionServicePermissionStructure }
     * 
     */
    public ConnectionServicePermissionStructure createConnectionServicePermissionStructure() {
        return new ConnectionServicePermissionStructure();
    }

    /**
     * Create an instance of {@link ServiceFeatureStructure }
     * 
     */
    public ServiceFeatureStructure createServiceFeatureStructure() {
        return new ServiceFeatureStructure();
    }

    /**
     * Create an instance of {@link PublishToWebActionStructure }
     * 
     */
    public PublishToWebActionStructure createPublishToWebActionStructure() {
        return new PublishToWebActionStructure();
    }

    /**
     * Create an instance of {@link StopMonitoringMultipleRequestStructure }
     * 
     */
    public StopMonitoringMultipleRequestStructure createStopMonitoringMultipleRequestStructure() {
        return new StopMonitoringMultipleRequestStructure();
    }

    /**
     * Create an instance of {@link StopPointsDeliveryStructure }
     * 
     */
    public StopPointsDeliveryStructure createStopPointsDeliveryStructure() {
        return new StopPointsDeliveryStructure();
    }

    /**
     * Create an instance of {@link BeyondDataHorizonErrorStructure }
     * 
     */
    public BeyondDataHorizonErrorStructure createBeyondDataHorizonErrorStructure() {
        return new BeyondDataHorizonErrorStructure();
    }

    /**
     * Create an instance of {@link GeneralMessageCapabilitiesResponseStructure }
     * 
     */
    public GeneralMessageCapabilitiesResponseStructure createGeneralMessageCapabilitiesResponseStructure() {
        return new GeneralMessageCapabilitiesResponseStructure();
    }

    /**
     * Create an instance of {@link AbstractServiceCapabilitiesResponseStructure }
     * 
     */
    public AbstractServiceCapabilitiesResponseStructure createAbstractServiceCapabilitiesResponseStructure() {
        return new AbstractServiceCapabilitiesResponseStructure();
    }

    /**
     * Create an instance of {@link VehicleFeaturesDeliveryStructure }
     * 
     */
    public VehicleFeaturesDeliveryStructure createVehicleFeaturesDeliveryStructure() {
        return new VehicleFeaturesDeliveryStructure();
    }

    /**
     * Create an instance of {@link UnknownSubscriberErrorStructure }
     * 
     */
    public UnknownSubscriberErrorStructure createUnknownSubscriberErrorStructure() {
        return new UnknownSubscriberErrorStructure();
    }

    /**
     * Create an instance of {@link ProductCategoriesDeliveryStructure }
     * 
     */
    public ProductCategoriesDeliveryStructure createProductCategoriesDeliveryStructure() {
        return new ProductCategoriesDeliveryStructure();
    }

    /**
     * Create an instance of {@link StopTimetablePermissions }
     * 
     */
    public StopTimetablePermissions createStopTimetablePermissions() {
        return new StopTimetablePermissions();
    }

    /**
     * Create an instance of {@link JourneyPatternRefStructure }
     * 
     */
    public JourneyPatternRefStructure createJourneyPatternRefStructure() {
        return new JourneyPatternRefStructure();
    }

    /**
     * Create an instance of {@link FacilityChangeStructure }
     * 
     */
    public FacilityChangeStructure createFacilityChangeStructure() {
        return new FacilityChangeStructure();
    }

    /**
     * Create an instance of {@link ExtensionsStructure }
     * 
     */
    public ExtensionsStructure createExtensionsStructure() {
        return new ExtensionsStructure();
    }

    /**
     * Create an instance of {@link DataSupplyRequestStructure }
     * 
     */
    public DataSupplyRequestStructure createDataSupplyRequestStructure() {
        return new DataSupplyRequestStructure();
    }

    /**
     * Create an instance of {@link TargetedCallStructure }
     * 
     */
    public TargetedCallStructure createTargetedCallStructure() {
        return new TargetedCallStructure();
    }

    /**
     * Create an instance of {@link EstimatedTimetableCapabilitiesResponseStructure }
     * 
     */
    public EstimatedTimetableCapabilitiesResponseStructure createEstimatedTimetableCapabilitiesResponseStructure() {
        return new EstimatedTimetableCapabilitiesResponseStructure();
    }

    /**
     * Create an instance of {@link ConnectionLinkRefStructure }
     * 
     */
    public ConnectionLinkRefStructure createConnectionLinkRefStructure() {
        return new ConnectionLinkRefStructure();
    }

    /**
     * Create an instance of {@link ProductionTimetableDeliveryStructure }
     * 
     */
    public ProductionTimetableDeliveryStructure createProductionTimetableDeliveryStructure() {
        return new ProductionTimetableDeliveryStructure();
    }

    /**
     * Create an instance of {@link FacilityMonitoringDeliveryStructure }
     * 
     */
    public FacilityMonitoringDeliveryStructure createFacilityMonitoringDeliveryStructure() {
        return new FacilityMonitoringDeliveryStructure();
    }

    /**
     * Create an instance of {@link VehicleJourneyRefStructure }
     * 
     */
    public VehicleJourneyRefStructure createVehicleJourneyRefStructure() {
        return new VehicleJourneyRefStructure();
    }

    /**
     * Create an instance of {@link ProductionTimetableCapabilitiesRequest }
     * 
     */
    public ProductionTimetableCapabilitiesRequest createProductionTimetableCapabilitiesRequest() {
        return new ProductionTimetableCapabilitiesRequest();
    }

    /**
     * Create an instance of {@link ConnectionMonitoringCapabilitiesResponseStructure }
     * 
     */
    public ConnectionMonitoringCapabilitiesResponseStructure createConnectionMonitoringCapabilitiesResponseStructure() {
        return new ConnectionMonitoringCapabilitiesResponseStructure();
    }

    /**
     * Create an instance of {@link FacilityConditionStructure }
     * 
     */
    public FacilityConditionStructure createFacilityConditionStructure() {
        return new FacilityConditionStructure();
    }

    /**
     * Create an instance of {@link ProductCategoriesDiscoveryRequestStructure }
     * 
     */
    public ProductCategoriesDiscoveryRequestStructure createProductCategoriesDiscoveryRequestStructure() {
        return new ProductCategoriesDiscoveryRequestStructure();
    }

    /**
     * Create an instance of {@link VehicleMonitoringCapabilitiesResponseStructure }
     * 
     */
    public VehicleMonitoringCapabilitiesResponseStructure createVehicleMonitoringCapabilitiesResponseStructure() {
        return new VehicleMonitoringCapabilitiesResponseStructure();
    }

    /**
     * Create an instance of {@link ProductionTimetablePermissions }
     * 
     */
    public ProductionTimetablePermissions createProductionTimetablePermissions() {
        return new ProductionTimetablePermissions();
    }

    /**
     * Create an instance of {@link InfoChannelDiscoveryRequestStructure }
     * 
     */
    public InfoChannelDiscoveryRequestStructure createInfoChannelDiscoveryRequestStructure() {
        return new InfoChannelDiscoveryRequestStructure();
    }

    /**
     * Create an instance of {@link StopTimetableCapabilitiesResponseStructure }
     * 
     */
    public StopTimetableCapabilitiesResponseStructure createStopTimetableCapabilitiesResponseStructure() {
        return new StopTimetableCapabilitiesResponseStructure();
    }

    /**
     * Create an instance of {@link FacilityRequestStructure }
     * 
     */
    public FacilityRequestStructure createFacilityRequestStructure() {
        return new FacilityRequestStructure();
    }

    /**
     * Create an instance of {@link SituationFullRefStructure }
     * 
     */
    public SituationFullRefStructure createSituationFullRefStructure() {
        return new SituationFullRefStructure();
    }

    /**
     * Create an instance of {@link FacilityMonitoringRequestStructure }
     * 
     */
    public FacilityMonitoringRequestStructure createFacilityMonitoringRequestStructure() {
        return new FacilityMonitoringRequestStructure();
    }

    /**
     * Create an instance of {@link NotifyByPagerActionStructure }
     * 
     */
    public NotifyByPagerActionStructure createNotifyByPagerActionStructure() {
        return new NotifyByPagerActionStructure();
    }

    /**
     * Create an instance of {@link InfoChannelDeliveryStructure }
     * 
     */
    public InfoChannelDeliveryStructure createInfoChannelDeliveryStructure() {
        return new InfoChannelDeliveryStructure();
    }

    /**
     * Create an instance of {@link Siri }
     * 
     */
    public Siri createSiri() {
        return new Siri();
    }

    /**
     * Create an instance of {@link ServiceRequest }
     * 
     */
    public ServiceRequest createServiceRequest() {
        return new ServiceRequest();
    }

    /**
     * Create an instance of {@link ServiceRequestStructure }
     * 
     */
    public ServiceRequestStructure createServiceRequestStructure() {
        return new ServiceRequestStructure();
    }

    /**
     * Create an instance of {@link ContextualisedRequestStructure }
     * 
     */
    public ContextualisedRequestStructure createContextualisedRequestStructure() {
        return new ContextualisedRequestStructure();
    }

    /**
     * Create an instance of {@link ServiceRequestContextStructure }
     * 
     */
    public ServiceRequestContextStructure createServiceRequestContextStructure() {
        return new ServiceRequestContextStructure();
    }

    /**
     * Create an instance of {@link StopTimetableRequestStructure }
     * 
     */
    public StopTimetableRequestStructure createStopTimetableRequestStructure() {
        return new StopTimetableRequestStructure();
    }

    /**
     * Create an instance of {@link StopMonitoringRequestStructure }
     * 
     */
    public StopMonitoringRequestStructure createStopMonitoringRequestStructure() {
        return new StopMonitoringRequestStructure();
    }

    /**
     * Create an instance of {@link VehicleMonitoringRequestStructure }
     * 
     */
    public VehicleMonitoringRequestStructure createVehicleMonitoringRequestStructure() {
        return new VehicleMonitoringRequestStructure();
    }

    /**
     * Create an instance of {@link ConnectionTimetableRequestStructure }
     * 
     */
    public ConnectionTimetableRequestStructure createConnectionTimetableRequestStructure() {
        return new ConnectionTimetableRequestStructure();
    }

    /**
     * Create an instance of {@link ConnectionMonitoringRequestStructure }
     * 
     */
    public ConnectionMonitoringRequestStructure createConnectionMonitoringRequestStructure() {
        return new ConnectionMonitoringRequestStructure();
    }

    /**
     * Create an instance of {@link GeneralMessageRequestStructure }
     * 
     */
    public GeneralMessageRequestStructure createGeneralMessageRequestStructure() {
        return new GeneralMessageRequestStructure();
    }

    /**
     * Create an instance of {@link TerminateSubscriptionRequestStructure }
     * 
     */
    public TerminateSubscriptionRequestStructure createTerminateSubscriptionRequestStructure() {
        return new TerminateSubscriptionRequestStructure();
    }

    /**
     * Create an instance of {@link DataReadyRequestStructure }
     * 
     */
    public DataReadyRequestStructure createDataReadyRequestStructure() {
        return new DataReadyRequestStructure();
    }

    /**
     * Create an instance of {@link ProducerRequestEndpointStructure }
     * 
     */
    public ProducerRequestEndpointStructure createProducerRequestEndpointStructure() {
        return new ProducerRequestEndpointStructure();
    }

    /**
     * Create an instance of {@link HeartbeatNotificationStructure }
     * 
     */
    public HeartbeatNotificationStructure createHeartbeatNotificationStructure() {
        return new HeartbeatNotificationStructure();
    }

    /**
     * Create an instance of {@link CapabilitiesRequestStructure }
     * 
     */
    public CapabilitiesRequestStructure createCapabilitiesRequestStructure() {
        return new CapabilitiesRequestStructure();
    }

    /**
     * Create an instance of {@link ServiceFeaturesDiscoveryRequestStructure }
     * 
     */
    public ServiceFeaturesDiscoveryRequestStructure createServiceFeaturesDiscoveryRequestStructure() {
        return new ServiceFeaturesDiscoveryRequestStructure();
    }

    /**
     * Create an instance of {@link VehicleFeaturesDiscoveryRequestStructure }
     * 
     */
    public VehicleFeaturesDiscoveryRequestStructure createVehicleFeaturesDiscoveryRequestStructure() {
        return new VehicleFeaturesDiscoveryRequestStructure();
    }

    /**
     * Create an instance of {@link SubscriptionResponseStructure }
     * 
     */
    public SubscriptionResponseStructure createSubscriptionResponseStructure() {
        return new SubscriptionResponseStructure();
    }

    /**
     * Create an instance of {@link ServiceDelivery }
     * 
     */
    public ServiceDelivery createServiceDelivery() {
        return new ServiceDelivery();
    }

    /**
     * Create an instance of {@link ProducerResponseStructure }
     * 
     */
    public ProducerResponseStructure createProducerResponseStructure() {
        return new ProducerResponseStructure();
    }

    /**
     * Create an instance of {@link MessageRefStructure }
     * 
     */
    public MessageRefStructure createMessageRefStructure() {
        return new MessageRefStructure();
    }

    /**
     * Create an instance of {@link ServiceDeliveryStructure.ErrorCondition }
     * 
     */
    public ServiceDeliveryStructure.ErrorCondition createServiceDeliveryStructureErrorCondition() {
        return new ServiceDeliveryStructure.ErrorCondition();
    }

    /**
     * Create an instance of {@link StopTimetableDeliveryStructure }
     * 
     */
    public StopTimetableDeliveryStructure createStopTimetableDeliveryStructure() {
        return new StopTimetableDeliveryStructure();
    }

    /**
     * Create an instance of {@link StopMonitoringDeliveryStructure }
     * 
     */
    public StopMonitoringDeliveryStructure createStopMonitoringDeliveryStructure() {
        return new StopMonitoringDeliveryStructure();
    }

    /**
     * Create an instance of {@link ConnectionTimetableDeliveryStructure }
     * 
     */
    public ConnectionTimetableDeliveryStructure createConnectionTimetableDeliveryStructure() {
        return new ConnectionTimetableDeliveryStructure();
    }

    /**
     * Create an instance of {@link ConnectionMonitoringFeederDeliveryStructure }
     * 
     */
    public ConnectionMonitoringFeederDeliveryStructure createConnectionMonitoringFeederDeliveryStructure() {
        return new ConnectionMonitoringFeederDeliveryStructure();
    }

    /**
     * Create an instance of {@link ConnectionMonitoringDistributorDeliveryStructure }
     * 
     */
    public ConnectionMonitoringDistributorDeliveryStructure createConnectionMonitoringDistributorDeliveryStructure() {
        return new ConnectionMonitoringDistributorDeliveryStructure();
    }

    /**
     * Create an instance of {@link GeneralMessageDeliveryStructure }
     * 
     */
    public GeneralMessageDeliveryStructure createGeneralMessageDeliveryStructure() {
        return new GeneralMessageDeliveryStructure();
    }

    /**
     * Create an instance of {@link CheckStatusResponseStructure }
     * 
     */
    public CheckStatusResponseStructure createCheckStatusResponseStructure() {
        return new CheckStatusResponseStructure();
    }

    /**
     * Create an instance of {@link CapabilitiesResponseStructure }
     * 
     */
    public CapabilitiesResponseStructure createCapabilitiesResponseStructure() {
        return new CapabilitiesResponseStructure();
    }

    /**
     * Create an instance of {@link LinesDeliveryStructure }
     * 
     */
    public LinesDeliveryStructure createLinesDeliveryStructure() {
        return new LinesDeliveryStructure();
    }

    /**
     * Create an instance of {@link EstimatedCallStructure }
     * 
     */
    public EstimatedCallStructure createEstimatedCallStructure() {
        return new EstimatedCallStructure();
    }

    /**
     * Create an instance of {@link com.transportation.SIRI_IL.SOAP.ErrorCondition }
     * 
     */
    public com.transportation.SIRI_IL.SOAP.ErrorCondition createErrorCondition() {
        return new com.transportation.SIRI_IL.SOAP.ErrorCondition();
    }

    /**
     * Create an instance of {@link CapabilityNotSupportedErrorStructure }
     * 
     */
    public CapabilityNotSupportedErrorStructure createCapabilityNotSupportedErrorStructure() {
        return new CapabilityNotSupportedErrorStructure();
    }

    /**
     * Create an instance of {@link AccessNotAllowedErrorStructure }
     * 
     */
    public AccessNotAllowedErrorStructure createAccessNotAllowedErrorStructure() {
        return new AccessNotAllowedErrorStructure();
    }

    /**
     * Create an instance of {@link NoInfoForTopicErrorStructure }
     * 
     */
    public NoInfoForTopicErrorStructure createNoInfoForTopicErrorStructure() {
        return new NoInfoForTopicErrorStructure();
    }

    /**
     * Create an instance of {@link AllowedResourceUsageExceededErrorStructure }
     * 
     */
    public AllowedResourceUsageExceededErrorStructure createAllowedResourceUsageExceededErrorStructure() {
        return new AllowedResourceUsageExceededErrorStructure();
    }

    /**
     * Create an instance of {@link OtherErrorStructure }
     * 
     */
    public OtherErrorStructure createOtherErrorStructure() {
        return new OtherErrorStructure();
    }

    /**
     * Create an instance of {@link LinePermissions }
     * 
     */
    public LinePermissions createLinePermissions() {
        return new LinePermissions();
    }

    /**
     * Create an instance of {@link LinePermissionStructure }
     * 
     */
    public LinePermissionStructure createLinePermissionStructure() {
        return new LinePermissionStructure();
    }

    /**
     * Create an instance of {@link FacilityMonitoringCapabilitiesResponseStructure }
     * 
     */
    public FacilityMonitoringCapabilitiesResponseStructure createFacilityMonitoringCapabilitiesResponseStructure() {
        return new FacilityMonitoringCapabilitiesResponseStructure();
    }

    /**
     * Create an instance of {@link ProductionTimetableCapabilitiesResponseStructure }
     * 
     */
    public ProductionTimetableCapabilitiesResponseStructure createProductionTimetableCapabilitiesResponseStructure() {
        return new ProductionTimetableCapabilitiesResponseStructure();
    }

    /**
     * Create an instance of {@link NotifyBySmsActionStructure }
     * 
     */
    public NotifyBySmsActionStructure createNotifyBySmsActionStructure() {
        return new NotifyBySmsActionStructure();
    }

    /**
     * Create an instance of {@link InfoMessageCancellationStructure }
     * 
     */
    public InfoMessageCancellationStructure createInfoMessageCancellationStructure() {
        return new InfoMessageCancellationStructure();
    }

    /**
     * Create an instance of {@link FacilityMonitoringPermissions }
     * 
     */
    public FacilityMonitoringPermissions createFacilityMonitoringPermissions() {
        return new FacilityMonitoringPermissions();
    }

    /**
     * Create an instance of {@link FacilityMonitoringServicePermissionStructure }
     * 
     */
    public FacilityMonitoringServicePermissionStructure createFacilityMonitoringServicePermissionStructure() {
        return new FacilityMonitoringServicePermissionStructure();
    }

    /**
     * Create an instance of {@link PublishToAlertsActionStructure }
     * 
     */
    public PublishToAlertsActionStructure createPublishToAlertsActionStructure() {
        return new PublishToAlertsActionStructure();
    }

    /**
     * Create an instance of {@link InfoChannelStructure }
     * 
     */
    public InfoChannelStructure createInfoChannelStructure() {
        return new InfoChannelStructure();
    }

    /**
     * Create an instance of {@link ServiceDeliveryErrorConditionStructure }
     * 
     */
    public ServiceDeliveryErrorConditionStructure createServiceDeliveryErrorConditionStructure() {
        return new ServiceDeliveryErrorConditionStructure();
    }

    /**
     * Create an instance of {@link PtSituationElementStructure }
     * 
     */
    public PtSituationElementStructure createPtSituationElementStructure() {
        return new PtSituationElementStructure();
    }

    /**
     * Create an instance of {@link InfoMessageStructure }
     * 
     */
    public InfoMessageStructure createInfoMessageStructure() {
        return new InfoMessageStructure();
    }

    /**
     * Create an instance of {@link NaturalLanguagePlaceNameStructure }
     * 
     */
    public NaturalLanguagePlaceNameStructure createNaturalLanguagePlaceNameStructure() {
        return new NaturalLanguagePlaceNameStructure();
    }

    /**
     * Create an instance of {@link OperatorPermissions }
     * 
     */
    public OperatorPermissions createOperatorPermissions() {
        return new OperatorPermissions();
    }

    /**
     * Create an instance of {@link OperatorPermissionStructure }
     * 
     */
    public OperatorPermissionStructure createOperatorPermissionStructure() {
        return new OperatorPermissionStructure();
    }

    /**
     * Create an instance of {@link FeatureRefStructure }
     * 
     */
    public FeatureRefStructure createFeatureRefStructure() {
        return new FeatureRefStructure();
    }

    /**
     * Create an instance of {@link DestinationRefStructure }
     * 
     */
    public DestinationRefStructure createDestinationRefStructure() {
        return new DestinationRefStructure();
    }

    /**
     * Create an instance of {@link DatedCallStructure }
     * 
     */
    public DatedCallStructure createDatedCallStructure() {
        return new DatedCallStructure();
    }

    /**
     * Create an instance of {@link VehicleRefStructure }
     * 
     */
    public VehicleRefStructure createVehicleRefStructure() {
        return new VehicleRefStructure();
    }

    /**
     * Create an instance of {@link ServiceNotAvailableErrorStructure }
     * 
     */
    public ServiceNotAvailableErrorStructure createServiceNotAvailableErrorStructure() {
        return new ServiceNotAvailableErrorStructure();
    }

    /**
     * Create an instance of {@link NotifyByEmailActionStructure }
     * 
     */
    public NotifyByEmailActionStructure createNotifyByEmailActionStructure() {
        return new NotifyByEmailActionStructure();
    }

    /**
     * Create an instance of {@link LineRefStructure }
     * 
     */
    public LineRefStructure createLineRefStructure() {
        return new LineRefStructure();
    }

    /**
     * Create an instance of {@link AnnotatedDestinationStructure }
     * 
     */
    public AnnotatedDestinationStructure createAnnotatedDestinationStructure() {
        return new AnnotatedDestinationStructure();
    }

    /**
     * Create an instance of {@link StopMonitoringCapabilitiesResponseStructure }
     * 
     */
    public StopMonitoringCapabilitiesResponseStructure createStopMonitoringCapabilitiesResponseStructure() {
        return new StopMonitoringCapabilitiesResponseStructure();
    }

    /**
     * Create an instance of {@link VehicleFeaturesStructure }
     * 
     */
    public VehicleFeaturesStructure createVehicleFeaturesStructure() {
        return new VehicleFeaturesStructure();
    }

    /**
     * Create an instance of {@link ManualAction }
     * 
     */
    public ManualAction createManualAction() {
        return new ManualAction();
    }

    /**
     * Create an instance of {@link ManualActionStructure }
     * 
     */
    public ManualActionStructure createManualActionStructure() {
        return new ManualActionStructure();
    }

    /**
     * Create an instance of {@link ParameterisedActionStructure }
     * 
     */
    public ParameterisedActionStructure createParameterisedActionStructure() {
        return new ParameterisedActionStructure();
    }

    /**
     * Create an instance of {@link SimpleActionStructure }
     * 
     */
    public SimpleActionStructure createSimpleActionStructure() {
        return new SimpleActionStructure();
    }

    /**
     * Create an instance of {@link ActionDataStructure }
     * 
     */
    public ActionDataStructure createActionDataStructure() {
        return new ActionDataStructure();
    }

    /**
     * Create an instance of {@link PublishToTvActionStructure }
     * 
     */
    public PublishToTvActionStructure createPublishToTvActionStructure() {
        return new PublishToTvActionStructure();
    }

    /**
     * Create an instance of {@link ErrorConditionStructure }
     * 
     */
    public ErrorConditionStructure createErrorConditionStructure() {
        return new ErrorConditionStructure();
    }

    /**
     * Create an instance of {@link SituationExchangeCapabilitiesResponseStructure }
     * 
     */
    public SituationExchangeCapabilitiesResponseStructure createSituationExchangeCapabilitiesResponseStructure() {
        return new SituationExchangeCapabilitiesResponseStructure();
    }

    /**
     * Create an instance of {@link SituationExchangePermissions }
     * 
     */
    public SituationExchangePermissions createSituationExchangePermissions() {
        return new SituationExchangePermissions();
    }

    /**
     * Create an instance of {@link SituationExchangeServicePermissionStructure }
     * 
     */
    public SituationExchangeServicePermissionStructure createSituationExchangeServicePermissionStructure() {
        return new SituationExchangeServicePermissionStructure();
    }

    /**
     * Create an instance of {@link DatedVehicleJourneyRefStructure }
     * 
     */
    public DatedVehicleJourneyRefStructure createDatedVehicleJourneyRefStructure() {
        return new DatedVehicleJourneyRefStructure();
    }

    /**
     * Create an instance of {@link EstimatedTimetablePermissions }
     * 
     */
    public EstimatedTimetablePermissions createEstimatedTimetablePermissions() {
        return new EstimatedTimetablePermissions();
    }

    /**
     * Create an instance of {@link ServiceFeatureRefStructure }
     * 
     */
    public ServiceFeatureRefStructure createServiceFeatureRefStructure() {
        return new ServiceFeatureRefStructure();
    }

    /**
     * Create an instance of {@link NotifyUserActionStructure }
     * 
     */
    public NotifyUserActionStructure createNotifyUserActionStructure() {
        return new NotifyUserActionStructure();
    }

    /**
     * Create an instance of {@link GeneralMessagePermissions }
     * 
     */
    public GeneralMessagePermissions createGeneralMessagePermissions() {
        return new GeneralMessagePermissions();
    }

    /**
     * Create an instance of {@link StatusResponseStructure }
     * 
     */
    public StatusResponseStructure createStatusResponseStructure() {
        return new StatusResponseStructure();
    }

    /**
     * Create an instance of {@link StopMonitoringPermissions }
     * 
     */
    public StopMonitoringPermissions createStopMonitoringPermissions() {
        return new StopMonitoringPermissions();
    }

    /**
     * Create an instance of {@link SituationSimpleRefStructure }
     * 
     */
    public SituationSimpleRefStructure createSituationSimpleRefStructure() {
        return new SituationSimpleRefStructure();
    }

    /**
     * Create an instance of {@link SituationRefStructure }
     * 
     */
    public SituationRefStructure createSituationRefStructure() {
        return new SituationRefStructure();
    }

    /**
     * Create an instance of {@link DatedTimetableVersionFrameStructure }
     * 
     */
    public DatedTimetableVersionFrameStructure createDatedTimetableVersionFrameStructure() {
        return new DatedTimetableVersionFrameStructure();
    }

    /**
     * Create an instance of {@link ProductCategoryStructure }
     * 
     */
    public ProductCategoryStructure createProductCategoryStructure() {
        return new ProductCategoryStructure();
    }

    /**
     * Create an instance of {@link StopLineNoticeCancellationStructure }
     * 
     */
    public StopLineNoticeCancellationStructure createStopLineNoticeCancellationStructure() {
        return new StopLineNoticeCancellationStructure();
    }

    /**
     * Create an instance of {@link VehicleMonitoringCapabilityRequestPolicyStructure }
     * 
     */
    public VehicleMonitoringCapabilityRequestPolicyStructure createVehicleMonitoringCapabilityRequestPolicyStructure() {
        return new VehicleMonitoringCapabilityRequestPolicyStructure();
    }

    /**
     * Create an instance of {@link SituationSharedRefStructure }
     * 
     */
    public SituationSharedRefStructure createSituationSharedRefStructure() {
        return new SituationSharedRefStructure();
    }

    /**
     * Create an instance of {@link ProducerResponseEndpointStructure }
     * 
     */
    public ProducerResponseEndpointStructure createProducerResponseEndpointStructure() {
        return new ProducerResponseEndpointStructure();
    }

    /**
     * Create an instance of {@link ServiceDeliveryBodyStructure }
     * 
     */
    public ServiceDeliveryBodyStructure createServiceDeliveryBodyStructure() {
        return new ServiceDeliveryBodyStructure();
    }

    /**
     * Create an instance of {@link GeneralMessageDeliveriesStructure }
     * 
     */
    public GeneralMessageDeliveriesStructure createGeneralMessageDeliveriesStructure() {
        return new GeneralMessageDeliveriesStructure();
    }

    /**
     * Create an instance of {@link ConsumerResponseEndpointStructure }
     * 
     */
    public ConsumerResponseEndpointStructure createConsumerResponseEndpointStructure() {
        return new ConsumerResponseEndpointStructure();
    }

    /**
     * Create an instance of {@link AnnotatedFacilityStructure }
     * 
     */
    public AnnotatedFacilityStructure createAnnotatedFacilityStructure() {
        return new AnnotatedFacilityStructure();
    }

    /**
     * Create an instance of {@link OffsetStructure }
     * 
     */
    public OffsetStructure createOffsetStructure() {
        return new OffsetStructure();
    }

    /**
     * Create an instance of {@link MonitoringRefStructure }
     * 
     */
    public MonitoringRefStructure createMonitoringRefStructure() {
        return new MonitoringRefStructure();
    }

    /**
     * Create an instance of {@link DataFrameRefStructure }
     * 
     */
    public DataFrameRefStructure createDataFrameRefStructure() {
        return new DataFrameRefStructure();
    }

    /**
     * Create an instance of {@link TransportDescriptionStructure }
     * 
     */
    public TransportDescriptionStructure createTransportDescriptionStructure() {
        return new TransportDescriptionStructure();
    }

    /**
     * Create an instance of {@link InfoMessageRefStructure }
     * 
     */
    public InfoMessageRefStructure createInfoMessageRefStructure() {
        return new InfoMessageRefStructure();
    }

    /**
     * Create an instance of {@link ContextualisedConnectionLinkStructure }
     * 
     */
    public ContextualisedConnectionLinkStructure createContextualisedConnectionLinkStructure() {
        return new ContextualisedConnectionLinkStructure();
    }

    /**
     * Create an instance of {@link BlockRefStructure }
     * 
     */
    public BlockRefStructure createBlockRefStructure() {
        return new BlockRefStructure();
    }

    /**
     * Create an instance of {@link AbstractMonitoredCallStructure }
     * 
     */
    public AbstractMonitoredCallStructure createAbstractMonitoredCallStructure() {
        return new AbstractMonitoredCallStructure();
    }

    /**
     * Create an instance of {@link ConnectionMonitoringCapabilityRequestPolicyStructure }
     * 
     */
    public ConnectionMonitoringCapabilityRequestPolicyStructure createConnectionMonitoringCapabilityRequestPolicyStructure() {
        return new ConnectionMonitoringCapabilityRequestPolicyStructure();
    }

    /**
     * Create an instance of {@link ResponseEndpointStructure }
     * 
     */
    public ResponseEndpointStructure createResponseEndpointStructure() {
        return new ResponseEndpointStructure();
    }

    /**
     * Create an instance of {@link NoteStructure }
     * 
     */
    public NoteStructure createNoteStructure() {
        return new NoteStructure();
    }

    /**
     * Create an instance of {@link ZoneRefStructure }
     * 
     */
    public ZoneRefStructure createZoneRefStructure() {
        return new ZoneRefStructure();
    }

    /**
     * Create an instance of {@link ErrorDescriptionStructure }
     * 
     */
    public ErrorDescriptionStructure createErrorDescriptionStructure() {
        return new ErrorDescriptionStructure();
    }

    /**
     * Create an instance of {@link ProductionTimetableDeliveriesStructure }
     * 
     */
    public ProductionTimetableDeliveriesStructure createProductionTimetableDeliveriesStructure() {
        return new ProductionTimetableDeliveriesStructure();
    }

    /**
     * Create an instance of {@link AffectedCallStructure }
     * 
     */
    public AffectedCallStructure createAffectedCallStructure() {
        return new AffectedCallStructure();
    }

    /**
     * Create an instance of {@link MonitoredFeederArrivalCancellationStructure }
     * 
     */
    public MonitoredFeederArrivalCancellationStructure createMonitoredFeederArrivalCancellationStructure() {
        return new MonitoredFeederArrivalCancellationStructure();
    }

    /**
     * Create an instance of {@link ConnectionTimetableDeliveriesStructure }
     * 
     */
    public ConnectionTimetableDeliveriesStructure createConnectionTimetableDeliveriesStructure() {
        return new ConnectionTimetableDeliveriesStructure();
    }

    /**
     * Create an instance of {@link HalfOpenTimestampRangeStructure }
     * 
     */
    public HalfOpenTimestampRangeStructure createHalfOpenTimestampRangeStructure() {
        return new HalfOpenTimestampRangeStructure();
    }

    /**
     * Create an instance of {@link ConnectionTimetableCapabilityRequestPolicyStructure }
     * 
     */
    public ConnectionTimetableCapabilityRequestPolicyStructure createConnectionTimetableCapabilityRequestPolicyStructure() {
        return new ConnectionTimetableCapabilityRequestPolicyStructure();
    }

    /**
     * Create an instance of {@link InfoLinkStructure }
     * 
     */
    public InfoLinkStructure createInfoLinkStructure() {
        return new InfoLinkStructure();
    }

    /**
     * Create an instance of {@link OrganisationRefStructure }
     * 
     */
    public OrganisationRefStructure createOrganisationRefStructure() {
        return new OrganisationRefStructure();
    }

    /**
     * Create an instance of {@link CapabilitySubscriptionPolicyStructure }
     * 
     */
    public CapabilitySubscriptionPolicyStructure createCapabilitySubscriptionPolicyStructure() {
        return new CapabilitySubscriptionPolicyStructure();
    }

    /**
     * Create an instance of {@link ProductCategoryRefStructure }
     * 
     */
    public ProductCategoryRefStructure createProductCategoryRefStructure() {
        return new ProductCategoryRefStructure();
    }

    /**
     * Create an instance of {@link LineDirectionStructure }
     * 
     */
    public LineDirectionStructure createLineDirectionStructure() {
        return new LineDirectionStructure();
    }

    /**
     * Create an instance of {@link AbstractSituationElementStructure }
     * 
     */
    public AbstractSituationElementStructure createAbstractSituationElementStructure() {
        return new AbstractSituationElementStructure();
    }

    /**
     * Create an instance of {@link VehicleFeatureRefStructure }
     * 
     */
    public VehicleFeatureRefStructure createVehicleFeatureRefStructure() {
        return new VehicleFeatureRefStructure();
    }

    /**
     * Create an instance of {@link EasementsStructure }
     * 
     */
    public EasementsStructure createEasementsStructure() {
        return new EasementsStructure();
    }

    /**
     * Create an instance of {@link ConnectionCapabilityAccessControlStructure }
     * 
     */
    public ConnectionCapabilityAccessControlStructure createConnectionCapabilityAccessControlStructure() {
        return new ConnectionCapabilityAccessControlStructure();
    }

    /**
     * Create an instance of {@link NetworkRefStructure }
     * 
     */
    public NetworkRefStructure createNetworkRefStructure() {
        return new NetworkRefStructure();
    }

    /**
     * Create an instance of {@link RoadFilterStructure }
     * 
     */
    public RoadFilterStructure createRoadFilterStructure() {
        return new RoadFilterStructure();
    }

    /**
     * Create an instance of {@link AbstractNotificationStructure }
     * 
     */
    public AbstractNotificationStructure createAbstractNotificationStructure() {
        return new AbstractNotificationStructure();
    }

    /**
     * Create an instance of {@link AffectedStopPlaceElementStructure }
     * 
     */
    public AffectedStopPlaceElementStructure createAffectedStopPlaceElementStructure() {
        return new AffectedStopPlaceElementStructure();
    }

    /**
     * Create an instance of {@link StopLineNoticeStructure }
     * 
     */
    public StopLineNoticeStructure createStopLineNoticeStructure() {
        return new StopLineNoticeStructure();
    }

    /**
     * Create an instance of {@link MonitoredStopVisitCancellationStructure }
     * 
     */
    public MonitoredStopVisitCancellationStructure createMonitoredStopVisitCancellationStructure() {
        return new MonitoredStopVisitCancellationStructure();
    }

    /**
     * Create an instance of {@link AffectedRoadStructure }
     * 
     */
    public AffectedRoadStructure createAffectedRoadStructure() {
        return new AffectedRoadStructure();
    }

    /**
     * Create an instance of {@link StopMonitoringCapabilityRequestPolicyStructure }
     * 
     */
    public StopMonitoringCapabilityRequestPolicyStructure createStopMonitoringCapabilityRequestPolicyStructure() {
        return new StopMonitoringCapabilityRequestPolicyStructure();
    }

    /**
     * Create an instance of {@link CoordinatesStructure }
     * 
     */
    public CoordinatesStructure createCoordinatesStructure() {
        return new CoordinatesStructure();
    }

    /**
     * Create an instance of {@link AffectedOperatorStructure }
     * 
     */
    public AffectedOperatorStructure createAffectedOperatorStructure() {
        return new AffectedOperatorStructure();
    }

    /**
     * Create an instance of {@link InfoChannelPermissionStructure }
     * 
     */
    public InfoChannelPermissionStructure createInfoChannelPermissionStructure() {
        return new InfoChannelPermissionStructure();
    }

    /**
     * Create an instance of {@link AdviceRefStructure }
     * 
     */
    public AdviceRefStructure createAdviceRefStructure() {
        return new AdviceRefStructure();
    }

    /**
     * Create an instance of {@link AbstractItemStructure }
     * 
     */
    public AbstractItemStructure createAbstractItemStructure() {
        return new AbstractItemStructure();
    }

    /**
     * Create an instance of {@link StoppingPositionChangedDepartureStructure }
     * 
     */
    public StoppingPositionChangedDepartureStructure createStoppingPositionChangedDepartureStructure() {
        return new StoppingPositionChangedDepartureStructure();
    }

    /**
     * Create an instance of {@link OperationalUnitRefStructure }
     * 
     */
    public OperationalUnitRefStructure createOperationalUnitRefStructure() {
        return new OperationalUnitRefStructure();
    }

    /**
     * Create an instance of {@link SectionRefStructure }
     * 
     */
    public SectionRefStructure createSectionRefStructure() {
        return new SectionRefStructure();
    }

    /**
     * Create an instance of {@link SituationExchangeDeliveriesStructure }
     * 
     */
    public SituationExchangeDeliveriesStructure createSituationExchangeDeliveriesStructure() {
        return new SituationExchangeDeliveriesStructure();
    }

    /**
     * Create an instance of {@link AbstractIdentifiedItemStructure }
     * 
     */
    public AbstractIdentifiedItemStructure createAbstractIdentifiedItemStructure() {
        return new AbstractIdentifiedItemStructure();
    }

    /**
     * Create an instance of {@link AffectedPathLinkStructure }
     * 
     */
    public AffectedPathLinkStructure createAffectedPathLinkStructure() {
        return new AffectedPathLinkStructure();
    }

    /**
     * Create an instance of {@link VehicleMonitoringRefStructure }
     * 
     */
    public VehicleMonitoringRefStructure createVehicleMonitoringRefStructure() {
        return new VehicleMonitoringRefStructure();
    }

    /**
     * Create an instance of {@link ClearDownRefStructure }
     * 
     */
    public ClearDownRefStructure createClearDownRefStructure() {
        return new ClearDownRefStructure();
    }

    /**
     * Create an instance of {@link MonitoredStopVisitStructure }
     * 
     */
    public MonitoredStopVisitStructure createMonitoredStopVisitStructure() {
        return new MonitoredStopVisitStructure();
    }

    /**
     * Create an instance of {@link DirectionRefStructure }
     * 
     */
    public DirectionRefStructure createDirectionRefStructure() {
        return new DirectionRefStructure();
    }

    /**
     * Create an instance of {@link PtAdviceStructure }
     * 
     */
    public PtAdviceStructure createPtAdviceStructure() {
        return new PtAdviceStructure();
    }

    /**
     * Create an instance of {@link CasualtiesStructure }
     * 
     */
    public CasualtiesStructure createCasualtiesStructure() {
        return new CasualtiesStructure();
    }

    /**
     * Create an instance of {@link DatedVehicleJourneyIndirectRefStructure }
     * 
     */
    public DatedVehicleJourneyIndirectRefStructure createDatedVehicleJourneyIndirectRefStructure() {
        return new DatedVehicleJourneyIndirectRefStructure();
    }

    /**
     * Create an instance of {@link AnnotatedDirectionStructure }
     * 
     */
    public AnnotatedDirectionStructure createAnnotatedDirectionStructure() {
        return new AnnotatedDirectionStructure();
    }

    /**
     * Create an instance of {@link FramedVehicleJourneyRefStructure }
     * 
     */
    public FramedVehicleJourneyRefStructure createFramedVehicleJourneyRefStructure() {
        return new FramedVehicleJourneyRefStructure();
    }

    /**
     * Create an instance of {@link DistributorDepartureCancellationStructure }
     * 
     */
    public DistributorDepartureCancellationStructure createDistributorDepartureCancellationStructure() {
        return new DistributorDepartureCancellationStructure();
    }

    /**
     * Create an instance of {@link SubscriptionQualifierStructure }
     * 
     */
    public SubscriptionQualifierStructure createSubscriptionQualifierStructure() {
        return new SubscriptionQualifierStructure();
    }

    /**
     * Create an instance of {@link EstimatedTimetableCapabilityRequestPolicyStructure }
     * 
     */
    public EstimatedTimetableCapabilityRequestPolicyStructure createEstimatedTimetableCapabilityRequestPolicyStructure() {
        return new EstimatedTimetableCapabilityRequestPolicyStructure();
    }

    /**
     * Create an instance of {@link AffectedStopPlaceComponentStructure }
     * 
     */
    public AffectedStopPlaceComponentStructure createAffectedStopPlaceComponentStructure() {
        return new AffectedStopPlaceComponentStructure();
    }

    /**
     * Create an instance of {@link EstimatedTimetableDeliveriesStructure }
     * 
     */
    public EstimatedTimetableDeliveriesStructure createEstimatedTimetableDeliveriesStructure() {
        return new EstimatedTimetableDeliveriesStructure();
    }

    /**
     * Create an instance of {@link DelaysStructure }
     * 
     */
    public DelaysStructure createDelaysStructure() {
        return new DelaysStructure();
    }

    /**
     * Create an instance of {@link MonitoringInformationStructure }
     * 
     */
    public MonitoringInformationStructure createMonitoringInformationStructure() {
        return new MonitoringInformationStructure();
    }

    /**
     * Create an instance of {@link RouteLinkRefStructure }
     * 
     */
    public RouteLinkRefStructure createRouteLinkRefStructure() {
        return new RouteLinkRefStructure();
    }

    /**
     * Create an instance of {@link BlockingStructure }
     * 
     */
    public BlockingStructure createBlockingStructure() {
        return new BlockingStructure();
    }

    /**
     * Create an instance of {@link HalfOpenTimeRangeStructure }
     * 
     */
    public HalfOpenTimeRangeStructure createHalfOpenTimeRangeStructure() {
        return new HalfOpenTimeRangeStructure();
    }

    /**
     * Create an instance of {@link StopPointsDiscoveryRequestStructure }
     * 
     */
    public StopPointsDiscoveryRequestStructure createStopPointsDiscoveryRequestStructure() {
        return new StopPointsDiscoveryRequestStructure();
    }

    /**
     * Create an instance of {@link OnwardCallStructure }
     * 
     */
    public OnwardCallStructure createOnwardCallStructure() {
        return new OnwardCallStructure();
    }

    /**
     * Create an instance of {@link SubscriptionResponseBodyStructure }
     * 
     */
    public SubscriptionResponseBodyStructure createSubscriptionResponseBodyStructure() {
        return new SubscriptionResponseBodyStructure();
    }

    /**
     * Create an instance of {@link DefaultedTextStructure }
     * 
     */
    public DefaultedTextStructure createDefaultedTextStructure() {
        return new DefaultedTextStructure();
    }

    /**
     * Create an instance of {@link DestinationStructure }
     * 
     */
    public DestinationStructure createDestinationStructure() {
        return new DestinationStructure();
    }

    /**
     * Create an instance of {@link InfoChannelRefStructure }
     * 
     */
    public InfoChannelRefStructure createInfoChannelRefStructure() {
        return new InfoChannelRefStructure();
    }

    /**
     * Create an instance of {@link AffectedRoadsStructure }
     * 
     */
    public AffectedRoadsStructure createAffectedRoadsStructure() {
        return new AffectedRoadsStructure();
    }

    /**
     * Create an instance of {@link ActionsStructure }
     * 
     */
    public ActionsStructure createActionsStructure() {
        return new ActionsStructure();
    }

    /**
     * Create an instance of {@link ItemRefStructure }
     * 
     */
    public ItemRefStructure createItemRefStructure() {
        return new ItemRefStructure();
    }

    /**
     * Create an instance of {@link SiriSubscriptionRequestStructure }
     * 
     */
    public SiriSubscriptionRequestStructure createSiriSubscriptionRequestStructure() {
        return new SiriSubscriptionRequestStructure();
    }

    /**
     * Create an instance of {@link ReferencesStructure }
     * 
     */
    public ReferencesStructure createReferencesStructure() {
        return new ReferencesStructure();
    }

    /**
     * Create an instance of {@link TimetabledStopVisitStructure }
     * 
     */
    public TimetabledStopVisitStructure createTimetabledStopVisitStructure() {
        return new TimetabledStopVisitStructure();
    }

    /**
     * Create an instance of {@link AffectedConnectionLinkStructure }
     * 
     */
    public AffectedConnectionLinkStructure createAffectedConnectionLinkStructure() {
        return new AffectedConnectionLinkStructure();
    }

    /**
     * Create an instance of {@link SituationElementStructure }
     * 
     */
    public SituationElementStructure createSituationElementStructure() {
        return new SituationElementStructure();
    }

    /**
     * Create an instance of {@link AbstractDistributorItemStructure }
     * 
     */
    public AbstractDistributorItemStructure createAbstractDistributorItemStructure() {
        return new AbstractDistributorItemStructure();
    }

    /**
     * Create an instance of {@link ConnectingJourneyFilterStructure }
     * 
     */
    public ConnectingJourneyFilterStructure createConnectingJourneyFilterStructure() {
        return new ConnectingJourneyFilterStructure();
    }

    /**
     * Create an instance of {@link TerminateSubscriptionRequestBodyStructure }
     * 
     */
    public TerminateSubscriptionRequestBodyStructure createTerminateSubscriptionRequestBodyStructure() {
        return new TerminateSubscriptionRequestBodyStructure();
    }

    /**
     * Create an instance of {@link AbstractTopicPermissionStructure }
     * 
     */
    public AbstractTopicPermissionStructure createAbstractTopicPermissionStructure() {
        return new AbstractTopicPermissionStructure();
    }

    /**
     * Create an instance of {@link AbstractCallStructure }
     * 
     */
    public AbstractCallStructure createAbstractCallStructure() {
        return new AbstractCallStructure();
    }

    /**
     * Create an instance of {@link MonitoringCapabilityAccessControlStructure }
     * 
     */
    public MonitoringCapabilityAccessControlStructure createMonitoringCapabilityAccessControlStructure() {
        return new MonitoringCapabilityAccessControlStructure();
    }

    /**
     * Create an instance of {@link SituationSourceStructure }
     * 
     */
    public SituationSourceStructure createSituationSourceStructure() {
        return new SituationSourceStructure();
    }

    /**
     * Create an instance of {@link NetworkContextStructure }
     * 
     */
    public NetworkContextStructure createNetworkContextStructure() {
        return new NetworkContextStructure();
    }

    /**
     * Create an instance of {@link TrainBlockPartStructure }
     * 
     */
    public TrainBlockPartStructure createTrainBlockPartStructure() {
        return new TrainBlockPartStructure();
    }

    /**
     * Create an instance of {@link RelatedSituationStructure }
     * 
     */
    public RelatedSituationStructure createRelatedSituationStructure() {
        return new RelatedSituationStructure();
    }

    /**
     * Create an instance of {@link AbstractCapabilitiesStructure }
     * 
     */
    public AbstractCapabilitiesStructure createAbstractCapabilitiesStructure() {
        return new AbstractCapabilitiesStructure();
    }

    /**
     * Create an instance of {@link CapabilityRequestPolicyStructure }
     * 
     */
    public CapabilityRequestPolicyStructure createCapabilityRequestPolicyStructure() {
        return new CapabilityRequestPolicyStructure();
    }

    /**
     * Create an instance of {@link PreviousCallStructure }
     * 
     */
    public PreviousCallStructure createPreviousCallStructure() {
        return new PreviousCallStructure();
    }

    /**
     * Create an instance of {@link NetworkStructure }
     * 
     */
    public NetworkStructure createNetworkStructure() {
        return new NetworkStructure();
    }

    /**
     * Create an instance of {@link ConnectingTimeFilterStructure }
     * 
     */
    public ConnectingTimeFilterStructure createConnectingTimeFilterStructure() {
        return new ConnectingTimeFilterStructure();
    }

    /**
     * Create an instance of {@link AffectedInterchangeStructure }
     * 
     */
    public AffectedInterchangeStructure createAffectedInterchangeStructure() {
        return new AffectedInterchangeStructure();
    }

    /**
     * Create an instance of {@link DataNameSpacesStructure }
     * 
     */
    public DataNameSpacesStructure createDataNameSpacesStructure() {
        return new DataNameSpacesStructure();
    }

    /**
     * Create an instance of {@link FacilityMonitoringDeliveriesStructure }
     * 
     */
    public FacilityMonitoringDeliveriesStructure createFacilityMonitoringDeliveriesStructure() {
        return new FacilityMonitoringDeliveriesStructure();
    }

    /**
     * Create an instance of {@link WaitProlongedDepartureStructure }
     * 
     */
    public WaitProlongedDepartureStructure createWaitProlongedDepartureStructure() {
        return new WaitProlongedDepartureStructure();
    }

    /**
     * Create an instance of {@link TrainPartRefStructure }
     * 
     */
    public TrainPartRefStructure createTrainPartRefStructure() {
        return new TrainPartRefStructure();
    }

    /**
     * Create an instance of {@link ProductionTimetableCapabilityRequestPolicyStructure }
     * 
     */
    public ProductionTimetableCapabilityRequestPolicyStructure createProductionTimetableCapabilityRequestPolicyStructure() {
        return new ProductionTimetableCapabilityRequestPolicyStructure();
    }

    /**
     * Create an instance of {@link PreviousCallsStructure }
     * 
     */
    public PreviousCallsStructure createPreviousCallsStructure() {
        return new PreviousCallsStructure();
    }

    /**
     * Create an instance of {@link RemedyStructure }
     * 
     */
    public RemedyStructure createRemedyStructure() {
        return new RemedyStructure();
    }

    /**
     * Create an instance of {@link StopMonitoringDeliveriesStructure }
     * 
     */
    public StopMonitoringDeliveriesStructure createStopMonitoringDeliveriesStructure() {
        return new StopMonitoringDeliveriesStructure();
    }

    /**
     * Create an instance of {@link TimetabledStopVisitCancellationStructure }
     * 
     */
    public TimetabledStopVisitCancellationStructure createTimetabledStopVisitCancellationStructure() {
        return new TimetabledStopVisitCancellationStructure();
    }

    /**
     * Create an instance of {@link AccessibilityNeedsFilterStructure }
     * 
     */
    public AccessibilityNeedsFilterStructure createAccessibilityNeedsFilterStructure() {
        return new AccessibilityNeedsFilterStructure();
    }

    /**
     * Create an instance of {@link InterchangeJourneyStructure }
     * 
     */
    public InterchangeJourneyStructure createInterchangeJourneyStructure() {
        return new InterchangeJourneyStructure();
    }

    /**
     * Create an instance of {@link SituationVersion }
     * 
     */
    public SituationVersion createSituationVersion() {
        return new SituationVersion();
    }

    /**
     * Create an instance of {@link DataSupplyRequestBodyStructure }
     * 
     */
    public DataSupplyRequestBodyStructure createDataSupplyRequestBodyStructure() {
        return new DataSupplyRequestBodyStructure();
    }

    /**
     * Create an instance of {@link CapabilityAccessControlStructure }
     * 
     */
    public CapabilityAccessControlStructure createCapabilityAccessControlStructure() {
        return new CapabilityAccessControlStructure();
    }

    /**
     * Create an instance of {@link CourseOfJourneyStructure }
     * 
     */
    public CourseOfJourneyStructure createCourseOfJourneyStructure() {
        return new CourseOfJourneyStructure();
    }

    /**
     * Create an instance of {@link ConnectionMonitoringDeliveriesStructure }
     * 
     */
    public ConnectionMonitoringDeliveriesStructure createConnectionMonitoringDeliveriesStructure() {
        return new ConnectionMonitoringDeliveriesStructure();
    }

    /**
     * Create an instance of {@link AffectedNetworkStructure }
     * 
     */
    public AffectedNetworkStructure createAffectedNetworkStructure() {
        return new AffectedNetworkStructure();
    }

    /**
     * Create an instance of {@link AffectedPlaceStructure }
     * 
     */
    public AffectedPlaceStructure createAffectedPlaceStructure() {
        return new AffectedPlaceStructure();
    }

    /**
     * Create an instance of {@link MonitoredCallStructure }
     * 
     */
    public MonitoredCallStructure createMonitoredCallStructure() {
        return new MonitoredCallStructure();
    }

    /**
     * Create an instance of {@link MonitoredFeederArrivalStructure }
     * 
     */
    public MonitoredFeederArrivalStructure createMonitoredFeederArrivalStructure() {
        return new MonitoredFeederArrivalStructure();
    }

    /**
     * Create an instance of {@link StopTimetableDeliveriesStructure }
     * 
     */
    public StopTimetableDeliveriesStructure createStopTimetableDeliveriesStructure() {
        return new StopTimetableDeliveriesStructure();
    }

    /**
     * Create an instance of {@link AbstractFeederItemStructure }
     * 
     */
    public AbstractFeederItemStructure createAbstractFeederItemStructure() {
        return new AbstractFeederItemStructure();
    }

    /**
     * Create an instance of {@link PtConsequencesStructure }
     * 
     */
    public PtConsequencesStructure createPtConsequencesStructure() {
        return new PtConsequencesStructure();
    }

    /**
     * Create an instance of {@link EstimatedVersionFrameStructure }
     * 
     */
    public EstimatedVersionFrameStructure createEstimatedVersionFrameStructure() {
        return new EstimatedVersionFrameStructure();
    }

    /**
     * Create an instance of {@link ConsumerRequestEndpointStructure }
     * 
     */
    public ConsumerRequestEndpointStructure createConsumerRequestEndpointStructure() {
        return new ConsumerRequestEndpointStructure();
    }

    /**
     * Create an instance of {@link StopMonitorPermissionStructure }
     * 
     */
    public StopMonitorPermissionStructure createStopMonitorPermissionStructure() {
        return new StopMonitorPermissionStructure();
    }

    /**
     * Create an instance of {@link LocationStructure }
     * 
     */
    public LocationStructure createLocationStructure() {
        return new LocationStructure();
    }

    /**
     * Create an instance of {@link BoardingStructure }
     * 
     */
    public BoardingStructure createBoardingStructure() {
        return new BoardingStructure();
    }

    /**
     * Create an instance of {@link AbstractReferencingItemStructure }
     * 
     */
    public AbstractReferencingItemStructure createAbstractReferencingItemStructure() {
        return new AbstractReferencingItemStructure();
    }

    /**
     * Create an instance of {@link VehicleMonitorPermissionStructure }
     * 
     */
    public VehicleMonitorPermissionStructure createVehicleMonitorPermissionStructure() {
        return new VehicleMonitorPermissionStructure();
    }

    /**
     * Create an instance of {@link SiriServiceDeliveryStructure }
     * 
     */
    public SiriServiceDeliveryStructure createSiriServiceDeliveryStructure() {
        return new SiriServiceDeliveryStructure();
    }

    /**
     * Create an instance of {@link PlaceNameStructure }
     * 
     */
    public PlaceNameStructure createPlaceNameStructure() {
        return new PlaceNameStructure();
    }

    /**
     * Create an instance of {@link RouteRefStructure }
     * 
     */
    public RouteRefStructure createRouteRefStructure() {
        return new RouteRefStructure();
    }

    /**
     * Create an instance of {@link ModesStructure }
     * 
     */
    public ModesStructure createModesStructure() {
        return new ModesStructure();
    }

    /**
     * Create an instance of {@link ContextStructure }
     * 
     */
    public ContextStructure createContextStructure() {
        return new ContextStructure();
    }

    /**
     * Create an instance of {@link OnwardCallsStructure }
     * 
     */
    public OnwardCallsStructure createOnwardCallsStructure() {
        return new OnwardCallsStructure();
    }

    /**
     * Create an instance of {@link VehicleMonitoringDeliveriesStructure }
     * 
     */
    public VehicleMonitoringDeliveriesStructure createVehicleMonitoringDeliveriesStructure() {
        return new VehicleMonitoringDeliveriesStructure();
    }

    /**
     * Create an instance of {@link CapabilityRefStructure }
     * 
     */
    public CapabilityRefStructure createCapabilityRefStructure() {
        return new CapabilityRefStructure();
    }

    /**
     * Create an instance of {@link ProductionTimetableSubscriptionStructure }
     * 
     */
    public ProductionTimetableSubscriptionStructure createProductionTimetableSubscriptionStructure() {
        return new ProductionTimetableSubscriptionStructure();
    }

    /**
     * Create an instance of {@link TargetedInterchangeStructure }
     * 
     */
    public TargetedInterchangeStructure createTargetedInterchangeStructure() {
        return new TargetedInterchangeStructure();
    }

    /**
     * Create an instance of {@link ClosedTimestampRangeStructure }
     * 
     */
    public ClosedTimestampRangeStructure createClosedTimestampRangeStructure() {
        return new ClosedTimestampRangeStructure();
    }

    /**
     * Create an instance of {@link ImageStructure }
     * 
     */
    public ImageStructure createImageStructure() {
        return new ImageStructure();
    }

    /**
     * Create an instance of {@link MobilityDisruptionStructure }
     * 
     */
    public MobilityDisruptionStructure createMobilityDisruptionStructure() {
        return new MobilityDisruptionStructure();
    }

    /**
     * Create an instance of {@link ClosedTimeRangeStructure }
     * 
     */
    public ClosedTimeRangeStructure createClosedTimeRangeStructure() {
        return new ClosedTimeRangeStructure();
    }

    /**
     * Create an instance of {@link SubscriptionFilterStructure }
     * 
     */
    public SubscriptionFilterStructure createSubscriptionFilterStructure() {
        return new SubscriptionFilterStructure();
    }

    /**
     * Create an instance of {@link AllFacilitiesFeatureStructure }
     * 
     */
    public AllFacilitiesFeatureStructure createAllFacilitiesFeatureStructure() {
        return new AllFacilitiesFeatureStructure();
    }

    /**
     * Create an instance of {@link SubscriptionFilterRefStructure }
     * 
     */
    public SubscriptionFilterRefStructure createSubscriptionFilterRefStructure() {
        return new SubscriptionFilterRefStructure();
    }

    /**
     * Create an instance of {@link TargetedVehicleJourneyStructure }
     * 
     */
    public TargetedVehicleJourneyStructure createTargetedVehicleJourneyStructure() {
        return new TargetedVehicleJourneyStructure();
    }

    /**
     * Create an instance of {@link GeneralMessageCapabilityAccessControlStructure }
     * 
     */
    public GeneralMessageCapabilityAccessControlStructure createGeneralMessageCapabilityAccessControlStructure() {
        return new GeneralMessageCapabilityAccessControlStructure();
    }

    /**
     * Create an instance of {@link AffectedSectionStructure }
     * 
     */
    public AffectedSectionStructure createAffectedSectionStructure() {
        return new AffectedSectionStructure();
    }

    /**
     * Create an instance of {@link MonitoredVehicleJourneyStructure }
     * 
     */
    public MonitoredVehicleJourneyStructure createMonitoredVehicleJourneyStructure() {
        return new MonitoredVehicleJourneyStructure();
    }

    /**
     * Create an instance of {@link FacilityStatusStructure }
     * 
     */
    public FacilityStatusStructure createFacilityStatusStructure() {
        return new FacilityStatusStructure();
    }

    /**
     * Create an instance of {@link OperatorRefStructure }
     * 
     */
    public OperatorRefStructure createOperatorRefStructure() {
        return new OperatorRefStructure();
    }

    /**
     * Create an instance of {@link ProgressBetweenStopsStructure }
     * 
     */
    public ProgressBetweenStopsStructure createProgressBetweenStopsStructure() {
        return new ProgressBetweenStopsStructure();
    }

    /**
     * Create an instance of {@link VehicleActivityCancellationStructure }
     * 
     */
    public VehicleActivityCancellationStructure createVehicleActivityCancellationStructure() {
        return new VehicleActivityCancellationStructure();
    }

    /**
     * Create an instance of {@link FacilityLocationStructure }
     * 
     */
    public FacilityLocationStructure createFacilityLocationStructure() {
        return new FacilityLocationStructure();
    }

    /**
     * Create an instance of {@link MonitoringValidityConditionStructure }
     * 
     */
    public MonitoringValidityConditionStructure createMonitoringValidityConditionStructure() {
        return new MonitoringValidityConditionStructure();
    }

    /**
     * Create an instance of {@link NavigationPathRefStructure }
     * 
     */
    public NavigationPathRefStructure createNavigationPathRefStructure() {
        return new NavigationPathRefStructure();
    }

    /**
     * Create an instance of {@link Extensions }
     * 
     */
    public Extensions createExtensions() {
        return new Extensions();
    }

    /**
     * Create an instance of {@link AccessLinkRefStructure }
     * 
     */
    public AccessLinkRefStructure createAccessLinkRefStructure() {
        return new AccessLinkRefStructure();
    }

    /**
     * Create an instance of {@link PathJunctionRefStructure }
     * 
     */
    public PathJunctionRefStructure createPathJunctionRefStructure() {
        return new PathJunctionRefStructure();
    }

    /**
     * Create an instance of {@link InfoLinkStructure2 }
     * 
     */
    public InfoLinkStructure2 createInfoLinkStructure2() {
        return new InfoLinkStructure2();
    }

    /**
     * Create an instance of {@link StopPlaceRefStructure }
     * 
     */
    public StopPlaceRefStructure createStopPlaceRefStructure() {
        return new StopPlaceRefStructure();
    }

    /**
     * Create an instance of {@link PlaceEquipmentStructure }
     * 
     */
    public PlaceEquipmentStructure createPlaceEquipmentStructure() {
        return new PlaceEquipmentStructure();
    }

    /**
     * Create an instance of {@link PointProjectionStructure }
     * 
     */
    public PointProjectionStructure createPointProjectionStructure() {
        return new PointProjectionStructure();
    }

    /**
     * Create an instance of {@link StopPlaceComponentRefStructure }
     * 
     */
    public StopPlaceComponentRefStructure createStopPlaceComponentRefStructure() {
        return new StopPlaceComponentRefStructure();
    }

    /**
     * Create an instance of {@link CheckPointRefStructure }
     * 
     */
    public CheckPointRefStructure createCheckPointRefStructure() {
        return new CheckPointRefStructure();
    }

    /**
     * Create an instance of {@link FeatureRefStructure2 }
     * 
     */
    public FeatureRefStructure2 createFeatureRefStructure2() {
        return new FeatureRefStructure2();
    }

    /**
     * Create an instance of {@link VehicleStoppingPlaceRefStructure }
     * 
     */
    public VehicleStoppingPlaceRefStructure createVehicleStoppingPlaceRefStructure() {
        return new VehicleStoppingPlaceRefStructure();
    }

    /**
     * Create an instance of {@link AdministrativeAreaVersionedRefStructure }
     * 
     */
    public AdministrativeAreaVersionedRefStructure createAdministrativeAreaVersionedRefStructure() {
        return new AdministrativeAreaVersionedRefStructure();
    }

    /**
     * Create an instance of {@link ValidityConditionsStructure }
     * 
     */
    public ValidityConditionsStructure createValidityConditionsStructure() {
        return new ValidityConditionsStructure();
    }

    /**
     * Create an instance of {@link StopPlaceRefsStructure }
     * 
     */
    public StopPlaceRefsStructure createStopPlaceRefsStructure() {
        return new StopPlaceRefsStructure();
    }

    /**
     * Create an instance of {@link LevelRefStructure }
     * 
     */
    public LevelRefStructure createLevelRefStructure() {
        return new LevelRefStructure();
    }

    /**
     * Create an instance of {@link AccessSpaceRefStructure }
     * 
     */
    public AccessSpaceRefStructure createAccessSpaceRefStructure() {
        return new AccessSpaceRefStructure();
    }

    /**
     * Create an instance of {@link AliasStructure }
     * 
     */
    public AliasStructure createAliasStructure() {
        return new AliasStructure();
    }

    /**
     * Create an instance of {@link FeatureIdRefStructure }
     * 
     */
    public FeatureIdRefStructure createFeatureIdRefStructure() {
        return new FeatureIdRefStructure();
    }

    /**
     * Create an instance of {@link AdministrativeAreaRefsStructure }
     * 
     */
    public AdministrativeAreaRefsStructure createAdministrativeAreaRefsStructure() {
        return new AdministrativeAreaRefsStructure();
    }

    /**
     * Create an instance of {@link EquipmentRefStructure }
     * 
     */
    public EquipmentRefStructure createEquipmentRefStructure() {
        return new EquipmentRefStructure();
    }

    /**
     * Create an instance of {@link CheckPointStructure }
     * 
     */
    public CheckPointStructure createCheckPointStructure() {
        return new CheckPointStructure();
    }

    /**
     * Create an instance of {@link TimebandStructure }
     * 
     */
    public TimebandStructure createTimebandStructure() {
        return new TimebandStructure();
    }

    /**
     * Create an instance of {@link InfoLinksStructure }
     * 
     */
    public InfoLinksStructure createInfoLinksStructure() {
        return new InfoLinksStructure();
    }

    /**
     * Create an instance of {@link NamespaceTypeRefStructure }
     * 
     */
    public NamespaceTypeRefStructure createNamespaceTypeRefStructure() {
        return new NamespaceTypeRefStructure();
    }

    /**
     * Create an instance of {@link StopPlaceSpaceRefStructure }
     * 
     */
    public StopPlaceSpaceRefStructure createStopPlaceSpaceRefStructure() {
        return new StopPlaceSpaceRefStructure();
    }

    /**
     * Create an instance of {@link StopPlaceEntranceRefStructure }
     * 
     */
    public StopPlaceEntranceRefStructure createStopPlaceEntranceRefStructure() {
        return new StopPlaceEntranceRefStructure();
    }

    /**
     * Create an instance of {@link QuayRefStructure }
     * 
     */
    public QuayRefStructure createQuayRefStructure() {
        return new QuayRefStructure();
    }

    /**
     * Create an instance of {@link AccessPathLinkRefStructure }
     * 
     */
    public AccessPathLinkRefStructure createAccessPathLinkRefStructure() {
        return new AccessPathLinkRefStructure();
    }

    /**
     * Create an instance of {@link AdministratorRefStructure }
     * 
     */
    public AdministratorRefStructure createAdministratorRefStructure() {
        return new AdministratorRefStructure();
    }

    /**
     * Create an instance of {@link AuthorityRefStructure }
     * 
     */
    public AuthorityRefStructure createAuthorityRefStructure() {
        return new AuthorityRefStructure();
    }

    /**
     * Create an instance of {@link EquipmentTypeRefStructure }
     * 
     */
    public EquipmentTypeRefStructure createEquipmentTypeRefStructure() {
        return new EquipmentTypeRefStructure();
    }

    /**
     * Create an instance of {@link CountryRefStructure }
     * 
     */
    public CountryRefStructure createCountryRefStructure() {
        return new CountryRefStructure();
    }

    /**
     * Create an instance of {@link BoardingPositionRefStructure }
     * 
     */
    public BoardingPositionRefStructure createBoardingPositionRefStructure() {
        return new BoardingPositionRefStructure();
    }

    /**
     * Create an instance of {@link RegionRefStructure }
     * 
     */
    public RegionRefStructure createRegionRefStructure() {
        return new RegionRefStructure();
    }

    /**
     * Create an instance of {@link VehicleStoppingPositionRefStructure }
     * 
     */
    public VehicleStoppingPositionRefStructure createVehicleStoppingPositionRefStructure() {
        return new VehicleStoppingPositionRefStructure();
    }

    /**
     * Create an instance of {@link AdministratorVersionedRefStructure }
     * 
     */
    public AdministratorVersionedRefStructure createAdministratorVersionedRefStructure() {
        return new AdministratorVersionedRefStructure();
    }

    /**
     * Create an instance of {@link HalfOpenTimeRangeStructure2 }
     * 
     */
    public HalfOpenTimeRangeStructure2 createHalfOpenTimeRangeStructure2() {
        return new HalfOpenTimeRangeStructure2();
    }

    /**
     * Create an instance of {@link AdministrativeAreaRefStructure }
     * 
     */
    public AdministrativeAreaRefStructure createAdministrativeAreaRefStructure() {
        return new AdministrativeAreaRefStructure();
    }

    /**
     * Create an instance of {@link StopPathLinkRefStructure }
     * 
     */
    public StopPathLinkRefStructure createStopPathLinkRefStructure() {
        return new StopPathLinkRefStructure();
    }

    /**
     * Create an instance of {@link D2LogicalModel }
     * 
     */
    public D2LogicalModel createD2LogicalModel() {
        return new D2LogicalModel();
    }

    /**
     * Create an instance of {@link AxleWeight }
     * 
     */
    public AxleWeight createAxleWeight() {
        return new AxleWeight();
    }

    /**
     * Create an instance of {@link Speeds }
     * 
     */
    public Speeds createSpeeds() {
        return new Speeds();
    }

    /**
     * Create an instance of {@link com.transportation.SIRI_IL.SOAP.MeasurementSpecificCharacteristics }
     * 
     */
    public com.transportation.SIRI_IL.SOAP.MeasurementSpecificCharacteristics createMeasurementSpecificCharacteristics() {
        return new com.transportation.SIRI_IL.SOAP.MeasurementSpecificCharacteristics();
    }

    /**
     * Create an instance of {@link WidthCharacteristic }
     * 
     */
    public WidthCharacteristic createWidthCharacteristic() {
        return new WidthCharacteristic();
    }

    /**
     * Create an instance of {@link Point }
     * 
     */
    public Point createPoint() {
        return new Point();
    }

    /**
     * Create an instance of {@link SupplementaryPositionalDescription }
     * 
     */
    public SupplementaryPositionalDescription createSupplementaryPositionalDescription() {
        return new SupplementaryPositionalDescription();
    }

    /**
     * Create an instance of {@link PrecipitationDetail }
     * 
     */
    public PrecipitationDetail createPrecipitationDetail() {
        return new PrecipitationDetail();
    }

    /**
     * Create an instance of {@link ElaboratedData }
     * 
     */
    public ElaboratedData createElaboratedData() {
        return new ElaboratedData();
    }

    /**
     * Create an instance of {@link LocationByReference }
     * 
     */
    public LocationByReference createLocationByReference() {
        return new LocationByReference();
    }

    /**
     * Create an instance of {@link Delays }
     * 
     */
    public Delays createDelays() {
        return new Delays();
    }

    /**
     * Create an instance of {@link LengthCharacteristic }
     * 
     */
    public LengthCharacteristic createLengthCharacteristic() {
        return new LengthCharacteristic();
    }

    /**
     * Create an instance of {@link VehicleAndTrafficTypeAdvice }
     * 
     */
    public VehicleAndTrafficTypeAdvice createVehicleAndTrafficTypeAdvice() {
        return new VehicleAndTrafficTypeAdvice();
    }

    /**
     * Create an instance of {@link TPEGJunction }
     * 
     */
    public TPEGJunction createTPEGJunction() {
        return new TPEGJunction();
    }

    /**
     * Create an instance of {@link TPEGILCPointDescriptor }
     * 
     */
    public TPEGILCPointDescriptor createTPEGILCPointDescriptor() {
        return new TPEGILCPointDescriptor();
    }

    /**
     * Create an instance of {@link WeatherRelatedRoadConditions }
     * 
     */
    public WeatherRelatedRoadConditions createWeatherRelatedRoadConditions() {
        return new WeatherRelatedRoadConditions();
    }

    /**
     * Create an instance of {@link PointCoordinates }
     * 
     */
    public PointCoordinates createPointCoordinates() {
        return new PointCoordinates();
    }

    /**
     * Create an instance of {@link PeopleInvolved }
     * 
     */
    public PeopleInvolved createPeopleInvolved() {
        return new PeopleInvolved();
    }

    /**
     * Create an instance of {@link Instructions }
     * 
     */
    public Instructions createInstructions() {
        return new Instructions();
    }

    /**
     * Create an instance of {@link MatrixSignSetting }
     * 
     */
    public MatrixSignSetting createMatrixSignSetting() {
        return new MatrixSignSetting();
    }

    /**
     * Create an instance of {@link TrafficView }
     * 
     */
    public TrafficView createTrafficView() {
        return new TrafficView();
    }

    /**
     * Create an instance of {@link InternationalIdentifier }
     * 
     */
    public InternationalIdentifier createInternationalIdentifier() {
        return new InternationalIdentifier();
    }

    /**
     * Create an instance of {@link OverallPeriod }
     * 
     */
    public OverallPeriod createOverallPeriod() {
        return new OverallPeriod();
    }

    /**
     * Create an instance of {@link AlertCMethod2Linear }
     * 
     */
    public AlertCMethod2Linear createAlertCMethod2Linear() {
        return new AlertCMethod2Linear();
    }

    /**
     * Create an instance of {@link Restriction }
     * 
     */
    public Restriction createRestriction() {
        return new Restriction();
    }

    /**
     * Create an instance of {@link ManagedCause }
     * 
     */
    public ManagedCause createManagedCause() {
        return new ManagedCause();
    }

    /**
     * Create an instance of {@link LocationCharacteristicsOverride }
     * 
     */
    public LocationCharacteristicsOverride createLocationCharacteristicsOverride() {
        return new LocationCharacteristicsOverride();
    }

    /**
     * Create an instance of {@link CarParks }
     * 
     */
    public CarParks createCarParks() {
        return new CarParks();
    }

    /**
     * Create an instance of {@link ImpactDetails }
     * 
     */
    public ImpactDetails createImpactDetails() {
        return new ImpactDetails();
    }

    /**
     * Create an instance of {@link PrecipitationInformation }
     * 
     */
    public PrecipitationInformation createPrecipitationInformation() {
        return new PrecipitationInformation();
    }

    /**
     * Create an instance of {@link com.transportation.SIRI_IL.SOAP.Places }
     * 
     */
    public com.transportation.SIRI_IL.SOAP.Places createPlaces() {
        return new com.transportation.SIRI_IL.SOAP.Places();
    }

    /**
     * Create an instance of {@link LocationEnumerations }
     * 
     */
    public LocationEnumerations createLocationEnumerations() {
        return new LocationEnumerations();
    }

    /**
     * Create an instance of {@link Activities }
     * 
     */
    public Activities createActivities() {
        return new Activities();
    }

    /**
     * Create an instance of {@link Diversion }
     * 
     */
    public Diversion createDiversion() {
        return new Diversion();
    }

    /**
     * Create an instance of {@link DayWeekMonth }
     * 
     */
    public DayWeekMonth createDayWeekMonth() {
        return new DayWeekMonth();
    }

    /**
     * Create an instance of {@link IndividualVehicleMeasurements }
     * 
     */
    public IndividualVehicleMeasurements createIndividualVehicleMeasurements() {
        return new IndividualVehicleMeasurements();
    }

    /**
     * Create an instance of {@link Warnings }
     * 
     */
    public Warnings createWarnings() {
        return new Warnings();
    }

    /**
     * Create an instance of {@link Extension }
     * 
     */
    public Extension createExtension() {
        return new Extension();
    }

    /**
     * Create an instance of {@link General }
     * 
     */
    public General createGeneral() {
        return new General();
    }

    /**
     * Create an instance of {@link TrafficViewPublication }
     * 
     */
    public TrafficViewPublication createTrafficViewPublication() {
        return new TrafficViewPublication();
    }

    /**
     * Create an instance of {@link AreaDestination }
     * 
     */
    public AreaDestination createAreaDestination() {
        return new AreaDestination();
    }

    /**
     * Create an instance of {@link VehicleSpeed }
     * 
     */
    public VehicleSpeed createVehicleSpeed() {
        return new VehicleSpeed();
    }

    /**
     * Create an instance of {@link TrafficControl }
     * 
     */
    public TrafficControl createTrafficControl() {
        return new TrafficControl();
    }

    /**
     * Create an instance of {@link TPEGHeight }
     * 
     */
    public TPEGHeight createTPEGHeight() {
        return new TPEGHeight();
    }

    /**
     * Create an instance of {@link PointByCoordinates }
     * 
     */
    public PointByCoordinates createPointByCoordinates() {
        return new PointByCoordinates();
    }

    /**
     * Create an instance of {@link ReferencePointSecondaryLocation }
     * 
     */
    public ReferencePointSecondaryLocation createReferencePointSecondaryLocation() {
        return new ReferencePointSecondaryLocation();
    }

    /**
     * Create an instance of {@link TPEGFramedPoint }
     * 
     */
    public TPEGFramedPoint createTPEGFramedPoint() {
        return new TPEGFramedPoint();
    }

    /**
     * Create an instance of {@link Wind }
     * 
     */
    public Wind createWind() {
        return new Wind();
    }

    /**
     * Create an instance of {@link PollutionInformation }
     * 
     */
    public PollutionInformation createPollutionInformation() {
        return new PollutionInformation();
    }

    /**
     * Create an instance of {@link VariableMessageSignSetting }
     * 
     */
    public VariableMessageSignSetting createVariableMessageSignSetting() {
        return new VariableMessageSignSetting();
    }

    /**
     * Create an instance of {@link TrafficHeadway }
     * 
     */
    public TrafficHeadway createTrafficHeadway() {
        return new TrafficHeadway();
    }

    /**
     * Create an instance of {@link PoorRoadInfrastructure }
     * 
     */
    public PoorRoadInfrastructure createPoorRoadInfrastructure() {
        return new PoorRoadInfrastructure();
    }

    /**
     * Create an instance of {@link TPEGOtherPointDescriptor }
     * 
     */
    public TPEGOtherPointDescriptor createTPEGOtherPointDescriptor() {
        return new TPEGOtherPointDescriptor();
    }

    /**
     * Create an instance of {@link AlertCMethod2PrimaryPointLocation }
     * 
     */
    public AlertCMethod2PrimaryPointLocation createAlertCMethod2PrimaryPointLocation() {
        return new AlertCMethod2PrimaryPointLocation();
    }

    /**
     * Create an instance of {@link VehiclesInvolved }
     * 
     */
    public VehiclesInvolved createVehiclesInvolved() {
        return new VehiclesInvolved();
    }

    /**
     * Create an instance of {@link Subscription }
     * 
     */
    public Subscription createSubscription() {
        return new Subscription();
    }

    /**
     * Create an instance of {@link RoadSurfaceConditionInformation }
     * 
     */
    public RoadSurfaceConditionInformation createRoadSurfaceConditionInformation() {
        return new RoadSurfaceConditionInformation();
    }

    /**
     * Create an instance of {@link TrafficSpeed }
     * 
     */
    public TrafficSpeed createTrafficSpeed() {
        return new TrafficSpeed();
    }

    /**
     * Create an instance of {@link SituationPublication }
     * 
     */
    public SituationPublication createSituationPublication() {
        return new SituationPublication();
    }

    /**
     * Create an instance of {@link RoadSurfaceConditionMeasurements }
     * 
     */
    public RoadSurfaceConditionMeasurements createRoadSurfaceConditionMeasurements() {
        return new RoadSurfaceConditionMeasurements();
    }

    /**
     * Create an instance of {@link GeneralObstruction }
     * 
     */
    public GeneralObstruction createGeneralObstruction() {
        return new GeneralObstruction();
    }

    /**
     * Create an instance of {@link ServiceDisruption }
     * 
     */
    public ServiceDisruption createServiceDisruption() {
        return new ServiceDisruption();
    }

    /**
     * Create an instance of {@link AlertCMethod4PrimaryPointLocation }
     * 
     */
    public AlertCMethod4PrimaryPointLocation createAlertCMethod4PrimaryPointLocation() {
        return new AlertCMethod4PrimaryPointLocation();
    }

    /**
     * Create an instance of {@link VehicleHeadway }
     * 
     */
    public VehicleHeadway createVehicleHeadway() {
        return new VehicleHeadway();
    }

    /**
     * Create an instance of {@link TPEGNonJunctionPoint }
     * 
     */
    public TPEGNonJunctionPoint createTPEGNonJunctionPoint() {
        return new TPEGNonJunctionPoint();
    }

    /**
     * Create an instance of {@link LinearTrafficView }
     * 
     */
    public LinearTrafficView createLinearTrafficView() {
        return new LinearTrafficView();
    }

    /**
     * Create an instance of {@link HeaderInformation }
     * 
     */
    public HeaderInformation createHeaderInformation() {
        return new HeaderInformation();
    }

    /**
     * Create an instance of {@link SpeedPercentile }
     * 
     */
    public SpeedPercentile createSpeedPercentile() {
        return new SpeedPercentile();
    }

    /**
     * Create an instance of {@link TemporaryLimits }
     * 
     */
    public TemporaryLimits createTemporaryLimits() {
        return new TemporaryLimits();
    }

    /**
     * Create an instance of {@link TPEGAreaDescriptor }
     * 
     */
    public TPEGAreaDescriptor createTPEGAreaDescriptor() {
        return new TPEGAreaDescriptor();
    }

    /**
     * Create an instance of {@link TPEGLinearLocation }
     * 
     */
    public TPEGLinearLocation createTPEGLinearLocation() {
        return new TPEGLinearLocation();
    }

    /**
     * Create an instance of {@link WeatherRelated }
     * 
     */
    public WeatherRelated createWeatherRelated() {
        return new WeatherRelated();
    }

    /**
     * Create an instance of {@link NetworkManagement }
     * 
     */
    public NetworkManagement createNetworkManagement() {
        return new NetworkManagement();
    }

    /**
     * Create an instance of {@link Linear }
     * 
     */
    public Linear createLinear() {
        return new Linear();
    }

    /**
     * Create an instance of {@link VisibilityInformation }
     * 
     */
    public VisibilityInformation createVisibilityInformation() {
        return new VisibilityInformation();
    }

    /**
     * Create an instance of {@link CatalogueReference }
     * 
     */
    public CatalogueReference createCatalogueReference() {
        return new CatalogueReference();
    }

    /**
     * Create an instance of {@link WindInformation }
     * 
     */
    public WindInformation createWindInformation() {
        return new WindInformation();
    }

    /**
     * Create an instance of {@link VehicleCharacteristics }
     * 
     */
    public VehicleCharacteristics createVehicleCharacteristics() {
        return new VehicleCharacteristics();
    }

    /**
     * Create an instance of {@link TrafficFlow }
     * 
     */
    public TrafficFlow createTrafficFlow() {
        return new TrafficFlow();
    }

    /**
     * Create an instance of {@link DateTime }
     * 
     */
    public DateTime createDateTime() {
        return new DateTime();
    }

    /**
     * Create an instance of {@link Date }
     * 
     */
    public Date createDate() {
        return new Date();
    }

    /**
     * Create an instance of {@link AssociatedMaintenanceVehicles }
     * 
     */
    public AssociatedMaintenanceVehicles createAssociatedMaintenanceVehicles() {
        return new AssociatedMaintenanceVehicles();
    }

    /**
     * Create an instance of {@link OffsetDistance }
     * 
     */
    public OffsetDistance createOffsetDistance() {
        return new OffsetDistance();
    }

    /**
     * Create an instance of {@link MeasurementSiteTable }
     * 
     */
    public MeasurementSiteTable createMeasurementSiteTable() {
        return new MeasurementSiteTable();
    }

    /**
     * Create an instance of {@link NonWeatherRelatedRoadConditions }
     * 
     */
    public NonWeatherRelatedRoadConditions createNonWeatherRelatedRoadConditions() {
        return new NonWeatherRelatedRoadConditions();
    }

    /**
     * Create an instance of {@link FilterExitManagement }
     * 
     */
    public FilterExitManagement createFilterExitManagement() {
        return new FilterExitManagement();
    }

    /**
     * Create an instance of {@link FilterReference }
     * 
     */
    public FilterReference createFilterReference() {
        return new FilterReference();
    }

    /**
     * Create an instance of {@link AbnormalTraffic }
     * 
     */
    public AbnormalTraffic createAbnormalTraffic() {
        return new AbnormalTraffic();
    }

    /**
     * Create an instance of {@link Comment }
     * 
     */
    public Comment createComment() {
        return new Comment();
    }

    /**
     * Create an instance of {@link TPEGJunctionPointDescriptor }
     * 
     */
    public TPEGJunctionPointDescriptor createTPEGJunctionPointDescriptor() {
        return new TPEGJunctionPointDescriptor();
    }

    /**
     * Create an instance of {@link LifeCycleManagement }
     * 
     */
    public LifeCycleManagement createLifeCycleManagement() {
        return new LifeCycleManagement();
    }

    /**
     * Create an instance of {@link AlertCMethod4SecondaryPointLocation }
     * 
     */
    public AlertCMethod4SecondaryPointLocation createAlertCMethod4SecondaryPointLocation() {
        return new AlertCMethod4SecondaryPointLocation();
    }

    /**
     * Create an instance of {@link TravelTimeValue }
     * 
     */
    public TravelTimeValue createTravelTimeValue() {
        return new TravelTimeValue();
    }

    /**
     * Create an instance of {@link TPEGGeometricArea }
     * 
     */
    public TPEGGeometricArea createTPEGGeometricArea() {
        return new TPEGGeometricArea();
    }

    /**
     * Create an instance of {@link ConstructionWorks }
     * 
     */
    public ConstructionWorks createConstructionWorks() {
        return new ConstructionWorks();
    }

    /**
     * Create an instance of {@link Management }
     * 
     */
    public Management createManagement() {
        return new Management();
    }

    /**
     * Create an instance of {@link RoadsideAssistance }
     * 
     */
    public RoadsideAssistance createRoadsideAssistance() {
        return new RoadsideAssistance();
    }

    /**
     * Create an instance of {@link AlertCArea }
     * 
     */
    public AlertCArea createAlertCArea() {
        return new AlertCArea();
    }

    /**
     * Create an instance of {@link AlertCMethod2Point }
     * 
     */
    public AlertCMethod2Point createAlertCMethod2Point() {
        return new AlertCMethod2Point();
    }

    /**
     * Create an instance of {@link Time }
     * 
     */
    public Time createTime() {
        return new Time();
    }

    /**
     * Create an instance of {@link Target }
     * 
     */
    public Target createTarget() {
        return new Target();
    }

    /**
     * Create an instance of {@link Exchange }
     * 
     */
    public Exchange createExchange() {
        return new Exchange();
    }

    /**
     * Create an instance of {@link TimePeriodByHour }
     * 
     */
    public TimePeriodByHour createTimePeriodByHour() {
        return new TimePeriodByHour();
    }

    /**
     * Create an instance of {@link AlertCMethod2SecondaryPointLocation }
     * 
     */
    public AlertCMethod2SecondaryPointLocation createAlertCMethod2SecondaryPointLocation() {
        return new AlertCMethod2SecondaryPointLocation();
    }

    /**
     * Create an instance of {@link ReferencePointLinear }
     * 
     */
    public ReferencePointLinear createReferencePointLinear() {
        return new ReferencePointLinear();
    }

    /**
     * Create an instance of {@link LaneUsage }
     * 
     */
    public LaneUsage createLaneUsage() {
        return new LaneUsage();
    }

    /**
     * Create an instance of {@link TPEGSimplePoint }
     * 
     */
    public TPEGSimplePoint createTPEGSimplePoint() {
        return new TPEGSimplePoint();
    }

    /**
     * Create an instance of {@link ReferenceSettings }
     * 
     */
    public ReferenceSettings createReferenceSettings() {
        return new ReferenceSettings();
    }

    /**
     * Create an instance of {@link Validity }
     * 
     */
    public Validity createValidity() {
        return new Validity();
    }

    /**
     * Create an instance of {@link Temperature }
     * 
     */
    public Temperature createTemperature() {
        return new Temperature();
    }

    /**
     * Create an instance of {@link ExtensionType }
     * 
     */
    public ExtensionType createExtensionType() {
        return new ExtensionType();
    }

    /**
     * Create an instance of {@link MalfunctioningTrafficControls }
     * 
     */
    public MalfunctioningTrafficControls createMalfunctioningTrafficControls() {
        return new MalfunctioningTrafficControls();
    }

    /**
     * Create an instance of {@link ReusableClasses }
     * 
     */
    public ReusableClasses createReusableClasses() {
        return new ReusableClasses();
    }

    /**
     * Create an instance of {@link PredefinedLocationsPublication }
     * 
     */
    public PredefinedLocationsPublication createPredefinedLocationsPublication() {
        return new PredefinedLocationsPublication();
    }

    /**
     * Create an instance of {@link VehicleObstruction }
     * 
     */
    public VehicleObstruction createVehicleObstruction() {
        return new VehicleObstruction();
    }

    /**
     * Create an instance of {@link PollutionMeasurement }
     * 
     */
    public PollutionMeasurement createPollutionMeasurement() {
        return new PollutionMeasurement();
    }

    /**
     * Create an instance of {@link MeasuredDataPublication }
     * 
     */
    public MeasuredDataPublication createMeasuredDataPublication() {
        return new MeasuredDataPublication();
    }

    /**
     * Create an instance of {@link Person }
     * 
     */
    public Person createPerson() {
        return new Person();
    }

    /**
     * Create an instance of {@link CCTVImages }
     * 
     */
    public CCTVImages createCCTVImages() {
        return new CCTVImages();
    }

    /**
     * Create an instance of {@link ElaboratedDataPublication }
     * 
     */
    public ElaboratedDataPublication createElaboratedDataPublication() {
        return new ElaboratedDataPublication();
    }

    /**
     * Create an instance of {@link Area }
     * 
     */
    public Area createArea() {
        return new Area();
    }

    /**
     * Create an instance of {@link VehicleDetectionTime }
     * 
     */
    public VehicleDetectionTime createVehicleDetectionTime() {
        return new VehicleDetectionTime();
    }

    /**
     * Create an instance of {@link NumberOfAxlesCharacteristic }
     * 
     */
    public NumberOfAxlesCharacteristic createNumberOfAxlesCharacteristic() {
        return new NumberOfAxlesCharacteristic();
    }

    /**
     * Create an instance of {@link AxleSpacing }
     * 
     */
    public AxleSpacing createAxleSpacing() {
        return new AxleSpacing();
    }

    /**
     * Create an instance of {@link ManagementDescriptiveData }
     * 
     */
    public ManagementDescriptiveData createManagementDescriptiveData() {
        return new ManagementDescriptiveData();
    }

    /**
     * Create an instance of {@link TrafficViewRecord }
     * 
     */
    public TrafficViewRecord createTrafficViewRecord() {
        return new TrafficViewRecord();
    }

    /**
     * Create an instance of {@link MeasurementSiteTablePublication }
     * 
     */
    public MeasurementSiteTablePublication createMeasurementSiteTablePublication() {
        return new MeasurementSiteTablePublication();
    }

    /**
     * Create an instance of {@link TemperatureInformation }
     * 
     */
    public TemperatureInformation createTemperatureInformation() {
        return new TemperatureInformation();
    }

    /**
     * Create an instance of {@link Situation }
     * 
     */
    public Situation createSituation() {
        return new Situation();
    }

    /**
     * Create an instance of {@link PoorEnvironmentConditions }
     * 
     */
    public PoorEnvironmentConditions createPoorEnvironmentConditions() {
        return new PoorEnvironmentConditions();
    }

    /**
     * Create an instance of {@link AlertCMethod4Point }
     * 
     */
    public AlertCMethod4Point createAlertCMethod4Point() {
        return new AlertCMethod4Point();
    }

    /**
     * Create an instance of {@link Visibility }
     * 
     */
    public Visibility createVisibility() {
        return new Visibility();
    }

    /**
     * Create an instance of {@link EquipmentDamageObstruction }
     * 
     */
    public EquipmentDamageObstruction createEquipmentDamageObstruction() {
        return new EquipmentDamageObstruction();
    }

    /**
     * Create an instance of {@link Conditions }
     * 
     */
    public Conditions createConditions() {
        return new Conditions();
    }

    /**
     * Create an instance of {@link TrafficStatusValue }
     * 
     */
    public TrafficStatusValue createTrafficStatusValue() {
        return new TrafficStatusValue();
    }

    /**
     * Create an instance of {@link Mobility }
     * 
     */
    public Mobility createMobility() {
        return new Mobility();
    }

    /**
     * Create an instance of {@link AnimalPresenceObstruction }
     * 
     */
    public AnimalPresenceObstruction createAnimalPresenceObstruction() {
        return new AnimalPresenceObstruction();
    }

    /**
     * Create an instance of {@link AlertCMethod4Linear }
     * 
     */
    public AlertCMethod4Linear createAlertCMethod4Linear() {
        return new AlertCMethod4Linear();
    }

    /**
     * Create an instance of {@link ReferencePointPrimaryLocation }
     * 
     */
    public ReferencePointPrimaryLocation createReferencePointPrimaryLocation() {
        return new ReferencePointPrimaryLocation();
    }

    /**
     * Create an instance of {@link PointDestination }
     * 
     */
    public PointDestination createPointDestination() {
        return new PointDestination();
    }

    /**
     * Create an instance of {@link HeaviestAxleWeightCharacteristic }
     * 
     */
    public HeaviestAxleWeightCharacteristic createHeaviestAxleWeightCharacteristic() {
        return new HeaviestAxleWeightCharacteristic();
    }

    /**
     * Create an instance of {@link MaintenanceWorks }
     * 
     */
    public MaintenanceWorks createMaintenanceWorks() {
        return new MaintenanceWorks();
    }

    /**
     * Create an instance of {@link TPEGNamedOnlyArea }
     * 
     */
    public TPEGNamedOnlyArea createTPEGNamedOnlyArea() {
        return new TPEGNamedOnlyArea();
    }

    /**
     * Create an instance of {@link GroupOfLocations }
     * 
     */
    public GroupOfLocations createGroupOfLocations() {
        return new GroupOfLocations();
    }

    /**
     * Create an instance of {@link WinterDriving }
     * 
     */
    public WinterDriving createWinterDriving() {
        return new WinterDriving();
    }

    /**
     * Create an instance of {@link Accident }
     * 
     */
    public Accident createAccident() {
        return new Accident();
    }

    /**
     * Create an instance of {@link GroupOfLocationsByReference }
     * 
     */
    public GroupOfLocationsByReference createGroupOfLocationsByReference() {
        return new GroupOfLocationsByReference();
    }

    /**
     * Create an instance of {@link Impact }
     * 
     */
    public Impact createImpact() {
        return new Impact();
    }

    /**
     * Create an instance of {@link TrafficConcentration }
     * 
     */
    public TrafficConcentration createTrafficConcentration() {
        return new TrafficConcentration();
    }

    /**
     * Create an instance of {@link AlertCLinearByCode }
     * 
     */
    public AlertCLinearByCode createAlertCLinearByCode() {
        return new AlertCLinearByCode();
    }

    /**
     * Create an instance of {@link EnvironmentalObstruction }
     * 
     */
    public EnvironmentalObstruction createEnvironmentalObstruction() {
        return new EnvironmentalObstruction();
    }

    /**
     * Create an instance of {@link SubjectTypeOfWorks }
     * 
     */
    public SubjectTypeOfWorks createSubjectTypeOfWorks() {
        return new SubjectTypeOfWorks();
    }

    /**
     * Create an instance of {@link HeightCharacteristic }
     * 
     */
    public HeightCharacteristic createHeightCharacteristic() {
        return new HeightCharacteristic();
    }

    /**
     * Create an instance of {@link GrossWeightCharacteristic }
     * 
     */
    public GrossWeightCharacteristic createGrossWeightCharacteristic() {
        return new GrossWeightCharacteristic();
    }

    /**
     * Create an instance of {@link AccessibilityStructure }
     * 
     */
    public AccessibilityStructure createAccessibilityStructure() {
        return new AccessibilityStructure();
    }

    /**
     * Create an instance of {@link LimitationRefStructure }
     * 
     */
    public LimitationRefStructure createLimitationRefStructure() {
        return new LimitationRefStructure();
    }

    /**
     * Create an instance of {@link PassengerAccessibilityNeedsStructure }
     * 
     */
    public PassengerAccessibilityNeedsStructure createPassengerAccessibilityNeedsStructure() {
        return new PassengerAccessibilityNeedsStructure();
    }

    /**
     * Create an instance of {@link SuitabilityStructure }
     * 
     */
    public SuitabilityStructure createSuitabilityStructure() {
        return new SuitabilityStructure();
    }

    /**
     * Create an instance of {@link AccessibilityLimitationStructure }
     * 
     */
    public AccessibilityLimitationStructure createAccessibilityLimitationStructure() {
        return new AccessibilityLimitationStructure();
    }

    /**
     * Create an instance of {@link UserNeedStructure }
     * 
     */
    public UserNeedStructure createUserNeedStructure() {
        return new UserNeedStructure();
    }

    /**
     * Create an instance of {@link AccessibilityAssessmentStructure.Limitations }
     * 
     */
    public AccessibilityAssessmentStructure.Limitations createAccessibilityAssessmentStructureLimitations() {
        return new AccessibilityAssessmentStructure.Limitations();
    }

    /**
     * Create an instance of {@link AccessibilityAssessmentStructure.Suitabilities }
     * 
     */
    public AccessibilityAssessmentStructure.Suitabilities createAccessibilityAssessmentStructureSuitabilities() {
        return new AccessibilityAssessmentStructure.Suitabilities();
    }

    /**
     * Create an instance of {@link com.transportation.SIRI_IL.SOAP.BasicDataValue.FaultReason.Value }
     * 
     */
    public com.transportation.SIRI_IL.SOAP.BasicDataValue.FaultReason.Value createBasicDataValueFaultReasonValue() {
        return new com.transportation.SIRI_IL.SOAP.BasicDataValue.FaultReason.Value();
    }

    /**
     * Create an instance of {@link com.transportation.SIRI_IL.SOAP.SignSetting.SetBy.Value }
     * 
     */
    public com.transportation.SIRI_IL.SOAP.SignSetting.SetBy.Value createSignSettingSetByValue() {
        return new com.transportation.SIRI_IL.SOAP.SignSetting.SetBy.Value();
    }

    /**
     * Create an instance of {@link com.transportation.SIRI_IL.SOAP.SignSetting.ReasonForSetting.Value }
     * 
     */
    public com.transportation.SIRI_IL.SOAP.SignSetting.ReasonForSetting.Value createSignSettingReasonForSettingValue() {
        return new com.transportation.SIRI_IL.SOAP.SignSetting.ReasonForSetting.Value();
    }

    /**
     * Create an instance of {@link com.transportation.SIRI_IL.SOAP.TPEGDescriptor.Descriptor.Value }
     * 
     */
    public com.transportation.SIRI_IL.SOAP.TPEGDescriptor.Descriptor.Value createTPEGDescriptorDescriptorValue() {
        return new com.transportation.SIRI_IL.SOAP.TPEGDescriptor.Descriptor.Value();
    }

    /**
     * Create an instance of {@link SourceInformation.SourceName.Value }
     * 
     */
    public SourceInformation.SourceName.Value createSourceInformationSourceNameValue() {
        return new SourceInformation.SourceName.Value();
    }

    /**
     * Create an instance of {@link TransitInformation.JourneyOrigin.Value }
     * 
     */
    public TransitInformation.JourneyOrigin.Value createTransitInformationJourneyOriginValue() {
        return new TransitInformation.JourneyOrigin.Value();
    }

    /**
     * Create an instance of {@link TransitInformation.JourneyDestination.Value }
     * 
     */
    public TransitInformation.JourneyDestination.Value createTransitInformationJourneyDestinationValue() {
        return new TransitInformation.JourneyDestination.Value();
    }

    /**
     * Create an instance of {@link MeasurementSiteRecord.MeasurementSpecificCharacteristics }
     * 
     */
    public MeasurementSiteRecord.MeasurementSpecificCharacteristics createMeasurementSiteRecordMeasurementSpecificCharacteristics() {
        return new MeasurementSiteRecord.MeasurementSpecificCharacteristics();
    }

    /**
     * Create an instance of {@link MeasurementSiteRecord.MeasurementSiteName.Value }
     * 
     */
    public MeasurementSiteRecord.MeasurementSiteName.Value createMeasurementSiteRecordMeasurementSiteNameValue() {
        return new MeasurementSiteRecord.MeasurementSiteName.Value();
    }

    /**
     * Create an instance of {@link MeasurementSiteRecord.MeasurementEquipmentTypeUsed.Value }
     * 
     */
    public MeasurementSiteRecord.MeasurementEquipmentTypeUsed.Value createMeasurementSiteRecordMeasurementEquipmentTypeUsedValue() {
        return new MeasurementSiteRecord.MeasurementEquipmentTypeUsed.Value();
    }

    /**
     * Create an instance of {@link AlertCLocation.AlertCLocationName.Value }
     * 
     */
    public AlertCLocation.AlertCLocationName.Value createAlertCLocationAlertCLocationNameValue() {
        return new AlertCLocation.AlertCLocationName.Value();
    }

    /**
     * Create an instance of {@link PredefinedLocation.PredefinedLocationName.Value }
     * 
     */
    public PredefinedLocation.PredefinedLocationName.Value createPredefinedLocationPredefinedLocationNameValue() {
        return new PredefinedLocation.PredefinedLocationName.Value();
    }

    /**
     * Create an instance of {@link com.transportation.SIRI_IL.SOAP.MeasuredValue.MeasurementEquipmentTypeUsed.Value }
     * 
     */
    public com.transportation.SIRI_IL.SOAP.MeasuredValue.MeasurementEquipmentTypeUsed.Value createMeasuredValueMeasurementEquipmentTypeUsedValue() {
        return new com.transportation.SIRI_IL.SOAP.MeasuredValue.MeasurementEquipmentTypeUsed.Value();
    }

    /**
     * Create an instance of {@link Vehicle.VehicleCountryOfOrigin.Value }
     * 
     */
    public Vehicle.VehicleCountryOfOrigin.Value createVehicleVehicleCountryOfOriginValue() {
        return new Vehicle.VehicleCountryOfOrigin.Value();
    }

    /**
     * Create an instance of {@link Vehicle.VehicleColour.Value }
     * 
     */
    public Vehicle.VehicleColour.Value createVehicleVehicleColourValue() {
        return new Vehicle.VehicleColour.Value();
    }

    /**
     * Create an instance of {@link SiteMeasurements.MeasuredValue }
     * 
     */
    public SiteMeasurements.MeasuredValue createSiteMeasurementsMeasuredValue() {
        return new SiteMeasurements.MeasuredValue();
    }

    /**
     * Create an instance of {@link AlertCDirection.AlertCDirectionNamed.Value }
     * 
     */
    public AlertCDirection.AlertCDirectionNamed.Value createAlertCDirectionAlertCDirectionNamedValue() {
        return new AlertCDirection.AlertCDirectionNamed.Value();
    }

    /**
     * Create an instance of {@link HazardousMaterials.ChemicalName.Value }
     * 
     */
    public HazardousMaterials.ChemicalName.Value createHazardousMaterialsChemicalNameValue() {
        return new HazardousMaterials.ChemicalName.Value();
    }

    /**
     * Create an instance of {@link Period.PeriodName.Value }
     * 
     */
    public Period.PeriodName.Value createPeriodPeriodNameValue() {
        return new Period.PeriodName.Value();
    }

    /**
     * Create an instance of {@link Rerouting.ReroutingItineraryDescription.Value }
     * 
     */
    public Rerouting.ReroutingItineraryDescription.Value createReroutingReroutingItineraryDescriptionValue() {
        return new Rerouting.ReroutingItineraryDescription.Value();
    }

    /**
     * Create an instance of {@link ReferencePoint.ReferencePointDescription.Value }
     * 
     */
    public ReferencePoint.ReferencePointDescription.Value createReferencePointReferencePointDescriptionValue() {
        return new ReferencePoint.ReferencePointDescription.Value();
    }

    /**
     * Create an instance of {@link ReferencePoint.RoadName.Value }
     * 
     */
    public ReferencePoint.RoadName.Value createReferencePointRoadNameValue() {
        return new ReferencePoint.RoadName.Value();
    }

    /**
     * Create an instance of {@link ReferencePoint.AdministrativeArea.Value }
     * 
     */
    public ReferencePoint.AdministrativeArea.Value createReferencePointAdministrativeAreaValue() {
        return new ReferencePoint.AdministrativeArea.Value();
    }

    /**
     * Create an instance of {@link PredefinedLocationSet.PredefinedLocationSetName.Value }
     * 
     */
    public PredefinedLocationSet.PredefinedLocationSetName.Value createPredefinedLocationSetPredefinedLocationSetNameValue() {
        return new PredefinedLocationSet.PredefinedLocationSetName.Value();
    }

    /**
     * Create an instance of {@link NonManagedCause.CauseDescription.Value }
     * 
     */
    public NonManagedCause.CauseDescription.Value createNonManagedCauseCauseDescriptionValue() {
        return new NonManagedCause.CauseDescription.Value();
    }

    /**
     * Create an instance of {@link AbstractProjection.Features }
     * 
     */
    public AbstractProjection.Features createAbstractProjectionFeatures() {
        return new AbstractProjection.Features();
    }

    /**
     * Create an instance of {@link ValidityConditionStructure.Timebands }
     * 
     */
    public ValidityConditionStructure.Timebands createValidityConditionStructureTimebands() {
        return new ValidityConditionStructure.Timebands();
    }

    /**
     * Create an instance of {@link LinkProjectionStructure.Line }
     * 
     */
    public LinkProjectionStructure.Line createLinkProjectionStructureLine() {
        return new LinkProjectionStructure.Line();
    }

    /**
     * Create an instance of {@link ZoneProjectionStructure.Boundary }
     * 
     */
    public ZoneProjectionStructure.Boundary createZoneProjectionStructureBoundary() {
        return new ZoneProjectionStructure.Boundary();
    }

    /**
     * Create an instance of {@link LocalServiceStructure.FeatureRefs }
     * 
     */
    public LocalServiceStructure.FeatureRefs createLocalServiceStructureFeatureRefs() {
        return new LocalServiceStructure.FeatureRefs();
    }

    /**
     * Create an instance of {@link PtConsequenceStructure.Suitabilities }
     * 
     */
    public PtConsequenceStructure.Suitabilities createPtConsequenceStructureSuitabilities() {
        return new PtConsequenceStructure.Suitabilities();
    }

    /**
     * Create an instance of {@link StopMonitoringFilterStructure.MaximumNumberOfCalls }
     * 
     */
    public StopMonitoringFilterStructure.MaximumNumberOfCalls createStopMonitoringFilterStructureMaximumNumberOfCalls() {
        return new StopMonitoringFilterStructure.MaximumNumberOfCalls();
    }

    /**
     * Create an instance of {@link FacilityStructure.Features }
     * 
     */
    public FacilityStructure.Features createFacilityStructureFeatures() {
        return new FacilityStructure.Features();
    }

    /**
     * Create an instance of {@link FacilityStructure.Limitations }
     * 
     */
    public FacilityStructure.Limitations createFacilityStructureLimitations() {
        return new FacilityStructure.Limitations();
    }

    /**
     * Create an instance of {@link FacilityStructure.Suitabilities }
     * 
     */
    public FacilityStructure.Suitabilities createFacilityStructureSuitabilities() {
        return new FacilityStructure.Suitabilities();
    }

    /**
     * Create an instance of {@link EquipmentAvailabilityStructure.EquipmentFeatures }
     * 
     */
    public EquipmentAvailabilityStructure.EquipmentFeatures createEquipmentAvailabilityStructureEquipmentFeatures() {
        return new EquipmentAvailabilityStructure.EquipmentFeatures();
    }

    /**
     * Create an instance of {@link AnnotatedLineStructure.Destinations }
     * 
     */
    public AnnotatedLineStructure.Destinations createAnnotatedLineStructureDestinations() {
        return new AnnotatedLineStructure.Destinations();
    }

    /**
     * Create an instance of {@link AnnotatedLineStructure.Directions }
     * 
     */
    public AnnotatedLineStructure.Directions createAnnotatedLineStructureDirections() {
        return new AnnotatedLineStructure.Directions();
    }

    /**
     * Create an instance of {@link CapabilityGeneralInteractionStructure.Interaction }
     * 
     */
    public CapabilityGeneralInteractionStructure.Interaction createCapabilityGeneralInteractionStructureInteraction() {
        return new CapabilityGeneralInteractionStructure.Interaction();
    }

    /**
     * Create an instance of {@link CapabilityGeneralInteractionStructure.Delivery }
     * 
     */
    public CapabilityGeneralInteractionStructure.Delivery createCapabilityGeneralInteractionStructureDelivery() {
        return new CapabilityGeneralInteractionStructure.Delivery();
    }

    /**
     * Create an instance of {@link AffectedRouteStructure.Sections }
     * 
     */
    public AffectedRouteStructure.Sections createAffectedRouteStructureSections() {
        return new AffectedRouteStructure.Sections();
    }

    /**
     * Create an instance of {@link AffectedRouteStructure.RouteLinks }
     * 
     */
    public AffectedRouteStructure.RouteLinks createAffectedRouteStructureRouteLinks() {
        return new AffectedRouteStructure.RouteLinks();
    }

    /**
     * Create an instance of {@link AbstractPermissionStructure.GeneralCapabilities }
     * 
     */
    public AbstractPermissionStructure.GeneralCapabilities createAbstractPermissionStructureGeneralCapabilities() {
        return new AbstractPermissionStructure.GeneralCapabilities();
    }

    /**
     * Create an instance of {@link AffectedVehicleJourneyStructure.Calls }
     * 
     */
    public AffectedVehicleJourneyStructure.Calls createAffectedVehicleJourneyStructureCalls() {
        return new AffectedVehicleJourneyStructure.Calls();
    }

    /**
     * Create an instance of {@link AffectsScopeStructure.Operators }
     * 
     */
    public AffectsScopeStructure.Operators createAffectsScopeStructureOperators() {
        return new AffectsScopeStructure.Operators();
    }

    /**
     * Create an instance of {@link AffectsScopeStructure.StopPoints }
     * 
     */
    public AffectsScopeStructure.StopPoints createAffectsScopeStructureStopPoints() {
        return new AffectsScopeStructure.StopPoints();
    }

    /**
     * Create an instance of {@link AffectsScopeStructure.StopPlaces }
     * 
     */
    public AffectsScopeStructure.StopPlaces createAffectsScopeStructureStopPlaces() {
        return new AffectsScopeStructure.StopPlaces();
    }

    /**
     * Create an instance of {@link AffectsScopeStructure.Places }
     * 
     */
    public AffectsScopeStructure.Places createAffectsScopeStructurePlaces() {
        return new AffectsScopeStructure.Places();
    }

    /**
     * Create an instance of {@link AffectsScopeStructure.VehicleJourneys }
     * 
     */
    public AffectsScopeStructure.VehicleJourneys createAffectsScopeStructureVehicleJourneys() {
        return new AffectsScopeStructure.VehicleJourneys();
    }

    /**
     * Create an instance of {@link AffectsScopeStructure.Networks.AffectedNetwork }
     * 
     */
    public AffectsScopeStructure.Networks.AffectedNetwork createAffectsScopeStructureNetworksAffectedNetwork() {
        return new AffectsScopeStructure.Networks.AffectedNetwork();
    }

    /**
     * Create an instance of {@link AnnotatedStopPointStructure.Features }
     * 
     */
    public AnnotatedStopPointStructure.Features createAnnotatedStopPointStructureFeatures() {
        return new AnnotatedStopPointStructure.Features();
    }

    /**
     * Create an instance of {@link AnnotatedStopPointStructure.Lines }
     * 
     */
    public AnnotatedStopPointStructure.Lines createAnnotatedStopPointStructureLines() {
        return new AnnotatedStopPointStructure.Lines();
    }

    /**
     * Create an instance of {@link CheckStatusResponseBodyStructure.ErrorCondition }
     * 
     */
    public CheckStatusResponseBodyStructure.ErrorCondition createCheckStatusResponseBodyStructureErrorCondition() {
        return new CheckStatusResponseBodyStructure.ErrorCondition();
    }

    /**
     * Create an instance of {@link ConnectionMonitoringServiceCapabilitiesStructure.TopicFiltering }
     * 
     */
    public ConnectionMonitoringServiceCapabilitiesStructure.TopicFiltering createConnectionMonitoringServiceCapabilitiesStructureTopicFiltering() {
        return new ConnectionMonitoringServiceCapabilitiesStructure.TopicFiltering();
    }

    /**
     * Create an instance of {@link ConnectionMonitoringServiceCapabilitiesStructure.RequestPolicy }
     * 
     */
    public ConnectionMonitoringServiceCapabilitiesStructure.RequestPolicy createConnectionMonitoringServiceCapabilitiesStructureRequestPolicy() {
        return new ConnectionMonitoringServiceCapabilitiesStructure.RequestPolicy();
    }

    /**
     * Create an instance of {@link AffectedLineStructure.Routes }
     * 
     */
    public AffectedLineStructure.Routes createAffectedLineStructureRoutes() {
        return new AffectedLineStructure.Routes();
    }

    /**
     * Create an instance of {@link AffectedLineStructure.Sections }
     * 
     */
    public AffectedLineStructure.Sections createAffectedLineStructureSections() {
        return new AffectedLineStructure.Sections();
    }

    /**
     * Create an instance of {@link AffectedModesStructure.Mode }
     * 
     */
    public AffectedModesStructure.Mode createAffectedModesStructureMode() {
        return new AffectedModesStructure.Mode();
    }

    /**
     * Create an instance of {@link VehicleActivityStructure.MonitoredVehicleJourney }
     * 
     */
    public VehicleActivityStructure.MonitoredVehicleJourney createVehicleActivityStructureMonitoredVehicleJourney() {
        return new VehicleActivityStructure.MonitoredVehicleJourney();
    }

    /**
     * Create an instance of {@link AffectedStopPointStructure.ConnectionLinks }
     * 
     */
    public AffectedStopPointStructure.ConnectionLinks createAffectedStopPointStructureConnectionLinks() {
        return new AffectedStopPointStructure.ConnectionLinks();
    }

    /**
     * Create an instance of {@link AffectedStopPlaceStructure.AffectedComponents }
     * 
     */
    public AffectedStopPlaceStructure.AffectedComponents createAffectedStopPlaceStructureAffectedComponents() {
        return new AffectedStopPlaceStructure.AffectedComponents();
    }

    /**
     * Create an instance of {@link AffectedStopPlaceStructure.AffectedNavigationPaths }
     * 
     */
    public AffectedStopPlaceStructure.AffectedNavigationPaths createAffectedStopPlaceStructureAffectedNavigationPaths() {
        return new AffectedStopPlaceStructure.AffectedNavigationPaths();
    }

    /**
     * Create an instance of {@link PushedActionStructure.BeforeNotices }
     * 
     */
    public PushedActionStructure.BeforeNotices createPushedActionStructureBeforeNotices() {
        return new PushedActionStructure.BeforeNotices();
    }

    /**
     * Create an instance of {@link GeneralMessageServicePermissionStructure.InfoChannelPermissions }
     * 
     */
    public GeneralMessageServicePermissionStructure.InfoChannelPermissions createGeneralMessageServicePermissionStructureInfoChannelPermissions() {
        return new GeneralMessageServicePermissionStructure.InfoChannelPermissions();
    }

    /**
     * Create an instance of {@link EstimatedTimetableServiceCapabilitiesStructure.TopicFiltering }
     * 
     */
    public EstimatedTimetableServiceCapabilitiesStructure.TopicFiltering createEstimatedTimetableServiceCapabilitiesStructureTopicFiltering() {
        return new EstimatedTimetableServiceCapabilitiesStructure.TopicFiltering();
    }

    /**
     * Create an instance of {@link EstimatedTimetableServiceCapabilitiesStructure.RequestPolicy }
     * 
     */
    public EstimatedTimetableServiceCapabilitiesStructure.RequestPolicy createEstimatedTimetableServiceCapabilitiesStructureRequestPolicy() {
        return new EstimatedTimetableServiceCapabilitiesStructure.RequestPolicy();
    }

    /**
     * Create an instance of {@link RoadSituationElementStructure.ValidityPeriod }
     * 
     */
    public RoadSituationElementStructure.ValidityPeriod createRoadSituationElementStructureValidityPeriod() {
        return new RoadSituationElementStructure.ValidityPeriod();
    }

    /**
     * Create an instance of {@link RoadSituationElementStructure.Repetitions }
     * 
     */
    public RoadSituationElementStructure.Repetitions createRoadSituationElementStructureRepetitions() {
        return new RoadSituationElementStructure.Repetitions();
    }

    /**
     * Create an instance of {@link RoadSituationElementStructure.InfoLinks }
     * 
     */
    public RoadSituationElementStructure.InfoLinks createRoadSituationElementStructureInfoLinks() {
        return new RoadSituationElementStructure.InfoLinks();
    }

    /**
     * Create an instance of {@link RoadSituationElementStructure.Images.Image }
     * 
     */
    public RoadSituationElementStructure.Images.Image createRoadSituationElementStructureImagesImage() {
        return new RoadSituationElementStructure.Images.Image();
    }

    /**
     * Create an instance of {@link RoadSituationElementStructure.SecondaryReasons.Reason }
     * 
     */
    public RoadSituationElementStructure.SecondaryReasons.Reason createRoadSituationElementStructureSecondaryReasonsReason() {
        return new RoadSituationElementStructure.SecondaryReasons.Reason();
    }

    /**
     * Create an instance of {@link StopMonitoringServiceCapabilitiesStructure.TopicFiltering }
     * 
     */
    public StopMonitoringServiceCapabilitiesStructure.TopicFiltering createStopMonitoringServiceCapabilitiesStructureTopicFiltering() {
        return new StopMonitoringServiceCapabilitiesStructure.TopicFiltering();
    }

    /**
     * Create an instance of {@link StopMonitoringServiceCapabilitiesStructure.RequestPolicy }
     * 
     */
    public StopMonitoringServiceCapabilitiesStructure.RequestPolicy createStopMonitoringServiceCapabilitiesStructureRequestPolicy() {
        return new StopMonitoringServiceCapabilitiesStructure.RequestPolicy();
    }

    /**
     * Create an instance of {@link StopMonitoringServiceCapabilitiesStructure.ResponseFeatures }
     * 
     */
    public StopMonitoringServiceCapabilitiesStructure.ResponseFeatures createStopMonitoringServiceCapabilitiesStructureResponseFeatures() {
        return new StopMonitoringServiceCapabilitiesStructure.ResponseFeatures();
    }

    /**
     * Create an instance of {@link SituationExchangeServiceCapabilitiesStructure.TopicFiltering }
     * 
     */
    public SituationExchangeServiceCapabilitiesStructure.TopicFiltering createSituationExchangeServiceCapabilitiesStructureTopicFiltering() {
        return new SituationExchangeServiceCapabilitiesStructure.TopicFiltering();
    }

    /**
     * Create an instance of {@link SituationExchangeServiceCapabilitiesStructure.RequestPolicy }
     * 
     */
    public SituationExchangeServiceCapabilitiesStructure.RequestPolicy createSituationExchangeServiceCapabilitiesStructureRequestPolicy() {
        return new SituationExchangeServiceCapabilitiesStructure.RequestPolicy();
    }

    /**
     * Create an instance of {@link SituationExchangeServiceCapabilitiesStructure.AccessControl }
     * 
     */
    public SituationExchangeServiceCapabilitiesStructure.AccessControl createSituationExchangeServiceCapabilitiesStructureAccessControl() {
        return new SituationExchangeServiceCapabilitiesStructure.AccessControl();
    }

    /**
     * Create an instance of {@link SituationExchangeServiceCapabilitiesStructure.ResponseFeatures }
     * 
     */
    public SituationExchangeServiceCapabilitiesStructure.ResponseFeatures createSituationExchangeServiceCapabilitiesStructureResponseFeatures() {
        return new SituationExchangeServiceCapabilitiesStructure.ResponseFeatures();
    }

    /**
     * Create an instance of {@link EstimatedVehicleJourneyStructure.EstimatedCalls }
     * 
     */
    public EstimatedVehicleJourneyStructure.EstimatedCalls createEstimatedVehicleJourneyStructureEstimatedCalls() {
        return new EstimatedVehicleJourneyStructure.EstimatedCalls();
    }

    /**
     * Create an instance of {@link GeneralMessageServiceCapabilitiesStructure.TopicFiltering }
     * 
     */
    public GeneralMessageServiceCapabilitiesStructure.TopicFiltering createGeneralMessageServiceCapabilitiesStructureTopicFiltering() {
        return new GeneralMessageServiceCapabilitiesStructure.TopicFiltering();
    }

    /**
     * Create an instance of {@link DataReceivedResponseStructure.ErrorCondition }
     * 
     */
    public DataReceivedResponseStructure.ErrorCondition createDataReceivedResponseStructureErrorCondition() {
        return new DataReceivedResponseStructure.ErrorCondition();
    }

    /**
     * Create an instance of {@link DataReadyResponseStructure.ErrorCondition }
     * 
     */
    public DataReadyResponseStructure.ErrorCondition createDataReadyResponseStructureErrorCondition() {
        return new DataReadyResponseStructure.ErrorCondition();
    }

    /**
     * Create an instance of {@link TerminateSubscriptionResponseStructure.TerminationResponseStatus.ErrorCondition }
     * 
     */
    public TerminateSubscriptionResponseStructure.TerminationResponseStatus.ErrorCondition createTerminateSubscriptionResponseStructureTerminationResponseStatusErrorCondition() {
        return new TerminateSubscriptionResponseStructure.TerminationResponseStatus.ErrorCondition();
    }

    /**
     * Create an instance of {@link EstimatedTimetableRequestStructure.Lines }
     * 
     */
    public EstimatedTimetableRequestStructure.Lines createEstimatedTimetableRequestStructureLines() {
        return new EstimatedTimetableRequestStructure.Lines();
    }

    /**
     * Create an instance of {@link StopTimetableServiceCapabilitiesStructure.TopicFiltering }
     * 
     */
    public StopTimetableServiceCapabilitiesStructure.TopicFiltering createStopTimetableServiceCapabilitiesStructureTopicFiltering() {
        return new StopTimetableServiceCapabilitiesStructure.TopicFiltering();
    }

    /**
     * Create an instance of {@link StopTimetableServiceCapabilitiesStructure.AccessControl }
     * 
     */
    public StopTimetableServiceCapabilitiesStructure.AccessControl createStopTimetableServiceCapabilitiesStructureAccessControl() {
        return new StopTimetableServiceCapabilitiesStructure.AccessControl();
    }

    /**
     * Create an instance of {@link SituationExchangeDeliveryStructure.Situations }
     * 
     */
    public SituationExchangeDeliveryStructure.Situations createSituationExchangeDeliveryStructureSituations() {
        return new SituationExchangeDeliveryStructure.Situations();
    }

    /**
     * Create an instance of {@link FacilityMonitoringServiceCapabilitiesStructure.TopicFiltering }
     * 
     */
    public FacilityMonitoringServiceCapabilitiesStructure.TopicFiltering createFacilityMonitoringServiceCapabilitiesStructureTopicFiltering() {
        return new FacilityMonitoringServiceCapabilitiesStructure.TopicFiltering();
    }

    /**
     * Create an instance of {@link FacilityMonitoringServiceCapabilitiesStructure.RequestPolicy }
     * 
     */
    public FacilityMonitoringServiceCapabilitiesStructure.RequestPolicy createFacilityMonitoringServiceCapabilitiesStructureRequestPolicy() {
        return new FacilityMonitoringServiceCapabilitiesStructure.RequestPolicy();
    }

    /**
     * Create an instance of {@link FacilityMonitoringServiceCapabilitiesStructure.AccessControl }
     * 
     */
    public FacilityMonitoringServiceCapabilitiesStructure.AccessControl createFacilityMonitoringServiceCapabilitiesStructureAccessControl() {
        return new FacilityMonitoringServiceCapabilitiesStructure.AccessControl();
    }

    /**
     * Create an instance of {@link FacilityMonitoringServiceCapabilitiesStructure.ResponseFeatures }
     * 
     */
    public FacilityMonitoringServiceCapabilitiesStructure.ResponseFeatures createFacilityMonitoringServiceCapabilitiesStructureResponseFeatures() {
        return new FacilityMonitoringServiceCapabilitiesStructure.ResponseFeatures();
    }

    /**
     * Create an instance of {@link SituationExchangeRequestStructure.SituationRoadFilter }
     * 
     */
    public SituationExchangeRequestStructure.SituationRoadFilter createSituationExchangeRequestStructureSituationRoadFilter() {
        return new SituationExchangeRequestStructure.SituationRoadFilter();
    }

    /**
     * Create an instance of {@link ConnectionTimetableCapabilitiesResponseStructure.ConnectionTimetablePermissions }
     * 
     */
    public ConnectionTimetableCapabilitiesResponseStructure.ConnectionTimetablePermissions createConnectionTimetableCapabilitiesResponseStructureConnectionTimetablePermissions() {
        return new ConnectionTimetableCapabilitiesResponseStructure.ConnectionTimetablePermissions();
    }

    /**
     * Create an instance of {@link ProductionTimetableRequestStructure.Lines }
     * 
     */
    public ProductionTimetableRequestStructure.Lines createProductionTimetableRequestStructureLines() {
        return new ProductionTimetableRequestStructure.Lines();
    }

    /**
     * Create an instance of {@link StopMonitoringServicePermissionStructure.StopMonitorPermissions }
     * 
     */
    public StopMonitoringServicePermissionStructure.StopMonitorPermissions createStopMonitoringServicePermissionStructureStopMonitorPermissions() {
        return new StopMonitoringServicePermissionStructure.StopMonitorPermissions();
    }

    /**
     * Create an instance of {@link VehicleMonitoringServicePermissionStructure.VehicleMonitoringPermissions }
     * 
     */
    public VehicleMonitoringServicePermissionStructure.VehicleMonitoringPermissions createVehicleMonitoringServicePermissionStructureVehicleMonitoringPermissions() {
        return new VehicleMonitoringServicePermissionStructure.VehicleMonitoringPermissions();
    }

    /**
     * Create an instance of {@link ProductionTimetableServiceCapabilitiesStructure.TopicFiltering }
     * 
     */
    public ProductionTimetableServiceCapabilitiesStructure.TopicFiltering createProductionTimetableServiceCapabilitiesStructureTopicFiltering() {
        return new ProductionTimetableServiceCapabilitiesStructure.TopicFiltering();
    }

    /**
     * Create an instance of {@link ProductionTimetableServiceCapabilitiesStructure.RequestPolicy }
     * 
     */
    public ProductionTimetableServiceCapabilitiesStructure.RequestPolicy createProductionTimetableServiceCapabilitiesStructureRequestPolicy() {
        return new ProductionTimetableServiceCapabilitiesStructure.RequestPolicy();
    }

    /**
     * Create an instance of {@link ProductionTimetableServiceCapabilitiesStructure.SubscriptionPolicy }
     * 
     */
    public ProductionTimetableServiceCapabilitiesStructure.SubscriptionPolicy createProductionTimetableServiceCapabilitiesStructureSubscriptionPolicy() {
        return new ProductionTimetableServiceCapabilitiesStructure.SubscriptionPolicy();
    }

    /**
     * Create an instance of {@link DatedVehicleJourneyStructure.DatedCalls }
     * 
     */
    public DatedVehicleJourneyStructure.DatedCalls createDatedVehicleJourneyStructureDatedCalls() {
        return new DatedVehicleJourneyStructure.DatedCalls();
    }

    /**
     * Create an instance of {@link ConnectionTimetableServiceCapabilitiesStructure.TopicFiltering }
     * 
     */
    public ConnectionTimetableServiceCapabilitiesStructure.TopicFiltering createConnectionTimetableServiceCapabilitiesStructureTopicFiltering() {
        return new ConnectionTimetableServiceCapabilitiesStructure.TopicFiltering();
    }

    /**
     * Create an instance of {@link ConnectionTimetableServiceCapabilitiesStructure.RequestPolicy }
     * 
     */
    public ConnectionTimetableServiceCapabilitiesStructure.RequestPolicy createConnectionTimetableServiceCapabilitiesStructureRequestPolicy() {
        return new ConnectionTimetableServiceCapabilitiesStructure.RequestPolicy();
    }

    /**
     * Create an instance of {@link VehicleMonitoringServiceCapabilitiesStructure.TopicFiltering }
     * 
     */
    public VehicleMonitoringServiceCapabilitiesStructure.TopicFiltering createVehicleMonitoringServiceCapabilitiesStructureTopicFiltering() {
        return new VehicleMonitoringServiceCapabilitiesStructure.TopicFiltering();
    }

    /**
     * Create an instance of {@link VehicleMonitoringServiceCapabilitiesStructure.RequestPolicy }
     * 
     */
    public VehicleMonitoringServiceCapabilitiesStructure.RequestPolicy createVehicleMonitoringServiceCapabilitiesStructureRequestPolicy() {
        return new VehicleMonitoringServiceCapabilitiesStructure.RequestPolicy();
    }

    /**
     * Create an instance of {@link VehicleMonitoringServiceCapabilitiesStructure.AccessControl }
     * 
     */
    public VehicleMonitoringServiceCapabilitiesStructure.AccessControl createVehicleMonitoringServiceCapabilitiesStructureAccessControl() {
        return new VehicleMonitoringServiceCapabilitiesStructure.AccessControl();
    }

    /**
     * Create an instance of {@link VehicleMonitoringServiceCapabilitiesStructure.ResponseFeatures }
     * 
     */
    public VehicleMonitoringServiceCapabilitiesStructure.ResponseFeatures createVehicleMonitoringServiceCapabilitiesStructureResponseFeatures() {
        return new VehicleMonitoringServiceCapabilitiesStructure.ResponseFeatures();
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link StopPointsRequest }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.siri.org.uk/siri", name = "StopPointsRequest", substitutionHeadNamespace = "http://www.siri.org.uk/siri", substitutionHeadName = "AbstractDiscoveryRequest")
    public JAXBElement<StopPointsRequest> createStopPointsRequest(StopPointsRequest value) {
        return new JAXBElement<StopPointsRequest>(_StopPointsRequest_QNAME, StopPointsRequest.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link AbstractDiscoveryDeliveryStructure }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.siri.org.uk/siri", name = "AbstractDiscoveryDelivery", substitutionHeadNamespace = "http://www.siri.org.uk/siri", substitutionHeadName = "AbstractResponse")
    public JAXBElement<AbstractDiscoveryDeliveryStructure> createAbstractDiscoveryDelivery(AbstractDiscoveryDeliveryStructure value) {
        return new JAXBElement<AbstractDiscoveryDeliveryStructure>(_AbstractDiscoveryDelivery_QNAME, AbstractDiscoveryDeliveryStructure.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ResponseStructure }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.siri.org.uk/siri", name = "AbstractResponse")
    public JAXBElement<ResponseStructure> createAbstractResponse(ResponseStructure value) {
        return new JAXBElement<ResponseStructure>(_AbstractResponse_QNAME, ResponseStructure.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ParticipantRefStructure }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.siri.org.uk/siri", name = "RequestorRef")
    public JAXBElement<ParticipantRefStructure> createRequestorRef(ParticipantRefStructure value) {
        return new JAXBElement<ParticipantRefStructure>(_RequestorRef_QNAME, ParticipantRefStructure.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link XMLGregorianCalendar }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.siri.org.uk/siri", name = "ActualDepartureTime")
    public JAXBElement<XMLGregorianCalendar> createActualDepartureTime(XMLGregorianCalendar value) {
        return new JAXBElement<XMLGregorianCalendar>(_ActualDepartureTime_QNAME, XMLGregorianCalendar.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link BusSubmodesOfTransportEnumeration }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.siri.org.uk/siri", name = "BusSubmode", defaultValue = "unknown")
    public JAXBElement<BusSubmodesOfTransportEnumeration> createBusSubmode(BusSubmodesOfTransportEnumeration value) {
        return new JAXBElement<BusSubmodesOfTransportEnumeration>(_BusSubmode_QNAME, BusSubmodesOfTransportEnumeration.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link JourneyPlaceRefStructure }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.siri.org.uk/siri", name = "OriginRef")
    public JAXBElement<JourneyPlaceRefStructure> createOriginRef(JourneyPlaceRefStructure value) {
        return new JAXBElement<JourneyPlaceRefStructure>(_OriginRef_QNAME, JourneyPlaceRefStructure.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ServiceConditionEnumeration }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.siri.org.uk/siri", name = "Condition")
    public JAXBElement<ServiceConditionEnumeration> createCondition(ServiceConditionEnumeration value) {
        return new JAXBElement<ServiceConditionEnumeration>(_Condition_QNAME, ServiceConditionEnumeration.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link AccessibilityStructure }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.ifopt.org.uk/acsb", name = "StepFreeAccess", defaultValue = "unknown")
    public JAXBElement<AccessibilityStructure> createStepFreeAccess(AccessibilityStructure value) {
        return new JAXBElement<AccessibilityStructure>(_StepFreeAccess_QNAME, AccessibilityStructure.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link PublishToMobileActionStructure }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.siri.org.uk/siri", name = "PublishToMobileAction")
    public JAXBElement<PublishToMobileActionStructure> createPublishToMobileAction(PublishToMobileActionStructure value) {
        return new JAXBElement<PublishToMobileActionStructure>(_PublishToMobileAction_QNAME, PublishToMobileActionStructure.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link TimetabledFeederArrivalCancellationStructure }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.siri.org.uk/siri", name = "TimetabledFeederArrivalCancellation")
    public JAXBElement<TimetabledFeederArrivalCancellationStructure> createTimetabledFeederArrivalCancellation(TimetabledFeederArrivalCancellationStructure value) {
        return new JAXBElement<TimetabledFeederArrivalCancellationStructure>(_TimetabledFeederArrivalCancellation_QNAME, TimetabledFeederArrivalCancellationStructure.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link VehicleMonitoringServiceCapabilitiesStructure }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.siri.org.uk/siri", name = "VehicleMonitoringServiceCapabilities")
    public JAXBElement<VehicleMonitoringServiceCapabilitiesStructure> createVehicleMonitoringServiceCapabilities(VehicleMonitoringServiceCapabilitiesStructure value) {
        return new JAXBElement<VehicleMonitoringServiceCapabilitiesStructure>(_VehicleMonitoringServiceCapabilities_QNAME, VehicleMonitoringServiceCapabilitiesStructure.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Boolean }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.siri.org.uk/siri", name = "FilterByOperatorRef", defaultValue = "true")
    public JAXBElement<Boolean> createFilterByOperatorRef(Boolean value) {
        return new JAXBElement<Boolean>(_FilterByOperatorRef_QNAME, Boolean.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ServiceFeaturesDeliveryStructure }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.siri.org.uk/siri", name = "ServiceFeaturesDelivery", substitutionHeadNamespace = "http://www.siri.org.uk/siri", substitutionHeadName = "AbstractDiscoveryDelivery")
    public JAXBElement<ServiceFeaturesDeliveryStructure> createServiceFeaturesDelivery(ServiceFeaturesDeliveryStructure value) {
        return new JAXBElement<ServiceFeaturesDeliveryStructure>(_ServiceFeaturesDelivery_QNAME, ServiceFeaturesDeliveryStructure.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.siri.org.uk/siri", name = "UndefinedReason")
    public JAXBElement<String> createUndefinedReason(String value) {
        return new JAXBElement<String>(_UndefinedReason_QNAME, String.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Boolean }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.siri.org.uk/siri", name = "CheckOperatorRef", defaultValue = "true")
    public JAXBElement<Boolean> createCheckOperatorRef(Boolean value) {
        return new JAXBElement<Boolean>(_CheckOperatorRef_QNAME, Boolean.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ProductionTimetableServiceCapabilitiesStructure }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.siri.org.uk/siri", name = "ProductionTimetableServiceCapabilities")
    public JAXBElement<ProductionTimetableServiceCapabilitiesStructure> createProductionTimetableServiceCapabilities(ProductionTimetableServiceCapabilitiesStructure value) {
        return new JAXBElement<ProductionTimetableServiceCapabilitiesStructure>(_ProductionTimetableServiceCapabilities_QNAME, ProductionTimetableServiceCapabilitiesStructure.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ZoneProjectionStructure }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.ifopt.org.uk/ifopt", name = "ZoneProjection")
    public JAXBElement<ZoneProjectionStructure> createZoneProjection(ZoneProjectionStructure value) {
        return new JAXBElement<ZoneProjectionStructure>(_ZoneProjection_QNAME, ZoneProjectionStructure.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link SituationExchangeSubscriptionStructure }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.siri.org.uk/siri", name = "SituationExchangeSubscriptionRequest", substitutionHeadNamespace = "http://www.siri.org.uk/siri", substitutionHeadName = "AbstractFunctionalServiceSubscriptionRequest")
    public JAXBElement<SituationExchangeSubscriptionStructure> createSituationExchangeSubscriptionRequest(SituationExchangeSubscriptionStructure value) {
        return new JAXBElement<SituationExchangeSubscriptionStructure>(_SituationExchangeSubscriptionRequest_QNAME, SituationExchangeSubscriptionStructure.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link LinesDiscoveryRequestStructure }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.siri.org.uk/siri", name = "LinesRequest", substitutionHeadNamespace = "http://www.siri.org.uk/siri", substitutionHeadName = "AbstractDiscoveryRequest")
    public JAXBElement<LinesDiscoveryRequestStructure> createLinesRequest(LinesDiscoveryRequestStructure value) {
        return new JAXBElement<LinesDiscoveryRequestStructure>(_LinesRequest_QNAME, LinesDiscoveryRequestStructure.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link FacilityDeliveryStructure }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.siri.org.uk/siri", name = "FacilityDelivery", substitutionHeadNamespace = "http://www.siri.org.uk/siri", substitutionHeadName = "AbstractDiscoveryDelivery")
    public JAXBElement<FacilityDeliveryStructure> createFacilityDelivery(FacilityDeliveryStructure value) {
        return new JAXBElement<FacilityDeliveryStructure>(_FacilityDelivery_QNAME, FacilityDeliveryStructure.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link NaturalLanguageStringStructure }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.siri.org.uk/siri", name = "JourneyNote")
    public JAXBElement<NaturalLanguageStringStructure> createJourneyNote(NaturalLanguageStringStructure value) {
        return new JAXBElement<NaturalLanguageStringStructure>(_JourneyNote_QNAME, NaturalLanguageStringStructure.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ErrorCodeStructure }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.siri.org.uk/siri", name = "ErrorCode")
    public JAXBElement<ErrorCodeStructure> createErrorCode(ErrorCodeStructure value) {
        return new JAXBElement<ErrorCodeStructure>(_ErrorCode_QNAME, ErrorCodeStructure.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link EstimatedTimetableDeliveryStructure }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.siri.org.uk/siri", name = "EstimatedTimetableDelivery", substitutionHeadNamespace = "http://www.siri.org.uk/siri", substitutionHeadName = "AbstractFunctionalServiceDelivery")
    public JAXBElement<EstimatedTimetableDeliveryStructure> createEstimatedTimetableDelivery(EstimatedTimetableDeliveryStructure value) {
        return new JAXBElement<EstimatedTimetableDeliveryStructure>(_EstimatedTimetableDelivery_QNAME, EstimatedTimetableDeliveryStructure.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link EntryQualifierStructure }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.siri.org.uk/siri", name = "SituationNumber")
    public JAXBElement<EntryQualifierStructure> createSituationNumber(EntryQualifierStructure value) {
        return new JAXBElement<EntryQualifierStructure>(_SituationNumber_QNAME, EntryQualifierStructure.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link RequestStructure }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.siri.org.uk/siri", name = "AbstractTrackedRequest")
    public JAXBElement<RequestStructure> createAbstractTrackedRequest(RequestStructure value) {
        return new JAXBElement<RequestStructure>(_AbstractTrackedRequest_QNAME, RequestStructure.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Boolean }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.siri.org.uk/siri", name = "FilterByFacilityRef", defaultValue = "true")
    public JAXBElement<Boolean> createFilterByFacilityRef(Boolean value) {
        return new JAXBElement<Boolean>(_FilterByFacilityRef_QNAME, Boolean.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link PublishToDisplayActionStructure }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.siri.org.uk/siri", name = "PublishToDisplayAction")
    public JAXBElement<PublishToDisplayActionStructure> createPublishToDisplayAction(PublishToDisplayActionStructure value) {
        return new JAXBElement<PublishToDisplayActionStructure>(_PublishToDisplayAction_QNAME, PublishToDisplayActionStructure.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link AccessibilityStructure }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.ifopt.org.uk/acsb", name = "EscalatorFreeAccess", defaultValue = "unknown")
    public JAXBElement<AccessibilityStructure> createEscalatorFreeAccess(AccessibilityStructure value) {
        return new JAXBElement<AccessibilityStructure>(_EscalatorFreeAccess_QNAME, AccessibilityStructure.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ConnectionTimetableServiceCapabilitiesStructure }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.siri.org.uk/siri", name = "ConnectionTimetableServiceCapabilities")
    public JAXBElement<ConnectionTimetableServiceCapabilitiesStructure> createConnectionTimetableServiceCapabilities(ConnectionTimetableServiceCapabilitiesStructure value) {
        return new JAXBElement<ConnectionTimetableServiceCapabilitiesStructure>(_ConnectionTimetableServiceCapabilities_QNAME, ConnectionTimetableServiceCapabilitiesStructure.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link FacilityRefStructure }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.siri.org.uk/siri", name = "FacilityRef")
    public JAXBElement<FacilityRefStructure> createFacilityRef(FacilityRefStructure value) {
        return new JAXBElement<FacilityRefStructure>(_FacilityRef_QNAME, FacilityRefStructure.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link UnknownSubscriptionErrorStructure }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.siri.org.uk/siri", name = "UnknownSubscriptionError", substitutionHeadNamespace = "http://www.siri.org.uk/siri", substitutionHeadName = "ErrorCode")
    public JAXBElement<UnknownSubscriptionErrorStructure> createUnknownSubscriptionError(UnknownSubscriptionErrorStructure value) {
        return new JAXBElement<UnknownSubscriptionErrorStructure>(_UnknownSubscriptionError_QNAME, UnknownSubscriptionErrorStructure.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ServiceCapabilitiesRequestStructure }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.siri.org.uk/siri", name = "ConnectionMonitoringCapabilitiesRequest", substitutionHeadNamespace = "http://www.siri.org.uk/siri", substitutionHeadName = "AbstractFunctionalServiceCapabilitiesRequest")
    public JAXBElement<ServiceCapabilitiesRequestStructure> createConnectionMonitoringCapabilitiesRequest(ServiceCapabilitiesRequestStructure value) {
        return new JAXBElement<ServiceCapabilitiesRequestStructure>(_ConnectionMonitoringCapabilitiesRequest_QNAME, ServiceCapabilitiesRequestStructure.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link DatedVehicleJourneyStructure }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.siri.org.uk/siri", name = "DatedVehicleJourney")
    public JAXBElement<DatedVehicleJourneyStructure> createDatedVehicleJourney(DatedVehicleJourneyStructure value) {
        return new JAXBElement<DatedVehicleJourneyStructure>(_DatedVehicleJourney_QNAME, DatedVehicleJourneyStructure.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Boolean }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.siri.org.uk/siri", name = "FilterByMonitoringRef")
    public JAXBElement<Boolean> createFilterByMonitoringRef(Boolean value) {
        return new JAXBElement<Boolean>(_FilterByMonitoringRef_QNAME, Boolean.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.siri.org.uk/siri", name = "ReportType", defaultValue = "unknown")
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    public JAXBElement<String> createReportType(String value) {
        return new JAXBElement<String>(_ReportType_QNAME, String.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link CheckStatusRequestStructure }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.siri.org.uk/siri", name = "CheckStatusRequest", substitutionHeadNamespace = "http://www.siri.org.uk/siri", substitutionHeadName = "AbstractTrackedRequest")
    public JAXBElement<CheckStatusRequestStructure> createCheckStatusRequest(CheckStatusRequestStructure value) {
        return new JAXBElement<CheckStatusRequestStructure>(_CheckStatusRequest_QNAME, CheckStatusRequestStructure.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link InterchangeRefStructure }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.siri.org.uk/siri", name = "InterchangeRef")
    public JAXBElement<InterchangeRefStructure> createInterchangeRef(InterchangeRefStructure value) {
        return new JAXBElement<InterchangeRefStructure>(_InterchangeRef_QNAME, InterchangeRefStructure.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link RoutePointTypeEnumeration }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.siri.org.uk/siri", name = "RoutePointType", defaultValue = "unknown")
    public JAXBElement<RoutePointTypeEnumeration> createRoutePointType(RoutePointTypeEnumeration value) {
        return new JAXBElement<RoutePointTypeEnumeration>(_RoutePointType_QNAME, RoutePointTypeEnumeration.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link PublishToWebActionStructure }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.siri.org.uk/siri", name = "PublishToWebAction")
    public JAXBElement<PublishToWebActionStructure> createPublishToWebAction(PublishToWebActionStructure value) {
        return new JAXBElement<PublishToWebActionStructure>(_PublishToWebAction_QNAME, PublishToWebActionStructure.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ServiceFeatureStructure }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.siri.org.uk/siri", name = "ServiceFeature")
    public JAXBElement<ServiceFeatureStructure> createServiceFeature(ServiceFeatureStructure value) {
        return new JAXBElement<ServiceFeatureStructure>(_ServiceFeature_QNAME, ServiceFeatureStructure.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link DepartureBoardingActivityEnumeration }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.siri.org.uk/siri", name = "DepartureBoardingActivity", defaultValue = "boarding")
    public JAXBElement<DepartureBoardingActivityEnumeration> createDepartureBoardingActivity(DepartureBoardingActivityEnumeration value) {
        return new JAXBElement<DepartureBoardingActivityEnumeration>(_DepartureBoardingActivity_QNAME, DepartureBoardingActivityEnumeration.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link TimetabledFeederArrivalStructure }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.siri.org.uk/siri", name = "TimetabledFeederArrival")
    public JAXBElement<TimetabledFeederArrivalStructure> createTimetabledFeederArrival(TimetabledFeederArrivalStructure value) {
        return new JAXBElement<TimetabledFeederArrivalStructure>(_TimetabledFeederArrival_QNAME, TimetabledFeederArrivalStructure.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link AbstractServiceDeliveryStructure }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.siri.org.uk/siri", name = "AbstractFunctionalServiceDelivery", substitutionHeadNamespace = "http://www.siri.org.uk/siri", substitutionHeadName = "AbstractResponse")
    public JAXBElement<AbstractServiceDeliveryStructure> createAbstractFunctionalServiceDelivery(AbstractServiceDeliveryStructure value) {
        return new JAXBElement<AbstractServiceDeliveryStructure>(_AbstractFunctionalServiceDelivery_QNAME, AbstractServiceDeliveryStructure.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link StopPointRefStructure }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.siri.org.uk/siri", name = "StopPointRef")
    public JAXBElement<StopPointRefStructure> createStopPointRef(StopPointRefStructure value) {
        return new JAXBElement<StopPointRefStructure>(_StopPointRef_QNAME, StopPointRefStructure.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link VehicleMonitoringDeliveryStructure }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.siri.org.uk/siri", name = "VehicleMonitoringDelivery", substitutionHeadNamespace = "http://www.siri.org.uk/siri", substitutionHeadName = "AbstractFunctionalServiceDelivery")
    public JAXBElement<VehicleMonitoringDeliveryStructure> createVehicleMonitoringDelivery(VehicleMonitoringDeliveryStructure value) {
        return new JAXBElement<VehicleMonitoringDeliveryStructure>(_VehicleMonitoringDelivery_QNAME, VehicleMonitoringDeliveryStructure.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Boolean }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.siri.org.uk/siri", name = "CheckConnectionLinkRef", defaultValue = "true")
    public JAXBElement<Boolean> createCheckConnectionLinkRef(Boolean value) {
        return new JAXBElement<Boolean>(_CheckConnectionLinkRef_QNAME, Boolean.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link DirectionStructure }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.siri.org.uk/siri", name = "Direction")
    public JAXBElement<DirectionStructure> createDirection(DirectionStructure value) {
        return new JAXBElement<DirectionStructure>(_Direction_QNAME, DirectionStructure.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link AccessibilityStructure }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.ifopt.org.uk/acsb", name = "GuideDogAccess", defaultValue = "unknown")
    public JAXBElement<AccessibilityStructure> createGuideDogAccess(AccessibilityStructure value) {
        return new JAXBElement<AccessibilityStructure>(_GuideDogAccess_QNAME, AccessibilityStructure.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GeneralMessageCapabilitiesResponseStructure }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.siri.org.uk/siri", name = "GeneralMessageCapabilitiesResponse", substitutionHeadNamespace = "http://www.siri.org.uk/siri", substitutionHeadName = "AbstractFunctionalServiceCapabilitiesResponse")
    public JAXBElement<GeneralMessageCapabilitiesResponseStructure> createGeneralMessageCapabilitiesResponse(GeneralMessageCapabilitiesResponseStructure value) {
        return new JAXBElement<GeneralMessageCapabilitiesResponseStructure>(_GeneralMessageCapabilitiesResponse_QNAME, GeneralMessageCapabilitiesResponseStructure.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link NaturalLanguageStringStructure }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.siri.org.uk/siri", name = "StopPointName")
    public JAXBElement<NaturalLanguageStringStructure> createStopPointName(NaturalLanguageStringStructure value) {
        return new JAXBElement<NaturalLanguageStringStructure>(_StopPointName_QNAME, NaturalLanguageStringStructure.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link TicketRestrictionEnumeration }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.siri.org.uk/siri", name = "TicketRestrictionType", defaultValue = "unknown")
    public JAXBElement<TicketRestrictionEnumeration> createTicketRestrictionType(TicketRestrictionEnumeration value) {
        return new JAXBElement<TicketRestrictionEnumeration>(_TicketRestrictionType_QNAME, TicketRestrictionEnumeration.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link BigInteger }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.siri.org.uk/siri", name = "VisitNumber")
    public JAXBElement<BigInteger> createVisitNumber(BigInteger value) {
        return new JAXBElement<BigInteger>(_VisitNumber_QNAME, BigInteger.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ServiceCapabilitiesRequestStructure }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.siri.org.uk/siri", name = "ConnectionTimetableCapabilitiesRequest", substitutionHeadNamespace = "http://www.siri.org.uk/siri", substitutionHeadName = "AbstractFunctionalServiceCapabilitiesRequest")
    public JAXBElement<ServiceCapabilitiesRequestStructure> createConnectionTimetableCapabilitiesRequest(ServiceCapabilitiesRequestStructure value) {
        return new JAXBElement<ServiceCapabilitiesRequestStructure>(_ConnectionTimetableCapabilitiesRequest_QNAME, ServiceCapabilitiesRequestStructure.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link XMLGregorianCalendar }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.siri.org.uk/siri", name = "ActualArrivalTime")
    public JAXBElement<XMLGregorianCalendar> createActualArrivalTime(XMLGregorianCalendar value) {
        return new JAXBElement<XMLGregorianCalendar>(_ActualArrivalTime_QNAME, XMLGregorianCalendar.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link VehicleFeaturesDeliveryStructure }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.siri.org.uk/siri", name = "VehicleFeaturesDelivery", substitutionHeadNamespace = "http://www.siri.org.uk/siri", substitutionHeadName = "AbstractDiscoveryDelivery")
    public JAXBElement<VehicleFeaturesDeliveryStructure> createVehicleFeaturesDelivery(VehicleFeaturesDeliveryStructure value) {
        return new JAXBElement<VehicleFeaturesDeliveryStructure>(_VehicleFeaturesDelivery_QNAME, VehicleFeaturesDeliveryStructure.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link AbstractSubscriptionStructure }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.siri.org.uk/siri", name = "AbstractFunctionalServiceSubscriptionRequest")
    public JAXBElement<AbstractSubscriptionStructure> createAbstractFunctionalServiceSubscriptionRequest(AbstractSubscriptionStructure value) {
        return new JAXBElement<AbstractSubscriptionStructure>(_AbstractFunctionalServiceSubscriptionRequest_QNAME, AbstractSubscriptionStructure.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link AccessibilityStructure }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.ifopt.org.uk/acsb", name = "WheelchairAccess", defaultValue = "false")
    public JAXBElement<AccessibilityStructure> createWheelchairAccess(AccessibilityStructure value) {
        return new JAXBElement<AccessibilityStructure>(_WheelchairAccess_QNAME, AccessibilityStructure.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link UnknownSubscriberErrorStructure }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.siri.org.uk/siri", name = "UnknownSubscriberError", substitutionHeadNamespace = "http://www.siri.org.uk/siri", substitutionHeadName = "ErrorCode")
    public JAXBElement<UnknownSubscriberErrorStructure> createUnknownSubscriberError(UnknownSubscriberErrorStructure value) {
        return new JAXBElement<UnknownSubscriberErrorStructure>(_UnknownSubscriberError_QNAME, UnknownSubscriberErrorStructure.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link StopMonitoringMultipleRequestStructure }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.siri.org.uk/siri", name = "StopMonitoringMultipleRequest", substitutionHeadNamespace = "http://www.siri.org.uk/siri", substitutionHeadName = "AbstractFunctionalServiceRequest")
    public JAXBElement<StopMonitoringMultipleRequestStructure> createStopMonitoringMultipleRequest(StopMonitoringMultipleRequestStructure value) {
        return new JAXBElement<StopMonitoringMultipleRequestStructure>(_StopMonitoringMultipleRequest_QNAME, StopMonitoringMultipleRequestStructure.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link AbstractServiceRequestStructure }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.siri.org.uk/siri", name = "AbstractServiceRequest", substitutionHeadNamespace = "http://www.siri.org.uk/siri", substitutionHeadName = "AbstractRequest")
    public JAXBElement<AbstractServiceRequestStructure> createAbstractServiceRequest(AbstractServiceRequestStructure value) {
        return new JAXBElement<AbstractServiceRequestStructure>(_AbstractServiceRequest_QNAME, AbstractServiceRequestStructure.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link StopPointsDeliveryStructure }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.siri.org.uk/siri", name = "StopPointsDelivery", substitutionHeadNamespace = "http://www.siri.org.uk/siri", substitutionHeadName = "AbstractDiscoveryDelivery")
    public JAXBElement<StopPointsDeliveryStructure> createStopPointsDelivery(StopPointsDeliveryStructure value) {
        return new JAXBElement<StopPointsDeliveryStructure>(_StopPointsDelivery_QNAME, StopPointsDeliveryStructure.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link FacilityMonitoringSubscriptionStructure }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.siri.org.uk/siri", name = "FacilityMonitoringSubscriptionRequest", substitutionHeadNamespace = "http://www.siri.org.uk/siri", substitutionHeadName = "AbstractFunctionalServiceSubscriptionRequest")
    public JAXBElement<FacilityMonitoringSubscriptionStructure> createFacilityMonitoringSubscriptionRequest(FacilityMonitoringSubscriptionStructure value) {
        return new JAXBElement<FacilityMonitoringSubscriptionStructure>(_FacilityMonitoringSubscriptionRequest_QNAME, FacilityMonitoringSubscriptionStructure.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link VehicleMonitoringSubscriptionStructure }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.siri.org.uk/siri", name = "VehicleMonitoringSubscriptionRequest", substitutionHeadNamespace = "http://www.siri.org.uk/siri", substitutionHeadName = "AbstractFunctionalServiceSubscriptionRequest")
    public JAXBElement<VehicleMonitoringSubscriptionStructure> createVehicleMonitoringSubscriptionRequest(VehicleMonitoringSubscriptionStructure value) {
        return new JAXBElement<VehicleMonitoringSubscriptionStructure>(_VehicleMonitoringSubscriptionRequest_QNAME, VehicleMonitoringSubscriptionStructure.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link EquipmentSubReasonEnumeration }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.siri.org.uk/siri", name = "EquipmentSubReason")
    public JAXBElement<EquipmentSubReasonEnumeration> createEquipmentSubReason(EquipmentSubReasonEnumeration value) {
        return new JAXBElement<EquipmentSubReasonEnumeration>(_EquipmentSubReason_QNAME, EquipmentSubReasonEnumeration.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link BeyondDataHorizonErrorStructure }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.siri.org.uk/siri", name = "BeyondDataHorizon", substitutionHeadNamespace = "http://www.siri.org.uk/siri", substitutionHeadName = "ErrorCode")
    public JAXBElement<BeyondDataHorizonErrorStructure> createBeyondDataHorizon(BeyondDataHorizonErrorStructure value) {
        return new JAXBElement<BeyondDataHorizonErrorStructure>(_BeyondDataHorizon_QNAME, BeyondDataHorizonErrorStructure.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link CoachSubmodesOfTransportEnumeration }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.siri.org.uk/siri", name = "CoachSubmode", defaultValue = "unknown")
    public JAXBElement<CoachSubmodesOfTransportEnumeration> createCoachSubmode(CoachSubmodesOfTransportEnumeration value) {
        return new JAXBElement<CoachSubmodesOfTransportEnumeration>(_CoachSubmode_QNAME, CoachSubmodesOfTransportEnumeration.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link SeverityEnumeration }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.siri.org.uk/siri", name = "Severity", defaultValue = "normal")
    public JAXBElement<SeverityEnumeration> createSeverity(SeverityEnumeration value) {
        return new JAXBElement<SeverityEnumeration>(_Severity_QNAME, SeverityEnumeration.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link FunicularSubmodesOfTransportEnumeration }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.siri.org.uk/siri", name = "FunicularSubmode", defaultValue = "unknown")
    public JAXBElement<FunicularSubmodesOfTransportEnumeration> createFunicularSubmode(FunicularSubmodesOfTransportEnumeration value) {
        return new JAXBElement<FunicularSubmodesOfTransportEnumeration>(_FunicularSubmode_QNAME, FunicularSubmodesOfTransportEnumeration.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ConnectionTimetableCapabilitiesResponseStructure }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.siri.org.uk/siri", name = "ConnectionTimetableCapabilitiesResponse", substitutionHeadNamespace = "http://www.siri.org.uk/siri", substitutionHeadName = "AbstractFunctionalServiceCapabilitiesResponse")
    public JAXBElement<ConnectionTimetableCapabilitiesResponseStructure> createConnectionTimetableCapabilitiesResponse(ConnectionTimetableCapabilitiesResponseStructure value) {
        return new JAXBElement<ConnectionTimetableCapabilitiesResponseStructure>(_ConnectionTimetableCapabilitiesResponse_QNAME, ConnectionTimetableCapabilitiesResponseStructure.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Boolean }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.siri.org.uk/siri", name = "TimingPoint", defaultValue = "true")
    public JAXBElement<Boolean> createTimingPoint(Boolean value) {
        return new JAXBElement<Boolean>(_TimingPoint_QNAME, Boolean.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ProductionTimetableRequestStructure }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.siri.org.uk/siri", name = "ProductionTimetableRequest", substitutionHeadNamespace = "http://www.siri.org.uk/siri", substitutionHeadName = "AbstractFunctionalServiceRequest")
    public JAXBElement<ProductionTimetableRequestStructure> createProductionTimetableRequest(ProductionTimetableRequestStructure value) {
        return new JAXBElement<ProductionTimetableRequestStructure>(_ProductionTimetableRequest_QNAME, ProductionTimetableRequestStructure.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link JourneyPatternRefStructure }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.siri.org.uk/siri", name = "JourneyPatternRef")
    public JAXBElement<JourneyPatternRefStructure> createJourneyPatternRef(JourneyPatternRefStructure value) {
        return new JAXBElement<JourneyPatternRefStructure>(_JourneyPatternRef_QNAME, JourneyPatternRefStructure.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link FacilityMonitoringServiceCapabilitiesStructure }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.siri.org.uk/siri", name = "FacilityMonitoringServiceCapabilities")
    public JAXBElement<FacilityMonitoringServiceCapabilitiesStructure> createFacilityMonitoringServiceCapabilities(FacilityMonitoringServiceCapabilitiesStructure value) {
        return new JAXBElement<FacilityMonitoringServiceCapabilitiesStructure>(_FacilityMonitoringServiceCapabilities_QNAME, FacilityMonitoringServiceCapabilitiesStructure.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link FacilityChangeStructure }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.siri.org.uk/siri", name = "FacilityChangeElement")
    public JAXBElement<FacilityChangeStructure> createFacilityChangeElement(FacilityChangeStructure value) {
        return new JAXBElement<FacilityChangeStructure>(_FacilityChangeElement_QNAME, FacilityChangeStructure.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link SituationExchangeRequestStructure }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.siri.org.uk/siri", name = "SituationExchangeRequest", substitutionHeadNamespace = "http://www.siri.org.uk/siri", substitutionHeadName = "AbstractFunctionalServiceRequest")
    public JAXBElement<SituationExchangeRequestStructure> createSituationExchangeRequest(SituationExchangeRequestStructure value) {
        return new JAXBElement<SituationExchangeRequestStructure>(_SituationExchangeRequest_QNAME, SituationExchangeRequestStructure.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ServiceCapabilitiesRequestStructure }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.siri.org.uk/siri", name = "SituationExchangeCapabilitiesRequest", substitutionHeadNamespace = "http://www.siri.org.uk/siri", substitutionHeadName = "AbstractFunctionalServiceCapabilitiesRequest")
    public JAXBElement<ServiceCapabilitiesRequestStructure> createSituationExchangeCapabilitiesRequest(ServiceCapabilitiesRequestStructure value) {
        return new JAXBElement<ServiceCapabilitiesRequestStructure>(_SituationExchangeCapabilitiesRequest_QNAME, ServiceCapabilitiesRequestStructure.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link SelfDriveSubmodesOfTransportEnumeration }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.siri.org.uk/siri", name = "SelfDriveSubmode", defaultValue = "unknown")
    public JAXBElement<SelfDriveSubmodesOfTransportEnumeration> createSelfDriveSubmode(SelfDriveSubmodesOfTransportEnumeration value) {
        return new JAXBElement<SelfDriveSubmodesOfTransportEnumeration>(_SelfDriveSubmode_QNAME, SelfDriveSubmodesOfTransportEnumeration.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Boolean }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.siri.org.uk/siri", name = "CheckLineRef", defaultValue = "true")
    public JAXBElement<Boolean> createCheckLineRef(Boolean value) {
        return new JAXBElement<Boolean>(_CheckLineRef_QNAME, Boolean.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ServiceCapabilitiesRequestStructure }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.siri.org.uk/siri", name = "FacilityMonitoringCapabilitiesRequest", substitutionHeadNamespace = "http://www.siri.org.uk/siri", substitutionHeadName = "AbstractFunctionalServiceCapabilitiesRequest")
    public JAXBElement<ServiceCapabilitiesRequestStructure> createFacilityMonitoringCapabilitiesRequest(ServiceCapabilitiesRequestStructure value) {
        return new JAXBElement<ServiceCapabilitiesRequestStructure>(_FacilityMonitoringCapabilitiesRequest_QNAME, ServiceCapabilitiesRequestStructure.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ServiceCapabilitiesRequestStructure }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.siri.org.uk/siri", name = "EstimatedTimetableCapabilitiesRequest", substitutionHeadNamespace = "http://www.siri.org.uk/siri", substitutionHeadName = "AbstractFunctionalServiceCapabilitiesRequest")
    public JAXBElement<ServiceCapabilitiesRequestStructure> createEstimatedTimetableCapabilitiesRequest(ServiceCapabilitiesRequestStructure value) {
        return new JAXBElement<ServiceCapabilitiesRequestStructure>(_EstimatedTimetableCapabilitiesRequest_QNAME, ServiceCapabilitiesRequestStructure.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link XMLGregorianCalendar }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.siri.org.uk/siri", name = "ExpectedDepartureTime")
    public JAXBElement<XMLGregorianCalendar> createExpectedDepartureTime(XMLGregorianCalendar value) {
        return new JAXBElement<XMLGregorianCalendar>(_ExpectedDepartureTime_QNAME, XMLGregorianCalendar.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link XMLGregorianCalendar }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.siri.org.uk/siri", name = "AimedDepartureTime")
    public JAXBElement<XMLGregorianCalendar> createAimedDepartureTime(XMLGregorianCalendar value) {
        return new JAXBElement<XMLGregorianCalendar>(_AimedDepartureTime_QNAME, XMLGregorianCalendar.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ProductionTimetableSubscriptionRequest }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.siri.org.uk/siri", name = "ProductionTimetableSubscriptionRequest", substitutionHeadNamespace = "http://www.siri.org.uk/siri", substitutionHeadName = "AbstractFunctionalServiceSubscriptionRequest")
    public JAXBElement<ProductionTimetableSubscriptionRequest> createProductionTimetableSubscriptionRequest(ProductionTimetableSubscriptionRequest value) {
        return new JAXBElement<ProductionTimetableSubscriptionRequest>(_ProductionTimetableSubscriptionRequest_QNAME, ProductionTimetableSubscriptionRequest.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ProductCategoriesDeliveryStructure }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.siri.org.uk/siri", name = "ProductCategoriesDelivery", substitutionHeadNamespace = "http://www.siri.org.uk/siri", substitutionHeadName = "AbstractDiscoveryDelivery")
    public JAXBElement<ProductCategoriesDeliveryStructure> createProductCategoriesDelivery(ProductCategoriesDeliveryStructure value) {
        return new JAXBElement<ProductCategoriesDeliveryStructure>(_ProductCategoriesDelivery_QNAME, ProductCategoriesDeliveryStructure.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Boolean }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.siri.org.uk/siri", name = "FilterByValidityPeriod", defaultValue = "true")
    public JAXBElement<Boolean> createFilterByValidityPeriod(Boolean value) {
        return new JAXBElement<Boolean>(_FilterByValidityPeriod_QNAME, Boolean.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link EquipmentReasonEnumeration }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.siri.org.uk/siri", name = "EquipmentReason")
    public JAXBElement<EquipmentReasonEnumeration> createEquipmentReason(EquipmentReasonEnumeration value) {
        return new JAXBElement<EquipmentReasonEnumeration>(_EquipmentReason_QNAME, EquipmentReasonEnumeration.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link EstimatedTimetableCapabilitiesResponseStructure }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.siri.org.uk/siri", name = "EstimatedTimetableCapabilitiesResponse", substitutionHeadNamespace = "http://www.siri.org.uk/siri", substitutionHeadName = "AbstractFunctionalServiceCapabilitiesResponse")
    public JAXBElement<EstimatedTimetableCapabilitiesResponseStructure> createEstimatedTimetableCapabilitiesResponse(EstimatedTimetableCapabilitiesResponseStructure value) {
        return new JAXBElement<EstimatedTimetableCapabilitiesResponseStructure>(_EstimatedTimetableCapabilitiesResponse_QNAME, EstimatedTimetableCapabilitiesResponseStructure.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Duration }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.siri.org.uk/siri", name = "AimedHeadwayInterval")
    public JAXBElement<Duration> createAimedHeadwayInterval(Duration value) {
        return new JAXBElement<Duration>(_AimedHeadwayInterval_QNAME, Duration.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link TaxiSubmodesOfTransportEnumeration }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.siri.org.uk/siri", name = "TaxiSubmode", defaultValue = "unknown")
    public JAXBElement<TaxiSubmodesOfTransportEnumeration> createTaxiSubmode(TaxiSubmodesOfTransportEnumeration value) {
        return new JAXBElement<TaxiSubmodesOfTransportEnumeration>(_TaxiSubmode_QNAME, TaxiSubmodesOfTransportEnumeration.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link FacilityMonitoringDeliveryStructure }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.siri.org.uk/siri", name = "FacilityMonitoringDelivery", substitutionHeadNamespace = "http://www.siri.org.uk/siri", substitutionHeadName = "AbstractFunctionalServiceDelivery")
    public JAXBElement<FacilityMonitoringDeliveryStructure> createFacilityMonitoringDelivery(FacilityMonitoringDeliveryStructure value) {
        return new JAXBElement<FacilityMonitoringDeliveryStructure>(_FacilityMonitoringDelivery_QNAME, FacilityMonitoringDeliveryStructure.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link MobilityFacilityEnumeration }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.siri.org.uk/siri", name = "MobilityFacility", defaultValue = "unknown")
    public JAXBElement<MobilityFacilityEnumeration> createMobilityFacility(MobilityFacilityEnumeration value) {
        return new JAXBElement<MobilityFacilityEnumeration>(_MobilityFacility_QNAME, MobilityFacilityEnumeration.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ProductionTimetableDeliveryStructure }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.siri.org.uk/siri", name = "ProductionTimetableDelivery", substitutionHeadNamespace = "http://www.siri.org.uk/siri", substitutionHeadName = "AbstractFunctionalServiceDelivery")
    public JAXBElement<ProductionTimetableDeliveryStructure> createProductionTimetableDelivery(ProductionTimetableDeliveryStructure value) {
        return new JAXBElement<ProductionTimetableDeliveryStructure>(_ProductionTimetableDelivery_QNAME, ProductionTimetableDeliveryStructure.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ConnectionLinkRefStructure }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.siri.org.uk/siri", name = "ConnectionLinkRef")
    public JAXBElement<ConnectionLinkRefStructure> createConnectionLinkRef(ConnectionLinkRefStructure value) {
        return new JAXBElement<ConnectionLinkRefStructure>(_ConnectionLinkRef_QNAME, ConnectionLinkRefStructure.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link DayTypeEnumeration }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.siri.org.uk/siri", name = "DayType", defaultValue = "everyDay")
    public JAXBElement<DayTypeEnumeration> createDayType(DayTypeEnumeration value) {
        return new JAXBElement<DayTypeEnumeration>(_DayType_QNAME, DayTypeEnumeration.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link PersonnelReasonEnumeration }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.siri.org.uk/siri", name = "PersonnelReason")
    public JAXBElement<PersonnelReasonEnumeration> createPersonnelReason(PersonnelReasonEnumeration value) {
        return new JAXBElement<PersonnelReasonEnumeration>(_PersonnelReason_QNAME, PersonnelReasonEnumeration.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ExtensionsStructure }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.siri.org.uk/siri", name = "Extensions")
    public JAXBElement<ExtensionsStructure> createExtensions(ExtensionsStructure value) {
        return new JAXBElement<ExtensionsStructure>(_Extensions_QNAME, ExtensionsStructure.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ConnectionMonitoringSubscriptionRequestStructure }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.siri.org.uk/siri", name = "ConnectionMonitoringSubscriptionRequest", substitutionHeadNamespace = "http://www.siri.org.uk/siri", substitutionHeadName = "AbstractFunctionalServiceSubscriptionRequest")
    public JAXBElement<ConnectionMonitoringSubscriptionRequestStructure> createConnectionMonitoringSubscriptionRequest(ConnectionMonitoringSubscriptionRequestStructure value) {
        return new JAXBElement<ConnectionMonitoringSubscriptionRequestStructure>(_ConnectionMonitoringSubscriptionRequest_QNAME, ConnectionMonitoringSubscriptionRequestStructure.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link DataSupplyRequestStructure }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.siri.org.uk/siri", name = "DataSupplyRequest", substitutionHeadNamespace = "http://www.siri.org.uk/siri", substitutionHeadName = "AbstractRequest")
    public JAXBElement<DataSupplyRequestStructure> createDataSupplyRequest(DataSupplyRequestStructure value) {
        return new JAXBElement<DataSupplyRequestStructure>(_DataSupplyRequest_QNAME, DataSupplyRequestStructure.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.siri.org.uk/siri", name = "SrsName")
    public JAXBElement<String> createSrsName(String value) {
        return new JAXBElement<String>(_SrsName_QNAME, String.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link TargetedCallStructure }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.siri.org.uk/siri", name = "TargetedCall")
    public JAXBElement<TargetedCallStructure> createTargetedCall(TargetedCallStructure value) {
        return new JAXBElement<TargetedCallStructure>(_TargetedCall_QNAME, TargetedCallStructure.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ProgressStatusEnumeration }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.siri.org.uk/siri", name = "ArrivalStatus")
    public JAXBElement<ProgressStatusEnumeration> createArrivalStatus(ProgressStatusEnumeration value) {
        return new JAXBElement<ProgressStatusEnumeration>(_ArrivalStatus_QNAME, ProgressStatusEnumeration.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.siri.org.uk/siri", name = "VersionRef")
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    public JAXBElement<String> createVersionRef(String value) {
        return new JAXBElement<String>(_VersionRef_QNAME, String.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link MiscellaneousReasonEnumeration }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.siri.org.uk/siri", name = "MiscellaneousReason")
    public JAXBElement<MiscellaneousReasonEnumeration> createMiscellaneousReason(MiscellaneousReasonEnumeration value) {
        return new JAXBElement<MiscellaneousReasonEnumeration>(_MiscellaneousReason_QNAME, MiscellaneousReasonEnumeration.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Boolean }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.siri.org.uk/siri", name = "CheckMonitoringRef", defaultValue = "true")
    public JAXBElement<Boolean> createCheckMonitoringRef(Boolean value) {
        return new JAXBElement<Boolean>(_CheckMonitoringRef_QNAME, Boolean.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link SituationExchangeDeliveryStructure }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.siri.org.uk/siri", name = "SituationExchangeDelivery", substitutionHeadNamespace = "http://www.siri.org.uk/siri", substitutionHeadName = "AbstractFunctionalServiceDelivery")
    public JAXBElement<SituationExchangeDeliveryStructure> createSituationExchangeDelivery(SituationExchangeDeliveryStructure value) {
        return new JAXBElement<SituationExchangeDeliveryStructure>(_SituationExchangeDelivery_QNAME, SituationExchangeDeliveryStructure.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link PassengerInformationFacilityEnumeration }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.siri.org.uk/siri", name = "PassengerInformationFacility", defaultValue = "unknown")
    public JAXBElement<PassengerInformationFacilityEnumeration> createPassengerInformationFacility(PassengerInformationFacilityEnumeration value) {
        return new JAXBElement<PassengerInformationFacilityEnumeration>(_PassengerInformationFacility_QNAME, PassengerInformationFacilityEnumeration.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link FacilityRequestStructure }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.siri.org.uk/siri", name = "FacilityRequest", substitutionHeadNamespace = "http://www.siri.org.uk/siri", substitutionHeadName = "AbstractDiscoveryRequest")
    public JAXBElement<FacilityRequestStructure> createFacilityRequest(FacilityRequestStructure value) {
        return new JAXBElement<FacilityRequestStructure>(_FacilityRequest_QNAME, FacilityRequestStructure.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ProductionTimetableCapabilitiesRequest }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.siri.org.uk/siri", name = "ProductionTimetableCapabilitiesRequest", substitutionHeadNamespace = "http://www.siri.org.uk/siri", substitutionHeadName = "AbstractFunctionalServiceCapabilitiesRequest")
    public JAXBElement<ProductionTimetableCapabilitiesRequest> createProductionTimetableCapabilitiesRequest(ProductionTimetableCapabilitiesRequest value) {
        return new JAXBElement<ProductionTimetableCapabilitiesRequest>(_ProductionTimetableCapabilitiesRequest_QNAME, ProductionTimetableCapabilitiesRequest.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link VehicleJourneyRefStructure }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.siri.org.uk/siri", name = "VehicleJourneyRef")
    public JAXBElement<VehicleJourneyRefStructure> createVehicleJourneyRef(VehicleJourneyRefStructure value) {
        return new JAXBElement<VehicleJourneyRefStructure>(_VehicleJourneyRef_QNAME, VehicleJourneyRefStructure.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link FacilityConditionStructure }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.siri.org.uk/siri", name = "FacilityConditionElement")
    public JAXBElement<FacilityConditionStructure> createFacilityConditionElement(FacilityConditionStructure value) {
        return new JAXBElement<FacilityConditionStructure>(_FacilityConditionElement_QNAME, FacilityConditionStructure.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ConnectionMonitoringCapabilitiesResponseStructure }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.siri.org.uk/siri", name = "ConnectionMonitoringCapabilitiesResponse", substitutionHeadNamespace = "http://www.siri.org.uk/siri", substitutionHeadName = "AbstractFunctionalServiceCapabilitiesResponse")
    public JAXBElement<ConnectionMonitoringCapabilitiesResponseStructure> createConnectionMonitoringCapabilitiesResponse(ConnectionMonitoringCapabilitiesResponseStructure value) {
        return new JAXBElement<ConnectionMonitoringCapabilitiesResponseStructure>(_ConnectionMonitoringCapabilitiesResponse_QNAME, ConnectionMonitoringCapabilitiesResponseStructure.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link StopPlaceRefStructure }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.ifopt.org.uk/ifopt", name = "StopPlaceRef")
    public JAXBElement<StopPlaceRefStructure> createStopPlaceRef(StopPlaceRefStructure value) {
        return new JAXBElement<StopPlaceRefStructure>(_StopPlaceRef_QNAME, StopPlaceRefStructure.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link VehicleMonitoringCapabilitiesResponseStructure }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.siri.org.uk/siri", name = "VehicleMonitoringCapabilitiesResponse", substitutionHeadNamespace = "http://www.siri.org.uk/siri", substitutionHeadName = "AbstractFunctionalServiceCapabilitiesResponse")
    public JAXBElement<VehicleMonitoringCapabilitiesResponseStructure> createVehicleMonitoringCapabilitiesResponse(VehicleMonitoringCapabilitiesResponseStructure value) {
        return new JAXBElement<VehicleMonitoringCapabilitiesResponseStructure>(_VehicleMonitoringCapabilitiesResponse_QNAME, VehicleMonitoringCapabilitiesResponseStructure.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link TimetableTypeEnumeration }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.siri.org.uk/siri", name = "TimetableType", defaultValue = "unknown")
    public JAXBElement<TimetableTypeEnumeration> createTimetableType(TimetableTypeEnumeration value) {
        return new JAXBElement<TimetableTypeEnumeration>(_TimetableType_QNAME, TimetableTypeEnumeration.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ProductCategoriesDiscoveryRequestStructure }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.siri.org.uk/siri", name = "ProductCategoriesRequest", substitutionHeadNamespace = "http://www.siri.org.uk/siri", substitutionHeadName = "AbstractDiscoveryRequest")
    public JAXBElement<ProductCategoriesDiscoveryRequestStructure> createProductCategoriesRequest(ProductCategoriesDiscoveryRequestStructure value) {
        return new JAXBElement<ProductCategoriesDiscoveryRequestStructure>(_ProductCategoriesRequest_QNAME, ProductCategoriesDiscoveryRequestStructure.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link NaturalLanguageStringStructure }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.siri.org.uk/siri", name = "PublishedLineName")
    public JAXBElement<NaturalLanguageStringStructure> createPublishedLineName(NaturalLanguageStringStructure value) {
        return new JAXBElement<NaturalLanguageStringStructure>(_PublishedLineName_QNAME, NaturalLanguageStringStructure.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Boolean }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.siri.org.uk/siri", name = "AllowAll")
    public JAXBElement<Boolean> createAllowAll(Boolean value) {
        return new JAXBElement<Boolean>(_AllowAll_QNAME, Boolean.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link InfoChannelDiscoveryRequestStructure }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.siri.org.uk/siri", name = "InfoChannelRequest", substitutionHeadNamespace = "http://www.siri.org.uk/siri", substitutionHeadName = "AbstractDiscoveryRequest")
    public JAXBElement<InfoChannelDiscoveryRequestStructure> createInfoChannelRequest(InfoChannelDiscoveryRequestStructure value) {
        return new JAXBElement<InfoChannelDiscoveryRequestStructure>(_InfoChannelRequest_QNAME, InfoChannelDiscoveryRequestStructure.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link StopTimetableCapabilitiesResponseStructure }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.siri.org.uk/siri", name = "StopTimetableCapabilitiesResponse", substitutionHeadNamespace = "http://www.siri.org.uk/siri", substitutionHeadName = "AbstractFunctionalServiceCapabilitiesResponse")
    public JAXBElement<StopTimetableCapabilitiesResponseStructure> createStopTimetableCapabilitiesResponse(StopTimetableCapabilitiesResponseStructure value) {
        return new JAXBElement<StopTimetableCapabilitiesResponseStructure>(_StopTimetableCapabilitiesResponse_QNAME, StopTimetableCapabilitiesResponseStructure.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ProducerRequestEndpointStructure }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.siri.org.uk/siri", name = "ProducerRequest", substitutionHeadNamespace = "http://www.siri.org.uk/siri", substitutionHeadName = "AbstractRequest")
    public JAXBElement<ProducerRequestEndpointStructure> createProducerRequest(ProducerRequestEndpointStructure value) {
        return new JAXBElement<ProducerRequestEndpointStructure>(_ProducerRequest_QNAME, ProducerRequestEndpointStructure.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link AccommodationFacilityEnumeration }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.siri.org.uk/siri", name = "AccommodationFacility", defaultValue = "unknown")
    public JAXBElement<AccommodationFacilityEnumeration> createAccommodationFacility(AccommodationFacilityEnumeration value) {
        return new JAXBElement<AccommodationFacilityEnumeration>(_AccommodationFacility_QNAME, AccommodationFacilityEnumeration.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Boolean }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.siri.org.uk/siri", name = "FilterByVehicleJourneyRef", defaultValue = "false")
    public JAXBElement<Boolean> createFilterByVehicleJourneyRef(Boolean value) {
        return new JAXBElement<Boolean>(_FilterByVehicleJourneyRef_QNAME, Boolean.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Boolean }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.siri.org.uk/siri", name = "Status", defaultValue = "true")
    public JAXBElement<Boolean> createStatus(Boolean value) {
        return new JAXBElement<Boolean>(_Status_QNAME, Boolean.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GeneralMessageServiceCapabilitiesStructure }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.siri.org.uk/siri", name = "GeneralMessageServiceCapabilities")
    public JAXBElement<GeneralMessageServiceCapabilitiesStructure> createGeneralMessageServiceCapabilities(GeneralMessageServiceCapabilitiesStructure value) {
        return new JAXBElement<GeneralMessageServiceCapabilitiesStructure>(_GeneralMessageServiceCapabilities_QNAME, GeneralMessageServiceCapabilitiesStructure.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link EstimatedCallStructure }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.siri.org.uk/siri", name = "EstimatedCall")
    public JAXBElement<EstimatedCallStructure> createEstimatedCall(EstimatedCallStructure value) {
        return new JAXBElement<EstimatedCallStructure>(_EstimatedCall_QNAME, EstimatedCallStructure.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link FareClassFacilityEnumeration }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.siri.org.uk/siri", name = "FareClassFacility", defaultValue = "unknown")
    public JAXBElement<FareClassFacilityEnumeration> createFareClassFacility(FareClassFacilityEnumeration value) {
        return new JAXBElement<FareClassFacilityEnumeration>(_FareClassFacility_QNAME, FareClassFacilityEnumeration.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ArrivalBoardingActivityEnumeration }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.siri.org.uk/siri", name = "ArrivalBoardingActivity", defaultValue = "alighting")
    public JAXBElement<ArrivalBoardingActivityEnumeration> createArrivalBoardingActivity(ArrivalBoardingActivityEnumeration value) {
        return new JAXBElement<ArrivalBoardingActivityEnumeration>(_ArrivalBoardingActivity_QNAME, ArrivalBoardingActivityEnumeration.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link StopTimetableDeliveryStructure }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.siri.org.uk/siri", name = "StopTimetableDelivery", substitutionHeadNamespace = "http://www.siri.org.uk/siri", substitutionHeadName = "AbstractFunctionalServiceDelivery")
    public JAXBElement<StopTimetableDeliveryStructure> createStopTimetableDelivery(StopTimetableDeliveryStructure value) {
        return new JAXBElement<StopTimetableDeliveryStructure>(_StopTimetableDelivery_QNAME, StopTimetableDeliveryStructure.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link FacilityMonitoringCapabilitiesResponseStructure }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.siri.org.uk/siri", name = "FacilityMonitoringCapabilitiesResponse", substitutionHeadNamespace = "http://www.siri.org.uk/siri", substitutionHeadName = "AbstractFunctionalServiceCapabilitiesResponse")
    public JAXBElement<FacilityMonitoringCapabilitiesResponseStructure> createFacilityMonitoringCapabilitiesResponse(FacilityMonitoringCapabilitiesResponseStructure value) {
        return new JAXBElement<FacilityMonitoringCapabilitiesResponseStructure>(_FacilityMonitoringCapabilitiesResponse_QNAME, FacilityMonitoringCapabilitiesResponseStructure.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link LinkProjectionStructure }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.ifopt.org.uk/ifopt", name = "LinkProjection")
    public JAXBElement<LinkProjectionStructure> createLinkProjection(LinkProjectionStructure value) {
        return new JAXBElement<LinkProjectionStructure>(_LinkProjection_QNAME, LinkProjectionStructure.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link StopMonitoringSubscriptionStructure }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.siri.org.uk/siri", name = "StopMonitoringSubscriptionRequest", substitutionHeadNamespace = "http://www.siri.org.uk/siri", substitutionHeadName = "AbstractFunctionalServiceSubscriptionRequest")
    public JAXBElement<StopMonitoringSubscriptionStructure> createStopMonitoringSubscriptionRequest(StopMonitoringSubscriptionStructure value) {
        return new JAXBElement<StopMonitoringSubscriptionStructure>(_StopMonitoringSubscriptionRequest_QNAME, StopMonitoringSubscriptionStructure.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link WaterSubmodesOfTransportEnumeration }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.siri.org.uk/siri", name = "WaterSubmode", defaultValue = "unknown")
    public JAXBElement<WaterSubmodesOfTransportEnumeration> createWaterSubmode(WaterSubmodesOfTransportEnumeration value) {
        return new JAXBElement<WaterSubmodesOfTransportEnumeration>(_WaterSubmode_QNAME, WaterSubmodesOfTransportEnumeration.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link EstimatedVehicleJourneyStructure }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.siri.org.uk/siri", name = "EstimatedVehicleJourney")
    public JAXBElement<EstimatedVehicleJourneyStructure> createEstimatedVehicleJourney(EstimatedVehicleJourneyStructure value) {
        return new JAXBElement<EstimatedVehicleJourneyStructure>(_EstimatedVehicleJourney_QNAME, EstimatedVehicleJourneyStructure.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link SituationFullRefStructure }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.siri.org.uk/siri", name = "SituationFullRef")
    public JAXBElement<SituationFullRefStructure> createSituationFullRef(SituationFullRefStructure value) {
        return new JAXBElement<SituationFullRefStructure>(_SituationFullRef_QNAME, SituationFullRefStructure.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link AccessFacilityEnumeration }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.siri.org.uk/siri", name = "AccessFacility", defaultValue = "unknown")
    public JAXBElement<AccessFacilityEnumeration> createAccessFacility(AccessFacilityEnumeration value) {
        return new JAXBElement<AccessFacilityEnumeration>(_AccessFacility_QNAME, AccessFacilityEnumeration.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link FacilityMonitoringRequestStructure }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.siri.org.uk/siri", name = "FacilityMonitoringRequest", substitutionHeadNamespace = "http://www.siri.org.uk/siri", substitutionHeadName = "AbstractFunctionalServiceRequest")
    public JAXBElement<FacilityMonitoringRequestStructure> createFacilityMonitoringRequest(FacilityMonitoringRequestStructure value) {
        return new JAXBElement<FacilityMonitoringRequestStructure>(_FacilityMonitoringRequest_QNAME, FacilityMonitoringRequestStructure.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link StopTimetableServiceCapabilitiesStructure }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.siri.org.uk/siri", name = "StopTimetableServiceCapabilities")
    public JAXBElement<StopTimetableServiceCapabilitiesStructure> createStopTimetableServiceCapabilities(StopTimetableServiceCapabilitiesStructure value) {
        return new JAXBElement<StopTimetableServiceCapabilitiesStructure>(_StopTimetableServiceCapabilities_QNAME, StopTimetableServiceCapabilitiesStructure.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link RefreshmentFacilityEnumeration }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.siri.org.uk/siri", name = "RefreshmentFacility", defaultValue = "unknown")
    public JAXBElement<RefreshmentFacilityEnumeration> createRefreshmentFacility(RefreshmentFacilityEnumeration value) {
        return new JAXBElement<RefreshmentFacilityEnumeration>(_RefreshmentFacility_QNAME, RefreshmentFacilityEnumeration.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link InfoChannelDeliveryStructure }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.siri.org.uk/siri", name = "InfoChannelDelivery", substitutionHeadNamespace = "http://www.siri.org.uk/siri", substitutionHeadName = "AbstractDiscoveryDelivery")
    public JAXBElement<InfoChannelDeliveryStructure> createInfoChannelDelivery(InfoChannelDeliveryStructure value) {
        return new JAXBElement<InfoChannelDeliveryStructure>(_InfoChannelDelivery_QNAME, InfoChannelDeliveryStructure.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link NaturalLanguageStringStructure }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.siri.org.uk/siri", name = "RouteName")
    public JAXBElement<NaturalLanguageStringStructure> createRouteName(NaturalLanguageStringStructure value) {
        return new JAXBElement<NaturalLanguageStringStructure>(_RouteName_QNAME, NaturalLanguageStringStructure.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link NotifyByPagerActionStructure }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.siri.org.uk/siri", name = "NotifyByPagerAction")
    public JAXBElement<NotifyByPagerActionStructure> createNotifyByPagerAction(NotifyByPagerActionStructure value) {
        return new JAXBElement<NotifyByPagerActionStructure>(_NotifyByPagerAction_QNAME, NotifyByPagerActionStructure.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ConnectionTimetableDeliveryStructure }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.siri.org.uk/siri", name = "ConnectionTimetableDelivery", substitutionHeadNamespace = "http://www.siri.org.uk/siri", substitutionHeadName = "AbstractFunctionalServiceDelivery")
    public JAXBElement<ConnectionTimetableDeliveryStructure> createConnectionTimetableDelivery(ConnectionTimetableDeliveryStructure value) {
        return new JAXBElement<ConnectionTimetableDeliveryStructure>(_ConnectionTimetableDelivery_QNAME, ConnectionTimetableDeliveryStructure.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link EstimatedTimetableSubscriptionStructure }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.siri.org.uk/siri", name = "EstimatedTimetableSubscriptionRequest", substitutionHeadNamespace = "http://www.siri.org.uk/siri", substitutionHeadName = "AbstractFunctionalServiceSubscriptionRequest")
    public JAXBElement<EstimatedTimetableSubscriptionStructure> createEstimatedTimetableSubscriptionRequest(EstimatedTimetableSubscriptionStructure value) {
        return new JAXBElement<EstimatedTimetableSubscriptionStructure>(_EstimatedTimetableSubscriptionRequest_QNAME, EstimatedTimetableSubscriptionStructure.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link HireFacilityEnumeration }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.siri.org.uk/siri", name = "HireFacility", defaultValue = "unknown")
    public JAXBElement<HireFacilityEnumeration> createHireFacility(HireFacilityEnumeration value) {
        return new JAXBElement<HireFacilityEnumeration>(_HireFacility_QNAME, HireFacilityEnumeration.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GeneralMessageRequestStructure }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.siri.org.uk/siri", name = "GeneralMessageRequest", substitutionHeadNamespace = "http://www.siri.org.uk/siri", substitutionHeadName = "AbstractFunctionalServiceRequest")
    public JAXBElement<GeneralMessageRequestStructure> createGeneralMessageRequest(GeneralMessageRequestStructure value) {
        return new JAXBElement<GeneralMessageRequestStructure>(_GeneralMessageRequest_QNAME, GeneralMessageRequestStructure.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link AirSubmodesOfTransportEnumeration }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.siri.org.uk/siri", name = "AirSubmode", defaultValue = "unknown")
    public JAXBElement<AirSubmodesOfTransportEnumeration> createAirSubmode(AirSubmodesOfTransportEnumeration value) {
        return new JAXBElement<AirSubmodesOfTransportEnumeration>(_AirSubmode_QNAME, AirSubmodesOfTransportEnumeration.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link MiscellaneousSubReasonEnumeration }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.siri.org.uk/siri", name = "MiscellaneousSubReason")
    public JAXBElement<MiscellaneousSubReasonEnumeration> createMiscellaneousSubReason(MiscellaneousSubReasonEnumeration value) {
        return new JAXBElement<MiscellaneousSubReasonEnumeration>(_MiscellaneousSubReason_QNAME, MiscellaneousSubReasonEnumeration.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link RailSubmodesOfTransportEnumeration }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.siri.org.uk/siri", name = "RailSubmode", defaultValue = "unknown")
    public JAXBElement<RailSubmodesOfTransportEnumeration> createRailSubmode(RailSubmodesOfTransportEnumeration value) {
        return new JAXBElement<RailSubmodesOfTransportEnumeration>(_RailSubmode_QNAME, RailSubmodesOfTransportEnumeration.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ProductionTimetableCapabilitiesResponseStructure }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.siri.org.uk/siri", name = "ProductionTimetableCapabilitiesResponse", substitutionHeadNamespace = "http://www.siri.org.uk/siri", substitutionHeadName = "AbstractFunctionalServiceCapabilitiesResponse")
    public JAXBElement<ProductionTimetableCapabilitiesResponseStructure> createProductionTimetableCapabilitiesResponse(ProductionTimetableCapabilitiesResponseStructure value) {
        return new JAXBElement<ProductionTimetableCapabilitiesResponseStructure>(_ProductionTimetableCapabilitiesResponse_QNAME, ProductionTimetableCapabilitiesResponseStructure.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link LuggageFacilityEnumeration }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.siri.org.uk/siri", name = "LuggageFacility", defaultValue = "unknown")
    public JAXBElement<LuggageFacilityEnumeration> createLuggageFacility(LuggageFacilityEnumeration value) {
        return new JAXBElement<LuggageFacilityEnumeration>(_LuggageFacility_QNAME, LuggageFacilityEnumeration.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link PersonnelSubReasonEnumeration }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.siri.org.uk/siri", name = "PersonnelSubReason")
    public JAXBElement<PersonnelSubReasonEnumeration> createPersonnelSubReason(PersonnelSubReasonEnumeration value) {
        return new JAXBElement<PersonnelSubReasonEnumeration>(_PersonnelSubReason_QNAME, PersonnelSubReasonEnumeration.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GeneralMessageSubscriptionStructure }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.siri.org.uk/siri", name = "GeneralMessageSubscriptionRequest", substitutionHeadNamespace = "http://www.siri.org.uk/siri", substitutionHeadName = "AbstractFunctionalServiceSubscriptionRequest")
    public JAXBElement<GeneralMessageSubscriptionStructure> createGeneralMessageSubscriptionRequest(GeneralMessageSubscriptionStructure value) {
        return new JAXBElement<GeneralMessageSubscriptionStructure>(_GeneralMessageSubscriptionRequest_QNAME, GeneralMessageSubscriptionStructure.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link EnvironmentSubReasonEnumeration }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.siri.org.uk/siri", name = "EnvironmentSubReason")
    public JAXBElement<EnvironmentSubReasonEnumeration> createEnvironmentSubReason(EnvironmentSubReasonEnumeration value) {
        return new JAXBElement<EnvironmentSubReasonEnumeration>(_EnvironmentSubReason_QNAME, EnvironmentSubReasonEnumeration.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link TramSubmodesOfTransportEnumeration }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.siri.org.uk/siri", name = "TramSubmode", defaultValue = "unknown")
    public JAXBElement<TramSubmodesOfTransportEnumeration> createTramSubmode(TramSubmodesOfTransportEnumeration value) {
        return new JAXBElement<TramSubmodesOfTransportEnumeration>(_TramSubmode_QNAME, TramSubmodesOfTransportEnumeration.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link SituationExchangeServiceCapabilitiesStructure }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.siri.org.uk/siri", name = "SituationExchangeServiceCapabilities")
    public JAXBElement<SituationExchangeServiceCapabilitiesStructure> createSituationExchangeServiceCapabilities(SituationExchangeServiceCapabilitiesStructure value) {
        return new JAXBElement<SituationExchangeServiceCapabilitiesStructure>(_SituationExchangeServiceCapabilities_QNAME, SituationExchangeServiceCapabilitiesStructure.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Boolean }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.siri.org.uk/siri", name = "FilterByStopPointRef", defaultValue = "true")
    public JAXBElement<Boolean> createFilterByStopPointRef(Boolean value) {
        return new JAXBElement<Boolean>(_FilterByStopPointRef_QNAME, Boolean.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link InfoMessageCancellationStructure }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.siri.org.uk/siri", name = "GeneralMessageCancellation")
    public JAXBElement<InfoMessageCancellationStructure> createGeneralMessageCancellation(InfoMessageCancellationStructure value) {
        return new JAXBElement<InfoMessageCancellationStructure>(_GeneralMessageCancellation_QNAME, InfoMessageCancellationStructure.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link NotifyBySmsActionStructure }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.siri.org.uk/siri", name = "NotifyBySmsAction")
    public JAXBElement<NotifyBySmsActionStructure> createNotifyBySmsAction(NotifyBySmsActionStructure value) {
        return new JAXBElement<NotifyBySmsActionStructure>(_NotifyBySmsAction_QNAME, NotifyBySmsActionStructure.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link CapabilitiesRequestStructure }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.siri.org.uk/siri", name = "CapabilitiesRequest")
    public JAXBElement<CapabilitiesRequestStructure> createCapabilitiesRequest(CapabilitiesRequestStructure value) {
        return new JAXBElement<CapabilitiesRequestStructure>(_CapabilitiesRequest_QNAME, CapabilitiesRequestStructure.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link NaturalLanguageStringStructure }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.siri.org.uk/siri", name = "DeparturePlatformName")
    public JAXBElement<NaturalLanguageStringStructure> createDeparturePlatformName(NaturalLanguageStringStructure value) {
        return new JAXBElement<NaturalLanguageStringStructure>(_DeparturePlatformName_QNAME, NaturalLanguageStringStructure.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ServiceDeliveryErrorConditionStructure }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.siri.org.uk/siri", name = "ServiceDeliveryErrorCondition")
    public JAXBElement<ServiceDeliveryErrorConditionStructure> createServiceDeliveryErrorCondition(ServiceDeliveryErrorConditionStructure value) {
        return new JAXBElement<ServiceDeliveryErrorConditionStructure>(_ServiceDeliveryErrorCondition_QNAME, ServiceDeliveryErrorConditionStructure.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link StopTimetableSubscriptionStructure }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.siri.org.uk/siri", name = "StopTimetableSubscriptionRequest", substitutionHeadNamespace = "http://www.siri.org.uk/siri", substitutionHeadName = "AbstractFunctionalServiceSubscriptionRequest")
    public JAXBElement<StopTimetableSubscriptionStructure> createStopTimetableSubscriptionRequest(StopTimetableSubscriptionStructure value) {
        return new JAXBElement<StopTimetableSubscriptionStructure>(_StopTimetableSubscriptionRequest_QNAME, StopTimetableSubscriptionStructure.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ConnectionMonitoringRequestStructure }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.siri.org.uk/siri", name = "ConnectionMonitoringRequest", substitutionHeadNamespace = "http://www.siri.org.uk/siri", substitutionHeadName = "AbstractFunctionalServiceRequest")
    public JAXBElement<ConnectionMonitoringRequestStructure> createConnectionMonitoringRequest(ConnectionMonitoringRequestStructure value) {
        return new JAXBElement<ConnectionMonitoringRequestStructure>(_ConnectionMonitoringRequest_QNAME, ConnectionMonitoringRequestStructure.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link DataReceivedResponseStructure }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.siri.org.uk/siri", name = "DataReceivedAcknowledgement", substitutionHeadNamespace = "http://www.siri.org.uk/siri", substitutionHeadName = "AbstractResponse")
    public JAXBElement<DataReceivedResponseStructure> createDataReceivedAcknowledgement(DataReceivedResponseStructure value) {
        return new JAXBElement<DataReceivedResponseStructure>(_DataReceivedAcknowledgement_QNAME, DataReceivedResponseStructure.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link StopMonitoringRequestStructure }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.siri.org.uk/siri", name = "StopMonitoringRequest", substitutionHeadNamespace = "http://www.siri.org.uk/siri", substitutionHeadName = "AbstractFunctionalServiceRequest")
    public JAXBElement<StopMonitoringRequestStructure> createStopMonitoringRequest(StopMonitoringRequestStructure value) {
        return new JAXBElement<StopMonitoringRequestStructure>(_StopMonitoringRequest_QNAME, StopMonitoringRequestStructure.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ConnectionTimetableServiceCapabilitiesStructure }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.siri.org.uk/siri", name = "ConnectionMonitoringServiceCapabilities")
    public JAXBElement<ConnectionTimetableServiceCapabilitiesStructure> createConnectionMonitoringServiceCapabilities(ConnectionTimetableServiceCapabilitiesStructure value) {
        return new JAXBElement<ConnectionTimetableServiceCapabilitiesStructure>(_ConnectionMonitoringServiceCapabilities_QNAME, ConnectionTimetableServiceCapabilitiesStructure.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ConnectionMonitoringDistributorDeliveryStructure }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.siri.org.uk/siri", name = "ConnectionMonitoringDistributorDelivery", substitutionHeadNamespace = "http://www.siri.org.uk/siri", substitutionHeadName = "AbstractFunctionalServiceDelivery")
    public JAXBElement<ConnectionMonitoringDistributorDeliveryStructure> createConnectionMonitoringDistributorDelivery(ConnectionMonitoringDistributorDeliveryStructure value) {
        return new JAXBElement<ConnectionMonitoringDistributorDeliveryStructure>(_ConnectionMonitoringDistributorDelivery_QNAME, ConnectionMonitoringDistributorDeliveryStructure.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link PtSituationElementStructure }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.siri.org.uk/siri", name = "PtSituationElement")
    public JAXBElement<PtSituationElementStructure> createPtSituationElement(PtSituationElementStructure value) {
        return new JAXBElement<PtSituationElementStructure>(_PtSituationElement_QNAME, PtSituationElementStructure.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ServiceCapabilitiesRequestStructure }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.siri.org.uk/siri", name = "GeneralMessageCapabilitiesRequest", substitutionHeadNamespace = "http://www.siri.org.uk/siri", substitutionHeadName = "AbstractFunctionalServiceCapabilitiesRequest")
    public JAXBElement<ServiceCapabilitiesRequestStructure> createGeneralMessageCapabilitiesRequest(ServiceCapabilitiesRequestStructure value) {
        return new JAXBElement<ServiceCapabilitiesRequestStructure>(_GeneralMessageCapabilitiesRequest_QNAME, ServiceCapabilitiesRequestStructure.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Boolean }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.siri.org.uk/siri", name = "FilterByConnectionLinkRef", defaultValue = "true")
    public JAXBElement<Boolean> createFilterByConnectionLinkRef(Boolean value) {
        return new JAXBElement<Boolean>(_FilterByConnectionLinkRef_QNAME, Boolean.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link AbstractServiceRequestStructure }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.siri.org.uk/siri", name = "AbstractFunctionalServiceCapabilitiesRequest", substitutionHeadNamespace = "http://www.siri.org.uk/siri", substitutionHeadName = "AbstractServiceRequest")
    public JAXBElement<AbstractServiceRequestStructure> createAbstractFunctionalServiceCapabilitiesRequest(AbstractServiceRequestStructure value) {
        return new JAXBElement<AbstractServiceRequestStructure>(_AbstractFunctionalServiceCapabilitiesRequest_QNAME, AbstractServiceRequestStructure.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ServiceFeaturesDiscoveryRequestStructure }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.siri.org.uk/siri", name = "ServiceFeaturesRequest", substitutionHeadNamespace = "http://www.siri.org.uk/siri", substitutionHeadName = "AbstractDiscoveryRequest")
    public JAXBElement<ServiceFeaturesDiscoveryRequestStructure> createServiceFeaturesRequest(ServiceFeaturesDiscoveryRequestStructure value) {
        return new JAXBElement<ServiceFeaturesDiscoveryRequestStructure>(_ServiceFeaturesRequest_QNAME, ServiceFeaturesDiscoveryRequestStructure.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link DataReadyResponseStructure }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.siri.org.uk/siri", name = "DataReadyAcknowledgement", substitutionHeadNamespace = "http://www.siri.org.uk/siri", substitutionHeadName = "AbstractResponse")
    public JAXBElement<DataReadyResponseStructure> createDataReadyAcknowledgement(DataReadyResponseStructure value) {
        return new JAXBElement<DataReadyResponseStructure>(_DataReadyAcknowledgement_QNAME, DataReadyResponseStructure.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ConnectionTimetableSubscriptionStructure }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.siri.org.uk/siri", name = "ConnectionTimetableSubscriptionRequest", substitutionHeadNamespace = "http://www.siri.org.uk/siri", substitutionHeadName = "AbstractFunctionalServiceSubscriptionRequest")
    public JAXBElement<ConnectionTimetableSubscriptionStructure> createConnectionTimetableSubscriptionRequest(ConnectionTimetableSubscriptionStructure value) {
        return new JAXBElement<ConnectionTimetableSubscriptionStructure>(_ConnectionTimetableSubscriptionRequest_QNAME, ConnectionTimetableSubscriptionStructure.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link InterchangeStatusEnumeration }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.siri.org.uk/siri", name = "InterchangeStatusType", defaultValue = "unknown")
    public JAXBElement<InterchangeStatusEnumeration> createInterchangeStatusType(InterchangeStatusEnumeration value) {
        return new JAXBElement<InterchangeStatusEnumeration>(_InterchangeStatusType_QNAME, InterchangeStatusEnumeration.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link XMLGregorianCalendar }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.siri.org.uk/siri", name = "ExpectedArrivalTime")
    public JAXBElement<XMLGregorianCalendar> createExpectedArrivalTime(XMLGregorianCalendar value) {
        return new JAXBElement<XMLGregorianCalendar>(_ExpectedArrivalTime_QNAME, XMLGregorianCalendar.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link InfoChannelStructure }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.siri.org.uk/siri", name = "InfoChannel")
    public JAXBElement<InfoChannelStructure> createInfoChannel(InfoChannelStructure value) {
        return new JAXBElement<InfoChannelStructure>(_InfoChannel_QNAME, InfoChannelStructure.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ConnectionMonitoringFeederDeliveryStructure }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.siri.org.uk/siri", name = "ConnectionMonitoringFeederDelivery", substitutionHeadNamespace = "http://www.siri.org.uk/siri", substitutionHeadName = "AbstractFunctionalServiceDelivery")
    public JAXBElement<ConnectionMonitoringFeederDeliveryStructure> createConnectionMonitoringFeederDelivery(ConnectionMonitoringFeederDeliveryStructure value) {
        return new JAXBElement<ConnectionMonitoringFeederDeliveryStructure>(_ConnectionMonitoringFeederDelivery_QNAME, ConnectionMonitoringFeederDeliveryStructure.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link PublishToAlertsActionStructure }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.siri.org.uk/siri", name = "PublishToAlertsAction")
    public JAXBElement<PublishToAlertsActionStructure> createPublishToAlertsAction(PublishToAlertsActionStructure value) {
        return new JAXBElement<PublishToAlertsActionStructure>(_PublishToAlertsAction_QNAME, PublishToAlertsActionStructure.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Boolean }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.siri.org.uk/siri", name = "FilterByDestination", defaultValue = "false")
    public JAXBElement<Boolean> createFilterByDestination(Boolean value) {
        return new JAXBElement<Boolean>(_FilterByDestination_QNAME, Boolean.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link NavigationPathRefStructure }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.ifopt.org.uk/ifopt", name = "NavigationPathRef")
    public JAXBElement<NavigationPathRefStructure> createNavigationPathRef(NavigationPathRefStructure value) {
        return new JAXBElement<NavigationPathRefStructure>(_NavigationPathRef_QNAME, NavigationPathRefStructure.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link RetailFacilityEnumeration }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.siri.org.uk/siri", name = "RetailFacility", defaultValue = "unknown")
    public JAXBElement<RetailFacilityEnumeration> createRetailFacility(RetailFacilityEnumeration value) {
        return new JAXBElement<RetailFacilityEnumeration>(_RetailFacility_QNAME, RetailFacilityEnumeration.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link PathJunctionRefStructure }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.ifopt.org.uk/ifopt", name = "PathJunctionRef")
    public JAXBElement<PathJunctionRefStructure> createPathJunctionRef(PathJunctionRefStructure value) {
        return new JAXBElement<PathJunctionRefStructure>(_PathJunctionRef_QNAME, PathJunctionRefStructure.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link LocalServiceStructure }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.ifopt.org.uk/ifopt", name = "LocalService")
    public JAXBElement<LocalServiceStructure> createLocalService(LocalServiceStructure value) {
        return new JAXBElement<LocalServiceStructure>(_LocalService_QNAME, LocalServiceStructure.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link AccessibilityStructure }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.ifopt.org.uk/acsb", name = "LiftFreeAccess", defaultValue = "unknown")
    public JAXBElement<AccessibilityStructure> createLiftFreeAccess(AccessibilityStructure value) {
        return new JAXBElement<AccessibilityStructure>(_LiftFreeAccess_QNAME, AccessibilityStructure.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Boolean }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.siri.org.uk/siri", name = "FilterByLineRef", defaultValue = "true")
    public JAXBElement<Boolean> createFilterByLineRef(Boolean value) {
        return new JAXBElement<Boolean>(_FilterByLineRef_QNAME, Boolean.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link FeatureRefStructure }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.siri.org.uk/siri", name = "FeatureRef")
    public JAXBElement<FeatureRefStructure> createFeatureRef(FeatureRefStructure value) {
        return new JAXBElement<FeatureRefStructure>(_FeatureRef_QNAME, FeatureRefStructure.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link LinesDeliveryStructure }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.siri.org.uk/siri", name = "LinesDelivery", substitutionHeadNamespace = "http://www.siri.org.uk/siri", substitutionHeadName = "AbstractDiscoveryDelivery")
    public JAXBElement<LinesDeliveryStructure> createLinesDelivery(LinesDeliveryStructure value) {
        return new JAXBElement<LinesDeliveryStructure>(_LinesDelivery_QNAME, LinesDeliveryStructure.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link OtherErrorStructure }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.siri.org.uk/siri", name = "OtherError", substitutionHeadNamespace = "http://www.siri.org.uk/siri", substitutionHeadName = "ErrorCode")
    public JAXBElement<OtherErrorStructure> createOtherError(OtherErrorStructure value) {
        return new JAXBElement<OtherErrorStructure>(_OtherError_QNAME, OtherErrorStructure.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link StopMonitoringDeliveryStructure }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.siri.org.uk/siri", name = "StopMonitoringDelivery", substitutionHeadNamespace = "http://www.siri.org.uk/siri", substitutionHeadName = "AbstractFunctionalServiceDelivery")
    public JAXBElement<StopMonitoringDeliveryStructure> createStopMonitoringDelivery(StopMonitoringDeliveryStructure value) {
        return new JAXBElement<StopMonitoringDeliveryStructure>(_StopMonitoringDelivery_QNAME, StopMonitoringDeliveryStructure.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link EstimatedTimetableRequestStructure }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.siri.org.uk/siri", name = "EstimatedTimetableRequest", substitutionHeadNamespace = "http://www.siri.org.uk/siri", substitutionHeadName = "AbstractFunctionalServiceRequest")
    public JAXBElement<EstimatedTimetableRequestStructure> createEstimatedTimetableRequest(EstimatedTimetableRequestStructure value) {
        return new JAXBElement<EstimatedTimetableRequestStructure>(_EstimatedTimetableRequest_QNAME, EstimatedTimetableRequestStructure.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link InfoMessageStructure }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.siri.org.uk/siri", name = "GeneralMessage")
    public JAXBElement<InfoMessageStructure> createGeneralMessage(InfoMessageStructure value) {
        return new JAXBElement<InfoMessageStructure>(_GeneralMessage_QNAME, InfoMessageStructure.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link NaturalLanguagePlaceNameStructure }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.siri.org.uk/siri", name = "OriginName")
    public JAXBElement<NaturalLanguagePlaceNameStructure> createOriginName(NaturalLanguagePlaceNameStructure value) {
        return new JAXBElement<NaturalLanguagePlaceNameStructure>(_OriginName_QNAME, NaturalLanguagePlaceNameStructure.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link TelecabinSubmodesOfTransportEnumeration }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.siri.org.uk/siri", name = "TelecabinSubmode", defaultValue = "unknown")
    public JAXBElement<TelecabinSubmodesOfTransportEnumeration> createTelecabinSubmode(TelecabinSubmodesOfTransportEnumeration value) {
        return new JAXBElement<TelecabinSubmodesOfTransportEnumeration>(_TelecabinSubmode_QNAME, TelecabinSubmodesOfTransportEnumeration.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link VerificationStatusEnumeration }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.siri.org.uk/siri", name = "VerificationStatus")
    public JAXBElement<VerificationStatusEnumeration> createVerificationStatus(VerificationStatusEnumeration value) {
        return new JAXBElement<VerificationStatusEnumeration>(_VerificationStatus_QNAME, VerificationStatusEnumeration.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ServiceCapabilitiesRequestStructure }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.siri.org.uk/siri", name = "VehicleMonitoringCapabilitiesRequest", substitutionHeadNamespace = "http://www.siri.org.uk/siri", substitutionHeadName = "AbstractFunctionalServiceCapabilitiesRequest")
    public JAXBElement<ServiceCapabilitiesRequestStructure> createVehicleMonitoringCapabilitiesRequest(ServiceCapabilitiesRequestStructure value) {
        return new JAXBElement<ServiceCapabilitiesRequestStructure>(_VehicleMonitoringCapabilitiesRequest_QNAME, ServiceCapabilitiesRequestStructure.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ServiceNotAvailableErrorStructure }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.siri.org.uk/siri", name = "ServiceNotAvailableError", substitutionHeadNamespace = "http://www.siri.org.uk/siri", substitutionHeadName = "ErrorCode")
    public JAXBElement<ServiceNotAvailableErrorStructure> createServiceNotAvailableError(ServiceNotAvailableErrorStructure value) {
        return new JAXBElement<ServiceNotAvailableErrorStructure>(_ServiceNotAvailableError_QNAME, ServiceNotAvailableErrorStructure.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link D2LogicalModel }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://datex2.eu/schema/1_0/1_0", name = "d2LogicalModel")
    public JAXBElement<D2LogicalModel> createD2LogicalModel(D2LogicalModel value) {
        return new JAXBElement<D2LogicalModel>(_D2LogicalModel_QNAME, D2LogicalModel.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link NotifyByEmailActionStructure }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.siri.org.uk/siri", name = "NotifyByEmailAction")
    public JAXBElement<NotifyByEmailActionStructure> createNotifyByEmailAction(NotifyByEmailActionStructure value) {
        return new JAXBElement<NotifyByEmailActionStructure>(_NotifyByEmailAction_QNAME, NotifyByEmailActionStructure.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link AbstractServiceCapabilitiesResponseStructure }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.siri.org.uk/siri", name = "AbstractFunctionalServiceCapabilitiesResponse", substitutionHeadNamespace = "http://www.siri.org.uk/siri", substitutionHeadName = "AbstractResponse")
    public JAXBElement<AbstractServiceCapabilitiesResponseStructure> createAbstractFunctionalServiceCapabilitiesResponse(AbstractServiceCapabilitiesResponseStructure value) {
        return new JAXBElement<AbstractServiceCapabilitiesResponseStructure>(_AbstractFunctionalServiceCapabilitiesResponse_QNAME, AbstractServiceCapabilitiesResponseStructure.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link LineRefStructure }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.siri.org.uk/siri", name = "LineRef")
    public JAXBElement<LineRefStructure> createLineRef(LineRefStructure value) {
        return new JAXBElement<LineRefStructure>(_LineRef_QNAME, LineRefStructure.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link AllowedResourceUsageExceededErrorStructure }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.siri.org.uk/siri", name = "AllowedResourceUsageExceededError", substitutionHeadNamespace = "http://www.siri.org.uk/siri", substitutionHeadName = "ErrorCode")
    public JAXBElement<AllowedResourceUsageExceededErrorStructure> createAllowedResourceUsageExceededError(AllowedResourceUsageExceededErrorStructure value) {
        return new JAXBElement<AllowedResourceUsageExceededErrorStructure>(_AllowedResourceUsageExceededError_QNAME, AllowedResourceUsageExceededErrorStructure.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link PointProjectionStructure }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.ifopt.org.uk/ifopt", name = "PointProjection")
    public JAXBElement<PointProjectionStructure> createPointProjection(PointProjectionStructure value) {
        return new JAXBElement<PointProjectionStructure>(_PointProjection_QNAME, PointProjectionStructure.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link AnnotatedDestinationStructure }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.siri.org.uk/siri", name = "Destination")
    public JAXBElement<AnnotatedDestinationStructure> createDestination(AnnotatedDestinationStructure value) {
        return new JAXBElement<AnnotatedDestinationStructure>(_Destination_QNAME, AnnotatedDestinationStructure.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link StopMonitoringServiceCapabilitiesStructure }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.siri.org.uk/siri", name = "StopMonitoringServiceCapabilities")
    public JAXBElement<StopMonitoringServiceCapabilitiesStructure> createStopMonitoringServiceCapabilities(StopMonitoringServiceCapabilitiesStructure value) {
        return new JAXBElement<StopMonitoringServiceCapabilitiesStructure>(_StopMonitoringServiceCapabilities_QNAME, StopMonitoringServiceCapabilitiesStructure.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link DestinationRefStructure }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.siri.org.uk/siri", name = "DestinationRef")
    public JAXBElement<DestinationRefStructure> createDestinationRef(DestinationRefStructure value) {
        return new JAXBElement<DestinationRefStructure>(_DestinationRef_QNAME, DestinationRefStructure.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link MetroSubmodesOfTransportEnumeration }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.siri.org.uk/siri", name = "MetroSubmode", defaultValue = "unknown")
    public JAXBElement<MetroSubmodesOfTransportEnumeration> createMetroSubmode(MetroSubmodesOfTransportEnumeration value) {
        return new JAXBElement<MetroSubmodesOfTransportEnumeration>(_MetroSubmode_QNAME, MetroSubmodesOfTransportEnumeration.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Boolean }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.siri.org.uk/siri", name = "FilterByInterchangeRef", defaultValue = "false")
    public JAXBElement<Boolean> createFilterByInterchangeRef(Boolean value) {
        return new JAXBElement<Boolean>(_FilterByInterchangeRef_QNAME, Boolean.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link BookingStatusEnumeration }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.siri.org.uk/siri", name = "BookingStatusType", defaultValue = "unknown")
    public JAXBElement<BookingStatusEnumeration> createBookingStatusType(BookingStatusEnumeration value) {
        return new JAXBElement<BookingStatusEnumeration>(_BookingStatusType_QNAME, BookingStatusEnumeration.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link VehicleRefStructure }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.siri.org.uk/siri", name = "VehicleRef")
    public JAXBElement<VehicleRefStructure> createVehicleRef(VehicleRefStructure value) {
        return new JAXBElement<VehicleRefStructure>(_VehicleRef_QNAME, VehicleRefStructure.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link DatedCallStructure }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.siri.org.uk/siri", name = "DatedCall")
    public JAXBElement<DatedCallStructure> createDatedCall(DatedCallStructure value) {
        return new JAXBElement<DatedCallStructure>(_DatedCall_QNAME, DatedCallStructure.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link CapabilitiesResponseStructure }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.siri.org.uk/siri", name = "CapabilitiesResponse")
    public JAXBElement<CapabilitiesResponseStructure> createCapabilitiesResponse(CapabilitiesResponseStructure value) {
        return new JAXBElement<CapabilitiesResponseStructure>(_CapabilitiesResponse_QNAME, CapabilitiesResponseStructure.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link PublishToTvActionStructure }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.siri.org.uk/siri", name = "PublishToTvAction")
    public JAXBElement<PublishToTvActionStructure> createPublishToTvAction(PublishToTvActionStructure value) {
        return new JAXBElement<PublishToTvActionStructure>(_PublishToTvAction_QNAME, PublishToTvActionStructure.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link NaturalLanguagePlaceNameStructure }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.siri.org.uk/siri", name = "ViaName")
    public JAXBElement<NaturalLanguagePlaceNameStructure> createViaName(NaturalLanguagePlaceNameStructure value) {
        return new JAXBElement<NaturalLanguagePlaceNameStructure>(_ViaName_QNAME, NaturalLanguagePlaceNameStructure.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link VehicleFeaturesDiscoveryRequestStructure }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.siri.org.uk/siri", name = "VehicleFeaturesRequest", substitutionHeadNamespace = "http://www.siri.org.uk/siri", substitutionHeadName = "AbstractDiscoveryRequest")
    public JAXBElement<VehicleFeaturesDiscoveryRequestStructure> createVehicleFeaturesRequest(VehicleFeaturesDiscoveryRequestStructure value) {
        return new JAXBElement<VehicleFeaturesDiscoveryRequestStructure>(_VehicleFeaturesRequest_QNAME, VehicleFeaturesDiscoveryRequestStructure.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link XMLGregorianCalendar }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.siri.org.uk/siri", name = "AimedArrivalTime")
    public JAXBElement<XMLGregorianCalendar> createAimedArrivalTime(XMLGregorianCalendar value) {
        return new JAXBElement<XMLGregorianCalendar>(_AimedArrivalTime_QNAME, XMLGregorianCalendar.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link VerificationStatusEnumeration }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.siri.org.uk/siri", name = "Predictability")
    public JAXBElement<VerificationStatusEnumeration> createPredictability(VerificationStatusEnumeration value) {
        return new JAXBElement<VerificationStatusEnumeration>(_Predictability_QNAME, VerificationStatusEnumeration.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link AbstractRequestStructure }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.siri.org.uk/siri", name = "AbstractRequest")
    public JAXBElement<AbstractRequestStructure> createAbstractRequest(AbstractRequestStructure value) {
        return new JAXBElement<AbstractRequestStructure>(_AbstractRequest_QNAME, AbstractRequestStructure.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ErrorConditionStructure }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.siri.org.uk/siri", name = "ErrorConditionElement")
    public JAXBElement<ErrorConditionStructure> createErrorConditionElement(ErrorConditionStructure value) {
        return new JAXBElement<ErrorConditionStructure>(_ErrorConditionElement_QNAME, ErrorConditionStructure.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link SituationExchangeCapabilitiesResponseStructure }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.siri.org.uk/siri", name = "SituationExchangeCapabilitiesResponse", substitutionHeadNamespace = "http://www.siri.org.uk/siri", substitutionHeadName = "AbstractFunctionalServiceCapabilitiesResponse")
    public JAXBElement<SituationExchangeCapabilitiesResponseStructure> createSituationExchangeCapabilitiesResponse(SituationExchangeCapabilitiesResponseStructure value) {
        return new JAXBElement<SituationExchangeCapabilitiesResponseStructure>(_SituationExchangeCapabilitiesResponse_QNAME, SituationExchangeCapabilitiesResponseStructure.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link PlaceEquipmentStructure }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.ifopt.org.uk/ifopt", name = "OtherPlaceEquipment")
    public JAXBElement<PlaceEquipmentStructure> createOtherPlaceEquipment(PlaceEquipmentStructure value) {
        return new JAXBElement<PlaceEquipmentStructure>(_OtherPlaceEquipment_QNAME, PlaceEquipmentStructure.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link RoadSituationElementStructure }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.siri.org.uk/siri", name = "RoadSituationElement")
    public JAXBElement<RoadSituationElementStructure> createRoadSituationElement(RoadSituationElementStructure value) {
        return new JAXBElement<RoadSituationElementStructure>(_RoadSituationElement_QNAME, RoadSituationElementStructure.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link SubscriptionResponseStructure }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.siri.org.uk/siri", name = "SubscriptionResponse", substitutionHeadNamespace = "http://www.siri.org.uk/siri", substitutionHeadName = "AbstractResponse")
    public JAXBElement<SubscriptionResponseStructure> createSubscriptionResponse(SubscriptionResponseStructure value) {
        return new JAXBElement<SubscriptionResponseStructure>(_SubscriptionResponse_QNAME, SubscriptionResponseStructure.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link VehicleModesOfTransportEnumeration }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.siri.org.uk/siri", name = "VehicleMode", defaultValue = "unknown")
    public JAXBElement<VehicleModesOfTransportEnumeration> createVehicleMode(VehicleModesOfTransportEnumeration value) {
        return new JAXBElement<VehicleModesOfTransportEnumeration>(_VehicleMode_QNAME, VehicleModesOfTransportEnumeration.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link VehicleFeaturesStructure }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.siri.org.uk/siri", name = "VehicleFeature")
    public JAXBElement<VehicleFeaturesStructure> createVehicleFeature(VehicleFeaturesStructure value) {
        return new JAXBElement<VehicleFeaturesStructure>(_VehicleFeature_QNAME, VehicleFeaturesStructure.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link EnvironmentReasonEnumeration }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.siri.org.uk/siri", name = "EnvironmentReason")
    public JAXBElement<EnvironmentReasonEnumeration> createEnvironmentReason(EnvironmentReasonEnumeration value) {
        return new JAXBElement<EnvironmentReasonEnumeration>(_EnvironmentReason_QNAME, EnvironmentReasonEnumeration.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link StopMonitoringCapabilitiesResponseStructure }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.siri.org.uk/siri", name = "StopMonitoringCapabilitiesResponse", substitutionHeadNamespace = "http://www.siri.org.uk/siri", substitutionHeadName = "AbstractFunctionalServiceCapabilitiesResponse")
    public JAXBElement<StopMonitoringCapabilitiesResponseStructure> createStopMonitoringCapabilitiesResponse(StopMonitoringCapabilitiesResponseStructure value) {
        return new JAXBElement<StopMonitoringCapabilitiesResponseStructure>(_StopMonitoringCapabilitiesResponse_QNAME, StopMonitoringCapabilitiesResponseStructure.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link StopPointTypeEnumeration }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.siri.org.uk/siri", name = "StopPointType", defaultValue = "unknown")
    public JAXBElement<StopPointTypeEnumeration> createStopPointType(StopPointTypeEnumeration value) {
        return new JAXBElement<StopPointTypeEnumeration>(_StopPointType_QNAME, StopPointTypeEnumeration.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link NuisanceFacilityEnumeration }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.siri.org.uk/siri", name = "NuisanceFacility", defaultValue = "unknown")
    public JAXBElement<NuisanceFacilityEnumeration> createNuisanceFacility(NuisanceFacilityEnumeration value) {
        return new JAXBElement<NuisanceFacilityEnumeration>(_NuisanceFacility_QNAME, NuisanceFacilityEnumeration.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ServiceCapabilitiesRequestStructure }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.siri.org.uk/siri", name = "StopMonitoringCapabilitiesRequest", substitutionHeadNamespace = "http://www.siri.org.uk/siri", substitutionHeadName = "AbstractFunctionalServiceCapabilitiesRequest")
    public JAXBElement<ServiceCapabilitiesRequestStructure> createStopMonitoringCapabilitiesRequest(ServiceCapabilitiesRequestStructure value) {
        return new JAXBElement<ServiceCapabilitiesRequestStructure>(_StopMonitoringCapabilitiesRequest_QNAME, ServiceCapabilitiesRequestStructure.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link DatedVehicleJourneyRefStructure }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.siri.org.uk/siri", name = "DatedVehicleJourneyRef")
    public JAXBElement<DatedVehicleJourneyRefStructure> createDatedVehicleJourneyRef(DatedVehicleJourneyRefStructure value) {
        return new JAXBElement<DatedVehicleJourneyRefStructure>(_DatedVehicleJourneyRef_QNAME, DatedVehicleJourneyRefStructure.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link PassengerCommsFacilityEnumeration }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.siri.org.uk/siri", name = "PassengerCommsFacility", defaultValue = "unknown")
    public JAXBElement<PassengerCommsFacilityEnumeration> createPassengerCommsFacility(PassengerCommsFacilityEnumeration value) {
        return new JAXBElement<PassengerCommsFacilityEnumeration>(_PassengerCommsFacility_QNAME, PassengerCommsFacilityEnumeration.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Boolean }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.siri.org.uk/siri", name = "FilterByVehicleRef", defaultValue = "false")
    public JAXBElement<Boolean> createFilterByVehicleRef(Boolean value) {
        return new JAXBElement<Boolean>(_FilterByVehicleRef_QNAME, Boolean.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link AssistanceFacilityEnumeration }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.siri.org.uk/siri", name = "AssistanceFacility", defaultValue = "unknown")
    public JAXBElement<AssistanceFacilityEnumeration> createAssistanceFacility(AssistanceFacilityEnumeration value) {
        return new JAXBElement<AssistanceFacilityEnumeration>(_AssistanceFacility_QNAME, AssistanceFacilityEnumeration.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ConnectionTimetableRequestStructure }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.siri.org.uk/siri", name = "ConnectionTimetableRequest", substitutionHeadNamespace = "http://www.siri.org.uk/siri", substitutionHeadName = "AbstractFunctionalServiceRequest")
    public JAXBElement<ConnectionTimetableRequestStructure> createConnectionTimetableRequest(ConnectionTimetableRequestStructure value) {
        return new JAXBElement<ConnectionTimetableRequestStructure>(_ConnectionTimetableRequest_QNAME, ConnectionTimetableRequestStructure.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ParkingFacilityEnumeration }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.siri.org.uk/siri", name = "ParkingFacility")
    public JAXBElement<ParkingFacilityEnumeration> createParkingFacility(ParkingFacilityEnumeration value) {
        return new JAXBElement<ParkingFacilityEnumeration>(_ParkingFacility_QNAME, ParkingFacilityEnumeration.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ProgressStatusEnumeration }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.siri.org.uk/siri", name = "DepartureStatus")
    public JAXBElement<ProgressStatusEnumeration> createDepartureStatus(ProgressStatusEnumeration value) {
        return new JAXBElement<ProgressStatusEnumeration>(_DepartureStatus_QNAME, ProgressStatusEnumeration.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link InfoLinkStructure2 }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.ifopt.org.uk/ifopt", name = "InfoLink")
    public JAXBElement<InfoLinkStructure2> createInfoLink(InfoLinkStructure2 value) {
        return new JAXBElement<InfoLinkStructure2>(_InfoLink_QNAME, InfoLinkStructure2 .class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link EstimatedTimetableServiceCapabilitiesStructure }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.siri.org.uk/siri", name = "EstimatedTimetableServiceCapabilities")
    public JAXBElement<EstimatedTimetableServiceCapabilitiesStructure> createEstimatedTimetableServiceCapabilities(EstimatedTimetableServiceCapabilitiesStructure value) {
        return new JAXBElement<EstimatedTimetableServiceCapabilitiesStructure>(_EstimatedTimetableServiceCapabilities_QNAME, EstimatedTimetableServiceCapabilitiesStructure.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link JourneyPlaceRefStructure }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.siri.org.uk/siri", name = "ViaRef")
    public JAXBElement<JourneyPlaceRefStructure> createViaRef(JourneyPlaceRefStructure value) {
        return new JAXBElement<JourneyPlaceRefStructure>(_ViaRef_QNAME, JourneyPlaceRefStructure.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link AccessibilityStructure }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.ifopt.org.uk/acsb", name = "AudibleSignalsAvailable", defaultValue = "false")
    public JAXBElement<AccessibilityStructure> createAudibleSignalsAvailable(AccessibilityStructure value) {
        return new JAXBElement<AccessibilityStructure>(_AudibleSignalsAvailable_QNAME, AccessibilityStructure.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link AbstractDiscoveryRequestStructure }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.siri.org.uk/siri", name = "AbstractDiscoveryRequest", substitutionHeadNamespace = "http://www.siri.org.uk/siri", substitutionHeadName = "AbstractTrackedRequest")
    public JAXBElement<AbstractDiscoveryRequestStructure> createAbstractDiscoveryRequest(AbstractDiscoveryRequestStructure value) {
        return new JAXBElement<AbstractDiscoveryRequestStructure>(_AbstractDiscoveryRequest_QNAME, AbstractDiscoveryRequestStructure.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link NaturalLanguageStringStructure }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.siri.org.uk/siri", name = "ArrivalPlatformName")
    public JAXBElement<NaturalLanguageStringStructure> createArrivalPlatformName(NaturalLanguageStringStructure value) {
        return new JAXBElement<NaturalLanguageStringStructure>(_ArrivalPlatformName_QNAME, NaturalLanguageStringStructure.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link XMLGregorianCalendar }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.siri.org.uk/siri", name = "RequestTimestamp")
    public JAXBElement<XMLGregorianCalendar> createRequestTimestamp(XMLGregorianCalendar value) {
        return new JAXBElement<XMLGregorianCalendar>(_RequestTimestamp_QNAME, XMLGregorianCalendar.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link HeartbeatNotificationStructure }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.siri.org.uk/siri", name = "HeartbeatNotification", substitutionHeadNamespace = "http://www.siri.org.uk/siri", substitutionHeadName = "ProducerRequest")
    public JAXBElement<HeartbeatNotificationStructure> createHeartbeatNotification(HeartbeatNotificationStructure value) {
        return new JAXBElement<HeartbeatNotificationStructure>(_HeartbeatNotification_QNAME, HeartbeatNotificationStructure.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link CapabilityNotSupportedErrorStructure }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.siri.org.uk/siri", name = "CapabilityNotSupportedError", substitutionHeadNamespace = "http://www.siri.org.uk/siri", substitutionHeadName = "ErrorCode")
    public JAXBElement<CapabilityNotSupportedErrorStructure> createCapabilityNotSupportedError(CapabilityNotSupportedErrorStructure value) {
        return new JAXBElement<CapabilityNotSupportedErrorStructure>(_CapabilityNotSupportedError_QNAME, CapabilityNotSupportedErrorStructure.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link CheckStatusResponseStructure }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.siri.org.uk/siri", name = "CheckStatusResponse", substitutionHeadNamespace = "http://www.siri.org.uk/siri", substitutionHeadName = "AbstractResponse")
    public JAXBElement<CheckStatusResponseStructure> createCheckStatusResponse(CheckStatusResponseStructure value) {
        return new JAXBElement<CheckStatusResponseStructure>(_CheckStatusResponse_QNAME, CheckStatusResponseStructure.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link AccessNotAllowedErrorStructure }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.siri.org.uk/siri", name = "AccessNotAllowedError", substitutionHeadNamespace = "http://www.siri.org.uk/siri", substitutionHeadName = "ErrorCode")
    public JAXBElement<AccessNotAllowedErrorStructure> createAccessNotAllowedError(AccessNotAllowedErrorStructure value) {
        return new JAXBElement<AccessNotAllowedErrorStructure>(_AccessNotAllowedError_QNAME, AccessNotAllowedErrorStructure.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link TerminateSubscriptionRequestStructure }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.siri.org.uk/siri", name = "TerminateSubscriptionRequest", substitutionHeadNamespace = "http://www.siri.org.uk/siri", substitutionHeadName = "AbstractTrackedRequest")
    public JAXBElement<TerminateSubscriptionRequestStructure> createTerminateSubscriptionRequest(TerminateSubscriptionRequestStructure value) {
        return new JAXBElement<TerminateSubscriptionRequestStructure>(_TerminateSubscriptionRequest_QNAME, TerminateSubscriptionRequestStructure.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link StatusResponseStructure }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.siri.org.uk/siri", name = "ResponseStatus")
    public JAXBElement<StatusResponseStructure> createResponseStatus(StatusResponseStructure value) {
        return new JAXBElement<StatusResponseStructure>(_ResponseStatus_QNAME, StatusResponseStructure.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link VehicleMonitoringRequestStructure }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.siri.org.uk/siri", name = "VehicleMonitoringRequest", substitutionHeadNamespace = "http://www.siri.org.uk/siri", substitutionHeadName = "AbstractFunctionalServiceRequest")
    public JAXBElement<VehicleMonitoringRequestStructure> createVehicleMonitoringRequest(VehicleMonitoringRequestStructure value) {
        return new JAXBElement<VehicleMonitoringRequestStructure>(_VehicleMonitoringRequest_QNAME, VehicleMonitoringRequestStructure.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link NoInfoForTopicErrorStructure }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.siri.org.uk/siri", name = "NoInfoForTopicError", substitutionHeadNamespace = "http://www.siri.org.uk/siri", substitutionHeadName = "ErrorCode")
    public JAXBElement<NoInfoForTopicErrorStructure> createNoInfoForTopicError(NoInfoForTopicErrorStructure value) {
        return new JAXBElement<NoInfoForTopicErrorStructure>(_NoInfoForTopicError_QNAME, NoInfoForTopicErrorStructure.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Boolean }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.siri.org.uk/siri", name = "VehicleAtStop")
    public JAXBElement<Boolean> createVehicleAtStop(Boolean value) {
        return new JAXBElement<Boolean>(_VehicleAtStop_QNAME, Boolean.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ServiceFeatureRefStructure }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.siri.org.uk/siri", name = "ServiceFeatureRef")
    public JAXBElement<ServiceFeatureRefStructure> createServiceFeatureRef(ServiceFeatureRefStructure value) {
        return new JAXBElement<ServiceFeatureRefStructure>(_ServiceFeatureRef_QNAME, ServiceFeatureRefStructure.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GeneralMessageDeliveryStructure }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.siri.org.uk/siri", name = "GeneralMessageDelivery", substitutionHeadNamespace = "http://www.siri.org.uk/siri", substitutionHeadName = "AbstractFunctionalServiceDelivery")
    public JAXBElement<GeneralMessageDeliveryStructure> createGeneralMessageDelivery(GeneralMessageDeliveryStructure value) {
        return new JAXBElement<GeneralMessageDeliveryStructure>(_GeneralMessageDelivery_QNAME, GeneralMessageDeliveryStructure.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link SanitaryFacilityEnumeration }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.siri.org.uk/siri", name = "SanitaryFacility", defaultValue = "unknown")
    public JAXBElement<SanitaryFacilityEnumeration> createSanitaryFacility(SanitaryFacilityEnumeration value) {
        return new JAXBElement<SanitaryFacilityEnumeration>(_SanitaryFacility_QNAME, SanitaryFacilityEnumeration.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link BigInteger }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.siri.org.uk/siri", name = "Order")
    public JAXBElement<BigInteger> createOrder(BigInteger value) {
        return new JAXBElement<BigInteger>(_Order_QNAME, BigInteger.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link NotifyUserActionStructure }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.siri.org.uk/siri", name = "NotifyUserAction")
    public JAXBElement<NotifyUserActionStructure> createNotifyUserAction(NotifyUserActionStructure value) {
        return new JAXBElement<NotifyUserActionStructure>(_NotifyUserAction_QNAME, NotifyUserActionStructure.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link NaturalLanguagePlaceNameStructure }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.siri.org.uk/siri", name = "DestinationName")
    public JAXBElement<NaturalLanguagePlaceNameStructure> createDestinationName(NaturalLanguagePlaceNameStructure value) {
        return new JAXBElement<NaturalLanguagePlaceNameStructure>(_DestinationName_QNAME, NaturalLanguagePlaceNameStructure.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link StopTimetableRequestStructure }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.siri.org.uk/siri", name = "StopTimetableRequest", substitutionHeadNamespace = "http://www.siri.org.uk/siri", substitutionHeadName = "AbstractFunctionalServiceRequest")
    public JAXBElement<StopTimetableRequestStructure> createStopTimetableRequest(StopTimetableRequestStructure value) {
        return new JAXBElement<StopTimetableRequestStructure>(_StopTimetableRequest_QNAME, StopTimetableRequestStructure.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link AccessLinkRefStructure }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.ifopt.org.uk/ifopt", name = "AccessLinkRef")
    public JAXBElement<AccessLinkRefStructure> createAccessLinkRef(AccessLinkRefStructure value) {
        return new JAXBElement<AccessLinkRefStructure>(_AccessLinkRef_QNAME, AccessLinkRefStructure.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ReservedSpaceFacilityEnumeration }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.siri.org.uk/siri", name = "ReservedSpaceFacility", defaultValue = "unknown")
    public JAXBElement<ReservedSpaceFacilityEnumeration> createReservedSpaceFacility(ReservedSpaceFacilityEnumeration value) {
        return new JAXBElement<ReservedSpaceFacilityEnumeration>(_ReservedSpaceFacility_QNAME, ReservedSpaceFacilityEnumeration.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link AbstractFunctionalServiceRequestStructure }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.siri.org.uk/siri", name = "AbstractFunctionalServiceRequest", substitutionHeadNamespace = "http://www.siri.org.uk/siri", substitutionHeadName = "AbstractServiceRequest")
    public JAXBElement<AbstractFunctionalServiceRequestStructure> createAbstractFunctionalServiceRequest(AbstractFunctionalServiceRequestStructure value) {
        return new JAXBElement<AbstractFunctionalServiceRequestStructure>(_AbstractFunctionalServiceRequest_QNAME, AbstractFunctionalServiceRequestStructure.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link XMLGregorianCalendar }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.siri.org.uk/siri", name = "ResponseTimestamp")
    public JAXBElement<XMLGregorianCalendar> createResponseTimestamp(XMLGregorianCalendar value) {
        return new JAXBElement<XMLGregorianCalendar>(_ResponseTimestamp_QNAME, XMLGregorianCalendar.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link TicketingFacilityEnumeration }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.siri.org.uk/siri", name = "TicketingFacility", defaultValue = "unknown")
    public JAXBElement<TicketingFacilityEnumeration> createTicketingFacility(TicketingFacilityEnumeration value) {
        return new JAXBElement<TicketingFacilityEnumeration>(_TicketingFacility_QNAME, TicketingFacilityEnumeration.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link DataReadyRequestStructure }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.siri.org.uk/siri", name = "DataReadyNotification", substitutionHeadNamespace = "http://www.siri.org.uk/siri", substitutionHeadName = "ProducerRequest")
    public JAXBElement<DataReadyRequestStructure> createDataReadyNotification(DataReadyRequestStructure value) {
        return new JAXBElement<DataReadyRequestStructure>(_DataReadyNotification_QNAME, DataReadyRequestStructure.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ServiceCapabilitiesRequestStructure }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.siri.org.uk/siri", name = "StopTimetableCapabilitiesRequest", substitutionHeadNamespace = "http://www.siri.org.uk/siri", substitutionHeadName = "AbstractFunctionalServiceCapabilitiesRequest")
    public JAXBElement<ServiceCapabilitiesRequestStructure> createStopTimetableCapabilitiesRequest(ServiceCapabilitiesRequestStructure value) {
        return new JAXBElement<ServiceCapabilitiesRequestStructure>(_StopTimetableCapabilitiesRequest_QNAME, ServiceCapabilitiesRequestStructure.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.siri.org.uk/siri", name = "UnknownReason")
    public JAXBElement<String> createUnknownReason(String value) {
        return new JAXBElement<String>(_UnknownReason_QNAME, String.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Duration }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.siri.org.uk/siri", name = "ExpectedHeadwayInterval")
    public JAXBElement<Duration> createExpectedHeadwayInterval(Duration value) {
        return new JAXBElement<Duration>(_ExpectedHeadwayInterval_QNAME, Duration.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link TerminateSubscriptionResponseStructure }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.siri.org.uk/siri", name = "TerminateSubscriptionResponse", substitutionHeadNamespace = "http://www.siri.org.uk/siri", substitutionHeadName = "AbstractResponse")
    public JAXBElement<TerminateSubscriptionResponseStructure> createTerminateSubscriptionResponse(TerminateSubscriptionResponseStructure value) {
        return new JAXBElement<TerminateSubscriptionResponseStructure>(_TerminateSubscriptionResponse_QNAME, TerminateSubscriptionResponseStructure.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Boolean }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.siri.org.uk/siri", name = "FilterByDirectionRef", defaultValue = "true")
    public JAXBElement<Boolean> createFilterByDirectionRef(Boolean value) {
        return new JAXBElement<Boolean>(_FilterByDirectionRef_QNAME, Boolean.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link AccessibilityStructure }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.ifopt.org.uk/acsb", name = "VisualSignsAvailable", defaultValue = "unknown")
    public JAXBElement<AccessibilityStructure> createVisualSignsAvailable(AccessibilityStructure value) {
        return new JAXBElement<AccessibilityStructure>(_VisualSignsAvailable_QNAME, AccessibilityStructure.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link DatedTimetableVersionFrameStructure }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.siri.org.uk/siri", name = "DatedTimetableVersionFrame")
    public JAXBElement<DatedTimetableVersionFrameStructure> createDatedTimetableVersionFrame(DatedTimetableVersionFrameStructure value) {
        return new JAXBElement<DatedTimetableVersionFrameStructure>(_DatedTimetableVersionFrame_QNAME, DatedTimetableVersionFrameStructure.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link SituationRefStructure }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.siri.org.uk/siri", name = "SituationRef")
    public JAXBElement<SituationRefStructure> createSituationRef(SituationRefStructure value) {
        return new JAXBElement<SituationRefStructure>(_SituationRef_QNAME, SituationRefStructure.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link SituationSimpleRefStructure }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.siri.org.uk/siri", name = "SituationSimpleRef")
    public JAXBElement<SituationSimpleRefStructure> createSituationSimpleRef(SituationSimpleRefStructure value) {
        return new JAXBElement<SituationSimpleRefStructure>(_SituationSimpleRef_QNAME, SituationSimpleRefStructure.class, null, value);
    }

}
