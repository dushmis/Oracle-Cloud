
package com.oracle.xmlns.oracle.apps.marketing.leadmgmt.leads.leadservice;

import java.math.BigDecimal;
import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlElementDecl;
import javax.xml.bind.annotation.XmlRegistry;
import javax.xml.datatype.XMLGregorianCalendar;
import javax.xml.namespace.QName;
import com.oracle.xmlns.adf.svc.types.AmountType;


/**
 * This object contains factory methods for each 
 * Java content interface and Java element interface 
 * generated in the com.oracle.xmlns.oracle.apps.marketing.leadmgmt.leads.leadservice package. 
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

    private final static QName _MklLead_QNAME = new QName("http://xmlns.oracle.com/oracle/apps/marketing/leadMgmt/leads/leadService/", "mklLead");
    private final static QName _MklLeadImportTaskId_QNAME = new QName("http://xmlns.oracle.com/oracle/apps/marketing/leadMgmt/leads/leadService/", "ImportTaskId");
    private final static QName _MklLeadCustomerCountry_QNAME = new QName("http://xmlns.oracle.com/oracle/apps/marketing/leadMgmt/leads/leadService/", "CustomerCountry");
    private final static QName _MklLeadRetireReasonCode_QNAME = new QName("http://xmlns.oracle.com/oracle/apps/marketing/leadMgmt/leads/leadService/", "RetireReasonCode");
    private final static QName _MklLeadConvertedDateTime_QNAME = new QName("http://xmlns.oracle.com/oracle/apps/marketing/leadMgmt/leads/leadService/", "ConvertedDateTime");
    private final static QName _MklLeadCustomerState_QNAME = new QName("http://xmlns.oracle.com/oracle/apps/marketing/leadMgmt/leads/leadService/", "CustomerState");
    private final static QName _MklLeadPrimaryContactCountry_QNAME = new QName("http://xmlns.oracle.com/oracle/apps/marketing/leadMgmt/leads/leadService/", "PrimaryContactCountry");
    private final static QName _MklLeadQualifiedDate_QNAME = new QName("http://xmlns.oracle.com/oracle/apps/marketing/leadMgmt/leads/leadService/", "QualifiedDate");
    private final static QName _MklLeadCurrencyMeaning_QNAME = new QName("http://xmlns.oracle.com/oracle/apps/marketing/leadMgmt/leads/leadService/", "CurrencyMeaning");
    private final static QName _MklLeadPrimaryContactEmailAddress_QNAME = new QName("http://xmlns.oracle.com/oracle/apps/marketing/leadMgmt/leads/leadService/", "PrimaryContactEmailAddress");
    private final static QName _MklLeadRejectedTimestamp_QNAME = new QName("http://xmlns.oracle.com/oracle/apps/marketing/leadMgmt/leads/leadService/", "RejectedTimestamp");
    private final static QName _MklLeadOwnerTreeCode_QNAME = new QName("http://xmlns.oracle.com/oracle/apps/marketing/leadMgmt/leads/leadService/", "OwnerTreeCode");
    private final static QName _MklLeadInventoryItemDescription_QNAME = new QName("http://xmlns.oracle.com/oracle/apps/marketing/leadMgmt/leads/leadService/", "InventoryItemDescription");
    private final static QName _MklLeadUniqueName_QNAME = new QName("http://xmlns.oracle.com/oracle/apps/marketing/leadMgmt/leads/leadService/", "UniqueName");
    private final static QName _MklLeadChannelTypeMeaning_QNAME = new QName("http://xmlns.oracle.com/oracle/apps/marketing/leadMgmt/leads/leadService/", "ChannelTypeMeaning");
    private final static QName _MklLeadAcceptedDateTime_QNAME = new QName("http://xmlns.oracle.com/oracle/apps/marketing/leadMgmt/leads/leadService/", "AcceptedDateTime");
    private final static QName _MklLeadRegistrationNumber_QNAME = new QName("http://xmlns.oracle.com/oracle/apps/marketing/leadMgmt/leads/leadService/", "RegistrationNumber");
    private final static QName _MklLeadCustomerCurrencyFyPotentialRevenue_QNAME = new QName("http://xmlns.oracle.com/oracle/apps/marketing/leadMgmt/leads/leadService/", "CustomerCurrencyFyPotentialRevenue");
    private final static QName _MklLeadCustomerCategoryCode_QNAME = new QName("http://xmlns.oracle.com/oracle/apps/marketing/leadMgmt/leads/leadService/", "CustomerCategoryCode");
    private final static QName _MklLeadRetireReasonCdMeaning_QNAME = new QName("http://xmlns.oracle.com/oracle/apps/marketing/leadMgmt/leads/leadService/", "RetireReasonCdMeaning");
    private final static QName _MklLeadApprovalDate_QNAME = new QName("http://xmlns.oracle.com/oracle/apps/marketing/leadMgmt/leads/leadService/", "ApprovalDate");
    private final static QName _MklLeadCustomerId_QNAME = new QName("http://xmlns.oracle.com/oracle/apps/marketing/leadMgmt/leads/leadService/", "CustomerId");
    private final static QName _MklLeadRegistrationStatus_QNAME = new QName("http://xmlns.oracle.com/oracle/apps/marketing/leadMgmt/leads/leadService/", "RegistrationStatus");
    private final static QName _MklLeadProject_QNAME = new QName("http://xmlns.oracle.com/oracle/apps/marketing/leadMgmt/leads/leadService/", "Project");
    private final static QName _MklLeadReassignReasonCode_QNAME = new QName("http://xmlns.oracle.com/oracle/apps/marketing/leadMgmt/leads/leadService/", "ReassignReasonCode");
    private final static QName _MklLeadScore_QNAME = new QName("http://xmlns.oracle.com/oracle/apps/marketing/leadMgmt/leads/leadService/", "Score");
    private final static QName _MklLeadPrimaryContactTitle_QNAME = new QName("http://xmlns.oracle.com/oracle/apps/marketing/leadMgmt/leads/leadService/", "PrimaryContactTitle");
    private final static QName _MklLeadLastUpdateLogin_QNAME = new QName("http://xmlns.oracle.com/oracle/apps/marketing/leadMgmt/leads/leadService/", "LastUpdateLogin");
    private final static QName _MklLeadCustomerPostalCode_QNAME = new QName("http://xmlns.oracle.com/oracle/apps/marketing/leadMgmt/leads/leadService/", "CustomerPostalCode");
    private final static QName _MklLeadCustomerEmployeesTotal_QNAME = new QName("http://xmlns.oracle.com/oracle/apps/marketing/leadMgmt/leads/leadService/", "CustomerEmployeesTotal");
    private final static QName _MklLeadPartnerTypeMeaning_QNAME = new QName("http://xmlns.oracle.com/oracle/apps/marketing/leadMgmt/leads/leadService/", "PartnerTypeMeaning");
    private final static QName _MklLeadRejectByUserId_QNAME = new QName("http://xmlns.oracle.com/oracle/apps/marketing/leadMgmt/leads/leadService/", "RejectByUserId");
    private final static QName _MklLeadPrimaryContactURL_QNAME = new QName("http://xmlns.oracle.com/oracle/apps/marketing/leadMgmt/leads/leadService/", "PrimaryContactURL");
    private final static QName _MklLeadPrimaryContactRelationshipId_QNAME = new QName("http://xmlns.oracle.com/oracle/apps/marketing/leadMgmt/leads/leadService/", "PrimaryContactRelationshipId");
    private final static QName _MklLeadApproverId_QNAME = new QName("http://xmlns.oracle.com/oracle/apps/marketing/leadMgmt/leads/leadService/", "ApproverId");
    private final static QName _MklLeadApprovalDateTime_QNAME = new QName("http://xmlns.oracle.com/oracle/apps/marketing/leadMgmt/leads/leadService/", "ApprovalDateTime");
    private final static QName _MklLeadChannelType_QNAME = new QName("http://xmlns.oracle.com/oracle/apps/marketing/leadMgmt/leads/leadService/", "ChannelType");
    private final static QName _MklLeadApprovalTaskId_QNAME = new QName("http://xmlns.oracle.com/oracle/apps/marketing/leadMgmt/leads/leadService/", "ApprovalTaskId");
    private final static QName _MklLeadLeadAging_QNAME = new QName("http://xmlns.oracle.com/oracle/apps/marketing/leadMgmt/leads/leadService/", "LeadAging");
    private final static QName _MklLeadPrimaryContactState_QNAME = new QName("http://xmlns.oracle.com/oracle/apps/marketing/leadMgmt/leads/leadService/", "PrimaryContactState");
    private final static QName _MklLeadFollowupTimestamp_QNAME = new QName("http://xmlns.oracle.com/oracle/apps/marketing/leadMgmt/leads/leadService/", "FollowupTimestamp");
    private final static QName _MklLeadReassignComment_QNAME = new QName("http://xmlns.oracle.com/oracle/apps/marketing/leadMgmt/leads/leadService/", "ReassignComment");
    private final static QName _MklLeadRejectedCount_QNAME = new QName("http://xmlns.oracle.com/oracle/apps/marketing/leadMgmt/leads/leadService/", "RejectedCount");
    private final static QName _MklLeadConvertedTimestamp_QNAME = new QName("http://xmlns.oracle.com/oracle/apps/marketing/leadMgmt/leads/leadService/", "ConvertedTimestamp");
    private final static QName _MklLeadAssignmentStatusCode_QNAME = new QName("http://xmlns.oracle.com/oracle/apps/marketing/leadMgmt/leads/leadService/", "AssignmentStatusCode");
    private final static QName _MklLeadRetireComment_QNAME = new QName("http://xmlns.oracle.com/oracle/apps/marketing/leadMgmt/leads/leadService/", "RetireComment");
    private final static QName _MklLeadCreationDateFormatted_QNAME = new QName("http://xmlns.oracle.com/oracle/apps/marketing/leadMgmt/leads/leadService/", "CreationDateFormatted");
    private final static QName _MklLeadOwnerId_QNAME = new QName("http://xmlns.oracle.com/oracle/apps/marketing/leadMgmt/leads/leadService/", "OwnerId");
    private final static QName _MklLeadPrimaryContactAddress4_QNAME = new QName("http://xmlns.oracle.com/oracle/apps/marketing/leadMgmt/leads/leadService/", "PrimaryContactAddress4");
    private final static QName _MklLeadQualificationScore_QNAME = new QName("http://xmlns.oracle.com/oracle/apps/marketing/leadMgmt/leads/leadService/", "QualificationScore");
    private final static QName _MklLeadPrimaryContactAddress3_QNAME = new QName("http://xmlns.oracle.com/oracle/apps/marketing/leadMgmt/leads/leadService/", "PrimaryContactAddress3");
    private final static QName _MklLeadRejectByTerritoryId_QNAME = new QName("http://xmlns.oracle.com/oracle/apps/marketing/leadMgmt/leads/leadService/", "RejectByTerritoryId");
    private final static QName _MklLeadPrimaryContactAddress2_QNAME = new QName("http://xmlns.oracle.com/oracle/apps/marketing/leadMgmt/leads/leadService/", "PrimaryContactAddress2");
    private final static QName _MklLeadPrimaryContactAddress1_QNAME = new QName("http://xmlns.oracle.com/oracle/apps/marketing/leadMgmt/leads/leadService/", "PrimaryContactAddress1");
    private final static QName _MklLeadPrimaryProductGroupId_QNAME = new QName("http://xmlns.oracle.com/oracle/apps/marketing/leadMgmt/leads/leadService/", "PrimaryProductGroupId");
    private final static QName _MklLeadConvCurrencyCode_QNAME = new QName("http://xmlns.oracle.com/oracle/apps/marketing/leadMgmt/leads/leadService/", "ConvCurrencyCode");
    private final static QName _MklLeadConvRateType_QNAME = new QName("http://xmlns.oracle.com/oracle/apps/marketing/leadMgmt/leads/leadService/", "ConvRateType");
    private final static QName _MklLeadCustomerSICCode_QNAME = new QName("http://xmlns.oracle.com/oracle/apps/marketing/leadMgmt/leads/leadService/", "CustomerSICCode");
    private final static QName _MklLeadPrimaryInventoryOrgId_QNAME = new QName("http://xmlns.oracle.com/oracle/apps/marketing/leadMgmt/leads/leadService/", "PrimaryInventoryOrgId");
    private final static QName _MklLeadProdNameOrGroupName_QNAME = new QName("http://xmlns.oracle.com/oracle/apps/marketing/leadMgmt/leads/leadService/", "ProdNameOrGroupName");
    private final static QName _MklLeadPrimaryContactFormattedPhoneNumber_QNAME = new QName("http://xmlns.oracle.com/oracle/apps/marketing/leadMgmt/leads/leadService/", "PrimaryContactFormattedPhoneNumber");
    private final static QName _MklLeadDealAmount_QNAME = new QName("http://xmlns.oracle.com/oracle/apps/marketing/leadMgmt/leads/leadService/", "DealAmount");
    private final static QName _MklLeadPrimaryContactPersonLastName_QNAME = new QName("http://xmlns.oracle.com/oracle/apps/marketing/leadMgmt/leads/leadService/", "PrimaryContactPersonLastName");
    private final static QName _MklLeadRetiredDateTime_QNAME = new QName("http://xmlns.oracle.com/oracle/apps/marketing/leadMgmt/leads/leadService/", "RetiredDateTime");
    private final static QName _MklLeadRegistrationTypeMeaning_QNAME = new QName("http://xmlns.oracle.com/oracle/apps/marketing/leadMgmt/leads/leadService/", "RegistrationTypeMeaning");
    private final static QName _MklLeadPrimaryContactCity_QNAME = new QName("http://xmlns.oracle.com/oracle/apps/marketing/leadMgmt/leads/leadService/", "PrimaryContactCity");
    private final static QName _MklLeadLastAssignmentDate_QNAME = new QName("http://xmlns.oracle.com/oracle/apps/marketing/leadMgmt/leads/leadService/", "LastAssignmentDate");
    private final static QName _MklLeadRejectedDateTime_QNAME = new QName("http://xmlns.oracle.com/oracle/apps/marketing/leadMgmt/leads/leadService/", "RejectedDateTime");
    private final static QName _MklLeadCustomerAddress4_QNAME = new QName("http://xmlns.oracle.com/oracle/apps/marketing/leadMgmt/leads/leadService/", "CustomerAddress4");
    private final static QName _MklLeadCustomerAddress3_QNAME = new QName("http://xmlns.oracle.com/oracle/apps/marketing/leadMgmt/leads/leadService/", "CustomerAddress3");
    private final static QName _MklLeadCustomerAddress2_QNAME = new QName("http://xmlns.oracle.com/oracle/apps/marketing/leadMgmt/leads/leadService/", "CustomerAddress2");
    private final static QName _MklLeadTimeframe_QNAME = new QName("http://xmlns.oracle.com/oracle/apps/marketing/leadMgmt/leads/leadService/", "Timeframe");
    private final static QName _MklLeadBudgetCurrencyCode_QNAME = new QName("http://xmlns.oracle.com/oracle/apps/marketing/leadMgmt/leads/leadService/", "BudgetCurrencyCode");
    private final static QName _MklLeadCustomerAddress1_QNAME = new QName("http://xmlns.oracle.com/oracle/apps/marketing/leadMgmt/leads/leadService/", "CustomerAddress1");
    private final static QName _MklLeadCustomerURL_QNAME = new QName("http://xmlns.oracle.com/oracle/apps/marketing/leadMgmt/leads/leadService/", "CustomerURL");
    private final static QName _MklLeadCustomerNeed_QNAME = new QName("http://xmlns.oracle.com/oracle/apps/marketing/leadMgmt/leads/leadService/", "CustomerNeed");
    private final static QName _MklLeadCustomerCity_QNAME = new QName("http://xmlns.oracle.com/oracle/apps/marketing/leadMgmt/leads/leadService/", "CustomerCity");
    private final static QName _MklLeadRejectReasonCode_QNAME = new QName("http://xmlns.oracle.com/oracle/apps/marketing/leadMgmt/leads/leadService/", "RejectReasonCode");
    private final static QName _MklLeadPartnerId_QNAME = new QName("http://xmlns.oracle.com/oracle/apps/marketing/leadMgmt/leads/leadService/", "PartnerId");
    private final static QName _MklLeadLastUpdateDateFormatted_QNAME = new QName("http://xmlns.oracle.com/oracle/apps/marketing/leadMgmt/leads/leadService/", "LastUpdateDateFormatted");
    private final static QName _MklLeadStatusCode_QNAME = new QName("http://xmlns.oracle.com/oracle/apps/marketing/leadMgmt/leads/leadService/", "StatusCode");
    private final static QName _MklLeadEstimatedCloseDate_QNAME = new QName("http://xmlns.oracle.com/oracle/apps/marketing/leadMgmt/leads/leadService/", "EstimatedCloseDate");
    private final static QName _MklLeadPartnerProgramId_QNAME = new QName("http://xmlns.oracle.com/oracle/apps/marketing/leadMgmt/leads/leadService/", "PartnerProgramId");
    private final static QName _MklLeadRank_QNAME = new QName("http://xmlns.oracle.com/oracle/apps/marketing/leadMgmt/leads/leadService/", "Rank");
    private final static QName _MklLeadCustomerRegistryId_QNAME = new QName("http://xmlns.oracle.com/oracle/apps/marketing/leadMgmt/leads/leadService/", "CustomerRegistryId");
    private final static QName _MklLeadSalesChannel_QNAME = new QName("http://xmlns.oracle.com/oracle/apps/marketing/leadMgmt/leads/leadService/", "SalesChannel");
    private final static QName _MklLeadRankMeaning_QNAME = new QName("http://xmlns.oracle.com/oracle/apps/marketing/leadMgmt/leads/leadService/", "RankMeaning");
    private final static QName _MklLeadExpirationDate_QNAME = new QName("http://xmlns.oracle.com/oracle/apps/marketing/leadMgmt/leads/leadService/", "ExpirationDate");
    private final static QName _MklLeadLongDescription_QNAME = new QName("http://xmlns.oracle.com/oracle/apps/marketing/leadMgmt/leads/leadService/", "LongDescription");
    private final static QName _MklLeadOwnerTreeVersionId_QNAME = new QName("http://xmlns.oracle.com/oracle/apps/marketing/leadMgmt/leads/leadService/", "OwnerTreeVersionId");
    private final static QName _MklLeadOwnerResourceOrgId_QNAME = new QName("http://xmlns.oracle.com/oracle/apps/marketing/leadMgmt/leads/leadService/", "OwnerResourceOrgId");
    private final static QName _MklLeadProgramName_QNAME = new QName("http://xmlns.oracle.com/oracle/apps/marketing/leadMgmt/leads/leadService/", "ProgramName");
    private final static QName _MklLeadPrimaryContactPersonMiddleName_QNAME = new QName("http://xmlns.oracle.com/oracle/apps/marketing/leadMgmt/leads/leadService/", "PrimaryContactPersonMiddleName");
    private final static QName _MklLeadRejectByTerritoryVersionId_QNAME = new QName("http://xmlns.oracle.com/oracle/apps/marketing/leadMgmt/leads/leadService/", "RejectByTerritoryVersionId");
    private final static QName _MklLeadDescription_QNAME = new QName("http://xmlns.oracle.com/oracle/apps/marketing/leadMgmt/leads/leadService/", "Description");
    private final static QName _MklLeadOwnerTreeStructureCode_QNAME = new QName("http://xmlns.oracle.com/oracle/apps/marketing/leadMgmt/leads/leadService/", "OwnerTreeStructureCode");
    private final static QName _MklLeadCustomerPartyUniqueName_QNAME = new QName("http://xmlns.oracle.com/oracle/apps/marketing/leadMgmt/leads/leadService/", "CustomerPartyUniqueName");
    private final static QName _MklLeadCurrencyCode_QNAME = new QName("http://xmlns.oracle.com/oracle/apps/marketing/leadMgmt/leads/leadService/", "CurrencyCode");
    private final static QName _MklLeadDaysUntilExpiration_QNAME = new QName("http://xmlns.oracle.com/oracle/apps/marketing/leadMgmt/leads/leadService/", "DaysUntilExpiration");
    private final static QName _MklLeadPrimaryContactPersonFirstName_QNAME = new QName("http://xmlns.oracle.com/oracle/apps/marketing/leadMgmt/leads/leadService/", "PrimaryContactPersonFirstName");
    private final static QName _MklLeadName_QNAME = new QName("http://xmlns.oracle.com/oracle/apps/marketing/leadMgmt/leads/leadService/", "Name");
    private final static QName _MklLeadBudgetAmount_QNAME = new QName("http://xmlns.oracle.com/oracle/apps/marketing/leadMgmt/leads/leadService/", "BudgetAmount");
    private final static QName _MklLeadCampaignName_QNAME = new QName("http://xmlns.oracle.com/oracle/apps/marketing/leadMgmt/leads/leadService/", "CampaignName");
    private final static QName _MklLeadConvExchangeRate_QNAME = new QName("http://xmlns.oracle.com/oracle/apps/marketing/leadMgmt/leads/leadService/", "ConvExchangeRate");
    private final static QName _MklLeadRejectComment_QNAME = new QName("http://xmlns.oracle.com/oracle/apps/marketing/leadMgmt/leads/leadService/", "RejectComment");
    private final static QName _MklLeadQualifiedDateTime_QNAME = new QName("http://xmlns.oracle.com/oracle/apps/marketing/leadMgmt/leads/leadService/", "QualifiedDateTime");
    private final static QName _MklLeadAssignmentStatusCdMeaning_QNAME = new QName("http://xmlns.oracle.com/oracle/apps/marketing/leadMgmt/leads/leadService/", "AssignmentStatusCdMeaning");
    private final static QName _MklLeadJobTitle_QNAME = new QName("http://xmlns.oracle.com/oracle/apps/marketing/leadMgmt/leads/leadService/", "JobTitle");
    private final static QName _MklLeadPrimaryContactCounty_QNAME = new QName("http://xmlns.oracle.com/oracle/apps/marketing/leadMgmt/leads/leadService/", "PrimaryContactCounty");
    private final static QName _MklLeadDecisionMakerIdentifiedFlag_QNAME = new QName("http://xmlns.oracle.com/oracle/apps/marketing/leadMgmt/leads/leadService/", "DecisionMakerIdentifiedFlag");
    private final static QName _MklLeadPartnerType_QNAME = new QName("http://xmlns.oracle.com/oracle/apps/marketing/leadMgmt/leads/leadService/", "PartnerType");
    private final static QName _MklLeadPrimaryContactId_QNAME = new QName("http://xmlns.oracle.com/oracle/apps/marketing/leadMgmt/leads/leadService/", "PrimaryContactId");
    private final static QName _MklLeadRegistrationStatusMeaning_QNAME = new QName("http://xmlns.oracle.com/oracle/apps/marketing/leadMgmt/leads/leadService/", "RegistrationStatusMeaning");
    private final static QName _MklLeadPrimaryContactProvince_QNAME = new QName("http://xmlns.oracle.com/oracle/apps/marketing/leadMgmt/leads/leadService/", "PrimaryContactProvince");
    private final static QName _MklLeadRetiredTimestamp_QNAME = new QName("http://xmlns.oracle.com/oracle/apps/marketing/leadMgmt/leads/leadService/", "RetiredTimestamp");
    private final static QName _MklLeadBranchCode_QNAME = new QName("http://xmlns.oracle.com/oracle/apps/marketing/leadMgmt/leads/leadService/", "BranchCode");
    private final static QName _MklLeadSourceCode_QNAME = new QName("http://xmlns.oracle.com/oracle/apps/marketing/leadMgmt/leads/leadService/", "SourceCode");
    private final static QName _MklLeadPrimaryInventoryItemId_QNAME = new QName("http://xmlns.oracle.com/oracle/apps/marketing/leadMgmt/leads/leadService/", "PrimaryInventoryItemId");
    private final static QName _MklLeadLeadAcceptedFlag_QNAME = new QName("http://xmlns.oracle.com/oracle/apps/marketing/leadMgmt/leads/leadService/", "LeadAcceptedFlag");
    private final static QName _MklLeadSalesChannelMeaning_QNAME = new QName("http://xmlns.oracle.com/oracle/apps/marketing/leadMgmt/leads/leadService/", "SalesChannelMeaning");
    private final static QName _MklLeadBudgetStatus_QNAME = new QName("http://xmlns.oracle.com/oracle/apps/marketing/leadMgmt/leads/leadService/", "BudgetStatus");
    private final static QName _MklLeadAcceptedDate_QNAME = new QName("http://xmlns.oracle.com/oracle/apps/marketing/leadMgmt/leads/leadService/", "AcceptedDate");
    private final static QName _MklLeadCustomerIdenAddrLocationId_QNAME = new QName("http://xmlns.oracle.com/oracle/apps/marketing/leadMgmt/leads/leadService/", "CustomerIdenAddrLocationId");
    private final static QName _MklLeadRejectReasonCdMeaning_QNAME = new QName("http://xmlns.oracle.com/oracle/apps/marketing/leadMgmt/leads/leadService/", "RejectReasonCdMeaning");
    private final static QName _MklLeadPrimaryContactPostalCode_QNAME = new QName("http://xmlns.oracle.com/oracle/apps/marketing/leadMgmt/leads/leadService/", "PrimaryContactPostalCode");
    private final static QName _MklLeadStatusCdMeaning_QNAME = new QName("http://xmlns.oracle.com/oracle/apps/marketing/leadMgmt/leads/leadService/", "StatusCdMeaning");

    /**
     * Create a new ObjectFactory that can be used to create new instances of schema derived classes for package: com.oracle.xmlns.oracle.apps.marketing.leadmgmt.leads.leadservice
     * 
     */
    public ObjectFactory() {
    }

    /**
     * Create an instance of {@link MklLead }
     * 
     */
    public MklLead createMklLead() {
        return new MklLead();
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link MklLead }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://xmlns.oracle.com/oracle/apps/marketing/leadMgmt/leads/leadService/", name = "mklLead")
    public JAXBElement<MklLead> createMklLead(MklLead value) {
        return new JAXBElement<MklLead>(_MklLead_QNAME, MklLead.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Long }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://xmlns.oracle.com/oracle/apps/marketing/leadMgmt/leads/leadService/", name = "ImportTaskId", scope = MklLead.class)
    public JAXBElement<Long> createMklLeadImportTaskId(Long value) {
        return new JAXBElement<Long>(_MklLeadImportTaskId_QNAME, Long.class, MklLead.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://xmlns.oracle.com/oracle/apps/marketing/leadMgmt/leads/leadService/", name = "CustomerCountry", scope = MklLead.class)
    public JAXBElement<String> createMklLeadCustomerCountry(String value) {
        return new JAXBElement<String>(_MklLeadCustomerCountry_QNAME, String.class, MklLead.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://xmlns.oracle.com/oracle/apps/marketing/leadMgmt/leads/leadService/", name = "RetireReasonCode", scope = MklLead.class)
    public JAXBElement<String> createMklLeadRetireReasonCode(String value) {
        return new JAXBElement<String>(_MklLeadRetireReasonCode_QNAME, String.class, MklLead.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link XMLGregorianCalendar }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://xmlns.oracle.com/oracle/apps/marketing/leadMgmt/leads/leadService/", name = "ConvertedDateTime", scope = MklLead.class)
    public JAXBElement<XMLGregorianCalendar> createMklLeadConvertedDateTime(XMLGregorianCalendar value) {
        return new JAXBElement<XMLGregorianCalendar>(_MklLeadConvertedDateTime_QNAME, XMLGregorianCalendar.class, MklLead.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://xmlns.oracle.com/oracle/apps/marketing/leadMgmt/leads/leadService/", name = "CustomerState", scope = MklLead.class)
    public JAXBElement<String> createMklLeadCustomerState(String value) {
        return new JAXBElement<String>(_MklLeadCustomerState_QNAME, String.class, MklLead.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://xmlns.oracle.com/oracle/apps/marketing/leadMgmt/leads/leadService/", name = "PrimaryContactCountry", scope = MklLead.class)
    public JAXBElement<String> createMklLeadPrimaryContactCountry(String value) {
        return new JAXBElement<String>(_MklLeadPrimaryContactCountry_QNAME, String.class, MklLead.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link XMLGregorianCalendar }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://xmlns.oracle.com/oracle/apps/marketing/leadMgmt/leads/leadService/", name = "QualifiedDate", scope = MklLead.class)
    public JAXBElement<XMLGregorianCalendar> createMklLeadQualifiedDate(XMLGregorianCalendar value) {
        return new JAXBElement<XMLGregorianCalendar>(_MklLeadQualifiedDate_QNAME, XMLGregorianCalendar.class, MklLead.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://xmlns.oracle.com/oracle/apps/marketing/leadMgmt/leads/leadService/", name = "CurrencyMeaning", scope = MklLead.class)
    public JAXBElement<String> createMklLeadCurrencyMeaning(String value) {
        return new JAXBElement<String>(_MklLeadCurrencyMeaning_QNAME, String.class, MklLead.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://xmlns.oracle.com/oracle/apps/marketing/leadMgmt/leads/leadService/", name = "PrimaryContactEmailAddress", scope = MklLead.class)
    public JAXBElement<String> createMklLeadPrimaryContactEmailAddress(String value) {
        return new JAXBElement<String>(_MklLeadPrimaryContactEmailAddress_QNAME, String.class, MklLead.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link XMLGregorianCalendar }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://xmlns.oracle.com/oracle/apps/marketing/leadMgmt/leads/leadService/", name = "RejectedTimestamp", scope = MklLead.class)
    public JAXBElement<XMLGregorianCalendar> createMklLeadRejectedTimestamp(XMLGregorianCalendar value) {
        return new JAXBElement<XMLGregorianCalendar>(_MklLeadRejectedTimestamp_QNAME, XMLGregorianCalendar.class, MklLead.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://xmlns.oracle.com/oracle/apps/marketing/leadMgmt/leads/leadService/", name = "OwnerTreeCode", scope = MklLead.class)
    public JAXBElement<String> createMklLeadOwnerTreeCode(String value) {
        return new JAXBElement<String>(_MklLeadOwnerTreeCode_QNAME, String.class, MklLead.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://xmlns.oracle.com/oracle/apps/marketing/leadMgmt/leads/leadService/", name = "InventoryItemDescription", scope = MklLead.class)
    public JAXBElement<String> createMklLeadInventoryItemDescription(String value) {
        return new JAXBElement<String>(_MklLeadInventoryItemDescription_QNAME, String.class, MklLead.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://xmlns.oracle.com/oracle/apps/marketing/leadMgmt/leads/leadService/", name = "UniqueName", scope = MklLead.class)
    public JAXBElement<String> createMklLeadUniqueName(String value) {
        return new JAXBElement<String>(_MklLeadUniqueName_QNAME, String.class, MklLead.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://xmlns.oracle.com/oracle/apps/marketing/leadMgmt/leads/leadService/", name = "ChannelTypeMeaning", scope = MklLead.class)
    public JAXBElement<String> createMklLeadChannelTypeMeaning(String value) {
        return new JAXBElement<String>(_MklLeadChannelTypeMeaning_QNAME, String.class, MklLead.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link XMLGregorianCalendar }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://xmlns.oracle.com/oracle/apps/marketing/leadMgmt/leads/leadService/", name = "AcceptedDateTime", scope = MklLead.class)
    public JAXBElement<XMLGregorianCalendar> createMklLeadAcceptedDateTime(XMLGregorianCalendar value) {
        return new JAXBElement<XMLGregorianCalendar>(_MklLeadAcceptedDateTime_QNAME, XMLGregorianCalendar.class, MklLead.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://xmlns.oracle.com/oracle/apps/marketing/leadMgmt/leads/leadService/", name = "RegistrationNumber", scope = MklLead.class)
    public JAXBElement<String> createMklLeadRegistrationNumber(String value) {
        return new JAXBElement<String>(_MklLeadRegistrationNumber_QNAME, String.class, MklLead.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link BigDecimal }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://xmlns.oracle.com/oracle/apps/marketing/leadMgmt/leads/leadService/", name = "CustomerCurrencyFyPotentialRevenue", scope = MklLead.class)
    public JAXBElement<BigDecimal> createMklLeadCustomerCurrencyFyPotentialRevenue(BigDecimal value) {
        return new JAXBElement<BigDecimal>(_MklLeadCustomerCurrencyFyPotentialRevenue_QNAME, BigDecimal.class, MklLead.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://xmlns.oracle.com/oracle/apps/marketing/leadMgmt/leads/leadService/", name = "CustomerCategoryCode", scope = MklLead.class)
    public JAXBElement<String> createMklLeadCustomerCategoryCode(String value) {
        return new JAXBElement<String>(_MklLeadCustomerCategoryCode_QNAME, String.class, MklLead.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://xmlns.oracle.com/oracle/apps/marketing/leadMgmt/leads/leadService/", name = "RetireReasonCdMeaning", scope = MklLead.class)
    public JAXBElement<String> createMklLeadRetireReasonCdMeaning(String value) {
        return new JAXBElement<String>(_MklLeadRetireReasonCdMeaning_QNAME, String.class, MklLead.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link XMLGregorianCalendar }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://xmlns.oracle.com/oracle/apps/marketing/leadMgmt/leads/leadService/", name = "ApprovalDate", scope = MklLead.class)
    public JAXBElement<XMLGregorianCalendar> createMklLeadApprovalDate(XMLGregorianCalendar value) {
        return new JAXBElement<XMLGregorianCalendar>(_MklLeadApprovalDate_QNAME, XMLGregorianCalendar.class, MklLead.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Long }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://xmlns.oracle.com/oracle/apps/marketing/leadMgmt/leads/leadService/", name = "CustomerId", scope = MklLead.class)
    public JAXBElement<Long> createMklLeadCustomerId(Long value) {
        return new JAXBElement<Long>(_MklLeadCustomerId_QNAME, Long.class, MklLead.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://xmlns.oracle.com/oracle/apps/marketing/leadMgmt/leads/leadService/", name = "RegistrationStatus", scope = MklLead.class)
    public JAXBElement<String> createMklLeadRegistrationStatus(String value) {
        return new JAXBElement<String>(_MklLeadRegistrationStatus_QNAME, String.class, MklLead.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://xmlns.oracle.com/oracle/apps/marketing/leadMgmt/leads/leadService/", name = "Project", scope = MklLead.class)
    public JAXBElement<String> createMklLeadProject(String value) {
        return new JAXBElement<String>(_MklLeadProject_QNAME, String.class, MklLead.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://xmlns.oracle.com/oracle/apps/marketing/leadMgmt/leads/leadService/", name = "ReassignReasonCode", scope = MklLead.class)
    public JAXBElement<String> createMklLeadReassignReasonCode(String value) {
        return new JAXBElement<String>(_MklLeadReassignReasonCode_QNAME, String.class, MklLead.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Long }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://xmlns.oracle.com/oracle/apps/marketing/leadMgmt/leads/leadService/", name = "Score", scope = MklLead.class)
    public JAXBElement<Long> createMklLeadScore(Long value) {
        return new JAXBElement<Long>(_MklLeadScore_QNAME, Long.class, MklLead.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://xmlns.oracle.com/oracle/apps/marketing/leadMgmt/leads/leadService/", name = "PrimaryContactTitle", scope = MklLead.class)
    public JAXBElement<String> createMklLeadPrimaryContactTitle(String value) {
        return new JAXBElement<String>(_MklLeadPrimaryContactTitle_QNAME, String.class, MklLead.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://xmlns.oracle.com/oracle/apps/marketing/leadMgmt/leads/leadService/", name = "LastUpdateLogin", scope = MklLead.class)
    public JAXBElement<String> createMklLeadLastUpdateLogin(String value) {
        return new JAXBElement<String>(_MklLeadLastUpdateLogin_QNAME, String.class, MklLead.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://xmlns.oracle.com/oracle/apps/marketing/leadMgmt/leads/leadService/", name = "CustomerPostalCode", scope = MklLead.class)
    public JAXBElement<String> createMklLeadCustomerPostalCode(String value) {
        return new JAXBElement<String>(_MklLeadCustomerPostalCode_QNAME, String.class, MklLead.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link BigDecimal }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://xmlns.oracle.com/oracle/apps/marketing/leadMgmt/leads/leadService/", name = "CustomerEmployeesTotal", scope = MklLead.class)
    public JAXBElement<BigDecimal> createMklLeadCustomerEmployeesTotal(BigDecimal value) {
        return new JAXBElement<BigDecimal>(_MklLeadCustomerEmployeesTotal_QNAME, BigDecimal.class, MklLead.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://xmlns.oracle.com/oracle/apps/marketing/leadMgmt/leads/leadService/", name = "PartnerTypeMeaning", scope = MklLead.class)
    public JAXBElement<String> createMklLeadPartnerTypeMeaning(String value) {
        return new JAXBElement<String>(_MklLeadPartnerTypeMeaning_QNAME, String.class, MklLead.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Long }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://xmlns.oracle.com/oracle/apps/marketing/leadMgmt/leads/leadService/", name = "RejectByUserId", scope = MklLead.class)
    public JAXBElement<Long> createMklLeadRejectByUserId(Long value) {
        return new JAXBElement<Long>(_MklLeadRejectByUserId_QNAME, Long.class, MklLead.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://xmlns.oracle.com/oracle/apps/marketing/leadMgmt/leads/leadService/", name = "PrimaryContactURL", scope = MklLead.class)
    public JAXBElement<String> createMklLeadPrimaryContactURL(String value) {
        return new JAXBElement<String>(_MklLeadPrimaryContactURL_QNAME, String.class, MklLead.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Long }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://xmlns.oracle.com/oracle/apps/marketing/leadMgmt/leads/leadService/", name = "PrimaryContactRelationshipId", scope = MklLead.class)
    public JAXBElement<Long> createMklLeadPrimaryContactRelationshipId(Long value) {
        return new JAXBElement<Long>(_MklLeadPrimaryContactRelationshipId_QNAME, Long.class, MklLead.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Long }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://xmlns.oracle.com/oracle/apps/marketing/leadMgmt/leads/leadService/", name = "ApproverId", scope = MklLead.class)
    public JAXBElement<Long> createMklLeadApproverId(Long value) {
        return new JAXBElement<Long>(_MklLeadApproverId_QNAME, Long.class, MklLead.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link XMLGregorianCalendar }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://xmlns.oracle.com/oracle/apps/marketing/leadMgmt/leads/leadService/", name = "ApprovalDateTime", scope = MklLead.class)
    public JAXBElement<XMLGregorianCalendar> createMklLeadApprovalDateTime(XMLGregorianCalendar value) {
        return new JAXBElement<XMLGregorianCalendar>(_MklLeadApprovalDateTime_QNAME, XMLGregorianCalendar.class, MklLead.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://xmlns.oracle.com/oracle/apps/marketing/leadMgmt/leads/leadService/", name = "ChannelType", scope = MklLead.class)
    public JAXBElement<String> createMklLeadChannelType(String value) {
        return new JAXBElement<String>(_MklLeadChannelType_QNAME, String.class, MklLead.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://xmlns.oracle.com/oracle/apps/marketing/leadMgmt/leads/leadService/", name = "ApprovalTaskId", scope = MklLead.class)
    public JAXBElement<String> createMklLeadApprovalTaskId(String value) {
        return new JAXBElement<String>(_MklLeadApprovalTaskId_QNAME, String.class, MklLead.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link BigDecimal }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://xmlns.oracle.com/oracle/apps/marketing/leadMgmt/leads/leadService/", name = "LeadAging", scope = MklLead.class)
    public JAXBElement<BigDecimal> createMklLeadLeadAging(BigDecimal value) {
        return new JAXBElement<BigDecimal>(_MklLeadLeadAging_QNAME, BigDecimal.class, MklLead.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://xmlns.oracle.com/oracle/apps/marketing/leadMgmt/leads/leadService/", name = "PrimaryContactState", scope = MklLead.class)
    public JAXBElement<String> createMklLeadPrimaryContactState(String value) {
        return new JAXBElement<String>(_MklLeadPrimaryContactState_QNAME, String.class, MklLead.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link XMLGregorianCalendar }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://xmlns.oracle.com/oracle/apps/marketing/leadMgmt/leads/leadService/", name = "FollowupTimestamp", scope = MklLead.class)
    public JAXBElement<XMLGregorianCalendar> createMklLeadFollowupTimestamp(XMLGregorianCalendar value) {
        return new JAXBElement<XMLGregorianCalendar>(_MklLeadFollowupTimestamp_QNAME, XMLGregorianCalendar.class, MklLead.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://xmlns.oracle.com/oracle/apps/marketing/leadMgmt/leads/leadService/", name = "ReassignComment", scope = MklLead.class)
    public JAXBElement<String> createMklLeadReassignComment(String value) {
        return new JAXBElement<String>(_MklLeadReassignComment_QNAME, String.class, MklLead.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Long }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://xmlns.oracle.com/oracle/apps/marketing/leadMgmt/leads/leadService/", name = "RejectedCount", scope = MklLead.class)
    public JAXBElement<Long> createMklLeadRejectedCount(Long value) {
        return new JAXBElement<Long>(_MklLeadRejectedCount_QNAME, Long.class, MklLead.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link XMLGregorianCalendar }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://xmlns.oracle.com/oracle/apps/marketing/leadMgmt/leads/leadService/", name = "ConvertedTimestamp", scope = MklLead.class)
    public JAXBElement<XMLGregorianCalendar> createMklLeadConvertedTimestamp(XMLGregorianCalendar value) {
        return new JAXBElement<XMLGregorianCalendar>(_MklLeadConvertedTimestamp_QNAME, XMLGregorianCalendar.class, MklLead.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://xmlns.oracle.com/oracle/apps/marketing/leadMgmt/leads/leadService/", name = "AssignmentStatusCode", scope = MklLead.class)
    public JAXBElement<String> createMklLeadAssignmentStatusCode(String value) {
        return new JAXBElement<String>(_MklLeadAssignmentStatusCode_QNAME, String.class, MklLead.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://xmlns.oracle.com/oracle/apps/marketing/leadMgmt/leads/leadService/", name = "RetireComment", scope = MklLead.class)
    public JAXBElement<String> createMklLeadRetireComment(String value) {
        return new JAXBElement<String>(_MklLeadRetireComment_QNAME, String.class, MklLead.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link XMLGregorianCalendar }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://xmlns.oracle.com/oracle/apps/marketing/leadMgmt/leads/leadService/", name = "CreationDateFormatted", scope = MklLead.class)
    public JAXBElement<XMLGregorianCalendar> createMklLeadCreationDateFormatted(XMLGregorianCalendar value) {
        return new JAXBElement<XMLGregorianCalendar>(_MklLeadCreationDateFormatted_QNAME, XMLGregorianCalendar.class, MklLead.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Long }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://xmlns.oracle.com/oracle/apps/marketing/leadMgmt/leads/leadService/", name = "OwnerId", scope = MklLead.class)
    public JAXBElement<Long> createMklLeadOwnerId(Long value) {
        return new JAXBElement<Long>(_MklLeadOwnerId_QNAME, Long.class, MklLead.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://xmlns.oracle.com/oracle/apps/marketing/leadMgmt/leads/leadService/", name = "PrimaryContactAddress4", scope = MklLead.class)
    public JAXBElement<String> createMklLeadPrimaryContactAddress4(String value) {
        return new JAXBElement<String>(_MklLeadPrimaryContactAddress4_QNAME, String.class, MklLead.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Long }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://xmlns.oracle.com/oracle/apps/marketing/leadMgmt/leads/leadService/", name = "QualificationScore", scope = MklLead.class)
    public JAXBElement<Long> createMklLeadQualificationScore(Long value) {
        return new JAXBElement<Long>(_MklLeadQualificationScore_QNAME, Long.class, MklLead.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://xmlns.oracle.com/oracle/apps/marketing/leadMgmt/leads/leadService/", name = "PrimaryContactAddress3", scope = MklLead.class)
    public JAXBElement<String> createMklLeadPrimaryContactAddress3(String value) {
        return new JAXBElement<String>(_MklLeadPrimaryContactAddress3_QNAME, String.class, MklLead.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Long }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://xmlns.oracle.com/oracle/apps/marketing/leadMgmt/leads/leadService/", name = "RejectByTerritoryId", scope = MklLead.class)
    public JAXBElement<Long> createMklLeadRejectByTerritoryId(Long value) {
        return new JAXBElement<Long>(_MklLeadRejectByTerritoryId_QNAME, Long.class, MklLead.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://xmlns.oracle.com/oracle/apps/marketing/leadMgmt/leads/leadService/", name = "PrimaryContactAddress2", scope = MklLead.class)
    public JAXBElement<String> createMklLeadPrimaryContactAddress2(String value) {
        return new JAXBElement<String>(_MklLeadPrimaryContactAddress2_QNAME, String.class, MklLead.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://xmlns.oracle.com/oracle/apps/marketing/leadMgmt/leads/leadService/", name = "PrimaryContactAddress1", scope = MklLead.class)
    public JAXBElement<String> createMklLeadPrimaryContactAddress1(String value) {
        return new JAXBElement<String>(_MklLeadPrimaryContactAddress1_QNAME, String.class, MklLead.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Long }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://xmlns.oracle.com/oracle/apps/marketing/leadMgmt/leads/leadService/", name = "PrimaryProductGroupId", scope = MklLead.class)
    public JAXBElement<Long> createMklLeadPrimaryProductGroupId(Long value) {
        return new JAXBElement<Long>(_MklLeadPrimaryProductGroupId_QNAME, Long.class, MklLead.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://xmlns.oracle.com/oracle/apps/marketing/leadMgmt/leads/leadService/", name = "ConvCurrencyCode", scope = MklLead.class)
    public JAXBElement<String> createMklLeadConvCurrencyCode(String value) {
        return new JAXBElement<String>(_MklLeadConvCurrencyCode_QNAME, String.class, MklLead.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://xmlns.oracle.com/oracle/apps/marketing/leadMgmt/leads/leadService/", name = "ConvRateType", scope = MklLead.class)
    public JAXBElement<String> createMklLeadConvRateType(String value) {
        return new JAXBElement<String>(_MklLeadConvRateType_QNAME, String.class, MklLead.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://xmlns.oracle.com/oracle/apps/marketing/leadMgmt/leads/leadService/", name = "CustomerSICCode", scope = MklLead.class)
    public JAXBElement<String> createMklLeadCustomerSICCode(String value) {
        return new JAXBElement<String>(_MklLeadCustomerSICCode_QNAME, String.class, MklLead.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Long }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://xmlns.oracle.com/oracle/apps/marketing/leadMgmt/leads/leadService/", name = "PrimaryInventoryOrgId", scope = MklLead.class)
    public JAXBElement<Long> createMklLeadPrimaryInventoryOrgId(Long value) {
        return new JAXBElement<Long>(_MklLeadPrimaryInventoryOrgId_QNAME, Long.class, MklLead.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://xmlns.oracle.com/oracle/apps/marketing/leadMgmt/leads/leadService/", name = "ProdNameOrGroupName", scope = MklLead.class)
    public JAXBElement<String> createMklLeadProdNameOrGroupName(String value) {
        return new JAXBElement<String>(_MklLeadProdNameOrGroupName_QNAME, String.class, MklLead.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://xmlns.oracle.com/oracle/apps/marketing/leadMgmt/leads/leadService/", name = "PrimaryContactFormattedPhoneNumber", scope = MklLead.class)
    public JAXBElement<String> createMklLeadPrimaryContactFormattedPhoneNumber(String value) {
        return new JAXBElement<String>(_MklLeadPrimaryContactFormattedPhoneNumber_QNAME, String.class, MklLead.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link AmountType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://xmlns.oracle.com/oracle/apps/marketing/leadMgmt/leads/leadService/", name = "DealAmount", scope = MklLead.class)
    public JAXBElement<AmountType> createMklLeadDealAmount(AmountType value) {
        return new JAXBElement<AmountType>(_MklLeadDealAmount_QNAME, AmountType.class, MklLead.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://xmlns.oracle.com/oracle/apps/marketing/leadMgmt/leads/leadService/", name = "PrimaryContactPersonLastName", scope = MklLead.class)
    public JAXBElement<String> createMklLeadPrimaryContactPersonLastName(String value) {
        return new JAXBElement<String>(_MklLeadPrimaryContactPersonLastName_QNAME, String.class, MklLead.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link XMLGregorianCalendar }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://xmlns.oracle.com/oracle/apps/marketing/leadMgmt/leads/leadService/", name = "RetiredDateTime", scope = MklLead.class)
    public JAXBElement<XMLGregorianCalendar> createMklLeadRetiredDateTime(XMLGregorianCalendar value) {
        return new JAXBElement<XMLGregorianCalendar>(_MklLeadRetiredDateTime_QNAME, XMLGregorianCalendar.class, MklLead.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://xmlns.oracle.com/oracle/apps/marketing/leadMgmt/leads/leadService/", name = "RegistrationTypeMeaning", scope = MklLead.class)
    public JAXBElement<String> createMklLeadRegistrationTypeMeaning(String value) {
        return new JAXBElement<String>(_MklLeadRegistrationTypeMeaning_QNAME, String.class, MklLead.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://xmlns.oracle.com/oracle/apps/marketing/leadMgmt/leads/leadService/", name = "PrimaryContactCity", scope = MklLead.class)
    public JAXBElement<String> createMklLeadPrimaryContactCity(String value) {
        return new JAXBElement<String>(_MklLeadPrimaryContactCity_QNAME, String.class, MklLead.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link XMLGregorianCalendar }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://xmlns.oracle.com/oracle/apps/marketing/leadMgmt/leads/leadService/", name = "LastAssignmentDate", scope = MklLead.class)
    public JAXBElement<XMLGregorianCalendar> createMklLeadLastAssignmentDate(XMLGregorianCalendar value) {
        return new JAXBElement<XMLGregorianCalendar>(_MklLeadLastAssignmentDate_QNAME, XMLGregorianCalendar.class, MklLead.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link XMLGregorianCalendar }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://xmlns.oracle.com/oracle/apps/marketing/leadMgmt/leads/leadService/", name = "RejectedDateTime", scope = MklLead.class)
    public JAXBElement<XMLGregorianCalendar> createMklLeadRejectedDateTime(XMLGregorianCalendar value) {
        return new JAXBElement<XMLGregorianCalendar>(_MklLeadRejectedDateTime_QNAME, XMLGregorianCalendar.class, MklLead.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://xmlns.oracle.com/oracle/apps/marketing/leadMgmt/leads/leadService/", name = "CustomerAddress4", scope = MklLead.class)
    public JAXBElement<String> createMklLeadCustomerAddress4(String value) {
        return new JAXBElement<String>(_MklLeadCustomerAddress4_QNAME, String.class, MklLead.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://xmlns.oracle.com/oracle/apps/marketing/leadMgmt/leads/leadService/", name = "CustomerAddress3", scope = MklLead.class)
    public JAXBElement<String> createMklLeadCustomerAddress3(String value) {
        return new JAXBElement<String>(_MklLeadCustomerAddress3_QNAME, String.class, MklLead.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://xmlns.oracle.com/oracle/apps/marketing/leadMgmt/leads/leadService/", name = "CustomerAddress2", scope = MklLead.class)
    public JAXBElement<String> createMklLeadCustomerAddress2(String value) {
        return new JAXBElement<String>(_MklLeadCustomerAddress2_QNAME, String.class, MklLead.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://xmlns.oracle.com/oracle/apps/marketing/leadMgmt/leads/leadService/", name = "Timeframe", scope = MklLead.class)
    public JAXBElement<String> createMklLeadTimeframe(String value) {
        return new JAXBElement<String>(_MklLeadTimeframe_QNAME, String.class, MklLead.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://xmlns.oracle.com/oracle/apps/marketing/leadMgmt/leads/leadService/", name = "BudgetCurrencyCode", scope = MklLead.class)
    public JAXBElement<String> createMklLeadBudgetCurrencyCode(String value) {
        return new JAXBElement<String>(_MklLeadBudgetCurrencyCode_QNAME, String.class, MklLead.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://xmlns.oracle.com/oracle/apps/marketing/leadMgmt/leads/leadService/", name = "CustomerAddress1", scope = MklLead.class)
    public JAXBElement<String> createMklLeadCustomerAddress1(String value) {
        return new JAXBElement<String>(_MklLeadCustomerAddress1_QNAME, String.class, MklLead.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://xmlns.oracle.com/oracle/apps/marketing/leadMgmt/leads/leadService/", name = "CustomerURL", scope = MklLead.class)
    public JAXBElement<String> createMklLeadCustomerURL(String value) {
        return new JAXBElement<String>(_MklLeadCustomerURL_QNAME, String.class, MklLead.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://xmlns.oracle.com/oracle/apps/marketing/leadMgmt/leads/leadService/", name = "CustomerNeed", scope = MklLead.class)
    public JAXBElement<String> createMklLeadCustomerNeed(String value) {
        return new JAXBElement<String>(_MklLeadCustomerNeed_QNAME, String.class, MklLead.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://xmlns.oracle.com/oracle/apps/marketing/leadMgmt/leads/leadService/", name = "CustomerCity", scope = MklLead.class)
    public JAXBElement<String> createMklLeadCustomerCity(String value) {
        return new JAXBElement<String>(_MklLeadCustomerCity_QNAME, String.class, MklLead.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://xmlns.oracle.com/oracle/apps/marketing/leadMgmt/leads/leadService/", name = "RejectReasonCode", scope = MklLead.class)
    public JAXBElement<String> createMklLeadRejectReasonCode(String value) {
        return new JAXBElement<String>(_MklLeadRejectReasonCode_QNAME, String.class, MklLead.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Long }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://xmlns.oracle.com/oracle/apps/marketing/leadMgmt/leads/leadService/", name = "PartnerId", scope = MklLead.class)
    public JAXBElement<Long> createMklLeadPartnerId(Long value) {
        return new JAXBElement<Long>(_MklLeadPartnerId_QNAME, Long.class, MklLead.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link XMLGregorianCalendar }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://xmlns.oracle.com/oracle/apps/marketing/leadMgmt/leads/leadService/", name = "LastUpdateDateFormatted", scope = MklLead.class)
    public JAXBElement<XMLGregorianCalendar> createMklLeadLastUpdateDateFormatted(XMLGregorianCalendar value) {
        return new JAXBElement<XMLGregorianCalendar>(_MklLeadLastUpdateDateFormatted_QNAME, XMLGregorianCalendar.class, MklLead.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://xmlns.oracle.com/oracle/apps/marketing/leadMgmt/leads/leadService/", name = "StatusCode", scope = MklLead.class)
    public JAXBElement<String> createMklLeadStatusCode(String value) {
        return new JAXBElement<String>(_MklLeadStatusCode_QNAME, String.class, MklLead.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link XMLGregorianCalendar }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://xmlns.oracle.com/oracle/apps/marketing/leadMgmt/leads/leadService/", name = "EstimatedCloseDate", scope = MklLead.class)
    public JAXBElement<XMLGregorianCalendar> createMklLeadEstimatedCloseDate(XMLGregorianCalendar value) {
        return new JAXBElement<XMLGregorianCalendar>(_MklLeadEstimatedCloseDate_QNAME, XMLGregorianCalendar.class, MklLead.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Long }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://xmlns.oracle.com/oracle/apps/marketing/leadMgmt/leads/leadService/", name = "PartnerProgramId", scope = MklLead.class)
    public JAXBElement<Long> createMklLeadPartnerProgramId(Long value) {
        return new JAXBElement<Long>(_MklLeadPartnerProgramId_QNAME, Long.class, MklLead.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://xmlns.oracle.com/oracle/apps/marketing/leadMgmt/leads/leadService/", name = "Rank", scope = MklLead.class)
    public JAXBElement<String> createMklLeadRank(String value) {
        return new JAXBElement<String>(_MklLeadRank_QNAME, String.class, MklLead.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://xmlns.oracle.com/oracle/apps/marketing/leadMgmt/leads/leadService/", name = "CustomerRegistryId", scope = MklLead.class)
    public JAXBElement<String> createMklLeadCustomerRegistryId(String value) {
        return new JAXBElement<String>(_MklLeadCustomerRegistryId_QNAME, String.class, MklLead.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://xmlns.oracle.com/oracle/apps/marketing/leadMgmt/leads/leadService/", name = "SalesChannel", scope = MklLead.class)
    public JAXBElement<String> createMklLeadSalesChannel(String value) {
        return new JAXBElement<String>(_MklLeadSalesChannel_QNAME, String.class, MklLead.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://xmlns.oracle.com/oracle/apps/marketing/leadMgmt/leads/leadService/", name = "RankMeaning", scope = MklLead.class)
    public JAXBElement<String> createMklLeadRankMeaning(String value) {
        return new JAXBElement<String>(_MklLeadRankMeaning_QNAME, String.class, MklLead.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link XMLGregorianCalendar }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://xmlns.oracle.com/oracle/apps/marketing/leadMgmt/leads/leadService/", name = "ExpirationDate", scope = MklLead.class)
    public JAXBElement<XMLGregorianCalendar> createMklLeadExpirationDate(XMLGregorianCalendar value) {
        return new JAXBElement<XMLGregorianCalendar>(_MklLeadExpirationDate_QNAME, XMLGregorianCalendar.class, MklLead.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://xmlns.oracle.com/oracle/apps/marketing/leadMgmt/leads/leadService/", name = "LongDescription", scope = MklLead.class)
    public JAXBElement<String> createMklLeadLongDescription(String value) {
        return new JAXBElement<String>(_MklLeadLongDescription_QNAME, String.class, MklLead.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://xmlns.oracle.com/oracle/apps/marketing/leadMgmt/leads/leadService/", name = "OwnerTreeVersionId", scope = MklLead.class)
    public JAXBElement<String> createMklLeadOwnerTreeVersionId(String value) {
        return new JAXBElement<String>(_MklLeadOwnerTreeVersionId_QNAME, String.class, MklLead.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Long }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://xmlns.oracle.com/oracle/apps/marketing/leadMgmt/leads/leadService/", name = "OwnerResourceOrgId", scope = MklLead.class)
    public JAXBElement<Long> createMklLeadOwnerResourceOrgId(Long value) {
        return new JAXBElement<Long>(_MklLeadOwnerResourceOrgId_QNAME, Long.class, MklLead.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://xmlns.oracle.com/oracle/apps/marketing/leadMgmt/leads/leadService/", name = "ProgramName", scope = MklLead.class)
    public JAXBElement<String> createMklLeadProgramName(String value) {
        return new JAXBElement<String>(_MklLeadProgramName_QNAME, String.class, MklLead.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://xmlns.oracle.com/oracle/apps/marketing/leadMgmt/leads/leadService/", name = "PrimaryContactPersonMiddleName", scope = MklLead.class)
    public JAXBElement<String> createMklLeadPrimaryContactPersonMiddleName(String value) {
        return new JAXBElement<String>(_MklLeadPrimaryContactPersonMiddleName_QNAME, String.class, MklLead.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Long }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://xmlns.oracle.com/oracle/apps/marketing/leadMgmt/leads/leadService/", name = "RejectByTerritoryVersionId", scope = MklLead.class)
    public JAXBElement<Long> createMklLeadRejectByTerritoryVersionId(Long value) {
        return new JAXBElement<Long>(_MklLeadRejectByTerritoryVersionId_QNAME, Long.class, MklLead.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://xmlns.oracle.com/oracle/apps/marketing/leadMgmt/leads/leadService/", name = "Description", scope = MklLead.class)
    public JAXBElement<String> createMklLeadDescription(String value) {
        return new JAXBElement<String>(_MklLeadDescription_QNAME, String.class, MklLead.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://xmlns.oracle.com/oracle/apps/marketing/leadMgmt/leads/leadService/", name = "OwnerTreeStructureCode", scope = MklLead.class)
    public JAXBElement<String> createMklLeadOwnerTreeStructureCode(String value) {
        return new JAXBElement<String>(_MklLeadOwnerTreeStructureCode_QNAME, String.class, MklLead.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://xmlns.oracle.com/oracle/apps/marketing/leadMgmt/leads/leadService/", name = "CustomerPartyUniqueName", scope = MklLead.class)
    public JAXBElement<String> createMklLeadCustomerPartyUniqueName(String value) {
        return new JAXBElement<String>(_MklLeadCustomerPartyUniqueName_QNAME, String.class, MklLead.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://xmlns.oracle.com/oracle/apps/marketing/leadMgmt/leads/leadService/", name = "CurrencyCode", scope = MklLead.class)
    public JAXBElement<String> createMklLeadCurrencyCode(String value) {
        return new JAXBElement<String>(_MklLeadCurrencyCode_QNAME, String.class, MklLead.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Integer }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://xmlns.oracle.com/oracle/apps/marketing/leadMgmt/leads/leadService/", name = "DaysUntilExpiration", scope = MklLead.class)
    public JAXBElement<Integer> createMklLeadDaysUntilExpiration(Integer value) {
        return new JAXBElement<Integer>(_MklLeadDaysUntilExpiration_QNAME, Integer.class, MklLead.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://xmlns.oracle.com/oracle/apps/marketing/leadMgmt/leads/leadService/", name = "PrimaryContactPersonFirstName", scope = MklLead.class)
    public JAXBElement<String> createMklLeadPrimaryContactPersonFirstName(String value) {
        return new JAXBElement<String>(_MklLeadPrimaryContactPersonFirstName_QNAME, String.class, MklLead.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://xmlns.oracle.com/oracle/apps/marketing/leadMgmt/leads/leadService/", name = "Name", scope = MklLead.class)
    public JAXBElement<String> createMklLeadName(String value) {
        return new JAXBElement<String>(_MklLeadName_QNAME, String.class, MklLead.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link AmountType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://xmlns.oracle.com/oracle/apps/marketing/leadMgmt/leads/leadService/", name = "BudgetAmount", scope = MklLead.class)
    public JAXBElement<AmountType> createMklLeadBudgetAmount(AmountType value) {
        return new JAXBElement<AmountType>(_MklLeadBudgetAmount_QNAME, AmountType.class, MklLead.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://xmlns.oracle.com/oracle/apps/marketing/leadMgmt/leads/leadService/", name = "CampaignName", scope = MklLead.class)
    public JAXBElement<String> createMklLeadCampaignName(String value) {
        return new JAXBElement<String>(_MklLeadCampaignName_QNAME, String.class, MklLead.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link BigDecimal }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://xmlns.oracle.com/oracle/apps/marketing/leadMgmt/leads/leadService/", name = "ConvExchangeRate", scope = MklLead.class)
    public JAXBElement<BigDecimal> createMklLeadConvExchangeRate(BigDecimal value) {
        return new JAXBElement<BigDecimal>(_MklLeadConvExchangeRate_QNAME, BigDecimal.class, MklLead.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://xmlns.oracle.com/oracle/apps/marketing/leadMgmt/leads/leadService/", name = "RejectComment", scope = MklLead.class)
    public JAXBElement<String> createMklLeadRejectComment(String value) {
        return new JAXBElement<String>(_MklLeadRejectComment_QNAME, String.class, MklLead.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link XMLGregorianCalendar }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://xmlns.oracle.com/oracle/apps/marketing/leadMgmt/leads/leadService/", name = "QualifiedDateTime", scope = MklLead.class)
    public JAXBElement<XMLGregorianCalendar> createMklLeadQualifiedDateTime(XMLGregorianCalendar value) {
        return new JAXBElement<XMLGregorianCalendar>(_MklLeadQualifiedDateTime_QNAME, XMLGregorianCalendar.class, MklLead.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://xmlns.oracle.com/oracle/apps/marketing/leadMgmt/leads/leadService/", name = "AssignmentStatusCdMeaning", scope = MklLead.class)
    public JAXBElement<String> createMklLeadAssignmentStatusCdMeaning(String value) {
        return new JAXBElement<String>(_MklLeadAssignmentStatusCdMeaning_QNAME, String.class, MklLead.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://xmlns.oracle.com/oracle/apps/marketing/leadMgmt/leads/leadService/", name = "JobTitle", scope = MklLead.class)
    public JAXBElement<String> createMklLeadJobTitle(String value) {
        return new JAXBElement<String>(_MklLeadJobTitle_QNAME, String.class, MklLead.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://xmlns.oracle.com/oracle/apps/marketing/leadMgmt/leads/leadService/", name = "PrimaryContactCounty", scope = MklLead.class)
    public JAXBElement<String> createMklLeadPrimaryContactCounty(String value) {
        return new JAXBElement<String>(_MklLeadPrimaryContactCounty_QNAME, String.class, MklLead.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Boolean }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://xmlns.oracle.com/oracle/apps/marketing/leadMgmt/leads/leadService/", name = "DecisionMakerIdentifiedFlag", scope = MklLead.class)
    public JAXBElement<Boolean> createMklLeadDecisionMakerIdentifiedFlag(Boolean value) {
        return new JAXBElement<Boolean>(_MklLeadDecisionMakerIdentifiedFlag_QNAME, Boolean.class, MklLead.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://xmlns.oracle.com/oracle/apps/marketing/leadMgmt/leads/leadService/", name = "PartnerType", scope = MklLead.class)
    public JAXBElement<String> createMklLeadPartnerType(String value) {
        return new JAXBElement<String>(_MklLeadPartnerType_QNAME, String.class, MklLead.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Long }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://xmlns.oracle.com/oracle/apps/marketing/leadMgmt/leads/leadService/", name = "PrimaryContactId", scope = MklLead.class)
    public JAXBElement<Long> createMklLeadPrimaryContactId(Long value) {
        return new JAXBElement<Long>(_MklLeadPrimaryContactId_QNAME, Long.class, MklLead.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://xmlns.oracle.com/oracle/apps/marketing/leadMgmt/leads/leadService/", name = "RegistrationStatusMeaning", scope = MklLead.class)
    public JAXBElement<String> createMklLeadRegistrationStatusMeaning(String value) {
        return new JAXBElement<String>(_MklLeadRegistrationStatusMeaning_QNAME, String.class, MklLead.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://xmlns.oracle.com/oracle/apps/marketing/leadMgmt/leads/leadService/", name = "PrimaryContactProvince", scope = MklLead.class)
    public JAXBElement<String> createMklLeadPrimaryContactProvince(String value) {
        return new JAXBElement<String>(_MklLeadPrimaryContactProvince_QNAME, String.class, MklLead.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link XMLGregorianCalendar }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://xmlns.oracle.com/oracle/apps/marketing/leadMgmt/leads/leadService/", name = "RetiredTimestamp", scope = MklLead.class)
    public JAXBElement<XMLGregorianCalendar> createMklLeadRetiredTimestamp(XMLGregorianCalendar value) {
        return new JAXBElement<XMLGregorianCalendar>(_MklLeadRetiredTimestamp_QNAME, XMLGregorianCalendar.class, MklLead.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://xmlns.oracle.com/oracle/apps/marketing/leadMgmt/leads/leadService/", name = "BranchCode", scope = MklLead.class)
    public JAXBElement<String> createMklLeadBranchCode(String value) {
        return new JAXBElement<String>(_MklLeadBranchCode_QNAME, String.class, MklLead.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://xmlns.oracle.com/oracle/apps/marketing/leadMgmt/leads/leadService/", name = "SourceCode", scope = MklLead.class)
    public JAXBElement<String> createMklLeadSourceCode(String value) {
        return new JAXBElement<String>(_MklLeadSourceCode_QNAME, String.class, MklLead.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Long }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://xmlns.oracle.com/oracle/apps/marketing/leadMgmt/leads/leadService/", name = "PrimaryInventoryItemId", scope = MklLead.class)
    public JAXBElement<Long> createMklLeadPrimaryInventoryItemId(Long value) {
        return new JAXBElement<Long>(_MklLeadPrimaryInventoryItemId_QNAME, Long.class, MklLead.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Boolean }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://xmlns.oracle.com/oracle/apps/marketing/leadMgmt/leads/leadService/", name = "LeadAcceptedFlag", scope = MklLead.class)
    public JAXBElement<Boolean> createMklLeadLeadAcceptedFlag(Boolean value) {
        return new JAXBElement<Boolean>(_MklLeadLeadAcceptedFlag_QNAME, Boolean.class, MklLead.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://xmlns.oracle.com/oracle/apps/marketing/leadMgmt/leads/leadService/", name = "SalesChannelMeaning", scope = MklLead.class)
    public JAXBElement<String> createMklLeadSalesChannelMeaning(String value) {
        return new JAXBElement<String>(_MklLeadSalesChannelMeaning_QNAME, String.class, MklLead.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://xmlns.oracle.com/oracle/apps/marketing/leadMgmt/leads/leadService/", name = "BudgetStatus", scope = MklLead.class)
    public JAXBElement<String> createMklLeadBudgetStatus(String value) {
        return new JAXBElement<String>(_MklLeadBudgetStatus_QNAME, String.class, MklLead.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link XMLGregorianCalendar }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://xmlns.oracle.com/oracle/apps/marketing/leadMgmt/leads/leadService/", name = "AcceptedDate", scope = MklLead.class)
    public JAXBElement<XMLGregorianCalendar> createMklLeadAcceptedDate(XMLGregorianCalendar value) {
        return new JAXBElement<XMLGregorianCalendar>(_MklLeadAcceptedDate_QNAME, XMLGregorianCalendar.class, MklLead.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Long }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://xmlns.oracle.com/oracle/apps/marketing/leadMgmt/leads/leadService/", name = "CustomerIdenAddrLocationId", scope = MklLead.class)
    public JAXBElement<Long> createMklLeadCustomerIdenAddrLocationId(Long value) {
        return new JAXBElement<Long>(_MklLeadCustomerIdenAddrLocationId_QNAME, Long.class, MklLead.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://xmlns.oracle.com/oracle/apps/marketing/leadMgmt/leads/leadService/", name = "RejectReasonCdMeaning", scope = MklLead.class)
    public JAXBElement<String> createMklLeadRejectReasonCdMeaning(String value) {
        return new JAXBElement<String>(_MklLeadRejectReasonCdMeaning_QNAME, String.class, MklLead.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://xmlns.oracle.com/oracle/apps/marketing/leadMgmt/leads/leadService/", name = "PrimaryContactPostalCode", scope = MklLead.class)
    public JAXBElement<String> createMklLeadPrimaryContactPostalCode(String value) {
        return new JAXBElement<String>(_MklLeadPrimaryContactPostalCode_QNAME, String.class, MklLead.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://xmlns.oracle.com/oracle/apps/marketing/leadMgmt/leads/leadService/", name = "StatusCdMeaning", scope = MklLead.class)
    public JAXBElement<String> createMklLeadStatusCdMeaning(String value) {
        return new JAXBElement<String>(_MklLeadStatusCdMeaning_QNAME, String.class, MklLead.class, value);
    }

}
