package com.qqmaster.drools.util;

import org.kie.api.KieServices;
import org.kie.api.runtime.KieContainer;
import org.kie.api.runtime.KieSession;

public class DroolsUtils {
	public static KieSession getSession(String ruleKey) {
		KieServices ks = KieServices.Factory.get();
		KieContainer kc = ks.getKieClasspathContainer();
		return kc.newKieSession(ruleKey);
	}
}
