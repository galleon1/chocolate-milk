/*
 * This class was automatically generated with 
 * <a href="http://www.castor.org">Castor 1.3.1</a>, using an XML
 * Schema.
 * $Id: Submenu.java,v 1.1.1.1 2010-05-04 22:05:59 ryan Exp $
 */

package org.chocolate_milk.model;

/**
 * Class Submenu.
 * 
 * @version $Revision: 1.1.1.1 $ $Date: 2010-05-04 22:05:59 $
 */
@SuppressWarnings("serial")
public class Submenu implements java.io.Serializable {


      //--------------------------/
     //- Class/Member Variables -/
    //--------------------------/

    /**
     * Field _displayCondition.
     */
    private org.chocolate_milk.model.DisplayCondition _displayCondition;

    /**
     * Field _menuItemList.
     */
    private java.util.List<org.chocolate_milk.model.MenuItem> _menuItemList;


      //----------------/
     //- Constructors -/
    //----------------/

    public Submenu() {
        super();
        this._menuItemList = new java.util.ArrayList<org.chocolate_milk.model.MenuItem>();
    }


      //-----------/
     //- Methods -/
    //-----------/

    /**
     * 
     * 
     * @param vMenuItem
     * @throws java.lang.IndexOutOfBoundsException if the index
     * given is outside the bounds of the collection
     */
    public void addMenuItem(
            final org.chocolate_milk.model.MenuItem vMenuItem)
    throws java.lang.IndexOutOfBoundsException {
        this._menuItemList.add(vMenuItem);
    }

    /**
     * 
     * 
     * @param index
     * @param vMenuItem
     * @throws java.lang.IndexOutOfBoundsException if the index
     * given is outside the bounds of the collection
     */
    public void addMenuItem(
            final int index,
            final org.chocolate_milk.model.MenuItem vMenuItem)
    throws java.lang.IndexOutOfBoundsException {
        this._menuItemList.add(index, vMenuItem);
    }

    /**
     * Method enumerateMenuItem.
     * 
     * @return an Enumeration over all possible elements of this
     * collection
     */
    public java.util.Enumeration<? extends org.chocolate_milk.model.MenuItem> enumerateMenuItem(
    ) {
        return java.util.Collections.enumeration(this._menuItemList);
    }

    /**
     * Returns the value of field 'displayCondition'.
     * 
     * @return the value of field 'DisplayCondition'.
     */
    public org.chocolate_milk.model.DisplayCondition getDisplayCondition(
    ) {
        return this._displayCondition;
    }

    /**
     * Method getMenuItem.
     * 
     * @param index
     * @throws java.lang.IndexOutOfBoundsException if the index
     * given is outside the bounds of the collection
     * @return the value of the org.chocolate_milk.model.MenuItem
     * at the given index
     */
    public org.chocolate_milk.model.MenuItem getMenuItem(
            final int index)
    throws java.lang.IndexOutOfBoundsException {
        // check bounds for index
        if (index < 0 || index >= this._menuItemList.size()) {
            throw new IndexOutOfBoundsException("getMenuItem: Index value '" + index + "' not in range [0.." + (this._menuItemList.size() - 1) + "]");
        }

        return (org.chocolate_milk.model.MenuItem) _menuItemList.get(index);
    }

    /**
     * Method getMenuItem.Returns the contents of the collection in
     * an Array.  <p>Note:  Just in case the collection contents
     * are changing in another thread, we pass a 0-length Array of
     * the correct type into the API call.  This way we <i>know</i>
     * that the Array returned is of exactly the correct length.
     * 
     * @return this collection as an Array
     */
    public org.chocolate_milk.model.MenuItem[] getMenuItem(
    ) {
        org.chocolate_milk.model.MenuItem[] array = new org.chocolate_milk.model.MenuItem[0];
        return (org.chocolate_milk.model.MenuItem[]) this._menuItemList.toArray(array);
    }

    /**
     * Method getMenuItemCount.
     * 
     * @return the size of this collection
     */
    public int getMenuItemCount(
    ) {
        return this._menuItemList.size();
    }

    /**
     * Method isValid.
     * 
     * @return true if this object is valid according to the schema
     */
    public boolean isValid(
    ) {
        try {
            validate();
        } catch (org.exolab.castor.xml.ValidationException vex) {
            return false;
        }
        return true;
    }

    /**
     * Method iterateMenuItem.
     * 
     * @return an Iterator over all possible elements in this
     * collection
     */
    public java.util.Iterator<? extends org.chocolate_milk.model.MenuItem> iterateMenuItem(
    ) {
        return this._menuItemList.iterator();
    }

    /**
     * 
     * 
     * @param out
     * @throws org.exolab.castor.xml.MarshalException if object is
     * null or if any SAXException is thrown during marshaling
     * @throws org.exolab.castor.xml.ValidationException if this
     * object is an invalid instance according to the schema
     */
    public void marshal(
            final java.io.Writer out)
    throws org.exolab.castor.xml.MarshalException, org.exolab.castor.xml.ValidationException {
        org.exolab.castor.xml.Marshaller.marshal(this, out);
    }

    /**
     * 
     * 
     * @param handler
     * @throws java.io.IOException if an IOException occurs during
     * marshaling
     * @throws org.exolab.castor.xml.ValidationException if this
     * object is an invalid instance according to the schema
     * @throws org.exolab.castor.xml.MarshalException if object is
     * null or if any SAXException is thrown during marshaling
     */
    public void marshal(
            final org.xml.sax.ContentHandler handler)
    throws java.io.IOException, org.exolab.castor.xml.MarshalException, org.exolab.castor.xml.ValidationException {
        org.exolab.castor.xml.Marshaller.marshal(this, handler);
    }

    /**
     */
    public void removeAllMenuItem(
    ) {
        this._menuItemList.clear();
    }

    /**
     * Method removeMenuItem.
     * 
     * @param vMenuItem
     * @return true if the object was removed from the collection.
     */
    public boolean removeMenuItem(
            final org.chocolate_milk.model.MenuItem vMenuItem) {
        boolean removed = _menuItemList.remove(vMenuItem);
        return removed;
    }

    /**
     * Method removeMenuItemAt.
     * 
     * @param index
     * @return the element removed from the collection
     */
    public org.chocolate_milk.model.MenuItem removeMenuItemAt(
            final int index) {
        java.lang.Object obj = this._menuItemList.remove(index);
        return (org.chocolate_milk.model.MenuItem) obj;
    }

    /**
     * Sets the value of field 'displayCondition'.
     * 
     * @param displayCondition the value of field 'displayCondition'
     */
    public void setDisplayCondition(
            final org.chocolate_milk.model.DisplayCondition displayCondition) {
        this._displayCondition = displayCondition;
    }

    /**
     * 
     * 
     * @param index
     * @param vMenuItem
     * @throws java.lang.IndexOutOfBoundsException if the index
     * given is outside the bounds of the collection
     */
    public void setMenuItem(
            final int index,
            final org.chocolate_milk.model.MenuItem vMenuItem)
    throws java.lang.IndexOutOfBoundsException {
        // check bounds for index
        if (index < 0 || index >= this._menuItemList.size()) {
            throw new IndexOutOfBoundsException("setMenuItem: Index value '" + index + "' not in range [0.." + (this._menuItemList.size() - 1) + "]");
        }

        this._menuItemList.set(index, vMenuItem);
    }

    /**
     * 
     * 
     * @param vMenuItemArray
     */
    public void setMenuItem(
            final org.chocolate_milk.model.MenuItem[] vMenuItemArray) {
        //-- copy array
        _menuItemList.clear();

        for (int i = 0; i < vMenuItemArray.length; i++) {
                this._menuItemList.add(vMenuItemArray[i]);
        }
    }

    /**
     * Method unmarshal.
     * 
     * @param reader
     * @throws org.exolab.castor.xml.MarshalException if object is
     * null or if any SAXException is thrown during marshaling
     * @throws org.exolab.castor.xml.ValidationException if this
     * object is an invalid instance according to the schema
     * @return the unmarshaled org.chocolate_milk.model.Submenu
     */
    public static org.chocolate_milk.model.Submenu unmarshal(
            final java.io.Reader reader)
    throws org.exolab.castor.xml.MarshalException, org.exolab.castor.xml.ValidationException {
        return (org.chocolate_milk.model.Submenu) org.exolab.castor.xml.Unmarshaller.unmarshal(org.chocolate_milk.model.Submenu.class, reader);
    }

    /**
     * 
     * 
     * @throws org.exolab.castor.xml.ValidationException if this
     * object is an invalid instance according to the schema
     */
    public void validate(
    )
    throws org.exolab.castor.xml.ValidationException {
        org.exolab.castor.xml.Validator validator = new org.exolab.castor.xml.Validator();
        validator.validate(this);
    }

}
