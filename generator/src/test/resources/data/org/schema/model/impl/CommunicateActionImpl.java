/*
 * This class is auto generated by the schema.org code generator program.
 * https://github.com/Kobee1203/schema-org-java
 * Do not edit the class manually.
 */
package org.schema.model.impl;

import org.schema.model.Person;
import org.schema.model.Audience;
import org.schema.model.ContactPoint;
import org.schema.model.Organization;
import org.schema.model.datatype.Text;
import org.schema.model.Language;
import org.schema.model.Thing;
import org.schema.model.datatype.DateTime;
import org.schema.model.datatype.Time;
import org.schema.model.ActionStatusType;
import org.schema.model.PostalAddress;
import org.schema.model.Place;
import org.schema.model.VirtualLocation;
import org.schema.model.EntryPoint;
import org.schema.model.CreativeWork;
import org.schema.model.datatype.URL;
import org.schema.model.Action;
import org.schema.model.ImageObject;
import org.schema.model.Event;
import org.schema.model.PropertyValue;
import com.weedow.schemaorg.commons.model.JsonLdTypeName;
import org.schema.model.InteractAction;
import org.schema.model.CommunicateAction;

/**
 * The act of conveying information to another person via a communication medium (instrument) such as speech, email, or telephone conversation.
 *
 * @see <a href="https://schema.org/CommunicateAction">https://schema.org/CommunicateAction</a>
 */
@JsonLdTypeName("CommunicateAction")
public class CommunicateActionImpl extends com.weedow.schemaorg.commons.model.JsonLdNodeImpl implements CommunicateAction {

    private Object fRecipient;

    /**
     * A sub property of participant. The participant who is at the receiving end of the action.
     *
     * @return {@link Person} or {@link Audience} or {@link ContactPoint} or {@link Organization}
     */
    @Override
    public <T> T getRecipient() {
        return (T) fRecipient;
    }

    /**
     * A sub property of participant. The participant who is at the receiving end of the action.
     *
     */
    @Override
    public void setRecipient(Object fRecipient) {
        if(!(fRecipient instanceof Person) && !(fRecipient instanceof Audience) && !(fRecipient instanceof ContactPoint) && !(fRecipient instanceof Organization)) {
            throw new java.lang.IllegalArgumentException("Invalid value for property 'recipient': " + fRecipient);
        }
        this.fRecipient = fRecipient;
    }

    private Object fInLanguage;

    /**
     * The language of the content or performance or used in an action. Please use one of the language codes from the [IETF BCP 47 standard](http://tools.ietf.org/html/bcp47). See also [[availableLanguage]].
     *
     * @return {@link Text} or {@link Language}
     * @see <a href="https://github.com/schemaorg/schemaorg/issues/2382">https://github.com/schemaorg/schemaorg/issues/2382</a>
     */
    @Override
    public <T> T getInLanguage() {
        return (T) fInLanguage;
    }

    /**
     * The language of the content or performance or used in an action. Please use one of the language codes from the [IETF BCP 47 standard](http://tools.ietf.org/html/bcp47). See also [[availableLanguage]].
     *
     * @see <a href="https://github.com/schemaorg/schemaorg/issues/2382">https://github.com/schemaorg/schemaorg/issues/2382</a>
     */
    @Override
    public void setInLanguage(Object fInLanguage) {
        if(!(fInLanguage instanceof Text) && !(fInLanguage instanceof Language)) {
            throw new java.lang.IllegalArgumentException("Invalid value for property 'inLanguage': " + fInLanguage);
        }
        this.fInLanguage = fInLanguage;
    }

    private Language fLanguage;

    /**
     * A sub property of instrument. The language used on this action.
     *
     * @return {@link Language}
     */
    @Override
    public Language getLanguage() {
        return fLanguage;
    }

    /**
     * A sub property of instrument. The language used on this action.
     *
     */
    @Override
    public void setLanguage(Language fLanguage) {
        this.fLanguage = fLanguage;
    }

    private Thing fAbout;

    /**
     * The subject matter of the content.
     *
     * @return {@link Thing}
     * @see <a href="https://github.com/schemaorg/schemaorg/issues/1670">https://github.com/schemaorg/schemaorg/issues/1670</a>
     */
    @Override
    public Thing getAbout() {
        return fAbout;
    }

    /**
     * The subject matter of the content.
     *
     * @see <a href="https://github.com/schemaorg/schemaorg/issues/1670">https://github.com/schemaorg/schemaorg/issues/1670</a>
     */
    @Override
    public void setAbout(Thing fAbout) {
        this.fAbout = fAbout;
    }

    private Object fAgent;

    /**
     * The direct performer or driver of the action (animate or inanimate). e.g. *John* wrote a book.
     *
     * @return {@link Organization} or {@link Person}
     */
    @Override
    public <T> T getAgent() {
        return (T) fAgent;
    }

    /**
     * The direct performer or driver of the action (animate or inanimate). e.g. *John* wrote a book.
     *
     */
    @Override
    public void setAgent(Object fAgent) {
        if(!(fAgent instanceof Organization) && !(fAgent instanceof Person)) {
            throw new java.lang.IllegalArgumentException("Invalid value for property 'agent': " + fAgent);
        }
        this.fAgent = fAgent;
    }

    private Object fStartTime;

    /**
     * The startTime of something. For a reserved event or service (e.g. FoodEstablishmentReservation), the time that it is expected to start. For actions that span a period of time, when the action was performed. e.g. John wrote a book from *January* to December. For media, including audio and video, it's the time offset of the start of a clip within a larger file.<br/><br/>Note that Event uses startDate/endDate instead of startTime/endTime, even when describing dates with times. This situation may be clarified in future revisions.
     *
     * @return {@link DateTime} or {@link Time}
     * @see <a href="https://github.com/schemaorg/schemaorg/issues/2493">https://github.com/schemaorg/schemaorg/issues/2493</a>
     */
    @Override
    public <T> T getStartTime() {
        return (T) fStartTime;
    }

    /**
     * The startTime of something. For a reserved event or service (e.g. FoodEstablishmentReservation), the time that it is expected to start. For actions that span a period of time, when the action was performed. e.g. John wrote a book from *January* to December. For media, including audio and video, it's the time offset of the start of a clip within a larger file.<br/><br/>Note that Event uses startDate/endDate instead of startTime/endTime, even when describing dates with times. This situation may be clarified in future revisions.
     *
     * @see <a href="https://github.com/schemaorg/schemaorg/issues/2493">https://github.com/schemaorg/schemaorg/issues/2493</a>
     */
    @Override
    public void setStartTime(Object fStartTime) {
        if(!(fStartTime instanceof DateTime) && !(fStartTime instanceof Time)) {
            throw new java.lang.IllegalArgumentException("Invalid value for property 'startTime': " + fStartTime);
        }
        this.fStartTime = fStartTime;
    }

    private ActionStatusType fActionStatus;

    /**
     * Indicates the current disposition of the Action.
     *
     * @return {@link ActionStatusType}
     */
    @Override
    public ActionStatusType getActionStatus() {
        return fActionStatus;
    }

    /**
     * Indicates the current disposition of the Action.
     *
     */
    @Override
    public void setActionStatus(ActionStatusType fActionStatus) {
        this.fActionStatus = fActionStatus;
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

    private Thing fResult;

    /**
     * The result produced in the action. e.g. John wrote *a book*.
     *
     * @return {@link Thing}
     */
    @Override
    public Thing getResult() {
        return fResult;
    }

    /**
     * The result produced in the action. e.g. John wrote *a book*.
     *
     */
    @Override
    public void setResult(Thing fResult) {
        this.fResult = fResult;
    }

    private Object fLocation;

    /**
     * The location of, for example, where an event is happening, where an organization is located, or where an action takes place.
     *
     * @return {@link PostalAddress} or {@link Text} or {@link Place} or {@link VirtualLocation}
     */
    @Override
    public <T> T getLocation() {
        return (T) fLocation;
    }

    /**
     * The location of, for example, where an event is happening, where an organization is located, or where an action takes place.
     *
     */
    @Override
    public void setLocation(Object fLocation) {
        if(!(fLocation instanceof PostalAddress) && !(fLocation instanceof Text) && !(fLocation instanceof Place) && !(fLocation instanceof VirtualLocation)) {
            throw new java.lang.IllegalArgumentException("Invalid value for property 'location': " + fLocation);
        }
        this.fLocation = fLocation;
    }

    private Thing fObject;

    /**
     * The object upon which the action is carried out, whose state is kept intact or changed. Also known as the semantic roles patient, affected or undergoer (which change their state) or theme (which doesn't). e.g. John read *a book*.
     *
     * @return {@link Thing}
     */
    @Override
    public Thing getObject() {
        return fObject;
    }

    /**
     * The object upon which the action is carried out, whose state is kept intact or changed. Also known as the semantic roles patient, affected or undergoer (which change their state) or theme (which doesn't). e.g. John read *a book*.
     *
     */
    @Override
    public void setObject(Thing fObject) {
        this.fObject = fObject;
    }

    private EntryPoint fTarget;

    /**
     * Indicates a target EntryPoint for an Action.
     *
     * @return {@link EntryPoint}
     */
    @Override
    public EntryPoint getTarget() {
        return fTarget;
    }

    /**
     * Indicates a target EntryPoint for an Action.
     *
     */
    @Override
    public void setTarget(EntryPoint fTarget) {
        this.fTarget = fTarget;
    }

    private Object fEndTime;

    /**
     * The endTime of something. For a reserved event or service (e.g. FoodEstablishmentReservation), the time that it is expected to end. For actions that span a period of time, when the action was performed. e.g. John wrote a book from January to *December*. For media, including audio and video, it's the time offset of the end of a clip within a larger file.<br/><br/>Note that Event uses startDate/endDate instead of startTime/endTime, even when describing dates with times. This situation may be clarified in future revisions.
     *
     * @return {@link DateTime} or {@link Time}
     * @see <a href="https://github.com/schemaorg/schemaorg/issues/2493">https://github.com/schemaorg/schemaorg/issues/2493</a>
     */
    @Override
    public <T> T getEndTime() {
        return (T) fEndTime;
    }

    /**
     * The endTime of something. For a reserved event or service (e.g. FoodEstablishmentReservation), the time that it is expected to end. For actions that span a period of time, when the action was performed. e.g. John wrote a book from January to *December*. For media, including audio and video, it's the time offset of the end of a clip within a larger file.<br/><br/>Note that Event uses startDate/endDate instead of startTime/endTime, even when describing dates with times. This situation may be clarified in future revisions.
     *
     * @see <a href="https://github.com/schemaorg/schemaorg/issues/2493">https://github.com/schemaorg/schemaorg/issues/2493</a>
     */
    @Override
    public void setEndTime(Object fEndTime) {
        if(!(fEndTime instanceof DateTime) && !(fEndTime instanceof Time)) {
            throw new java.lang.IllegalArgumentException("Invalid value for property 'endTime': " + fEndTime);
        }
        this.fEndTime = fEndTime;
    }

    private Object fParticipant;

    /**
     * Other co-agents that participated in the action indirectly. e.g. John wrote a book with *Steve*.
     *
     * @return {@link Organization} or {@link Person}
     */
    @Override
    public <T> T getParticipant() {
        return (T) fParticipant;
    }

    /**
     * Other co-agents that participated in the action indirectly. e.g. John wrote a book with *Steve*.
     *
     */
    @Override
    public void setParticipant(Object fParticipant) {
        if(!(fParticipant instanceof Organization) && !(fParticipant instanceof Person)) {
            throw new java.lang.IllegalArgumentException("Invalid value for property 'participant': " + fParticipant);
        }
        this.fParticipant = fParticipant;
    }

    private Thing fInstrument;

    /**
     * The object that helped the agent perform the action. e.g. John wrote a book with *a pen*.
     *
     * @return {@link Thing}
     */
    @Override
    public Thing getInstrument() {
        return fInstrument;
    }

    /**
     * The object that helped the agent perform the action. e.g. John wrote a book with *a pen*.
     *
     */
    @Override
    public void setInstrument(Thing fInstrument) {
        this.fInstrument = fInstrument;
    }

    private Thing fError;

    /**
     * For failed actions, more information on the cause of the failure.
     *
     * @return {@link Thing}
     */
    @Override
    public Thing getError() {
        return fError;
    }

    /**
     * For failed actions, more information on the cause of the failure.
     *
     */
    @Override
    public void setError(Thing fError) {
        this.fError = fError;
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
}
