/*
 * This class is auto generated by the schema.org code generator program.
 * https://github.com/Kobee1203/schema-org-java
 * Do not edit the class manually.
 */
package org.schema.model;

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

/**
 * A service provided by an organization, e.g. delivery service, print services, etc.
 *
 * @see <a href="https://schema.org/Service">https://schema.org/Service</a>
 */
public interface Service extends Intangible {

    /**
     * A review of the item.
     *
     * @return {@link Review}
     */
    Review getReview();

    /**
     * A review of the item.
     *
     * @param review Review value to set.
     */
    void setReview(Review review);

    /**
     * An award won by or for this item.
     *
     * @return {@link Text}
     */
    Text getAward();

    /**
     * An award won by or for this item.
     *
     * @param award Text value to set.
     */
    void setAward(Text award);

    /**
     * The audience eligible for this service.
     *
     * @return {@link Audience}
     */
    Audience getServiceAudience();

    /**
     * The audience eligible for this service.
     *
     * @param serviceAudience Audience value to set.
     */
    void setServiceAudience(Audience serviceAudience);

    /**
     * A category for the item. Greater signs or slashes can be used to informally indicate a category hierarchy.
     *
     * @return {@link URL} or {@link Text} or {@link PhysicalActivityCategory} or {@link Thing} or {@link CategoryCode}
     * @see <a href="https://github.com/schemaorg/schemaorg/issues/2490">https://github.com/schemaorg/schemaorg/issues/2490</a>
     * @see <a href="https://github.com/schemaorg/schemaorg/issues/1741">https://github.com/schemaorg/schemaorg/issues/1741</a>
     */
    <T> T getCategory();

    /**
     * A category for the item. Greater signs or slashes can be used to informally indicate a category hierarchy.
     *
     * @param category URL value to set.
     * @see <a href="https://github.com/schemaorg/schemaorg/issues/2490">https://github.com/schemaorg/schemaorg/issues/2490</a>
     * @see <a href="https://github.com/schemaorg/schemaorg/issues/1741">https://github.com/schemaorg/schemaorg/issues/1741</a>
     */
    void setCategory(URL category);
    /**
     * A category for the item. Greater signs or slashes can be used to informally indicate a category hierarchy.
     *
     * @param category Text value to set.
     * @see <a href="https://github.com/schemaorg/schemaorg/issues/2490">https://github.com/schemaorg/schemaorg/issues/2490</a>
     * @see <a href="https://github.com/schemaorg/schemaorg/issues/1741">https://github.com/schemaorg/schemaorg/issues/1741</a>
     */
    void setCategory(Text category);
    /**
     * A category for the item. Greater signs or slashes can be used to informally indicate a category hierarchy.
     *
     * @param category PhysicalActivityCategory value to set.
     * @see <a href="https://github.com/schemaorg/schemaorg/issues/2490">https://github.com/schemaorg/schemaorg/issues/2490</a>
     * @see <a href="https://github.com/schemaorg/schemaorg/issues/1741">https://github.com/schemaorg/schemaorg/issues/1741</a>
     */
    void setCategory(PhysicalActivityCategory category);
    /**
     * A category for the item. Greater signs or slashes can be used to informally indicate a category hierarchy.
     *
     * @param category Thing value to set.
     * @see <a href="https://github.com/schemaorg/schemaorg/issues/2490">https://github.com/schemaorg/schemaorg/issues/2490</a>
     * @see <a href="https://github.com/schemaorg/schemaorg/issues/1741">https://github.com/schemaorg/schemaorg/issues/1741</a>
     */
    void setCategory(Thing category);
    /**
     * A category for the item. Greater signs or slashes can be used to informally indicate a category hierarchy.
     *
     * @param category CategoryCode value to set.
     * @see <a href="https://github.com/schemaorg/schemaorg/issues/2490">https://github.com/schemaorg/schemaorg/issues/2490</a>
     * @see <a href="https://github.com/schemaorg/schemaorg/issues/1741">https://github.com/schemaorg/schemaorg/issues/1741</a>
     */
    void setCategory(CategoryCode category);

    /**
     * The hours during which this service or contact is available.
     *
     * @return {@link OpeningHoursSpecification}
     */
    OpeningHoursSpecification getHoursAvailable();

    /**
     * The hours during which this service or contact is available.
     *
     * @param hoursAvailable OpeningHoursSpecification value to set.
     */
    void setHoursAvailable(OpeningHoursSpecification hoursAvailable);

    /**
     * An intended audience, i.e. a group for whom something was created.
     *
     * @return {@link Audience}
     */
    Audience getAudience();

    /**
     * An intended audience, i.e. a group for whom something was created.
     *
     * @param audience Audience value to set.
     */
    void setAudience(Audience audience);

    /**
     * An offer to provide this item&#x2014;for example, an offer to sell a product, rent the DVD of a movie, perform a service, or give away tickets to an event. Use [[businessFunction]] to indicate the kind of transaction offered, i.e. sell, lease, etc. This property can also be used to describe a [[Demand]]. While this property is listed as expected on a number of common types, it can be used in others. In that case, using a second type, such as Product or a subtype of Product, can clarify the nature of the offer.
     *       
     *
     * @return {@link Offer} or {@link Demand}
     * @see <a href="https://github.com/schemaorg/schemaorg/issues/2289">https://github.com/schemaorg/schemaorg/issues/2289</a>
     */
    <T> T getOffers();

    /**
     * An offer to provide this item&#x2014;for example, an offer to sell a product, rent the DVD of a movie, perform a service, or give away tickets to an event. Use [[businessFunction]] to indicate the kind of transaction offered, i.e. sell, lease, etc. This property can also be used to describe a [[Demand]]. While this property is listed as expected on a number of common types, it can be used in others. In that case, using a second type, such as Product or a subtype of Product, can clarify the nature of the offer.
     *       
     *
     * @param offers Offer value to set.
     * @see <a href="https://github.com/schemaorg/schemaorg/issues/2289">https://github.com/schemaorg/schemaorg/issues/2289</a>
     */
    void setOffers(Offer offers);
    /**
     * An offer to provide this item&#x2014;for example, an offer to sell a product, rent the DVD of a movie, perform a service, or give away tickets to an event. Use [[businessFunction]] to indicate the kind of transaction offered, i.e. sell, lease, etc. This property can also be used to describe a [[Demand]]. While this property is listed as expected on a number of common types, it can be used in others. In that case, using a second type, such as Product or a subtype of Product, can clarify the nature of the offer.
     *       
     *
     * @param offers Demand value to set.
     * @see <a href="https://github.com/schemaorg/schemaorg/issues/2289">https://github.com/schemaorg/schemaorg/issues/2289</a>
     */
    void setOffers(Demand offers);

    /**
     * The tangible thing generated by the service, e.g. a passport, permit, etc.
     *
     * @return {@link Thing}
     */
    Thing getServiceOutput();

    /**
     * The tangible thing generated by the service, e.g. a passport, permit, etc.
     *
     * @param serviceOutput Thing value to set.
     */
    void setServiceOutput(Thing serviceOutput);

    /**
     * The service provider, service operator, or service performer; the goods producer. Another party (a seller) may offer those services or goods on behalf of the provider. A provider may also serve as the seller.
     *
     * @return {@link Organization} or {@link Person}
     * @see <a href="https://pending.schema.org">https://pending.schema.org</a>
     * @see <a href="https://github.com/schemaorg/schemaorg/issues/2289">https://github.com/schemaorg/schemaorg/issues/2289</a>
     * @see <a href="https://github.com/schemaorg/schemaorg/issues/2927">https://github.com/schemaorg/schemaorg/issues/2927</a>
     */
    <T> T getProvider();

    /**
     * The service provider, service operator, or service performer; the goods producer. Another party (a seller) may offer those services or goods on behalf of the provider. A provider may also serve as the seller.
     *
     * @param provider Organization value to set.
     * @see <a href="https://pending.schema.org">https://pending.schema.org</a>
     * @see <a href="https://github.com/schemaorg/schemaorg/issues/2289">https://github.com/schemaorg/schemaorg/issues/2289</a>
     * @see <a href="https://github.com/schemaorg/schemaorg/issues/2927">https://github.com/schemaorg/schemaorg/issues/2927</a>
     */
    void setProvider(Organization provider);
    /**
     * The service provider, service operator, or service performer; the goods producer. Another party (a seller) may offer those services or goods on behalf of the provider. A provider may also serve as the seller.
     *
     * @param provider Person value to set.
     * @see <a href="https://pending.schema.org">https://pending.schema.org</a>
     * @see <a href="https://github.com/schemaorg/schemaorg/issues/2289">https://github.com/schemaorg/schemaorg/issues/2289</a>
     * @see <a href="https://github.com/schemaorg/schemaorg/issues/2927">https://github.com/schemaorg/schemaorg/issues/2927</a>
     */
    void setProvider(Person provider);

    /**
     * Human-readable terms of service documentation.
     *
     * @return {@link URL} or {@link Text}
     * @see <a href="https://pending.schema.org">https://pending.schema.org</a>
     * @see <a href="https://github.com/schemaorg/schemaorg/issues/1423">https://github.com/schemaorg/schemaorg/issues/1423</a>
     */
    <T> T getTermsOfService();

    /**
     * Human-readable terms of service documentation.
     *
     * @param termsOfService URL value to set.
     * @see <a href="https://pending.schema.org">https://pending.schema.org</a>
     * @see <a href="https://github.com/schemaorg/schemaorg/issues/1423">https://github.com/schemaorg/schemaorg/issues/1423</a>
     */
    void setTermsOfService(URL termsOfService);
    /**
     * Human-readable terms of service documentation.
     *
     * @param termsOfService Text value to set.
     * @see <a href="https://pending.schema.org">https://pending.schema.org</a>
     * @see <a href="https://github.com/schemaorg/schemaorg/issues/1423">https://github.com/schemaorg/schemaorg/issues/1423</a>
     */
    void setTermsOfService(Text termsOfService);

    /**
     * Indicates the mobility of a provided service (e.g. 'static', 'dynamic').
     *
     * @return {@link Text}
     */
    Text getProviderMobility();

    /**
     * Indicates the mobility of a provided service (e.g. 'static', 'dynamic').
     *
     * @param providerMobility Text value to set.
     */
    void setProviderMobility(Text providerMobility);

    /**
     * An entity that arranges for an exchange between a buyer and a seller.  In most cases a broker never acquires or releases ownership of a product or service involved in an exchange.  If it is not clear whether an entity is a broker, seller, or buyer, the latter two terms are preferred.
     *
     * @return {@link Person} or {@link Organization}
     */
    <T> T getBroker();

    /**
     * An entity that arranges for an exchange between a buyer and a seller.  In most cases a broker never acquires or releases ownership of a product or service involved in an exchange.  If it is not clear whether an entity is a broker, seller, or buyer, the latter two terms are preferred.
     *
     * @param broker Person value to set.
     */
    void setBroker(Person broker);
    /**
     * An entity that arranges for an exchange between a buyer and a seller.  In most cases a broker never acquires or releases ownership of a product or service involved in an exchange.  If it is not clear whether an entity is a broker, seller, or buyer, the latter two terms are preferred.
     *
     * @param broker Organization value to set.
     */
    void setBroker(Organization broker);

    /**
     * The overall rating, based on a collection of reviews or ratings, of the item.
     *
     * @return {@link AggregateRating}
     */
    AggregateRating getAggregateRating();

    /**
     * The overall rating, based on a collection of reviews or ratings, of the item.
     *
     * @param aggregateRating AggregateRating value to set.
     */
    void setAggregateRating(AggregateRating aggregateRating);

    /**
     * A pointer to another, functionally similar product (or multiple products).
     *
     * @return {@link Service} or {@link Product}
     * @see <a href="http://www.w3.org/wiki/WebSchemas/SchemaDotOrgSources#source_GoodRelationsTerms">http://www.w3.org/wiki/WebSchemas/SchemaDotOrgSources#source_GoodRelationsTerms</a>
     */
    <T> T getIsSimilarTo();

    /**
     * A pointer to another, functionally similar product (or multiple products).
     *
     * @param isSimilarTo Service value to set.
     * @see <a href="http://www.w3.org/wiki/WebSchemas/SchemaDotOrgSources#source_GoodRelationsTerms">http://www.w3.org/wiki/WebSchemas/SchemaDotOrgSources#source_GoodRelationsTerms</a>
     */
    void setIsSimilarTo(Service isSimilarTo);
    /**
     * A pointer to another, functionally similar product (or multiple products).
     *
     * @param isSimilarTo Product value to set.
     * @see <a href="http://www.w3.org/wiki/WebSchemas/SchemaDotOrgSources#source_GoodRelationsTerms">http://www.w3.org/wiki/WebSchemas/SchemaDotOrgSources#source_GoodRelationsTerms</a>
     */
    void setIsSimilarTo(Product isSimilarTo);

    /**
     * A means of accessing the service (e.g. a phone bank, a web site, a location, etc.).
     *
     * @return {@link ServiceChannel}
     */
    ServiceChannel getAvailableChannel();

    /**
     * A means of accessing the service (e.g. a phone bank, a web site, a location, etc.).
     *
     * @param availableChannel ServiceChannel value to set.
     */
    void setAvailableChannel(ServiceChannel availableChannel);

    /**
     * A slogan or motto associated with the item.
     *
     * @return {@link Text}
     */
    Text getSlogan();

    /**
     * A slogan or motto associated with the item.
     *
     * @param slogan Text value to set.
     */
    void setSlogan(Text slogan);

    /**
     * The brand(s) associated with a product or service, or the brand(s) maintained by an organization or business person.
     *
     * @return {@link Organization} or {@link Brand}
     */
    <T> T getBrand();

    /**
     * The brand(s) associated with a product or service, or the brand(s) maintained by an organization or business person.
     *
     * @param brand Organization value to set.
     */
    void setBrand(Organization brand);
    /**
     * The brand(s) associated with a product or service, or the brand(s) maintained by an organization or business person.
     *
     * @param brand Brand value to set.
     */
    void setBrand(Brand brand);

    /**
     * An associated logo.
     *
     * @return {@link URL} or {@link ImageObject}
     * @see <a href="http://www.w3.org/wiki/WebSchemas/SchemaDotOrgSources#source_GoodRelationsTerms">http://www.w3.org/wiki/WebSchemas/SchemaDotOrgSources#source_GoodRelationsTerms</a>
     */
    <T> T getLogo();

    /**
     * An associated logo.
     *
     * @param logo URL value to set.
     * @see <a href="http://www.w3.org/wiki/WebSchemas/SchemaDotOrgSources#source_GoodRelationsTerms">http://www.w3.org/wiki/WebSchemas/SchemaDotOrgSources#source_GoodRelationsTerms</a>
     */
    void setLogo(URL logo);
    /**
     * An associated logo.
     *
     * @param logo ImageObject value to set.
     * @see <a href="http://www.w3.org/wiki/WebSchemas/SchemaDotOrgSources#source_GoodRelationsTerms">http://www.w3.org/wiki/WebSchemas/SchemaDotOrgSources#source_GoodRelationsTerms</a>
     */
    void setLogo(ImageObject logo);

    /**
     * The tangible thing generated by the service, e.g. a passport, permit, etc.
     *
     * @return {@link Thing}
     */
    Thing getProduces();

    /**
     * The tangible thing generated by the service, e.g. a passport, permit, etc.
     *
     * @param produces Thing value to set.
     */
    void setProduces(Thing produces);

    /**
     * The geographic area where the service is provided.
     *
     * @return {@link GeoShape} or {@link AdministrativeArea} or {@link Place}
     */
    <T> T getServiceArea();

    /**
     * The geographic area where the service is provided.
     *
     * @param serviceArea GeoShape value to set.
     */
    void setServiceArea(GeoShape serviceArea);
    /**
     * The geographic area where the service is provided.
     *
     * @param serviceArea AdministrativeArea value to set.
     */
    void setServiceArea(AdministrativeArea serviceArea);
    /**
     * The geographic area where the service is provided.
     *
     * @param serviceArea Place value to set.
     */
    void setServiceArea(Place serviceArea);

    /**
     * The type of service being offered, e.g. veterans' benefits, emergency relief, etc.
     *
     * @return {@link GovernmentBenefitsType} or {@link Text}
     */
    <T> T getServiceType();

    /**
     * The type of service being offered, e.g. veterans' benefits, emergency relief, etc.
     *
     * @param serviceType GovernmentBenefitsType value to set.
     */
    void setServiceType(GovernmentBenefitsType serviceType);
    /**
     * The type of service being offered, e.g. veterans' benefits, emergency relief, etc.
     *
     * @param serviceType Text value to set.
     */
    void setServiceType(Text serviceType);

    /**
     * The geographic area where a service or offered item is provided.
     *
     * @return {@link AdministrativeArea} or {@link GeoShape} or {@link Text} or {@link Place}
     */
    <T> T getAreaServed();

    /**
     * The geographic area where a service or offered item is provided.
     *
     * @param areaServed AdministrativeArea value to set.
     */
    void setAreaServed(AdministrativeArea areaServed);
    /**
     * The geographic area where a service or offered item is provided.
     *
     * @param areaServed GeoShape value to set.
     */
    void setAreaServed(GeoShape areaServed);
    /**
     * The geographic area where a service or offered item is provided.
     *
     * @param areaServed Text value to set.
     */
    void setAreaServed(Text areaServed);
    /**
     * The geographic area where a service or offered item is provided.
     *
     * @param areaServed Place value to set.
     */
    void setAreaServed(Place areaServed);

    /**
     * A pointer to another, somehow related product (or multiple products).
     *
     * @return {@link Service} or {@link Product}
     * @see <a href="http://www.w3.org/wiki/WebSchemas/SchemaDotOrgSources#source_GoodRelationsTerms">http://www.w3.org/wiki/WebSchemas/SchemaDotOrgSources#source_GoodRelationsTerms</a>
     */
    <T> T getIsRelatedTo();

    /**
     * A pointer to another, somehow related product (or multiple products).
     *
     * @param isRelatedTo Service value to set.
     * @see <a href="http://www.w3.org/wiki/WebSchemas/SchemaDotOrgSources#source_GoodRelationsTerms">http://www.w3.org/wiki/WebSchemas/SchemaDotOrgSources#source_GoodRelationsTerms</a>
     */
    void setIsRelatedTo(Service isRelatedTo);
    /**
     * A pointer to another, somehow related product (or multiple products).
     *
     * @param isRelatedTo Product value to set.
     * @see <a href="http://www.w3.org/wiki/WebSchemas/SchemaDotOrgSources#source_GoodRelationsTerms">http://www.w3.org/wiki/WebSchemas/SchemaDotOrgSources#source_GoodRelationsTerms</a>
     */
    void setIsRelatedTo(Product isRelatedTo);

    /**
     * Indicates an OfferCatalog listing for this Organization, Person, or Service.
     *
     * @return {@link OfferCatalog}
     */
    OfferCatalog getHasOfferCatalog();

    /**
     * Indicates an OfferCatalog listing for this Organization, Person, or Service.
     *
     * @param hasOfferCatalog OfferCatalog value to set.
     */
    void setHasOfferCatalog(OfferCatalog hasOfferCatalog);
}
