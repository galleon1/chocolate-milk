/*
 * This class was automatically generated with 
 * <a href="http://www.castor.org">Castor 1.3.1</a>, using an XML
 * Schema.
 * $Id: JobReportTypeType.java,v 1.1.1.1 2010-05-04 22:06:02 ryan Exp $
 */

package org.chocolate_milk.model.types;

/**
 * Enumeration JobReportTypeType.
 * 
 * @version $Revision: 1.1.1.1 $ $Date: 2010-05-04 22:06:02 $
 */
public enum JobReportTypeType {


      //------------------/
     //- Enum Constants -/
    //------------------/

    /**
     * Constant VALUE_0
     */
    VALUE_0("ItemEstimatesVsActuals"),
    /**
     * Constant VALUE_1
     */
    VALUE_1("ItemProfitability"),
    /**
     * Constant VALUE_2
     */
    VALUE_2("JobEstimatesVsActualsDetail"),
    /**
     * Constant VALUE_3
     */
    VALUE_3("JobEstimatesVsActualsSummary"),
    /**
     * Constant VALUE_4
     */
    VALUE_4("JobProfitabilityDetail"),
    /**
     * Constant VALUE_5
     */
    VALUE_5("JobProfitabilitySummary"),
    /**
     * Constant VALUE_6
     */
    VALUE_6("");

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
    private static final java.util.Map<java.lang.String, JobReportTypeType> enumConstants = new java.util.HashMap<java.lang.String, JobReportTypeType>();


    static {
        for (JobReportTypeType c: JobReportTypeType.values()) {
            JobReportTypeType.enumConstants.put(c.value, c);
        }

    };


      //----------------/
     //- Constructors -/
    //----------------/

    private JobReportTypeType(final java.lang.String value) {
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
    public static org.chocolate_milk.model.types.JobReportTypeType fromValue(
            final java.lang.String value) {
        JobReportTypeType c = JobReportTypeType.enumConstants.get(value);
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
