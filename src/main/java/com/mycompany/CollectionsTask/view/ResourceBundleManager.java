package com.mycompany.CollectionsTask.view;

import java.util.Locale;
import java.util.ResourceBundle;


public class ResourceBundleManager {
    public ResourceBundle resourceBundle = getResourceBundle();
    
    public static ResourceBundle getResourceBundle() {
        return ResourceBundle.getBundle("localization");
    }
    
    public void setLanguageRu() {
        resourceBundle = ResourceBundle.getBundle("localization", new Locale("ru", "RU"));
    }
    
    public void setLanguageEn() {
        resourceBundle = ResourceBundle.getBundle("localization", new Locale("en", "GB"));
    }
}
