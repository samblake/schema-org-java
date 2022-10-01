/*
 * This class is auto generated by the schema.org code generator program.
 * https://github.com/Kobee1203/schema-org-java
 * Do not edit the class manually.
 */
package org.schema.model.impl;

import org.schema.model.datatype.Number;
import org.schema.model.QuantitativeValue;
import org.schema.model.datatype.URL;
import org.schema.model.datatype.Text;
import org.schema.model.Review;
import org.schema.model.Audience;
import org.schema.model.PhysicalActivityCategory;
import org.schema.model.Thing;
import org.schema.model.CategoryCode;
import org.schema.model.OpeningHoursSpecification;
import org.schema.model.Offer;
import org.schema.model.Demand;
import org.schema.model.Organization;
import org.schema.model.Person;
import org.schema.model.AggregateRating;
import org.schema.model.Service;
import org.schema.model.Product;
import org.schema.model.ServiceChannel;
import org.schema.model.Brand;
import org.schema.model.ImageObject;
import org.schema.model.GeoShape;
import org.schema.model.AdministrativeArea;
import org.schema.model.Place;
import org.schema.model.GovernmentBenefitsType;
import org.schema.model.OfferCatalog;
import org.schema.model.CreativeWork;
import org.schema.model.Action;
import org.schema.model.Event;
import org.schema.model.PropertyValue;
import org.schema.model.JsonLdTypeName;
import org.schema.model.Intangible;
import org.schema.model.FinancialProduct;
import org.schema.model.CurrencyConversionService;

/**
 * A service to convert funds from one currency to another currency.
 *
 * @see <a href="http://www.w3.org/wiki/WebSchemas/SchemaDotOrgSources#FIBO">http://www.w3.org/wiki/WebSchemas/SchemaDotOrgSources#FIBO</a>
 * @see <a href="https://schema.org/CurrencyConversionService">https://schema.org/CurrencyConversionService</a>
 */
@JsonLdTypeName("schema:CurrencyConversionService")
public class CurrencyConversionServiceImpl implements CurrencyConversionService {

    private Object fServiceType;

    /**
     * The type of service being offered, e.g. veterans' benefits, emergency relief, etc.
     *
     * @return {@link GovernmentBenefitsType} or {@link Text}
     */
    @Override
    public <T> T getServiceType() {
        return (T) fServiceType;
    }

    /**
     * The type of service being offered, e.g. veterans' benefits, emergency relief, etc.
     *
     */
    @Override
    public void setServiceType(Object fServiceType) {
        if(!(fServiceType instanceof GovernmentBenefitsType) && !(fServiceType instanceof Text)) {
            throw new java.lang.IllegalArgumentException("Invalid value for property 'serviceType': " + fServiceType);
        }
        this.fServiceType = fServiceType;
    }

    private Object fLogo;

    /**
     * An associated logo.
     *
     * @return {@link URL} or {@link ImageObject}
     * @see <a href="http://www.w3.org/wiki/WebSchemas/SchemaDotOrgSources#source_GoodRelationsTerms">http://www.w3.org/wiki/WebSchemas/SchemaDotOrgSources#source_GoodRelationsTerms</a>
     */
    @Override
    public <T> T getLogo() {
        return (T) fLogo;
    }

    /**
     * An associated logo.
     *
     * @see <a href="http://www.w3.org/wiki/WebSchemas/SchemaDotOrgSources#source_GoodRelationsTerms">http://www.w3.org/wiki/WebSchemas/SchemaDotOrgSources#source_GoodRelationsTerms</a>
     */
    @Override
    public void setLogo(Object fLogo) {
        if(!(fLogo instanceof URL) && !(fLogo instanceof ImageObject)) {
            throw new java.lang.IllegalArgumentException("Invalid value for property 'logo': " + fLogo);
        }
        this.fLogo = fLogo;
    }

    private Object fInterestRate;

    /**
     * The interest rate, charged or paid, applicable to the financial product. Note: This is different from the calculated annualPercentageRate.
     *
     * @return {@link Number} or {@link QuantitativeValue}
     * @see <a href="http://www.w3.org/wiki/WebSchemas/SchemaDotOrgSources#FIBO">http://www.w3.org/wiki/WebSchemas/SchemaDotOrgSources#FIBO</a>
     */
    @Override
    public <T> T getInterestRate() {
        return (T) fInterestRate;
    }

    /**
     * The interest rate, charged or paid, applicable to the financial product. Note: This is different from the calculated annualPercentageRate.
     *
     * @see <a href="http://www.w3.org/wiki/WebSchemas/SchemaDotOrgSources#FIBO">http://www.w3.org/wiki/WebSchemas/SchemaDotOrgSources#FIBO</a>
     */
    @Override
    public void setInterestRate(Object fInterestRate) {
        if(!(fInterestRate instanceof Number) && !(fInterestRate instanceof QuantitativeValue)) {
            throw new java.lang.IllegalArgumentException("Invalid value for property 'interestRate': " + fInterestRate);
        }
        this.fInterestRate = fInterestRate;
    }

    private Thing fServiceOutput;

    /**
     * The tangible thing generated by the service, e.g. a passport, permit, etc.
     *
     * @return {@link Thing}
     */
    @Override
    public Thing getServiceOutput() {
        return fServiceOutput;
    }

    /**
     * The tangible thing generated by the service, e.g. a passport, permit, etc.
     *
     */
    @Override
    public void setServiceOutput(Thing fServiceOutput) {
        this.fServiceOutput = fServiceOutput;
    }

    private Text fAlternateName;

    /**
     * An alias for the item.
     *
     * @return {@link Text}
     */
    @Override
    public Text getAlternateName() {
        return fAlternateName;
    }

    /**
     * An alias for the item.
     *
     */
    @Override
    public void setAlternateName(Text fAlternateName) {
        this.fAlternateName = fAlternateName;
    }

    private Audience fServiceAudience;

    /**
     * The audience eligible for this service.
     *
     * @return {@link Audience}
     */
    @Override
    public Audience getServiceAudience() {
        return fServiceAudience;
    }

    /**
     * The audience eligible for this service.
     *
     */
    @Override
    public void setServiceAudience(Audience fServiceAudience) {
        this.fServiceAudience = fServiceAudience;
    }

    private Text fProviderMobility;

    /**
     * Indicates the mobility of a provided service (e.g. 'static', 'dynamic').
     *
     * @return {@link Text}
     */
    @Override
    public Text getProviderMobility() {
        return fProviderMobility;
    }

    /**
     * Indicates the mobility of a provided service (e.g. 'static', 'dynamic').
     *
     */
    @Override
    public void setProviderMobility(Text fProviderMobility) {
        this.fProviderMobility = fProviderMobility;
    }

    private Object fMainEntityOfPage;

    /**
     * Indicates a page (or other CreativeWork) for which this thing is the main entity being described. See [background notes](/docs/datamodel.html#mainEntityBackground) for details.
     *
     * @return {@link CreativeWork} or {@link URL}
     */
    @Override
    public <T> T getMainEntityOfPage() {
        return (T) fMainEntityOfPage;
    }

    /**
     * Indicates a page (or other CreativeWork) for which this thing is the main entity being described. See [background notes](/docs/datamodel.html#mainEntityBackground) for details.
     *
     */
    @Override
    public void setMainEntityOfPage(Object fMainEntityOfPage) {
        if(!(fMainEntityOfPage instanceof CreativeWork) && !(fMainEntityOfPage instanceof URL)) {
            throw new java.lang.IllegalArgumentException("Invalid value for property 'mainEntityOfPage': " + fMainEntityOfPage);
        }
        this.fMainEntityOfPage = fMainEntityOfPage;
    }

    private Object fAreaServed;

    /**
     * The geographic area where a service or offered item is provided.
     *
     * @return {@link AdministrativeArea} or {@link GeoShape} or {@link Text} or {@link Place}
     */
    @Override
    public <T> T getAreaServed() {
        return (T) fAreaServed;
    }

    /**
     * The geographic area where a service or offered item is provided.
     *
     */
    @Override
    public void setAreaServed(Object fAreaServed) {
        if(!(fAreaServed instanceof AdministrativeArea) && !(fAreaServed instanceof GeoShape) && !(fAreaServed instanceof Text) && !(fAreaServed instanceof Place)) {
            throw new java.lang.IllegalArgumentException("Invalid value for property 'areaServed': " + fAreaServed);
        }
        this.fAreaServed = fAreaServed;
    }

    private Object fProvider;

    /**
     * The service provider, service operator, or service performer; the goods producer. Another party (a seller) may offer those services or goods on behalf of the provider. A provider may also serve as the seller.
     *
     * @return {@link Organization} or {@link Person}
     * @see <a href="https://pending.schema.org">https://pending.schema.org</a>
     * @see <a href="https://github.com/schemaorg/schemaorg/issues/2289">https://github.com/schemaorg/schemaorg/issues/2289</a>
     * @see <a href="https://github.com/schemaorg/schemaorg/issues/2927">https://github.com/schemaorg/schemaorg/issues/2927</a>
     */
    @Override
    public <T> T getProvider() {
        return (T) fProvider;
    }

    /**
     * The service provider, service operator, or service performer; the goods producer. Another party (a seller) may offer those services or goods on behalf of the provider. A provider may also serve as the seller.
     *
     * @see <a href="https://pending.schema.org">https://pending.schema.org</a>
     * @see <a href="https://github.com/schemaorg/schemaorg/issues/2289">https://github.com/schemaorg/schemaorg/issues/2289</a>
     * @see <a href="https://github.com/schemaorg/schemaorg/issues/2927">https://github.com/schemaorg/schemaorg/issues/2927</a>
     */
    @Override
    public void setProvider(Object fProvider) {
        if(!(fProvider instanceof Organization) && !(fProvider instanceof Person)) {
            throw new java.lang.IllegalArgumentException("Invalid value for property 'provider': " + fProvider);
        }
        this.fProvider = fProvider;
    }

    private Review fReview;

    /**
     * A review of the item.
     *
     * @return {@link Review}
     */
    @Override
    public Review getReview() {
        return fReview;
    }

    /**
     * A review of the item.
     *
     */
    @Override
    public void setReview(Review fReview) {
        this.fReview = fReview;
    }

    private Object fTermsOfService;

    /**
     * Human-readable terms of service documentation.
     *
     * @return {@link URL} or {@link Text}
     * @see <a href="https://pending.schema.org">https://pending.schema.org</a>
     * @see <a href="https://github.com/schemaorg/schemaorg/issues/1423">https://github.com/schemaorg/schemaorg/issues/1423</a>
     */
    @Override
    public <T> T getTermsOfService() {
        return (T) fTermsOfService;
    }

    /**
     * Human-readable terms of service documentation.
     *
     * @see <a href="https://pending.schema.org">https://pending.schema.org</a>
     * @see <a href="https://github.com/schemaorg/schemaorg/issues/1423">https://github.com/schemaorg/schemaorg/issues/1423</a>
     */
    @Override
    public void setTermsOfService(Object fTermsOfService) {
        if(!(fTermsOfService instanceof URL) && !(fTermsOfService instanceof Text)) {
            throw new java.lang.IllegalArgumentException("Invalid value for property 'termsOfService': " + fTermsOfService);
        }
        this.fTermsOfService = fTermsOfService;
    }

    private Object fCategory;

    /**
     * A category for the item. Greater signs or slashes can be used to informally indicate a category hierarchy.
     *
     * @return {@link URL} or {@link Text} or {@link PhysicalActivityCategory} or {@link Thing} or {@link CategoryCode}
     * @see <a href="https://github.com/schemaorg/schemaorg/issues/2490">https://github.com/schemaorg/schemaorg/issues/2490</a>
     * @see <a href="https://github.com/schemaorg/schemaorg/issues/1741">https://github.com/schemaorg/schemaorg/issues/1741</a>
     */
    @Override
    public <T> T getCategory() {
        return (T) fCategory;
    }

    /**
     * A category for the item. Greater signs or slashes can be used to informally indicate a category hierarchy.
     *
     * @see <a href="https://github.com/schemaorg/schemaorg/issues/2490">https://github.com/schemaorg/schemaorg/issues/2490</a>
     * @see <a href="https://github.com/schemaorg/schemaorg/issues/1741">https://github.com/schemaorg/schemaorg/issues/1741</a>
     */
    @Override
    public void setCategory(Object fCategory) {
        if(!(fCategory instanceof URL) && !(fCategory instanceof Text) && !(fCategory instanceof PhysicalActivityCategory) && !(fCategory instanceof Thing) && !(fCategory instanceof CategoryCode)) {
            throw new java.lang.IllegalArgumentException("Invalid value for property 'category': " + fCategory);
        }
        this.fCategory = fCategory;
    }

    private Object fBrand;

    /**
     * The brand(s) associated with a product or service, or the brand(s) maintained by an organization or business person.
     *
     * @return {@link Organization} or {@link Brand}
     */
    @Override
    public <T> T getBrand() {
        return (T) fBrand;
    }

    /**
     * The brand(s) associated with a product or service, or the brand(s) maintained by an organization or business person.
     *
     */
    @Override
    public void setBrand(Object fBrand) {
        if(!(fBrand instanceof Organization) && !(fBrand instanceof Brand)) {
            throw new java.lang.IllegalArgumentException("Invalid value for property 'brand': " + fBrand);
        }
        this.fBrand = fBrand;
    }

    private Action fPotentialAction;

    /**
     * Indicates a potential Action, which describes an idealized action in which this thing would play an 'object' role.
     *
     * @return {@link Action}
     */
    @Override
    public Action getPotentialAction() {
        return fPotentialAction;
    }

    /**
     * Indicates a potential Action, which describes an idealized action in which this thing would play an 'object' role.
     *
     */
    @Override
    public void setPotentialAction(Action fPotentialAction) {
        this.fPotentialAction = fPotentialAction;
    }

    private Object fServiceArea;

    /**
     * The geographic area where the service is provided.
     *
     * @return {@link GeoShape} or {@link AdministrativeArea} or {@link Place}
     */
    @Override
    public <T> T getServiceArea() {
        return (T) fServiceArea;
    }

    /**
     * The geographic area where the service is provided.
     *
     */
    @Override
    public void setServiceArea(Object fServiceArea) {
        if(!(fServiceArea instanceof GeoShape) && !(fServiceArea instanceof AdministrativeArea) && !(fServiceArea instanceof Place)) {
            throw new java.lang.IllegalArgumentException("Invalid value for property 'serviceArea': " + fServiceArea);
        }
        this.fServiceArea = fServiceArea;
    }

    private Object fSubjectOf;

    /**
     * A CreativeWork or Event about this Thing.
     *
     * @return {@link Event} or {@link CreativeWork}
     * @see <a href="https://github.com/schemaorg/schemaorg/issues/1670">https://github.com/schemaorg/schemaorg/issues/1670</a>
     */
    @Override
    public <T> T getSubjectOf() {
        return (T) fSubjectOf;
    }

    /**
     * A CreativeWork or Event about this Thing.
     *
     * @see <a href="https://github.com/schemaorg/schemaorg/issues/1670">https://github.com/schemaorg/schemaorg/issues/1670</a>
     */
    @Override
    public void setSubjectOf(Object fSubjectOf) {
        if(!(fSubjectOf instanceof Event) && !(fSubjectOf instanceof CreativeWork)) {
            throw new java.lang.IllegalArgumentException("Invalid value for property 'subjectOf': " + fSubjectOf);
        }
        this.fSubjectOf = fSubjectOf;
    }

    private AggregateRating fAggregateRating;

    /**
     * The overall rating, based on a collection of reviews or ratings, of the item.
     *
     * @return {@link AggregateRating}
     */
    @Override
    public AggregateRating getAggregateRating() {
        return fAggregateRating;
    }

    /**
     * The overall rating, based on a collection of reviews or ratings, of the item.
     *
     */
    @Override
    public void setAggregateRating(AggregateRating fAggregateRating) {
        this.fAggregateRating = fAggregateRating;
    }

    private ServiceChannel fAvailableChannel;

    /**
     * A means of accessing the service (e.g. a phone bank, a web site, a location, etc.).
     *
     * @return {@link ServiceChannel}
     */
    @Override
    public ServiceChannel getAvailableChannel() {
        return fAvailableChannel;
    }

    /**
     * A means of accessing the service (e.g. a phone bank, a web site, a location, etc.).
     *
     */
    @Override
    public void setAvailableChannel(ServiceChannel fAvailableChannel) {
        this.fAvailableChannel = fAvailableChannel;
    }

    private Text fName;

    /**
     * The name of the item.
     *
     * @return {@link Text}
     */
    @Override
    public Text getName() {
        return fName;
    }

    /**
     * The name of the item.
     *
     */
    @Override
    public void setName(Text fName) {
        this.fName = fName;
    }

    private Object fOffers;

    /**
     * An offer to provide this item&#x2014;for example, an offer to sell a product, rent the DVD of a movie, perform a service, or give away tickets to an event. Use [[businessFunction]] to indicate the kind of transaction offered, i.e. sell, lease, etc. This property can also be used to describe a [[Demand]]. While this property is listed as expected on a number of common types, it can be used in others. In that case, using a second type, such as Product or a subtype of Product, can clarify the nature of the offer.
     *       
     *
     * @return {@link Offer} or {@link Demand}
     * @see <a href="https://github.com/schemaorg/schemaorg/issues/2289">https://github.com/schemaorg/schemaorg/issues/2289</a>
     */
    @Override
    public <T> T getOffers() {
        return (T) fOffers;
    }

    /**
     * An offer to provide this item&#x2014;for example, an offer to sell a product, rent the DVD of a movie, perform a service, or give away tickets to an event. Use [[businessFunction]] to indicate the kind of transaction offered, i.e. sell, lease, etc. This property can also be used to describe a [[Demand]]. While this property is listed as expected on a number of common types, it can be used in others. In that case, using a second type, such as Product or a subtype of Product, can clarify the nature of the offer.
     *       
     *
     * @see <a href="https://github.com/schemaorg/schemaorg/issues/2289">https://github.com/schemaorg/schemaorg/issues/2289</a>
     */
    @Override
    public void setOffers(Object fOffers) {
        if(!(fOffers instanceof Offer) && !(fOffers instanceof Demand)) {
            throw new java.lang.IllegalArgumentException("Invalid value for property 'offers': " + fOffers);
        }
        this.fOffers = fOffers;
    }

    private Text fSlogan;

    /**
     * A slogan or motto associated with the item.
     *
     * @return {@link Text}
     */
    @Override
    public Text getSlogan() {
        return fSlogan;
    }

    /**
     * A slogan or motto associated with the item.
     *
     */
    @Override
    public void setSlogan(Text fSlogan) {
        this.fSlogan = fSlogan;
    }

    private Text fDisambiguatingDescription;

    /**
     * A sub property of description. A short description of the item used to disambiguate from other, similar items. Information from other properties (in particular, name) may be necessary for the description to be useful for disambiguation.
     *
     * @return {@link Text}
     */
    @Override
    public Text getDisambiguatingDescription() {
        return fDisambiguatingDescription;
    }

    /**
     * A sub property of description. A short description of the item used to disambiguate from other, similar items. Information from other properties (in particular, name) may be necessary for the description to be useful for disambiguation.
     *
     */
    @Override
    public void setDisambiguatingDescription(Text fDisambiguatingDescription) {
        this.fDisambiguatingDescription = fDisambiguatingDescription;
    }

    private Object fImage;

    /**
     * An image of the item. This can be a [[URL]] or a fully described [[ImageObject]].
     *
     * @return {@link URL} or {@link ImageObject}
     */
    @Override
    public <T> T getImage() {
        return (T) fImage;
    }

    /**
     * An image of the item. This can be a [[URL]] or a fully described [[ImageObject]].
     *
     */
    @Override
    public void setImage(Object fImage) {
        if(!(fImage instanceof URL) && !(fImage instanceof ImageObject)) {
            throw new java.lang.IllegalArgumentException("Invalid value for property 'image': " + fImage);
        }
        this.fImage = fImage;
    }

    private URL fSameAs;

    /**
     * URL of a reference Web page that unambiguously indicates the item's identity. E.g. the URL of the item's Wikipedia page, Wikidata entry, or official website.
     *
     * @return {@link URL}
     */
    @Override
    public URL getSameAs() {
        return fSameAs;
    }

    /**
     * URL of a reference Web page that unambiguously indicates the item's identity. E.g. the URL of the item's Wikipedia page, Wikidata entry, or official website.
     *
     */
    @Override
    public void setSameAs(URL fSameAs) {
        this.fSameAs = fSameAs;
    }

    private Object fIdentifier;

    /**
     * The identifier property represents any kind of identifier for any kind of [[Thing]], such as ISBNs, GTIN codes, UUIDs etc. Schema.org provides dedicated properties for representing many of these, either as textual strings or as URL (URI) links. See [background notes](/docs/datamodel.html#identifierBg) for more details.
     *         
     *
     * @return {@link URL} or {@link Text} or {@link PropertyValue}
     */
    @Override
    public <T> T getIdentifier() {
        return (T) fIdentifier;
    }

    /**
     * The identifier property represents any kind of identifier for any kind of [[Thing]], such as ISBNs, GTIN codes, UUIDs etc. Schema.org provides dedicated properties for representing many of these, either as textual strings or as URL (URI) links. See [background notes](/docs/datamodel.html#identifierBg) for more details.
     *         
     *
     */
    @Override
    public void setIdentifier(Object fIdentifier) {
        if(!(fIdentifier instanceof URL) && !(fIdentifier instanceof Text) && !(fIdentifier instanceof PropertyValue)) {
            throw new java.lang.IllegalArgumentException("Invalid value for property 'identifier': " + fIdentifier);
        }
        this.fIdentifier = fIdentifier;
    }

    private Object fIsSimilarTo;

    /**
     * A pointer to another, functionally similar product (or multiple products).
     *
     * @return {@link Service} or {@link Product}
     * @see <a href="http://www.w3.org/wiki/WebSchemas/SchemaDotOrgSources#source_GoodRelationsTerms">http://www.w3.org/wiki/WebSchemas/SchemaDotOrgSources#source_GoodRelationsTerms</a>
     */
    @Override
    public <T> T getIsSimilarTo() {
        return (T) fIsSimilarTo;
    }

    /**
     * A pointer to another, functionally similar product (or multiple products).
     *
     * @see <a href="http://www.w3.org/wiki/WebSchemas/SchemaDotOrgSources#source_GoodRelationsTerms">http://www.w3.org/wiki/WebSchemas/SchemaDotOrgSources#source_GoodRelationsTerms</a>
     */
    @Override
    public void setIsSimilarTo(Object fIsSimilarTo) {
        if(!(fIsSimilarTo instanceof Service) && !(fIsSimilarTo instanceof Product)) {
            throw new java.lang.IllegalArgumentException("Invalid value for property 'isSimilarTo': " + fIsSimilarTo);
        }
        this.fIsSimilarTo = fIsSimilarTo;
    }

    private Thing fProduces;

    /**
     * The tangible thing generated by the service, e.g. a passport, permit, etc.
     *
     * @return {@link Thing}
     */
    @Override
    public Thing getProduces() {
        return fProduces;
    }

    /**
     * The tangible thing generated by the service, e.g. a passport, permit, etc.
     *
     */
    @Override
    public void setProduces(Thing fProduces) {
        this.fProduces = fProduces;
    }

    private OfferCatalog fHasOfferCatalog;

    /**
     * Indicates an OfferCatalog listing for this Organization, Person, or Service.
     *
     * @return {@link OfferCatalog}
     */
    @Override
    public OfferCatalog getHasOfferCatalog() {
        return fHasOfferCatalog;
    }

    /**
     * Indicates an OfferCatalog listing for this Organization, Person, or Service.
     *
     */
    @Override
    public void setHasOfferCatalog(OfferCatalog fHasOfferCatalog) {
        this.fHasOfferCatalog = fHasOfferCatalog;
    }

    private Object fIsRelatedTo;

    /**
     * A pointer to another, somehow related product (or multiple products).
     *
     * @return {@link Service} or {@link Product}
     * @see <a href="http://www.w3.org/wiki/WebSchemas/SchemaDotOrgSources#source_GoodRelationsTerms">http://www.w3.org/wiki/WebSchemas/SchemaDotOrgSources#source_GoodRelationsTerms</a>
     */
    @Override
    public <T> T getIsRelatedTo() {
        return (T) fIsRelatedTo;
    }

    /**
     * A pointer to another, somehow related product (or multiple products).
     *
     * @see <a href="http://www.w3.org/wiki/WebSchemas/SchemaDotOrgSources#source_GoodRelationsTerms">http://www.w3.org/wiki/WebSchemas/SchemaDotOrgSources#source_GoodRelationsTerms</a>
     */
    @Override
    public void setIsRelatedTo(Object fIsRelatedTo) {
        if(!(fIsRelatedTo instanceof Service) && !(fIsRelatedTo instanceof Product)) {
            throw new java.lang.IllegalArgumentException("Invalid value for property 'isRelatedTo': " + fIsRelatedTo);
        }
        this.fIsRelatedTo = fIsRelatedTo;
    }

    private URL fUrl;

    /**
     * URL of the item.
     *
     * @return {@link URL}
     */
    @Override
    public URL getUrl() {
        return fUrl;
    }

    /**
     * URL of the item.
     *
     */
    @Override
    public void setUrl(URL fUrl) {
        this.fUrl = fUrl;
    }

    private Audience fAudience;

    /**
     * An intended audience, i.e. a group for whom something was created.
     *
     * @return {@link Audience}
     */
    @Override
    public Audience getAudience() {
        return fAudience;
    }

    /**
     * An intended audience, i.e. a group for whom something was created.
     *
     */
    @Override
    public void setAudience(Audience fAudience) {
        this.fAudience = fAudience;
    }

    private Object fFeesAndCommissionsSpecification;

    /**
     * Description of fees, commissions, and other terms applied either to a class of financial product, or by a financial service organization.
     *
     * @return {@link URL} or {@link Text}
     * @see <a href="http://www.w3.org/wiki/WebSchemas/SchemaDotOrgSources#FIBO">http://www.w3.org/wiki/WebSchemas/SchemaDotOrgSources#FIBO</a>
     */
    @Override
    public <T> T getFeesAndCommissionsSpecification() {
        return (T) fFeesAndCommissionsSpecification;
    }

    /**
     * Description of fees, commissions, and other terms applied either to a class of financial product, or by a financial service organization.
     *
     * @see <a href="http://www.w3.org/wiki/WebSchemas/SchemaDotOrgSources#FIBO">http://www.w3.org/wiki/WebSchemas/SchemaDotOrgSources#FIBO</a>
     */
    @Override
    public void setFeesAndCommissionsSpecification(Object fFeesAndCommissionsSpecification) {
        if(!(fFeesAndCommissionsSpecification instanceof URL) && !(fFeesAndCommissionsSpecification instanceof Text)) {
            throw new java.lang.IllegalArgumentException("Invalid value for property 'feesAndCommissionsSpecification': " + fFeesAndCommissionsSpecification);
        }
        this.fFeesAndCommissionsSpecification = fFeesAndCommissionsSpecification;
    }

    private Object fBroker;

    /**
     * An entity that arranges for an exchange between a buyer and a seller.  In most cases a broker never acquires or releases ownership of a product or service involved in an exchange.  If it is not clear whether an entity is a broker, seller, or buyer, the latter two terms are preferred.
     *
     * @return {@link Person} or {@link Organization}
     */
    @Override
    public <T> T getBroker() {
        return (T) fBroker;
    }

    /**
     * An entity that arranges for an exchange between a buyer and a seller.  In most cases a broker never acquires or releases ownership of a product or service involved in an exchange.  If it is not clear whether an entity is a broker, seller, or buyer, the latter two terms are preferred.
     *
     */
    @Override
    public void setBroker(Object fBroker) {
        if(!(fBroker instanceof Person) && !(fBroker instanceof Organization)) {
            throw new java.lang.IllegalArgumentException("Invalid value for property 'broker': " + fBroker);
        }
        this.fBroker = fBroker;
    }

    private URL fAdditionalType;

    /**
     * An additional type for the item, typically used for adding more specific types from external vocabularies in microdata syntax. This is a relationship between something and a class that the thing is in. In RDFa syntax, it is better to use the native RDFa syntax - the 'typeof' attribute - for multiple types. Schema.org tools may have only weaker understanding of extra types, in particular those defined externally.
     *
     * @return {@link URL}
     */
    @Override
    public URL getAdditionalType() {
        return fAdditionalType;
    }

    /**
     * An additional type for the item, typically used for adding more specific types from external vocabularies in microdata syntax. This is a relationship between something and a class that the thing is in. In RDFa syntax, it is better to use the native RDFa syntax - the 'typeof' attribute - for multiple types. Schema.org tools may have only weaker understanding of extra types, in particular those defined externally.
     *
     */
    @Override
    public void setAdditionalType(URL fAdditionalType) {
        this.fAdditionalType = fAdditionalType;
    }

    private Text fAward;

    /**
     * An award won by or for this item.
     *
     * @return {@link Text}
     */
    @Override
    public Text getAward() {
        return fAward;
    }

    /**
     * An award won by or for this item.
     *
     */
    @Override
    public void setAward(Text fAward) {
        this.fAward = fAward;
    }

    private Text fDescription;

    /**
     * A description of the item.
     *
     * @return {@link Text}
     */
    @Override
    public Text getDescription() {
        return fDescription;
    }

    /**
     * A description of the item.
     *
     */
    @Override
    public void setDescription(Text fDescription) {
        this.fDescription = fDescription;
    }

    private Object fAnnualPercentageRate;

    /**
     * The annual rate that is charged for borrowing (or made by investing), expressed as a single percentage number that represents the actual yearly cost of funds over the term of a loan. This includes any fees or additional costs associated with the transaction.
     *
     * @return {@link Number} or {@link QuantitativeValue}
     * @see <a href="http://www.w3.org/wiki/WebSchemas/SchemaDotOrgSources#FIBO">http://www.w3.org/wiki/WebSchemas/SchemaDotOrgSources#FIBO</a>
     */
    @Override
    public <T> T getAnnualPercentageRate() {
        return (T) fAnnualPercentageRate;
    }

    /**
     * The annual rate that is charged for borrowing (or made by investing), expressed as a single percentage number that represents the actual yearly cost of funds over the term of a loan. This includes any fees or additional costs associated with the transaction.
     *
     * @see <a href="http://www.w3.org/wiki/WebSchemas/SchemaDotOrgSources#FIBO">http://www.w3.org/wiki/WebSchemas/SchemaDotOrgSources#FIBO</a>
     */
    @Override
    public void setAnnualPercentageRate(Object fAnnualPercentageRate) {
        if(!(fAnnualPercentageRate instanceof Number) && !(fAnnualPercentageRate instanceof QuantitativeValue)) {
            throw new java.lang.IllegalArgumentException("Invalid value for property 'annualPercentageRate': " + fAnnualPercentageRate);
        }
        this.fAnnualPercentageRate = fAnnualPercentageRate;
    }

    private OpeningHoursSpecification fHoursAvailable;

    /**
     * The hours during which this service or contact is available.
     *
     * @return {@link OpeningHoursSpecification}
     */
    @Override
    public OpeningHoursSpecification getHoursAvailable() {
        return fHoursAvailable;
    }

    /**
     * The hours during which this service or contact is available.
     *
     */
    @Override
    public void setHoursAvailable(OpeningHoursSpecification fHoursAvailable) {
        this.fHoursAvailable = fHoursAvailable;
    }
}
