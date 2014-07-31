package fr.beneth.wfsparser;

import java.io.InputStream;


public class EntryPoint {

    public static void main(String[] args) {
        InputStream gcIs = EntryPoint.class.getResourceAsStream("/GetCapabilities.xml");
        InputStream dftIs = EntryPoint.class.getResourceAsStream("/DescribeFeatureType.xml");
        InputStream gfIs = EntryPoint.class.getResourceAsStream("/GetFeatures.xml");


        if (gcIs == null) {
            System.out.println("Unable to open GetCapabilities.xml");
            return;
        }
        System.out.println("GetCapabilities opened");

    }

}
