/*
 * This class was automatically generated with 
 * <a href="http://www.castor.org">Castor 1.3.1</a>, using an XML
 * Schema.
 * $Id: ARRefundCreditCardFilterDescriptor.java,v 1.1.1.1 2010-05-04 22:06:01 ryan Exp $
 */

package org.chocolate_milk.model.descriptors;

  //---------------------------------/
 //- Imported classes and packages -/
//---------------------------------/

import org.chocolate_milk.model.ARRefundCreditCardFilter;

/**
 * Class ARRefundCreditCardFilterDescriptor.
 * 
 * @version $Revision: 1.1.1.1 $ $Date: 2010-05-04 22:06:01 $
 */
public class ARRefundCreditCardFilterDescriptor extends org.exolab.castor.xml.util.XMLClassDescriptorImpl {


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

    public ARRefundCreditCardFilterDescriptor() {
        super();
        _xmlName = "ARRefundCreditCardFilter";
        _elementDefinition = false;

        //-- set grouping compositor
        setCompositorAsSequence();
        org.exolab.castor.xml.util.XMLFieldDescriptorImpl  desc           = null;
        org.exolab.castor.mapping.FieldHandler             handler        = null;
        org.exolab.castor.xml.FieldValidator               fieldValidator = null;
        //-- initialize attribute descriptors

        //-- initialize element descriptors

        //-- _maxReturned
        desc = new org.exolab.castor.xml.util.XMLFieldDescriptorImpl(java.lang.Long.TYPE, "_maxReturned", "MaxReturned", org.exolab.castor.xml.NodeType.Element);
        handler = new org.exolab.castor.xml.XMLFieldHandler() {
            @Override
            public java.lang.Object getValue( java.lang.Object object ) 
                throws IllegalStateException
            {
                ARRefundCreditCardFilter target = (ARRefundCreditCardFilter) object;
                if (!target.hasMaxReturned()) { return null; }
                return new java.lang.Long(target.getMaxReturned());
            }
            @Override
            public void setValue( java.lang.Object object, java.lang.Object value) 
                throws IllegalStateException, IllegalArgumentException
            {
                try {
                    ARRefundCreditCardFilter target = (ARRefundCreditCardFilter) object;
                    // if null, use delete method for optional primitives 
                    if (value == null) {
                        target.deleteMaxReturned();
                        return;
                    }
                    target.setMaxReturned( ((java.lang.Long) value).longValue());
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
        desc.setSchemaType("integer");
        desc.setHandler(handler);
        desc.setMultivalued(false);
        addFieldDescriptor(desc);
        addSequenceElement(desc);

        //-- validation code for: _maxReturned
        fieldValidator = new org.exolab.castor.xml.FieldValidator();
        { //-- local scope
            org.exolab.castor.xml.validators.LongValidator typeValidator;
            typeValidator = new org.exolab.castor.xml.validators.LongValidator();
            fieldValidator.setValidator(typeValidator);
            typeValidator.setMinInclusive(1L);
        }
        desc.setValidator(fieldValidator);
        //-- _ARRefundCreditCardFilterChoice
        desc = new org.exolab.castor.xml.util.XMLFieldDescriptorImpl(org.chocolate_milk.model.ARRefundCreditCardFilterChoice.class, "_ARRefundCreditCardFilterChoice", "-error-if-this-is-used-", org.exolab.castor.xml.NodeType.Element);
        handler = new org.exolab.castor.xml.XMLFieldHandler() {
            @Override
            public java.lang.Object getValue( java.lang.Object object ) 
                throws IllegalStateException
            {
                ARRefundCreditCardFilter target = (ARRefundCreditCardFilter) object;
                return target.getARRefundCreditCardFilterChoice();
            }
            @Override
            public void setValue( java.lang.Object object, java.lang.Object value) 
                throws IllegalStateException, IllegalArgumentException
            {
                try {
                    ARRefundCreditCardFilter target = (ARRefundCreditCardFilter) object;
                    target.setARRefundCreditCardFilterChoice( (org.chocolate_milk.model.ARRefundCreditCardFilterChoice) value);
                } catch (java.lang.Exception ex) {
                    throw new IllegalStateException(ex.toString());
                }
            }
            @Override
            @SuppressWarnings("unused")
            public java.lang.Object newInstance(java.lang.Object parent) {
                return new org.chocolate_milk.model.ARRefundCreditCardFilterChoice();
            }
        };
        desc.setSchemaType("org.chocolate_milk.model.ARRefundCreditCardFilterChoice");
        desc.setHandler(handler);
        desc.setContainer(true);
        desc.setClassDescriptor(new org.chocolate_milk.model.descriptors.ARRefundCreditCardFilterChoiceDescriptor());
        desc.setMultivalued(false);
        addFieldDescriptor(desc);
        addSequenceElement(desc);

        //-- validation code for: _ARRefundCreditCardFilterChoice
        fieldValidator = new org.exolab.castor.xml.FieldValidator();
        { //-- local scope
        }
        desc.setValidator(fieldValidator);
        //-- _entityFilter
        desc = new org.exolab.castor.xml.util.XMLFieldDescriptorImpl(org.chocolate_milk.model.EntityFilter.class, "_entityFilter", "EntityFilter", org.exolab.castor.xml.NodeType.Element);
        handler = new org.exolab.castor.xml.XMLFieldHandler() {
            @Override
            public java.lang.Object getValue( java.lang.Object object ) 
                throws IllegalStateException
            {
                ARRefundCreditCardFilter target = (ARRefundCreditCardFilter) object;
                return target.getEntityFilter();
            }
            @Override
            public void setValue( java.lang.Object object, java.lang.Object value) 
                throws IllegalStateException, IllegalArgumentException
            {
                try {
                    ARRefundCreditCardFilter target = (ARRefundCreditCardFilter) object;
                    target.setEntityFilter( (org.chocolate_milk.model.EntityFilter) value);
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
        desc.setSchemaType("org.chocolate_milk.model.EntityFilter");
        desc.setHandler(handler);
        desc.setMultivalued(false);
        addFieldDescriptor(desc);
        addSequenceElement(desc);

        //-- validation code for: _entityFilter
        fieldValidator = new org.exolab.castor.xml.FieldValidator();
        { //-- local scope
        }
        desc.setValidator(fieldValidator);
        //-- _accountFilter
        desc = new org.exolab.castor.xml.util.XMLFieldDescriptorImpl(org.chocolate_milk.model.AccountFilter.class, "_accountFilter", "AccountFilter", org.exolab.castor.xml.NodeType.Element);
        handler = new org.exolab.castor.xml.XMLFieldHandler() {
            @Override
            public java.lang.Object getValue( java.lang.Object object ) 
                throws IllegalStateException
            {
                ARRefundCreditCardFilter target = (ARRefundCreditCardFilter) object;
                return target.getAccountFilter();
            }
            @Override
            public void setValue( java.lang.Object object, java.lang.Object value) 
                throws IllegalStateException, IllegalArgumentException
            {
                try {
                    ARRefundCreditCardFilter target = (ARRefundCreditCardFilter) object;
                    target.setAccountFilter( (org.chocolate_milk.model.AccountFilter) value);
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
        desc.setSchemaType("org.chocolate_milk.model.AccountFilter");
        desc.setHandler(handler);
        desc.setMultivalued(false);
        addFieldDescriptor(desc);
        addSequenceElement(desc);

        //-- validation code for: _accountFilter
        fieldValidator = new org.exolab.castor.xml.FieldValidator();
        { //-- local scope
        }
        desc.setValidator(fieldValidator);
        //-- _ARRefundCreditCardFilterChoice2
        desc = new org.exolab.castor.xml.util.XMLFieldDescriptorImpl(org.chocolate_milk.model.ARRefundCreditCardFilterChoice2.class, "_ARRefundCreditCardFilterChoice2", "-error-if-this-is-used-", org.exolab.castor.xml.NodeType.Element);
        handler = new org.exolab.castor.xml.XMLFieldHandler() {
            @Override
            public java.lang.Object getValue( java.lang.Object object ) 
                throws IllegalStateException
            {
                ARRefundCreditCardFilter target = (ARRefundCreditCardFilter) object;
                return target.getARRefundCreditCardFilterChoice2();
            }
            @Override
            public void setValue( java.lang.Object object, java.lang.Object value) 
                throws IllegalStateException, IllegalArgumentException
            {
                try {
                    ARRefundCreditCardFilter target = (ARRefundCreditCardFilter) object;
                    target.setARRefundCreditCardFilterChoice2( (org.chocolate_milk.model.ARRefundCreditCardFilterChoice2) value);
                } catch (java.lang.Exception ex) {
                    throw new IllegalStateException(ex.toString());
                }
            }
            @Override
            @SuppressWarnings("unused")
            public java.lang.Object newInstance(java.lang.Object parent) {
                return new org.chocolate_milk.model.ARRefundCreditCardFilterChoice2();
            }
        };
        desc.setSchemaType("org.chocolate_milk.model.ARRefundCreditCardFilterChoice2");
        desc.setHandler(handler);
        desc.setContainer(true);
        desc.setClassDescriptor(new org.chocolate_milk.model.descriptors.ARRefundCreditCardFilterChoice2Descriptor());
        desc.setMultivalued(false);
        addFieldDescriptor(desc);
        addSequenceElement(desc);

        //-- validation code for: _ARRefundCreditCardFilterChoice2
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
        return org.chocolate_milk.model.ARRefundCreditCardFilter.class;
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
