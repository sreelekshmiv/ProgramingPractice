
/*
 * Write an Immutable class.
 * 
 * 
 * State of immutable object can not be modified after construction, any modification should result in new immutable object.
 * All fields of Immutable class should be final.
 * Object must be properly constructed i.e. object reference must not leak during construction process.
 * Object should be final in order to restrict sub-class for altering immutability of parent class.

 */
package com.innovapath.programingpractice;

public final class ImmutableContacts {
	
	 private final String name;
	    private final String mobile;

	    public ImmutableContacts(String name, String mobile) {
	        this.name = name;
	        this.mobile = mobile;
	    }
	  
	    public String getName(){
	        return name;
	    }
	  
	    public String getMobile(){
	        return mobile;
	    }

}
