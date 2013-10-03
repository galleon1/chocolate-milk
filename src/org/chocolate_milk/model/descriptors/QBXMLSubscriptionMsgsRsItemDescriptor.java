/*
 * This class was automatically generated with 
 * <a href="http://www.castor.org">Castor 1.3.1</a>, using an XML
 * Schema.
 * $Id: QBXMLSubscriptionMsgsRsItemDescriptor.java,v 1.1.1.1 2010-05-04 22:06:02 ryan Exp $
 */

package org.chocolate_milk.model.descriptors;

  //---------------------------------/
 //- Imported classes and packages -/
//---------------------------------/

import org.chocolate_milk.model.QBXMLSubscriptionMsgsRsItem;

/**
 * Class QBXMLSubscriptionMsgsRsItemDescriptor.
 * 
 * @version $Revision: 1.1.1.1 $ $Date: 2010-05-04 22:06:02 $
 */
public class QBXMLSubscriptionMsgsRsItemDescriptor extends org.exolab.castor.xml.util.XMLClassDescriptorImpl {


      //--------------------------/
     //- Class/Member Variables -/
    //--------------------------/

    /**
     * Field _elementDefinition.
     */
    private boolean _elementDefinition;

    /**
     * Field _nsPrefix.
     */
    private java.lang.String _nsPrefix;

    /**
     * Field _nsURI.
     */
    private java.lang.String _nsURI;

    /**
     * Field _xmlName.
     */
    private java.lang.String _xmlName;

    /**
     * Field _identity.
     */
    private org.exolab.castor.xml.XMLFieldDescriptor _identity;


      //----------------/
     //- Constructors -/
    //----------------/

    public QBXMLSubscriptionMsgsRsItemDescriptor() {
        super();
        _xmlName = "QBXMLSubscriptionMsgsRs";
        _elementDefinition = true;

        //-- set grouping compositor
        setCompositorAsChoice();
        org.exolab.castor.xml.util.XMLFieldDescriptorImpl  desc           = null;
        org.exolab.castor.mapping.FieldHandler             handler        = null;
        org.exolab.castor.xml.FieldValidator               fieldValidator = null;
        //-- initialize attribute descriptors

        //-- initialize element descriptors

        //-- _dataEventSubscriptionAddRs
        desc = new org.exolab.castor.xml.util.XMLFieldDescriptorImpl(org.chocolate_milk.model.DataEventSubscriptionAddRs.class, "_dataEventSubscriptionAddRs", "DataEventSubscriptionAddRs", org.exolab.castor.xml.NodeType.Element);
        handler = new org.exolab.castor.xml.XMLFieldHandler() {
            @Override
            public java.lang.Object getValue( java.lang.Object object ) 
                throws IllegalStateException
            {
                QBXMLSubscriptionMsgsRsItem target = (QBXMLSubscriptionMsgsRsItem) object;
                return target.getDataEventSubscriptionAddRs();
            }
            @Override
            public void setValue( java.lang.Object object, java.lang.Object value) 
                throws IllegalStateException, IllegalArgumentException
            {
                try {
                    QBXMLSubscriptionMsgsRsItem target = (QBXMLSubscriptionMsgsRsItem) object;
                    target.setDataEventSubscriptionAddRs( (org.chocolate_milk.model.DataEventSubscriptionAddRs) value);
                } catch (java.lang.Exception ex) {
                    throw new IllegalStateException(ex.toString());
                }
            }
            @Override
            @SuppressWarnings("unused")
            public java.lang.Object newInstance(java.lang.Object parent) {
                return null;
            }
        };
        desc.setSchemaType("org.chocolate_milk.model.DataEventSubscriptionAddRs");
        desc.setHandler(handler);
        desc.setMultivalued(false);
        addFieldDescriptor(desc);
        addSequenceElement(desc);

        //-- validation code for: _dataEventSubscriptionAddRs
        fieldValidator = new org.exolab.castor.xml.FieldValidator();
        { //-- local scope
        }
        desc.setValidator(fieldValidator);
        //-- _dataEventSubscriptionQueryRs
        desc = new org.exolab.castor.xml.util.XMLFieldDescriptorImpl(org.chocolate_milk.model.DataEventSubscriptionQueryRs.class, "_dataEventSubscriptionQueryRs", "DataEventSubscriptionQueryRs", org.exolab.castor.xml.NodeType.Element);
        handler = new org.exolab.castor.xml.XMLFieldHandler() {
            @Override
            public java.lang.Object getValue( java.lang.Object object ) 
                throws IllegalStateException
            {
                QBXMLSubscriptionMsgsRsItem target = (QBXMLSubscriptionMsgsRsItem) object;
                return target.getDataEventSubscriptionQueryRs();
            }
            @Override
            public void setValue( java.lang.Object object, java.lang.Object value) 
                throws IllegalStateException, IllegalArgumentException
            {
                try {
                    QBXMLSubscriptionMsgsRsItem target = (QBXMLSubscriptionMsgsRsItem) object;
                    target.setDataEventSubscriptionQueryRs( (org.chocolate_milk.model.DataEventSubscriptionQueryRs) value);
                } catch (java.lang.Exception ex) {
                    throw new IllegalStateException(ex.toString());
                }
            }
            @Override
            @SuppressWarnings("unused")
            public java.lang.Object newInstance(java.lang.Object parent) {
                return null;
            }
        };
        desc.setSchemaType("org.chocolate_milk.model.DataEventSubscriptionQueryRs");
        desc.setHandler(handler);
        desc.setMultivalued(false);
        addFieldDescriptor(desc);
        addSequenceElement(desc);

        //-- validation code for: _dataEventSubscriptionQueryRs
        fieldValidator = new org.exolab.castor.xml.FieldValidator();
        { //-- local scope
        }
        desc.setValidator(fieldValidator);
        //-- _UIEventSubscriptionAddRs
        desc = new org.exolab.castor.xml.util.XMLFieldDescriptorImpl(org.chocolate_milk.model.UIEventSubscriptionAddRs.class, "_UIEventSubscriptionAddRs", "UIEventSubscriptionAddRs", org.exolab.castor.xml.NodeType.Element);
        handler = new org.exolab.castor.xml.XMLFieldHandler() {
            @Override
            public java.lang.Object getValue( java.lang.Object object ) 
                throws IllegalStateException
            {
                QBXMLSubscriptionMsgsRsItem target = (QBXMLSubscriptionMsgsRsItem) object;
                return target.getUIEventSubscriptionAddRs();
            }
            @Override
            public void setValue( java.lang.Object object, java.lang.Object value) 
                throws IllegalStateException, IllegalArgumentException
            {
                try {
                    QBXMLSubscriptionMsgsRsItem target = (QBXMLSubscriptionMsgsRsItem) object;
                    target.setUIEventSubscriptionAddRs( (org.chocolate_milk.model.UIEventSubscriptionAddRs) value);
                } catch (java.lang.Exception ex) {
                    throw new IllegalStateException(ex.toString());
                }
            }
            @Override
            @SuppressWarnings("unused")
            public java.lang.Object newInstance(java.lang.Object parent) {
                return null;
            }
        };
        desc.setSchemaType("org.chocolate_milk.model.UIEventSubscriptionAddRs");
        desc.setHandler(handler);
        desc.setMultivalued(false);
        addFieldDescriptor(desc);
        addSequenceElement(desc);

        //-- validation code for: _UIEventSubscriptionAddRs
        fieldValidator = new org.exolab.castor.xml.FieldValidator();
        { //-- local scope
        }
        desc.setValidator(fieldValidator);
        //-- _UIEventSubscriptionQueryRs
        desc = new org.exolab.castor.xml.util.XMLFieldDescriptorImpl(org.chocolate_milk.model.UIEventSubscriptionQueryRs.class, "_UIEventSubscriptionQueryRs", "UIEventSubscriptionQueryRs", org.exolab.castor.xml.NodeType.Element);
        handler = new org.exolab.castor.xml.XMLFieldHandler() {
            @Override
            public java.lang.Object getValue( java.lang.Object object ) 
                throws IllegalStateException
            {
                QBXMLSubscriptionMsgsRsItem target = (QBXMLSubscriptionMsgsRsItem) object;
                return target.getUIEventSubscriptionQueryRs();
            }
            @Override
            public void setValue( java.lang.Object object, java.lang.Object value) 
                throws IllegalStateException, IllegalArgumentException
            {
                try {
                    QBXMLSubscriptionMsgsRsItem target = (QBXMLSubscriptionMsgsRsItem) object;
                    target.setUIEventSubscriptionQueryRs( (org.chocolate_milk.model.UIEventSubscriptionQueryRs) value);
                } catch (java.lang.Exception ex) {
                    throw new IllegalStateException(ex.toString());
                }
            }
            @Override
            @SuppressWarnings("unused")
            public java.lang.Object newInstance(java.lang.Object parent) {
                return null;
            }
        };
        desc.setSchemaType("org.chocolate_milk.model.UIEventSubscriptionQueryRs");
        desc.setHandler(handler);
        desc.setMultivalued(false);
        addFieldDescriptor(desc);
        addSequenceElement(desc);

        //-- validation code for: _UIEventSubscriptionQueryRs
        fieldValidator = new org.exolab.castor.xml.FieldValidator();
        { //-- local scope
        }
        desc.setValidator(fieldValidator);
        //-- _UIExtensionSubscriptionAddRs
        desc = new org.exolab.castor.xml.util.XMLFieldDescriptorImpl(org.chocolate_milk.model.UIExtensionSubscriptionAddRs.class, "_UIExtensionSubscriptionAddRs", "UIExtensionSubscriptionAddRs", org.exolab.castor.xml.NodeType.Element);
        handler = new org.exolab.castor.xml.XMLFieldHandler() {
            @Override
            public java.lang.Object getValue( java.lang.Object object ) 
                throws IllegalStateException
            {
                QBXMLSubscriptionMsgsRsItem target = (QBXMLSubscriptionMsgsRsItem) object;
                return target.getUIExtensionSubscriptionAddRs();
            }
            @Override
            public void setValue( java.lang.Object object, java.lang.Object value) 
                throws IllegalStateException, IllegalArgumentException
            {
                try {
                    QBXMLSubscriptionMsgsRsItem target = (QBXMLSubscriptionMsgsRsItem) object;
                    target.setUIExtensionSubscriptionAddRs( (org.chocolate_milk.model.UIExtensionSubscriptionAddRs) value);
                } catch (java.lang.Exception ex) {
                    throw new IllegalStateException(ex.toString());
                }
            }
            @Override
            @SuppressWarnings("unused")
            public java.lang.Object newInstance(java.lang.Object parent) {
                return null;
            }
        };
        desc.setSchemaType("org.chocolate_milk.model.UIExtensionSubscriptionAddRs");
        desc.setHandler(handler);
        desc.setMultivalued(false);
        addFieldDescriptor(desc);
        addSequenceElement(desc);

        //-- validation code for: _UIExtensionSubscriptionAddRs
        fieldValidator = new org.exolab.castor.xml.FieldValidator();
        { //-- local scope
        }
        desc.setValidator(fieldValidator);
        //-- _UIExtensionSubscriptionQueryRs
        desc = new org.exolab.castor.xml.util.XMLFieldDescriptorImpl(org.chocolate_milk.model.UIExtensionSubscriptionQueryRs.class, "_UIExtensionSubscriptionQueryRs", "UIExtensionSubscriptionQueryRs", org.exolab.castor.xml.NodeType.Element);
        handler = new org.exolab.castor.xml.XMLFieldHandler() {
            @Override
            public java.lang.Object getValue( java.lang.Object object ) 
                throws IllegalStateException
            {
                QBXMLSubscriptionMsgsRsItem target = (QBXMLSubscriptionMsgsRsItem) object;
                return target.getUIExtensionSubscriptionQueryRs();
            }
            @Override
            public void setValue( java.lang.Object object, java.lang.Object value) 
                throws IllegalStateException, IllegalArgumentException
            {
                try {
                    QBXMLSubscriptionMsgsRsItem target = (QBXMLSubscriptionMsgsRsItem) object;
                    target.setUIExtensionSubscriptionQueryRs( (org.chocolate_milk.model.UIExtensionSubscriptionQueryRs) value);
                } catch (java.lang.Exception ex) {
                    throw new IllegalStateException(ex.toString());
                }
            }
            @Override
            @SuppressWarnings("unused")
            public java.lang.Object newInstance(java.lang.Object parent) {
                return null;
            }
        };
        desc.setSchemaType("org.chocolate_milk.model.UIExtensionSubscriptionQueryRs");
        desc.setHandler(handler);
        desc.setMultivalued(false);
        addFieldDescriptor(desc);
        addSequenceElement(desc);

        //-- validation code for: _UIExtensionSubscriptionQueryRs
        fieldValidator = new org.exolab.castor.xml.FieldValidator();
        { //-- local scope
        }
        desc.setValidator(fieldValidator);
        //-- _subscriptionDelRs
        desc = new org.exolab.castor.xml.util.XMLFieldDescriptorImpl(org.chocolate_milk.model.SubscriptionDelRs.class, "_subscriptionDelRs", "SubscriptionDelRs", org.exolab.castor.xml.NodeType.Element);
        handler = new org.exolab.castor.xml.XMLFieldHandler() {
            @Override
            public java.lang.Object getValue( java.lang.Object object ) 
                throws IllegalStateException
            {
                QBXMLSubscriptionMsgsRsItem target = (QBXMLSubscriptionMsgsRsItem) object;
                return target.getSubscriptionDelRs();
            }
            @Override
            public void setValue( java.lang.Object object, java.lang.Object value) 
                throws IllegalStateException, IllegalArgumentException
            {
                try {
                    QBXMLSubscriptionMsgsRsItem target = (QBXMLSubscriptionMsgsRsItem) object;
                    target.setSubscriptionDelRs( (org.chocolate_milk.model.SubscriptionDelRs) value);
                } catch (java.lang.Exception ex) {
                    throw new IllegalStateException(ex.toString());
                }
            }
            @Override
            @SuppressWarnings("unused")
            public java.lang.Object newInstance(java.lang.Object parent) {
                return null;
            }
        };
        desc.setSchemaType("org.chocolate_milk.model.SubscriptionDelRs");
        desc.setHandler(handler);
        desc.setMultivalued(false);
        addFieldDescriptor(desc);
        addSequenceElement(desc);

        //-- validation code for: _subscriptionDelRs
        fieldValidator = new org.exolab.castor.xml.FieldValidator();
        { //-- local scope
        }
        desc.setValidator(fieldValidator);
    }


      //-----------/
     //- Methods -/
    //-----------/

    /**
     * Method getAccessMode.
     * 
     * @return the access mode specified for this class.
     */
    @Override()
    public org.exolab.castor.mapping.AccessMode getAccessMode(
    ) {
        return null;
    }

    /**
     * Method getIdentity.
     * 
     * @return the identity field, null if this class has no
     * identity.
     */
    @Override()
    public org.exolab.castor.mapping.FieldDescriptor getIdentity(
    ) {
        return _identity;
    }

    /**
     * Method getJavaClass.
     * 
     * @return the Java class represented by this descriptor.
     */
    @Override()
    public java.lang.Class getJavaClass(
    ) {
        return org.chocolate_milk.model.QBXMLSubscriptionMsgsRsItem.class;
    }

    /**
     * Method getNameSpacePrefix.
     * 
     * @return the namespace prefix to use when marshaling as XML.
     */
    @Override()
    public java.lang.String getNameSpacePrefix(
    ) {
        return _nsPrefix;
    }

    /**
     * Method getNameSpaceURI.
     * 
     * @return the namespace URI used when marshaling and
     * unmarshaling as XML.
     */
    @Override()
    public java.lang.String getNameSpaceURI(
    ) {
        return _nsURI;
    }

    /**
     * Method getValidator.
     * 
     * @return a specific validator for the class described by this
     * ClassDescriptor.
     */
    @Override()
    public org.exolab.castor.xml.TypeValidator getValidator(
    ) {
        return this;
    }

    /**
     * Method getXMLName.
     * 
     * @return the XML Name for the Class being described.
     */
    @Override()
    public java.lang.String getXMLName(
    ) {
        return _xmlName;
    }

    /**
     * Method isElementDefinition.
     * 
     * @return true if XML schema definition of this Class is that
     * of a global
     * element or element with anonymous type definition.
     */
    public boolean isElementDefinition(
    ) {
        return _elementDefinition;
    }

}
