package org.chocolate_milk.controller.jacob;



public interface FileModeE {


        public enum FILE_MODE { SINGLE_USER(0), MULTI_USER(1), DO_NOT_CARE(2);

            FILE_MODE(int val){
                value=val;
            }
            private int value;
            public int getValue(){
                return value;
            }

        };
	public static final int openSingleUser = 0;
	public static final int openMultiUser = 1;
	public static final int openDoNotCare = 2;

      

}
