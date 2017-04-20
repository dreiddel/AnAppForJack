package edu.uta.softeng.anappforjack;

import android.graphics.drawable.Icon;

/**
 * Project: An App for Jack
 * Client:  Dr. Bahram Khalili, UTA CSE 3310 Software Engineering
 *
 * Author: Michael O'Leary
 * Description: Class defining an interest.
 *
 * To Do: Add a list of subscribing clients.
 **/
public class Interest {
    private String interestName;
    private String interestDescription;
    private Icon interestIcon;

    Interest(String name, String description, Icon icon) {
        setInterestName(name);
        setInterestDescription(description);
        setInterestIcon(icon);
    }

    public String getInterestName() {
        return this.interestName;
    }
    public String getInterestDescription() {
        return this.interestDescription;
    }
    public Icon getInterestIcon() {
        return this.interestIcon;
    }

    private void setInterestName(String name) {
        this.interestName = name;
    }
    private void setInterestDescription(String description) {
        this.interestDescription = description;
    }
    private void setInterestIcon(Icon icon) {
        this.interestIcon = icon;
    }
}
