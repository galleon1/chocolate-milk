/*
 * This class was automatically generated with 
 * <a href="http://www.castor.org">Castor 1.3.1</a>, using an XML
 * Schema.
 * $Id: DateMacroType.java,v 1.1.1.1 2010-05-04 22:06:02 ryan Exp $
 */

package org.chocolate_milk.model.types;

/**
 * Enumeration DateMacroType.
 * 
 * @version $Revision: 1.1.1.1 $ $Date: 2010-05-04 22:06:02 $
 */
public enum DateMacroType {


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
     * Constant THISCALENDARQUARTER
     */
    THISCALENDARQUARTER("ThisCalendarQuarter"),
    /**
     * Constant THISCALENDARQUARTERTODATE
     */
    THISCALENDARQUARTERTODATE("ThisCalendarQuarterToDate"),
    /**
     * Constant THISFISCALQUARTER
     */
    THISFISCALQUARTER("ThisFiscalQuarter"),
    /**
     * Constant THISFISCALQUARTERTODATE
     */
    THISFISCALQUARTERTODATE("ThisFiscalQuarterToDate"),
    /**
     * Constant THISCALENDARYEAR
     */
    THISCALENDARYEAR("ThisCalendarYear"),
    /**
     * Constant THISCALENDARYEARTODATE
     */
    THISCALENDARYEARTODATE("ThisCalendarYearToDate"),
    /**
     * Constant THISFISCALYEAR
     */
    THISFISCALYEAR("ThisFiscalYear"),
    /**
     * Constant THISFISCALYEARTODATE
     */
    THISFISCALYEARTODATE("ThisFiscalYearToDate"),
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
     * Constant LASTCALENDARQUARTER
     */
    LASTCALENDARQUARTER("LastCalendarQuarter"),
    /**
     * Constant LASTCALENDARQUARTERTODATE
     */
    LASTCALENDARQUARTERTODATE("LastCalendarQuarterToDate"),
    /**
     * Constant LASTFISCALQUARTER
     */
    LASTFISCALQUARTER("LastFiscalQuarter"),
    /**
     * Constant LASTFISCALQUARTERTODATE
     */
    LASTFISCALQUARTERTODATE("LastFiscalQuarterToDate"),
    /**
     * Constant LASTCALENDARYEAR
     */
    LASTCALENDARYEAR("LastCalendarYear"),
    /**
     * Constant LASTCALENDARYEARTODATE
     */
    LASTCALENDARYEARTODATE("LastCalendarYearToDate"),
    /**
     * Constant LASTFISCALYEAR
     */
    LASTFISCALYEAR("LastFiscalYear"),
    /**
     * Constant LASTFISCALYEARTODATE
     */
    LASTFISCALYEARTODATE("LastFiscalYearToDate"),
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
     * Constant NEXTCALENDARQUARTER
     */
    NEXTCALENDARQUARTER("NextCalendarQuarter"),
    /**
     * Constant NEXTCALENDARYEAR
     */
    NEXTCALENDARYEAR("NextCalendarYear"),
    /**
     * Constant NEXTFISCALQUARTER
     */
    NEXTFISCALQUARTER("NextFiscalQuarter"),
    /**
     * Constant NEXTFISCALYEAR
     */
    NEXTFISCALYEAR("NextFiscalYear");

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
    private static final java.util.Map<java.lang.String, DateMacroType> enumConstants = new java.util.HashMap<java.lang.String, DateMacroType>();


    static {
        for (DateMacroType c: DateMacroType.values()) {
            DateMacroType.enumConstants.put(c.value, c);
        }

    };


      //----------------/
     //- Constructors -/
    //----------------/

    private DateMacroType(final java.lang.String value) {
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
    public static org.chocolate_milk.model.types.DateMacroType fromValue(
            final java.lang.String value) {
        DateMacroType c = DateMacroType.enumConstants.get(value);
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
