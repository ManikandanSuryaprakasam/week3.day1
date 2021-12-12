package org.system;

public class MyComputer {

	public static void main(String[] args) {
//		Assignment1:
//		===========
//		     Package   :org.system
//		     Class        :Computer
//		     Methods   :computerModel()
//
//		     Class        :Desktop
//		     Methods   :desktopSize()
//
//		Description:
//		create above 2 class and call all your class methods into the Desktop using single inheritance.
		
		Desktop homeDesktop= new Desktop();
		homeDesktop.computerModel("Lenova X12");
		homeDesktop.desktopsize("14*14");

	}

}
