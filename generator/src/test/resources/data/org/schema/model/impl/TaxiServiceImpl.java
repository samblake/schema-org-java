/*
 * This class is auto generated by the schema.org code generator program.
 * https://github.com/Kobee1203/schema-org-java
 * Do not edit the class manually.
 */
package org.schema.model.impl;

import org.schema.model.Review;
import org.schema.model.datatype.Text;
import org.schema.model.Audience;
import org.schema.model.datatype.URL;
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
import com.weedow.schemaorg.commons.model.JsonLdTypeName;
import org.schema.model.Intangible;
import org.schema.model.TaxiService;

/**
 * A service for a vehicle for hire with a driver for local travel. Fares are usually calculated based on distance traveled.
 *
 * @see <a href="https://schema.org/TaxiService">https://schema.org/TaxiService</a>
 */
@JsonLdTypeName("TaxiService")
public class TaxiServiceImpl extends com.weedow.schemaorg.commons.model.JsonLdNodeImpl implements TaxiService {

    private Review review;

    /**
     * A review of the item.
     *
     * @return {@link Review}
     */
    @Override
    public Review getReview() {
        return review;
    }

    /**
     * A review of the item.
     *
     * @param review Review value to set.
     */
    @Override
    public void setReview(Review review) {
        this.review = review;
    }

    private Text award;

    /**
     * An award won by or for this item.
     *
     * @return {@link Text}
     */
    @Override
    public Text getAward() {
        return award;
    }

    /**
     * An award won by or for this item.
     *
     * @param award Text value to set.
     */
    @Override
    public void setAward(Text award) {
        this.award = award;
    }

    private Audience serviceAudience;

    /**
     * The audience eligible for this service.
     *
     * @return {@link Audience}
     */
    @Override
    public Audience getServiceAudience() {
        return serviceAudience;
    }

    /**
     * The audience eligible for this service.
     *
     * @param serviceAudience Audience value to set.
     */
    @Override
    public void setServiceAudience(Audience serviceAudience) {
        this.serviceAudience = serviceAudience;
    }

    private Object category;

    /**
     * A category for the item. Greater signs or slashes can be used to informally indicate a category hierarchy.
     *
     * @return {@link URL} or {@link Text} or {@link PhysicalActivityCategory} or {@link Thing} or {@link CategoryCode}
     * @see <a href="https://github.com/schemaorg/schemaorg/issues/2490">https://github.com/schemaorg/schemaorg/issues/2490</a>
     * @see <a href="https://github.com/schemaorg/schemaorg/issues/1741">https://github.com/schemaorg/schemaorg/issues/1741</a>
     */
    @Override
    public <T> T getCategory() {
        return (T) category;
    }

    /**
     * A category for the item. Greater signs or slashes can be used to informally indicate a category hierarchy.
     *
     * @param category URL value to set.
     * @see <a href="https://github.com/schemaorg/schemaorg/issues/2490">https://github.com/schemaorg/schemaorg/issues/2490</a>
     * @see <a href="https://github.com/schemaorg/schemaorg/issues/1741">https://github.com/schemaorg/schemaorg/issues/1741</a>
     */
    @Override
    public void setCategory(URL category) {
        this.category = category;
    }
    /**
     * A category for the item. Greater signs or slashes can be used to informally indicate a category hierarchy.
     *
     * @param category Text value to set.
     * @see <a href="https://github.com/schemaorg/schemaorg/issues/2490">https://github.com/schemaorg/schemaorg/issues/2490</a>
     * @see <a href="https://github.com/schemaorg/schemaorg/issues/1741">https://github.com/schemaorg/schemaorg/issues/1741</a>
     */
    @Override
    public void setCategory(Text category) {
        this.category = category;
    }
    /**
     * A category for the item. Greater signs or slashes can be used to informally indicate a category hierarchy.
     *
     * @param category PhysicalActivityCategory value to set.
     * @see <a href="https://github.com/schemaorg/schemaorg/issues/2490">https://github.com/schemaorg/schemaorg/issues/2490</a>
     * @see <a href="https://github.com/schemaorg/schemaorg/issues/1741">https://github.com/schemaorg/schemaorg/issues/1741</a>
     */
    @Override
    public void setCategory(PhysicalActivityCategory category) {
        this.category = category;
    }
    /**
     * A category for the item. Greater signs or slashes can be used to informally indicate a category hierarchy.
     *
     * @param category Thing value to set.
     * @see <a href="https://github.com/schemaorg/schemaorg/issues/2490">https://github.com/schemaorg/schemaorg/issues/2490</a>
     * @see <a href="https://github.com/schemaorg/schemaorg/issues/1741">https://github.com/schemaorg/schemaorg/issues/1741</a>
     */
    @Override
    public void setCategory(Thing category) {
        this.category = category;
    }
    /**
     * A category for the item. Greater signs or slashes can be used to informally indicate a category hierarchy.
     *
     * @param category CategoryCode value to set.
     * @see <a href="https://github.com/schemaorg/schemaorg/issues/2490">https://github.com/schemaorg/schemaorg/issues/2490</a>
     * @see <a href="https://github.com/schemaorg/schemaorg/issues/1741">https://github.com/schemaorg/schemaorg/issues/1741</a>
     */
    @Override
    public void setCategory(CategoryCode category) {
        this.category = category;
    }

    private OpeningHoursSpecification hoursAvailable;

    /**
     * The hours during which this service or contact is available.
     *
     * @return {@link OpeningHoursSpecification}
     */
    @Override
    public OpeningHoursSpecification getHoursAvailable() {
        return hoursAvailable;
    }

    /**
     * The hours during which this service or contact is available.
     *
     * @param hoursAvailable OpeningHoursSpecification value to set.
     */
    @Override
    public void setHoursAvailable(OpeningHoursSpecification hoursAvailable) {
        this.hoursAvailable = hoursAvailable;
    }

    private Audience audience;

    /**
     * An intended audience, i.e. a group for whom something was created.
     *
     * @return {@link Audience}
     */
    @Override
    public Audience getAudience() {
        return audience;
    }

    /**
     * An intended audience, i.e. a group for whom something was created.
     *
     * @param audience Audience value to set.
     */
    @Override
    public void setAudience(Audience audience) {
        this.audience = audience;
    }

    private Object offers;

    /**
     * An offer to provide this item&#x2014;for example, an offer to sell a product, rent the DVD of a movie, perform a service, or give away tickets to an event. Use [[businessFunction]] to indicate the kind of transaction offered, i.e. sell, lease, etc. This property can also be used to describe a [[Demand]]. While this property is listed as expected on a number of common types, it can be used in others. In that case, using a second type, such as Product or a subtype of Product, can clarify the nature of the offer.
     *       
     *
     * @return {@link Offer} or {@link Demand}
     * @see <a href="https://github.com/schemaorg/schemaorg/issues/2289">https://github.com/schemaorg/schemaorg/issues/2289</a>
     */
    @Override
    public <T> T getOffers() {
        return (T) offers;
    }

    /**
     * An offer to provide this item&#x2014;for example, an offer to sell a product, rent the DVD of a movie, perform a service, or give away tickets to an event. Use [[businessFunction]] to indicate the kind of transaction offered, i.e. sell, lease, etc. This property can also be used to describe a [[Demand]]. While this property is listed as expected on a number of common types, it can be used in others. In that case, using a second type, such as Product or a subtype of Product, can clarify the nature of the offer.
     *       
     *
     * @param offers Offer value to set.
     * @see <a href="https://github.com/schemaorg/schemaorg/issues/2289">https://github.com/schemaorg/schemaorg/issues/2289</a>
     */
    @Override
    public void setOffers(Offer offers) {
        this.offers = offers;
    }
    /**
     * An offer to provide this item&#x2014;for example, an offer to sell a product, rent the DVD of a movie, perform a service, or give away tickets to an event. Use [[businessFunction]] to indicate the kind of transaction offered, i.e. sell, lease, etc. This property can also be used to describe a [[Demand]]. While this property is listed as expected on a number of common types, it can be used in others. In that case, using a second type, such as Product or a subtype of Product, can clarify the nature of the offer.
     *       
     *
     * @param offers Demand value to set.
     * @see <a href="https://github.com/schemaorg/schemaorg/issues/2289">https://github.com/schemaorg/schemaorg/issues/2289</a>
     */
    @Override
    public void setOffers(Demand offers) {
        this.offers = offers;
    }

    private Thing serviceOutput;

    /**
     * The tangible thing generated by the service, e.g. a passport, permit, etc.
     *
     * @return {@link Thing}
     */
    @Override
    public Thing getServiceOutput() {
        return serviceOutput;
    }

    /**
     * The tangible thing generated by the service, e.g. a passport, permit, etc.
     *
     * @param serviceOutput Thing value to set.
     */
    @Override
    public void setServiceOutput(Thing serviceOutput) {
        this.serviceOutput = serviceOutput;
    }

    private Object provider;

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
        return (T) provider;
    }

    /**
     * The service provider, service operator, or service performer; the goods producer. Another party (a seller) may offer those services or goods on behalf of the provider. A provider may also serve as the seller.
     *
     * @param provider Organization value to set.
     * @see <a href="https://pending.schema.org">https://pending.schema.org</a>
     * @see <a href="https://github.com/schemaorg/schemaorg/issues/2289">https://github.com/schemaorg/schemaorg/issues/2289</a>
     * @see <a href="https://github.com/schemaorg/schemaorg/issues/2927">https://github.com/schemaorg/schemaorg/issues/2927</a>
     */
    @Override
    public void setProvider(Organization provider) {
        this.provider = provider;
    }
    /**
     * The service provider, service operator, or service performer; the goods producer. Another party (a seller) may offer those services or goods on behalf of the provider. A provider may also serve as the seller.
     *
     * @param provider Person value to set.
     * @see <a href="https://pending.schema.org">https://pending.schema.org</a>
     * @see <a href="https://github.com/schemaorg/schemaorg/issues/2289">https://github.com/schemaorg/schemaorg/issues/2289</a>
     * @see <a href="https://github.com/schemaorg/schemaorg/issues/2927">https://github.com/schemaorg/schemaorg/issues/2927</a>
     */
    @Override
    public void setProvider(Person provider) {
        this.provider = provider;
    }

    private Object termsOfService;

    /**
     * Human-readable terms of service documentation.
     *
     * @return {@link URL} or {@link Text}
     * @see <a href="https://pending.schema.org">https://pending.schema.org</a>
     * @see <a href="https://github.com/schemaorg/schemaorg/issues/1423">https://github.com/schemaorg/schemaorg/issues/1423</a>
     */
    @Override
    public <T> T getTermsOfService() {
        return (T) termsOfService;
    }

    /**
     * Human-readable terms of service documentation.
     *
     * @param termsOfService URL value to set.
     * @see <a href="https://pending.schema.org">https://pending.schema.org</a>
     * @see <a href="https://github.com/schemaorg/schemaorg/issues/1423">https://github.com/schemaorg/schemaorg/issues/1423</a>
     */
    @Override
    public void setTermsOfService(URL termsOfService) {
        this.termsOfService = termsOfService;
    }
    /**
     * Human-readable terms of service documentation.
     *
     * @param termsOfService Text value to set.
     * @see <a href="https://pending.schema.org">https://pending.schema.org</a>
     * @see <a href="https://github.com/schemaorg/schemaorg/issues/1423">https://github.com/schemaorg/schemaorg/issues/1423</a>
     */
    @Override
    public void setTermsOfService(Text termsOfService) {
        this.termsOfService = termsOfService;
    }

    private Text providerMobility;

    /**
     * Indicates the mobility of a provided service (e.g. 'static', 'dynamic').
     *
     * @return {@link Text}
     */
    @Override
    public Text getProviderMobility() {
        return providerMobility;
    }

    /**
     * Indicates the mobility of a provided service (e.g. 'static', 'dynamic').
     *
     * @param providerMobility Text value to set.
     */
    @Override
    public void setProviderMobility(Text providerMobility) {
        this.providerMobility = providerMobility;
    }

    private Object broker;

    /**
     * An entity that arranges for an exchange between a buyer and a seller.  In most cases a broker never acquires or releases ownership of a product or service involved in an exchange.  If it is not clear whether an entity is a broker, seller, or buyer, the latter two terms are preferred.
     *
     * @return {@link Person} or {@link Organization}
     */
    @Override
    public <T> T getBroker() {
        return (T) broker;
    }

    /**
     * An entity that arranges for an exchange between a buyer and a seller.  In most cases a broker never acquires or releases ownership of a product or service involved in an exchange.  If it is not clear whether an entity is a broker, seller, or buyer, the latter two terms are preferred.
     *
     * @param broker Person value to set.
     */
    @Override
    public void setBroker(Person broker) {
        this.broker = broker;
    }
    /**
     * An entity that arranges for an exchange between a buyer and a seller.  In most cases a broker never acquires or releases ownership of a product or service involved in an exchange.  If it is not clear whether an entity is a broker, seller, or buyer, the latter two terms are preferred.
     *
     * @param broker Organization value to set.
     */
    @Override
    public void setBroker(Organization broker) {
        this.broker = broker;
    }

    private AggregateRating aggregateRating;

    /**
     * The overall rating, based on a collection of reviews or ratings, of the item.
     *
     * @return {@link AggregateRating}
     */
    @Override
    public AggregateRating getAggregateRating() {
        return aggregateRating;
    }

    /**
     * The overall rating, based on a collection of reviews or ratings, of the item.
     *
     * @param aggregateRating AggregateRating value to set.
     */
    @Override
    public void setAggregateRating(AggregateRating aggregateRating) {
        this.aggregateRating = aggregateRating;
    }

    private Object isSimilarTo;

    /**
     * A pointer to another, functionally similar product (or multiple products).
     *
     * @return {@link Service} or {@link Product}
     * @see <a href="http://www.w3.org/wiki/WebSchemas/SchemaDotOrgSources#source_GoodRelationsTerms">http://www.w3.org/wiki/WebSchemas/SchemaDotOrgSources#source_GoodRelationsTerms</a>
     */
    @Override
    public <T> T getIsSimilarTo() {
        return (T) isSimilarTo;
    }

    /**
     * A pointer to another, functionally similar product (or multiple products).
     *
     * @param isSimilarTo Service value to set.
     * @see <a href="http://www.w3.org/wiki/WebSchemas/SchemaDotOrgSources#source_GoodRelationsTerms">http://www.w3.org/wiki/WebSchemas/SchemaDotOrgSources#source_GoodRelationsTerms</a>
     */
    @Override
    public void setIsSimilarTo(Service isSimilarTo) {
        this.isSimilarTo = isSimilarTo;
    }
    /**
     * A pointer to another, functionally similar product (or multiple products).
     *
     * @param isSimilarTo Product value to set.
     * @see <a href="http://www.w3.org/wiki/WebSchemas/SchemaDotOrgSources#source_GoodRelationsTerms">http://www.w3.org/wiki/WebSchemas/SchemaDotOrgSources#source_GoodRelationsTerms</a>
     */
    @Override
    public void setIsSimilarTo(Product isSimilarTo) {
        this.isSimilarTo = isSimilarTo;
    }

    private ServiceChannel availableChannel;

    /**
     * A means of accessing the service (e.g. a phone bank, a web site, a location, etc.).
     *
     * @return {@link ServiceChannel}
     */
    @Override
    public ServiceChannel getAvailableChannel() {
        return availableChannel;
    }

    /**
     * A means of accessing the service (e.g. a phone bank, a web site, a location, etc.).
     *
     * @param availableChannel ServiceChannel value to set.
     */
    @Override
    public void setAvailableChannel(ServiceChannel availableChannel) {
        this.availableChannel = availableChannel;
    }

    private Text slogan;

    /**
     * A slogan or motto associated with the item.
     *
     * @return {@link Text}
     */
    @Override
    public Text getSlogan() {
        return slogan;
    }

    /**
     * A slogan or motto associated with the item.
     *
     * @param slogan Text value to set.
     */
    @Override
    public void setSlogan(Text slogan) {
        this.slogan = slogan;
    }

    private Object brand;

    /**
     * The brand(s) associated with a product or service, or the brand(s) maintained by an organization or business person.
     *
     * @return {@link Organization} or {@link Brand}
     */
    @Override
    public <T> T getBrand() {
        return (T) brand;
    }

    /**
     * The brand(s) associated with a product or service, or the brand(s) maintained by an organization or business person.
     *
     * @param brand Organization value to set.
     */
    @Override
    public void setBrand(Organization brand) {
        this.brand = brand;
    }
    /**
     * The brand(s) associated with a product or service, or the brand(s) maintained by an organization or business person.
     *
     * @param brand Brand value to set.
     */
    @Override
    public void setBrand(Brand brand) {
        this.brand = brand;
    }

    private Object logo;

    /**
     * An associated logo.
     *
     * @return {@link URL} or {@link ImageObject}
     * @see <a href="http://www.w3.org/wiki/WebSchemas/SchemaDotOrgSources#source_GoodRelationsTerms">http://www.w3.org/wiki/WebSchemas/SchemaDotOrgSources#source_GoodRelationsTerms</a>
     */
    @Override
    public <T> T getLogo() {
        return (T) logo;
    }

    /**
     * An associated logo.
     *
     * @param logo URL value to set.
     * @see <a href="http://www.w3.org/wiki/WebSchemas/SchemaDotOrgSources#source_GoodRelationsTerms">http://www.w3.org/wiki/WebSchemas/SchemaDotOrgSources#source_GoodRelationsTerms</a>
     */
    @Override
    public void setLogo(URL logo) {
        this.logo = logo;
    }
    /**
     * An associated logo.
     *
     * @param logo ImageObject value to set.
     * @see <a href="http://www.w3.org/wiki/WebSchemas/SchemaDotOrgSources#source_GoodRelationsTerms">http://www.w3.org/wiki/WebSchemas/SchemaDotOrgSources#source_GoodRelationsTerms</a>
     */
    @Override
    public void setLogo(ImageObject logo) {
        this.logo = logo;
    }

    private Thing produces;

    /**
     * The tangible thing generated by the service, e.g. a passport, permit, etc.
     *
     * @return {@link Thing}
     */
    @Override
    public Thing getProduces() {
        return produces;
    }

    /**
     * The tangible thing generated by the service, e.g. a passport, permit, etc.
     *
     * @param produces Thing value to set.
     */
    @Override
    public void setProduces(Thing produces) {
        this.produces = produces;
    }

    private Object serviceArea;

    /**
     * The geographic area where the service is provided.
     *
     * @return {@link GeoShape} or {@link AdministrativeArea} or {@link Place}
     */
    @Override
    public <T> T getServiceArea() {
        return (T) serviceArea;
    }

    /**
     * The geographic area where the service is provided.
     *
     * @param serviceArea GeoShape value to set.
     */
    @Override
    public void setServiceArea(GeoShape serviceArea) {
        this.serviceArea = serviceArea;
    }
    /**
     * The geographic area where the service is provided.
     *
     * @param serviceArea AdministrativeArea value to set.
     */
    @Override
    public void setServiceArea(AdministrativeArea serviceArea) {
        this.serviceArea = serviceArea;
    }
    /**
     * The geographic area where the service is provided.
     *
     * @param serviceArea Place value to set.
     */
    @Override
    public void setServiceArea(Place serviceArea) {
        this.serviceArea = serviceArea;
    }

    private Object serviceType;

    /**
     * The type of service being offered, e.g. veterans' benefits, emergency relief, etc.
     *
     * @return {@link GovernmentBenefitsType} or {@link Text}
     */
    @Override
    public <T> T getServiceType() {
        return (T) serviceType;
    }

    /**
     * The type of service being offered, e.g. veterans' benefits, emergency relief, etc.
     *
     * @param serviceType GovernmentBenefitsType value to set.
     */
    @Override
    public void setServiceType(GovernmentBenefitsType serviceType) {
        this.serviceType = serviceType;
    }
    /**
     * The type of service being offered, e.g. veterans' benefits, emergency relief, etc.
     *
     * @param serviceType Text value to set.
     */
    @Override
    public void setServiceType(Text serviceType) {
        this.serviceType = serviceType;
    }

    private Object areaServed;

    /**
     * The geographic area where a service or offered item is provided.
     *
     * @return {@link AdministrativeArea} or {@link GeoShape} or {@link Text} or {@link Place}
     */
    @Override
    public <T> T getAreaServed() {
        return (T) areaServed;
    }

    /**
     * The geographic area where a service or offered item is provided.
     *
     * @param areaServed AdministrativeArea value to set.
     */
    @Override
    public void setAreaServed(AdministrativeArea areaServed) {
        this.areaServed = areaServed;
    }
    /**
     * The geographic area where a service or offered item is provided.
     *
     * @param areaServed GeoShape value to set.
     */
    @Override
    public void setAreaServed(GeoShape areaServed) {
        this.areaServed = areaServed;
    }
    /**
     * The geographic area where a service or offered item is provided.
     *
     * @param areaServed Text value to set.
     */
    @Override
    public void setAreaServed(Text areaServed) {
        this.areaServed = areaServed;
    }
    /**
     * The geographic area where a service or offered item is provided.
     *
     * @param areaServed Place value to set.
     */
    @Override
    public void setAreaServed(Place areaServed) {
        this.areaServed = areaServed;
    }

    private Object isRelatedTo;

    /**
     * A pointer to another, somehow related product (or multiple products).
     *
     * @return {@link Service} or {@link Product}
     * @see <a href="http://www.w3.org/wiki/WebSchemas/SchemaDotOrgSources#source_GoodRelationsTerms">http://www.w3.org/wiki/WebSchemas/SchemaDotOrgSources#source_GoodRelationsTerms</a>
     */
    @Override
    public <T> T getIsRelatedTo() {
        return (T) isRelatedTo;
    }

    /**
     * A pointer to another, somehow related product (or multiple products).
     *
     * @param isRelatedTo Service value to set.
     * @see <a href="http://www.w3.org/wiki/WebSchemas/SchemaDotOrgSources#source_GoodRelationsTerms">http://www.w3.org/wiki/WebSchemas/SchemaDotOrgSources#source_GoodRelationsTerms</a>
     */
    @Override
    public void setIsRelatedTo(Service isRelatedTo) {
        this.isRelatedTo = isRelatedTo;
    }
    /**
     * A pointer to another, somehow related product (or multiple products).
     *
     * @param isRelatedTo Product value to set.
     * @see <a href="http://www.w3.org/wiki/WebSchemas/SchemaDotOrgSources#source_GoodRelationsTerms">http://www.w3.org/wiki/WebSchemas/SchemaDotOrgSources#source_GoodRelationsTerms</a>
     */
    @Override
    public void setIsRelatedTo(Product isRelatedTo) {
        this.isRelatedTo = isRelatedTo;
    }

    private OfferCatalog hasOfferCatalog;

    /**
     * Indicates an OfferCatalog listing for this Organization, Person, or Service.
     *
     * @return {@link OfferCatalog}
     */
    @Override
    public OfferCatalog getHasOfferCatalog() {
        return hasOfferCatalog;
    }

    /**
     * Indicates an OfferCatalog listing for this Organization, Person, or Service.
     *
     * @param hasOfferCatalog OfferCatalog value to set.
     */
    @Override
    public void setHasOfferCatalog(OfferCatalog hasOfferCatalog) {
        this.hasOfferCatalog = hasOfferCatalog;
    }

    private Object mainEntityOfPage;

    /**
     * Indicates a page (or other CreativeWork) for which this thing is the main entity being described. See [background notes](/docs/datamodel.html#mainEntityBackground) for details.
     *
     * @return {@link CreativeWork} or {@link URL}
     */
    @Override
    public <T> T getMainEntityOfPage() {
        return (T) mainEntityOfPage;
    }

    /**
     * Indicates a page (or other CreativeWork) for which this thing is the main entity being described. See [background notes](/docs/datamodel.html#mainEntityBackground) for details.
     *
     * @param mainEntityOfPage CreativeWork value to set.
     */
    @Override
    public void setMainEntityOfPage(CreativeWork mainEntityOfPage) {
        this.mainEntityOfPage = mainEntityOfPage;
    }
    /**
     * Indicates a page (or other CreativeWork) for which this thing is the main entity being described. See [background notes](/docs/datamodel.html#mainEntityBackground) for details.
     *
     * @param mainEntityOfPage URL value to set.
     */
    @Override
    public void setMainEntityOfPage(URL mainEntityOfPage) {
        this.mainEntityOfPage = mainEntityOfPage;
    }

    private Text alternateName;

    /**
     * An alias for the item.
     *
     * @return {@link Text}
     */
    @Override
    public Text getAlternateName() {
        return alternateName;
    }

    /**
     * An alias for the item.
     *
     * @param alternateName Text value to set.
     */
    @Override
    public void setAlternateName(Text alternateName) {
        this.alternateName = alternateName;
    }

    private Text name;

    /**
     * The name of the item.
     *
     * @return {@link Text}
     */
    @Override
    public Text getName() {
        return name;
    }

    /**
     * The name of the item.
     *
     * @param name Text value to set.
     */
    @Override
    public void setName(Text name) {
        this.name = name;
    }

    private Action potentialAction;

    /**
     * Indicates a potential Action, which describes an idealized action in which this thing would play an 'object' role.
     *
     * @return {@link Action}
     */
    @Override
    public Action getPotentialAction() {
        return potentialAction;
    }

    /**
     * Indicates a potential Action, which describes an idealized action in which this thing would play an 'object' role.
     *
     * @param potentialAction Action value to set.
     */
    @Override
    public void setPotentialAction(Action potentialAction) {
        this.potentialAction = potentialAction;
    }

    private Object image;

    /**
     * An image of the item. This can be a [[URL]] or a fully described [[ImageObject]].
     *
     * @return {@link URL} or {@link ImageObject}
     */
    @Override
    public <T> T getImage() {
        return (T) image;
    }

    /**
     * An image of the item. This can be a [[URL]] or a fully described [[ImageObject]].
     *
     * @param image URL value to set.
     */
    @Override
    public void setImage(URL image) {
        this.image = image;
    }
    /**
     * An image of the item. This can be a [[URL]] or a fully described [[ImageObject]].
     *
     * @param image ImageObject value to set.
     */
    @Override
    public void setImage(ImageObject image) {
        this.image = image;
    }

    private URL url;

    /**
     * URL of the item.
     *
     * @return {@link URL}
     */
    @Override
    public URL getUrl() {
        return url;
    }

    /**
     * URL of the item.
     *
     * @param url URL value to set.
     */
    @Override
    public void setUrl(URL url) {
        this.url = url;
    }

    private Text description;

    /**
     * A description of the item.
     *
     * @return {@link Text}
     */
    @Override
    public Text getDescription() {
        return description;
    }

    /**
     * A description of the item.
     *
     * @param description Text value to set.
     */
    @Override
    public void setDescription(Text description) {
        this.description = description;
    }

    private Object subjectOf;

    /**
     * A CreativeWork or Event about this Thing.
     *
     * @return {@link Event} or {@link CreativeWork}
     * @see <a href="https://github.com/schemaorg/schemaorg/issues/1670">https://github.com/schemaorg/schemaorg/issues/1670</a>
     */
    @Override
    public <T> T getSubjectOf() {
        return (T) subjectOf;
    }

    /**
     * A CreativeWork or Event about this Thing.
     *
     * @param subjectOf Event value to set.
     * @see <a href="https://github.com/schemaorg/schemaorg/issues/1670">https://github.com/schemaorg/schemaorg/issues/1670</a>
     */
    @Override
    public void setSubjectOf(Event subjectOf) {
        this.subjectOf = subjectOf;
    }
    /**
     * A CreativeWork or Event about this Thing.
     *
     * @param subjectOf CreativeWork value to set.
     * @see <a href="https://github.com/schemaorg/schemaorg/issues/1670">https://github.com/schemaorg/schemaorg/issues/1670</a>
     */
    @Override
    public void setSubjectOf(CreativeWork subjectOf) {
        this.subjectOf = subjectOf;
    }

    private URL additionalType;

    /**
     * An additional type for the item, typically used for adding more specific types from external vocabularies in microdata syntax. This is a relationship between something and a class that the thing is in. In RDFa syntax, it is better to use the native RDFa syntax - the 'typeof' attribute - for multiple types. Schema.org tools may have only weaker understanding of extra types, in particular those defined externally.
     *
     * @return {@link URL}
     */
    @Override
    public URL getAdditionalType() {
        return additionalType;
    }

    /**
     * An additional type for the item, typically used for adding more specific types from external vocabularies in microdata syntax. This is a relationship between something and a class that the thing is in. In RDFa syntax, it is better to use the native RDFa syntax - the 'typeof' attribute - for multiple types. Schema.org tools may have only weaker understanding of extra types, in particular those defined externally.
     *
     * @param additionalType URL value to set.
     */
    @Override
    public void setAdditionalType(URL additionalType) {
        this.additionalType = additionalType;
    }

    private Text disambiguatingDescription;

    /**
     * A sub property of description. A short description of the item used to disambiguate from other, similar items. Information from other properties (in particular, name) may be necessary for the description to be useful for disambiguation.
     *
     * @return {@link Text}
     */
    @Override
    public Text getDisambiguatingDescription() {
        return disambiguatingDescription;
    }

    /**
     * A sub property of description. A short description of the item used to disambiguate from other, similar items. Information from other properties (in particular, name) may be necessary for the description to be useful for disambiguation.
     *
     * @param disambiguatingDescription Text value to set.
     */
    @Override
    public void setDisambiguatingDescription(Text disambiguatingDescription) {
        this.disambiguatingDescription = disambiguatingDescription;
    }

    private URL sameAs;

    /**
     * URL of a reference Web page that unambiguously indicates the item's identity. E.g. the URL of the item's Wikipedia page, Wikidata entry, or official website.
     *
     * @return {@link URL}
     */
    @Override
    public URL getSameAs() {
        return sameAs;
    }

    /**
     * URL of a reference Web page that unambiguously indicates the item's identity. E.g. the URL of the item's Wikipedia page, Wikidata entry, or official website.
     *
     * @param sameAs URL value to set.
     */
    @Override
    public void setSameAs(URL sameAs) {
        this.sameAs = sameAs;
    }

    private Object identifier;

    /**
     * The identifier property represents any kind of identifier for any kind of [[Thing]], such as ISBNs, GTIN codes, UUIDs etc. Schema.org provides dedicated properties for representing many of these, either as textual strings or as URL (URI) links. See [background notes](/docs/datamodel.html#identifierBg) for more details.
     *         
     *
     * @return {@link URL} or {@link Text} or {@link PropertyValue}
     */
    @Override
    public <T> T getIdentifier() {
        return (T) identifier;
    }

    /**
     * The identifier property represents any kind of identifier for any kind of [[Thing]], such as ISBNs, GTIN codes, UUIDs etc. Schema.org provides dedicated properties for representing many of these, either as textual strings or as URL (URI) links. See [background notes](/docs/datamodel.html#identifierBg) for more details.
     *         
     *
     * @param identifier URL value to set.
     */
    @Override
    public void setIdentifier(URL identifier) {
        this.identifier = identifier;
    }
    /**
     * The identifier property represents any kind of identifier for any kind of [[Thing]], such as ISBNs, GTIN codes, UUIDs etc. Schema.org provides dedicated properties for representing many of these, either as textual strings or as URL (URI) links. See [background notes](/docs/datamodel.html#identifierBg) for more details.
     *         
     *
     * @param identifier Text value to set.
     */
    @Override
    public void setIdentifier(Text identifier) {
        this.identifier = identifier;
    }
    /**
     * The identifier property represents any kind of identifier for any kind of [[Thing]], such as ISBNs, GTIN codes, UUIDs etc. Schema.org provides dedicated properties for representing many of these, either as textual strings or as URL (URI) links. See [background notes](/docs/datamodel.html#identifierBg) for more details.
     *         
     *
     * @param identifier PropertyValue value to set.
     */
    @Override
    public void setIdentifier(PropertyValue identifier) {
        this.identifier = identifier;
    }
}
