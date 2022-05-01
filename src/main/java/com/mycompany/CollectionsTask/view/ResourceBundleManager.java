package com.mycompany.CollectionsTask.view;

import java.util.Locale;
import java.util.ResourceBundle;


public class ResourceBundleManager {

    public static ResourceBundle getResourceBundle() {
        Locale.setDefault(new Locale("UK"));
        return ResourceBundle.getBundle("localization");
    }
}
