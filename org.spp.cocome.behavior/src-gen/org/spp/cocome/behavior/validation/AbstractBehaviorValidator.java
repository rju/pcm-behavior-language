/*
 * generated by Xtext
 */
package org.spp.cocome.behavior.validation;

import java.util.ArrayList;
import java.util.List;
import org.eclipse.emf.ecore.EPackage;

public class AbstractBehaviorValidator extends org.eclipse.xtext.validation.AbstractDeclarativeValidator {

	@Override
	protected List<EPackage> getEPackages() {
	    List<EPackage> result = new ArrayList<EPackage>();
	    result.add(org.spp.cocome.behavior.behavior.BehaviorPackage.eINSTANCE);
	    result.add(EPackage.Registry.INSTANCE.getEPackage("http://behavior.cocome.spp.org/behavior/mapping"));
		return result;
	}
}
