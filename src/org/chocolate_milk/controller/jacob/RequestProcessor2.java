package org.chocolate_milk.controller.jacob;

import com.jacob.com.*;

public class RequestProcessor2 extends IRequestProcessor3 {

    public static final String componentName = "clsid:{45F5708E-3B43-4FA8-BE7E-A5F1849214CB}";
        
	public RequestProcessor2() {
		super(componentName);
	}

	public RequestProcessor2(Dispatch d) {
		super(d);
	}
}
