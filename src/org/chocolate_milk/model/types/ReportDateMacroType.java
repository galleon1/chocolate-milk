/*
 * This class was automatically generated with 
 * <a href="http://www.castor.org">Castor 1.3.1</a>, using an XML
 * Schema.
 * $Id: ReportDateMacroType.java,v 1.1.1.1 2010-05-04 22:06:02 ryan Exp $
 */

package org.chocolate_milk.model.types;

/**
 * Enumeration ReportDateMacroType.
 * 
 * @version $Revision: 1.1.1.1 $ $Date: 2010-05-04 22:06:02 $
 */
public enum ReportDateMacroType {


      //------------------/
     //- Enum Constants -/
    //------------------/

    /**
     * Constant ALL
     */
    ALL("All"),
    /**
     * Constant TODAY
     */
    TODAY("Today"),
    /**
     * Constant THISWEEK
     */
    THISWEEK("ThisWeek"),
    /**
     * Constant THISWEEKTODATE
     */
    THISWEEKTODATE("ThisWeekToDate"),
    /**
     * Constant THISMONTH
     */
    THISMONTH("ThisMonth"),
    /**
     * Constant THISMONTHTODATE
     */
    THISMONTHTODATE("ThisMonthToDate"),
    /**
     * Constant THISQUARTER
     */
    THISQUARTER("ThisQuarter"),
    /**
     * Constant THISQUARTERTODATE
     */
    THISQUARTERTODATE("ThisQuarterToDate"),
    /**
     * Constant THISYEAR
     */
    THISYEAR("ThisYear"),
    /**
     * Constant THISYEARTODATE
     */
    THISYEARTODATE("ThisYearToDate"),
    /**
     * Constant YESTERDAY
     */
    YESTERDAY("Yesterday"),
    /**
     * Constant LASTWEEK
     */
    LASTWEEK("LastWeek"),
    /**
     * Constant LASTWEEKTODATE
     */
    LASTWEEKTODATE("LastWeekToDate"),
    /**
     * Constant LASTMONTH
     */
    LASTMONTH("LastMonth"),
    /**
     * Constant LASTMONTHTODATE
     */
    LASTMONTHTODATE("LastMonthToDate"),
    /**
     * Constant LASTQUARTER
     */
    LASTQUARTER("LastQuarter"),
    /**
     * Constant LASTQUARTERTODATE
     */
    LASTQUARTERTODATE("LastQuarterToDate"),
    /**
     * Constant LASTYEAR
     */
    LASTYEAR("LastYear"),
    /**
     * Constant LASTYEARTODATE
     */
    LASTYEARTODATE("LastYearToDate"),
    /**
     * Constant NEXTWEEK
     */
    NEXTWEEK("NextWeek"),
    /**
     * Constant NEXTFOURWEEKS
     */
    NEXTFOURWEEKS("NextFourWeeks"),
    /**
     * Constant NEXTMONTH
     */
    NEXTMONTH("NextMonth"),
    /**
     * Constant NEXTQUARTER
     */
    NEXTQUARTER("NextQuarter"),
    /**
     * Constant NEXTYEAR
     */
    NEXTYEAR("NextYear");

      //--------------------------/
     //- Class/Member Variables -/
    //--------------------------/

    /**
     * Field value.
     */
    private final java.lang.String value;

    /**
     * Field enumConstants.
     */
    private static final java.util.Map<java.lang.String, ReportDateMacroType> enumConstants = new java.util.HashMap<java.lang.String, ReportDateMacroType>();


    static {
        for (ReportDateMacroType c: ReportDateMacroType.values()) {
            ReportDateMacroType.enumConstants.put(c.value, c);
        }

    };


      //----------------/
     //- Constructors -/
    //----------------/

    private ReportDateMacroType(final java.lang.String value) {
        this.value = value;
    }


      //-----------/
     //- Methods -/
    //-----------/

    /**
     * Method fromValue.
     * 
     * @param value
     * @return the constant for this value
     */
    public static org.chocolate_milk.model.types.ReportDateMacroType fromValue(
            final java.lang.String value) {
        ReportDateMacroType c = ReportDateMacroType.enumConstants.get(value);
        if (c != null) {
            return c;
        }
        throw new IllegalArgumentException(value);
    }

    /**
     * 
     * 
     * @param value
     */
    public void setValue(
            final java.lang.String value) {
    }

    /**
     * Method toString.
     * 
     * @return the value of this constant
     */
    public java.lang.String toString(
    ) {
        return this.value;
    }

    /**
     * Method value.
     * 
     * @return the value of this constant
     */
    public java.lang.String value(
    ) {
        return this.value;
    }

}
