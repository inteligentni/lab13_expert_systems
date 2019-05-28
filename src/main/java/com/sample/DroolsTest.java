package com.sample;

import org.kie.api.KieServices;
import org.kie.api.runtime.KieContainer;
import org.kie.api.runtime.KieSession;

/**
 * This is a sample class to launch a rule.
 */
public class DroolsTest {

    public static final void main(String[] args) {
        try {
            // load up the knowledge base
	        KieServices ks = KieServices.Factory.get();
    	    KieContainer kContainer = ks.getKieClasspathContainer();
        	KieSession kSession = kContainer.newKieSession("ksession-rules");

            //Kreiranje novog objekta i unos pocetnih cinjenica
        	Penzioner p = new Penzioner();
        	p.setPol("Muski");
        	p.setGodineStarosti(69);
        	p.setGodineStaza(40);
        	p.setImaInvaliditet(false);
        	
        	//Unos objekta sa pocetnim cinjenicama u ES.
            kSession.insert(p);
        	
        	//Pokretanje ES
            kSession.fireAllRules();
            
            //Ispis resenja na konzoli
            System.out.println(p);
        } catch (Throwable t) {
            t.printStackTrace();
        }
    }

}
